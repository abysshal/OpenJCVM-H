//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.access;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import javacard.framework.Shareable;

/**
 * The <code>FileView</code> interface defines the methods to access a UICC file system.
 * <br>
 *
 * All the methods are based on the commands of the TS 102 221 specification.
 * <pr>
 *
 * @see        UICCSystem
 */
public interface FileView extends Shareable {

	// ------------------------------- API methods ----------------------------
	/**
	 * This method selects a file of the UICC file system or of an ADF file system.
	 * The file search starts at the current DF of the FileView according to
	 * the file search method described in TS 102 221. The file context associated
	 * with the FileView object is changed after successful execution.
	 *
	 * This methods returns the FCP informations in form of a TLV structure as specified
	 * in TS 102 221.
	 *
	 * <p>
	 * Notes:<ul>
	 * <li><em>If </em><code>fcpOffset</code><em> or </em><code>fcpLength</code><em> parameter
	 * is negative an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown.</em>
	 * <li><em>If </em><code>fcpOffset+fcpLength</code><em> is greater than </em><code>fcp.length</code><em>, the length
	 * of the </em><code>fcp</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
	 * and no status is performed.</em>
	 * </ul>
	 *
	 *
	 * @param  fid                                 is the File Identifier of the file to be selected.
	 * @param  fcp                                 is the reference to the target byte array for information of current file, coding is according to TS 102.221.
	 * @param  fcpOffset                           is the offset in the <code>fcp</code> buffer for the response data.
	 * @param  fcpLength                           is the length of the required data in the <code>fcp</code> byte array.
	 *		  If the <code>fcpLength</code> is greater than the length of the response, the whole
	 *		  response is copied into the <code>fcp</code> buffer and the length of the response
	 *                is returned by the method. If the <code>fcpLength</code> is smaller than the length
	 *		  of the response, the first part of the response is copied into the <code>fcp</code>
	 *                buffer and the <code>fcpLength</code> is returned by the method.
	 * @return                                     length of the data which have been written in the <code>fcp</code> buffer
	 *               (cannot be greater than <code>fcpLength</code> parameter)
	 * @exception  NullPointerException            if <code>fcp</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if operation would cause access of data outside
	 *               array bounds.
	 * @exception  UICCException                   in case of error<ul>
	 *          <li><code>FILE_NOT_FOUND</code>
	 *          <li><code>MEMORY_PROBLEM</code>
	 *          <li><code>INTERNAL_ERROR</code>
	 *          <li><code>CONDITIONS_OF_USE_NOT_SATISFIED</code></ul>
	 */
	public short select(short fid,
			byte fcp[],
			short fcpOffset,
			short fcpLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			UICCException;


	/**
	 * This method selects a file of the UICC file system or of an ADF file system.
	 * The file search starts at the current DF of the FileView according to
	 * the file search method described in TS 102 221. The file context associated
	 * with the FileView object is changed after successful execution.
	 *
	 * This SELECT method allows to update the current file without handling the
	 * Select Response.
	 *
	 * @param  fid                is the File Identifier of the file to be selected.
	 * @exception  UICCException  in case of error<ul>
	 *          <li><code>FILE_NOT_FOUND</code>
	 *          <li><code>MEMORY_PROBLEM</code>
	 *          <li><code>INTERNAL_ERROR</code>
	 *          <li><code>CONDITIONS_OF_USE_NOT_SATISFIED</code></ul>
	 */
	public void select(short fid) throws UICCException;
	
	/**
         * This method selects a file by SFI in the current directory of the FileView.<br>
         * The file context associated with the FileView object is changed after 
         * successful execution.
         *
         * This SELECT method allows to update the current file without handling the
         * Select Response.
         *
         * @param  sfi                is the Short File Identifier of the file to be selected.
         * @exception  UICCException  in case of error<ul>
         *          <li><code>FILE_NOT_FOUND</code> if a file with the corresponding SFI is not found or if the <code>sfi</code> parameter is invalid.
         *          <li><code>MEMORY_PROBLEM</code>
         *          <li><code>INTERNAL_ERROR</code>
	 *          <li><code>CONDITIONS_OF_USE_NOT_SATISFIED</code></ul>
         */
        public void select(byte sfi) throws UICCException;


	/**
	 * This method returns the FCP (File Control Parameter) of the current selected DF.
	 *
	 * <p>
	 * Notes:<ul>
	 * <li><em>If </em><code>fcpOffset</code><em> or </em><code>fcpLength</code><em> parameter
	 * is negative an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown.</em>
	 * <li><em>If </em><code>fcpOffset+fcpLength</code><em> is greater than </em><code>fcp.length</code><em>, the length
	 * of the </em><code>fcp</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
	 * and no status is performed.</em>
	 * </ul>
	 *
	 * @param  fcp                                 is the reference to the target byte array for FCP (File Control
	 *        Parameter) of current DF (or MF), coding is according to TS 102.221.
	 * @param  fcpOffset                           is the offset in the <code>fcp</code> buffer for the response data.
	 * @param  fcpLength                           is the length of the required data in the <code>fcp</code> byte array.
	 *		  If the <code>fcpLength</code> is greater than the length of the response, the whole
	 *		  response is copied into the <code>fcp</code> buffer and the length of the response
	 *            is returned by the method. If the <code>fcplength</code> is smaller than the length
	 *		  of the response, the first part of the response is copied into the <code>fcp</code>
	 *            buffer and the <code>fcpLength</code> is returned by the method.
	 * @return                                     length of the data which have been written in the <code>fcp</code> buffer
	 *         (cannot be greater than <code>fcpLength</code> parameter)
	 * @exception  NullPointerException            if <code>fcp</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if operation would cause access of data outside
	 *            array bounds.
	 * @exception  UICCException                   in case of error <ul>
	 *          <li><code>MEMORY_PROBLEM</code>
	 *      	<li><code>INTERNAL_ERROR</code></ul>
	 */
	public short status(byte fcp[],
			short fcpOffset,
			short fcpLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			UICCException;


	/**
	 * This method reads the data bytes of the current transparent EF.
	 *
	 * <p>
	 * Notes:<ul>
	 * <li><em>If </em><code>respOffset</code><em> or </em><code>respLength</code><em> parameter
	 * is negative an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown.</em>
	 * <li><em>If </em><code>respOffset+respLength</code><em> is greater than </em><code>resp.length</code><em>, the length
	 * of the </em><code>resp</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
	 * and no read is performed.</em>
	 * </ul>
	 *
	 * @param  fileOffset                          is the offset in the source transparent file.
	 * @param  resp                                is the reference to the response byte array for read data.
	 * @param  respOffset                          is the offset in the response byte array.
	 * @param  respLength                          is the number of bytes to read.
	 * @return                                     <code>respOffset+respLength</code>
	 * @exception  NullPointerException            if <code>resp</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if reading would cause access of data outside array bounds
	 * @exception  UICCException                   in case of error <ul>
	 *      	<li><code>INTERNAL_ERROR</code>
	 *          <li><code>OUT_OF_FILE_BOUNDARIES</code>
	 *          <li><code>COMMAND_INCOMPATIBLE</code>
	 *          <li><code>SECURITY_STATUS_NOT_SATISFIED</code>
	 *          <li><code>REF_DATA_INVALIDATED</code>
	 *          <li><code>NO_EF_SELECTED</code>
	 *          <li><code> COMMAND_NOT_ALLOWED </code> if the referenced file is terminated</ul>
	 */
	public short readBinary(short fileOffset,
			byte resp[],
			short respOffset,
			short respLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			UICCException;


	/**
	 * This method updates the data bytes of the current transparent EF.
	 *
	 * <p>
	 * Notes:<ul>
	 * <li><em>If </em><code>dataOffset</code><em> or </em><code>dataLength</code><em> parameter
	 * is negative an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown.</em>
	 * <li><em>If </em><code>dataOffset+dataLength</code><em> is greater than </em><code>data.length</code><em>, the length
	 * of the </em><code>data</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
	 * and no update is performed.</em>
	 * </ul>
	 *
	 * @param  fileOffset                          is the offset in the destination transparent file.
	 * @param  data                                is the reference to the source byte array for data to update.
	 * @param  dataOffset                          is the offset in the data byte array.
	 * @param  dataLength                          is the number of bytes to update.
	 * @exception  NullPointerException            if <code>data</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if updating would cause access of data outside array bounds
	 * @exception  UICCException                   in case of error<ul>
	 *          <li><code>MEMORY_PROBLEM</code>
	 *          <li><code>INTERNAL_ERROR</code>
	 *          <li><code>COMMAND_INCOMPATIBLE</code>
	 *          <li><code>SECURITY_STATUS_NOT_SATISFIED</code>
	 *          <li><code>REF_DATA_INVALIDATED</code>
	 *          <li><code>NO_EF_SELECTED</code>
	 *          <li><code>OUT_OF_FILE_BOUNDARIES</code>
	 *          <li><code> COMMAND_NOT_ALLOWED </code> if the referenced file is terminated</ul>
	 */
	public void updateBinary(short fileOffset,
			byte data[],
			short dataOffset,
			short dataLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			UICCException;


	/**
	 * This method reads a record or a part of a record of the current linear fixed/cyclic EF
	 * of the calling applet into the given byte array.
	 * The current record pointer can be changed due to the chosen mode.
	 *
	 * <p>
	 * Notes:<ul>
	 * <li><em>If </em><code>respOffset</code><em> or </em><code>respLength</code><em> parameter
	 * is negative an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown.</em>
	 * <li><em>If </em><code>respOffset+respLength</code><em> is greater than </em><code>resp.length</code><em>, the length
	 * of the </em><code>resp</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
	 * and no read is performed.</em>
	 * <ul>
	 * </ul>
	 * </ul>
	 *
	 * @param  recNumber                           is the record number (for absolute mode only)
	 * @param  mode                                is the mode for reading record
	 * @param  recOffset                           is the offset in the record for the data to read.
	 * @param  resp                                is the reference to the response byte array for read data.
	 * @param  respOffset                          is the offset in the response byte array.
	 * @param  respLength                          is the number of bytes to read.
	 * @return                                     <code>respOffset+respLength</code>
	 * @exception  NullPointerException            if <code>resp</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if reading would cause access of data outside array bounds
	 * @exception  UICCException                   in case of error <ul>
	 *          <li><code>OUT_OF_RECORD_BOUNDARIES<code>
	 *          <li><code>INTERNAL_ERROR</code>
	 *          <li><code>COMMAND_INCOMPATIBLE<code>
	 *          <li><code>SECURITY_STATUS_NOT_SATISFIED</code>
	 *          <li><code>REF_DATA_INVALIDATED</code>
	 *          <li><code>NO_EF_SELECTED</code>
	 *          <li><code>INVALID_MODE</code>
	 *          <li><code>RECORD_NOT_FOUND</code>
	 *          <li><code> COMMAND_NOT_ALLOWED </code> if the referenced file is terminated</ul>
	 */
	public short readRecord(short recNumber,
			byte mode,
			short recOffset,
			byte resp[],
			short respOffset,
			short respLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			UICCException;


	/**
	 * This method updates the data bytes of the record of the current linear fixed/cyclic EF.
	 * The current record pointer can be changed due to the chosen mode.
	 * <p>
	 * Notes:<ul>
	 * <li><em>If </em><code>dataOffset</code><em> or </em><code>dataLength</code><em> parameter
	 * is negative an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown.</em>
	 * <li><em>If </em><code>dataOffset+dataLength</code><em> is greater than </em><code>data.length</code><em>, the length
	 * of the </em><code>data</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
	 * and no update is performed.</em>
	 * </ul>
	 *
	 * @param  recNumber                           is the record number, if null then mode is used
	 * @param  mode                                is the mode for updating record, if <code>recNumber</code> is given then mode is in ABSOLUTE mode
	 * @param  recOffset                           is the offset in the record for the data to update.
	 * @param  data                                is the reference to the source byte array for data to update.
	 * @param  dataOffset                          is the offset in the source byte array.
	 * @param  dataLength                          is the number of bytes to update.
	 * @exception  NullPointerException            if <code>data</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if updating would cause access of data outside array bounds
	 * @exception  UICCException                   in case of error<ul>
	 *          <li><code>COMMAND_INCOMPATIBLE<code>
	 *          <li><code>SECURITY_STATUS_NOT_SATISFIED</code>
	 *          <li><code>REF_DATA_INVALIDATED</code>
	 *          <li><code>OUT_OF_RECORD_BOUNDARIES</code>
	 *          <li><code>RECORD_NOT_FOUND</code>
	 *          <li><code>NO_EF_SELECTED</code><
	 *          <li><code>MEMORY_PROBLEM</code>
	 *          <li><code>INVALID_MODE</code>
	 *          <li><code>INTERNAL_ERROR</code>
	 *          <li><code> COMMAND_NOT_ALLOWED </code> if the referenced file is terminated</ul>
	 */
	public void updateRecord(short recNumber,
			byte mode,
			short recOffset,
			byte data[],
			short dataOffset,
			short dataLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			UICCException;


	/**
	 * This method searches a pattern in the current linear fixed/cyclic EF.
	 *
	 * <p>
	 * Notes:<ul>
	 * <li><em>If </em><code>patOffset</code><em> or </em><code>pattLength</code><em><em> or </em><code>respOffset</code> or </em><code>respLength</code>parameter
	 * is negative an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown.</em>
	 * <li><em>If </em><code>pattOffset+pattLength</code><em> is greater than </em><code>patt.length</code><em>, the length
	 * of the </em><code>patt</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
	 * and no search is performed.</em>
	 * <li><em>If </em><code>respOffset+respLength</code><em> is greater than </em><code>response.length</code><em>, the length
	 * of the </em><code>response</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
	 * and no search is performed.</em>
	 * </ul>
	 *
	 * @param  mode                                is the search mode, according to TS 102.221 (no type information).
	 * @param  recordNum                           is the record number to start the search, 0 indicates from the current record
	 * @param  searchIndication                    indication of the search mode for the enhanced search
	 * @param  patt                                is the reference to the byte array containing the search pattern.
	 * @param  pattOffset                          is the offset of the search pattern in the byte array.
	 * @param  pattLength                          is the length of the search pattern.
	 * @param  response                            reference to response array to hold the record numbers
	 * @param  respOffset                          is the offset into the response array to store the record numbers
	 * @param  respLength                          - is the maximum number of elements to be copied into the response array.
	 *                     If the <code>respLength</code> is greater than the number of records found, the whole response
	 *                     is copied into the response buffer and the number of elements copied is returned by the method.
	 *                     If the <code>respLength</code> is smaller than the number of records found, the first respLength record
	 *                     numbers are copied into the response buffer and <code>respLength</code> is returned by the method.
	 * @return                                     number of array elements copied into the response array. Returns 0 if no record containing containing the pattern was found.
	 * @exception  NullPointerException            if <code>patt</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if searching would cause access of data outside array bounds
	 * @exception  UICCException                   in case of error<ul>
	 *          <li><code>INTERNAL_ERROR</code>
	 *          <li><code>OUT_OF_RECORD_BOUNDARIES</code>if <code>pattLength</code>is greater than the record size
	 *          <li><code>COMMAND_INCOMPATIBLE<code>
	 *          <li><code>SECURITY_STATUS_NOT_SATISFIED</code>
	 *          <li><code>REF_DATA_INVALIDATED</code>
	 *          <li><code>NO_EF_SELECTED</code>
	 *          <li><code>RECORD_NOT_FOUND</code>: record with number recordNum not found in file
	 *          <li><code>INVALID_MODE</code>
	 *          <li><code> COMMAND_NOT_ALLOWED </code> if the referenced file is terminated</ul>
	 */
	public short searchRecord(byte mode,
			short recordNum,
			short searchIndication,
			byte[] patt,
			short pattOffset,
			short pattLength,
			short[] response,
			short respOffset,
			short respLength) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			UICCException;


	/**
	 * This method increases the current cyclic EF record, as defined in TS 102 221.In addition to the behaviour defined in TS 102 221, 
	 * the following rule applies: If the parameter incrLength is set to 0, the current value of the last increased  or updated record 
	 * is stored into the oldest record of the current cyclic EF. The record pointer is set to the oldest record and this record becomes 
	 * record number 1.
	 * The response buffer will contain the value of the increased record.
	 *
	 * <p>
	 * Notes:<ul>
	 * <li><em>If </em><code>incrOffset</code><em> or </em><code>incrLength</code><em><em> or </em><code>respOffset</code> parameter
	 * is negative an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown.</em>
	 * <li><em>If </em><code>incrOffset+incrLength</code><em> is greater than </em><code>increase.length</code><em>, the length
	 * of the </em><code>increase</code><em> array an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
	 * and no increase is performed.</em>
	 * <li><em>If </em><code>respOffset</code><em> is greater than </em><code>response.length</code><em>, the length
	 * of the </em><code>response</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
	 * and no increase is performed.</em>
	 * </ul>
         *
	 *
	 * @param  incr                                is the reference to the source byte array, containing the value to increase.
	 *             The increase is only performed if the result would not exceed the maximum value of
	 *             the record.
	 * @param  incrOffset                          is the offset in the source byte array.
	 * @param  incrLength                          is the length of the data in the <code>incr</code> array, 0<= <code>incrLength</code> <128
	 * @param  resp                                is the reference to the response byte array for the new record value.
	 *        If <code>resp</code> buffer is bigger than the record size, the <code>resp</code> buffer is filled
	 *        with the record value and left justified.
	 * @param  respOffset                          is the offset in the response byte array.
	 * @return                                     length of the valid data in the resp buffer
	 * @exception  NullPointerException            if <code>incr</code> or <code>resp</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if increasing would cause access of data outside array bounds
	 * @exception  UICCException                   in case of error<ul>
	 *          <li><code>NO_EF_SELECTED</code>
	 *          <li><code>MEMORY_PROBLEM</code>
	 *          <li><code>INTERNAL_ERROR</code>
	 *          <li><code>COMMAND_INCOMPATIBLE<code>
	 *          <li><code>SECURITY_STATUS_NOT_SATISFIED</code>
	 *          <li><code>REF_DATA_INVALIDATED</code>
	 *          <li><code>RECORD_NOT_FOUND</code>
	 *          <li><code>MAX_VALUE_REACHED</code>
	 *          <li><code> COMMAND_NOT_ALLOWED </code> if the referenced file is terminated</ul>
	 */
	public short increase(byte[] incr,
			short incrOffset,
			short incrLength,
			byte[] resp,
			short respOffset) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			UICCException;


	/**
	 * This method deactivates the currently selected EF.
	 * No exception shall be thrown when deactivating an already deactivated EF.
	 *
	 * @exception  UICCException  in case of error<ul>
	 *          <li><code>NO_EF_SELECTED</code>
	 *          <li><code>SECURITY_STATUS_NOT_SATISFIED</code>
	 *          <li><code>INTERNAL_ERROR</code>
	 *          <li><code> COMMAND_NOT_ALLOWED </code> if the referenced file is terminated</ul>
	 */
	public void deactivateFile() throws UICCException;


	/**
	 * This method activates a deactivated EF.
	 * No exception shall be thrown when activating an already activated EF.
	 *
	 * @exception  UICCException  in case of error <ul>
	 *          <li><code>NO_EF_SELECTED</code>
	 *          <li><code>SECURITY_STATUS_NOT_SATISFIED</code>
	 *          <li><code>INTERNAL_ERROR</code>
	 *          <li><code> COMMAND_NOT_ALLOWED </code> if the referenced file is terminated</ul>
	 */
	public void activateFile() throws UICCException;
}

