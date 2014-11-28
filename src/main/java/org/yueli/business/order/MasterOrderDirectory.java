/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.order;

import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public class MasterOrderDirectory {
    private ArrayList<Order> masterOrderList;
    
    public MasterOrderDirectory(){
        masterOrderList = new ArrayList<Order>();
    }

    public ArrayList<Order> getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(ArrayList<Order> masterOrderList) {
        this.masterOrderList = masterOrderList;
    }
    
    public Order addOrder(Order order){
        masterOrderList.add(order);
        return  order;
    }
    
}
