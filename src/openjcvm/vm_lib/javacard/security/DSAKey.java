package javacard.security;

public abstract interface DSAKey 
{	 	 
	 public short getG(byte[] buffer, short offset);	 
	 
	 public short getP(byte[] buffer, short offset);
	 
	 public short getQ(byte[] buffer, short offset);
	 
	 public void setG(byte[] buffer, short offset, short length) throws CryptoException;
	 	 
	 public void setP(byte[] buffer, short offset, short length) throws CryptoException;
	 
	 public void setQ(byte[] buffer, short offset, short length) throws CryptoException;
}

