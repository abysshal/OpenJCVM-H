/*
 * MethodInfo.java
 *
 * Created on 2007年12月1日, 下午10:49
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sourceforge.openjcvm.parser;

/**
 *
 * @author Louis
 */
public class MethodInfo {
    
    protected byte bToken;
    protected int iAccessFlag;
    protected int iNameIndex;
    protected int iDescriptorIndex;
    
    private String sMethodName;
    
    /** Creates a new instance of MethodInfo */
    public MethodInfo() {
    }
    
    public void setMethodName(String sMethodName){
        this.sMethodName=sMethodName;
    }
    
    public String toString(){
        return this.sMethodName;
    }
}
