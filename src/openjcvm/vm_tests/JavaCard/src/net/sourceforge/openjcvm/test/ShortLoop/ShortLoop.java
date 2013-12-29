/*
 * Test Applet to verify openjcvm
 */
package net.sourceforge.openjcvm.test.ShortLoop;

import javacard.framework.*;

/**
 *
 * @author Lusing
 */
public class ShortLoop extends Applet {
    public ShortLoop(){
        
    }

    public static void install(byte[] bArray, short bOffset, byte bLength) {
        short a = 0;
        for(short s=0;s<10;s++)
        {
            a+=s;
        }   
    }

    public void process(APDU apdu) {
    }
}
