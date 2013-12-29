package javacard.security;

public abstract interface DSAPublicKey extends PublicKey, DSAKey 
{	
	public short getY(byte[] buffer, short offset);
	
	public void setY(byte[] buffer, short offset, short length) throws CryptoException;
}
 

