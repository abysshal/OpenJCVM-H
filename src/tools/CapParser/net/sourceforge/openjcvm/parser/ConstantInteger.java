/*
 * ConstantInteger.java
 *
 * Created on 2007年12月1日, 下午9:12
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sourceforge.openjcvm.parser;

import java.io.*;
/**
 *
 * @author Louis
 */
public class ConstantInteger implements ConstPoolInfo{
    private int iInt;
    
    /** Creates a new instance of ConstantInteger */
    public ConstantInteger(int iInt) {
        this.setIInt(iInt);
    }
    
    public void output(FileWriter fw) throws IOException{
        
    }

    public int getIInt() {
        return iInt;
    }

    public void setIInt(int iInt) {
        this.iInt = iInt;
    }
    
}
