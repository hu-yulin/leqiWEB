package com.leqi.biz.others;

import com.leqi.dao.others.LogDao;
import com.leqi.dao.others.LogDaoImpl;

/**
 * Created by lenovo on 2017/1/2.
 */
public class LogBizImpl implements LogBiz {
    LogDao logDao=new LogDaoImpl();

    @Override
    public int login(String userName, String pass) {
        return logDao.login(userName, pass);
    }

    @Override
    public int getUserID(String userName, String pass) {
        return logDao.getUserID(userName, pass);
    }
}
