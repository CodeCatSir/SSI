/*
 * 文 件 名:  BaseAction.java
 * 版    权:  Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 创 建 人:  赵炎 yanzhao_jn@163.com.cn
 * 创建时间:  2016-3-22
 */
package com.zy.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action的基类
 *  
 * @author  赵炎
 * @version  [V1.00, 2016-3-22]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class BaseAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,ServletContextAware,SessionAware
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -843531522614991649L;
    
    /**
     * http request
     */
    private HttpServletRequest request;
    
    /**
     * http response
     */
    private HttpServletResponse response;
    
    private ServletContext application;
    
    private Map<String,Object> session;

    /**
     * 获取 request
     * @return 返回 request
     */
    public HttpServletRequest getRequest()
    {
        return request;
    }

    /**
     * 设置 request
     * @param 对request进行赋值
     */
    public void setRequest(HttpServletRequest request)
    {
        this.request = request;
    }

    /**
     * 获取 response
     * @return 返回 response
     */
    public HttpServletResponse getResponse()
    {
        return response;
    }

    /**
     * 设置 response
     * @param 对response进行赋值
     */
    public void setResponse(HttpServletResponse response)
    {
        this.response = response;
    }

    /**
     * 获取 application
     * @return 返回 application
     */
    public ServletContext getApplication()
    {
        return application;
    }

    /**
     * 设置 application
     * @param 对application进行赋值
     */
    public void setApplication(ServletContext application)
    {
        this.application = application;
    }

    /**
     * 获取 session
     * @return 返回 session
     */
    public Map<String, Object> getSession()
    {
        return session;
    }

    /**
     * 重写方法
     * @param arg0
     * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
     */
    public void setSession(Map<String, Object> session)
    {
        this.session = session;
    }

    /**
     * 重写方法
     * @param arg0
     * @see org.apache.struts2.util.ServletContextAware#setServletContext(javax.servlet.ServletContext)
     */
    public void setServletContext(ServletContext context)
    {
        this.application = context;
    }

    /**
     * 重写方法
     * @param arg0
     * @see org.apache.struts2.interceptor.ServletResponseAware#setServletResponse(javax.servlet.http.HttpServletResponse)
     */
    public void setServletResponse(HttpServletResponse response)
    {
        this.response = response;
    }

    /**
     * 重写方法
     * @param arg0
     * @see org.apache.struts2.interceptor.ServletRequestAware#setServletRequest(javax.servlet.http.HttpServletRequest)
     */
    public void setServletRequest(HttpServletRequest request)
    {
        this.request = request;
    }


    
}
