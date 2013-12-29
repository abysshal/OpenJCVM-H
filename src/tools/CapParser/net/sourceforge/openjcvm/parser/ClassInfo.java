/*
 * ClassInfo.java
 *
 * Created on 2007年12月1日, 下午10:08
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
public class ClassInfo {
    protected byte bClassToken;
    protected int accessFlags;
    protected int nameIndex;
    ArrayList exportSuperList;
    ArrayList exportInterfaceList;
    ArrayList fieldList;
    ArrayList methodList;
    
    /** Creates a new instance of ClassInfo */
    public ClassInfo() {
        this.exportSuperList=new ArrayList();
        this.exportInterfaceList=new ArrayList();
        this.fieldList=new ArrayList();
        this.methodList=new ArrayList();
    }
}
