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
import userinterface.sysadminworkarea.SysAdminWorkArea;

/**
 *
 * @author Lydia
 */
public class SystemAdminRole extends Role{

    public SystemAdminRole() {
        super(Role.RoleType.SystemAdmin);
        privilegeList.add(new Function("View Tree Chart for Whole System", "userinterface.sysadminworkarea.ViewTreeChart"));
        privilegeList.add(new Function("Manage Network", "userinterface.sysadminworkarea.ManageNetwork"));
        privilegeList.add(new Function("Manage Enterprise", "userinterface.sysadminworkarea.ManageEnterprise"));
        privilegeList.add(new Function("Manage Enterprise Admin", "userinterface.sysadminworkarea.ManageEnterpriseAdmin"));
        privilegeList.add(new Function("View Tree Chart for Whole System", "userinterface.sysadminworkarea.ViewTreeChart"));
        privilegeList.add(new Function("Manage Device","userinterface.supplierworkarea.ManageDevice"));
        privilegeList.add(new Function("View Device Dispatching Request","userinterface.supplierworkarea.ViewDeviceRequest"));
        privilegeList.add(new Function("View Order","userinterface.supplierworkarea.ViewOrder"));
        privilegeList.add(new Function("View Device Inventory","userinterface.hospitalworkarea.ViewDeviceInventory"));
        privilegeList.add(new Function("Browser Device List","userinterface.hospitalworkarea.BrowserDevice"));
        privilegeList.add(new Function("View Order","userinterface.hospitalworkarea.ViewOrder"));
        privilegeList.add(new Function("View Room Request","userinterface.hospitalworkarea.ViewRoomRequest"));
        privilegeList.add(new Function("View Device Request","userinterface.hospitalworkarea.ViewDeviceRequest"));
        privilegeList.add(new Function("View Operation","userinterface.doctorworkarea.ViewOperation"));
        privilegeList.add(new Function("View Room Schedule","userinterface.doctorworkarea.ViewAndRequestRoomSchedule"));
        privilegeList.add(new Function("View Device Schedule","userinterface.doctorworkarea.ViewAndRequestDeviceSchedule"));
        privilegeList.add(new Function("View Care Team Schedule","userinterface.doctorworkarea.ViewAndRequestCareTeamSchedule"));
        privilegeList.add(new Function("View Device Inventory","userinterface.warehouseworkarea.ViewDeviceInventory"));
        privilegeList.add(new Function("View Device Schedule Request","userinterface.warehouseworkarea.ViewDeviceScheduleRequest"));
        privilegeList.add(new Function("Track Maintaince History","userinterface.warehouseworkarea.TrackMaintainceHistory"));
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
       return new SysAdminWorkArea(userProcessContainer, business);
    }

   
    
}
