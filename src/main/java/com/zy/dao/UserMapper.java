/*
 * 文 件 名:  UserMapper.java
 * 版    权:  Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 创 建 人:  赵炎 yanzhao_jn@163.com.cn
 * 创建时间:  2016-3-23
 */
package com.zy.dao;

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
public interface UserMapper
{
    void insert(User user);
    
    void delete(Integer id);
    
    List<User> getAllUsers();
    
    User getUserById(String userId);
    
}
