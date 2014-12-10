/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.careteam;

/**
 *
 * @author Lydia
 */
public class CareTeam {
    private String careTeamID;
    private String careTeamName;
    private static int count;
    
    public CareTeam(){
        count++;
        careTeamID = String.valueOf(count);
    }

    public String getCareTeamID() {
        return careTeamID;
    }

    public void setCareTeamID(String careTeamID) {
        this.careTeamID = careTeamID;
    }

    public String getCareTeamName() {
        return careTeamName;
    }

    public void setCareTeamName(String careTeamName) {
        this.careTeamName = careTeamName;
    }
    
    @Override
    public String toString(){
        return careTeamID;
    }
}
