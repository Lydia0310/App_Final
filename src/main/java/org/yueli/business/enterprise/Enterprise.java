/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.enterprise;

import  org.yueli.business.organization.Organization;
import  org.yueli.business.organization.OrganizationDirectory;

/**
 *
 * @author Lydia
 */
public abstract class Enterprise extends Organization{
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public Enterprise (String name, EnterpriseType type){
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital");
        
        
        
        private String value;
        
        private EnterpriseType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString(){
            return value;
        }
        
        
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    
    
}
