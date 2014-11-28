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

    public void Operation(){
    
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
    
    
    
}
