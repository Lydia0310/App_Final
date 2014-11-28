package userinterface.frame;


import javax.swing.*;
import java.awt.*;


/**
 * Created by zjy on 13-11-16.
 */
public class FuncButtonPanel extends JPanel{

    private JScrollPane scrollPane;
    private JPanel funcPanel;
    //private PersistenceService persistenceService;
    private Dimension folderPanelSize = new Dimension(300, 60);
    private Dimension buttonPanelSize = new Dimension(300, 100);

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

//    public void refresh () {
//        funcPanel.removeAll();
//        //persistenceService = (PersistenceService)Service.getInstance(PersistenceService.class);
//        FunctionService functionService = (FunctionService) Service.getInstance(FunctionService.class);
//        functionService.refreshFuncList();
//        List<Function> funcList = functionService.getFuncList();
//        for (Function func : funcList) {
//            if (func.getFuncType() == Function.FOLDER) {
//                JPanel folderPanel = new JPanel(new BorderLayout());
//                folderPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));
//                folderPanel.setMaximumSize(folderPanelSize);
//                folderPanel.setPreferredSize(folderPanelSize);
//                JLabel folderName = new JLabel(func.getFuncName());
//                folderName.setToolTipText(func.getFuncName());
//                folderName.setFont(new Font("Arial", Font.BOLD, 18));
//                folderPanel.add(folderName, BorderLayout.CENTER);
//                funcPanel.add(folderPanel);
//            } else if (func.getFuncType() == Function.LEAF) {
//                JPanel buttonPanel = new JPanel(new BorderLayout());
//                buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));
//                buttonPanel.setMaximumSize(buttonPanelSize);
//                buttonPanel.setPreferredSize(buttonPanelSize);
//                FuncButton funcButton = new FuncButton(func);
//                funcButton.setToolTipText(func.getFuncName());
//                buttonPanel.add(funcButton, BorderLayout.CENTER);
//                funcPanel.add(buttonPanel);
//            } else {
//                //other type
//            }
//        }
//    }

}
