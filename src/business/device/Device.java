/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.device;

/**
 *
 * @author Lydia
 */
public class Device {
    private static int count;
    private int deviceID;
    private String deviceName;
    private String supplierName;
    private String funcation;
    private int devicePrice;
    private int quantity;
    private int availablity;
    private int stockCount;
    private String location;
    private String exprationDate;
    private String currentStatus;        
    
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

    public String getFuncation() {
        return funcation;
    }

    public void setFuncation(String funcation) {
        this.funcation = funcation;
    }
    
    

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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

    public int getAvailablity() {
        return availablity;
    }

    public void setAvailablity(int availablity) {
        this.availablity = availablity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExprationDate() {
        return exprationDate;
    }

    public void setExprationDate(String exprationDate) {
        this.exprationDate = exprationDate;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }
    
    
}
