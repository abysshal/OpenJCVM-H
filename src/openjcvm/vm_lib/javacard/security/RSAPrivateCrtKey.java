package javacard.security;

public interface RSAPrivateCrtKey extends PrivateKey
{
    public short getDP1(byte[] buffer,short offset);
    
    public void setDP1(byte[] buffer,short offset,short length) throws CryptoException;
	
	public short getP(byte[] buffer,short offset);
    
    public void setP(byte[] buffer,short offset,short length) throws CryptoException;
	
	public short getQ(byte[] buffer,short offset);
	
	public void setQ(byte[] buffer,short offset,short  length) throws CryptoException;
    
    public short getDQ1(byte[] buffer,short offset);
    
    public void setDQ1(byte[] buffer,short offset,short length) throws CryptoException;
    
    public short getPQ(byte[] buffer,short offset);
    
    public void setPQ(byte[] buffer,short offset,short length) throws CryptoException;

}
