package com.leqi.action.management;

import com.leqi.bean.RiderEntity;
import com.leqi.biz.management.ManageRiderBiz;
import com.leqi.biz.management.ManageRiderBizImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by lenovo on 2016/12/29.
 */
public class ManageAllRidersAction extends ActionSupport {
    private List<RiderEntity> allRiders;
    private int count;

    public String manageGetAllRiders(){
        ManageRiderBiz manageRiderBiz=new ManageRiderBizImpl();
        allRiders=manageRiderBiz.getAllRiders();
        count=allRiders.size();
        return SUCCESS;
    }


    public void setAllRiders(List<RiderEntity> allRiders) {
        this.allRiders = allRiders;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

