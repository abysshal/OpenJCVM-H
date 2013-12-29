package javacard.framework;

public class UserException extends CardException 
{

	public UserException() 
	{
		super((short)0);
	}
	
	public UserException(short reason) 
	{
		super(reason);
	}

	public static void throwIt(short reason) throws UserException 
	{	
	}
}

