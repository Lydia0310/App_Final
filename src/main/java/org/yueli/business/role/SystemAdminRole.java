/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.role;

import org.yueli.business.Business;
import javax.swing.JPanel;
import  org.yueli.business.enterprise.Enterprise;
import  org.yueli.business.function.Function;
import  org.yueli.business.organization.Organization;
import  org.yueli.business.useraccount.UserAccount;
import org.yueli.userinterface.sysadminworkarea.SysAdminWorkArea;

/**
 *
 * @author Lydia
 */
public class SystemAdminRole extends Role{

    public SystemAdminRole() {
        super(Role.RoleType.SystemAdmin);
        privilegeList.add(new Function("View Tree Chart for Whole System", "org.yueli.userinterface.sysadminworkarea.ViewTreeChart"));
        privilegeList.add(new Function("Manage Network", "org.yueli.userinterface.sysadminworkarea.ManageNetwork"));
        privilegeList.add(new Function("Manage Enterprise", "org.yueli.userinterface.sysadminworkarea.ManageEnterprise"));
        privilegeList.add(new Function("Manage Enterprise Admin", "org.yueli.userinterface.sysadminworkarea.ManageEnterpriseAdmin"));
        privilegeList.add(new Function("View Tree Chart for Whole System", "org.yueli.userinterface.sysadminworkarea.ViewTreeChart"));
        privilegeList.add(new Function("Manage Device","org.yueli.userinterface.supplierworkarea.ManageDevice"));
        privilegeList.add(new Function("View Device Dispatching Request","org.yueli.userinterface.supplierworkarea.ViewDeviceRequest"));
        privilegeList.add(new Function("View Order","org.yueli.userinterface.supplierworkarea.ViewOrder"));
        privilegeList.add(new Function("View Device Inventory","org.yueli.userinterface.hospitalworkarea.ViewDeviceInventory"));
        privilegeList.add(new Function("Browser Device List","org.yueli.userinterface.hospitalworkarea.BrowserDevice"));
        privilegeList.add(new Function("View Order","org.yueli.userinterface.hospitalworkarea.ViewOrder"));
        privilegeList.add(new Function("View Room Request","org.yueli.userinterface.hospitalworkarea.ViewRoomRequest"));
        privilegeList.add(new Function("View Device Request","org.yueli.userinterface.hospitalworkarea.ViewDeviceRequest"));
        privilegeList.add(new Function("View Operation","org.yueli.userinterface.doctorworkarea.ViewOperation"));
        privilegeList.add(new Function("View Room Schedule","org.yueli.userinterface.doctorworkarea.ViewAndRequestRoomSchedule"));
        privilegeList.add(new Function("View Device Schedule","org.yueli.userinterface.doctorworkarea.ViewAndRequestDeviceSchedule"));
        privilegeList.add(new Function("View Care Team Schedule","org.yueli.userinterface.doctorworkarea.ViewAndRequestCareTeamSchedule"));
        privilegeList.add(new Function("View Device Inventory","org.yueli.userinterface.warehouseworkarea.ViewDeviceInventory"));
        privilegeList.add(new Function("View Device Schedule Request","org.yueli.userinterface.warehouseworkarea.ViewDeviceScheduleRequest"));
        privilegeList.add(new Function("Track Maintaince History","org.yueli.userinterface.warehouseworkarea.TrackMaintainceHistory"));
    }



    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        return new SysAdminWorkArea(userProcessContainer, business);  
    }

   
    
}
