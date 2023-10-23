package com.narainox.stackoverflow.backend.service.impl;

import com.narainox.stackoverflow.backend.exception.QuestionException;
import com.narainox.stackoverflow.backend.exception.TagException;
import com.narainox.stackoverflow.backend.model.Tag;
import com.narainox.stackoverflow.backend.repository.TagRepository;
import com.narainox.stackoverflow.backend.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    TagRepository tagRepository;

    @Override
    public Tag removeTag(Integer id) {
       Optional<Tag> tag=tagRepository.findById(id);
       if (tag.isPresent())
       {
           Tag t = tag.get();
           tagRepository.delete(t);
           return t;
       }
       else {
           throw new TagException("Tag is Not Present With id:"+id);
       }
    }

    @Override
    public Tag addTags(Tag tag) {
        Optional<Tag> optionalTag=tagRepository.findById(tag.getId());
        if (!optionalTag.isPresent())
        {
            return tagRepository.save(tag);
        }
        else {
            throw new TagException("Tag is Already present id");
        }
    }
}
