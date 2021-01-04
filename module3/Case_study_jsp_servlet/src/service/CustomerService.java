package service;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    List<Customer> findByName(String name);
    Customer findById(String id);
    void insert(Customer customer) throws SQLException;
    void delete(String id) throws SQLException;
    void update(Customer customer) throws SQLException;
}
