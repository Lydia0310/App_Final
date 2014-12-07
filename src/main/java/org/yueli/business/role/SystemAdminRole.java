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
import org.yueli.userinterface.careteamadminworkarea.CareTeamWorkArea;
import org.yueli.userinterface.doctorworkarea.DoctorWorkArea;
import org.yueli.userinterface.famcworkarea.FAMCAdminWorkArea;
import org.yueli.userinterface.hospitalworkarea.HospitalWorkArea;
import org.yueli.userinterface.networkadminworkarea.NetworkAdminWorkArea;
import org.yueli.userinterface.primarycareworkarea.PrimaryCareWorkArea;
import org.yueli.userinterface.supplierworkarea.SupplierWorkArea;
import org.yueli.userinterface.sysadminworkarea.SysAdminWorkArea;
import org.yueli.userinterface.warehouseworkarea.WarehouseWorkArea;

/**
 *
 * @author Lydia
 */
public class SystemAdminRole extends Role{

    public SystemAdminRole() {
        super(Role.RoleType.SystemAdmin);
        privilegeList.add(new Function(1, "Network Admin Work Area", NetworkAdminWorkArea.class));
        privilegeList.add(new Function(2, "Hospital Work Area", HospitalWorkArea.class));
        privilegeList.add(new Function(3, "Funding Academic Medical Center Admin Work Area", FAMCAdminWorkArea.class));
        privilegeList.add(new Function(4, "Primary Care Admin Work Area", PrimaryCareWorkArea.class));
        privilegeList.add(new Function(5, "Supplier Work Area", SupplierWorkArea.class));
        privilegeList.add(new Function(6, "Doctor Work Area", DoctorWorkArea.class));
        privilegeList.add(new Function(7, "Care Team Work Area", CareTeamWorkArea.class));
        privilegeList.add(new Function(8, "Warehouse Admin Work Area", WarehouseWorkArea.class));
        privilegeList.add(new Function(9, "System Admin Work Area", SysAdminWorkArea.class));
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, Business business) {
         return new SysAdminWorkArea();  //To change body of generated methods, choose Tools | Templates.
    }
    
}
