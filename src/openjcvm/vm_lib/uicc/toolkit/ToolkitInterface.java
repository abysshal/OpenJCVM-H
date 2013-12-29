//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------
import javacard.framework.Shareable;
/**
 *  This interface must be implemented by an object of a Toolkit Applet instance (which extends the 
 *  <code>javacard.framework.Applet</code> class) so that it can be triggered by the Toolkit
 *  Handler according to the resgistration information. The Toolkit object will have to implement the
 * <code>processToolkit</code> method so that it can be notified of the events.
 *
 */
public interface ToolkitInterface extends Shareable {

	// ------------------------------- Public methods -------------------------

	/**
	 * This method is the standard toolkit event handling method of a Toolkit Applet and
	 * is called by the "Triggering Entity" to process the current Toolkit event.
	 * This method is invoked for notification of registered events.
	 *
	 * @param  event                 the type of event to be processed.
	 * @exception  ToolkitException
	 */
	void processToolkit(short event) throws ToolkitException;
}

