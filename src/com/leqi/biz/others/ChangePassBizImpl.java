package com.leqi.biz.others;

import com.leqi.dao.others.ChangePassDaoImpl;

/**
 * Created by lenovo on 2017/1/5.
 */
public class ChangePassBizImpl {
    public void changePass(int userID,String pass){
        new ChangePassDaoImpl().changePass(userID, pass);
    }
}
