/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.order;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lydia
 */
public class Order {
    private ArrayList<OrderItem> orderItemList;
    private static int count = 0;
    private String orderID;
    private String orderEnterpriseID;
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

    public String getOrderEnterpriseID() {
        return orderEnterpriseID;
    }

    public void setOrderEnterpriseID(String orderEnterpriseID) {
        this.orderEnterpriseID = orderEnterpriseID;
    }

    
    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public OrderItem addOrderItem(){
        OrderItem orderItem = new OrderItem();
        orderItemList.add(orderItem);
        return orderItem;
    }
    
    public void deleteOrderItem (OrderItem orderItem){
        orderItemList.remove(orderItem);
    }
    
    @Override
    public String toString(){
        return String.valueOf(orderID);
    }
}
