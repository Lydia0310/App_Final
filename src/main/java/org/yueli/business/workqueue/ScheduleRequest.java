/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.workqueue;

import  org.yueli.business.room.RoomDirectory;
import java.util.Date;

/**
 *
 * @author Lydia
 */
public abstract class  ScheduleRequest {
    private static int count;
    private int scheduleID;
    private Date beginningTime;
    private Date endTime;
    
  
    
    public enum ScheduleType{
        Device("Device"),
        OperationRoom("OperationRoom"),
        StorageRoom("StorageRoom"),
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
    private ScheduleType type;
    
      public ScheduleRequest(ScheduleType type){
        count++;
        scheduleID = count;
        this.type = type;
        
    }

    public int getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(int scheduleID) {
        this.scheduleID = scheduleID;
    }

    public Date getBeginningTime() {
        return beginningTime;
    }

    public void setBeginningTime(Date beginningTime) {
        this.beginningTime = beginningTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    
    
    
}
