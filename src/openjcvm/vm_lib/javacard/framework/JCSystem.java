package javacard.framework;

import java.lang.Object;

public final class JCSystem
{    
    public static final byte CLEAR_ON_DESELECT  = (byte)0x02;
    public static final byte CLEAR_ON_RESET     = (byte)0x01;
    public static final byte NOT_A_TRANSIENT_OBJECT  = (byte)0x00;
    
	static final short JAVA_CARD_VERSION = 0x0201;
	static final short CARD_COMMIT_CAPACITY = 0x100;

	JCSystem() 
	{
	}

    public static byte isTransient(Object theObj)
    {
	    return 0;
	}
	
	public static boolean[] makeTransientBooleanArray(short length,byte event) throws SystemException
    {
	    return null;
	}                                                                
    
    public static byte[] makeTransientByteArray(short length,byte event) throws SystemException
    {
	    return null;
	}                                                                
    
    public static short[] makeTransientShortArray(short length,byte event) throws SystemException
    {
	    return null;
	}																
     
    public static Object[] makeTransientObjectArray(short length,byte event) throws SystemException
    {
	    return null;
	}																
    
    public static short getVersion()
    {
		return 0;
	}
    
    public static AID getAID()
    {
	    return null;
	}
	
	public static AID lookupAID(byte[] buffer,short offset,byte length)
    {
	    return null;
	}                                          
	
	public static void beginTransaction() throws TransactionException
	{	 
	}
	
	public static void abortTransaction() throws TransactionException
	{	 
	}
	  
	public static void commitTransaction() throws TransactionException
	{	 
	}
	 
    public static byte getTransactionDepth()
    {
	    return 0;
	}
	
	public static short getUnusedCommitCapacity()
	{
	    return 0;
	}
	
	public static short getMaxCommitCapacity() 
	{
		return 0;
	}
	 
    public static AID getPreviousContextAID()
    {
	    return null;
	}
	     
    public static Shareable getAppletShareableInterfaceObject(AID serverAID,byte parameter)
    {
		return null;
    }		
}
