package javacard.security;

public final class KeyPair extends Object
{    
    public static final byte    ALG_RSA         = (byte)0x01;
	public static final byte    ALG_RSA_CRT     = (byte)0x02;
	public static final byte    ALG_DSA         = (byte)0x03;

	public KeyPair(byte algorithm,short keyLength) 
	{
    }
    
    public KeyPair(PublicKey thePublicKey,PrivateKey thePrivateKey) 
    {
    }
    
    public final void genKeyPair() throws CryptoException
    {
    }
    
    public PublicKey getPublic() 
    {
        return null;
    }

    public PrivateKey getPrivate()
    {
        return null;
    }
}
