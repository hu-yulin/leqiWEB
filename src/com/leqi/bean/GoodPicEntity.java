package com.leqi.bean;

/**
 * Created by mbshqqb on 16-12-26.
 */
public class GoodPicEntity {
    private Integer goodId;
    private String path;
    private int picId;

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodPicEntity that = (GoodPicEntity) o;

        if (picId != that.picId) return false;
        if (goodId != null ? !goodId.equals(that.goodId) : that.goodId != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = goodId != null ? goodId.hashCode() : 0;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + picId;
        return result;
    }
}
