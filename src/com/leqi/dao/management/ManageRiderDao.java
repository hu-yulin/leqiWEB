package com.leqi.dao.management;

import com.leqi.bean.RiderEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/12/29.
 */
public interface ManageRiderDao {
    public int getRidersCount();
    public List<RiderEntity>getAllRiders();
    public RiderEntity getRiderInfo(int riderID);
    public void removeRider(int riderID);
    public void addRider(RiderEntity riderEntity);
}
