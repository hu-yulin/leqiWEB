package com.leqi.dao.club;

import com.leqi.bean.ClubActivityEntity;
import com.leqi.bean.ClubEntity;
import com.leqi.bean.RiderEntity;
import com.leqi.bean.UserPicEntity;

import java.util.List;
import java.util.Set;

/**
 * Created by lenovo on 2016/12/30.
 */
public interface ClubControlDao {
    public void changeClubInfo(int clubID,ClubEntity club);
    public List<ClubActivityEntity> getClubActivities(int clubID);
    public void addActivity(ClubActivityEntity activity);
    public void removeActivity(int activityID);
    public void addClubPic(int clubID, Set<UserPicEntity> pics);
}
