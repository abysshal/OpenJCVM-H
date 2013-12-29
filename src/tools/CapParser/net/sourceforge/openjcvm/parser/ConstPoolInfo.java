/*
 * ConstPoolInfo.java
 *
 * Created on 2007年12月1日, 下午1:26
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
public interface ConstPoolInfo {
        
    static final byte CONSTANT_Package  = (byte)13;
    static final byte CONSTANT_Classref = (byte)7;
    static final byte CONSTANT_Integer  = (byte)3;
    static final byte CONSTANT_Utf8     = (byte)1;
    
    public void output(FileWriter fw) throws IOException;
}
