/*
 * 文 件 名:  UserAction.java
 * 版    权:  Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 创 建 人:  赵炎 yanzhao_jn@163.com.cn
 * 创建时间:  2016-3-27
 */
package com.zy.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zy.domain.User;
import com.zy.service.UserService;

/**
 * <一句话功能简述>
 *  
 * @author  赵炎
 * @version  [V1.00, 2016-3-27]
 * @see  [相关类/方法]
 * @since V1.00
 */
@Controller("userAction")
public class UserAction extends BaseAction
{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -6652020080748178514L;
    
    private String name;
    
    @Autowired
    private UserService userService;

    /**
     * 获取 name
     * @return 返回 name
     */
    public String getName()
    {
        return name;
    }

    /**
     * 设置 name
     * @param 对name进行赋值
     */
    public void setName(String name)
    {
        this.name = name;
        
    }
    public String login()
    {
        User user = userService.getUserByUserId(name);
        if(null != user)
        {
            return ERROR;
        }
        return SUCCESS;
    }
    
}
