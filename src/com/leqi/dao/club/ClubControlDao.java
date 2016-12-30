package com.leqi.dao.club;

import com.leqi.bean.ClubActivityEntity;
import com.leqi.bean.ClubEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/12/30.
 */
public interface ClubControlDao {
    public void changeClubInfo(int clubID,ClubEntity club);
    public List<ClubActivityEntity> getClubActivities(int clubID, int CurrentPage);
    public void addActivity(ClubActivityEntity activity);
    public void removeActivity(int activityID);
}