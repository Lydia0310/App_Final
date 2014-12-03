/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.room;

/**
 *
 * @author Lydia
 */
public abstract class Room {
    private static int counter;
    private int roomID;
    private String roomNumber;
    private String status;
    Boolean isFull;
    
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
        roomID = counter;
        this.type = type;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public Boolean isIsFull() {
        return isFull;
    }

    public void setIsFull(Boolean isFull) {
        this.isFull = isFull;
    }

    
    
    
}
