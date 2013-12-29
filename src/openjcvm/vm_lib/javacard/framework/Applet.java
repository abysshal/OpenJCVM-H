package javacard.framework;

//import net.sourceforge.openjcvm.jni.*;

public abstract class Applet extends Object
{

    protected Applet () 
    {
    }

    public static void install(byte buffer[],short offset, byte length) throws ISOException
    {
    }
    
    public abstract void process(APDU apdu) throws ISOException;

    public boolean select () 
    {
        return false;
    }

    public void deselect ()
    {
    }
    
    public Shareable getShareableInterfaceObject(AID clientAID,byte parameter)
    {
        return null;
    }
    
    protected final void register() throws SystemException
    {
    	//JCFDriver.registerApplet(this);
    	OpenjcvmRegistry.registerOneApplet(this);
    }
    
    protected final void register(byte bArray[],short bOffset,byte bLength) throws SystemException
    {
    	//JCFDriver.registerApplet(this, bArray, bOffset, bLength);
    }        
                  
    protected final boolean selectingApplet()
    {
        return false;
    }

}
