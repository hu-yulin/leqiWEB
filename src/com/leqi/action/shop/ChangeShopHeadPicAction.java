package com.leqi.action.shop;

import com.leqi.action.GetUserID;
import com.leqi.bean.UserPicEntity;
import com.leqi.biz.clubBiz.ClubBiz;
import com.leqi.biz.clubBiz.ClubControlBizImpl;
import com.leqi.biz.shop.ShopControlBiz;
import com.leqi.biz.shop.ShopControlBizImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by lenovo on 2017/1/2.
 */
public class ChangeShopHeadPicAction extends ActionSupport {
    private File[] Picture;
    private String[] PictureContentType;
    private String[] PictureFileName;
    private String savePath;

    private Random random=new Random();

    public String changeShopHeadPic() throws IOException {

        int shopID = new GetUserID().getUserID();
        if (shopID == -1) {
            return "login";
        }
        File[] files = getPicture();
        Set<UserPicEntity> pics = new HashSet<>();
        for (int i = 0; i < files.length && i < 1; i++) {
            InputStream in = new FileInputStream(files[i]);
            String uploadPath = ServletActionContext.getServletContext().getRealPath(savePath);//服务器保存路径
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
            UserPicEntity pic = new UserPicEntity();
            pic.setPath("pic/shop/" + fileName);
            pics.add(pic);
        }
        ShopControlBiz shopControlBiz=new ShopControlBizImpl();
        shopControlBiz.changeHeadPic(shopID,pics);
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
