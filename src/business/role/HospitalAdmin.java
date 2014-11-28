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

/**
 *
 * @author Lydia
 */
public class HospitalAdmin extends Role{

    public HospitalAdmin(){
        super(Role.RoleType.HospitalAdmin);
        privilegeList.add(new Function("View Device Inventory","ViewDeviceInventory"));
        privilegeList.add(new Function("Browser Device List","BrowserDevice"));
        privilegeList.add(new Function("View Order","ViewOrder"));
        privilegeList.add(new Function("View Room Request","ViewRoomRequest"));
        privilegeList.add(new Function("View Device Request","ViewDeviceRequest"));
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
