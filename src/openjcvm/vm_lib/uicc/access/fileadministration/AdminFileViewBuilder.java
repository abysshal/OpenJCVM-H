package uicc.access.fileadministration;


import javacard.framework.JCSystem;
import javacard.framework.SystemException;
import javacard.framework.AID;

/**
 * The <code>AdminFileViewBuilder</code> class provides a way to get a administrative view of a UICC File system server.
 *
 * The <code>AdminFileView</code> objects returned by the methods of this class are permanent JCRE
 * Entry Point Objects.
 *
*/
public class AdminFileViewBuilder{

	// ------------------------------- Constructors ---------------------------
	/**
	 * constructor
	 */
	private AdminFileViewBuilder() { }


	/**
	 * Method to get a reference to a AdminFileView object on the UICC file system server.
	 *
	 * The AdminFileView object will only allow access to the Files specified under the
	 * MF of the UICC. It is not possible to get access to files which are located under any ADF with
	 * this AdminFileView object. After a successful invocation of the method the MF is
	 * the current selected file.
	 *
	 * This method return <code>null</code> if the <code>Applet.register()</code>
	 * has not yet been invoked, or the filesystem server returns <code>null</code>
	 *
	 * @param  bType                defining the type of the file context associated with the AdminFileView object
	 *              the following values are allowed
	 *              JCSystem.NOT_A_TRANSIENT_OBJECT
	 *              JCSystem.CLEAR_ON_RESET
	 *              JCSystem.CLEAR_ON_DESELECT
	 * @return                      a reference to a class which implements the AdminFileView interface
	 * @exception  SystemException  with the following reason codes:<ul>
	 * <li><code>SystemException.ILLEGAL_VALUE</code> if bType is not a valid value.
	 * <li><code>SystemException.NO_TRANSIENT_SPACE</code> if sufficient transient space is not available.
	 * <li><code>SystemException.ILLEGAL_TRANSIENT</code> if the current applet context
	 * is not the currently selected applet context and <code>CLEAR_ON_DESELECT</code> is specified.
	 * </ul>
	 */
	public static AdminFileView getTheUICCAdminFileView(byte bType) throws SystemException {
		return null;
	}


	/**
	 * Method to get a reference to a AdminFileView object on an ADF file system server.
	 *
	 * The AdminFileView object will only allow access to Files under the ADF specified
	 * by the AID. It is not possible to access files which are not located under the ADF.
	 * After a successful invocation of the method the ADF is the currently selected file.
	 *
	 * This method return <code>null</code> if the <code>Applet.register()</code>
	 * has not yet been invoked, or the filesystem server does not
	 * exist or the filesystem server returns <code>null</code>
	 *
	 * @param  bType                     defining the type of the file context associated with the AdminFileView object
	 *              the following values are allowed
	 *              JCSystem.NOT_A_TRANSIENT_OBJECT
	 *              JCSystem.CLEAR_ON_RESET
	 *              JCSystem.CLEAR_ON_DESELECT
	 * @param  aid                       Description of the Parameter
	 * @return                           a reference to a class which implements the AdminFileView interface
	 * @exception  NullPointerException  if <code>buffer</code> is <code>null</code>
	 * @exception  SystemException       with the following reason codes:<ul>
	 * <li><code>SystemException.ILLEGAL_VALUE</code> if bType is not a valid value.
	 * <li><code>SystemException.NO_TRANSIENT_SPACE</code> if sufficient transient space is not available.
	 * <li><code>SystemException.ILLEGAL_TRANSIENT</code> if the current applet context
	 * is not the currently selected applet context and <code>CLEAR_ON_DESELECT</code> is specified.
	 * </ul>
	 */
	public static AdminFileView getTheAdminFileView (AID aid, byte bType) throws NullPointerException, SystemException {
		return null;
	}


	/**
	 * Method to get a reference to a AdminFileView object on an ADF file system server.
	 *
	 * The AdminFileView object will only allow access to Files under the ADF specified
	 * by the AID. It is not possible to access files which are not located under the ADF.
	 * After a successful invocation of the method the ADF is the currently selected file.
	 *
	 * This method return <code>null</code> if the <code>Applet.register()</code>
	 * has not yet been invoked, or the filesystem server does not
	 * exist or the filesystem server returns <code>null</code>
         * <p>
	 * Notes:<ul>
	 * <li><em>If </em><code>bOffset</code><em> or </em><code>bLength</code><em>
	 * is negative an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown.</em>
	 * <li><em>If </em><code>bOffset+bLength</code><em> is greater than </em><code>buffer.length</code><em>, the length
	 * of the </em><code>buffer</code><em> array an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown.</em>
	 * </ul>
	 *
	 *
	 * @param  buffer                    thats holds the AID
	 * @param  bOffset                   offset into the buffer indicating the start of the AID
	 * @param  bType                     defining the type of the file context associated with the AdminFileView object
	 *              the following values are allowed
	 *              JCSystem.NOT_A_TRANSIENT_OBJECT
	 *              JCSystem.CLEAR_ON_RESET
	 *              JCSystem.CLEAR_ON_DESELECT
	 * @param  bLength                   the length of the AID bytes in buffer
	 * @return                           a reference to an object which implements the AdminFileView interface
	 * @exception  NullPointerException  if <code>buffer</code> is <code>null</code>
        * @exception  ArrayIndexOutOfBoundsException in case of access outside array bounds
	 * @exception  SystemException       with the following reason codes:<ul>
	 * <li><code>SystemException.ILLEGAL_VALUE</code> if bType is not a valid value or <code>bLength</code> is not in the range of 5 - 16 bytes.
	 * <li><code>SystemException.NO_TRANSIENT_SPACE</code> if sufficient transient space is not available.
	 * <li><code>SystemException.ILLEGAL_TRANSIENT</code> if the current applet context
	 * is not the currently selected applet context and <code>CLEAR_ON_DESELECT</code> is specified.
	 * </ul>
	 */
	public static AdminFileView getTheAdminFileView (byte[] buffer, short bOffset, byte bLength, byte bType) throws NullPointerException, ArrayIndexOutOfBoundsException, SystemException {
		return null;
	}
}

