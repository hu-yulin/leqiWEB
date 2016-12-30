package com.leqi.action.club;

import com.leqi.bean.ClubEntity;
import com.leqi.biz.club.ClubControlBiz;
import com.leqi.biz.club.ClubControlBizImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2016/12/30.
 */
public class GetClubInfoAction extends ActionSupport {
    private int clubID;//para

    private ClubEntity club;//jsp use
    public String enterClubHomePage(){
        ClubControlBiz clubControlBiz=new ClubControlBizImpl();
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
