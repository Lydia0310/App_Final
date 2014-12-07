/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business;

import  org.yueli.business.network.Network;
import  org.yueli.business.order.MasterOrderDirectory;
import  org.yueli.business.organization.Organization;
import  org.yueli.business.role.Role;

import java.util.ArrayList;
import org.yueli.business.network.NetworkDirectory;
import org.yueli.business.organization.OrganizationDirectory;
import org.yueli.business.organization.SupplierDirectory;
import org.yueli.business.role.SystemAdminRole;

/**
 * @author Lydia
 */
public class Business extends Organization {
    private static Business business;
    private OrganizationDirectory organizationDirectory;
    private MasterOrderDirectory masterOrderDirectory;
    //private SupplierDirectory supplierDirectory;
   private NetworkDirectory networkDirectory;

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    private Business() {
        super(null);
        masterOrderDirectory = new MasterOrderDirectory();
        organizationDirectory = new OrganizationDirectory();
        networkDirectory = new NetworkDirectory();
       // supplierDirectory = new SupplierDirectory();
    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    public void setNetworkDirectory(NetworkDirectory networkDirectory) {
        this.networkDirectory = networkDirectory;
    }

   

    public MasterOrderDirectory getMasterOrderDirectory() {
        return masterOrderDirectory;
    }

    public void setMasterOrderDirectory(MasterOrderDirectory masterOrderDirectory) {
        this.masterOrderDirectory = masterOrderDirectory;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

//    public SupplierDirectory getSupplierDirectory() {
//        return supplierDirectory;
//    }
//
//    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
//        this.supplierDirectory = supplierDirectory;
//    }
    
    

   

//    public boolean checkIfUsernameIsUnique(String username) {
//        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
//            return false;
//        }
//
//        for (Network network : networkList) {
//
//        }
//        return true;
//    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }


}
