/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.workqueue;

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
    private int operationRoomNumber;
    
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

    public int getOperationRoomNumber() {
        return operationRoomNumber;
    }

    public void setOperationRoomNumber(int operationRoomNumber) {
        this.operationRoomNumber = operationRoomNumber;
    }
    
}
