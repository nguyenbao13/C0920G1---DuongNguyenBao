package com.codegym.service;

import com.codegym.entity.login.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
