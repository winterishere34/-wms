package com.madeofwu.will.utils;

import java.util.List;
import java.util.Map;

   
/**
 * @ClassesName：CheckNull 
 * @Description:
 * @Author：李东
 * @CreateTime：2014年10月28日 下午7:03:52
 * @version  1.0
 */  
public abstract class CheckNullUtil
{
    /**
     * 
     * 检查字符串是否为空
     * 包括空字符串,去空格
     * @param str
     * @return true:空 false：非空
     */
    public static boolean isNullTrim(String str)
    {
        return (null == str || "".equals(str.trim()));
    }

    /**
     * 
     * 检查字符串是否为空
     * 包括空字符串
     * @param str
     * @return true:空 false：非空
     */
    public static boolean isNull(String str)
    {
        return (null == str || "".equals(str) || "null".equals(str));
    }

    /**
     * 
     * 检查list是否为空
     * 包括list的size为0
     * @param List
     * @return true:空 false：非空
     */
    public static boolean isNull(List<?> lst)
    {
        return null == lst || lst.isEmpty();
    }

    /**
     * 
     * 检查map是否为空
     * 包括map的size为0
     * @param map
     * @return
     */
    public static boolean isNull(Map<?, ?> map)
    {
        return null == map || 0 == map.size();
    }

    /**
     * 
     * 检查map是否为空
     * 包括map的size为0
     * @param map
     * @return
     */
    public static boolean isNull(Object obj)
    {
        return null == obj;
    }

    /**
     * 
     * @Title: isNullOrZero
     * @Description: 判断Integer为空或者0
     * @param @param integer
     * @param @return
     * @return boolean
     * @throws
     */
    public static boolean isNullOrZero(Integer integer)
    {
        return null == integer || integer.intValue() == 0;
    }

    /**
     * 
     * @Title: isNullOrZero
     * @Description: 判断Integer为空或者0
     * @param @param integer
     * @param @return
     * @return boolean
     * @throws
     */
    public static boolean isNullOrZero(Long integer)
    {
        return null == integer || integer.intValue() == 0;
    }

    /**
     * 
     * @Title: isNullOrZero
     * @Description: 判断Integer为空或者0
     * @param @param integer
     * @param @return
     * @return boolean
     * @throws
     */
    public static boolean isNullOrZero(Double integer)
    {
        return null == integer || integer.intValue() == 0;
    }

    /**
     * @Title: isNullOrZero
     * @Description: 判断float为空或者为0
     * @param f
     * @return 
     * 
     */
    public static boolean isNullOrZero(Float f)
    {
        return null == f || f.intValue() == 0;
    }
}
