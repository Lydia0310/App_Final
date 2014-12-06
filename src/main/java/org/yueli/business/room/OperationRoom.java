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
public class OperationRoom extends Room{
    private String operationRoomNumber;
    
    public OperationRoom() {
        super(Room.RoomType.OperationRoom);
    }

    public String getOperationRoomNumber() {
        return operationRoomNumber;
    }

    public void setOperationRoomNumber(String operationRoomNumber) {
        this.operationRoomNumber = operationRoomNumber;
    }
    
    
}
