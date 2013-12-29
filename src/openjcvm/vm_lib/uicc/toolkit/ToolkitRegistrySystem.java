//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 * The <code>ToolkitRegistrySystem</code> class provides the means to retrieve an instance of
 * an Object implementing the <code>ToolkitRegistry</code> interface.<p>
 *
 * @see        ToolkitInterface
 * @see        ToolkitRegistry
 */
public final class ToolkitRegistrySystem {

	// ------------------------------- Constructors ---------------------------
	/**
	 * Constructor
	 */
	private ToolkitRegistrySystem() { }


	// ------------------------------- Public methods -------------------------
	/**
	 * This method is used by the Toolkit Applet to get a reference to its
	 * Toolkit Registry entry, so that it can handle its registration state to
	 * the toolkit events.
	 * <p>This method returns <code>null</code>
	 * if the <code>Applet.register()</code> has not yet been invoked or
	 * if the server does not exist or if the server returns <code>null</code>.
	 *
	 * @return                       reference to the applet ToolkitRegistry object
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 * 		<li>REGISTRY_ERROR in case of register error</ul>
	 */
	public static ToolkitRegistry getEntry() throws ToolkitException {
		return null;
	}
        
        /**
	 * Allows to find out if another applet with higher or the same priority 
	 * level has registered for EVENT_PROACTIVE_HANDLER_AVAILABLE. 
	 *
	 * @return      true if another applet with higher or the same priority
	 *              level is registered for EVENT_PROACTIVE_HANDLER_AVAILABLE,
	 *              false otherwise
	 */
	public static boolean isPrioritizedProactiveHandlerAvailableEventSet(){
		return false;
	}

}

