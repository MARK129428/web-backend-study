package com.hhk.hanlinxuefu.service;

import com.hhk.hanlinxuefu.dao.UserDao;
import com.hhk.hanlinxuefu.entry.User;
import com.hhk.hanlinxuefu.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceImpl {

    @Autowired
    private UserDao userDao;


    @Override
    public User login(Integer id) {
        return userDao.login(id);
    }
}
