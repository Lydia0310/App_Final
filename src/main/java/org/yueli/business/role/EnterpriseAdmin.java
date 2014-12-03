/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.role;

import javax.swing.JPanel;
import org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.network.Network;
import org.yueli.business.organization.Organization;
import org.yueli.business.useraccount.UserAccount;

/**
 *
 * @author Lydia
 */
public class EnterpriseAdmin extends Role{

    public EnterpriseAdmin(RoleType type) {
        super(type);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, Business business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
