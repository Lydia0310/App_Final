/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.workqueue;

import java.util.Date;
import org.yueli.business.organization.DoctorDirectory;
import static org.yueli.business.organization.Organization.Type.Doctor;
import org.yueli.business.patient.Patient;

/**
 *
 * @author Lydia
 */
public class OperationRequest extends WorkRequest{
    private static int count;
    private String operationID;
    private String operationRequestStatus;    
    private String doctorName;
    private String careTeamID;
    Boolean careTeamRequestIsCompeleted;
    private String deviceName;
    Boolean deviceRequestIsCompeleted;
    private String deviceQuantity;
    private String operationRoomNumber;
    Boolean operationRoomRequestIsCompeleted;
    private Patient patient;
    private Date beginningTime;
    private Date endTime;
    
    public OperationRequest(){
        count++;
        operationID = String.valueOf(count);
    }
    public String getOperationID() {
        return operationID;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    
    public void setOperationID(String operationID) {
        this.operationID = operationID;
    }

    public String getOperationRequestStatus() {
        return operationRequestStatus;
    }

    public void setOperationRequestStatus(String operationRequestStatus) {
        this.operationRequestStatus = operationRequestStatus;
    }

    public Boolean isCareTeamRequestIsCompeleted() {
        return careTeamRequestIsCompeleted;
    }

    public void setCareTeamRequestIsCompeleted(Boolean careTeamRequestIsCompeleted) {
        this.careTeamRequestIsCompeleted = careTeamRequestIsCompeleted;
    }

    public Boolean isDeviceRequestIsCompeleted() {
        return deviceRequestIsCompeleted;
    }

    public void setDeviceRequestIsCompeleted(Boolean deviceRequestIsCompeleted) {
        this.deviceRequestIsCompeleted = deviceRequestIsCompeleted;
    }

    public Boolean isOperationRoomRequestIsCompeleted() {
        return operationRoomRequestIsCompeleted;
    }

    public void setOperationRoomRequestIsCompeleted(Boolean operationRoomRequestIsCompeleted) {
        this.operationRoomRequestIsCompeleted = operationRoomRequestIsCompeleted;
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

    public String getDeviceQuantity() {
        return deviceQuantity;
    }

    public void setDeviceQuantity(String deviceQuantity) {
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
