//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.system;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 *
 * The <b><code>UICCPlatform</code></b> class contains static method(s) to retrieve references to object(s) owned by the JCRE context, like Global Arrays.
* <p> See <em>Java Card(TM) Runtime Environment (JCRE) Specification</em> for details.<p>
 */

public final class UICCPlatform {
	
     private UICCPlatform(){};

    /**
    * Returns the instance of the volatile byte array designated by the JCRE as global array.
    * The byte array length shall be at least equal to 256 bytes.
    *
    * <p>Notes:<ul>
    * <li><em>Writes to its fields will not be affected by transactions.</em>
    * <li><em>The content of this array is not guaranteed across APDUs.</em>
    * <li><em>A reference to this byte array cannot be stored in class variables or instance variables or array components.
    * See <em>Java Card(TM) Runtime Environment (JCRE) Specification</em>, Global Arrays for details.</em>
    * </ul>
    * @exception java.lang.SecurityException if the method is invoked from a context which is not the currently selected applet or the currently triggered applet i.e. the context of the applet that treats the current APDU or the context of the applet that has been triggered by the current APDU.
    *
    * @return reference to the volatile byte array.
    *
    */

    public static byte[] getTheVolatileByteArray() {
                return null;
    }
}

