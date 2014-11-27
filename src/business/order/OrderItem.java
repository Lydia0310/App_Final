/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.order;

import business.device.Device;

/**
 *
 * @author Lydia
 */
public class OrderItem {
    private Device device;
    private int quantity;

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String toString(){
        return device.getDeviceName();
    }
}
