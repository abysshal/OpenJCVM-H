package javacard.security;

import javacard.framework.CardRuntimeException;

public class CryptoException extends CardRuntimeException
{    	
	public static final short ILLEGAL_VALUE     = (short)1;
	public static final short UNINITIALIZED_KEY = (short)2;
	public static final short NO_SUCH_ALGORITHM = (short)3;
    public static final short INVALID_INIT      = (short)4;
    public static final short ILLEGAL_USE       = (short)5;

	public CryptoException(short reason) 
	{
		super(reason);
	}

	public static void throwIt(short reason) 
	{
	}
	
}

