/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.patient;

/**
 *
 * @author Lydia
 */
public class Patient {
    private String patientID;
    private String patientName;
    private static int count;
    
    public Patient(){
        count++;
        patientID = String.valueOf(count);
    }
    
    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
    
}
