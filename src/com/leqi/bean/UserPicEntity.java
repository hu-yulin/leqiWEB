package com.leqi.bean;

/**
 * Created by mbshqqb on 16-12-26.
 */
public class UserPicEntity {
    private int userId;
    private String path;
    private int picId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

        UserPicEntity that = (UserPicEntity) o;

        if (userId != that.userId) return false;
        if (picId != that.picId) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + picId;
        return result;
    }
}
