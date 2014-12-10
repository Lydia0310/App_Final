/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.network;

import  org.yueli.business.enterprise.EnterpriseDirectory;
import org.yueli.business.organization.SupplierDirectory;
import org.yueli.business.person.PersonDirectory;
import org.yueli.business.room.RoomDirectory;
import org.yueli.business.useraccount.UserAccountDirectory;
import org.yueli.business.workqueue.WorkQueue;

/**
 *
 * @author Lydia
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseList;
    private SupplierDirectory supplierDirectory;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    public Network(){
        enterpriseList = new EnterpriseDirectory();
        supplierDirectory = new SupplierDirectory();
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        workQueue = new WorkQueue();
    }

    public String getName() {
        return name;
    }

    public EnterpriseDirectory getEnterpriseList() {
        return enterpriseList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public void setEnterpriseList(EnterpriseDirectory enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
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
