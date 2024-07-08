package com.example.springboot_312.dao;


import com.example.springboot_312.model.User;

import java.util.List;


public interface UserDao {
    List<User> getAllUsers();

    User showUser(Long id);

    void saveUser(User user);

    void updateUser(User updateUser);

    void deleteUser(Long id);
}
