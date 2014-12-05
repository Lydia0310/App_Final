/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.organization;

import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public class SupplierDirectory {
    private ArrayList<SupplierOrganization> supplierList;
    
    public SupplierDirectory(){
        supplierList = new ArrayList<>();
    }

    public ArrayList<SupplierOrganization> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<SupplierOrganization> supplierList) {
        this.supplierList = supplierList;
    }
    
    public SupplierOrganization addSupplier(){
        SupplierOrganization supplierOrganization = new SupplierOrganization();
        supplierList.add(supplierOrganization);
        return supplierOrganization;
    }
}
