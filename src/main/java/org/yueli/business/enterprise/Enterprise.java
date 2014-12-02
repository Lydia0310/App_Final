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
    private String enterpriseID;
    private static int count = 0;
    public Enterprise (String name, EnterpriseType type){
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        count++;
        enterpriseID = String.valueOf(count);
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        PrimaryCare("Primary Care"),
        FoundingAMC("Founding Academic Medical Center");
        
        
        
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

    public String getEnterpriseID() {
        return enterpriseID;
    }

    public void setEnterpriseID(String enterpriseID) {
        this.enterpriseID = enterpriseID;
    }

    
    
}
