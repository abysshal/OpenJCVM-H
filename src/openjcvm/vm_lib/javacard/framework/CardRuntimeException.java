package javacard.framework;

public class CardRuntimeException extends RuntimeException 
{	
	public CardRuntimeException(short reason)
	{		
	}

	public short getReason() 
	{
	    return 0;
	}
	
	public void setReason(short reason) 
	{	
	}

	public static void throwIt(short reason) throws CardRuntimeException 
	{
	}     
}
