/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.role;

import org.yueli.business.Business;
import javax.swing.JPanel;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.function.Function;
import org.yueli.business.network.Network;
import org.yueli.business.organization.Organization;
import org.yueli.business.schedule.ScheduleDirectory;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.userinterface.careteamworkarea.CareTeamWorkArea;

/**
 *
 * @author Lydia
 */
public class CareTeamRole extends Role{
    private ScheduleDirectory scheduleDirectory;
    private String careTeamID;
    private String teamLeaderName;
    private static int count;
    
    public CareTeamRole(){
        super(Role.RoleType.CareTeam);
        privilegeList.add(new Function(7, "Care Team Work Area",CareTeamWorkArea.class));
        count++;
        careTeamID = String.valueOf(count);
        scheduleDirectory = new ScheduleDirectory();
    }

    public ScheduleDirectory getScheduleDirectory() {
        return scheduleDirectory;
    }

    public void setScheduleDirectory(ScheduleDirectory scheduleDirectory) {
        this.scheduleDirectory = scheduleDirectory;
    }

    public String getCareTeamID() {
        return careTeamID;
    }

    public void setCareTeamID(String careTeamID) {
        this.careTeamID = careTeamID;
    }

    public String getTeamLeaderName() {
        return teamLeaderName;
    }

    public void setTeamLeaderName(String teamLeaderName) {
        this.teamLeaderName = teamLeaderName;
    }
    
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, Business business) {
          return new CareTeamWorkArea();
    }

   


    
    
    
    
}
