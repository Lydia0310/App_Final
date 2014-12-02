/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.device;

import org.yueli.business.room.StorageRoom;
import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public class InventoryHospital {
    private ArrayList<DeviceDirectory> inventoryHospital;
    private String room;
    public InventoryHospital(){
        inventoryHospital = new ArrayList<DeviceDirectory>();
    }

    public ArrayList<DeviceDirectory> getInventoryHospital() {
        return inventoryHospital;
    }

    public void setInventoryHospital(ArrayList<DeviceDirectory> inventoryHospital) {
        this.inventoryHospital = inventoryHospital;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }


    
    
    public DeviceDirectory addDeviceList(DeviceDirectory deviceList){
        inventoryHospital.add(deviceList);
        return deviceList;
    }
}
