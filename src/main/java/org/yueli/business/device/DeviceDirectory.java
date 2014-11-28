/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.device;

import org.yueli.business.device.Device;

import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public class DeviceDirectory {
    private ArrayList<Device> deviceList;
    
    public DeviceDirectory(){
        deviceList = new ArrayList<Device>();
    }

    public ArrayList<Device> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(ArrayList<Device> deviceList) {
        this.deviceList = deviceList;
    }
    
    public Device addDevice(){
       Device device = new Device();
       deviceList.add(device);
       return device;
    }
    
    public void removeDevice(Device device){
        deviceList.remove(device);
    }
    
    public Device searchDevice(String deviceName){
        for(Device device : deviceList){
            if(device.getDeviceName() == deviceName){
                return device;
            }
        }
        return null;
    }
}
