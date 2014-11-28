/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.workqueue;

import  org.yueli.business.device.DeviceDirectory;
import org.yueli.business.workqueue.ScheduleRequest;

/**
 *
 * @author Lydia
 */
public class DeviceSchedule extends ScheduleRequest {

    
    private DeviceDirectory deviceList;
    public DeviceSchedule() {
        super(ScheduleRequest.ScheduleType.Device);
    }

    public DeviceDirectory getDeviceList() {
        return deviceList;
    }
    
    
    
}
