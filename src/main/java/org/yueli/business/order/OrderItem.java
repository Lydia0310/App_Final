/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.order;

import org.yueli.business.device.Device;
import org.yueli.business.inventory.InventoryItem;

/**
 *
 * @author Lydia
 */
public class OrderItem {
    private InventoryItem inventoryItem;
    private int orderQuantity;

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

 
    public String toString(){
        return inventoryItem.getDevice().getDeviceName();
    }
}
