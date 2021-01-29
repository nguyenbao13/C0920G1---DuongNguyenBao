package com.codegym.service;

import com.codegym.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    void save(Customer customer);
    Customer findById(Integer id);
    void delete(Integer id);
    Page<Customer> searchByName(String name,Pageable pageable);
}
