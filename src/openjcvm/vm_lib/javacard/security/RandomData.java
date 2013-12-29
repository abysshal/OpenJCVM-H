package javacard.security;

public abstract class RandomData 
{
    public static final byte ALG_PSEUDO_RANDOM   = (byte)1;
    public static final byte ALG_SECURE_RANDOM   = (byte)2;

    protected RandomData()
    {
    }

	public static final RandomData getInstance(byte algorithm) throws CryptoException
    {
        return null;
    }
    
	public abstract void generateData(byte buffer[],short offset,short length);
	  
    public abstract void setSeed(byte buffer[],short offset,short length);
}

