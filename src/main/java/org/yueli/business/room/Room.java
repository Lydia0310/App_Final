/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.room;

import org.yueli.business.schedule.ScheduleDirectory;

/**
 *
 * @author Lydia
 */
public abstract class Room {
    private static int counter;
    private String roomID;
//    private String roomNumber;
    private ScheduleDirectory scheduleDirectory;
 
    
    public enum RoomType{
        OperationRoom("Operation Room"),
        StorageRoom("Storage Room");
        
        private String value;
        private RoomType(String value){
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
    
    private RoomType type;
    
    public Room(RoomType type){
        counter++;
        roomID = String.valueOf(counter);
        this.type = type;
        scheduleDirectory = new ScheduleDirectory();
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }



    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public ScheduleDirectory getScheduleDirectory() {
        return scheduleDirectory;
    }

    public void setScheduleDirectory(ScheduleDirectory scheduleDirectory) {
        this.scheduleDirectory = scheduleDirectory;
    }

   
    
    @Override
    public String toString(){
        return roomID;
    }
    
}
