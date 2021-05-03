package com.example.A3.UsedBookLibrary.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("insert into user(username, password)" + "values(#{username}, #{password})")
    public String createUser(String username, String password);

}