package com.leqi.bean;

/**
 * Created by mbshqqb on 16-12-26.
 */
public class AdvertisementEntity {
    private int adId;
    private String name;
    private String description;
    private String picPath;
    private int shopId;

    public int getAdId() {
        return adId;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdvertisementEntity that = (AdvertisementEntity) o;

        if (adId != that.adId) return false;
        if (shopId != that.shopId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (picPath != null ? !picPath.equals(that.picPath) : that.picPath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (picPath != null ? picPath.hashCode() : 0);
        result = 31 * result + shopId;
        return result;
    }
}
