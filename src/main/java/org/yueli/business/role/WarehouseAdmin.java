/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.role;

import  org.yueli.business.Business;
import javax.swing.JPanel;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.function.Function;
import org.yueli.business.organization.Organization;
import org.yueli.business.useraccount.UserAccount;
import org.yueli. userinterface.warehouseworkarea.WarehouseWorkArea;

/**
 *
 * @author Lydia
 */
public class WarehouseAdmin extends Role{

    public WarehouseAdmin(){
        super(Role.RoleType.WarehouseAdmin);
        privilegeList.add(new Function("View Device Inventory","userinterface.warehouseworkarea.ViewDeviceInventory"));
        privilegeList.add(new Function("View Device Schedule Request","userinterface.warehouseworkarea.ViewDeviceScheduleRequest"));
        privilegeList.add(new Function("Track Maintaince History","userinterface.warehouseworkarea.TrackMaintainceHistory"));
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        return new WarehouseWorkArea(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
