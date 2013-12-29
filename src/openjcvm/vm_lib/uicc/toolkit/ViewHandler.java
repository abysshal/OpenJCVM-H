//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 * The <code>ViewHandler</code> class offers basic services and contains basic methods to handle
 * a Comprehension TLV List, such as in a <b>Terminal Response</b> data field or in a BER-TLV
 * element (<b>Envelope</b> data field or <b>Proactive</b> command).
 * The byte at offset 0 of a handler is the tag of the first Comprehension TLV.
 *
 * @see        ToolkitException
 */
public interface ViewHandler {

	// ------------------------------- Public methods -------------------------
	/**
	 * Returns the length of the TLV list.
	 *
	 * @return                       length in bytes
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *          <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
	 */
	public short getLength() throws ToolkitException;


	/**
	 * Copies the Comprehension TLV list contained in the handler to the destination byte array.
	 *
	 * @param  dstBuffer                           a reference to the destination buffer
	 * @param  dstOffset                           the position in the destination buffer
	 * @param  dstLength                           the data length to be copied
	 * @return                                     <code>dstOffset+dstLength</code>
	 * @exception  NullPointerException            if <code>dstBuffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>dstOffset</code> or <code>dstLength</code>
	 *      or both would cause access outside array bounds, or if <code>dstLength</code> is negative.
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
	 *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if <code>dstLength</code> is grater than the length of the Comprehension TLV List.</ul>
	 */
	public short copy(byte[] dstBuffer,
			short dstOffset,
			short dstLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;


	/**
	 * Looks for the indicated occurrence of a TLV element from the beginning of
	 * the TLV list (handler buffer). If the method is successful then the
	 * corresponding TLV becomes current, else no TLV is selected.
	 * This search method is Comprehension Required flag independent.
	 *
	 * @param  tag                   the tag of the TLV element to search
	 * @param  occurrence            the occurrence number of the TLV element (1 for the first, 2 for the second...)
	 * @return                       result of the method: <ul>
	 *      <li><code>TLV_NOT_FOUND</code> if the required occurrence of the TLV element does not exist
	 *      <li><code>TLV_FOUND_CR_SET</code> if the required occurrence exists and Comprehension Required flag is set
	 *      <li><code>TLV_FOUND_CR_NOT_SET</code> if the required occurrence exists and Comprehension Required flag is not set</ul>
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
	 *      <li><code>BAD_INPUT_PARAMETER</code> if an input parameter is not valid (e.g. occurrence = 0)</ul>
	 */
	public byte findTLV(byte tag, byte occurrence) throws ToolkitException;


	/**
	 * Gets the binary length of the value field for the last TLV element which has
	 * been found in the handler.
	 *
	 * @return                       length of the value field
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element</ul>
	 */
	public short getValueLength() throws ToolkitException;


	/**
	 * Gets a byte from the last TLV element which has been found in the handler.
	 *
	 * @param  valueOffset           the offset of the byte to return in the TLV element
	 * @return                       element value (1 byte)
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element
	 *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if <code>valueOffset</code> is out of the current TLV </ul>
	 */
	public byte getValueByte(short valueOffset) throws ToolkitException;


	/**
	 * Gets a short from the last TLV element which has been found in the handler.
	 *
	 * @param  valueOffset           the offset of the short to return in the TLV element
	 * @return                       element value (1 short)
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element
	 *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if <code>valueOffset</code> is out of the current TLV </ul>
	 */
	public short getValueShort(short valueOffset) throws ToolkitException;


	/**
	 * Copies a part of the last TLV element which has been found, into a
	 * destination buffer.
	 *
	 * @param  valueOffset                         the offset of the first byte in the source TLV element
	 * @param  dstBuffer                           a reference to the destination buffer
	 * @param  dstOffset                           the position in the destination buffer
	 * @param  dstLength                           the data length to be copied
	 * @return                                     <code>dstOffset+dstLength</code>
	 * @exception  NullPointerException            if <code>dstBuffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>dstOffset</code> or <code>dstLength</code>
	 *      or both would cause access outside array bounds, or if <code>dstLength</code> is negative.
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element
	 *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if <code>valueOffset</code>, <code>dstLength</code> or both are out of the current TLV </ul>
	 */
	public short copyValue(short valueOffset,
			byte[] dstBuffer,
			short dstOffset,
			short dstLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;


	/**
	 * Compares the last found TLV element with a buffer.
	 *
	 * @param  valueOffset                         the offset of the first byte to compare in the TLV element
	 * @param  compareBuffer                       a reference to the comparison buffer
	 * @param  compareOffset                       the position in the comparison buffer
	 * @param  compareLength                       the length to be compared
	 * @return                                     the result of the comparison as follows: <ul>
	 *      <li><code>0</code> if identical
	 *      <li><code>-1</code> if the first miscomparing byte in Comprehension TLV List is less than that in <code>compareBuffer</code>,
	 *      <li><code>1</code> if the first miscomparing byte in Comprehension TLV List is greater than that in <code>compareBuffer</code>.</ul>
	 * @exception  NullPointerException            if <code>compareBuffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>compareOffset</code> or <code>compareLength</code>
	 *		or both would cause access outside array bounds, or if <code>compareLength</code> is negative.
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element
	 *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if <code>valueOffset</code>, <code>compareLength</code> or both are out of the current TLV </ul>
	 */
	public byte compareValue(short valueOffset,
			byte[] compareBuffer,
			short compareOffset,
			short compareLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;


	/**
	 * Looks for the first occurrence of a TLV element from the beginning of a TLV
	 * list and copy its value into a destination buffer.
	 * If no TLV element is found, the <code>UNAVAILABLE_ELEMENT</code> exception is thrown.
	 * If the method is successful then the corresponding TLV becomes current,
	 * else no TLV is selected.
	 * This search method is Comprehension Required flag independent.
	 *
	 * @param  tag                                 the tag of the TLV element to search
	 * @param  dstBuffer                           a reference to the destination buffer
	 * @param  dstOffset                           the position in the destination buffer
	 * @return                                     <code>dstOffset</code> + length of the copied value
	 * @exception  NullPointerException            if <code>dstBuffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>dstOffset</code> would cause access outside array bounds
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element</ul>
	 */
	public short findAndCopyValue(byte tag,
			byte[] dstBuffer,
			short dstOffset) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;


	/**
	 * Looks for the indicated occurrence of a TLV element from the beginning of a TLV
	 * list and copy its value into a destination buffer.
	 * If no TLV element is found, the <code>UNAVAILABLE_ELEMENT</code> exception is thrown.
	 * If the method is successful then the corresponding TLV becomes current,
	 * else no TLV is selected.
	 * This search method is Comprehension Required flag independent.
	 *
	 * @param  tag                                 the tag of the TLV element to search
	 * @param  valueOffset                         the offset of the first byte in the source TLV element
	 * @param  dstBuffer                           a reference to the destination buffer
	 * @param  dstOffset                           the position in the destination buffer
	 * @param  dstLength                           the data length to be copied
	 * @param  occurrence                          the occurrence number of the TLV element (1 for the first, 2 for the second ...)
	 * @return                                     <code>dstOffset + dstLength</code>
	 * @exception  NullPointerException            if <code>dstBuffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>dstOffset</code> or <code>dstLength</code>
	 *	    or both would cause access outside array bounds, or if <code>dstLength</code> is negative.
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element
	 *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if <code>valueOffset</code>, <code>dstLength</code> or both are out of the current TLV
	 *      <li><code>BAD_INPUT_PARAMETER</code> if an input parameter is not valid (e.g. <code>occurrence = 0</code>)</ul>
	 */
	public short findAndCopyValue(byte tag,
			byte occurrence,
			short valueOffset,
			byte[] dstBuffer,
			short dstOffset,
			short dstLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;


	/**
	 * Looks for the first occurrence of a TLV element from beginning of a TLV
	 * list and compare its value with a buffer.
	 * If no TLV element is found, the <code>UNAVAILABLE_ELEMENT</code> exception is thrown.
	 * If the method is successful then the corresponding TLV becomes current,
	 * else no TLV is selected.
	 * This search method is Comprehension Required flag independent.
	 *
	 * @param  tag                                 the tag of the TLV element to search
	 * @param  compareBuffer                       a reference to the comparison buffer
	 * @param  compareOffset                       the position in the comparison buffer
	 * @return                                     the result of the comparison as follows: <ul>
	 *      <li><code>0</code> if identical
	 *      <li><code>-1</code> if the first miscomparing byte in Comprehension TLV is less than that in <code>compareBuffer</code>,
	 *      <li><code>1</code> if the first miscomparing byte in Comprehension TLV is greater than that in <code>compareBuffer</code>.</ul>
	 * @exception  NullPointerException            if <code>compareBuffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>compareOffset</code> would cause access outside array bounds
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element</ul>
	 */
	public byte findAndCompareValue(byte tag,
			byte[] compareBuffer,
			short compareOffset) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;


	/**
	 * Looks for the indicated occurrence of a TLV element from the beginning of a
	 * TLV list and compare its value with a buffer.
	 * If no TLV element is found, the <code>UNAVAILABLE_ELEMENT</code> exception is thrown.
	 * If the method is successful then the corresponding TLV becomes current,
	 * else no TLV is selected.
	 * This search method is Comprehension Required flag independent.
	 *
	 * @param  tag                                 the tag of the TLV element to search
	 * @param  valueOffset                         the offset of the first byte in the source TLV element
	 * @param  compareBuffer                       a reference to the comparison buffer
	 * @param  compareOffset                       the position in the comparison buffer
	 * @param  compareLength                       the length to be compared
	 * @param  occurrence                          the occurrence number of the TLV element (1 for the first, 2 for the second ...)
	 * @return                                     the result of the comparison as follows: <ul>
	 *      <li><code>0</code> if identical
	 *      <li><code>-1</code> if the first miscomparing byte in Comprehension TLV is less than that in <code>compareBuffer</code>,
	 *      <li><code>1</code> if the first miscomparing byte in Comprehension TLV is greater than that in <code>compareBuffer</code>.</ul>
	 * @exception  NullPointerException            if <code>compareBuffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>compareOffset</code> or <code>compareLength</code>
	 *		or both would cause access outside array bounds, or if <code>compareLength</code> is negative.
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy
	 *      <li><code>UNAVAILABLE_ELEMENT</code> in case of unavailable TLV element
	 *      <li><code>OUT_OF_TLV_BOUNDARIES</code> if <code>valueOffset</code>, <code>compareLength</code> or both are out of the current TLV
	 *      <li><code>BAD_INPUT_PARAMETER</code> if an input parameter is not valid (e.g. <code>occurence = 0</code>)</ul>
	 */
	public byte findAndCompareValue(byte tag,
			byte occurrence,
			short valueOffset,
			byte[] compareBuffer,
			short compareOffset,
			short compareLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException;


	/**
	 * Returns the maximum size of the Comprehension TLV list managed by the handler.
	 *
	 * @return                       size in byte
	 * @exception  ToolkitException  - with the following reason codes: </ul>
	 *            </li>HANDLER_NOT_AVAILABLE if the handler is busy </ul>
	 */
	public short getCapacity() throws ToolkitException;
}

