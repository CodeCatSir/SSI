/*
 * 文 件 名:  USer.java
 * 版    权:  Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 创 建 人:  赵炎 yanzhao_jn@163.com.cn
 * 创建时间:  2016-3-23
 */
package com.zy.service;

import java.util.List;

import com.zy.domain.User;

/**
 * <一句话功能简述>
 *  
 * @author  赵炎
 * @version  [V1.00, 2016-3-23]
 * @see  [相关类/方法]
 * @since V1.00
 */
public interface UserService
{
    void createUser(User user);
    
    List<User> getAllUsers();
    
    void updateUser(User user);
    
    User getUserByUserId(String userId);
}
