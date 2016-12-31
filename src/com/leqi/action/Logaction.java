package com.leqi.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2016/12/31.
 */
public class Logaction extends ActionSupport {
    private String userName;
    private String pass;

    public String login(){
        return SUCCESS;
    }
}
