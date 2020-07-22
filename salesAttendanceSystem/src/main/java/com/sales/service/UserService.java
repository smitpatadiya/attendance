package com.sales.service;

import com.sales.model.User;

import java.util.List;




public interface UserService {

    User save(User user);

    List<User> findAll();

    void delete(long id);
}
