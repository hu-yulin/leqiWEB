package com.leqi.action.club;

import com.leqi.action.GetUserID;
import com.leqi.bean.ClubEntity;
import com.leqi.biz.clubBiz.ClubControlBizImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2016/12/30.
 */
public class GetClubInfoAction extends ActionSupport {

    private String headPic;
    private ClubEntity club;//jsp use
    public String enterClubHomePage(){
        int clubID=new GetUserID().getUserID();
        if(clubID==-1){
            return "login";
        }
        ClubControlBizImpl clubControlBiz=new ClubControlBizImpl();
        headPic=clubControlBiz.getClubHeadPic(clubID);
        club=clubControlBiz.getClubInfo(clubID);
        return SUCCESS;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }


    public ClubEntity getClub() {
        return club;
    }

    public void setClub(ClubEntity club) {
        this.club = club;
    }
}
