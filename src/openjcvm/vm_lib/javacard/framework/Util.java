package javacard.framework;

import java.lang.Object;

public class Util extends Object
{
	Util() {
	}
   
    public static final short arrayCopy(byte src[],short srcOff,byte dest[],short destOff,short length) throws ArrayIndexOutOfBoundsException, NullPointerException, TransactionException
	{
	    return 0;
	}

    public static final short arrayCopyNonAtomic (byte src[],short srcOff,byte dest[],short destOff,short length) throws ArrayIndexOutOfBoundsException, NullPointerException
	{
	    return 0;
	}
   
    public static final short arrayFillNonAtomic(byte[] bArray,short bOff,short bLen,byte bValue) throws ArrayIndexOutOfBoundsException, NullPointerException
	{
	    return 0;
	}
    
    public static final byte arrayCompare(byte src[],short srcOff,byte dest[],short destOff,short length) throws ArrayIndexOutOfBoundsException, NullPointerException
    {
	    return 0;
	}													

    public static final short makeShort(byte b1,byte b2)
	{
	    return 0;
	}
	
    public static final short getShort(byte bArray[],short bOff)
    {
	    return 0;
	}													
	
    public static final short setShort(byte bArray[],short bOff,short sValue) throws TransactionException
	{
	    return 0;
	}
}
