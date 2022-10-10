package com.yuul.bus.businessserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuul.bus.businessserver.model.entity.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends BaseMapper<User> {

}
