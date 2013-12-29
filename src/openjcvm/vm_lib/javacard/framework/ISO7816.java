package javacard.framework;

public interface ISO7816 
{
    public static final byte    CLA_ISO7816 = (byte)0x00;
    public static final byte    INS_EXTERNAL_AUTHENTICATE = (byte)0x82;
    public static final byte    INS_SELECT = (byte)0xA4;	
    public static final byte	OFFSET_CDATA = (byte)0x05;
    public static final byte	OFFSET_CLA = (byte)0x00;
	public static final byte	OFFSET_INS = (byte)0x01;
	public static final byte	OFFSET_LC = (byte)0x04;
	public static final byte	OFFSET_P1 = (byte)0x02;
	public static final byte	OFFSET_P2 = (byte)0x03;
	public static final short   SW_APPLET_SELECT_FAILED = (short)0x6999;
	public static final short	SW_BYTES_REMAINING_00 = (short)0x6100;
	public static final short   SW_CLA_NOT_SUPPORTED = (short)0x6E00;
	public static final short	SW_COMMAND_NOT_ALLOWED = (short)0x6986;
	public static final short	SW_CONDITIONS_NOT_SATISFIED = (short)0x6985;
	public static final short	SW_CORRECT_LENGTH_00 = (short)0x6C00;
	public static final short	SW_DATA_INVALID = (short)0x6984;
	public static final short	SW_FILE_FULL = (short)0x6A84;
	public static final short	SW_FILE_INVALID = (short)0x6983;
	public static final short	SW_FILE_NOT_FOUND = (short)0x6A82;
	public static final short	SW_FUNC_NOT_SUPPORTED = (short)0x6A81;
	public static final short	SW_INCORRECT_P1P2 = (short)0x6A86;
	public static final short	SW_INS_NOT_SUPPORTED = (short)0x6D00;
	public static final short	SW_NO_ERROR = (short)0x9000;
	public static final short	SW_RECORD_NOT_FOUND = (short)0x6A83;
	public static final short	SW_SECURITY_STATUS_NOT_SATISFIED = (short)0x6982;
	public static final short	SW_UNKNOWN = (short)0x6F00;	    
    public static final short	SW_WRONG_DATA = (short)0x6A80;	
	public static final short	SW_WRONG_LENGTH = (short)0x6700;	
	public static final short	SW_WRONG_P1P2 = (short)0x6B00;
	
}

