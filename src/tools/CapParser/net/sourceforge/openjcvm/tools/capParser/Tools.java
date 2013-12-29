/*
 * Tools.java
 *
 * Created on 2007年12月1日, 上午12:02
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sourceforge.openjcvm.tools.capParser;

import java.io.*;
import java.util.*;
import java.util.zip.*;

/**
 *
 * @author Louis
 */
public class Tools {
    
    /** Creates a new instance of Tools */
    public Tools() {
    }
    
    public static void unzip(String sZipFileName, String sOutputFilePath)
    throws FileNotFoundException, IOException{
        ZipInputStream zin=new ZipInputStream(new FileInputStream(sZipFileName));
        ZipEntry zEntry;
        
        while ((zEntry=zin.getNextEntry())!=null){
            System.out.println("Unzipping --- "+zEntry.getName());
            
            if(zEntry.isDirectory()){
                String sName=zEntry.getName();
                File f=new File(sOutputFilePath+File.separator+sName);
                f.mkdir();
                System.out.println("mkdir"+f.getAbsolutePath()+File.separator+f.getName());
            } else{
                String[] sDirs;
                String sFileName=zEntry.getName();
                sDirs=sFileName.split("/");
                StringBuffer sPathBuf=new StringBuffer(sOutputFilePath);
                sPathBuf.append(File.separator);
                int i;
                for(i=0;i<sDirs.length-1;i++){
                    sPathBuf.append(sDirs[i]);
                    sPathBuf.append(File.separator);
                    File f=new File(sPathBuf.toString());
                    //System.out.println("making dir: "+sPathBuf.toString());
                    f.mkdir();
                }
                File f=new File(sPathBuf.toString()+sDirs[i]);
                f.createNewFile();
                BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream(f));
                int b;
                while((b=zin.read())!=-1){
                    fos.write(b);
                }
                System.out.println(sPathBuf.toString()+sDirs[i]+" created! OK!");
                fos.close();
            }
        }
        zin.close();
    }
    
    public static void readCap(String sCapFileName)
    throws FileNotFoundException, IOException{
        ZipInputStream zin=new ZipInputStream(new FileInputStream(sCapFileName));
        ZipEntry zEntry;
        
        while ((zEntry=zin.getNextEntry())!=null){
            System.out.println("Reading --- "+zEntry.getName());
            
            if(zEntry.isDirectory()){
                String sName=zEntry.getName();
                File f=new File("."+File.separator+sName);
                f.mkdir();
                System.out.println("Reading"+f.getAbsolutePath()+File.separator+f.getName());
            } else{
                String[] sDirs;
                String sFileName=zEntry.getName();
                sDirs=sFileName.split("/");
                StringBuffer sPathBuf=new StringBuffer(".");
                sPathBuf.append(File.separator);
                int i;
                /*for(i=0;i<sDirs.length-1;i++){
                    sPathBuf.append(sDirs[i]);
                    sPathBuf.append(File.separator);
                    File f=new File(sPathBuf.toString());
                    //System.out.println("making dir: "+sPathBuf.toString());
                    f.mkdir();
                }*/
                File f=new File(sPathBuf.toString()+sDirs[sDirs.length-1]);
                f.createNewFile();
                BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream(f));
                int b;
                while((b=zin.read())!=-1){
                    fos.write(b);
                }
                System.out.println(sPathBuf.toString()+sDirs[sDirs.length-1]+" created! OK!");
                fos.close();
            }
        }
        zin.close();
    }
}
