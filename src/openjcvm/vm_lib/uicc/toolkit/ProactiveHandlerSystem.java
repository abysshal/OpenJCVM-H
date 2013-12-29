//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.toolkit;

/**
 * The <code>ProactiveHandlerSystem</code> class provides the means to retrieve an instance of
 * an Object implementing the </code>ResponseHandler</code> interface.<p>
 *
 * @see        ProactiveHandler
 */
public final class ProactiveHandlerSystem {

	/**
	 */
	private ProactiveHandlerSystem() { }


	/**
	 * Returns the single system instance of the <code>ProactiveHandler</code> class.
	 * The applet shall get the reference of the handler at its triggering, the beginning of
	 * the processToolkit method.
	 *
	 * @return                       reference of the temporary JCRE entry point object of the ProactiveHandler
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is busy.</ul>
	 */
	public static ProactiveHandler getTheHandler() throws ToolkitException {
		return null;
	}
}

