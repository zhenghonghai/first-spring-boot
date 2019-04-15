package com.example.demo.demo.service.impl;


import com.example.demo.demo.dao.LoginDao;
import com.example.demo.demo.service.LoginService;
import modules.login.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginDao loginDao;

    @Override
    public List<Login> getLogin(){
        System.out.println("我来了----service");
        return loginDao.getLogin();
    }

}
