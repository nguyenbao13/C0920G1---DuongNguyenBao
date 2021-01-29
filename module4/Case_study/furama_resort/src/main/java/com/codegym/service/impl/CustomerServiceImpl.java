package com.codegym.service.impl;

import com.codegym.entity.customer.Customer;
import com.codegym.repository.CustomerRepository;
import com.codegym.service.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        Customer temp = customerRepository.save(customer);
        int num = temp.getCustomerId();
        String string = temp.getCustomerId().toString();
        if(num < 10) {
            temp.setCustomerId2("KH-000"+string);
        } else if(num < 100) {
            temp.setCustomerId2("KH-00"+string);
        } else if(num < 1000) {
            temp.setCustomerId2("KH-0"+string);
        } else {
            temp.setCustomerId2("KH-"+string);
        }
        customerRepository.save(temp);
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> searchByName(String name,Pageable pageable) {
        return customerRepository.findCustomerByCustomerNameContaining(name, pageable);
    }

}
