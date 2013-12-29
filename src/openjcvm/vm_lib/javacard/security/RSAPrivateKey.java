package javacard.security;

public interface RSAPrivateKey extends PrivateKey
{
	public short getExponent(byte[] buffer,short offset);
    
    public void setExponent(byte[] buffer,short offset,short length) throws CryptoException;
	
	public short getModulus(byte[] buffer,short offset);
    
    public void setModulus(byte[] buffer,short offset,short length) throws CryptoException;
}
