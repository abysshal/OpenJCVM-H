//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.toolkit;

/**
 * The <code>EnvelopeResponseHandlerSystem</code> class provides the means to retrieve an instance of
 * an Object implementing the </code>EnvelopeResponseHandler</code> interface.<p>
 *
 * @see        EnvelopeResponseHandler
 */
public final class EnvelopeResponseHandlerSystem {

	/**
	 * Constructor is protected
	 */
	private EnvelopeResponseHandlerSystem() { }


	/**
	 * Returns the single system instance of the <code>EnvelopeResponseHandler</code> class.
	 * The Applet shall get the reference of the handler at its triggering, the beginning of
	 * the processToolkit method.
	 *
	 * @return                       reference of the temporary JCRE entry point object of the EnvelopeResponseHandler
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is not available.</ul>
	 */
	public static EnvelopeResponseHandler getTheHandler() throws ToolkitException {
		return null;
	}
}

