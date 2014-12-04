/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yueli.business.function;

/**
 *
 * @author Lydia
 */
public class Function {
    private String displayName;
    private String className;
    private int functionId;
    private int activatedTabIndex;

    public Function(int functionId, String displayName, String className){
        this.displayName = displayName;
        this.className = className;
        this.functionId = functionId;
    }
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getActivatedTabIndex() {
        return activatedTabIndex;
    }

    public void setActivatedTabIndex(int activatedTabIndex) {
        this.activatedTabIndex = activatedTabIndex;
    }

    public int getFunctionId() {
        return functionId;
    }

    public void setFunctionId(int functionId) {
        this.functionId = functionId;
    }
}
