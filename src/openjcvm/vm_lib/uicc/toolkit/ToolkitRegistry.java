package uicc.toolkit;

import javacard.framework.*;
import uicc.access.*;

/**
 * The <code>ToolkitRegistry</code> interface offers basic services and methods to allow
 * any Toolkit Applet to register its configuration (supported events) during
 * the install phase and possibly to change it during all the applet life time.
 * Each Toolkit Applet will get a reference to its registry entry with the static
 * method <code>getEntry</code> from the <code>ToolkitRegistrySystem</code> class
 * The initial state of all the events is cleared. The registry entry object implementing
 * the <code>ToolkitRegistry</code> interface is a permanent JCRE entry point object<p>
 *
 * All updates performed on the <code>ToolkitRegistry</code> are atomic. The <code>ToolkitRegistry</code>
 * update operations are subject to atomic commit capacity limitations. If the commit
 * capacity is exceeded, no update is performed and a <code>TransactionException</code> exception is thrown.<p>
 *
 * Note: the constants related to the events are defined in the <code>ToolkitConstants
 * </code> interface.<p>
 *
 * @see        ToolkitInterface
 * @see        ToolkitRegistrySystem
 */

public interface ToolkitRegistry {
	/**
	 * Sets an event in the Toolkit Registry entry of the applet.
	 * No exception shall be thrown if the applet registers more than once to the same event.
	 *
	 * @param  event                     value of the new event to register (between -32768 and 32767)
	 * @exception  ToolkitException      with the following reason codes: <ul>
	 *      <li>EVENT_NOT_SUPPORTED if the event is not supported
	 *      <li>EVENT_TAR_NOT_DEFINED if the event requests a TAR and the applet has not at least one TAR value assigned.
	 *      <li>EVENT_ALREADY_REGISTERED if the event has already been registered (for limited event like Call Control)
	 *	<li>EVENT_NOT_ALLOWED if event is EVENT_MENU_SELECTION, EVENT_MENU_SELECTION_HELP_REQUEST, 
	 *                                        EVENT_TIMER_EXPIRATION, EVENT_STATUS_COMMAND, 
	 *					  EVENT_EVENT_ DOWNLOAD_LOCAL_CONNECTION,EVENT_EXTERNAL_FILE_UPDATE</ul>
	 * @exception  TransactionException  if the operation would cause the commit capacity to be exceeded
	 */
	void setEvent(short event) throws ToolkitException, TransactionException;


	/**
	 * Sets an event list in the Toolkit Registry entry of the applet.
	 * In case of any exception the state of the registry is unchanged.
	 *
	 * @param  eventList                           buffer containing the list of the new events to register
	 * @param  offset                              offset in the eventlist buffer for event registration
	 * @param  length                              length in the eventlist buffer for event registration
	 * @exception  NullPointerException            if <code>eventlist</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>offset</code> or <code>length</code> or both would cause access outside array bounds
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li>EVENT_NOT_SUPPORTED if one event is not supported
	 *      <li>EVENT_TAR_NOT_DEFINED if the event requests a TAR and the applet has not at least one TAR value assigned.
	 *      <li>EVENT_ALREADY_REGISTERED if one event has already been registered
	 *         (for limited event like Call Control)
	 *	<li>EVENT_NOT_ALLOWED if <code>eventList</code> contains EVENT_MENU_SELECTION,
	 *		                                    EVENT_MENU_SELECTION_HELP_REQUEST, 
	 *                                                  EVENT_TIMER_EXPIRATION, EVENT_STATUS_COMMAND, 
	 *                                                  EVENT_EVENT_ DOWNLOAD_LOCAL_CONNECTION,EVENT_EXTERNAL_FILE_UPDATE </ul>
	 * @exception  TransactionException            if the operation would cause the commit capacity to be exceeded
	 */
	void setEventList(short[] eventList, short offset, short length) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException,
			TransactionException;


	/**
	 * Clears an event in the Toolkit Registry entry of the applet.
	 *
	 * @param  event                     the value of the event to unregister (between -32768 and 32767)
	 * @exception  ToolkitException      with the following reason codes: <ul>
	 *		<li>EVENT_NOT_ALLOWED if event is EVENT_MENU_SELECTION,
	 *			                          EVENT_MENU_SELECTION_HELP_REQUEST, 
	 *                                                EVENT_TIMER_EXPIRATION, EVENT_STATUS_COMMAND, 
	 *                                                EVENT_EVENT_ DOWNLOAD_LOCAL_CONNECTION</ul>
	 * @exception  TransactionException  Description of the Exception
	 */
	void clearEvent(short event) throws ToolkitException, TransactionException;


	/**
	 * Allows to know if an event is set in the Toolkit Registry entry of the applet.
	 *
	 * @param  event  the value of the event (between -32768 and 32767)
	 * @return        true if the event is set in the Toolkit Registry entry of the applet, false otherwise
	 */
	boolean isEventSet(short event);


	/**
	 * Disables a menu entry.
	 * This method doesn't modify the registration state to the EVENT_MENU_SELECTION
	 * and EVENT_MENU_SELECTION_HELP_REQUEST. After invocation of this method, during the current card session, the CAT
	 * Runtime Environment shall dynamically update the menu stored in the Terminal.
	 *
	 * @param  id                        the menu entry identifier supplied by the <code>initMenuEntry()</code> method
	 * @exception  ToolkitException      with the following reason codes: <ul>
	 *      <li>ENTRY_NOT_FOUND if the menu entry does not exist for this applet</ul>
	 * @exception  TransactionException  if the operation would cause the commit capacity to be exceeded
	 */
	void disableMenuEntry(byte id) throws ToolkitException, TransactionException;


	/**
	 * Enables a menu entry.
	 * This method doesn't modify the registration state to the EVENT_MENU_SELECTION
	 * and EVENT_MENU_SELECTION_HELP_REQUEST. After invocation of this method, during the current card session, the CAT
	 * Runtime Environment shall dynamically update the menu stored in the Terminal.
	 *
	 * @param  id                        the menu entry identifier supplied by the <code>initMenuEntry()</code> method
	 * @exception  ToolkitException      with the following reason codes: <ul>
	 *      <li>MENU_ENTRY_NOT_FOUND if the menu entry does not exist for this applet</ul>
	 * @exception  TransactionException  if the operation would cause the commit capacity to be exceeded
	 */
	void enableMenuEntry(byte id) throws ToolkitException, TransactionException;


	/**
	 * Initialises the next menu entry allocated at loading. The default state of the menu entry is
	 * 'enabled'. The value of the <code>helpSupported</code> boolean parameter
	 * defines the registration status of the applet to the event
	 * EVENT_MENU_SELECTION_HELP_REQUEST. The applet is registered to
	 * the EVENT_MENU_SELECTION. The icon identifier provided will be added to
	 * the icon identifier list of the item icon identifier list Comprehension TLV if
	 * all the applets registered to the EVENT_MENU_SELECTION provide it.
	 * The Icon list qualifier transmitted to the Terminal will be 'icon is not self
	 * explanatory' if one of the applet registered prefers this qualifier.
	 * This method shall be called by the applet in the same order than the
	 * order of the item parameters defined at the applet loading if the applet
	 * has several menu entries. The applet shall initialise all its loaded
	 * menu entries during its installation.
	 *
	 * @param  menuEntry                           a reference on a byte array, containing the menu entry string
	 * @param  offset                              offset of the menu entry string in the buffer
	 * @param  length                              length of the menu entry string
	 * @param  nextAction                          a byte coding the next action indicator for the menu entry (or 0)
	 * @param  helpSupported                       equals true if help is available for the menu entry
	 * @param  iconQualifier                       the preferred value for the icon list qualifier
	 * @param  iconIdentifier                      the icon identifier for the menu entry  (0 means no icon)
	 * @return                                     the identifier attached to the initialised menu entry
	 * @exception  NullPointerException            if <code>menuEntry</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>offset</code> or <code>length</code> or both would cause access outside array bounds
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li>REGISTRY_ERROR if the menu entry cannot be initialised (e.g. no more item data in applet loading parameter)
	 *	    <li>ALLOWED_LENGTH_EXCEEDED if the menu entry string is bigger than the allocated space</ul>
	 * @exception  TransactionException            if the operation would cause the commit capacity to be exceeded
	 */
	byte initMenuEntry(byte[] menuEntry,
			short offset,
			short length,
			byte nextAction,
			boolean helpSupported,
			byte iconQualifier,
			short iconIdentifier) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException, TransactionException;


	/**
	 * Changes the value of a menu entry. The default state of the changed menu
	 * entry is 'enabled'. The value of the <code>helpSupported</code> boolean
	 * parameter defines the registration status of the EVENT_MENU_SELECTION_HELP_REQUEST
	 * event. The icon identifier provided will be added to the icon identifier list
	 * of the item icon identifier list Comprehension TLV if all the applets registered
	 * to the EVENT_MENU_SELECTION provide it.
	 * The Icon list qualifier transmitted to the Terminal will be 'icon is not self
	 * explanatory' if one of the applet registered prefers this qualifier.
	 * After the invocation of this method, during the current card session, the CAT Runtime Environment
	 * shall dynamically update the menu stored in the Terminal.
	 *
	 * @param  id                                  the menu entry identifier supplied by the <code>initMenuEntry()</code> method
	 * @param  menuEntry                           a reference on a byte array, containing the menu entry string
	 * @param  offset                              the position of the menu entry string in the buffer
	 * @param  length                              the length of the menu entry string
	 * @param  nextAction                          a byte coding the next action indicator for the menu entry (or 0)
	 * @param  helpSupported                       equals true if help is available for the menu entry
	 * @param  iconQualifier                       the preferred value for the icon list qualifier
	 * @param  iconIdentifier                      the icon identifier for the menu entry  (0 means no icon)
	 * @exception  NullPointerException            if <code>menuEntry</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>offset</code> or <code>length</code> or both would cause access outside array bounds
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li>MENU_ENTRY_NOT_FOUND if the menu entry does not exist for this applet
	 *	<li>ALLOWED_LENGTH_EXCEEDED if the menu entry string is bigger than the allocated space</ul>
	 * @exception  TransactionException            if the operation would cause the commit capacity to be exceeded
	 */
	void changeMenuEntry(byte id,
			byte[] menuEntry,
			short offset,
			short length,
			byte nextAction,
			boolean helpSupported,
			byte iconQualifier,
			short iconIdentifier) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException, TransactionException;


	/**
	 * Asks the CAT Runtime Environment to allocate a Timer that the applet can manage.
	 * By calling this method the applet is registered to the
	 * EVENT_TIMER_EXPIRATION of the allocated timer.
	 * The timer is allocated by the applet until it explicitly releases it.
	 * So it can then issue the Timer Management proactive command to start,
	 * stop or get the value of its allocated timer.
	 *
	 * @return                           the identifier of the Timer allocated to the applet
	 * @exception  ToolkitException      with the following reason codes: <ul>
	 *      <li>NO_TIMER_AVAILABLE if all the timers are allocated or the maximum number
	 *		of timers have been allocated to this applet</ul>
	 * @exception  TransactionException  if the operation would cause the commit capacity to be exceeded
	 */
	byte allocateTimer() throws ToolkitException, TransactionException;


	/**
	 * Release a Timer that has been allocated to the calling applet.
	 * The applet is deregistered of the EVENT_TIMER_EXPIRATION
	 * for the indicated Timer Identifier.
	 *
	 * @param  timerIdentifier           the identifier of the Timer to be released
	 * @exception  ToolkitException      with the following reason codes: <ul>
	 *      <li>INVALID_TIMER_ID if the <code>timerIdentifierd</code> is not allocated to this applet.</ul>
	 * @exception  TransactionException  if the operation would cause the commit capacity to be exceeded
	 */
	void releaseTimer(byte timerIdentifier) throws ToolkitException, TransactionException;


	/**
	 * Requests a duration for the EVENT_STATUS_COMMAND event of the registering
	 * Toolkit Applet. Due to different duration requested by other Toolkit
	 * Applets or due to restriction of the Terminal, the CAT Runtime Environment may
	 * adjust another duration.
	 * This method can be used at every time to request a new duration.
	 *
	 * @param  duration                  specifies the number of seconds requested for proactive polling.
	 *			The maximum value of <code>duration</code> is <code>15300</code> (255 minutes).
	 *			If <code>duration<code> is equal to <code>POLL_NO_DURATION</code>,
	 *			the calling applet deregisters from EVENT_STATUS_COMMAND, and
	 *			the CAT Runtime Environment may issue the POLLING OFF proactive command.
	 *			If <code>duration<code> is equal to <code>POLL_SYSTEM_DURATION</code>,
	 *			the calling applet registers to the EVENT_STATUS_COMMAND and let
	 *			the CAT Runtime Environment define the duration.
	 * @exception  ToolkitException      with the following reason codes: <ul>
	 *      <li>REGISTRY_ERROR 	 if <code>duration</code> is greater than the maximum value.</ul>
	 * @exception  TransactionException  if the operation would cause the commit capacity to be exceeded
	 */
	void requestPollInterval(short duration) throws ToolkitException, TransactionException;


	/**
	 * Returns the number of seconds of the adjusted duration for the calling
	 * Toolkit Applet.
	 * If the returned duration is equal to <code>POLL_NO_DURATION<code>, the Toolkit
	 * Applet is not registered to EVENT_STATUS_COMMAND event.
	 * The returned duration may :
	 *		- be a multiple of the real adjusted poll interval time at the Terminal.
	 * 		- differ from the requested duration due to request of other toolkit
	 *			applets or due to restrictions of the current Terminal.
	 *		- be changed during the card session due requests from other Toolkit Applets.
	 *		- be wrong due to direct generation of the proactive command POLL INTERVAL or POLLING OFF.
	 * 		- not correspond to the elapsed time due to additional STATUS commands send by the Terminal.
	 *
	 * @return    the number of seconds of the adjusted duration for the applet
	 */
	short getPollInterval();

        /**
	 * Allocate a Service identifier that the applet can manage.<br>
	 *
	 * By calling this method the applet is registered to the
	 * EVENT_EVENT_ DOWNLOAD_LOCAL_CONNECTION of the allocated service.<br>
	 * The service identifier is allocated by the applet until it explicitly releases it.
	 * It can then issue the proactive command DECLARE SERVICE to add or delete a service
	 * to the terminal service database.<br>
	 *
	 * @return     the identifier of the Service allocated to the applet
	 * @exception  ToolkitException      with the following reason codes: <ul>
	 *             <li>NO_SERVICE_ID_AVAILABLE if all the services are allocated or the maximum number
	 *		of services Identifiers have been allocated to this applet</ul>
	 * @exception  TransactionException  
	 */
	byte allocateServiceIdentifier() throws ToolkitException, TransactionException;


	/**
	 * Release a Service Identifier that has been allocated to the calling applet.<br>
	 *
	 * The applet is deregistered of the EVENT_EVENT_ DOWNLOAD_LOCAL_CONNECTION
	 * for the indicated Service Identifier.
	 *
	 * @param  serviceIdentifier the identifier of the Service to be released
	 * @exception  ToolkitException with the following reason codes: <ul>
	 *              <li>INVALID_SERVICE_ID if the <code>serviceIdentifier</code> is not allocated to this Applet.</ul>
	 * @exception  TransactionException  
	 */
	void releaseServiceIdentifier(byte serviceIdentifier) throws ToolkitException, TransactionException;
	
	/**
         * Register a ToolkitRegistry object to the <code>EVENT_EXTERNAL_FILE_UPDATE</code> for a file list.
         * @param fileEvent Indicates the File event to be registered
         * @param baFileList		array containing the file list. The baFileList shall be coded as the value part of the COMPREHENSION-TLV File List defined in TS 102 223
         *                              If the path provided indicates a dedicated file (DF), the Applet shall be triggered when an elementary file that is an immediate child of the DF is updated.
         * @param  sOffset1          offset in the <code>baFileList </code>  buffer for event registration
         * @param  sLength1        length in the <code>baFileList </code>  buffer for event registration
         * @param baADFAid	array containing the AID of the ADF. The <code>baADFAid</code> shall be coded as the value part of the COMPREHENSION-TLV AID defined in TS 102 223. If <code>baADFAid</code>  is <code>null</code>null, it indicates that the file is located under the MF and not located under an ADF .
         * @param  sOffset2          offset in the <code>baADFAid</code>  buffer for event registration
         * @param  bLength2        length in the <code>baADFAid</code>  buffer for event registration
	 * @exception  NullPointerException            if <code> baFileList </code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>sOffset</code> or <code>sLength</code> or both would cause access outside array bounds
	 * @exception  TransactionException   if the operation would cause the commit capacity to be exceeded
	 * @exception SystemException with the following reason code:<ul>
	 * <li><code>SystemException.ILLEGAL_VALUE</code> if <code>bLength2</code> is not in the range of 5 – 16 bytes. </ul>
         * @exception ToolkitException with the following reason code:<ul>
	 *     <li><code>EVENT_NOT_ALLOWED</code> if the event is one of the following events: EVENT_MENU_SELECTION, EVENT_MENU_SELECTION_HELP_REQUEST, EVENT_TIMER_EXPIRATION, EVENT_STATUS_COMMAND
         *      <li><code>EVENT_NOT_SUPPORTED</code> if the event is not the following event: EVENT_EXTERNAL_FILE_UPDATE.</ul>
         	 * @exception  UICCException                   in case of error<ul>
	 *          <li><code> COMMAND_NOT_ALLOWED </code> if the referenced file is terminated
	 </ul>

	 */
         void registerFileEvent(short fileEvent, byte[] baFileList, short sOffset1, short sLength1, byte[] baADFAid, short sOffset2, byte bLength2) throws ToolkitException, NullPointerException, ArrayIndexOutOfBoundsException, TransactionException, SystemException;


        /**
         * Deregister a ToolkitRegistry object from the <code>EVENT_EXTERNAL_FILE_UPDATE</code> for a file list.
         * @param fileEvent Indicates the File event to be deregistered
         * @param baFileList		array containing the file list. The <code> baFileList </code> shall be coded as the value part of the COMPREHENSION-TLV File List defined in TS 102 223
         * If a file in <code>baFileList</code> is a dedicated file the deregistration shall not affect the monitoring of an elementary file within the dedicated file that was individually registered.
         * If a file in <code>baFileList</code> is an elementary file the deregistration will not affect the monitoring of the parent dedicated file that was individually registered.
         * @param  sOffset1          offset in the <code> baFileList </code>  buffer for event registration
         * @param  sLength1        length in the <code> baFileList </code>  buffer for event registration
         * @param baADFAid	array containing the AID of the ADF. The <code>baADFAid</code> shall be coded as the value part of the COMPREHENSION-TLV AID defined in TS 102 223. If <code>baADFAid</code> is <code>null</code>, it indicates that the file is located under the MF and not located under an ADF .
         * @param  sOffset2          offset in the <code>baADFAid</code>  buffer for event registration
         * @param  bLength2        length in the <code>baADFAid</code>  buffer for event registration
	 * @exception NullPointerException            if <code> baFileList </code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if <code>sOffset</code> or <code>sLength</code> or both would cause access outside array bounds
	 * @exception  TransactionException   if the operation would cause the commit capacity to be exceeded
	 * @exception SystemException with the following reason codes:<ul>
	 * <li><code>SystemException.ILLEGAL_VALUE</code> if <code>bLength2</code> is not in the range of 5 – 16 bytes. </ul>
         * @exception ToolkitException with the following reason code:<ul>
	 *     <li><code>EVENT_NOT_ALLOWED</code> if the event is one of the following events: EVENT_MENU_SELECTION, EVENT_MENU_SELECTION_HELP_REQUEST, EVENT_TIMER_EXPIRATION, EVENT_STATUS_COMMAND
         *     <li><code>EVENT_NOT_SUPPORTED</code> if the event is not the following event: EVENT_EXTERNAL_FILE_UPDATE.</ul>	
         	 * @exception  UICCException                   in case of error<ul>
	 *          <li><code> COMMAND_NOT_ALLOWED </code> if the referenced file is terminated
	 </ul>

	 */
         void deregisterFileEvent(short fileEvent, byte[] baFileList, short sOffset1, short sLength1, byte[] baADFAid, short sOffset2, byte bLength2) throws ToolkitException, NullPointerException, ArrayIndexOutOfBoundsException, TransactionException, SystemException;

         /**
          * Register a ToolkitRegistry object to the <code>EVENT_EXTERNAL_FILE_UPDATE</code> for a file.
          * @param fileEvent Indicates the File event to be registered
          * @param aFileView      The FileView object's current file indicates the file to be monitored. If the current file is a dedicated file, the Applet shall be triggered when an elementary file that is an immediate child of the DF is updated. A later change in the FileView shall not modify the registration.
	  * @exception NullPointerException            if <code> aFileView </code> is <code>null</code>
	  * @exception  TransactionException   if the operation would cause the commit capacity to be exceeded
	  * @exception ToolkitException with the following reason code:<ul>
	  *     <li><code>EVENT_NOT_ALLOWED</code> if the event is one of the following events: EVENT_MENU_SELECTION, EVENT_MENU_SELECTION_HELP_REQUEST, EVENT_TIMER_EXPIRATION, EVENT_STATUS_COMMAND
          *      <li><code>EVENT_NOT_SUPPORTED</code> if the event is not the following event: EVENT_EXTERNAL_FILE_UPDATE.</ul>
          	 * @exception  UICCException                   in case of error<ul>
	  *          <li><code> COMMAND_NOT_ALLOWED </code> if the referenced file is terminated
	 </ul>

	  */
          void registerFileEvent(short fileEvent, FileView aFileView) throws ToolkitException, NullPointerException, TransactionException;

         /**
          * Deregister a ToolkitRegistry object from the <code>EVENT_EXTERNAL_FILE_UPDATE</code> for a file.
          * @param fileEvent Indicates the File event to be deregistered
          * @param aFileView  The FileView object's current file indicates the file that is no longer monitored. 
          * If the current file is a dedicated file the deregistration shall not affect the monitoring of an elementary file within the dedicated file that was individually registered.
          * If the current file is an elementary file the deregistration will not affect the monitoring of the parent dedicated file that was individually registered.
	  * @exception NullPointerException            if <code>aFileView</code> is <code>null</code>
	  * @exception  TransactionException   if the operation would cause the commit capacity to be exceeded
	  * @exception ToolkitException with the following reason code:<ul>
	  *     <li><code>EVENT_NOT_ALLOWED</code> if the event is one of the following events: EVENT_MENU_SELECTION, EVENT_MENU_SELECTION_HELP_REQUEST, EVENT_TIMER_EXPIRATION, EVENT_STATUS_COMMAND
          *    <li><code>EVENT_NOT_SUPPORTED</code> if the event is not the following event: EVENT_EXTERNAL_FILE_UPDATE.</ul>
          	 * @exception  UICCException                   in case of error<ul>
	  *          <li><code> COMMAND_NOT_ALLOWED </code> if the referenced file is terminated
	  </ul>

	  */
          void deregisterFileEvent(short fileEvent, FileView aFileView) throws ToolkitException, NullPointerException, TransactionException;
	  
	  /**
	   * Sets the text attribute of a menu entry.
	   * The text attribute provided will set the entry in the Text Attribute list
	   * of the Item text attribute list Comprehension TLV for the menu entry referenced by the parameter <code>id</code>.
	   * After the invocation of this method, during the current card session, the CAT Runtime Environment
	   * shall dynamically update the menu stored in the terminal.
	   *
	   * @param  id                                  the menu entry identifier supplied by the <code>initMenuEntry()</code> method
	   * @param  textAttribute                           a reference on a byte array, containing the menu text attribute
	   * @param  offset                              the position of the menu entry text attribute in the buffer
	   * @param  length                              the length of the menu entry text attribute in the buffer
	   * @exception  NullPointerException            if <code> textAttribute </code> is <code>null</code>
	   * @exception  ArrayIndexOutOfBoundsException  if <code>offset</code> or <code>length</code> or both would cause access outside array bounds
	   * @exception  ToolkitException                with the following reason codes: <ul>
	   *      <li>MENU_ENTRY_NOT_FOUND if the menu entry does not exist for this applet
	   *	<li>BAD_INPUT_PARAMETER if the <code>length</code> is different from 4</ul>
	   * @exception  TransactionException            if the operation would cause the commit capacity to be exceeded
	   */
	    void setMenuEntryTextAttribute(byte id,
			byte[] textAttribute,
			short offset,
			short length) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException, TransactionException;
}
