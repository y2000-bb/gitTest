package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.dao.impl.UserDaoImpl;
import com.demo.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    public void getUsers() {
        userDao.getUsers();
    }
}
