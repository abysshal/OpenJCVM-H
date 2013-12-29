/*
 * Test Applet to verify openjcvm
 */
package net.sourceforge.openjcvm.test.ShortDiv;

import javacard.framework.*;

/**
 *
 * @author Lusing
 */
public class ShortDiv extends Applet {
    public ShortDiv(){
        
    }

    public static void install(byte[] bArray, short bOffset, byte bLength) {
        short a=200;
        short b=10;
        short c=(short)(a/b);
        c++;

	int i1 = 100001;
	int i2 = 2000020;
	int i3 = i2/i1;
	i3++;
    }

    public void process(APDU apdu) {
    }
}
