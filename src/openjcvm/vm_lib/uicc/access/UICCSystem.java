//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.access;

import javacard.framework.JCSystem;
import javacard.framework.SystemException;
import javacard.framework.AID;

/**
 * The <code>UICCSystem class</code> provides a way to get a view of an UICC File system.
 *
 * The <code>FileView</code> objects returned by the methods of this class are permanent JCRE
 * Entry Point Objects.
 *
 */
public class UICCSystem {

	// ------------------------------- Constructors ---------------------------
	/**
	 * constructor
	 */
	private UICCSystem() { }


	/**
	 * Method to get a reference to a FileView object on the UICC file system
	 *
	 * The FileView object will only allow access to the files specified under the
	 * MF of the UICC. It is not possible to get access to files which are located under any ADF with
	 * this FileView object. After a succesful invocation of the method the MF is
	 * the current selected file.
	 *
	 * This method return <code>null</code> if the <code>Applet.register()</code>
	 * has not yet been invoked or the filesystem server returns <code>null</code>
	 *
	 * @param  event                defining the transient type of the file context associated with the FileView object
	 *              the following values are allowed
	 *              JCSystem.NOT_A_TRANSIENT_OBJECT
	 *              JCSystem.CLEAR_ON_RESET
	 *              JCSystem.CLEAR_ON_DESELECT
	 * @return                      a reference to a class which implements the FileView interface
	 * @exception  SystemException  with the following reason codes:<ul>
	 * <li><code>SystemException.ILLEGAL_VALUE</code> if event is not a valid event code.
	 * <li><code>SystemException.NO_TRANSIENT_SPACE</code> if sufficient transient space is not available.
	 * <li><code>SystemException.ILLEGAL_TRANSIENT</code> if the current applet context
	 * is not the currently selected applet context and <code>CLEAR_ON_DESELECT</code> is specified.
	 * </ul>
	 */
	public static FileView getTheUICCView(byte event) throws SystemException {
		return null;
	}


	/**
	 * Method to get a reference to a FileView object on an ADF file system.
	 *
	 * The FileView object will only allow access to Files under the ADF specified
	 * by the AID. It is not possible to access files which are not located under the ADF.
	 * After a succesful invocation of the method the ADF is the currently selected file.
	 *
	 * This method return <code>null</code> if the <code>Applet.register()</code>
	 * has not yet been invoked, or the filesystem server does not
	 * exist or the filesystem server returns <code>null</code>
	 *
	 * @param  event                     defining the transient type of the file context associated with the FileView object
	 *              the following values are allowed
	 *              JCSystem.NOT_A_TRANSIENT_OBJECT
	 *              JCSystem.CLEAR_ON_RESET
	 *              JCSystem.CLEAR_ON_DESELECT
	 * @param  aid                       AID of the requested ADF
	 * @return                           a reference to a class which implements the FileView interface
	 * @exception  NullPointerException  if <code>buffer</code> is <code>null</code>
	 * @exception  SystemException       with the following reason codes:<ul>
	 * <li><code>SystemException.ILLEGAL_VALUE</code> if event is not a valid event code.
	 * <li><code>SystemException.NO_TRANSIENT_SPACE</code> if sufficient transient space is not available.
	 * <li><code>SystemException.ILLEGAL_TRANSIENT</code> if the current applet context
	 * is not the currently selected applet context and <code>CLEAR_ON_DESELECT</code> is specified.
	 * </ul>
	 */
	public static FileView getTheFileView(AID aid, byte event) throws NullPointerException, SystemException {
		return null;
	}


	/**
	 * Method to get a reference to a FileView object on an ADF file system.
	 * <br>
	 * The FileView object will only allow access to Files under the ADF specified
	 * by the AID. It is not possible to access files which are not located under the ADF.
	 * After a succesful invocation of the method the ADF is the currently selected file.
	 * <br>
	 * This method return <code>null</code> if the <code>Applet.register()</code>
	 * has not yet been invoked, or the filesystem server does not
	 * exist or the filesystem server returns <code>null</code>
	 * <br>
	 * <p>
	 * Notes:<ul>
	 * <li><em>If </em><code>bOffset</code><em> or </em><code>bLength</code><em><em>
	 * is negative an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown.</em>
	 * <li><em>If </em><code>bOffset+bLength</code><em> is greater than </em><code>buffer.length</code><em>, the length
	 * of the </em><code>buffer</code><em> array an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown.</em>
	 * </ul>
         *
	 *
	 * @param  buffer                    array holding the AID
	 * @param  bOffset                   offset into the buffer indicating the start of the AID
	 * @param  bLength                   length into the buffer of the AID
	 * @param  event                     defining the transient type of the file context associated with the FileView object
	 *              the following values are allowed
	 *              JCSystem.NOT_A_TRANSIENT_OBJECT
	 *              JCSystem.CLEAR_ON_RESET
	 *              JCSystem.CLEAR_ON_DESELEC
	 * @return                           a reference to an object which implements the FileView interface, or null.
	 * @exception  NullPointerException  if <code>buffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException in case of access outside array bounds
	 * @exception  SystemException       with the following reason codes:<ul>
	 * <li><code>SystemException.ILLEGAL_VALUE</code> if event is not a valid event code or <code>bLength</code> is not in the range of 5 – 16 bytes.
	 * <li><code>SystemException.NO_TRANSIENT_SPACE</code> if sufficient transient space is not available.
	 * <li><code>SystemException.ILLEGAL_TRANSIENT</code> if the current applet context
	 * is not the currently selected applet context and <code>CLEAR_ON_DESELECT</code> is specified.
	 * </ul>
	 */
	public static FileView getTheFileView(byte[] buffer, short bOffset, byte bLength, byte event) throws NullPointerException, ArrayIndexOutOfBoundsException, SystemException {
		return null;
	}
}

