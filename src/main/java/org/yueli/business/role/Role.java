/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.role;


import java.util.ArrayList;
import javax.swing.JPanel;
import org.yueli.business.Business;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.function.Function;
import org.yueli.business.network.Network;
import org.yueli.business.organization.Organization;
import org.yueli.business.useraccount.UserAccount;

/**
 *
 * @author Lydia
 */
public abstract class Role {
    public enum RoleType{
        SystemAdmin("System Admin"),
        NetworkAdmin("Network Admin"),
        EnterpriseAdmin("Enterprise Admin"),
        Doctor("Doctor"),
        WarehouseAdmin("Warehouse Admin"),
        SupplierAdmin("Supplier Admin"),
        HospitalAdmin("Hospital Admin"),
        FAMCAdmin("Founding Academic Medical Center Admin"),
        PrimaryCareAdmin("Primary Care Admin"),
        CareTeam("CareTeam");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }

        @Override
        public String toString(){
        return value;
    }
    }

    private RoleType roletype;
    protected ArrayList<Function> privilegeList;
    public Role(RoleType type){
        this.roletype = type;
        privilegeList = new ArrayList<Function>();
    }
    
    public abstract JPanel createWorkArea(
            JPanel userProcessContainer,
            UserAccount userAccount,
            Organization organization,
            Enterprise enterprise,
            Network network,
            Business business
    );

    public ArrayList<Function> getPrivilegeList() {
        return privilegeList;
    }

    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
