package javacard.framework;

public class SystemException extends CardRuntimeException
{
    public static final short ILLEGAL_AID           = (short)4;
    public static final short ILLEGAL_TRANSIENT     = (short)3;	
    public static final short ILLEGAL_VALUE         = (short)1;
    public static final short NO_RESOURCE           = (short)5;
    public static final short NO_TRANSIENT_SPACE    = (short)2;		

	public SystemException(short reason)
	{
		super(reason);
	}

	public static void throwIt(short reason) 
	{	
	}
}

