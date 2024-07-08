package com.example.springboot_312.service;


import com.example.springboot_312.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User showUser(Long id);

    void saveUser(User user);

    void updateUser(User updateUser);

    void deleteUser(Long id);
}
