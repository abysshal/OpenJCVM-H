//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 * This class is the basic class for the construction of a list of Comprehension TLV elements.
 * This class is able to handle Comprehension TLV with a value field no longer than 255 bytes.
 *
 * @see        ViewHandler
 * @see        ProactiveHandler
 * @see        EnvelopeResponseHandler
 * @see        ToolkitException
 */
public interface EditHandler extends ViewHandler {

	// ------------------------------- Public methods -------------------------
	/**
	 * Clears the TLV list of an EditHandler and resets the current TLV selected.
	 *
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
	 */
	public void clear() throws ToolkitException;


	/**
	 * Appends a buffer into the EditHandler buffer.
	 * A successful append does not modify the TLV selected.
	 * The TLV list structure of the handler should be maintained by the applet in the
	 * appended array (e.g. the length of the TLV element should be coded according to ISO 7816-6),
	 * if the TLV manipulation methods are to be used afterwards with the handler.
	 *
	 * @param  buffer                              the buffer containing data for copy
	 * @param  offset                              the offset in the buffer
	 * @param  length                              the value length of the buffer
	 * @exception  NullPointerException            if <code>buffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>offset</code> or <code>length</code>
	 *      or both would cause access outside array bounds, or if <code>length</code> is negative.
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
	 */
	public void appendArray(byte[] buffer,
			short offset,
			short length) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;


	/**
	 * Appends a TLV element to the current TLV list (byte array format).
	 * A successful append does not modify the TLV selected.
	 *
	 * @param  tag                                 the tag of the TLV to append, including the Comprehension Required flag
	 * @param  value                               the buffer containing the TLV value
	 * @param  valueOffset                         the offset of the TLV value in the buffer
	 * @param  valueLength                         the value length of the TLV to append
	 * @exception  NullPointerException            if <code>value</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>valueOffset</code> or <code>valueLength</code>
	 *      or both would cause access outside array bounds, or if <code>value2Length</code> is negative.
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
	 *      <li><code>BAD_INPUT_PARAMETER</code> if <code>valueLength</code> is greater than 255</ul>
	 */
	public void appendTLV(byte tag,
			byte[] value,
			short valueOffset,
			short valueLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;


	/**
	 * Appends a TLV element to the current TLV list (1-byte element).
	 * This method is useful to add single byte elements as Item Identifier or Tone.
	 * A successful append does not modify the TLV selected.
	 *
	 * @param  tag                   the tag of the TLV to append, including the Comprehension Required flag
	 * @param  value                 the TLV value on 1 byte
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
	 */
	public void appendTLV(byte tag,
			byte value) throws ToolkitException;


	/**
	 * Appends a TLV element to the current TLV list (2-byte element).
	 * This method is useful to add a two bytes element.
	 * A successful append does not modify the TLV selected.
	 *
	 * @param  tag                   the tag of the TLV to append, including the Comprehension Required flag
	 * @param  value                 the 2 byte TLV value on 1 short
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
	 */
	public void appendTLV(byte tag,
			short value) throws ToolkitException;


	/**
	 * Appends a TLV element to the current TLV list (2-byte element)
	 * This method is useful to add double byte elements as Device Identities, Duration or
	 * Response Length. A successful append does not modify the TLV selected.
	 *
	 * @param  tag                   the tag of the TLV to append, including the Comprehension Required flag
	 * @param  value1                the 1st byte (msb) of the TLV value
	 * @param  value2                the 2nd byte (lsb) of the TLV value
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
	 */
	public void appendTLV(byte tag,
			byte value1,
			byte value2) throws ToolkitException;


	/**
	 * Appends a TLV element to the current TLV list (3-byte element(1-byte,1-short))
	 * This method is useful to add three byte elements as Command details or Display parameters
	 * A successful append does not modify the TLV selected.
	 *
	 * @param  tag                   the tag of the TLV to append, including the Comprehension Required flag
	 * @param  value1                the 1st byte (msb) of the TLV value
	 * @param  value2                the 2nd and 3rd byte on 1 short of the TLV value
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
	 */
	public void appendTLV(byte tag, byte value1, short value2) throws ToolkitException;


	/**
	 * Appends a TLV element to the current TLV list (4-byte element(2-short))
	 * This method is useful to add three byte elements as Text Attribute, ESN, or C-APDU.
	 * A successful append does not modify the TLV selected.
	 *
	 * @param  tag                   the tag of the TLV to append, including the Comprehension Required flag
	 * @param  value1                the 1st short (1st and 2nd byte) of the TLV value
	 * @param  value2                the 2nd short (3rd and 4th byte) the TLV value
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
	 */
	public void appendTLV(byte tag, short value1, short value2) throws ToolkitException;


	/**
	 * Appends a TLV element to the current TLV list (1 byte and a byte array format).
	 * A successful append does not modify the TLV selected.
	 *
	 * @param  tag                                 the tag of the TLV to append, including the Comprehension Required flag
	 * @param  value1                              the first byte in the value field
	 * @param  value2                              the buffer containing the rest of the TLV field
	 * @param  value2Offset                        the offset of the rest of the TLV field in the buffer
	 * @param  value2Length                        the value length of the rest of the TLV field to append
	 * @exception  NullPointerException            if <code>value2</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>value2Offset</code> or <code>value2Length</code>
	 *      or both would cause access outside array bounds, or if <code>value2Length</code> is negative.
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
	 *      <li><code>BAD_INPUT_PARAMETER</code> if <code>value2Length</code> is greater than 254</ul>
	 */
	public void appendTLV(byte tag,
			byte value1,
			byte[] value2,
			short value2Offset,
			short value2Length) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;

        /**
	 * Appends a TLV element to the current TLV list (2 byte arrays format).
	 * A successful append does not modify the TLV selected.
	 *
	 * @param  tag                                 the tag of the TLV to append, including the Comprehension Required flag
	 * @param  value1                              the buffer containing the first part of the value field
	 * @param  value1Offset                        the offset in value1 of the data to append 
	 * @param  value1Length                        the length in value1 of the data to append
	 * @param  value2                              the buffer containing the second part of the value field
	 * @param  value2Offset                        the offset in value2 of the data to append
	 * @param  value2Length                        the length in value2 of the data to append
	 * @exception  NullPointerException            if <code>value1</code> or <code>value2</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>value1Offset</code> or <code>value1Length</code>
	 *      or both would cause access outside value1 array bounds, or if <code>value1Length</code> is negative,
	 *	if <code>value2Offset</code> or <code>value2Length</code>
	 *      or both would cause access outside value2 array bounds, or if <code>value2Length</code> is negative. 
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>HANDLER_OVERFLOW</code> if the EditHandler buffer is to small to append the requested data
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
	 *      <li><code>BAD_INPUT_PARAMETER</code> if <code>value1Length</code> or <code>value2Length</code>is greater than 255</ul>
	 */
	public void appendTLV(byte tag,
			byte[] value1,
			short value1Offset,
			short value1Length,
			byte[] value2,
			short value2Offset,
			short value2Length) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;
}

