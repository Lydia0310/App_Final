/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.role;

import javax.swing.JPanel;
import org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.enterprise.EnterpriseDirectory;
import org.yueli.business.function.Function;
import org.yueli.business.inventory.Inventory;
import org.yueli.business.network.Network;
import org.yueli.business.organization.Organization;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.userinterface.networkadminworkarea.NetworkAdminWorkArea;

/**
 *
 * @author Lydia
 */
public class NetworkAdmin extends Role{

   private EnterpriseDirectory enterpriseDirectory; 
    public NetworkAdmin() {
        super(Role.RoleType.NetworkAdmin);
        privilegeList.add(new Function(1,"Network Admin Work Area", NetworkAdminWorkArea.class));
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, Business business) {
        return new NetworkAdminWorkArea();
    }

    
   

    
    

    
}
