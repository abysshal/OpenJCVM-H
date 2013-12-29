/*
 * AID.java
 *
 * Created on 2007年12月1日, 下午8:28
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sourceforge.openjcvm.parser;

/**
 *
 * @author Louis
 */
public class AID {
    private byte[] baAID;
    int iAIDLength;
    
    /** Creates a new instance of AID */
    public AID(byte[] aid, int startPos, int length) {
        baAID= new byte[length];
        System.arraycopy(aid,startPos,baAID,0,length);
        iAIDLength=length;
    }
    
    public byte[] getAID(){
        return this.baAID;
    }
}
