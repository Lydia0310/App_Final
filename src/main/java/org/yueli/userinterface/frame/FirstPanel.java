/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yueli.userinterface.frame;

import org.yueli.business.schedule.Schedule;
import org.yueli.userinterface.schedule.SchedulePanel;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

/**
 *
 * @author zjy
 */
public class FirstPanel extends JPanel {

    // private final LoginPanel loginPanel;
    private final JPanel loginPanel;
    private final String versionInfo = "Name: Yue Li          ver. 1.01";
    private SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public FirstPanel() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        loginPanel = new LoginPanel();
//        List<Schedule> scheduleList = new LinkedList<>();
//        try {
//            Schedule schedule1 = new Schedule(timeFormat.parse("2014-12-01 01:00:00"), timeFormat.parse("2014-12-01 03:00:00"),
//                    "test", ScheduleRequest.ScheduleType.Device);
//            Schedule schedule2 = new Schedule(timeFormat.parse("2014-12-01 05:00:00"), timeFormat.parse("2014-12-01 07:00:00"),
//                    "test", ScheduleRequest.ScheduleType.Device);
//            Schedule schedule3 = new Schedule(timeFormat.parse("2014-12-02 12:00:00"), timeFormat.parse("2014-12-02 18:00:00"),
//                    "test", ScheduleRequest.ScheduleType.Device);
//            Schedule schedule4 = new Schedule(timeFormat.parse("2014-12-03 05:00:00"), timeFormat.parse("2014-12-03 07:00:00"),
//                    "test", ScheduleRequest.ScheduleType.Device);
//            Schedule schedule5 = new Schedule(timeFormat.parse("2014-12-04 05:00:00"), timeFormat.parse("2014-12-04 07:00:00"),
//                    "test", ScheduleRequest.ScheduleType.Device);
//            Schedule schedule6 = new Schedule(timeFormat.parse("2014-12-05 05:00:00"), timeFormat.parse("2014-12-06 07:00:00"),
//                    "test", ScheduleRequest.ScheduleType.Device);
//            scheduleList.add(schedule1);
//            scheduleList.add(schedule2);
//            scheduleList.add(schedule3);
//            scheduleList.add(schedule4);
//            scheduleList.add(schedule5);
//            scheduleList.add(schedule6);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        loginPanel = new SchedulePanel(scheduleList);
        JLabel welcomeLabel = new JLabel("Welcome!   Please login.");
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 48));
        Box row1 = new Box(BoxLayout.LINE_AXIS);
        row1.add(Box.createHorizontalGlue());
        row1.add(welcomeLabel);
        row1.add(Box.createHorizontalGlue());

        Box row2 = new Box(BoxLayout.LINE_AXIS);
        row2.add(Box.createHorizontalGlue());
        row2.add(loginPanel);
        row2.add(Box.createHorizontalGlue());

        JLabel versionInfoLabel = new JLabel(versionInfo);
        versionInfoLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        Box row3 = new Box(BoxLayout.LINE_AXIS);
        row3.add(Box.createHorizontalGlue());
        row3.add(versionInfoLabel);
        row3.add(Box.createHorizontalStrut(100));

        add(Box.createVerticalStrut(50));
        add(row1);
        add(Box.createVerticalStrut(100));
        add(row2);
        add(Box.createVerticalGlue());
        add(row3);
        add(Box.createVerticalStrut(20));
    }

}
