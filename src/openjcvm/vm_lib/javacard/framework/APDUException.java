package javacard.framework;

public class APDUException extends CardRuntimeException
{
	public static final short ILLEGAL_USE = 1;
	public static final short BUFFER_BOUNDS = 2;
	public static final short BAD_LENGTH = 3;
	public static final short IO_ERROR = 4;
	public static final short NO_T0_GETRESPONSE = 0xAA;
	public static final short T1_IFD_ABORT = 0xAB;

	public APDUException(short reason) 
	{		
	    super(reason);
	}
	
	public static void throwIt(short reason) 
	{	
	}
}

