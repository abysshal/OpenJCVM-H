package javacard.framework;

public class ISOException extends CardRuntimeException 
{

	public ISOException(short sw) 
	{
		super(sw);
	}

	public static void throwIt(short sw) 
	{	    
	}
}

