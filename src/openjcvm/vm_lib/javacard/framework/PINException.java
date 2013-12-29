package javacard.framework;

public class PINException extends CardRuntimeException
{
	public static final short  ILLEGAL_VALUE   = (short)0x0001;

	public PINException(short reason) 
	{
		super(reason);
	}

	public static void throwIt(short reason) 
	{	
	}
}

