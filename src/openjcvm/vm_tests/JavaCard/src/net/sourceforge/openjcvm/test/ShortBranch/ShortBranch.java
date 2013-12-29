/*
 * Test Applet to verify openjcvm
 */
package net.sourceforge.openjcvm.test.ShortBranch;

import javacard.framework.*;

/**
 *
 * @author Lusing
 */
public class ShortBranch extends Applet {
    public ShortBranch(){
        
    }

    public static void install(byte[] bArray, short bOffset, byte bLength) {
        short a = 0;
        short b = 0;
        
        if(a<1){
        	b++;
        }     
        else{
        	b--;
        }   
    }

    public void process(APDU apdu) {
    }
}
