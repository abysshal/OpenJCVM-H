package javacard.security;

public abstract class MessageDigest 
{
    
    public static final byte    ALG_SHA         = (byte)1;
    public static final byte    ALG_MD5         = (byte)2;
    public static final byte    ALG_RIPEMD160   = (byte)3;        
	
    protected MessageDigest()
    {
    }

    public static final MessageDigest getInstance(byte algorithm,boolean externalAccess) throws CryptoException
    {
        return null;
    }
	
	public abstract byte getAlgorithm();
	 
    public abstract byte getLength(); 
	 
	public abstract void reset();
		 
    public abstract short doFinal(byte[] inBuff,short  inOffset,short  inLength,byte[] outBuff,short  outOffset);
	
	public abstract void update(byte[] inBuff,short inOffset,short inLength);
}

