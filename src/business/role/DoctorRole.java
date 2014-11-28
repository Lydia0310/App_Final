/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.role;

import business.Business;
import javax.swing.JPanel;
import business.enterprise.Enterprise;
import business.function.Function;
import business.organization.Organization;
import business.useraccount.UserAccount;
import userinterface.doctorworkarea.DoctorWorkArea;

/**
 *
 * @author Lydia
 */
public class DoctorRole extends Role{

    public DoctorRole(){
        super(Role.RoleType.Doctor);
        privilegeList.add(new Function("View Operation","userinterface.doctorworkarea.ViewOperation"));
        privilegeList.add(new Function("View Room Schedule","userinterface.doctorworkarea.ViewAndRequestRoomSchedule"));
        privilegeList.add(new Function("View Device Schedule","userinterface.doctorworkarea.ViewAndRequestDeviceSchedule"));
        privilegeList.add(new Function("View Care Team Schedule","userinterface.doctorworkarea.ViewAndRequestCareTeamSchedule"));
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        return new DoctorWorkArea(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
