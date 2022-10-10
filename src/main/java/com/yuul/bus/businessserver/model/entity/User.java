package com.yuul.bus.businessserver.model.entity;

import lombok.Data;

@Data
public class User {
    private String userId;
    private String userName;
    private int age;
    private String password;
}
