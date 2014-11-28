/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yueli.userinterface.frame;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author zjy
 */
public class FirstPanel extends JPanel {

    private final LoginPanel loginPanel;
    private Graphics2D paint;
    private final String versionInfo = "Name: Yue Li          ver. 1.01";

    public FirstPanel() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        loginPanel = new LoginPanel();
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
        add(Box.createVerticalStrut(50));
    }

}
