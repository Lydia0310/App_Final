/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.workqueue;

import  org.yueli.business.organization.CareTeamOrganization;
import static  org.yueli.business.organization.Organization.Type.CareTeam;
import  org.yueli.business.organization.OrganizationDirectory;
import org.yueli.business.workqueue.ScheduleRequest;

/**
 *
 * @author Lydia
 */
public class CareTeamSchedule extends ScheduleRequest {

   // private (CareTeam)OrganizationDirectory careTeamList;
    
    public CareTeamSchedule() {
        super(ScheduleRequest.ScheduleType.CareTeam);
    }
    
    
    
}
