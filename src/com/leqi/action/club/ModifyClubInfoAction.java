package com.leqi.action.club;

import com.leqi.bean.ClubEntity;
import com.leqi.biz.clubBiz.ClubControlBizImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2016/12/30.
 */
public class ModifyClubInfoAction extends ActionSupport {
    private int clubID;
    private ClubEntity club;

    public String modifyClubInfo(){
        ClubControlBizImpl clubControlBiz=new ClubControlBizImpl();
        clubControlBiz.changeClubInfo(clubID,club);
        return SUCCESS;
    }

    public int getClubID() {
        return clubID;
    }

    public void setClubID(int clubID) {
        this.clubID = clubID;
    }

    public ClubEntity getClub() {
        return club;
    }

    public void setClub(ClubEntity club) {
        this.club = club;
    }
}
