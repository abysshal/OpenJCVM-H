package javacard.framework;

public class OpenjcvmRegistry {
	//private static AppletNode header = null;
	//protected static byte[] apduBuffer = null;
	private static Applet oneApplet = null;
	
	public static void registerOneApplet(Applet applet){
		oneApplet = applet;
	}
	
	public static void processAPDUOneApplet(){
		oneApplet.process(null);
	}
	
	/*public static boolean registerApplet(Applet applet){
		if(apduBuffer == null){
			apduBuffer = new byte[256];
		}
		
		AppletNode current;
		AppletNode an = new AppletNode(applet);
		
		if(header == null){
			header = new AppletNode(null);
		}
		else if(header.next == null){
			header.next = an;			
		}
		for(current = header;current.next != null;current = current.next);
		current.next = an;
		
		return true;		
	}
	
	public static void processAPDU(byte[] baAPDU,short offset, byte length){
		APDU apdu = new APDU(apduBuffer);
		AppletNode current;
		for(current = header;current.next != null;current = current.next){
			current.applet.process(apdu);			
		}
	}*/
}
