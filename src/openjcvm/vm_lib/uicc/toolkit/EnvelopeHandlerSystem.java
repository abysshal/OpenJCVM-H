//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.toolkit;

/**
 * The <code>EnvelopeHandlerSystem</code> class provides the means to retrieve an instance of
 * an Object implementing the <code>EnvelopeHandler</code> interface.<p>
 *
 * @see        EnvelopeHandler
 */
public final class EnvelopeHandlerSystem {

	/**
	 *Constructor for the EnvelopeHandlerSystem object
	 */
	private EnvelopeHandlerSystem() { }


	/**
	 * Returns the single system instance of the <code>EnvelopeHandler</code> class.
	 * The applet shall get the reference of the handler at its triggering,
	 * the beginning of the processToolkit method.
	 *
	 * @return                       reference of the temporary JCRE entry point object of the <code>EnvelopeHandler</code>
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li><code>HANDLER_NOT_AVAILABLE</code> if the handler is not available.</ul>
	 */
	public static EnvelopeHandler getTheHandler() throws ToolkitException {
		return null;
	}
}

