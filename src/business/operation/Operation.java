/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.operation;

import business.device.Device;
import business.organization.CareTeamOrganization;
import business.organization.DoctorOrganization;
import static business.organization.Organization.Type.Doctor;
import static business.role.Role.RoleType.Doctor;
import business.room.Room;

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
