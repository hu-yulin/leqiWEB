package com.leqi.action;

import com.leqi.biz.others.ChangePassBizImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2017/1/5.
 */
public class ChangePassAction extends ActionSupport {
    private String pass;

    public String changePass(){
        int userID=new GetUserID().getUserID();
        if(userID==-1){
            return "login";
        }
        new ChangePassBizImpl().changePass(userID,pass);
        return SUCCESS;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


}
