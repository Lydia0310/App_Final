/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.workqueue;

import org.yueli.business.inventory.InventoryItem;

/**
 *
 * @author Lydia
 */
public class DeviceRequest extends WorkRequest{
    private InventoryItem inventoryItem;
    private String deviceRequestStatus;
    private int requestQuantity;

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public String getDeviceRequestStatus() {
        return deviceRequestStatus;
    }

    public void setDeviceRequestStatus(String deviceRequestStatus) {
        this.deviceRequestStatus = deviceRequestStatus;
    }

    public int getRequestQuantity() {
        return requestQuantity;
    }

    public void setRequestQuantity(int requestQuantity) {
        this.requestQuantity = requestQuantity;
    }
    
    
    
}
