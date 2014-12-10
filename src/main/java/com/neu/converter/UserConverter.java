package com.neu.converter;

import com.neu.bean.User;
import ognl.DefaultTypeConverter;

import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by ubuntu on 14-10-5.
 */
public class UserConverter extends DefaultTypeConverter
{
    /**
     *
     * @param context
     * @param value
     * @param toType 转换到什么对象
     * @return
     */
    @Override
    public Object convertValue(Map context, Object value, Class toType)
    {
        if(User.class == toType)//从页面向后台对象转换
        {
            System.out.println("converter from page to user");

            String[] str = (String[])value;//可能一个name对应着多个值，实际上就是一个数组
            String firstValue = str[0];

            StringTokenizer st = new StringTokenizer(firstValue,";");

            String username = st.nextToken();
            String password = st.nextToken();

            User user = new User();
            user.setUsername(username);
            user.setPassword(password);

            return user;
        }
        else if(String.class == toType)//从后台往页面转
        {
            User user = (User)value;

            String username = user.getUsername();
            String password = user.getPassword();

            String userInfo = "username:" + username + ",password:" + password;

            return userInfo;
        }

        return null;
    }
}
