package javacard.security;

public abstract interface DSAPrivateKey extends PrivateKey, DSAKey 
{          
	public short getX(byte[] buffer, short offset);
	
	public void setX(byte[] buffer, short offset, short length) throws CryptoException;
}
 

