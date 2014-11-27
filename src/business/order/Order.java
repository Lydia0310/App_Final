/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.order;

import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public class Order {
    private ArrayList<OrderItem> orderItemList;
    private static int count = 0;
    private String orderID;
    private String hospitalOrderID;
    private String status;
    
    public Order(){
        count++;
        orderID = String.valueOf(count);
        orderItemList = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getHospitalOrderID() {
        return hospitalOrderID;
    }

    public void setHospitalOrderID(String hospitalOrderID) {
        this.hospitalOrderID = hospitalOrderID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return String.valueOf(orderID);
    }
}
