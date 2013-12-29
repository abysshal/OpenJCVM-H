/*
 * ExpParser.java
 *
 * Created on 2007年12月1日, 下午12:33
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sourceforge.openjcvm.parser;

import java.io.*;
import java.util.*;
/**
 *
 * @author Louis
 */
public class ExpParser {
    
    /** Creates a new instance of ExpParser */
    public ExpParser() {
    }
    
    public static ExportFile parseExpFile(byte[] baExpFile, FileWriter fw)
    throws IOException, ExpParseException{
        ExportFile ef=new ExportFile();
        
        int iPos=0;
        byte[] baMagic=new byte[4];
        System.arraycopy(baExpFile,iPos,baMagic,0,4);
        ef.magic = parseExpMagic(baMagic,fw);
        
        iPos+=4;
        
        byte[] baVersion=new byte[2];
        System.arraycopy(baExpFile,iPos,baVersion,0,2);
        ef.version = parseVersion(baVersion,fw);
        iPos+=2;
        
        byte[] baConstant=new byte[baExpFile.length-6];
        System.arraycopy(baExpFile,iPos,baConstant,0,baExpFile.length-6);
        iPos+=parseConstantPool(baConstant,fw,ef.constList);
        
        byte[] baThisPackage=new byte[2];
        System.arraycopy(baExpFile,iPos,baThisPackage,0,2);
        parseThisPackage(baThisPackage,fw,ef.constList);
        iPos+=2;
        
        byte[] baClass=new byte[baExpFile.length-iPos];
        System.arraycopy(baExpFile,iPos,baClass,0,baExpFile.length-iPos);
        parseClass(baClass,fw,ef.classList,ef.constList);
        fw.write("}\n");
        
        return ef;
    }
    
    private static int parseExpMagic(byte[] baMagic, FileWriter fw)
    throws ExpParseException,IOException{
        if(baMagic[0]!=(byte)0x00 || baMagic[1]!=(byte)0xFA ||
                baMagic[2]!=(byte)0xCA || baMagic[3]!=(byte)0xDE)       {
            throw new ExpParseException();
        }
        fw.write("Java Card Export File:{\n\tMagic Number: 00FACADE\n");
        System.out.println("Java Card Export File:{\n\tMagic Number: 00FACADE\n");
        return baMagic[0]*0x1000000+baMagic[1]*0x10000+baMagic[2]*0x100+baMagic[3];
    }
    
    private static Version parseVersion(byte[] baVersion, FileWriter fw)
    throws IOException{
        Version vs=new Version((int)baVersion[0],(int)baVersion[1]);
        fw.write("\tVersion: "+(new Byte(baVersion[1])).toString()+"."+ (new Byte(baVersion[0]).toString())+"\n");
        System.err.println("\tVersion: "+(new Byte(baVersion[1])).toString()+"."+ (new Byte(baVersion[0]).toString())+"\n");
        return vs;
    }
    
    public static int parseConstantPool(byte[] baConstantPool, FileWriter fw, ArrayList al)
    throws IOException{
        int iConstCounter=ParseUtils.makeShortInt(baConstantPool,0);
                
        int iPos=2;
        for(int i=0;i<iConstCounter;i++){
            byte bTag = baConstantPool[iPos];
            switch(bTag){
                case ConstPoolInfo.CONSTANT_Utf8:
                    int iLength = baConstantPool[iPos+1]*0x100+baConstantPool[iPos+2];
                    iPos+=3;
                    fw.write("\tConstant String: ");
                    System.out.print("\tConstant String: ");        
                    for(int i2=0;i2<iLength;i2++){
                        fw.write((char)baConstantPool[iPos+i2]);
                        System.out.print((char)baConstantPool[iPos+i2]);
                    }
                    fw.write("\n");
                    System.out.println();
                    al.add(new ConstantUtf8(baConstantPool,iPos,iLength));
                    iPos+=iLength;
                    break;
                case ConstPoolInfo.CONSTANT_Package:
                    ConstantPackage cp=new ConstantPackage();
                    fw.write("\tPackage reference:\n");
                    System.out.println("\tPackage reference:");
                    cp.setFlag(baConstantPool[iPos+1]);
                    fw.write("\t\tFlags: "+new Byte(baConstantPool[iPos+1]).toString()+"\n");
                    System.out.println("\t\tFlags: "+new Byte(baConstantPool[iPos+1]).toString());
                    cp.nameIndex=ParseUtils.makeShortInt(baConstantPool,iPos+2);
                    fw.write("\t\t"+new Byte(baConstantPool[iPos+2]).toString()+new Byte(baConstantPool[iPos+3]).toString()+"\n");
                    Version vs=new Version(baConstantPool[iPos+4],baConstantPool[iPos+5]);
                    cp.setVersion(vs);
                    fw.write("\t\tFlags: "+new Byte(baConstantPool[iPos+4]).toString()+"\n");
                    System.out.println("\t\tFlags: "+new Byte(baConstantPool[iPos+4]).toString());
                    fw.write("\t\tFlags: "+new Byte(baConstantPool[iPos+5]).toString()+"\n");
                    System.out.println("\t\tFlags: "+new Byte(baConstantPool[iPos+5]).toString());
                    int iAidLength=(int)baConstantPool[iPos+6];
                    fw.write("\t\tAID:" +iAidLength+ " ");
                    System.out.print("\t\tAID:" +iAidLength+ " ");
                    AID aid=new AID(baConstantPool,iPos+7,iAidLength);
                    cp.setAid(aid);
                    iPos+=7;
                    for(int i3=0;i3<iAidLength;i3++){
                        fw.write(new Byte(baConstantPool[iPos+i3]).toString()+":");
                    }
                    fw.write("\n");
                    System.out.println();
                    iPos+=iAidLength;
                    al.add(cp);
                    break;
                case ConstPoolInfo.CONSTANT_Integer:
                    fw.write("\tConstant Integer: "+new Integer(
                           ParseUtils.makeInt(baConstantPool,iPos+1)).toString()+"\n");
                    System.out.println("\tConstant Integer: "+new Integer(
                           ParseUtils.makeInt(baConstantPool,iPos+1)).toString());
                    al.add(new ConstantInteger(ParseUtils.makeInt(baConstantPool,iPos+1)));
                    iPos+=5;
                    break;
                case ConstPoolInfo.CONSTANT_Classref:
                    fw.write("\tConstant Class reference: "+ new Integer(
                            ParseUtils.makeShortInt(baConstantPool,iPos+1)).toString()+" -> ");
                    System.out.print("\tConstant Class reference: "+ new Integer(
                            ParseUtils.makeShortInt(baConstantPool,iPos+1)).toString()+" -> ");
                    ConstantClass cc=new ConstantClass();
                    int iIndex1=ParseUtils.makeShortInt(baConstantPool,iPos+1);
                    cc.setIIndex(iIndex1);
                    cc.setClassName(((ConstantUtf8)al.get(iIndex1)).toString());
                    fw.write(((ConstantUtf8)al.get(iIndex1)).toString()+"\n");
                    System.out.println(((ConstantUtf8)al.get(iIndex1)).toString());
                    al.add(cc);
                    iPos+=3;
                    break;
                default:
                    break;
            }
        }
        return iPos;
    }
    
    private static int parseThisPackage(byte[] baThisPackage, FileWriter fw,
            ArrayList al) throws IOException{
        int iNameIndex = ParseUtils.makeShortInt(baThisPackage,0);
        fw.write("\tThis package: "+((ConstantUtf8)al.get(((ConstantPackage)(al.get(iNameIndex))).nameIndex)).toString()+"\n");
        System.out.println("\tThis package: "+((ConstantUtf8)al.get(((ConstantPackage)(al.get(iNameIndex))).nameIndex)).toString());
        return ParseUtils.makeShortInt(baThisPackage,0);
    }
    
    public static void parseClass(byte[] baClassInfo, FileWriter fw, ArrayList classList,ArrayList constList)
    throws IOException{
        int iClassCounter=(int)baClassInfo[0];
        int iPos=1;
        for(int i=0;i<iClassCounter;i++){
            ClassInfo ci   = new ClassInfo();
            ci.bClassToken = baClassInfo[iPos];
            ci.accessFlags = ParseUtils.makeShortInt(baClassInfo,iPos+1);
            ci.nameIndex   = ParseUtils.makeShortInt(baClassInfo,iPos+3);
            fw.write("\tClass "+constList.get(ci.nameIndex)+"{\n");
            System.out.println("\tClass "+constList.get(ci.nameIndex)+"{");
            int iExportSupersCount = ParseUtils.makeShortInt(baClassInfo,iPos+5);
            iPos+=7;
            for(int j=0;j<iExportSupersCount;j++){
                int superIndex=ParseUtils.makeShortInt(baClassInfo,iPos);
                ci.exportSuperList.add(new Integer(superIndex));
                fw.write("\t\tSuper Class: "+constList.get(superIndex));
                System.out.println("\t\tSuper Class: "+constList.get(superIndex));
                iPos+=2;
            }
            int iExportInterfacesCount=baClassInfo[iPos];
            iPos++;
            for(int k=0;k<iExportInterfacesCount;k++){
                int interfaceIndex = ParseUtils.makeShortInt(baClassInfo,iPos);
                ci.exportInterfaceList.add(new Integer(interfaceIndex));
                fw.write("\t\tImplemented interface: "+constList.get(interfaceIndex));
                System.out.println("\t\tImplemented interface: "+constList.get(interfaceIndex));
                iPos+=2;
            }
            
            int fieldCount = ParseUtils.makeShortInt(baClassInfo,iPos);
            iPos+=2;
            for(int l=0;l<fieldCount;l++){
                FieldInfo fi=new FieldInfo();
                fi.bToken = baClassInfo[iPos];
                fi.accessFlags=ParseUtils.makeShortInt(baClassInfo, iPos+1);
                fi.nameIndex=ParseUtils.makeShortInt(baClassInfo, iPos+3);
                fi.setFieldName(constList.get(fi.nameIndex).toString());
                fi.descriptorIndex=ParseUtils.makeShortInt(baClassInfo, iPos+5);
                fi.setDescipotName(constList.get(fi.descriptorIndex).toString());
                System.out.println("\t\tField:"+fi.toString());
                fw.write("\t\tField:"+fi.toString()+"\n");
                int attrCnt = ParseUtils.makeShortInt(baClassInfo, iPos+7);
                iPos+=9;
                for(int m=0;m<attrCnt;m++){
                    Attributes ab = parseAttribute(baClassInfo,iPos,constList);
                    System.out.println("\t\tAttribute: "+ab.toString());
                    fw.write("\t\tAttribute: "+ab.toString()+"\n");
                    fi.attribList.add(ab);
                    iPos+=6;
                    iPos+=ab.getAttrLength();
                }
                ci.fieldList.add(fi);
            }
            
            int iMethodCount=ParseUtils.makeShortInt(baClassInfo, iPos);
            iPos+=2;
            for(int n=0;n<iMethodCount;n++){
                MethodInfo mi=parseMethod(baClassInfo,iPos,constList);
                fw.write("\t\tMethod:"+mi+"\n");
                System.out.println("\t\tMethod:"+mi);
                ci.methodList.add(mi);                                                
                iPos+=7;
            }
            
            fw.write("\t}\n");
            System.out.println("\t}");
            classList.add(ci);
        }
    }
    
    private static Attributes parseAttribute(byte[] attrData, int iPos,ArrayList constList){
        int attrNameIndex = ParseUtils.makeShortInt(attrData, iPos);        
        int attrLength=ParseUtils.makeInt(attrData, iPos+2);
        Attributes ab=new Attributes(attrNameIndex,attrLength);
        ab.setAttrName(constList.get(attrNameIndex).toString());
        return ab;
    }
    
    private static MethodInfo parseMethod(byte[] baMethodInfo, int iPos,ArrayList constList){
        MethodInfo mi=new MethodInfo();
        mi.bToken=baMethodInfo[iPos];
        mi.iAccessFlag=ParseUtils.makeShortInt(baMethodInfo, iPos+1);
        mi.iNameIndex=ParseUtils.makeShortInt(baMethodInfo, iPos+3);
        mi.iDescriptorIndex=ParseUtils.makeShortInt(baMethodInfo, iPos+5);
        mi.setMethodName(constList.get(mi.iNameIndex).toString()+ constList.get(mi.iDescriptorIndex).toString());
        return mi;
    }
}
