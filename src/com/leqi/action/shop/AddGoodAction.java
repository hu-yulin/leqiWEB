package com.leqi.action.shop;

import com.leqi.action.GetUserID;
import com.leqi.bean.GoodEntity;
import com.leqi.bean.GoodParameterEntity;
import com.leqi.bean.GoodPicEntity;
import com.leqi.biz.shop.ShopControlBiz;
import com.leqi.biz.shop.ShopControlBizImpl;
import com.leqi.biz.shop.ShopControlOfGoodBiz;
import com.leqi.biz.shop.ShopControlOfGoodBizImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * @author huyulin
 * Created by lenovo on 2016/12/27.
 */
public class AddGoodAction extends ActionSupport {
    private GoodEntity good;
    private String goodParameter;
    private File[] Picture;
    private String[] PictureContentType;
    private String[] PictureFileName;
    private String savePath;
    private String headPic;

    private Random random=new Random();

    public String execute() throws Exception {
        //需要从会话中取出shopID
        int shopID=new GetUserID().getUserID();
        if(shopID==-1){
            return "login";
        }
        good.setShopId(shopID);
        File[] files=getPicture();
        for(int i=0;i<files.length;i++){
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
            GoodPicEntity goodPicEntity=new GoodPicEntity();
            goodPicEntity.setPath("pic/good/"+fileName);
            good.getGoodPicEntitySet().add(goodPicEntity);
        }
        //下面进行商品参数解析
        String [] para=goodParameter.split(" ");
        for(int i=0;i<para.length;i++){
            GoodParameterEntity goodParameterEntity=new GoodParameterEntity();
            goodParameterEntity.setParameterValue(para[i]);
            good.getGoodParameterEntitySet().add(goodParameterEntity);
        }

        ShopControlOfGoodBiz shopControlOfGoodBiz=new ShopControlOfGoodBizImpl();
        shopControlOfGoodBiz.addGood(good);
        ShopControlBiz shopControlBiz=new ShopControlBizImpl();
        headPic=shopControlBiz.getHeadPic(shopID);
        return SUCCESS;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public GoodEntity getGood() {
        return good;
    }

    public void setGood(GoodEntity good) {
        this.good = good;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String[] getPictureFileName() {
        return PictureFileName;
    }

    public void setPictureFileName(String[] pictureFileName) {
        PictureFileName = pictureFileName;
    }

    public String[] getPictureContentType() {
        return PictureContentType;
    }

    public void setPictureContentType(String[] pictureContentType) {
        PictureContentType = pictureContentType;
    }

    public File[] getPicture() {
        return Picture;
    }

    public void setPicture(File[] picture) {
        Picture = picture;
    }

    public String getGoodParameter() {
        return goodParameter;
    }

    public void setGoodParameter(String goodParameter) {
        this.goodParameter = goodParameter;
    }
}
