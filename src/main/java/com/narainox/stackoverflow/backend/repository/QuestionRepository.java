package com.narainox.stackoverflow.backend.repository;

import com.narainox.stackoverflow.backend.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
}
