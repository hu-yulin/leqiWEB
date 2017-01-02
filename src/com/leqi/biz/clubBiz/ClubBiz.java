package com.leqi.biz.clubBiz;

import com.leqi.bean.ClubActivityEntity;
import com.leqi.bean.ClubEntity;
import com.leqi.bean.UserPicEntity;

import java.util.List;
import java.util.Set;

/**
 * Created by lenovo on 2016/12/30.
 */
public interface ClubBiz {
    public ClubEntity getClubInfo(int clubID);
    public void changeClubInfo(int clubID,ClubEntity club);
    public List<ClubActivityEntity> getClubActivities(int clubID);
    public void addActivity(ClubActivityEntity activity);
    public void removeActivity(int activityID);
    public int getAvtivitiesCount(int clubID);
    public void addClubPic(int clubID, Set<UserPicEntity> pics);
    public String getClubHeadPic(int clubID);
}
