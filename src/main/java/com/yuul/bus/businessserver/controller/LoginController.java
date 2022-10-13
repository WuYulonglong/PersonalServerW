package com.yuul.bus.businessserver.controller;

import com.yuul.bus.businessserver.model.entity.User;
import com.yuul.bus.businessserver.service.UserService;
import com.yuul.bus.businessserver.utils.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Object login(@RequestBody User user){
        if(user!=null){
            List<User> userList = userService.getUser(user);
            if(userList!=null&&userList.size()==1){
                return ResponseBuilder.buildSuccess();
            }else{
                return ResponseBuilder.buildFail();
            }
        }
        return ResponseBuilder.buildFail();
    }
}
