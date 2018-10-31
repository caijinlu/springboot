package com.syt.springboot.controller;

import com.syt.springboot.dao.UserMapper;
import com.syt.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 0200077
 * @create 2018-10-30 16:22
 **/
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("insert")
    public void insert(){
        User user = new User();
        user.setAge(11);
        user.setMobile("13650096499");
        user.setPassword("111111");
        user.setUserName("蔡金陆");
        userMapper.insertUser(user);
    }
}
