package service;

import model.Customer;
import repository.CustomerRepository;
import repository.CustomerRepositoryImpl;

import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> findByName(String name) {
        return customerRepository.findByName(name);
    }

    @Override
    public Customer findById(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public void insert(Customer customer) throws SQLException {
        customerRepository.insert(customer);
    }

    @Override
    public void update(Customer customer) throws SQLException {
        customerRepository.update(customer);
    }

    @Override
    public void delete(String id) throws SQLException {
        customerRepository.delete(id);
    }
}
