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

/**
 *
 * @author Lydia
 */
public class WarehouseAdmin extends Role{

    public WarehouseAdmin(){
        super(Role.RoleType.WarehouseAdmin);
        privilegeList.add(new Function("View Device Inventory","ViewDeviceInventory"));
        privilegeList.add(new Function("View Device Schedule Request","ViewDeviceScheduleRequest"));
        privilegeList.add(new Function("Track Maintaince History","TrackMaintainceHistory"));
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
