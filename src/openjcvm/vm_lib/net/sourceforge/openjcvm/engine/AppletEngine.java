package net.sourceforge.openjcvm.engine;

import javacard.framework.*;
import javacard.framework.Applet;
import javacard.framework.ISOException;

public class AppletEngine extends Applet {
	
    public static void install(byte buffer[],short offset, byte length) throws ISOException{
    	//OpenjcvmRegistry.processAPDU(buffer,offset,length);
    	OpenjcvmRegistry.processAPDUOneApplet();
    }

	public void process(APDU apdu) throws ISOException {
		return;
	}

}
