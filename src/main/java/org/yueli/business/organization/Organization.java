/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.organization;

import org.yueli.business.person.PersonDirectory;
import org.yueli.business.role.Role;
import org.yueli.business.useraccount.UserAccountDirectory;
import org.yueli.business.workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public abstract class Organization {
    private String name;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private static int counter = 0;
    private int organizationID;
    private WorkQueue workQueue;
    
    public Organization (String name){
        counter++;
        organizationID = counter;
        this.name = name;
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        workQueue = new WorkQueue();
    }
    
    public enum Type{
        SysAdmin("SysAdmin Organization"){},
        Supplier("Supplier"){},
        Doctor("Doctor Organization"){},
        CareTeam("CareTeam Organization"){},
        Warehouse("Warehouse Organization"){};
        
        private String value;
        private Type(String value){
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }
    }
    
    public abstract ArrayList<Role> getSupportedRoles();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
