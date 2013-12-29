/*
 * Test java.lang package.
 */
package net.sourceforge.openjcvm.test.JavaLang;

import javacard.framework.*;

public class JavaLang extends Applet {
	
	public static void install(byte[] bArray, short bOffset, byte bLength){
		Object o1 = new Object();
		Object o2 = new Object();
		
		short sValue = 0;
		
		if(!o1.equals(o2)){
			sValue++;			
		}
		
		if(o1.equals(o1)){
			sValue++;
		}
		
		Object o1_1 = o1;
		Object o1_2 = o1;
		
		if(o1_1.equals(o1_2)){
			sValue++;
		}
		
		if(o1_2.equals(o1_1)){
			sValue++;
		}
		
		if(o1_1==o1_2){
			sValue++;
		}
		
		if(!o1.equals(null)){
			sValue++;
		}
	}

	public void process(APDU apdu) throws ISOException {
		
	}

}
