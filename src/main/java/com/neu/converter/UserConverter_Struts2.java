package com.neu.converter;

import com.neu.bean.User;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by ubuntu on 14-10-5.
 */
public class UserConverter_Struts2 extends StrutsTypeConverter
{
    @Override
    public Object convertFromString(Map context, String[] values, Class toClass)
    {
        User user = new User();

        String str = values[0];

        StringTokenizer st = new StringTokenizer(str,";");
        String username = st.nextToken();
        String password = st.nextToken();

        user.setUsername(username);
        user.setPassword(password);

        return user;
    }

    @Override
    public String convertToString(Map context, Object o)
    {
        User user = (User)o;

        String username = user.getUsername();
        String password = user.getPassword();

        String userInfo = "username:" + username + ",password:" + password + " from struts2 converter.";

        return userInfo;
    }
}
