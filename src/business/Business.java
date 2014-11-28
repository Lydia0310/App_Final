/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;
import business.network.Network;
import business.order.MasterOrderDirectory;
import business.organization.Organization;
import business.role.Role;

import java.util.ArrayList;
import business.role.SystemAdminRole;
/**
 *
 * @author Lydia
 */
public class Business extends Organization{
    private static Business business;
    private MasterOrderDirectory masterOrderDirectory;
    
    private ArrayList<Network> networkList;
    
    public static Business getInstance(){
        if(business == null){
            business = new Business();
        }
        return business;
    }
    
    private Business(){
        super(null);
        networkList = new ArrayList<>();
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
    
    
    
    public Network AddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    


    
    public boolean checkIfUsernameIsUnique(String username){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            return false;
        }
        
        for(Network network : networkList){
        
        }
        return true;
    }

   

    @Override
    public ArrayList<Role> getSupportedRoles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
