/*
 * 文 件 名:  DateUtil.java
 * 版    权:  Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 创 建 人:  赵炎 yanzhao_jn@163.com.cn
 * 创建时间:  2016-3-22
 */
package com.zy.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 *  
 * @author  赵炎
 * @version  [V1.00, 2016-3-22]
 * @see  [相关类/方法]
 * @since V1.00
 */
public class DateUtil
{
    /**
     * pattern "yyyyMMdd""20160322"  
     */
    private static final String YYYYMMDD = "yyyyMMdd";
    
    /**
     * pattern "yyyyMMddHHss" "201603220910"
     */
    private static final String YYYMMDDHHSS = "yyyyMMddHHss";
    
    private static final String YYYY_MM_DD = "yyyy-MM-dd";
    
    private static final String YYYY_MM_DD_HH_SS = "yyyy-MM-dd HH:ss";
    
    /** 
     * 当前日期格式化为字符串
     * @param pattern 格式化样式
     * @return
     * @see [类、类#方法、类#成员]
     */
    private static String formateCurrentDate2String(String pattern)
    {
        Date date = new Date();
        return new SimpleDateFormat(pattern).format(date);
    }
    
    public static String formateDate2yyyyMMdd()
    {
        return formateCurrentDate2String(YYYYMMDD);
    }
}
