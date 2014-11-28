/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.organization;

import business.role.Role;
import business.role.WarehouseAdmin;
import java.util.ArrayList;




/**
 *
 * @author Lydia
 */
public class WarehouseOrganization extends Organization{
    public WarehouseOrganization(){
        super(Type.Warehouse.getValue());
    }

   

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new WarehouseAdmin());
        return roles;
    }
}
