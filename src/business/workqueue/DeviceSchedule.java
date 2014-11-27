/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.workqueue;

import business.device.DeviceDirectory;

/**
 *
 * @author Lydia
 */
public class DeviceSchedule extends ScheduleRequest{

    
    private DeviceDirectory deviceList;
    public DeviceSchedule() {
        super(ScheduleRequest.ScheduleType.Device);
    }

    public DeviceDirectory getDeviceList() {
        return deviceList;
    }
    
    
    
}
