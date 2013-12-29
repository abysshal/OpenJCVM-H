/*
 * Test Applet to verify openjcvm
 */
package net.sourceforge.openjcvm.test.ShortStatic;

import javacard.framework.*;

/**
 *
 * @author Lusing
 */
public class ShortStatic extends Applet {
    public static short s1 = 0;
    public static short s2 = 1;
    public static short s3 = 257;
    public ShortStatic(){
                
    }

    public static void install(byte[] bArray, short bOffset, byte bLength) {
        s1 += s2;
        s3 += s1;
    }

    public void process(APDU apdu) {
    }
}
