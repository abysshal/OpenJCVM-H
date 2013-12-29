/*
 * Test Applet to verify openjcvm
 */
package net.sourceforge.openjcvm.test.ShortMul;

import javacard.framework.*;

/**
 *
 * @author Lusing
 */
public class ShortMul extends Applet {
    public ShortMul(){
        
    }

    public static void install(byte[] bArray, short bOffset, byte bLength) {
        short a=100;
        short b=200;
        short c=(short)(a*b);
        c++;

        int i1 = 1001;
        int i2 = 2003;
        int i3 = i1*i2;
        i3++;
    }

    public void process(APDU apdu) {
    }
}
