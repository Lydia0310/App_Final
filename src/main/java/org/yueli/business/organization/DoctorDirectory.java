/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.organization;

import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public class DoctorDirectory {
    private ArrayList<DoctorOrganization> doctorList;
    
    public DoctorDirectory(){
        doctorList = new ArrayList<>();
    }

    public ArrayList<DoctorOrganization> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<DoctorOrganization> doctorList) {
        this.doctorList = doctorList;
    }
    
    public DoctorOrganization addDoctor(){
        DoctorOrganization doctorOrganization = new DoctorOrganization();
        doctorList.add(doctorOrganization);
        return doctorOrganization;
    }
}
