package com.codegym.service.impl;

import com.codegym.entity.Blog;
import com.codegym.repository.BlogRepository;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServiceImp implements BlogService {
    private BlogRepository blogRepository;

    public BlogServiceImp(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }


    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void delete(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public List<Blog> findAllBlogAndSort() {
        return blogRepository.findAllBlogAndSort();
    }
//Hien thi blog theo ten danh muc
    @Override
    public List<Blog> findAllBlogOfCategory(Integer categoryID) {
        //Khai bao list blog duoc hien thi
        List<Blog> blogListResult = new ArrayList<>();
        //Khai bao list co tat ca blog trong database
        List<Blog> blogListAll = blogRepository.findAll();
        for (Blog blog : blogListAll) {
            if (blog.getCategory().getId() == categoryID) {
                blogListResult.add(blog);
            }
        }
        return blogListResult;
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> findByTitleContaining(Pageable pageable, String title) {
        return blogRepository.findByTitleContaining(pageable, title);
    }
}
