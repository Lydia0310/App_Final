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
public class InventorySupplier {
    private ArrayList<DeviceDirectory> inventorySupplier;
    
    public InventorySupplier(){
        inventorySupplier = new ArrayList<DeviceDirectory>();
    }

    public ArrayList<DeviceDirectory> getInventorySupplier() {
        return inventorySupplier;
    }

    public void setInventorySupplier(ArrayList<DeviceDirectory> inventorySupplier) {
        this.inventorySupplier = inventorySupplier;
    }
    
    public DeviceDirectory addInventorySupplier(DeviceDirectory deviceDirectory){
        inventorySupplier.add(deviceDirectory);
        return deviceDirectory;
    }
}
