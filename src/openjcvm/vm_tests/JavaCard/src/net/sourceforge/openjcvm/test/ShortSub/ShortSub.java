/*
 * Test Applet to verify openjcvm
 */
package net.sourceforge.openjcvm.test.ShortSub;

import javacard.framework.*;

/**
 *
 * @author Lusing
 */
public class ShortSub extends Applet {
    public ShortSub(){
        
    }

    public static void install(byte[] bArray, short bOffset, byte bLength) {
        short a=1;
        short b=2;
        short c=(short)(b-a);
        c++;

	int i1 = 100001;
	int i2 = 200003;
	int i3 = i2-i1;
	i3++;
    }

    public void process(APDU apdu) {
    }
}
