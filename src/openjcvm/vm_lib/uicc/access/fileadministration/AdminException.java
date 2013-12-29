//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.access.fileadministration ;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import javacard.framework.CardRuntimeException; 

/**
 * The <code>AdminException class</code> encapsulates specific exceptions which can
 * be thrown by the methods of an object, that implements an AdminFileView interface, in case of error. <p>
 *
*/

public class AdminException extends CardRuntimeException {

	/*
	 *  -------------------------------- Constants ---------------------------
	 */
	/**
	 * This reason code (=1) is used to indicate that the parameters in the
	 * data field are incorrect.
	 */
	public final static short INCORRECT_PARAMETERS = (short) 1;

	/**
	 * This reason code (=2) is used to indicate that the file already
	 * exists.
	 */
	public final static short FILE_ALREADY_EXISTS  = (short) 2;

	/**
	 * This reason code (=3) is used to indicate that the conditions
	 * of use are not satisfied.
	 */
	public final static short CONDITIONS_OF_USE_NOT_SATISFIED  = (short) 3;
	/**
	 * This reason code (=4) is used to indicate that there is not enough memory
	 */
	public final static short NOT_ENOUGH_MEMORY_SPACE = (short) 4;
	/**
	 * This reason code (=5) is used to indicate that the DF name already exists (only for creation of a DF and if a DF Name TLV is used)
	 */
	public final static short DF_NAME_ALREADY_EXISTS = (short) 5;


	// ------------------------------- Constructors ---------------------------
	/**
	 * Constructs a AdminException with the specified reason. To conserve on resources use
	 * <code>throwIt()</code> to use the JCRE instance of this class.
	 *
	 * @param  reason  the reason for the exception
	 */
	public AdminException(short reason) {
		super(reason);
	}


	// ------------------------------- API methods ----------------------------
	/**
	 * Throws the JCRE instance of AdminException with the specified reason.
	 *
	 * @param  reason             is the reason for the exception
	 * @exception  AdminException  always
	 */
	public static void throwIt(short reason) throws AdminException {
	}
}

