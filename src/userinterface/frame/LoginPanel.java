package userinterface.frame;


import userinterface.AppEntrance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Zhang Junyan on 11/19/2014/2014.
 */
public class LoginPanel extends JPanel {
    private JTextField userNameField;
    private JTextField passwordField;

    public LoginPanel() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setBorder(BorderFactory.createLineBorder(MainFrame.blue, 2));
        setPreferredSize(new Dimension(400, 300));
        setMaximumSize(new Dimension(400, 300));
        setMinimumSize(new Dimension(400, 300));

        add(Box.createVerticalStrut(100));
        JLabel userNameLabel = new JLabel("Name: ");
        JLabel passwordLabel = new JLabel("Password: ");
        userNameLabel.setMaximumSize(new Dimension(100, 60));
        passwordLabel.setMaximumSize(new Dimension(100, 60));
        userNameField = new JTextField();
        passwordField = new JPasswordField();
        userNameField.setMaximumSize(new Dimension(200, 60));
        passwordField.setMaximumSize(new Dimension(200, 60));
        Box row1 = new Box(BoxLayout.LINE_AXIS);
        Box row2 = new Box(BoxLayout.LINE_AXIS);
        Box row3 = new Box(BoxLayout.LINE_AXIS);
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

        add(row1);
        add(Box.createVerticalGlue());
        add(row2);
        add(Box.createVerticalStrut(30));
        add(row3);
        add(Box.createVerticalStrut(30));
    }

    private void loginButtonClicked () {
        AppEntrance.getMainFrame().loginSuccess();
    }
}
