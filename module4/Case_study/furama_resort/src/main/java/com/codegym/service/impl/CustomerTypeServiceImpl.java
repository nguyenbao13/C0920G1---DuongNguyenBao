package com.codegym.service.impl;

import com.codegym.entity.customer.CustomerType;
import com.codegym.repository.CustomerTypeRepository;
import com.codegym.service.CustomerTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    private CustomerTypeRepository customerTypeRepository;

    public CustomerTypeServiceImpl(CustomerTypeRepository customerTypeRepository) {
        this.customerTypeRepository = customerTypeRepository;
    }

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
