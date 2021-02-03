package com.codegym.service.impl;

import com.codegym.entity.Question;
import com.codegym.repository.QuestionRepository;
import com.codegym.service.QuestionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {
    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Page<Question> findAll(Pageable pageable) {
        return questionRepository.findAll(pageable);
    }

    @Override
    public Question findById(Integer id) {
        return questionRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void deleteById(Integer id) {
        questionRepository.deleteById(id);
    }

//    @Override
//    public Page<Question> searchByName(String name, Pageable pageable) {
//        return questionRepository.findQuestionByQuestionTitleContaining(name, pageable);
//    }
}
