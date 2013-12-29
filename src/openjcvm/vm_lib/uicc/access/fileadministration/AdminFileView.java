//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.access.fileadministration ;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import uicc.toolkit.ViewHandler;
import uicc.access.FileView;
import uicc.access.UICCException;
import javacard.framework.TransactionException;
import javacard.framework.SystemException;

/**
 * The <code>AdminFileView</code> interface defines the administrative methods to access a UICC file system server.
 * <br>
 *
 * All the methods are based on the commands of the TS 102 222 specification.
 * <pr>
 *
 * All operations performed on the <code>AdminFileView</code> are atomic. 
 * The <code>AdminFileView</code> operations are subject to atomic 
 * commit capacity limitations. If the commit capacity is exceeded, no operation is performed and a 
 * <code>TransactionException</code> exception is thrown.
 *
 * @see        AdminFileViewBuilder
 */
public interface AdminFileView extends FileView {

	// ------------------------------- API methods ----------------------------
	/**
	 * This method initiates the deletion of an EF immediately under the current DF, or a DF with its complete
	 * subtree, as described in TS 102 222.
	 *
	 * @param  fid                                 is the File Identifier of the file to be deleted.
	 * @exception  UICCException                   in case of error<ul>
	 *          <li><code>FILE_NOT_FOUND</code>
	 *          <li><code>MEMORY_PROBLEM</code>
	 *          <li><code>INTERNAL_ERROR</code>
	 *          <li><code>SECURITY_STATUS_NOT_SATISFIED</code>
	 * </ul>
         * @exception TransactionException if the operation would cause the commit capacity to be exceeded.
	 */
	public void deleteFile(short fid)
             throws UICCException, 
             TransactionException;

	/**
	 * This method creates a new file under the current DF or ADF, as described in TS 102 222.
	 *
	 * @param viewHandler    ViewHandler object containing the value part of the FCP data object for the CREATE FILE command, as described in TS 102 222.
	 * @exception  NullPointerException            if <code>viewHandler</code> is <code>null</code>
	 * @exception  UICCException                   in case of error<ul>
	 *          <li><code>MEMORY_PROBLEM</code>
	 *          <li><code>INTERNAL_ERROR</code>
	 *          <li><code>SECURITY_STATUS_NOT_SATISFIED</code>
	 *          <li><code> COMMAND_NOT_ALLOWED </code> if the referenced file is terminated
	 *
	 * </ul>
	 * @exception  AdminException                   in case of error<ul>
	 *          <li><code>FILE_ALREADY_EXISTS</code>
	 *          <li><code> INCORRECT_PARAMETERS</code>
	 *          <li><code>NOT_ENOUGH_MEMORY_SPACE</code>
	 *          <li><code>DF_NAME_ALREADY_EXISTS</code>

	 * </ul>
        * @exception TransactionException if the operation would cause the commit capacity to be exceeded.
	 */
	public void createFile(ViewHandler viewHandler)
            throws NullPointerException,
            UICCException, 
            AdminException,
            TransactionException;

	/**
	 * This method resizes a file under the current DF or ADF, as described in TS 102 222. If the current file of the AdminFileView is a BER-TLV structured EF and Tag '86' (Maximum File Size) is present within the proprietary TLV ( tag 'A5') in the FCP data object then this method operates in Mode 0 as defined in TS 102 222.
	 *
	 * @param  viewHandler                                 ViewHandler object containing the value part of the FCP data object for the  RESIZE command, as described in TS 102 222.
	 * @exception  NullPointerException            if <code>viewHandler</code> is <code>null</code>
	 * @exception  UICCException                   in case of error<ul>
	 *          <li><code>MEMORY_PROBLEM</code>
	 *          <li><code>COMMAND_INCOMPATIBLE</code>
	 *          <li><code>SECURITY_STATUS_NOT_SATISFIED</code>
	 *          <li><code>REF_DATA_INVALIDATED</code>
	 *          <li><code>FILE_NOT_FOUND</code>
	 *          <li><code>INTERNAL_ERROR</code>
	 *          <li><code> COMMAND_NOT_ALLOWED </code> if the referenced file is terminated
	 * </ul>
	 * @exception  AdminException                   in case of error<ul>
	 *          <li><code>CONDITIONS_OF_USE_NOT_SATISFIED</code>
	 *          <li><code>NOT_ENOUGH_MEMORY_SPACE</code>
	 *          <li><code> INCORRECT_PARAMETERS</code>
	 *          </ul>
         * @exception TransactionException if the operation would cause the commit capacity to be exceeded.
	 */
	public void resizeFile(ViewHandler viewHandler)
            throws NullPointerException,
            UICCException, 
            AdminException,
            TransactionException;


}

