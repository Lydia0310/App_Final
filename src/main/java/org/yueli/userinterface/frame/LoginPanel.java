package org.yueli.userinterface.frame;


import org.yueli.business.useraccount.UserAccount;
import org.yueli.userinterface.AppEntrance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.zip.InflaterOutputStream;

/**
 * Created by Zhang Junyan on 11/19/2014/2014.
 */
public class LoginPanel extends JPanel {
    private JTextField userNameField;
    private JTextField passwordField;
    private JLabel infoLabel;

    public LoginPanel() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setBorder(BorderFactory.createLineBorder(MainFrame.blue, 2));
        setPreferredSize(new Dimension(400, 300));
        setMaximumSize(new Dimension(400, 300));
        setMinimumSize(new Dimension(400, 300));

        add(Box.createVerticalStrut(100));
        JLabel userNameLabel = new JLabel("Name: ");
        JLabel passwordLabel = new JLabel("Password: ");
        infoLabel = new JLabel("Login Failed.");
        infoLabel.setVisible(false);
        userNameLabel.setMaximumSize(new Dimension(100, 60));
        passwordLabel.setMaximumSize(new Dimension(100, 60));
        userNameField = new JTextField();
        passwordField = new JPasswordField();
        userNameField.setMaximumSize(new Dimension(200, 60));
        passwordField.setMaximumSize(new Dimension(200, 60));
        Box row1 = new Box(BoxLayout.LINE_AXIS);
        Box row2 = new Box(BoxLayout.LINE_AXIS);
        Box row3 = new Box(BoxLayout.LINE_AXIS);
        Box row4 = new Box(BoxLayout.LINE_AXIS);
        row1.setMaximumSize(new Dimension(400, 60));
        row2.setMaximumSize(new Dimension(400, 60));
        row1.add(Box.createHorizontalStrut(50));
        row1.add(userNameLabel);
        row1.add(userNameField);
        row1.add(Box.createHorizontalStrut(50));

        row2.add(Box.createHorizontalStrut(50));
        row2.add(passwordLabel);
        row2.add(passwordField);
        row2.add(Box.createHorizontalStrut(50));

        row3.add(Box.createHorizontalStrut(250));
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginButtonClicked();
            }
        });
        loginButton.setMinimumSize(new Dimension(100, 50));
        row3.add(loginButton);
        row3.add(Box.createHorizontalStrut(50));

        row4.add(infoLabel);

        add(row1);
        add(Box.createVerticalStrut(20));
        add(row2);
        add(Box.createVerticalGlue());
        add(row4);
        add(row3);
        add(Box.createVerticalStrut(30));
    }

    private void loginButtonClicked () {
        UserAccount userAccount = AppEntrance.getBusiness().getUserAccountDirectory()
                .authenticateUser(userNameField.getText(), passwordField.getText());
        if (userAccount == null) {
            // login failed
            infoLabel.setVisible(true);
            return;
        } else {
            // login success
            userAccount.initialize();
            AppEntrance.setLoginUser(userAccount);
            AppEntrance.getMainFrame().loginSuccess();
        }

    }
}
