//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 * The <code>ProactiveResponseHandler</code> interface contains basic methods to handle the <b>Terminal
 * Response</b> data field. This class will be used by the Toolkit Applet to
 * get the response to the Proactive commands. A class implementing the <code>ProactiveResponseHandler</code> interface is a <b>Temporary JCRE
 * Entry Point Object</b>. The only way to get a ProactiveResponseHandler
 * reference is through the <code>getTheHandler()</code> static method from <code>ProactiveResponseHandlerSystem</code><p>
 *
 * Example of use:<pre><code>
 *
 * private byte[] data;
 * data = new byte[32];                 // build a buffer
 *
 * ProactiveResponseHandler ProRespHdlr;            // get the system instance
 * ProRespHdlr = ProactiveResponseHandlerSystem.getTheHandler();
 *
 * // get General Result
 * byte result = ProRespHdlr.getGeneralResult();
 *
 * respHdlr.findTLV(TAG_DEVICE_IDENTITIES, 1);          // look for Device Identities
 * byte sourceDev = ProRespHdlr.getValueByte((short)0);    // read Device Identities
 * byte destinDev = ProRespHdlr.getValueByte((short)1);
 *
 *                                                      // look for Text String element
 * if (ProRespHdlr.findTLV(TAG_TEXT_STRING, (byte)1) == TLV_FOUND_CR_SET) {
 *     if ((short len = ProRespHdlr.getValueLength()) > 1) {
 *         // not empty string: to be copied
 *         ProRespHdlr.copyValue((short)1, data, (short)0, (short)(len - 1));
 *     }
 * }
 * </code></pre>
 *
 * @see        ViewHandler
 * @see        ProactiveHandler
 * @see        ToolkitException
 */
public interface ProactiveResponseHandler extends ViewHandler {

	// ------------------------------- Public methods ------------------------
	/**
	 * Returns the general result byte of the Proactive command.
	 * If the element is available it becomes the TLV selected, else no TLV selected.
	 *
	 * @return                       general result of the command (first byte of Result TLV in Terminal Response)
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable Result TLV element
	 *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if the general result byte is missing in the Result Comprehension TLV</ul>
	 */
	byte getGeneralResult() throws ToolkitException;


	/**
	 * Returns the length of the additional information field from the first
	 * Result TLV element of the current response data field.
	 * If the element is available it becomes the TLV selected, else no TLV is selected.
	 *
	 * @return                       additional information length
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable Result TLV element</ul>
	 */
	short getAdditionalInformationLength() throws ToolkitException;


	/**
	 * Copies a part of the additional information field from the first Result
	 * TLV element of the current response data field.
	 * If the element is available it becomes the TLV selected, else no TLV is selected.
	 *
	 * @param  dstBuffer                           a reference to the destination buffer
	 * @param  dstOffset                           the position in the destination buffer
	 * @param  dstLength                           the data length to be copied
	 * @return                                     <code>dstOffset+dstLength</code>
	 * @exception  NullPointerException            if <code>dstBuffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>dstOffset</code> or <code>dstLength</code>
	 *		or both would cause access outside array bounds
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable Result TLV element
	 *	    <li><code>OUT_OF_TLV_BOUNDARIES</code> if <code>dstLength</code> is greater than
	 *		the value field of the available TLV</ul>
	 */
	short copyAdditionalInformation(byte[] dstBuffer,
			short dstOffset,
			short dstLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;


	/**
	 * Returns the item identifier byte value from the first Item Identifier TLV
	 * element of the current response data field.
	 * If the element is available it becomes the TLV selected, else no TLV is selected.
	 *
	 * @return                       item identifier
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable Item Identifier TLV element
	 *		<li><code>OUT_OF_TLV_BOUNDARIES</code> if the item identifier byte is missing in the Item Identifier Comprehension TLV</ul>
	 */
	byte getItemIdentifier() throws ToolkitException;


	/**
	 * Returns the text string length value from the first Text String TLV
	 * element of the current response data field. The Data Coding Scheme byte
	 * is not taken into account.
	 * If the element is available it becomes the TLV selected, else no TLV is selected.
	 *
	 * @return                       text string length
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable Text String TLV element</ul>
	 */
	short getTextStringLength() throws ToolkitException;


	/**
	 * Returns the data coding scheme byte from the first Text String TLV
	 * element of the current response data field.
	 * If the element is available it becomes the TLV selected, else no TLV is selected.
	 *
	 * @return                       text string coding scheme
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable Text String TLV element
	 *	    <li><code>OUT_OF_TLV_BOUNDARIES</code> if the Text String TLV is present with a length
	 *	    of 0 (no DCS byte)</ul>
	 */
	byte getTextStringCodingScheme() throws ToolkitException;


	/**
	 * Copies the text string value from the first Text String TLV element of the
	 * current response data field. The Data Coding Scheme byte is not copied.
	 * If the element is available it becomes the TLV selected, else no TLV is selected.
	 *
	 * @param  dstBuffer                           a reference to the destination buffer
	 * @param  dstOffset                           the position in the destination buffer
	 * @return                                     <code>dstOffset</code> + length of the copied value
	 * @exception  NullPointerException            if <code>dstBuffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>dstOffset or dstOffset + (length of the TextString to be copied,
	 *      without the Data Coding Scheme included)</code>, as specified for the returned value, would cause access outside array bounds.
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable Text String TLV element</ul>
	 */
	short copyTextString(byte[] dstBuffer, short dstOffset)
			 throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;


	/**
	 * Returns the <code>channelIdentifier</code> value from the first Channel status TLV element in the current response data field.
	 * If the element is available it becomes the currently selected TLV, else no TLV is selected..
	 *
	 * @return                       <code>channelIdentifier</code>
	 * @exception  ToolkitException  - with the following reason codes:<ul>
	 *          <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element </ul>
	 *          <li><code>OUT_OF_TLV_BOUNDARIES</code> if the Comprehension TLV Channel Status length is equal to zero.</ul>
	 */
	byte getChannelIdentifier() throws ToolkitException;


	/**
	 * Returns the value of the first Channel Status TLV element whose channel identifier is equal
	 * to the <code>channelIdentifier</code> parameter.
	 * If the element is available it becomes the currently selected TLV element, else no TLV is selected.
	 *
	 * @param  channelIdentifier
	 * @return                       channel identifier and status : MSB = byte 1 of the Channel Status TLV value (byte 3 of the
	 * Channel Status TLV element), LSB = byte 2 of the Channel Status TLV value (byte 4 of the Channel
	 * Status TLV element).
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>UNAVAILABLE_ELEMENT</code> if no Channel Status TLV element with the right identifier could be found
	 *	    <li><code>OUT_OF_TLV_BOUNDARIES</code> if a Channel Status TLV element with the right
	 *                identifier could be found but its value is less than 2 bytes long </ul>
	 */
	short getChannelStatus(byte channelIdentifier) throws ToolkitException;


	/**
	 * Copies parts of the Channel data string field from the first Channel data TLV element of the current response data field.
	 * If the element is available it becomes the currently selected TLV, else no TLV is selected.
	 *
	 * @param  dstBuffer                           a reference to the destination buffer
	 * @param  dstOffset                           the position in the destination buffer
	 * @param  dstLength                           the data length to be copied
	 * @return                                     dstOffset+dstLength
	 * @exception  NullPointerException            - if dstBuffer is null
	 * @exception  ArrayIndexOutOfBoundsException - if dstOffset or dstLength or both would cause access outside array bounds
	 * @exception  ToolkitException - with the following reason codes:<ul>
	 *               <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable Result TLV element</li>
	 *               <li>>code>OUT_OF_TLV_BOUNDARIES</code> if <code>dstLength</code> is greater than the value field of the available TLV </ul>
	 */
	short copyChannelData(byte[] dstBuffer, short dstOffset, short dstLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;
}

