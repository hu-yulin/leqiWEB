package com.leqi.action.management;

import com.leqi.bean.ClubEntity;
import com.leqi.bean.UserEntity;
import com.leqi.biz.management.ManageClubBiz;
import com.leqi.biz.management.ManageClubBizImpl;
import com.opensymphony.xwork2.ActionSupport;


/**
 * Created by lenovo on 2016/12/29.
 */
public class ManageAddClubAction extends ActionSupport{
    private UserEntity user;
    private ClubEntity club;

    public String addClub(){
        ManageClubBiz manageClubBiz=new ManageClubBizImpl();
        user.setUserType(3);
        manageClubBiz.addClub(club,user);
        return SUCCESS;
    }


    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public ClubEntity getClub() {
        return club;
    }

    public void setClub(ClubEntity club) {
        this.club = club;
    }
}
