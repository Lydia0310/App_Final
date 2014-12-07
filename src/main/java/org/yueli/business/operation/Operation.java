/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.operation;

import  org.yueli.business.device.Device;
import org.yueli.business.organization.CareTeamOrganization;
import org.yueli.business.organization.DoctorOrganization;
import static org.yueli.business.organization.Organization.Type.Doctor;
import org.yueli.business.patient.Patient;
import org.yueli.business.patient.PatientDirectory;
import static org.yueli.business.role.Role.RoleType.Doctor;
import org.yueli.business.room.Room;

/**
 *
 * @author Lydia
 */
public class Operation {
    private Room room;
    private DoctorOrganization doctor;
    private Device device;
    private CareTeamOrganization careTeam;
    private Patient patient;
    private static int count;
    private String operationID;
    public void Operation(){
        count++;
        operationID = String.valueOf(count);
    }

    public String getOperationID() {
        return operationID;
    }

    public void setOperationID(String operationID) {
        this.operationID = operationID;
    }
    
    
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public DoctorOrganization getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorOrganization doctor) {
        this.doctor = doctor;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public CareTeamOrganization getCareTeam() {
        return careTeam;
    }

    public void setCareTeam(CareTeamOrganization careTeam) {
        this.careTeam = careTeam;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
    
}
