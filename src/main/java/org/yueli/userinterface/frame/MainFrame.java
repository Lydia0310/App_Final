package org.yueli.userinterface.frame;



import org.yueli.business.function.Function;
import org.yueli.userinterface.AppEntrance;

import javax.smartcardio.Card;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class MainFrame extends JFrame {

    private FirstPanel firstPanel;
    private JSplitPane verticalSplit;
    private JSplitPane horizontalSplit;
    private JPanel rightPanel;
    private JLabel infoLabel;
    private JPanel topBar;
    private JLabel topBarLoginUser;
    private JLabel topBarLoginRole;
    private JButton topBarLogout;
    private FuncButtonPanel funcButtonPanel;
    private Dimension windowSize = new Dimension(1200, 800);

    public static final Color blue = new Color(21, 127, 204);
    public static final Color gray = new Color(125, 125, 125);
    public static final Color black = new Color(0, 0, 0);
    public static final Color white = new Color(255, 255, 255);

    final private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    public MainFrame() throws HeadlessException {
        initComponents();
    }

    private void initComponents() {
        initMainFrame();
        initFuncPanel();
        initRightPanel();
        initTopBar();
        initHorizontalSplit();
        initVerticalSplit();
        add(verticalSplit, BorderLayout.CENTER);
    }

    private void initMainFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setMinimumSize(windowSize);
        setMaximumSize(windowSize);
        setPreferredSize(windowSize);
        //setMinimumSize(new Dimension((int) maxScreenSize.getWidth() - 100, (int) maxScreenSize.getHeight() - 100));
        //maxScreenSize mac device have problem: GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(this);
    }

    private void initFuncPanel() {
        funcButtonPanel = new FuncButtonPanel();
    }

    private void initRightPanel() {
        rightPanel = new JPanel(new CardLayout());
        
        Font buttonFont = new Font("Arial", Font.PLAIN, 12);
        final JButton collapseFuncTreeButton = new JButton("<<");
        collapseFuncTreeButton.setPreferredSize(new Dimension(20, 10));
        collapseFuncTreeButton.setFont(buttonFont);
        collapseFuncTreeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (funcButtonPanel.isVisible()) {
                    funcButtonPanel.setVisible(false);
                    collapseFuncTreeButton.setText(">>");
                } else {
                    funcButtonPanel.setVisible(true);
                    horizontalSplit.setDividerLocation(310);
                    collapseFuncTreeButton.setText("<<");
                }
            }
        });
        infoLabel = new JLabel();
        infoLabel.setPreferredSize(new Dimension(1000, 20));
    }

    private void initTopBar() {
        topBar = new JPanel();
        topBar.setMinimumSize(new Dimension(getWidth(), 80));
        topBar.setMaximumSize(new Dimension(getWidth(), 80));
        topBar.setBackground(blue);
        topBar.setLayout(new BoxLayout(topBar, BoxLayout.PAGE_AXIS));
        topBar.add(Box.createVerticalStrut(10));
        JPanel row1 = new JPanel();
        row1.setLayout(new BoxLayout(row1, BoxLayout.X_AXIS));
        row1.setBackground(blue);
        row1.add(Box.createHorizontalStrut(50));
        JLabel logo = new JLabel("Application Engineering & Development");
        logo.setForeground(white);
        logo.setFont(new Font("Arial", Font.PLAIN, 26));
        row1.add(logo);
        JPanel row2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        row2.setBackground(blue);
        row2.add(Box.createHorizontalStrut(30));
        JPanel row3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        row3.setBackground(blue);
        row3.add(Box.createHorizontalStrut(30));

//        redPointPanel = new RedPointPanel();
//        MessageService messageService = (MessageService)Service.getInstance(MessageService.class);
//        messageService.setRedPointPanel(redPointPanel);
//        redPointPanel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                appTab.setSelectedIndex(0);
//            }
//        });

        Font topBarInfoFont = new Font("Arial", Font.PLAIN, 12);
        topBarLoginUser = new JLabel();
        topBarLoginUser.setForeground(white);
        topBarLoginUser.setFont(topBarInfoFont);

        topBarLoginRole = new JLabel();
        topBarLoginRole.setForeground(white);
        topBarLoginRole.setFont(topBarInfoFont);

        topBarLogout = new JButton("Logout");
        topBarLogout.setBackground(blue);
        topBarLogout.setForeground(white);
        topBarLogout.setFocusPainted(false);
        topBarLogout.setPreferredSize(new Dimension(60, 20));
        topBarLogout.setBorder(BorderFactory.createLineBorder(white, 1));
        topBarLogout.setFont(topBarInfoFont);
        topBarLogout.addMouseListener(new MouseAdapter () {
            @Override
            public void mouseClicked(MouseEvent e) {
                logout();
            }
        });
        topBarLogout.setVisible(false);

        row1.add(Box.createHorizontalGlue());
        row1.add(topBarLoginUser);
        row1.add(Box.createHorizontalStrut(10));
        row1.add(topBarLoginRole);
        row1.add(Box.createHorizontalStrut(10));
        row1.add(Box.createHorizontalStrut(10));
        row2.add(topBarLogout);
        row2.add(Box.createHorizontalStrut(30));
        topBar.add(row1);
        topBar.add(row2);
    }

    private void initHorizontalSplit() {
        //horizontal split divide function tree and main panel
        horizontalSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, funcButtonPanel, rightPanel);
        horizontalSplit.setDividerLocation((int) (getWidth() * 0.15));
        horizontalSplit.setDividerSize(10);
        horizontalSplit.setDividerLocation(400);
    }

    private void initVerticalSplit() {
        firstPanel = new FirstPanel();
        verticalSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topBar, firstPanel);
        verticalSplit.setDividerLocation(80);
        verticalSplit.setDividerSize(5);
        verticalSplit.setEnabled(false);
    }

    public void addFunctionPanel(Function func) {
        rightPanel.removeAll();
        JPanel appPanel;
        try {
            appPanel = (JPanel)func.getClz().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return;
        }
        rightPanel.add(appPanel);
        ((CardLayout)rightPanel.getLayout()).next(rightPanel);
    }

    public void loginSuccess() {
        verticalSplit.setRightComponent(horizontalSplit);
        funcButtonPanel.refresh();
        topBarLogout.setVisible(true);
    }

    public void logout() {
        if (firstPanel == null)
            firstPanel = new FirstPanel ();
        topBarLogout.setVisible(false);
        AppEntrance.saveBusiness();
        verticalSplit.setRightComponent(firstPanel);
    }

    public JPanel getRightPanel() {
        return rightPanel;
    }
}
