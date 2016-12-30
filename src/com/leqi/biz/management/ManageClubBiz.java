package com.leqi.biz.management;

import com.leqi.bean.ClubEntity;
import com.leqi.bean.UserEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/12/28.
 */
public interface ManageClubBiz {
    public int getClubsCount();
    public List<ClubEntity> getALLClubs();
    public ClubEntity getClubInfo(int clubID);
    public void addClub(ClubEntity clubEntity, UserEntity user);
    public void removeClub(int clubID);
    public int getActivitiesCount(int clubID);
}
