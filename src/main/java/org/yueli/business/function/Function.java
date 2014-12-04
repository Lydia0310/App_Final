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
    private Class clz;
    private int functionId;
    private int activatedTabIndex = -1;

    public Function(int functionId, String displayName, Class clz){
        this.displayName = displayName;
        this.clz = clz;
        this.functionId = functionId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Class getClz() {
        return clz;
    }

    public void setClz(Class clz) {
        this.clz = clz;
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
