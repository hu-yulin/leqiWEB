package com.leqi.action.club;

import com.leqi.bean.ClubEntity;
import com.leqi.biz.clubBiz.ClubControlBizImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2016/12/30.
 */
public class GetClubInfoAction extends ActionSupport {
    private int clubID;//club不应该传过来而是应该从会话中获取

    private ClubEntity club;//jsp use
    public String enterClubHomePage(){
        clubID=5;
        ClubControlBizImpl clubControlBiz=new ClubControlBizImpl();
        club=clubControlBiz.getClubInfo(clubID);
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
