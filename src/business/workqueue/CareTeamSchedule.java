/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.workqueue;

import business.organization.CareTeamOrganization;
import static business.organization.Organization.Type.CareTeam;
import business.organization.OrganizationDirectory;

/**
 *
 * @author Lydia
 */
public class CareTeamSchedule extends ScheduleRequest{

   // private (CareTeam)OrganizationDirectory careTeamList;
    
    public CareTeamSchedule() {
        super(ScheduleRequest.ScheduleType.CareTeam);
    }
    
    
    
}
