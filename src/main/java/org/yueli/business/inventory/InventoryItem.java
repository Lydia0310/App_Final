/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.inventory;

import com.sun.scenario.effect.InvertMask;
import org.yueli.business.device.Device;

/**
 *
 * @author Lydia
 */
public class InventoryItem {
    private  Device device;
    private int Quantity;

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setInventoryQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
    @Override
    public String toString(){
        return device.getDeviceName();
    }
    
   
    
}
