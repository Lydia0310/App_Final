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
public class StorageRoom extends Room{
   private String storageRoomNumber;
   private String storageRoomStatus;
   Boolean isFull;
   
    public StorageRoom(){
        super(Room.RoomType.StorageRoom);
    }

    
    public String getStorageRoomNumber() {
        return storageRoomNumber;
    }

    public void setStorageRoomNumber(String storageRoomNumber) {
        this.storageRoomNumber = storageRoomNumber;
    }
    public String getStorageRoomStatus() {
        return storageRoomStatus;
    }

    public void setStorageRoomStatus(String storageRoomStatus) {
        this.storageRoomStatus = storageRoomStatus;
    }
    
     public Boolean isIsFull() {
        return isFull;
    }

    public void setIsFull(Boolean isFull) {
        this.isFull = isFull;
    }

    @Override
    public String toString(){
        return storageRoomNumber;
    }

}
