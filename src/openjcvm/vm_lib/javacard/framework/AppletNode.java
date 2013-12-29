package javacard.framework;

public class AppletNode {
	public Applet applet;
	public AppletNode next;
	public AppletNode(Applet applet){
		this.next = null;
	}
}
