/*
 * 文 件 名: ReuqestFilter.java
 * 版 权: Copyright YYYY-YYYY, All rights reserved
 * 描 述: <描述>
 * 创 建 人: 赵炎 yanzhao_jn@163.com.cn
 * 创建时间: 2016-3-23
 */
package com.zy.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.xwork.StringUtils;

/**
 * <一句话功能简述>
 * 
 * @author 赵炎
 * @version [V1.00, 2016-3-23]
 * @see [相关类/方法]
 * @since V1.00
 */
public class LoginFilter extends HttpServlet implements Filter
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -5107224712724025218L;
    
    /**
     * 重写方法
     * 
     * @see javax.servlet.Filter#destroy()
     */
    public void destroy()
    {
        // TODO Auto-generated method stub
        
    }
    
    /**
     * 重写方法
     * 
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse,
     *      javax.servlet.FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException
    {
     // 设置请求响应编码方式
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse resp = (HttpServletResponse)response;
        HttpSession session = req.getSession();
        String userId = (String)session.getAttribute("userId");
        String url = req.getRequestURI();
        String contextPath = req.getContextPath();
        if("".equals(url))
        {
            url += "/";
        }
        if(StringUtils.isBlank(userId))
        {
            resp.sendRedirect(contextPath + "/tologin.action");
            return;
        }
        chain.doFilter(request, response);
        
    }
    
    /**
     * 重写方法
     * 
     * @param filterConfig
     * @throws ServletException
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    public void init(FilterConfig filterConfig)
        throws ServletException
    {
        // TODO Auto-generated method stub
        
    }
    
    /**
     * 重写方法
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        
    }
    /**
     * 重写方法
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException
    {
        // TODO Auto-generated method stub
        super.doPost(req, resp);
    }
}
