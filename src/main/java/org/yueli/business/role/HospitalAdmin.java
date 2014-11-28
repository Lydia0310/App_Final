/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.role;

import  org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.function.Function;
import org.yueli.business.organization.Organization;
import org.yueli.business.useraccount.UserAccount;
import javax.swing.JPanel;
import org.yueli.userinterface.hospitalworkarea.HospitalWorkArea;

/**
 *
 * @author Lydia
 */
public class HospitalAdmin extends Role{

    public HospitalAdmin(){
        super(Role.RoleType.HospitalAdmin);
        privilegeList.add(new Function("View Device Inventory","userinterface.hospitalworkarea.ViewDeviceInventory"));
        privilegeList.add(new Function("Browser Device List","userinterface.hospitalworkarea.BrowserDevice"));
        privilegeList.add(new Function("View Order","userinterface.hospitalworkarea.ViewOrder"));
        privilegeList.add(new Function("View Room Request","userinterface.hospitalworkarea.ViewRoomRequest"));
        privilegeList.add(new Function("View Device Request","userinterface.hospitalworkarea.ViewDeviceRequest"));
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        return new HospitalWorkArea(); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
