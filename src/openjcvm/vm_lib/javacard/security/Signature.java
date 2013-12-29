package javacard.security;

public abstract class Signature
{
	public static final byte ALG_DES_MAC4_NOPAD         = (byte)1;
    public static final byte ALG_DES_MAC8_NOPAD         = (byte)2;
    public static final byte ALG_DES_MAC4_ISO9797_M1    = (byte)3;
    public static final byte ALG_DES_MAC8_ISO9797_M1    = (byte)4;
    public static final byte ALG_DES_MAC4_ISO9797_M2    = (byte)5;
    public static final byte ALG_DES_MAC8_ISO9797_M2    = (byte)6;
    public static final byte ALG_DES_MAC4_PKCS5         = (byte)7;
    public static final byte ALG_DES_MAC8_PKCS5         = (byte)8;
    public static final byte ALG_RSA_SHA_ISO9796        = (byte)9;
    public static final byte ALG_RSA_SHA_PKCS1          = (byte)10;
    public static final byte ALG_RSA_MD5_PKCS1          = (byte)11;
    public static final byte ALG_RSA_RIPEMD160_ISO9796  = (byte)12;
    public static final byte ALG_RSA_RIPEMD160_PKCS1    = (byte)13;
    public static final byte ALG_DSA_SHA                = (byte)14;
    public static final byte ALG_RSA_SHA_RFC2409        = (byte)15;
    public static final byte ALG_RSA_MD5_RFC2409        = (byte)16;
    public static final byte MODE_SIGN                  = (byte)1;
    public static final byte MODE_VERIFY                = (byte)2;
    
    protected Signature()
	{
	}
	
	public static final Signature getInstance(byte algorithm,boolean externalAccess) throws CryptoException
	{
	    return null;
	}
	
	public abstract void init(Key theKey,byte theMode) throws CryptoException;
	
	public abstract void init(Key theKey,byte theMode,byte[] bArray,short bOff,short blen) throws CryptoException;
	
    public abstract byte getAlgorithm();
	
    public abstract short getLength();   			
	
	public abstract void update(byte[] inBuff,short inOffset,short inLength) throws CryptoException;
	
	public abstract short sign(byte[] inBuff,short inOffset,short inLength,byte[] sigBuff,short sigOffset) throws CryptoException;
		
	public abstract boolean verify(byte[] inBuff,short inOffset,short inLength,byte[] sigBuff,short sigOffset,short sigLength) throws CryptoException;
}

