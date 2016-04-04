/*
 * 文 件 名: UserServiceImpl.java
 * 版 权: Copyright YYYY-YYYY, All rights reserved
 * 描 述: <描述>
 * 创 建 人: 赵炎 yanzhao_jn@163.com.cn
 * 创建时间: 2016-3-23
 */
package com.zy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.dao.UserMapper;
import com.zy.domain.User;
import com.zy.service.UserService;

/**
 * <一句话功能简述>
 * 
 * @author 赵炎
 * @version [V1.00, 2016-3-23]
 * @see [相关类/方法]
 * @since V1.00
 */
@Service("userService")
public class UserServiceImpl implements UserService
{
    @Autowired(required=false)
     private UserMapper userMapper;
    
    /**
     * 重写方法
     * 
     * @param user
     * @see com.zy.service.UserService#createUser(com.zy.domain.User)
     */
    public void createUser(User user)
    {
        this.userMapper.insert(user);
        
    }
    
    /**
     * 重写方法
     * 
     * @return
     * @see com.zy.service.UserService#getAllUsers()
     */
    public List<User> getAllUsers()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /**
     * 重写方法
     * 
     * @param user
     * @see com.zy.service.UserService#updateUser(com.zy.domain.User)
     */
    public void updateUser(User user)
    {
        // TODO Auto-generated method stub
        
    }
    
    /**
     * 重写方法
     * 
     * @param userId
     * @return
     * @see com.zy.service.UserService#getUserByUserId(java.lang.String)
     */
    public User getUserByUserId(String userId)
    {
        return this.userMapper.getUserById(userId);
    }
    
}
