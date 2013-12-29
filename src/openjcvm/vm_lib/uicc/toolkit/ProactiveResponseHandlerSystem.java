//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.toolkit;

/**
 * The <code>ProactiveResponseHandlerSystem</code> class provides the means to retrieve an instance of
 * an Object implementing the </code>ProactiveResponseHandler</code> interface.<p>
 *
 * @see        ProactiveResponseHandler
 */
public final class ProactiveResponseHandlerSystem {

	/**
	 */
	private ProactiveResponseHandlerSystem() { }


	/**
	 * Returns the single system instance of the <code>ProactiveResponseHandler</code> class.
	 * The applet shall get the reference of the handler at its triggering, the beginning of
	 * the processToolkit method.
	 *
	 * @return                       reference of the temporary JCRE entry point object of the ProactiveResponseHandler
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy.</ul>
	 */
	public static ProactiveResponseHandler getTheHandler() throws ToolkitException {
		return null;
	}
}

