package org.yueli.business.schedule;

import org.yueli.business.workqueue.ScheduleRequest;

import java.util.Date;

/**
 * Created by Yue Li on 11/30/2014/2014.
 */
public class Schedule implements Comparable<Schedule> {
    private String item;
    private ScheduleRequest.ScheduleType type;
    private Date beginTime;
    private Date endTime;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public ScheduleRequest.ScheduleType getType() {
        return type;
    }

    public void setType(ScheduleRequest.ScheduleType type) {
        this.type = type;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public int compareTo(Schedule o) {
        return getBeginTime().compareTo(o.getBeginTime());
    }
}
