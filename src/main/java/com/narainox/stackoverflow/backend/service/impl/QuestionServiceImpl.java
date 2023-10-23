package com.narainox.stackoverflow.backend.service.impl;

import com.narainox.stackoverflow.backend.exception.QuestionException;
import com.narainox.stackoverflow.backend.exception.TagException;
import com.narainox.stackoverflow.backend.model.Question;
import com.narainox.stackoverflow.backend.model.Tag;
import com.narainox.stackoverflow.backend.repository.QuestionRepository;
import com.narainox.stackoverflow.backend.repository.TagRepository;
import com.narainox.stackoverflow.backend.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    TagRepository tagRepository;

    @Override
    public Question createQuestion(Question question) {
        Optional<Question> question1=questionRepository.findById(question.getId());
        if (!question1.isPresent())
        {
            return questionRepository.save(question);
        }
        else {
            throw new QuestionException("Question is Already Present.");
        }
    }

    public Question deleteQuestion(Integer id)
    {
        Optional<Question> question=questionRepository.findById(id);
        if (question.isPresent())
        {
            Question q=question.get();
            questionRepository.delete(q);
            return q;
        }
        else {
            throw  new QuestionException("Question is Not Present with Id "+id);
        }
    }

    @Override
    public Question updateQuestion(Integer id, Question question) {
        Optional<Question> question1=questionRepository.findById(id);
        if (question1.isPresent())
        {
            Question q=question1.get();
            q.setTitle(question.getTitle());
            q.setDescription(question.getDescription());
            questionRepository.save(q);
            return q;
        }
        else {
            throw  new QuestionException("Question is Not Present with Id "+id);
        }
    }

    @Override
    public Question addTag(Integer id, Tag tag) {
        Optional<Question> question=questionRepository.findById(id);
        if (question.isPresent())
        {
            Optional<Tag> tag1=tagRepository.findById(tag.getId());
            if (tag1.isPresent())
            {
                Tag t = tag1.get();
                List<Tag> taglist = question.get().getTagList();
                taglist.add(t);
                return questionRepository.save(question.get());
            }
            else {
                throw new TagException("Invalid tag..Please Create Tag first..");
            }
        }
        else {
            throw new QuestionException("Question Not Found with id: "+id);
        }
    }
}
