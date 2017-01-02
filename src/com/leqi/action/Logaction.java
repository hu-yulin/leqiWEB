package com.leqi.action;

import com.leqi.biz.others.LogBiz;
import com.leqi.biz.others.LogBizImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

/**
 * Created by lenovo on 2016/12/31.
 */
public class Logaction extends ActionSupport {
    private String userName;
    private String pass;

    private int result;
    private InputStream inputStream;
    public String login(){
        LogBiz logBiz=new LogBizImpl();
        result=logBiz.login(userName,pass);
        String a=result+"";
        int userId=logBiz.getUserID(userName,pass);
        if(userId!=-1){//将userID写入会话中
            ActionContext context=ActionContext.getContext();
            Map sessionMap=context.getSession();
            sessionMap.put("userID",userId);

        }
        inputStream = new ByteArrayInputStream(a.getBytes());
        return SUCCESS;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
