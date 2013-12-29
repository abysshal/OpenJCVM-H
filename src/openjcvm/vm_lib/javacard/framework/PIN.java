
package javacard.framework;

public abstract interface PIN
{
    public abstract boolean check(byte pin[],short offset,byte length) throws ArrayIndexOutOfBoundsException, NullPointerException;
    public abstract byte getTriesRemaining();	
    public abstract boolean isValidated();
    public abstract void reset ();

}

