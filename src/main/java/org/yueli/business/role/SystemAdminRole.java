/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.role;

import org.yueli.business.Business;
import javax.swing.JPanel;
import  org.yueli.business.enterprise.Enterprise;
import  org.yueli.business.function.Function;
import org.yueli.business.network.Network;
import  org.yueli.business.organization.Organization;
import  org.yueli.business.useraccount.UserAccount;
import org.yueli.userinterface.sysadminworkarea.SysAdminWorkArea;

/**
 *
 * @author Lydia
 */
public class SystemAdminRole extends Role{

    public SystemAdminRole() {
        super(Role.RoleType.SystemAdmin);
        privilegeList.add(new Function(1,"Network Admin Work Area", "org.yueli.userinterface.NetworkAdminWorkArea"));
        privilegeList.add(new Function(2, "Hospital Work Area","org.yueli.userinterface.hospitalworkarea.HospitalWorkArea"));
        privilegeList.add(new Function(3, "Funding Academic Medical Center Admin Work Area", "org.yueli.userinterface.famcworkarea.FAMCAdminWorkArea"));
        privilegeList.add(new Function(4, "Primary Care Admin Work Area", "org.yueli.userinterface.primarycareworkarea.PrimaryCareWorkArea"));
        privilegeList.add(new Function(5, "Supplier Work Area","org.yueli.userinterface.supplierworkarea.SupplierWorkArea"));
        privilegeList.add(new Function(6, "Doctor Work Area","org.yueli.userinterface.doctorworkarea.DoctorWorkArea"));
        privilegeList.add(new Function(7, "Care Team Work Area","org.yueli.userinterface.careteamworkarea.CareTeamWorkArea"));
        privilegeList.add(new Function(8, "Warehouse Admin Work Area","org.yueli.userinterface.warehouseworkarea.WarehouseWorkArea"));
        privilegeList.add(new Function(9, "System Admin Work Area","org.yueli.userinterface.sysadminworkarea.SysAdminWorkArea"));
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, Business business) {
         return new SysAdminWorkArea(userProcessContainer, business);  //To change body of generated methods, choose Tools | Templates.
    }
    
}
