package com.example.springboot_312.service;

import com.example.springboot_312.dao.UserDao;
import com.example.springboot_312.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User showUser(Long id) {
        return userDao.showUser(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User updateUser) {
        userDao.updateUser(updateUser);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
}
