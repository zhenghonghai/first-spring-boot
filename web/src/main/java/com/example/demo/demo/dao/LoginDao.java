package com.example.demo.demo.dao;


import modules.login.entity.Login;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface LoginDao {
    List<Login> getLogin();
}
