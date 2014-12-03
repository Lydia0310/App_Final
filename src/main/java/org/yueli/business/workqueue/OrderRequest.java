/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.workqueue;

import org.yueli.business.order.Order;

/**
 *
 * @author Lydia
 */
public class OrderRequest extends WorkRequest{
    private String orderStatus;
    private Order order;

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    
}
