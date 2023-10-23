package com.narainox.stackoverflow.backend.controller;

import com.narainox.stackoverflow.backend.model.Question;
import com.narainox.stackoverflow.backend.model.Tag;
import com.narainox.stackoverflow.backend.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @PostMapping("/create")
    public ResponseEntity<Question> createQuestionHandler(@RequestBody Question question)
    {
         Question question1=questionService.createQuestion(question);
         return new ResponseEntity<>(question1, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Question> deleteQuestionHandler(@PathVariable("id") Integer id)
    {
        Question question1=questionService.deleteQuestion(id);
        return new ResponseEntity<>(question1, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Question> updateQuestionHandler(@PathVariable("id") Integer id, @RequestBody Question question)
    {
        Question question1=questionService.updateQuestion(id,question);
        return new ResponseEntity<>(question1,HttpStatus.ACCEPTED);
    }

    @PostMapping("/add-tag/{id}")
    public ResponseEntity<Question> addTagHandler(@PathVariable("id") Integer id, @RequestBody Tag tag)
    {
        Question question=questionService.addTag(id,tag);
        return new ResponseEntity<>(question,HttpStatus.CREATED);
    }
}
