package com.narainox.stackoverflow.backend.service;

import com.narainox.stackoverflow.backend.model.Tag;

public interface TagService {
    Tag removeTag(Integer id);

    Tag addTags(Tag tag);
}
