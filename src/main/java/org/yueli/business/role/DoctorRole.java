/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.role;

import org.yueli.business.Business;
import javax.swing.JPanel;
import org.yueli.business.enterprise.Enterprise;
import org.yueli.business.function.Function;
import org.yueli.business.network.Network;
import org.yueli.business.organization.Organization;
import org.yueli.business.patient.PatientDirectory;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.userinterface.doctorworkarea.DoctorWorkArea;

/**
 *
 * @author Lydia
 */
public class DoctorRole extends Role{
    private String doctorID;
    private String doctorName;
    private static int count;
    private PatientDirectory patientDirectory;
    
    public DoctorRole(){
        super(Role.RoleType.Doctor);
        privilegeList.add(new Function(6, "Doctor Work Area",DoctorWorkArea.class));
        count++;
        doctorID = String.valueOf(count);
        patientDirectory = new PatientDirectory();
    }

    public String getDocotorID() {
        return doctorID;
    }

    public void setDocotorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, Business business) {
        return new DoctorWorkArea();
    }


    
    
}
