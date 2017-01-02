package com.leqi.action.club;

import com.leqi.action.GetUserID;
import com.leqi.bean.ClubActivityPicEntity;
import com.leqi.bean.GoodPicEntity;
import com.leqi.bean.UserPicEntity;
import com.leqi.biz.clubBiz.ClubBiz;
import com.leqi.biz.clubBiz.ClubControlBizImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;
import java.util.*;

/**
 * Created by lenovo on 2016/12/31.
 */
public class AddClubPicAction extends ActionSupport {

    private File[] Picture;
    private String[] PictureContentType;
    private String[] PictureFileName;
    private String savePath;

    private Random random=new Random();
    public String addClubPic() throws IOException {
        int clubID=new GetUserID().getUserID();
        if(clubID==-1){
            return "login";
        }
        File[] files=getPicture();
        Set<UserPicEntity> pics=new HashSet<>();
        for(int i=0;i<files.length&&i<1;i++){
            InputStream in=new FileInputStream(files[i]);
            String uploadPath= ServletActionContext.getServletContext().getRealPath(savePath);//服务器保存路径
            String fileName=PictureFileName[i];//加入随机数进行文件名处理，以免重复。

            fileName=random.nextInt(500)+fileName;
            File loadFile=new File(uploadPath,fileName);
            OutputStream outputStream=new FileOutputStream(loadFile);
            byte[] buffer =new byte[1024];
            int length=0;
            while((length=in.read(buffer))>0){
                outputStream.write(buffer,0,length);
            }
            in.close();
            outputStream.close();
            UserPicEntity pic=new UserPicEntity();
            pic.setPath("pic/club/"+fileName);
            pics.add(pic);
        }
        ClubBiz clubBiz=new ClubControlBizImpl();
        clubBiz.addClubPic(clubID,pics);
        return SUCCESS;
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
}