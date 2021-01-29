package com.codegym.service.impl;

import com.codegym.entity.ProductType;
import com.codegym.repository.ProductTypeRepository;
import com.codegym.service.ProductTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductTypeServiceImpl implements ProductTypeService {
    private ProductTypeRepository productTypeRepository;

    public ProductTypeServiceImpl(ProductTypeRepository productTypeRepository) {
        this.productTypeRepository = productTypeRepository;
    }

    @Override
    public List<ProductType> findAll() {
        return productTypeRepository.findAll();
    }
}
