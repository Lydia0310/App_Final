/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.organization;

import org.yueli.business.role.Role;
import java.util.ArrayList;
import org.yueli.business.careteam.CareTeamDirectory;
import org.yueli.business.schedule.ScheduleDirectory;


/**
 *
 * @author Lydia
 */
public class CareTeamOrganization extends Organization{
    private CareTeamDirectory careTeamDirectory;
    private ScheduleDirectory scheduleDirectory;
    public CareTeamOrganization(){
        super(Type.CareTeam.getValue());
        careTeamDirectory = new CareTeamDirectory();
        scheduleDirectory = new ScheduleDirectory();
    }

    public CareTeamDirectory getCareTeamDirectory() {
        return careTeamDirectory;
    }

    public void setCareTeamDirectory(CareTeamDirectory careTeamDirectory) {
        this.careTeamDirectory = careTeamDirectory;
    }

    public ScheduleDirectory getScheduleDirectory() {
        return scheduleDirectory;
    }

    public void setScheduleDirectory(ScheduleDirectory scheduleDirectory) {
        this.scheduleDirectory = scheduleDirectory;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRoles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
