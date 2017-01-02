package com.leqi.action;

import com.opensymphony.xwork2.ActionContext;

import java.util.Map;

/**
 * Created by lenovo on 2017/1/2.
 */
public class GetUserID {
    /**
     * 从会话中取出userID
     * @return
     */
    public int getUserID(){
        ActionContext actionContext=ActionContext.getContext();
        Map<?,?> map=actionContext.getSession();
        Integer id=(Integer) map.get("userID");
        if(id==null){
            return -1;
        }else{
            return id;
        }
    }
}
