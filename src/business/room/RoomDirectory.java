/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.room;

import business.room.Room.RoomType;
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
    
    public Room addRoom(RoomType type){
        Room room = null;
        
        if(type.getValue().equals((RoomType.OperationRoom.getValue()))){
            room = new OperationRoom();
            roomList.add(room);
        }
        
        if(type.getValue().equals((RoomType.StorageRoom.getValue()))){
            room = new StorageRoom();
            roomList.add(room);
        }
        
        return room;
    }
}
