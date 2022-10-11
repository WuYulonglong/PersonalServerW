package com.yuul.bus.businessserver.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yuul.bus.businessserver.dao.UserDao;
import com.yuul.bus.businessserver.model.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Wrapper;
import java.util.List;

@RestController
@RequestMapping("user")
@Api(tags = "userController",description = "用户接口文档")
public class UserController {

    @Autowired
    UserDao userDao;

    @ApiOperation(value = "司机取消订单",httpMethod = "POST")
    @RequestMapping("/getMsg")
    public Object getUser(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        List<User> users = userDao.selectList(wrapper);
        return users;
    }
}
