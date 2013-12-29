/*
 * ConstantUtf8.java
 *
 * Created on 2007年12月1日, 下午2:04
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
public class ConstantUtf8 implements ConstPoolInfo{
    private String sUtf8;
    private char[] caUtf8;
    
    /** Creates a new instance of ConstantUtf8 */
    public ConstantUtf8(byte[] baUtf8) {
        for(int i=0;i<baUtf8.length;i++){
            caUtf8[i]=(char)baUtf8[i];
        }
        sUtf8=new String(caUtf8);
    }
    
    public ConstantUtf8(byte[] baUtf8,int startPos,int length){
        caUtf8=new char[length];
        for(int i=0;i<length;i++){
            caUtf8[i]=(char)baUtf8[i+startPos];
        }
        sUtf8=new String(caUtf8);
    }
    
    public String toString(){
        return sUtf8;
    }
    
    public void output(FileWriter fw) throws IOException{
        fw.write("Constant Utf8: "+sUtf8+"\n");
    }
}
