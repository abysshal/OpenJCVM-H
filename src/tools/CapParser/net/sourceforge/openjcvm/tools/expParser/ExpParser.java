/*
 * ExpParser.java
 *
 * Created on 2007年12月1日, 上午10:58
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sourceforge.openjcvm.tools.expParser;

import java.io.*;
import net.sourceforge.openjcvm.parser.*;
/**
 *
 * @author Louis
 */
public class ExpParser{
    
    /** Creates a new instance of ExpParser */
    public ExpParser() {
    }
    
    public static void main(String[] args){
        parseExpFile("lang.exp");
        parseExpFile("framework.exp");
        parseExpFile("security.exp");
    }
    
    public static void parseExpFile(String sExpFileName){
        try{
            File f=new File(sExpFileName);
            if(!f.exists()){
                System.out.println(sExpFileName+" is not existed!");
                System.exit(1);
            }
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f));
            byte[] baData = new byte[(int)f.length()];
            bis.read(baData);
            File fOut=new File(sExpFileName.substring(0,3)+"Parsed.txt");
            FileWriter fw=new FileWriter(fOut);

            net.sourceforge.openjcvm.parser.ExpParser.parseExpFile(baData,fw);
            fw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
