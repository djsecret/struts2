package com.neu.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.Date;

/**
 * Created by ubuntu on 14-10-5.
 */
public class RegisterAction extends ActionSupport
{
    private String username;
    private String password;
    private String repassword;
    private Date birthday;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        System.out.println("set username");
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

    public String getRepassword()
    {
        return repassword;
    }

    public void setRepassword(String repassword)
    {
        this.repassword = repassword;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        System.out.println("set birthday");
        this.birthday = birthday;
    }

    @Override
    public String execute() throws Exception
    {
        ServletActionContext.getRequest().getSession();
        System.out.println("execute...");
        return SUCCESS;
    }

//    public String myExecute() throws Exception
//    {
//        System.out.println("myExecute...");
//        return SUCCESS;
//    }
//
//    public void validateMyExecute()
//    {
//        System.out.println("validateMyExecute");
//    }
//
//    @Override
//    public void validate()
//    {
//        System.out.println("validate");
//        if(null == username || username.length() < 4 || username.length() > 6)
//        {
//            addActionError("invalid username!");
//            addFieldError("username","invalid username fielderror..");
//        }
//
//    }
}
