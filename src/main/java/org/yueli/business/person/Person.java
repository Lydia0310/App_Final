/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.person;

/**
 *
 * @author Lydia
 */
public class Person {
    private String firstName;
    private String lastName;
    private static int count = 0;
    private int personID;
    
    public Person(){
        count++;
        personID = count;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }
    
    @Override
    public String toString(){
        return String.valueOf(personID);
    }
}
