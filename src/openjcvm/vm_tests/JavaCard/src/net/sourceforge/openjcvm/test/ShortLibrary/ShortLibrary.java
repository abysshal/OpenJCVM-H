/*
 * Test Applet to verify openjcvm
 */
package net.sourceforge.openjcvm.test.ShortLibrary;

/**
 *
 * @author Lusing
 */
public class ShortLibrary{
    private short sValue;
    public ShortLibrary(short sv)
    {
        this.sValue = sv;    	
    }
    
    public short getValue()
    {
    	return this.sValue;
    }
    
    public void setValue(short sv)
    {
        this.sValue = sv;    	    	    	
    }
}
