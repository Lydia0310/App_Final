/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.workqueue;

import java.util.Date;
import org.yueli.business.organization.DoctorDirectory;
import static org.yueli.business.organization.Organization.Type.Doctor;

/**
 *
 * @author Lydia
 */
public class OperationRequest extends WorkRequest{
    private static int count;
    private String operationID;
    private String operationRequestStatue;    
    private String doctorName;
    private String careTeamID;
    private String deviceName;
    private int deviceQuantity;
    private String operationRoomNumber;
    private Date beginningTime;
    private Date endTime;
    
    public OperationRequest(){
        count++;
        operationID = String.valueOf(count);
    }
    public String getOperationID() {
        return operationID;
    }

    public void setOperationID(String operationID) {
        this.operationID = operationID;
    }

    public String getOperationRequestStatue() {
        return operationRequestStatue;
    }

    public void setOperationRequestStatue(String operationRequestStatue) {
        this.operationRequestStatue = operationRequestStatue;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getCareTeamID() {
        return careTeamID;
    }

    public void setCareTeamID(String careTeamID) {
        this.careTeamID = careTeamID;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getDeviceQuantity() {
        return deviceQuantity;
    }

    public void setDeviceQuantity(int deviceQuantity) {
        this.deviceQuantity = deviceQuantity;
    }

    public String getOperationRoomNumber() {
        return operationRoomNumber;
    }

    public void setOperationRoomNumber(String operationRoomNumber) {
        this.operationRoomNumber = operationRoomNumber;
    }

    public Date getBeginningTime() {
        return beginningTime;
    }

    public void setBeginningTime(Date beginningTime) {
        this.beginningTime = beginningTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

   
    
}
