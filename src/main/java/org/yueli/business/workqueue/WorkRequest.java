/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.workqueue;

import  org.yueli.business.device.DeviceDirectory;
import  org.yueli.business.organization.Organization;
import  org.yueli.business.organization.OrganizationDirectory;
import  org.yueli.business.room.RoomDirectory;
import  org.yueli.business.useraccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Lydia
 */
public abstract class WorkRequest {
    private DeviceDirectory DeviceList;
    private RoomDirectory RoomList;
    private OrganizationDirectory organizationList;
    private static int count=0;
    private int requestID;
    private UserAccount sender;
    private UserAccount reciever;
    private Date requestDate;
    private Date resolveDate;
    

    
    public WorkRequest(){
        count++;
        requestID = count;
        requestDate = new Date();
    }

    public DeviceDirectory getDeviceList() {
        return DeviceList;
    }

    public void setDeviceList(DeviceDirectory DeviceList) {
        this.DeviceList = DeviceList;
    }

    public RoomDirectory getRoomList() {
        return RoomList;
    }

    public void setRoomList(RoomDirectory RoomList) {
        this.RoomList = RoomList;
    }

    public OrganizationDirectory getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(OrganizationDirectory organizationList) {
        this.organizationList = organizationList;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReciever() {
        return reciever;
    }

    public void setReciever(UserAccount reciever) {
        this.reciever = reciever;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    
            
    
}
