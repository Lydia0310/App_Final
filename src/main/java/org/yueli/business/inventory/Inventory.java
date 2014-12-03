/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.inventory;

import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public class Inventory {
    private ArrayList<InventoryItem> inventoryItemList;
   
    public Inventory(){
        inventoryItemList = new ArrayList<InventoryItem>();
    }

    public ArrayList<InventoryItem> getInventoryItemList() {
        return inventoryItemList;
    }

    public void setInventoryItemList(ArrayList<InventoryItem> inventoryItemList) {
        this.inventoryItemList = inventoryItemList;
    }
    
    public InventoryItem addInventoryItem(){
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItemList.add(inventoryItem);
        return inventoryItem;
    }
    
    public void deleteInventoryItem(InventoryItem inventoryItem){
        inventoryItemList.remove(inventoryItem);
    }
    
}
