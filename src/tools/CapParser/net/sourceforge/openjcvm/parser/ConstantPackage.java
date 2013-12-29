/*
 * ConstantPackage.java
 *
 * Created on 2007年12月1日, 下午6:13
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
public class ConstantPackage implements ConstPoolInfo{
    
    private byte   flag;
    protected int    nameIndex;
    private Version version;
    private AID     aid;
            
    /** Creates a new instance of ConstantPackage */
    public ConstantPackage() {
    }
    
    public void output(FileWriter fw) throws IOException{
        
    }

    public byte getFlag() {
        return flag;
    }

    public void setFlag(byte flag) {
        this.flag = flag;
    }

    public AID getAid() {
        return aid;
    }

    public void setAid(AID aid) {
        this.aid = aid;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }
}
