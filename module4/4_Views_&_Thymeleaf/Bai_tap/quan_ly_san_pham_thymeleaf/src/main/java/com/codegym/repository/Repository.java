package com.codegym.repository;

import java.util.List;

public interface Repository <B> {
    List<B> findAll();
    void save(B b);
    void update(int id, B b);
    void delete(int id);
    B findById(int id);
}
