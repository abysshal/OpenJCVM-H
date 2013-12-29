package javacard.framework;

public class CardException extends Exception {
    		
	public CardException(short reason) 
	{		
	}

	public short getReason() 
	{
	    return 0;
	}
	 
	public void setReason(short reason) 
	{		
	}
	
	public static void throwIt(short reason) throws CardException 
	{	    
	}
}
