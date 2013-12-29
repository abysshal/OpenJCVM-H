package javacard.framework;

public final class AID extends Object 
{
    public AID(byte bArray[],short offset,byte length) throws SystemException
	{
    }
    
    public byte getBytes(byte dest[],short offset)
    {
		return 0;
    }
    
    public boolean equals(Object anObject)
    {
        return (false);
    }
    
    public boolean equals(byte bArray[],short offset,byte length)
    {
        return (false);
    }
    public boolean partialEquals(byte bArray[],short offset,byte length)
    {
        return false;
    }    
    
    public boolean RIDEquals(AID otherAID)
    {
        return (false);
    }
}

