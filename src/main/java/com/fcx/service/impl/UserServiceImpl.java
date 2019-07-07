package com.fcx.service.impl;

import com.fcx.dao.IUserDao;
import com.fcx.pojo.User;
import com.fcx.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: fancaixing
 * @Date: 2019/7/6 23:51
 * @Version 1.0
 */

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;
    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
}
