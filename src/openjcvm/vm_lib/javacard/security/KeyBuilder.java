package javacard.security;

public class KeyBuilder
{
    public static final short LENGTH_DES            = (short)64;
    public static final short LENGTH_DES3_2KEY      = (short)128;
    public static final short LENGTH_DES3_3KEY      = (short)192;
    public static final short LENGTH_DSA_1024       = (short)1024;
    public static final short LENGTH_DSA_768        = (short)768;
    public static final short LENGTH_DSA_512        = (short)512;
    public static final short LENGTH_RSA_2048       = (short)2048;
    public static final short LENGTH_RSA_1024       = (short)1024;
    public static final short LENGTH_RSA_768        = (short)768;
    public static final short LENGTH_RSA_512        = (short)512;    
    public static final byte TYPE_DES_TRANSIENT_RESET    = (byte)1;
    public static final byte TYPE_DES_TRANSIENT_DESELECT = (byte)2;
    public static final byte TYPE_DES                    = (byte)3;
    public static final byte TYPE_RSA_PUBLIC             = (byte)4;
    public static final byte TYPE_RSA_PRIVATE            = (byte)5;
    public static final byte TYPE_RSA_CRT_PRIVATE        = (byte)6;
    public static final byte TYPE_DSA_PUBLIC             = (byte)7;
    public static final byte TYPE_DSA_PRIVATE            = (byte)8;
    
    KeyBuilder() 
    {
    }

	public static Key buildKey(byte keyType,short keyLength,boolean keyEncryption) throws CryptoException
    {
        return null;
    }
}
