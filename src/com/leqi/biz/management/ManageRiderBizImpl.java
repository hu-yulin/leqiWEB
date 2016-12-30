package com.leqi.biz.management;

import com.leqi.bean.RiderEntity;
import com.leqi.bean.UserEntity;
import com.leqi.dao.management.ManageDao;
import com.leqi.dao.management.ManageDaoImpl;
import com.leqi.dao.management.ManageRiderDao;
import com.leqi.dao.management.ManageRiderDaoImpl;

import java.util.List;

/**
 * Created by lenovo on 2016/12/29.
 */
public class ManageRiderBizImpl implements ManageRiderBiz {
    private ManageRiderDao manageRiderDao=new ManageRiderDaoImpl();
    private ManageDao manageDao=new ManageDaoImpl();
    @Override
    public int getRidersCount() {
        return manageRiderDao.getRidersCount();
    }

    @Override
    public List<RiderEntity> getAllRiders() {
        return manageRiderDao.getAllRiders();
    }

    @Override
    public RiderEntity getRiderInfo(int riderID) {
        return manageRiderDao.getRiderInfo(riderID);
    }

    @Override
    public void removeRider(int riderID) {

    }

    @Override
    public void addRider(RiderEntity riderEntity,UserEntity userEntity) {
        int riderID=manageDao.addUser(userEntity);
        riderEntity.setRiderId(riderID);
        manageRiderDao.addRider(riderEntity);
    }
}
