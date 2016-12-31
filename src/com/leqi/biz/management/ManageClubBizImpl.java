package com.leqi.biz.management;

import com.leqi.bean.ClubEntity;
import com.leqi.bean.RiderEntity;
import com.leqi.bean.UserEntity;
import com.leqi.dao.management.ManageClubDao;
import com.leqi.dao.management.ManageClubDaoImpl;
import com.leqi.dao.management.ManageDao;
import com.leqi.dao.management.ManageDaoImpl;

import java.util.List;

/**
 * Created by lenovo on 2016/12/29.
 */
public class ManageClubBizImpl implements ManageClubBiz{
    private ManageClubDao manageClubDao=new ManageClubDaoImpl();
    private ManageDao manageDao=new ManageDaoImpl();

    @Override
    public int getClubsCount() {
        return manageClubDao.getClubsCount();
    }

    @Override
    public List<ClubEntity> getALLClubs() {
        return manageClubDao.getALLClubs();
    }

    @Override
    public ClubEntity getClubInfo(int clubID) {
        return manageClubDao.getClubInfo(clubID);
    }

    @Override
    public void addClub(ClubEntity clubEntity,UserEntity user) {
        int clubID=manageDao.addUser(user);
        clubEntity.setClubId(clubID);
        manageClubDao.addClub(clubEntity);
    }

    @Override
    public void removeClub(int clubID) {

    }

    @Override
    public int  getActivitiesCount(int clubID) {
        return manageClubDao.getActivityCount(clubID);
    }


}
