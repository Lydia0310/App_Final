package org.yueli.userinterface.frame;

/**
 * Created by Yue Li on 11/30/2014/2014.
 */

import org.yueli.business.function.Function;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * @author zjy
 */
public class CloseButtonTabPanel extends JPanel {
    private final JLabel titleLabel;
    private final CloseButton closeButton;
    private final JTabbedPane tabbedPane;
    private final Function func;

    public CloseButtonTabPanel(String titleString, JTabbedPane tabbedPane, Function func) {
        super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        titleLabel = new JLabel(titleString);
        this.tabbedPane = tabbedPane;
        this.func = func;
        closeButton = new CloseButton();
        add(titleLabel);
        add(Box.createHorizontalStrut(10));
        add(closeButton);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setOpaque(false);
    }

    private class CloseButton extends JButton {
        public CloseButton() {
            setIcon(new ImageIcon("resource/close.png"));
            setPressedIcon(new ImageIcon("resource/close_pressed.png"));
            setRolloverIcon(new ImageIcon("resource/close_rollover.png"));
            setContentAreaFilled(false);
            setBorder(null);
            setBorderPainted(false);
            setFocusPainted(false);
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
//                    FunctionService functionService = (FunctionService) Service.getInstance(FunctionService.class);
//                    int onCloseReturnVal = functionService.closePanel(func.getFuncClass());
//                    func.setActivedTabIndex(-1);
//                    if (onCloseReturnVal < 0) {
//                    } else {
//                        tabbedPane.remove(tabbedPane.indexOfTabComponent(CloseButtonTabPanel.this));
//                        if (tabbedPane.getTabCount() == 0) {
//                            tabbedPane.addFunctionPanel("Home", new WelcomePanel());
//                        }
//                    }
                }
            });
        }
    }
}
