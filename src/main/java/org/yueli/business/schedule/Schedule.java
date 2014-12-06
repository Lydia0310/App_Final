package org.yueli.business.schedule;



import java.util.Date;

/**
 * Created by Yue Li on 11/30/2014/2014.
 */
public class Schedule implements Comparable<Schedule> {
    private String item;
    private Date beginTime;
    private Date endTime;
    private static int count = 0;
    private String scheduleID;
    
     public static enum ScheduleType {
        OperationRoom("OperationRoom"),
        CareTeam("CareTeam"),
        Doctor("Doctor");
        
        private String value;
        private ScheduleType (String value){
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    private Schedule.ScheduleType type;
      
     public Schedule(Date beginTime, Date endTime, String item, Schedule.ScheduleType type) {
        this.item = item;
        this.type = type;
        this.beginTime = beginTime;
        this.endTime = endTime;
        count++;
        scheduleID = String.valueOf(count);
    }
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
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

    public String getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(String scheduleID) {
        this.scheduleID = scheduleID;
    }

    public ScheduleType getType() {
        return type;
    }

    public void setType(ScheduleType type) {
        this.type = type;
    }
    
    

    @Override
    public int compareTo(Schedule o) {
        return getBeginTime().compareTo(o.getBeginTime());
    }
}
