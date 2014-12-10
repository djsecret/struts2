package com.neu.action;

import com.neu.bean.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by ubuntu on 14-10-5.
 */
public class UserAction extends ActionSupport
{
    private User user;

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    @Override
    public String execute() throws Exception
    {
        System.out.println("UserAction");
        System.out.println("username:" + user.getUsername());
        System.out.println("password:" + user.getPassword());
        return SUCCESS;
    }
}
