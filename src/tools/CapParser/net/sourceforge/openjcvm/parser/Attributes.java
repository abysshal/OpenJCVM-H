/*
 * Attributes.java
 *
 * Created on 2007年12月1日, 下午10:55
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sourceforge.openjcvm.parser;

/**
 *
 * @author Louis
 */
public class Attributes {
    private int attrNameIndex;
    private int attrLength;
    private byte[] baInfo;
    private String sAttrName;
    
    /** Creates a new instance of Attributes */
    public Attributes(int attrNameIndex, int attrLength) {
        this.attrNameIndex=attrNameIndex;
        this.attrLength=attrLength;
    }
    
    public void copyInfoData(byte[] baSrcData, int iPos){
        System.arraycopy(baSrcData, iPos, baInfo, 0,getAttrLength());
    }
    
    public void getInfoData(byte[] baDstData, int iPos){
        System.arraycopy(baInfo, 0, baDstData, iPos,getAttrLength());
    }

    public int getAttrLength() {
        return attrLength;
    }

    public int getAttrNameIndex() {
        return attrNameIndex;
    }
    
    public void setAttrName(String sAttrName){
        this.sAttrName=sAttrName;
    }
    
    public String toString(){
        return this.sAttrName;
    }
}
