package repository;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
    Customer findById(String id);
    void insert(Customer customer) throws SQLException;
    void delete(String id) throws SQLException;
    void update(Customer customer) throws SQLException;
    List<Customer> findByName(String name);
}
