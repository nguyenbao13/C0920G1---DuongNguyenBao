package com.codegym.service.impl;

import com.codegym.entity.QuestionType;
import com.codegym.repository.QuestionTypeRepository;
import com.codegym.service.QuestionTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionTypeServiceImpl implements QuestionTypeService {
    private QuestionTypeRepository questionTypeRepository;

    public QuestionTypeServiceImpl(QuestionTypeRepository questionTypeRepository) {
        this.questionTypeRepository = questionTypeRepository;
    }

    @Override
    public List<QuestionType> findAll() {
        return questionTypeRepository.findAll();
    }
}
