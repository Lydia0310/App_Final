/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.device;

import org.yueli.business.device.InventorySupplier;

import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public class InventorySupplierRecord {
    private ArrayList<InventorySupplier> inventorySupplierList;
    
    public InventorySupplierRecord(){
        inventorySupplierList = new ArrayList<InventorySupplier>();
    }

    public ArrayList<InventorySupplier> getInventorySupplierList() {
        return inventorySupplierList;
    }

    public void setInventorySupplierList(ArrayList<InventorySupplier> inventorySupplierList) {
        this.inventorySupplierList = inventorySupplierList;
    }
    
    public InventorySupplier addInventorySupplier(InventorySupplier inventorySupplier){
        inventorySupplierList.add(inventorySupplier);
        return inventorySupplier;
    }
}
