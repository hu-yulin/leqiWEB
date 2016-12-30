package com.leqi.biz.club;

import com.leqi.bean.ClubActivityEntity;
import com.leqi.bean.ClubEntity;
import com.leqi.dao.club.ClubControlDao;
import com.leqi.dao.club.ClubControlDaoImpl;
import com.leqi.dao.management.ManageClubDao;
import com.leqi.dao.management.ManageClubDaoImpl;

import java.util.List;

/**
 * Created by lenovo on 2016/12/30.
 */
public class ClubControlBizImpl implements ClubControlBiz {
    private ManageClubDao manageClubDao=new ManageClubDaoImpl();
    private ClubControlDao clubControlDao=new ClubControlDaoImpl();
    @Override
    public ClubEntity getClubInfo(int clubID) {
        return manageClubDao.getClubInfo(clubID);
    }

    @Override
    public void changeClubInfo(int clubID, ClubEntity club) {
        clubControlDao.changeClubInfo(clubID,club);
    }

    @Override
    public List<ClubActivityEntity> getClubActivities(int clubID, int CurrentPage) {
        return clubControlDao.getClubActivities(clubID,CurrentPage);
    }

    @Override
    public void addActivity(ClubActivityEntity activity) {
        clubControlDao.addActivity(activity);
    }

    @Override
    public void removeActivity(int activityID) {

    }

    @Override
    public int getAvtivitiesCount(int clubID) {
        return manageClubDao.getActivityCount(clubID);
    }
}
