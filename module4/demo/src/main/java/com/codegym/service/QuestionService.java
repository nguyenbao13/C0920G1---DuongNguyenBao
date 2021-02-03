package com.codegym.service;

import com.codegym.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QuestionService {
    Page<Question> findAll(Pageable pageable);
    Question findById (Integer id);
    void save (Question question);
    void deleteById (Integer id);
//    Page<Question> searchByName(String name,Pageable pageable);
}
