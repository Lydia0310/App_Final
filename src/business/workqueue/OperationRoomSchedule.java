/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.workqueue;

import business.room.RoomDirectory;

/**
 *
 * @author Lydia
 */
public class OperationRoomSchedule extends ScheduleRequest{
    private RoomDirectory roomList;
    
    public OperationRoomSchedule (){
        super(ScheduleRequest.ScheduleType.OperationRoom);
    }

    public RoomDirectory getRoomList() {
        return roomList;
    }
    
    
}
