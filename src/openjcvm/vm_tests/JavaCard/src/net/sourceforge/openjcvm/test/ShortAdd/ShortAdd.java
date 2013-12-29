/*
 * Test Applet to verify openjcvm
 */
package net.sourceforge.openjcvm.test.ShortAdd;

import javacard.framework.*;

/**
 *
 * @author Lusing
 */
public class ShortAdd extends Applet {
    public ShortAdd(){
        
    }

    public static void install(byte[] bArray, short bOffset, byte bLength) {
        short a=1;
        short b=2;
        short c=(short)(a+b);
        		
        c++;
		
		int i1 = 10000;
		int i2 = 20000;
		int i3 = i1+i2;
		i3++;
        
        byte b1 = 3;
        byte b2 = -2;
        byte b3 = (byte)(b1 + b2);
        b3++;
        
        byte b4 = (byte)i3;
        
        short s1 = b4;
        int   i4 = s1;
        short s2 = (short)i4;
    }

    public void process(APDU apdu) {
    }
}
