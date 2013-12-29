package net.sourceforge.openjcvm.test.TestJCFramework;

import javacard.framework.APDU;
import javacard.framework.Applet;
import javacard.framework.ISOException;

public class TestJCF extends Applet {
	public static void install(byte[] bArray, short bOffset, byte bLength){
		new TestJCF();
	}
	
	private TestJCF(){
		this.register();
	}

	public void process(APDU apdu) throws ISOException {
		short s1 = 2;
		short s2 = 3;
		
		short s3 = (short)(s1 + s2);
		s3++;
	}
}
