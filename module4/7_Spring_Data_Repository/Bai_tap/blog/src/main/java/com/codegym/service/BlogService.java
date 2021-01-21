package com.codegym.service;

import com.codegym.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    Blog findById(int id);

    void save (Blog blog);

    void update (Blog blog);

    void delete (int id);

    List<Blog> findAllBlogAndSort();

    List<Blog> findAllBlogOfCategory(Integer categoryID);

    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findByTitleContaining(Pageable pageable, String author);
}
