package com.codegym.repository;

import com.codegym.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
//    Page<Question> findQuestionByQuestionTitleContaining(String name, Pageable pageable);
}
