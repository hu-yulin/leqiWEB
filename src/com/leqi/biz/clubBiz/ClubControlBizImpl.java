package com.leqi.biz.clubBiz;

import com.leqi.bean.ClubActivityEntity;
import com.leqi.bean.ClubEntity;
import com.leqi.bean.UserPicEntity;
import com.leqi.dao.club.ClubControlDao;
import com.leqi.dao.club.ClubControlDaoImpl;
import com.leqi.dao.management.ManageClubDao;
import com.leqi.dao.management.ManageClubDaoImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by lenovo on 2016/12/30.
 */
public class ClubControlBizImpl implements ClubBiz {
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
    public List<ClubActivityEntity> getClubActivities(int clubID) {
        return clubControlDao.getClubActivities(clubID);
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

    @Override
    public void addClubPic(int clubID, Set<UserPicEntity> pics) {
        clubControlDao.addClubPic(clubID, pics);
    }

    public String getClubHeadPic(int clubID){
        ClubEntity clubEntity=manageClubDao.getClubInfo(clubID);
        Set<UserPicEntity> picEntities=clubEntity.getPics();
        if(picEntities.size()==0||picEntities==null){
            return "";
        }
        Iterator<UserPicEntity> iterator=picEntities.iterator();
        while(iterator.hasNext()){
            UserPicEntity pic=iterator.next();
            return pic.getPath();
        }
        return "";
    }
}
