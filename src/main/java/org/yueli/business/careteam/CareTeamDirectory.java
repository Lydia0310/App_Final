/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.careteam;

import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public class CareTeamDirectory {
    private ArrayList<CareTeam> careTeamList;
    
    public CareTeamDirectory(){
        careTeamList = new ArrayList<>();
    }

    public ArrayList<CareTeam> getCareTeamList() {
        return careTeamList;
    }

    public void setCareTeamList(ArrayList<CareTeam> careTeamList) {
        this.careTeamList = careTeamList;
    }
    
    public CareTeam addCareTeam(){
        CareTeam careTeam = new CareTeam();
        careTeamList.add(careTeam);
        return careTeam;
        
    }
}
