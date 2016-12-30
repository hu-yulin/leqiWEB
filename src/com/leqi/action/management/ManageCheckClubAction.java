package com.leqi.action.management;

import com.leqi.bean.ClubEntity;
import com.leqi.biz.management.ManageClubBiz;
import com.leqi.biz.management.ManageClubBizImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by lenovo on 2016/12/29.
 */
public class ManageCheckClubAction extends ActionSupport {
    private int clubID;

    private int clubsCount;
    private List<ClubEntity> allClubs;
    private ClubEntity club;
    private int activityCount;

    private ManageClubBiz manageClubBiz=new ManageClubBizImpl();

    public String checkAllClubs(){
        allClubs=manageClubBiz.getALLClubs();
        clubsCount=allClubs.size();
        return SUCCESS;
    }

    public String getClubInfo(){
        activityCount=manageClubBiz.getActivitiesCount(clubID);
        club=manageClubBiz.getClubInfo(clubID);
        return SUCCESS;
    }

    public int getActivityCount() {
        return activityCount;
    }

    public void setActivityCount(int activityCount) {
        this.activityCount = activityCount;
    }

    public int getClubID() {
        return clubID;
    }

    public void setClubID(int clubID) {
        this.clubID = clubID;
    }

    public int getClubsCount() {
        return clubsCount;
    }

    public void setClubsCount(int clubsCount) {
        this.clubsCount = clubsCount;
    }

    public List<ClubEntity> getAllClubs() {
        return allClubs;
    }

    public void setAllClubs(List<ClubEntity> allClubs) {
        this.allClubs = allClubs;
    }

    public ClubEntity getClub() {
        return club;
    }

    public void setClub(ClubEntity club) {
        this.club = club;
    }
}
