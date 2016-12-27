package com.leqi.bean;

/**
 * Created by mbshqqb on 16-12-26.
 */
public class ClubMemberEntity {
    private int id;
    private int clubId;
    private int riderId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClubId() {
        return clubId;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public int getRiderId() {
        return riderId;
    }

    public void setRiderId(int riderId) {
        this.riderId = riderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClubMemberEntity that = (ClubMemberEntity) o;

        if (id != that.id) return false;
        if (clubId != that.clubId) return false;
        if (riderId != that.riderId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + clubId;
        result = 31 * result + riderId;
        return result;
    }
}
