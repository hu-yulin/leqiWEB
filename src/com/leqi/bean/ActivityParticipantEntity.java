package com.leqi.bean;

import org.junit.jupiter.api.Test;

/**
 * Created by mbshqqb on 16-12-26.
 */
public class ActivityParticipantEntity {
    private int id;
    private int riderId;
    private int activityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRiderId() {
        return riderId;
    }

    public void setRiderId(int riderId) {
        this.riderId = riderId;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActivityParticipantEntity that = (ActivityParticipantEntity) o;

        if (id != that.id) return false;
        if (riderId != that.riderId) return false;
        if (activityId != that.activityId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + riderId;
        result = 31 * result + activityId;
        return result;
    }
}
