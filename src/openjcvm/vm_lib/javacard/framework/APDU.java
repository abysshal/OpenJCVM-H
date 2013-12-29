package javacard.framework;

public final class APDU extends Object
{   
        
    public static final byte PROTOCOL_T0 = 0;
    public static final byte PROTOCOL_T1 = 1;  
    
    private byte[] apduBuffer;
    
	APDU(byte[] aBuffer) {
		this.apduBuffer = aBuffer;
	}    
	
	public byte[] getBuffer()
	{
	    return this.apduBuffer;
	}

    public static short	getInBlockSize () 
    {
        return 0;
    }
    
    public static short	getOutBlockSize () 
    {
        return 0;
	}
    
    public static byte getProtocol()
    {
	    return 0;
	}
    
    public byte	getNAD() 
    {
	    return 0;
	}
    
    public short setOutgoing() throws APDUException 
    {        
        return 0;
    }
    
    public short setOutgoingNoChaining() throws APDUException 
    {        
        return 0;
    }
    
    public void setOutgoingLength(short len) throws APDUException 
    {        
    }

    public short receiveBytes(short boff) throws APDUException 
    {
	    return 0;   	    
	}
    
    public short setIncomingAndReceive() throws APDUException 
	{
	    return 0;
	}

    public void sendBytes(short boff, short len) throws APDUException 
    {	    
	}

    public void sendBytesLong(byte outData[], short	boff, short	len) throws APDUException 
    {            
	}
    
    public void setOutgoingAndSend(short boff, short len) throws APDUException 
    {                
    }
    
    public static void waitExtension() throws APDUException
    {
    }        
}

