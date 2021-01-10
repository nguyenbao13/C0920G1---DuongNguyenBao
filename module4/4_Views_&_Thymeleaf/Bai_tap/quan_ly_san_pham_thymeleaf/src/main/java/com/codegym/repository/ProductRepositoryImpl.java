package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private static Map<Integer, Product> productList = new HashMap<>();
    static {
        productList.put(1, new Product(1, "apple", 9, "imgApple", 9));
        productList.put(2, new Product(2, "banana", 9, "imgBanana", 9));
        productList.put(3, new Product(3, "cucumber", 9, "imgCucumber", 9));
        productList.put(4, new Product(4, "dewberry", 9, "imgDewberry", 9));
        productList.put(5, new Product(5, "elderberry", 9, "imgElderberry", 9));
    }
    @Override
    public List findAll() {
        return new ArrayList(productList.values());
    }

    @Override
    public void save(Product product) {
        productList.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        productList.put(id, product);
    }

    @Override
    public void delete(int id) {
        productList.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }
}
