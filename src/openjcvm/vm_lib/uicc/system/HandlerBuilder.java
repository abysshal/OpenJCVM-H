package uicc.system;

import uicc.toolkit.*;
import javacard.framework.*;

/**
 * The <code>HandlerBuilder</code> class is a class to create objects that are implementing TLV handler interfaces.
 */
public final class HandlerBuilder {
	
	// ------------------------------- Constants ------------------------------
	public static final byte EDIT_HANDLER = (byte)0x01;
	public static final byte BER_EDIT_HANDLER = (byte)0x02;
	
	// ------------------------------- Constructors ---------------------------
   	/**
	 *Constructor for the HandlerBuilder object
	 */
	private HandlerBuilder () { }

      	
	/**
	 * Allocates a TLVHandler with an internal buffer of length capacity
	 *
	 * @param type indicating the type of the Handler
	 * @param capacity the length of the internal buffer of the Handler.It corresponds to the maximum size of the TLV list managed by the handler.
	 * @exception SystemException with the following reason code: <ul>
	 *      <li><code>ILLEGAL_VALUE</code> <ul><li>if the type does not match with the predefined values</li>
	 *      <li> if <code>capacity</code>is negative</li></ul></li>
	 *      <li><code>NO_RESOURCE</code> if there are not enough resources in the card to allocate the handler</li></ul>
	 */
	public static ViewHandler buildTLVHandler(byte type, short capacity) throws SystemException {
		return null;
	}
	
	/**
	 * Allocates a TLVHandler with an internal buffer of length capacity. 
	 * Copies the buffer content to an internal buffer of the TLVHandler starting at <code>offset</code>. 
	 * The internal buffer shall be at least <code>length</code> long.
	 *
	 * @param type indicating the type of the Handler
	 * @param capacity the length of the internal buffer of the Handler. It corresponds to the maximum size of the TLV list managed by the handler.
	 * @param buffer holding initialization data for the TLV Handler the content of this buffer will
	 *               be copied into the internal buffer of the handler and will be unchanged.
	 * @param offset offset into the buffer indcating the start of the content that has to be copied into the internal buffer of the handler
	 * @param length length of the content that has to be copied from the buffer
	 * @exception SystemException with the following reason code: <ul>
	 *      <li><code>ILLEGAL_VALUE</code><ul><li>if the type does not match with the predefined values</li>
	 *      <li>if <code>capacity</code> is negative</li></ul></li>
	 *      <li><code>NO_RESOURCE</code> if there are not enough resources in the card to allocate the handler</li></ul>
	 * @exception  NullPointerException     if <code>buffer</code> is <code>null</code>
	 * @exception ArrayIndexOutOfBoundsException <ul> 
	 *      <li>if <code>offset</code> would cause access outside array bounds, or if <code>bLength</code> is negative.</li>
	 *      <li>if <code>offset+length</code> is greater than the length of the buffer</li></ul>
	 * @exception ToolkitException with the following reason code: <ul>
	 *      <li><code>BAD_INPUT_PARAMETER</code> if <code>bLength</code> is greater than <code>capacity</code></ul>
	 */
	public static ViewHandler buildTLVHandler(byte type, short capacity, byte[] buffer, short offset, short length) 
	throws ArrayIndexOutOfBoundsException,SystemException,NullPointerException, ToolkitException {
		return null;
	}
}

