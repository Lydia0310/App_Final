/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.role;

import org.yueli.business.Business;
import javax.swing.JPanel;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.function.Function;
import org.yueli.business.network.Network;
import org.yueli.business.organization.Organization;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.userinterface.doctorworkarea.DoctorWorkArea;

/**
 *
 * @author Lydia
 */
public class DoctorRole extends Role{

    public DoctorRole(){
        super(Role.RoleType.Doctor);
        privilegeList.add(new Function(6, "Doctor Work Area","org.yueli.userinterface.doctorworkarea.DoctorWorkArea"));
       
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, Business business) {
        return new DoctorWorkArea();
    }


    
    
}
