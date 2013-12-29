//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import javacard.framework.APDUException;
/**
 * The <code>EnvelopeResponseHandler</code> interface contains basic methods to handle the <b>Envelope response
 * </b>data field. This class will be used by the Toolkit Applet in order to
 * edit the response to current Envelope command. A class implementing the <code>EnvelopeResponseHandler</code> interface is a <b>Temporary
 * JCRE Entry Point Object</b>. The only way to get an <code>EnvelopeResponseHandler</code>
 * reference is through the static <code>getTheHandler()</code> method of the <code>EvelopeResponseHandlerSystem</code> class<p>
 *
 * @see        ViewHandler
 * @see        EditHandler
 * @see        EnvelopeHandler
 * @see        ToolkitException
 */
public interface EnvelopeResponseHandler extends EditHandler {

	/**
	 * Prepares the Envelope response
	 *
	 * @param value indicating successful processing of the Envelope command
         *        The CAT Runtime Environment has to map the boolean value to the correct status word
         *
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy </ul>
	 * @exception  APDUException     with the following reason code: <ul>
	 *      <li><code>BAD_LENGTH</code> if the resulting response length is greater
	 *      than 256 and the response data has to be retrieved by the GET RESPONSE
	 *      command.</ul>
	 */
	void post(boolean value) throws APDUException, ToolkitException;


	/**
	 * Prepare the Envelope response in a BER TLV structure. Should be used with Envelope
	 * Call Control by NAA or with an Unrecognized Envelope. The tag value is to be used 
	 * to set the Result for Call Control.
	 *
	 * @param value indicating successful processing of the Envelope command
         *        The CAT Runtime Environment has to map the boolean value to the correct status word
         *
	 * @param  tag                   the BER Tag to be used at the beginning of the Comprehension_TLV list.
	 * @exception  APDUException     with the following reason code: <ul>
         *      <li><code>BAD_LENGTH</code> if the resulting response length is greater
         *      than 256 bytes and the response data has to be retrieved by the GET RESPONSE
         *      command.</ul>
         *
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy</ul>
	 */
	void postAsBERTLV(boolean value, byte tag) throws APDUException, ToolkitException;
}

