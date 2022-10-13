package com.yuul.bus.businessserver.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yuul.bus.businessserver.dao.UserDao;
import com.yuul.bus.businessserver.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public List<User> getUser(User user){
        if(user==null){
            return null;
        }
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name",user.getUserName())
                .eq("password",user.getPassword());
        return userDao.selectList(wrapper);
    }
}
