/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.role;

import business.Business;
import business.enterprise.Enterprise;
import business.function.Function;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.hospitalworkarea.HospitalWorkArea;

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
