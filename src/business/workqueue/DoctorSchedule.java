/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.workqueue;

import static business.organization.Organization.Type.Doctor;
import business.organization.OrganizationDirectory;

/**
 *
 * @author Lydia
 */
public class DoctorSchedule extends ScheduleRequest{

    //private (Doctor)OrganizationDirectory doctorList;
    public DoctorSchedule() {
        super(ScheduleRequest.ScheduleType.Doctor);
    }
    
}
