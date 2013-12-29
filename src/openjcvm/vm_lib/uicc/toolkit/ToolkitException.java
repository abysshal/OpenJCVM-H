//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import javacard.framework.CardRuntimeException;

/**
 * This class extends the <code>Throwable</code> class and allows the classes of this package
 * to throw specific exceptions in case of problems. <p>
 */
public class ToolkitException extends CardRuntimeException {

	// ------------------------------- Constants ------------------------------
	/**
	 * This reason code (= 1) is used to indicate that data are to large than
	 *  the storage space available in the handler.
	 */
	public final static short HANDLER_OVERFLOW = (short) 1;

	/**
	 * This reason code (= 2) is used to indicate that the Handler is not
	 *  available (e.g. busy).
	 */
	public final static short HANDLER_NOT_AVAILABLE = (short) 2;

	/**
	 * This reason code (= 3) is used to indicate that the element is
	 *  unavailable in the handler buffer.
	 */
	public final static short UNAVAILABLE_ELEMENT = (short) 3;

	/**
	 * This reason code (= 4) is used to indicate that the requested menu entry
	 *  is not defined for the corresponding applet.
	 */
	public final static short MENU_ENTRY_NOT_FOUND = (short) 4;

	/**
	 * This reason code (= 5) is used to indicate an error in the applet registry
	 */
	public final static short REGISTRY_ERROR = (short) 5;

	/**
	 * This reason code (= 6) is used to indicate that the event code is not
	 *  supported by the CAT Runtime Environment
	 */
	public final static short EVENT_NOT_SUPPORTED = (short) 6;

	/**
	 * This reason code (= 7) is used to indicate that the maximum number of
	 *  registered applet for this event is already reached (e.g Call Control)
	 */
	public final static short EVENT_ALREADY_REGISTERED = (short) 7;

	/**
	 * This reason code (= 8) is used to indicate that either the offset, the
	 *  length or both are out of current TLV boundaries
	 */
	public final static short OUT_OF_TLV_BOUNDARIES = (short) 8;

	/**
	 * This reason code (= 9) is used to indicate that the Terminal Profile
	 *  data are not available
	 */
	public final static short TERMINAL_PROFILE_NOT_AVAILABLE = (short) 9;

	/**
	 * This reason code (=10) is used to indicate that the provided menu
	 *  entry string is bigger than the allocated space
	 */
	public final static short ALLOWED_LENGTH_EXCEEDED = (short) 10;

	/**
	 * This reason code (=11) is used to indicate that all the available timers
	 *  or the maximum number of timers have been allocated to the applet
	 */
	public final static short NO_TIMER_AVAILABLE = (short) 11;

	/**
	 * This reason code (=12) is used to indicate that the indicated timer
	 *  identifier is not allocated to this applet.
	 */
	public final static short INVALID_TIMER_ID = (short) 12;

	/**
	 * This reason code (=13) is used to indicate that the registration to an
	 *  indicated event can not be changed by the called method.
	 */
	public final static short EVENT_NOT_ALLOWED = (short) 13;

	/**
	 * This reason code (=14) is used to indicate that an input parameter of
	 * the method is not valid
	 */
	public final static short BAD_INPUT_PARAMETER = (short) 14;

	/**
	 * This reason code (=15) is used to indicate that the proactive command
	 * being sent is not allowed by the CAT Runtime Environment.
	 */
	public final static short COMMAND_NOT_ALLOWED = (short) 15;
	
	/**
	 * This reason code (=16) is used to indicate that all the available services identifiers
	 *  or the maximum number of services identifiers have been allocated to the applet
	 */
	public final static short NO_SERVICE_ID_AVAILABLE = (short)16;

	/**
	 * This reason code (=17) is used to indicate that the service identifier
	 *  is not allocated to this applet.
	 */
	public final static short INVALID_SERVICE_ID = (short)17;
	
	/**
	 * This reason code (=18) is used to indicate that there is no TAR
         * defined for the applet instance.
         */
	public final static short TAR_NOT_DEFINED = (short)18;


	// ------------------------------- Constructors ---------------------------
	/**
	 * Construct a ToolkitException instance with the specified reason. To
	 * conserve on resources use <code>throwIt()</code> method to re-use the
	 * JCRE instance of this class.
	 *
	 * @param  reason  the reason for the exception
	 */
	public ToolkitException(short reason) {
		super(reason);
	}


	// ------------------------------- Public methods -------------------------
	/**
	 * Throws the JCRE instance of the <code>ToolkitException</code> class with
	 * the specified reason.
	 *
	 * @param  reason                the reason for the exception.
	 * @exception  ToolkitException  always
	 */
	public static void throwIt(short reason) throws ToolkitException {
	}
}

