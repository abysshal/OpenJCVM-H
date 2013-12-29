package javacard.framework;

public class OwnerPIN extends Object implements PIN 
{

    public OwnerPIN (byte tryLim,byte maxPINSize) throws PINException 
    {
    }

    protected boolean getValidatedFlag() 
    {
        return false;
    }
    
    protected void setValidatedFlag(boolean value) 
    {    
    }
    
    public byte getTriesRemaining () {
        return 0;
    }

    public boolean check(byte pin[],short offset,byte length) throws ArrayIndexOutOfBoundsException, NullPointerException
    {
        return false;
    }

    public boolean isValidated() 
    {
        return false;
    }
    
    public void reset() 
    {    
    }
        
    public void update(byte pin[],short offset,byte length) throws PINException 
    {
    }
  
    public void resetAndUnblock() 
    {        
    }    
}

