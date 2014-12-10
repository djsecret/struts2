package com.neu.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by ubuntu on 14-10-6.
 */
public class Action2 extends ActionSupport
{
    private String username;
    private String password;
    private String strAdd;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getStrAdd()
    {
        return strAdd;
    }

    public void setStrAdd(String strAdd)
    {
        this.strAdd = strAdd;
    }

    @Override
    public String execute() throws Exception
    {
        return SUCCESS;
    }
}
