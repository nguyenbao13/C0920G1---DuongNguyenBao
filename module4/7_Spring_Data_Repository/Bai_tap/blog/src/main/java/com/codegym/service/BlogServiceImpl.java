package com.codegym.service;

import com.codegym.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService {

    @Override
    public List<Blog> findAll() {
        return null;
    }

    @Override
    public Blog findById(int id) {
        return null;
    }

    @Override
    public void save(Blog blog) {

    }

    @Override
    public void update(Blog blog) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Blog> findAllBlogAndSort() {
        return null;
    }

    @Override
    public List<Blog> findAllBlogOfCategory(Integer categoryID) {
        return null;
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Page<Blog> findByAuthorContaining(Pageable pageable, String author) {
        return null;
    }
}
