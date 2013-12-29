/*
 * Test Applet to verify openjcvm
 */
package net.sourceforge.openjcvm.test.ShortNew;

import javacard.framework.*;

/**
 *
 * @author Lusing
 */
public class ShortNew extends Applet {
	private short sField1;
	private short sField2;
    public ShortNew(){
		sField1 = 2;
		sField2 = 10;
    }
	
	public short getField1(){
		return sField1;
	}
	
	public void setField2(short sValue){
		this.sField2 = sValue;
	}
	

    public static void install(byte[] bArray, short bOffset, byte bLength) {
		ShortNew oNew = new ShortNew();
		oNew.setField2((short)(oNew.getField1()*3));
    }

    public void process(APDU apdu) {
    }
}
