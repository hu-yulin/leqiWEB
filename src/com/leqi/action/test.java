package com.leqi.action;

import com.opensymphony.xwork2.ActionSupport;


/**
 * @author huyulin test
 * Created by lenovo on 2016/12/17.
 */
public class test extends ActionSupport {
    private String data;
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String execute(){
        return SUCCESS ;
    }

    public String addGood(){
        return SUCCESS ;
    }

    public String allGood(){
        return SUCCESS ;
    }
    public String goodDetail(){
        return SUCCESS ;
    }

    public String manage(){
        return SUCCESS;
    }
}
