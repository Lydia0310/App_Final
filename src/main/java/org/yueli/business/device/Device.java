/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.device;

import static org.yueli.business.organization.Organization.Type.Supplier;

/**
 *
 * @author Lydia
 */
public class Device {
    private static int count;
    private int deviceID;
    private String deviceName;
    private String supplierID;
    private String supplierName;
    private String function;
    private int devicePrice;
    private int quantity;
    //private int availability;//stock in Enterprise 
    //private int stockCount;//Inventory number
    private String location;
    private String description;
    //private String expirationDate;
    //private String currentStatus;        


    
    public Device(){
        count++;
        deviceID = count;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

 
    public int getDevicePrice() {
        return devicePrice;
    }

    public void setDevicePrice(int devicePrice) {
        this.devicePrice = devicePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    
}
