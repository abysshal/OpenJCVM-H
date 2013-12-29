/*
 * Version.java
 *
 * Created on 2007年12月1日, 下午7:25
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sourceforge.openjcvm.parser;

/**
 *
 * @author Louis
 */
public class Version {
    private int minorVersion;
    private int majorVersion;
    
    /** Creates a new instance of Version */
    public Version(int min, int maj) {
        this.majorVersion=maj;
        this.minorVersion=min;
    }
}
