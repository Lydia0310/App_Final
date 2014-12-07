package org.yueli.userinterface;


import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import org.yueli.business.Business;
import org.yueli.business.ConfigureABusiness;
import org.yueli.business.useraccount.UserAccount;
import org.yueli.userinterface.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zjy on 11/9/14.
 */
public class AppEntrance {
    private static Business business;
    private static UserAccount loginUser;
    private static final String FILENAME = "db/database.db4o"; // path to the data store

    public static void main(String[] args) {
        getBusiness();
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Font font16 = new Font("Arial", Font.PLAIN, 16);
                UIManager.put("Button.font", font16);
                UIManager.put("Label.font", font16);
                UIManager.put("TabbedPane.font", font16);
                AppEntrance.getMainFrame().setVisible(true);
            }
        });
    }

    private static MainFrame mainFrame;

    public static Business getBusiness() {
        if (business == null) {
            ObjectContainer objectContainer = createDb40Connection();
            ObjectSet<Business> businesses = objectContainer.query(Business.class);
            if (businesses.size() == 0) {
                business = ConfigureABusiness.configure();  // If there's no System in the record, create a new one
            } else {
                business = businesses.get(businesses.size() - 1);
            }
            business.setName("Business");
            objectContainer.close();
            return business;
        } else {
            return business;
        }
    }

    private static ObjectContainer createDb40Connection() {
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        config.common().add(new TransparentPersistenceSupport());
        //Controls the number of objects in memory
        config.common().activationDepth(Integer.MAX_VALUE);
        //Controls the depth/level of updation of Object
        config.common().updateDepth(Integer.MAX_VALUE);
        //Register your top most Class here
        config.common().objectClass(Business.class).cascadeOnUpdate(true); // Change to the object you want to save
        ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
        return db;
    }

    public static void saveBusiness() {
        ObjectContainer conn = createDb40Connection();
        conn.store(business);
        conn.commit();
        conn.close();
    }

    public static MainFrame getMainFrame() {
        if (mainFrame == null) {
            mainFrame = new MainFrame();
        }
        return mainFrame;
    }

    public static UserAccount getLoginUser() {
        return loginUser;
    }

    public static void setLoginUser(UserAccount loginUser) {
        AppEntrance.loginUser = loginUser;
    }

    public static JPanel getSlide() {
        return mainFrame.getRightPanel();
    }
}
