package com.narainox.stackoverflow.backend.repository;

import com.narainox.stackoverflow.backend.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Integer> {
}
