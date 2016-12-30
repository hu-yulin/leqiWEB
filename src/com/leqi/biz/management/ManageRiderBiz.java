package com.leqi.biz.management;

import com.leqi.bean.RiderEntity;
import com.leqi.bean.UserEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/12/29.
 */
public interface ManageRiderBiz {
    public int getRidersCount();
    public List<RiderEntity> getAllRiders();
    public RiderEntity getRiderInfo(int riderID);
    public void removeRider(int riderID);
    public void addRider(RiderEntity riderEntity, UserEntity userEntity);
}
