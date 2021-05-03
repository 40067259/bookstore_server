package com.example.A3.UsedBookLibrary.service;

import com.example.A3.UsedBookLibrary.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public String createUser(String username, String password)
    {
        return userMapper.createUser(username, password);
    }


}