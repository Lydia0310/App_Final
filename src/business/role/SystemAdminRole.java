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
        privilegeList.add(new Function("Manage Device","ManageDevice"));
        privilegeList.add(new Function("View Device Dispatching Request","ViewDeviceRequest"));
        privilegeList.add(new Function("View Order","ViewOrder"));
        privilegeList.add(new Function("View Device Inventory","ViewDeviceInventory"));
        privilegeList.add(new Function("Browser Device List","BrowserDevice"));
        privilegeList.add(new Function("View Order","ViewOrder"));
        privilegeList.add(new Function("View Room Request","ViewRoomRequest"));
        privilegeList.add(new Function("View Device Request","ViewDeviceRequest"));
        privilegeList.add(new Function("View Operation","ViewOperation"));
        privilegeList.add(new Function("View Room Schedule","ViewAndRequestRoomSchedule"));
        privilegeList.add(new Function("View Device Schedule","ViewAndRequestDeviceSchedule"));
        privilegeList.add(new Function("View Care Team Schedule","ViewAndRequestCareTeamSchedule"));
        privilegeList.add(new Function("View Operation Request","ViewOperationRequest"));
        privilegeList.add(new Function("View Device Inventory","ViewDeviceInventory"));
        privilegeList.add(new Function("View Device Schedule Request","ViewDeviceScheduleRequest"));
        privilegeList.add(new Function("Track Maintaince History","TrackMaintainceHistory"));
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
       return new SysAdminWorkArea(userProcessContainer, business);
    }

   
    
}
