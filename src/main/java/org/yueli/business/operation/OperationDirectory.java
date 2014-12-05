/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.operation;

import org.yueli.business.device.Device;
import  org.yueli.business.organization.CareTeamOrganization;
import  org.yueli.business.organization.DoctorOrganization;
import  org.yueli.business.room.OperationRoom;
import org.yueli.business.operation.Operation;

import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public class OperationDirectory {
    private ArrayList<Operation> operationList;
    
    public OperationDirectory(){
        operationList = new ArrayList<Operation>();
    }

    public ArrayList<Operation> getOperationList() {
        return operationList;
    }

    public void setOperationList(ArrayList<Operation> operationList) {
        this.operationList = operationList;
    }
    
    public Operation addOperation(){
        Operation operation = new Operation();
        return operation;   
    }
    
    public void removeOperation(Operation operation){
        operationList.remove(operation);
    }
    
}
