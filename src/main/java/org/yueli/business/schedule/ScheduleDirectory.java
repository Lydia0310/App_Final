/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.schedule;

import java.util.ArrayList;

/**
 *
 * @author Lydia
 */
public class ScheduleDirectory {
    private ArrayList<Schedule> scheduleList;
    
    public ScheduleDirectory(){
        scheduleList = new ArrayList<>();
    }

    public ArrayList<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(ArrayList<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }
    
    public Schedule addSchedule(Schedule schedule){
        scheduleList.add(schedule);
        return schedule;
    }
    
    public void removeSchedule(Schedule schedule){
        scheduleList.remove(schedule);
    }
}
