/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import business.person.Person;
import business.role.SystemAdminRole;
import business.useraccount.UserAccount;

/**
 *
 * @author Lydia
 */
public class ConfigureABusiness {
    public static Business configure(){
    
        Business system = Business.getInstance();
        
        Person person = new Person();
        UserAccount userAccount = new UserAccount();
        userAccount.setPerson(person);
        userAccount.getPerson().setFirstName("Yue");
        userAccount.getPerson().setLastName("Li");
        userAccount.setUsername("sysadmin");
        userAccount.setPassword("sysadmin");
        userAccount.setRole(new SystemAdminRole());
        
        system.getPersonDirectory().getPersonList().add(person);
        system.getUserAccountDirectory().getUserAccountList().add(userAccount);
       
        return system;
    }
}












