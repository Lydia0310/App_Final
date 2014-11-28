/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.network;

import  org.yueli.business.enterprise.EnterpriseDirectory;

/**
 *
 * @author Lydia
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseList;
    
    public Network(){
        enterpriseList = new EnterpriseDirectory();
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
    
    @Override
    public String toString(){
        return name;
    }
    
}
