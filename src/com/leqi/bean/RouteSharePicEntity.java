package com.leqi.bean;

/**
 * Created by mbshqqb on 16-12-26.
 */
public class RouteSharePicEntity {
    private int shareId;
    private String path;
    private int picId;

    public int getShareId() {
        return shareId;
    }

    public void setShareId(int shareId) {
        this.shareId = shareId;
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

        RouteSharePicEntity that = (RouteSharePicEntity) o;

        if (shareId != that.shareId) return false;
        if (picId != that.picId) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shareId;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + picId;
        return result;
    }
}
