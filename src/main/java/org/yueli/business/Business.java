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
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;

/**
 * @author Lydia
 */
public class Business extends Organization {
    @JsonIgnore
    private static Business business;
    private MasterOrderDirectory masterOrderDirectory;

    private ArrayList<Network> networkList;

    @JsonIgnore
    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    private Business() {
        super(null);
        networkList = new ArrayList<Network>();
        masterOrderDirectory = new MasterOrderDirectory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public MasterOrderDirectory getMasterOrderDirectory() {
        return masterOrderDirectory;
    }

    public void setMasterOrderDirectory(MasterOrderDirectory masterOrderDirectory) {
        this.masterOrderDirectory = masterOrderDirectory;
    }

    public Network addNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public boolean checkIfUsernameIsUnique(String username) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        for (Network network : networkList) {

        }
        return true;
    }

    @JsonIgnore
    @Override
    public ArrayList<Role> getSupportedRoles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
