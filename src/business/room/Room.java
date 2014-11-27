/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.room;

/**
 *
 * @author Lydia
 */
public abstract class Room {
    private static int counter;
    private int roomID;
    
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

}
