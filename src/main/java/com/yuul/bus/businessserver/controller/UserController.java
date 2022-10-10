package com.yuul.bus.businessserver.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yuul.bus.businessserver.dao.UserDao;
import com.yuul.bus.businessserver.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Wrapper;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/getMsg")
    public Object getUser(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        List<User> users = userDao.selectList(wrapper);
        return users;
    }
}
