package javacard.security;

public abstract interface Key 
{

	public abstract boolean isInitialized();
	
	public abstract void clearKey();
	
	public abstract byte getType();
	
	public abstract short getSize();
}

