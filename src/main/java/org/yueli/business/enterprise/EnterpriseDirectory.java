/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.enterprise;

import org.yueli.business.enterprise.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<Enterprise>();
    }
    
    public ArrayList<Enterprise> getEnterpriseList(){
        return enterpriseList;
    }
    
    public Enterprise addEnterprise(String name, Enterprise.EnterpriseType type ){
        Enterprise enterprise = null;
        enterprise = new org.yueli.business.enterprise.HospitalEnterprise(name);
        enterpriseList.add(enterprise);
        
        
        
        return enterprise;
    }
    
        public void deleteEnterprise(Enterprise enterprise){
        enterpriseList.remove(enterprise);
    }
            
}
