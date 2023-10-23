package com.narainox.stackoverflow.backend.service;

import com.narainox.stackoverflow.backend.model.Question;
import com.narainox.stackoverflow.backend.model.Tag;

public interface QuestionService{
    Question createQuestion(Question question);

    Question deleteQuestion(Integer id);

    Question updateQuestion(Integer id, Question question);

    Question addTag(Integer id, Tag tag);
}
