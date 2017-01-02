package com.leqi.dao.others;

/**
 * Created by lenovo on 2017/1/2.
 */
public interface LogDao {
    public int login(String userName,String pass);
    public int getUserID(String userName,String pass);
}
