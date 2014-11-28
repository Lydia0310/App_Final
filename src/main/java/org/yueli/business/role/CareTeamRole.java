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
import org.yueli.business.organization.Organization;
import org.yueli.business.useraccount.UserAccount;

/**
 *
 * @author Lydia
 */
public class CareTeamRole extends Role{

    public CareTeamRole(){
        super(Role.RoleType.CareTeam);
        privilegeList.add(new Function("View Operation Request","org.yueli.userinterface.careteamworkarea.ViewOperationRequest"));
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Business business) {
        return createWorkArea(userProcessContainer, userAccount, organization, enterprise, business); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
