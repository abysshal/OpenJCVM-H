package javacard.security;

public abstract interface DESKey extends SecretKey
{
	public abstract void setKey(byte keyData[],short kOff) throws CryptoException;	 
	
	public abstract byte getKey(byte keyData[],short kOff);
	
}
