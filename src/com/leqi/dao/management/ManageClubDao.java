package com.leqi.dao.management;

import com.leqi.bean.ClubEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/12/29.
 */
public interface ManageClubDao {
    public int getClubsCount();
    public List<ClubEntity> getALLClubs();
    public ClubEntity getClubInfo(int clubID);
    public void addClub(ClubEntity clubEntity);
    public void removeClub(int clubID);
    public int getActivityCount(int shopID);
}
