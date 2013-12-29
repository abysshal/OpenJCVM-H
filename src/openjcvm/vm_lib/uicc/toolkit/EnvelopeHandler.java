//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 * The <code>EnvelopeHandler</code> interface contains basic methods to handle the <b>Envelope
 * </b>data field. A class implementing this interface will be used by the Toolkit
 * applet in order to have access to the current Envelope information. A class
 * implementing the EnvelopeHandler interface is a <b>Temporary JCRE Entry Point Object</b>
 * and can be retrieved by invoking the <code>getTheHandler()</code> method of the
 * <code>EnvelopeHandlerSystem</code> class.
 *
 * Toolkit Applet Example:<pre><code>
 * private static final byte MY_TAG = (byte)0x54;
 * private byte[] data;
 * data = new byte[32];
 *
 * void processToolkit(byte event) throws ToolkitException {
 *     // get the EnvelopeHandler system instance
 *     EnvelopeHandler theEnv = EnvelopeHandlerSystem.getTheHandler();
 *     // look for MY_TAG TLV
 *     if (theEnv.findTLV(MY_TAG, (byte)1) != TLV_NOT_FOUND) {
 *         // check first element byte
 *         if (theEnv.getValueByte((short)0) == (byte)1) {
 *             // copy element part into data buffer
 *             theEnv.copyValue((short)1,
 *                              data,
 *                              (short)0,
 *                              (short)(theEnv.getValueLength() - 1));
 *         }
 *     }
 * }
 * </code></pre>
 *
 * @see        ViewHandler
 * @see        EnvelopeHandlerSystem
 */
public interface EnvelopeHandler extends BERTLVViewHandler {

	/**
	 * Returns the item identifier byte value from the first Item Identifier TLV
	 * element in the current Envelope data field.
	 * If the element is available it becomes the TLV selected.
	 *
	 * @return                       item identifier
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element
	 *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if the item identifier byte is missing in the
	 *                                             Item Identifier Comprehension TLV.</ul>
	 */
	byte getItemIdentifier() throws ToolkitException;


	/**
	 * Returns the channel identifier value from the first Channel status TLV element
	 * in the current Envelope data field. If the element is available it becomes
	 * the currently selected TLV.
	 *
	 * @return                       channel identifier
	 * @exception  ToolkitException  - with the following reason codes: <ul>
	 *         <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element</ul>
	 *         <li><code>OUT_OF_TLV_BOUNDARIES</code> if the Comprehension TLV Channels Status length is equal to zero.</ul>
	 */
	byte getChannelIdentifier() throws ToolkitException;


	/**
	 * Returns the value of the first Channel Status TLV element whose channel identifier is equal
	 * to the <code>channelIdentifier</code> parameter.
	 *
	 * If the element is available it becomes the currently selected TLV element.
	 *
	 * @param  channelIdentifier     the channel number
	 * @return                       channel identifier and status : MSB = byte 1 of the Channel Status TLV value (byte 3 of the
	 * Channel Status TLV element), LSB = byte 2 of the Channel Status TLV value (byte 4 of the Channel
	 * Status TLV element).
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>UNAVAILABLE_ELEMENT</code> if no Channel Status TLV element with the right identifier could be found
	 *	<li><code>OUT_OF_TLV_BOUNDARIES</code> if a Channel Status TLV element with the right
	 *                identifier could be found but its value is less than 2 bytes long </ul>
	 */
	short getChannelStatus(byte channelIdentifier) throws ToolkitException;
}

