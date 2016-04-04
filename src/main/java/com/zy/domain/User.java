/*
 * 文 件 名:  User.java
 * 版    权:  Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 创 建 人:  赵炎 yanzhao_jn@163.com.cn
 * 创建时间:  2016-3-22
 */
package com.zy.domain;

import java.io.Serializable;

/**
 * <一句话功能简述>
 *  
 * @author  赵炎
 * @version  [V1.00, 2016-3-22]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class User implements Serializable
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 885756689440478701L;

    private Integer id;
    
    private Integer userId;
    
    private boolean remindFlag;

    /**
     * 获取 id
     * @return 返回 id
     */
    public Integer getId()
    {
        return id;
    }

    /**
     * 设置 id
     * @param 对id进行赋值
     */
    public void setId(Integer id)
    {
        this.id = id;
    }

    /**
     * 获取 userId
     * @return 返回 userId
     */
    public Integer getUserId()
    {
        return userId;
    }

    /**
     * 设置 userId
     * @param 对userId进行赋值
     */
    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    /**
     * 获取 remindFlag
     * @return 返回 remindFlag
     */
    public boolean isRemindFlag()
    {
        return remindFlag;
    }

    /**
     * 设置 remindFlag
     * @param 对remindFlag进行赋值
     */
    public void setRemindFlag(boolean remindFlag)
    {
        this.remindFlag = remindFlag;
    }

    /**
     * 重写方法
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "User [id=" + id + ", userId=" + userId + ", remindFlag=" + remindFlag + "]";
    }

    /** 
     * <默认构造函数>
     */
    public User(Integer id, Integer userId, boolean remindFlag)
    {
        super();
        this.id = id;
        this.userId = userId;
        this.remindFlag = remindFlag;
    }
    
}
