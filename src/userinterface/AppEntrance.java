package userinterface;


import business.Business;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import userinterface.frame.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by zjy on 11/9/14.
 */
public class AppEntrance {
    private static File file = new File("db/object.json");
    private static ObjectMapper mapper = new ObjectMapper();
    private static Business business;

    public static void main(String[] args) {
        getBusiness();
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

    public static Business getBusiness () {
        if(!file.exists() || !file.isFile()){
            return null;
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(df);
        if (business == null) {
            try {
                business = mapper.readValue(file, Business.class);
                return business;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return business;
        }
    }

    public static void saveBusiness () {
        try {
            byte[] output = mapper.writeValueAsBytes(business);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static MainFrame getMainFrame () {
        if (mainFrame == null) {
            mainFrame = new MainFrame();
        }
        return mainFrame;
    }
}
