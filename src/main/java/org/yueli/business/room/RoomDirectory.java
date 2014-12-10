/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.room;

import org.yueli.business.room.Room.RoomType;
import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public class RoomDirectory {
    private ArrayList<Room> roomList;
    
    public RoomDirectory(){
        roomList = new ArrayList<Room>();
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }
    
    public Room addRoom(String roomNumber, RoomType type){
        Room room = null;
        
        if(type.getValue().equals((RoomType.OperationRoom.getValue()))){
            OperationRoom operationRoom = new OperationRoom();
            operationRoom.setOperationRoomNumber(roomNumber);
            
            roomList.add(operationRoom);
        }
        
        if(type.getValue().equals((RoomType.StorageRoom.getValue()))){
            StorageRoom storageRoom = new StorageRoom();
            storageRoom.setStorageRoomNumber(roomNumber);
           
            roomList.add(storageRoom);
        }
        return room;
    }
}
