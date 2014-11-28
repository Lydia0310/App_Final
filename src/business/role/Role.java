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
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Lydia
 */
public abstract class Role {
    public enum RoleType{
        
        SystemAdmin("System Admin"),
        Doctor("Doctor"),
        WarehouseAdmin("Warehouse Admin"),
        SupplierAdmin("Supplier Admin"),
        HospitalAdmin("Hospital Admin"),
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
            Business business
    );
  
   
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
