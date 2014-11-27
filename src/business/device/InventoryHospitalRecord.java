/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.device;

import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public class InventoryHospitalRecord {
    private ArrayList<InventoryHospital> inventoryRecord;
    
    public InventoryHospitalRecord(){
        inventoryRecord = new ArrayList<InventoryHospital>();
                
    }

    public ArrayList<InventoryHospital> getInventoryRecord() {
        return inventoryRecord;
    }

    public void setInventoryRecord(ArrayList<InventoryHospital> inventoryRecord) {
        this.inventoryRecord = inventoryRecord;
    }
    
    public InventoryHospital addInventory(InventoryHospital inventory){
        inventoryRecord.add(inventory);
        return inventory;
    }
}
