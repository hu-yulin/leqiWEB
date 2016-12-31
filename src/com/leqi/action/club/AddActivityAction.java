package com.leqi.action.club;

import com.leqi.bean.ClubActivityEntity;
import com.leqi.bean.ClubActivityPicEntity;
import com.leqi.biz.clubBiz.ClubBiz;
import com.leqi.biz.clubBiz.ClubControlBizImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;
import java.util.Random;

/**
 * Created by lenovo on 2016/12/30.
 */
public class AddActivityAction extends ActionSupport {
    private ClubActivityEntity activity;
    private File[] Picture;
    private String[] PictureContentType;
    private String[] PictureFileName;
    private String savePath;
    private int clubID;

    private Random random=new Random();

    public String addActivity() throws Exception{
        activity.setClubId(clubID);
        File[] files=getPicture();
        String uploadPath = ServletActionContext.getServletContext().getRealPath(savePath);//服务器保存路径
        for(int i=0;i<files.length;i++) {
            InputStream in = new FileInputStream(files[i]);

            String fileName = PictureFileName[i];//加入随机数进行文件名处理，以免重复。


            fileName = random.nextInt(500) + fileName;
            File loadFile = new File(uploadPath, fileName);
            OutputStream outputStream = new FileOutputStream(loadFile);
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = in.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            in.close();
            outputStream.close();
            ClubActivityPicEntity picEntity = new ClubActivityPicEntity();
            picEntity.setPath("pic/activity/" + fileName);
            activity.getClubActivityPicEntitySet().add(picEntity);
        }
        ClubBiz clubBiz=new ClubControlBizImpl();
        clubBiz.addActivity(activity);
        return SUCCESS;
    }

    public ClubActivityEntity getActivity() {
        return activity;
    }

    public void setActivity(ClubActivityEntity activity) {
        this.activity = activity;
    }

    public File[] getPicture() {
        return Picture;
    }

    public void setPicture(File[] picture) {
        Picture = picture;
    }

    public String[] getPictureContentType() {
        return PictureContentType;
    }

    public void setPictureContentType(String[] pictureContentType) {
        PictureContentType = pictureContentType;
    }

    public String[] getPictureFileName() {
        return PictureFileName;
    }

    public void setPictureFileName(String[] pictureFileName) {
        PictureFileName = pictureFileName;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public int getClubID() {
        return clubID;
    }

    public void setClubID(int clubID) {
        this.clubID = clubID;
    }
}
