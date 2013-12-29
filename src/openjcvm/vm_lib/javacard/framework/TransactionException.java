package javacard.framework;

public class TransactionException extends CardRuntimeException
{
    public static final short IN_PROGRESS       = (short)1;
    public static final short NOT_IN_PROGRESS   = (short)2;
    public static final short BUFFER_FULL       = (short)3;
    public static final short INTERNAL_FAILURE  = (short)4;

	public TransactionException(short reason) 
	{
		super(reason);
	}

	public static void throwIt(short reason) 
	{	   
	}
}

