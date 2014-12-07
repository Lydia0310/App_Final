package org.yueli.userinterface.frame;


import org.yueli.business.function.Function;
import org.yueli.business.role.SystemAdminRole;

import javax.swing.*;
import java.awt.*;
import java.util.List;


/**
 * Created by zjy on 13-11-16.
 */
public class FuncButtonPanel extends JPanel {

    private JScrollPane scrollPane;
    private JPanel funcPanel;
    private Dimension buttonPanelSize = new Dimension(350, 60);

    public FuncButtonPanel() {
        initComponent();
    }

    private void initComponent () {
        this.setLayout(new BorderLayout());
        funcPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(funcPanel, BoxLayout.PAGE_AXIS);
        funcPanel.setLayout(boxLayout);
        scrollPane = new JScrollPane(funcPanel);
        this.add(scrollPane);
    }

    public void refresh (List<Function> funcList) {
        funcPanel.removeAll();
        if (funcList == null || funcList.size() == 0)
            return;
//        SystemAdminRole systemAdminRole = new SystemAdminRole();
//        List<Function> funcList = systemAdminRole.getPrivilegeList();
        for (Function func : funcList) {
            JPanel buttonPanel = new JPanel(new BorderLayout());
            buttonPanel.setBorder(BorderFactory.createEmptyBorder(8, 20, 8, 20));
            buttonPanel.setMaximumSize(buttonPanelSize);
            buttonPanel.setPreferredSize(buttonPanelSize);
            FuncButton funcButton = new FuncButton(func);
            funcButton.setFont(new Font("Arial", Font.BOLD, 18));
            funcButton.setToolTipText(func.getDisplayName());
            buttonPanel.add(funcButton, BorderLayout.CENTER);
            funcPanel.add(buttonPanel);
        }
    }

}
