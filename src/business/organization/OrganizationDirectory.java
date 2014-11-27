/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.organization;

import java.util.ArrayList;
import business.organization.Organization.Type;

/**
 *
 * @author Lydia
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory(){
        organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization addOrganization(Type type){
        Organization organization = null;
        
        if(type.getValue().equals((Type.Warehouse.getValue()))){
            organization = new WarehouseOrganization();
            organizationList.add(organization);
        }
        
        if(type.getValue().equals((Type.Doctor.getValue()))){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
 
        if(type.getValue().equals((Type.CareTeam.getValue()))){
            organization = new CareTeamOrganization();
            organizationList.add(organization);
        }
     
        return organization;
    }
}
