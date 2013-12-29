package net.sourceforge.openjcvm.test.ShortInstanceOf;

import javacard.framework.APDU;
import javacard.framework.Applet;
import javacard.framework.ISOException;

public class ShortInstanceOf extends Applet {
	public static final short ELEM_NUM = 9;
	
	public static void install(byte[] bArray, short bOffset, byte bLength){
		Object[] obj=new Object[ELEM_NUM];
		obj[0] = new short[10];
		obj[1] = new boolean[10];
		obj[2] = new byte[10];
		obj[3] = new Object();
		obj[4] = new ClassLevel1();
		obj[5] = new ClassLevel2();
		obj[6] = new ClassLevel3();
		obj[7] = new ClassLevel4();
		obj[8] = null;
		
		boolean[] bs1= new boolean[ELEM_NUM];
		boolean[] bs2= new boolean[ELEM_NUM];
		boolean[] bs3= new boolean[ELEM_NUM];
		boolean[] bs4= new boolean[ELEM_NUM];
		
		for(short s1=0;s1<obj.length;s1++){
			bs1[s1] = obj[s1] instanceof Object;
			bs2[s1] = obj[s1] instanceof ClassLevel1;
			bs3[s1] = obj[s1] instanceof InterfaceLevel1;
			bs4[s1] = obj[s1] instanceof Class2;
		}
	}
	
	public ShortInstanceOf(){
		
	}

	public void process(APDU apdu) throws ISOException {
		
	}
}
