/*
 * Test Applet to verify openjcvm
 */
package net.sourceforge.openjcvm.test.ShortApplet;

import javacard.framework.*;
import net.sourceforge.openjcvm.test.ShortLibrary.*;

/**
 *
 * @author Lusing
 */
public class ShortApplet extends Applet {
	
    public static void install(byte[] bArray, short bOffset, byte bLength) {
			ShortLibrary oLib = new ShortLibrary((short)10);
			short s = oLib.getValue();		 
			oLib.setValue((short)24);
    }

    public void process(APDU apdu) {
    }
}
