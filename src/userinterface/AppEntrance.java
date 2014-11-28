package userinterface;


import userinterface.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zjy on 11/9/14.
 */
public class AppEntrance {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Font font16 = new Font("Arial",Font.PLAIN, 16);
                UIManager.put("Button.font", font16);
                UIManager.put("Label.font", font16);
                UIManager.put("TabbedPane.font", font16);

                AppEntrance.getMainFrame().setVisible(true);
            }
        });
    }

    private static MainFrame mainFrame;

    public static MainFrame getMainFrame () {
        if (mainFrame == null) {
            mainFrame = new MainFrame();
        }
        return mainFrame;
    }
}
