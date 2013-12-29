/*
 * ExportFile.java
 *
 * Created on 2007年12月1日, 下午7:24
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sourceforge.openjcvm.parser;

import java.util.*;
/**
 *
 * @author Louis
 */
public class ExportFile {
    protected int magic;
    protected Version version;
    protected ArrayList constList;
    protected int nameIndex;
    protected ArrayList classList;
    
    /** Creates a new instance of ExportFile */
    public ExportFile() {
        constList=new ArrayList();
        classList=new ArrayList();
    }
    
}
