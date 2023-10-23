package com.narainox.stackoverflow.backend.controller;

import com.narainox.stackoverflow.backend.model.Tag;
import com.narainox.stackoverflow.backend.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tag")
public class TagController {
    @Autowired
    TagService tagService;

    @PostMapping("/add")
    public ResponseEntity<Tag> addTagController(@RequestBody Tag tag)
    {
        Tag tag1=tagService.addTags(tag);
        return new ResponseEntity<>(tag1, HttpStatus.CREATED);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Tag> removeTagController(@PathVariable("id") Integer id)
    {
        Tag tag=tagService.removeTag(id);
        return new ResponseEntity<>(tag,HttpStatus.OK);
    }


}
