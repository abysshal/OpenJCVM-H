
package uicc.access.bertlvfile;

import uicc.access.FileView;

/**
 * The <code>BERTLVFileView</code> interface defines the methods to access BER TLV files.
 * <br>
 *
 * All the methods are based on the commands of the TS 102 221 specification.
 * <pr>
 */

public interface BERTLVFileView extends FileView {

	/**
	 * This method retrieves a part of a data object from the current BER-TLV structure EF.
	 *
	 * <p>
	 * Notes:<ul>
	 * <li><em>The TAG and Length of the requested data object are not copied in 
         * </em><code>responseBuffer</code>
         *
         * <li><em>After a successful call to this method, current TAG pointer and current offset
         * in the data object are undefined</em>
	 *
	 * <li><em>If </em><code>responseOffset</code><em> or </em><code>responseLength</code><em> parameter
	 * is negative an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown.</em>
	 *
	 * <li><em>If </em><code>responseOffset+responseLength</code><em> is greater than </em><code>responseBuffer.length</code><em>, the length
	 * of the </em><code>responseBuffer</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
	 * and no read is performed.
	 *
	 * <li>If </em><code>tag</code><em> value is invalid or is equal to ‘5C’, an
         *  </em><code>UICCException</code<em> with reason code
         * </em><code>INVALID_TAG_VALUE</code><em> is thrown
	 * </em></ul>
	 *
	 * @return                                     Number of remaining bytes to read
	 * @param  tag                          is the TAG value of TLV object that shall be retrieved. 
	 * @param dataObjectOffset                 is the offset in the data object.
	 * @param  responseBuffer                                is the reference to the response byte array for read data.
	 * @param  responseOffset                          is the offset in the response byte array.
	 * @param  responseLength                          is the number of bytes to read. 
	 * 
	 * @exception  NullPointerException            if <code>responseBuffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if reading would cause access of data outside array bounds
	 * @exception  UICCException                   in case of error <ul>
	 *      	<li><code>INTERNAL_ERROR</code>
	 *          <li><code>COMMAND_INCOMPATIBLE</code>
	 *          <li><code>SECURITY_STATUS_NOT_SATISFIED</code>
	 *          <li><code>REF_DATA_INVALIDATED</code>
	 *          <li><code>NO_EF_SELECTED</code>
	 *          <li><code>REFERENCED_DATA_NOT_FOUND</code>
	 *          <li><code>CONDITIONS_OF_USE_NOT_SATISFIED</code>
	 *          <li><code>OUT_OF_DATA_BOUNDARIES</code>
         *	    <li><code>INVALID_TAG_VALUE</code></ul>
	 */
    public int retrieveData(int tag, int dataObjectOffset, byte[] responseBuffer, short responseOffset, short responseLength) ;



	/**
	 * This method gets the list of TAGs already allocated in the current BER-TLV structure EF.
	 *
	 * <p>
	 * Notes:<ul>
         * <li><em>After a successful call to this method, current TAG pointer and current offset
         * in the data object are undefined</em>
         *
	 * <li><em>If </em><code>responseOffset</code><em> or </em><code>responseLength</code><em> parameter
	 * is negative an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown.</em>
	 *
	 * <li><em>If </em><code>responseOffset+responseLength</code><em> is greater than </em><code>responseBuffer.length</code><em>, the length
	 * of the </em><code>responseBuffer</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
	 * and no operation is performed.</em>
	 * </ul>
	 *
	 * @param mode                 is the mode to be used (UICCConstants.BER_TLV_ACC_MODE_FIRST or UICCConstants.BER_TLV_ACC_MODE_NEXT)
	 * @param  responseBuffer                                is the reference to the response int array for read data. 
	 *      Each component of  the <code>responseBuffer</code>array contains a single TAG.
	 * @param  responseOffset                          is the offset in the response int array.
	 * @param  responseLength                          is the number of TAGs to read. 
	 * 
	 * @return                                     Number of remaining TAGs to read
	 * @exception  NullPointerException            if <code>responseBuffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if reading would cause access of data outside array bounds
	 * @exception  UICCException                   in case of error <ul>
	 *      	<li><code>INTERNAL_ERROR</code>
	 *          <li><code>COMMAND_INCOMPATIBLE</code>
	 *          <li><code>SECURITY_STATUS_NOT_SATISFIED</code>
	 *          <li><code>REF_DATA_INVALIDATED</code>
	 *          <li><code>NO_EF_SELECTED</code>
	 *          <li><code>INVALID_MODE</code>
	 *          <li><code>CONDITIONS_OF_USE_NOT_SATISFIED</code>
	 *          <li><code>OUT_OF_DATA_BOUNDARIES</code></ul>
	 */
    public int getTAGList(byte mode, int[] responseBuffer, short responseOffset, short responseLength) ;


	/**
	 * This method sets a data object in the current BER-TLV structure EF.
	 *
	 * <p>
	 * Notes:<ul>
         * <li><em>A transfer ends immediately after the end of the data object is reached (last
         * successful call to this method).</em>
         *
         * <li><em>As long as the transfer is not complete, the data object is not available for other entities.</em>
	 *
	 * <li><em>If </em><code>offset</code><em> or </em><code>length</code><em> parameter
	 * is negative an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown.</em>
	 *
	 * <li><em>If </em><code>offset+length</code><em> is greater than </em><code>data.length</code><em>, the length
	 * of the </em><code>data</code><em> array a </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
	 * and no update is performed.
	 *
	 * <li>If </em><code>mode</code><em> is </em><code>BER_TLV_ACC_MODE_FIRST</code><em> and </em><code>dataLength</code><em> is equal to 0, a zero length object is created.
	 *
	 * <li>If </em><code>tag</code><em> value is invalid or is equal to ‘5C’, an
         *  </em><code>UICCException</code<em> with reason code
         * </em><code>INVALID_TAG_VALUE</code><em> is thrown
	 * </em></ul>
	 *
	 * @param  tag        is the TAG value of TLV object that shall be set. The value is not significant if
	 *                    code>mode</code> parameter is set to UICCConstants.BER_TLV_ACC_MODE_NEXT.
	 * @param mode        is the mode to be used (UICCConstants.BER_TLV_ACC_MODE_FIRST or UICCConstants.BER_TLV_ACC_MODE_NEXT)
	 * @param dataLength  is the length of the value field of the BER-TLV data object. The value is not significant if
	 *                    <code>mode</code> parameter is set to UICCConstants.BER_TLV_ACC_MODE_NEXT.
	 * @param  data       is the reference to the data byte array.
	 * @param  offset     is the offset in the data byte array.
	 * @param  length     is the number of bytes to set. 
	 * 
	 * @return            Number of remaining bytes to set
	 * 
	 * @exception  NullPointerException            if <code>responseBuffer</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if reading would cause access of data outside array bounds
	 * @exception  UICCException                   in case of error <ul>
	 *          <li><code>INTERNAL_ERROR</code>
	 *          <li><code>COMMAND_INCOMPATIBLE</code>
	 *          <li><code>SECURITY_STATUS_NOT_SATISFIED</code>
	 *          <li><code>NO_EF_SELECTED</code>
	 *          <li><code>INVALID_MODE</code>
	 *          <li><code>MEMORY_PROBLEM</code>
	 *          <li><code>REFERENCED_DATA_NOT_FOUND</code>
	 *          <li><code>NOT_ENOUGH_MEMORY_SPACE</code>
	 *          <li><code>CONDITIONS_OF_USE_NOT_SATISFIED</code>
	 *          <li><code>OUT_OF_DATA_BOUNDARIES</code>
         *          <li><code> INVALID_TAG_VALUE </code></ul>
	 */
         public int setData(int tag, byte mode, int dataLength, byte[] data, short offset, short length) ;



	/**
	 * This method deletes a data object in the current BER-TLV structure EF.
	 * <p>
	 * Notes:<ul>
         * <li><em>After a successful call to this method, current TAG pointer and current offset
         * in the data object are undefined</em>
	 *
	 * <li>If </em><code>tag</code><em> value is invalid or is equal to ‘5C’, an
         *  </em><code>UICCException</code<em> with reason code
         * </em><code> INVALID_TAG_VALUE </code><em> is thrown
	 * </em></ul>
	 *
	 * @param  tag is the TAG value of TLV object that shall be deleted.
	 * 
	 * @exception  UICCException  in case of error <ul>
	 *          <li><code>INTERNAL_ERROR</code>
         *          <li><code>COMMAND_INCOMPATIBLE</code>
	 *          <li><code>SECURITY_STATUS_NOT_SATISFIED</code>
	 *          <li><code>REFERENCED_DATA_NOT_FOUND</code>
	 *          <li><code>CONDITIONS_OF_USE_NOT_SATISFIED</code>
	 *          <li><code>NO_EF_SELECTED</code>
         *	    <li><code> INVALID_TAG_VALUE </code></ul>
	 */
        public void deleteData(int tag) ;
    
}
