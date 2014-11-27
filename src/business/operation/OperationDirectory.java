/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.operation;

import business.device.Device;
import business.organization.CareTeamOrganization;
import business.organization.DoctorOrganization;
import business.room.OperationRoom;
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
    
    public Operation addOperation(OperationRoom operationRoom,Device device//CareTeam,Doctor,BeginningTime,EndTime
    ){
        Operation operation = new Operation();
        return operation;   
    }
    
    
}
