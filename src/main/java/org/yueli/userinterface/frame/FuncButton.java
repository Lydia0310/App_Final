package org.yueli.userinterface.frame;

import  org.yueli.business.function.Function;
import org.yueli.userinterface.AppEntrance;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by zjy on 13-11-16.
 */
public class FuncButton extends JButton {
    private Function func;

    public FuncButton(final Function func) {
        this.func = func;
        this.setText(func.getDisplayName());
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                AppEntrance.getMainFrame().addFunctionPanel(func);
            }
        });
    }

    public Function getFunc() {
        return func;
    }

    public void setFunc(Function func) {
        this.func = func;
        this.setText(func.getDisplayName());
    }
}
