/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.userinterface.frame;


import javax.swing.*;

/**
 *
 * @author Yue Li
 */
public class WelcomePanel extends JPanel {

    private JLabel welcomeLabel;

    //private AccountService accountService;
    /**
     * Creates new form WelcomePanel
     */
    public WelcomePanel() {
        //accountService = (AccountService) Service.getInstance(AccountService.class);
        initComponents();
    }

    private void initComponents() {
//        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
//        this.setLayout(boxLayout);
//        this.add(Box.createVerticalStrut(50));
//        JPanel row1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
//        String loginPerson = accountService.getLoginPerson().getPersonName();
//        if (loginPerson != null)
//            welcomeLabel = new JLabel("Welcome! " + loginPerson);
//        row1.add(Box.createHorizontalStrut(50));
//        row1.add(welcomeLabel);
//        welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 48));
//        this.add(row1);
//        MessagePanel messagePanel = new MessagePanel();
//        this.add(messagePanel);
//        MessageService messageService = (MessageService) Service.getInstance(MessageService.class);
//        messageService.setMessagePanel(messagePanel);
//        this.add(Box.createVerticalGlue());
    }
}
