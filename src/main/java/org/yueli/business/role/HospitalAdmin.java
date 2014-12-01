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
        privilegeList.add(new Function("Hospital Work Area","org.yueli.userinterface.hospitalworkarea.HospitalWorkArea"));
        
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        return new HospitalWorkArea(); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
