//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.access;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import javacard.framework.CardRuntimeException;

/**
 * The <code>UICCViewException class</code> encapsulates specific exceptions which can
 * be thrown by the methods of an object that implements a UICCView interface, in case of error. <p>
 */

public class UICCException extends CardRuntimeException {

	/*
	 *  -------------------------------- Constants ---------------------------
	 */
	/**
	 * This reason code (= 1) is used to indicate that no EF is selected to
	 * complete the called method.
	 */
	public final static short NO_EF_SELECTED = (short) 1;

	/**
	 * This reason code (= 4) is used to indicate to the calling applet that
	 *  the file was not found in the current directory.
	 */
	public final static short FILE_NOT_FOUND = (short) 4;

	/**
	 * This reason code (= 9) is used to indicate to the calling applet that
	 *  no record was found.
	 */
	public final static short RECORD_NOT_FOUND = (short) 9;

	/**
	 * This reason code (= 5) is used to indicate to the calling applet that an
	 *  Internal error happened during the called method.
	 */
	public final static short INTERNAL_ERROR = (short) 5;
	
        /**
	 * This reason code (= 10) is used to indicate to the calling applet that the mode for an operation on
	 * a record based file or on a BER-TLV file is invalid.
	 */
	public final static short INVALID_MODE = (short) 10; 
	
	/**
	 * This reason code (= 7) is used to indicate that either the length, the file
	 *  offset or both passed to the called method are out of the current file boundaries.
	 */
	public final static short OUT_OF_FILE_BOUNDARIES = (short) 7;

	/**
	 * This reason code (= 12) is used to indicate that method increase can not be performed as the
	 *  maximum value of the record is reached.
	 */
	public final static short MAX_VALUE_REACHED = (short) 12;

	/**
	 * This reason code (= 13) is used to indicate that a memory problem occured.
	 */
	public final static short MEMORY_PROBLEM = (short) 13;

	/**
	 * This reason code (= 3) is used to indicate that access conditions are not satisfied.
	 */
	public final static short SECURITY_STATUS_NOT_SATISFIED = (short) 3;

	/**
	 * This reason code (= 2) is used to indicate that the method is not compatible with
	 *  the selected file.
	 */
	public final static short COMMAND_INCOMPATIBLE = (short) 2;


	/**
	 * This reason code (= 8) is used to indicate that either the length, the record
	 * offset or both passed to the called method are out of the current record boundaries.
	 */
	public final static short OUT_OF_RECORD_BOUNDARIES = (short) 8;
	 

	/**
	 * This reason code (=6) is used to indicate to the calling applet that the referenced data
	 * are invalidated
	 */
        public final static short REF_DATA_INVALIDATED = (short) 6;

	/**
	 * This reason code (= 11) is used to indicate that the method was applied on a file in
	 * state terminated..
	 */
	public final static short COMMAND_NOT_ALLOWED = (short) 11;

	/**
	 * This reason code (= 14) is used to indicate to the calling applet that
	 *  the conditions of use are not satisfied.
	 */
	public final static short CONDITIONS_OF_USE_NOT_SATISFIED = (short) 14;
        
        /**
	 * This reason code (=15) is used to indicate to the calling applet that the referenced data
	 * cannot be found.
	 */
        public final static short REFERENCED_DATA_NOT_FOUND = (short)15;
    
	/**
	 * This reason code (=16) is used to indicate to the calling applet that the length 
	 * passed to the called method is out of the data boundaries. 
	 */
        public final static short OUT_OF_DATA_BOUNDARIES = (short)16;

	/**
	 * This reason code (=17) is used to indicate to the calling applet that the
	 * requested memory is not available. 
	 */
        public final static short NOT_ENOUGH_MEMORY_SPACE = (short)17;

	/**
	 * This reason code (=18) is used to indicate to the calling applet that the
	 * TAG value is invalid. 
	 */
        public final static short INVALID_TAG_VALUE = (short)18;



	// ------------------------------- Constructors ---------------------------
	/**
	 * Constructs a UICCViewException with the specified reason. To conserve on resources use
	 * <code>throwIt()</code> to use the JCRE instance of this class.
	 *
	 * @param  reason  the reason for the exception
	 */
	public UICCException(short reason) {
		super(reason);
	}


	// ------------------------------- API methods ----------------------------
	/**
	 * Throws the JCRE instance of UICCViewException with the specified reason.
	 *
	 * @param  reason             is the reason for the exception
	 * @exception  UICCException  always
	 */
	public static void throwIt(short reason) throws UICCException {
	}
}

