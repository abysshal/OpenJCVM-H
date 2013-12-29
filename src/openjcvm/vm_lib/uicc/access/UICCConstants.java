//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.access;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 * The <b>UICCConstants interface</b> hold all the constants defined in TS 102.221
 */
public interface UICCConstants {

	// ------------------------------- Constants ------------------------------
	/**
	 * EF under the Master File, these files are specified in SCP TS 102 221.
	 */
	/**
	 * File identifier : Directory File EF_DIR = 0x2F00
	 */
	public final static short FID_EF_DIR = (short) 0x2F00;
	/**
	 *  File identifier : ICC Identification EF_ICCID = 0x2FE2
	 */
	public final static short FID_EF_ICCID = (short) 0x2FE2;
	/**
	 *  File identifier : Access Rule Reference  EF_ARR = 0x2F06
	 */
	public final static short FID_EF_ARR = (short) 0x2F06;
	/**
	 * File identifier : Preferred Languages  EF_PL = 0x2F05
	 */
	public final static short FID_EF_PL = (short) 0x2F05;

	/**
	 * File identifier : DF TELECOM = 0x7F10
	 */
	public final static short FID_DF_TELECOM = (short) 0x7F10;

	/**
	 * DF under DF TELECOM
	 */
	/**
	 * File identifier : DF Graphics = 0x5F50 (under DF TELECOM)
	 */
	public final static short FID_DF_GRAPHICS = (short) 0x5F50;

	/**
	 * EF under DF TELECOM
	 */
	/**
	 * File identifier : EF ADN = 0x6F3A (under DF TELECOM)
	 */
	public final static short FID_EF_ADN = (short) 0x6F3A;
	/**
	 * File identifier : EF FDN = 0x6F3B (under DF TELECOM)
	 */
	public final static short FID_EF_FDN = (short) 0x6F3B;
	/**
	 * File identifier : EF SMS = 0x6F3C (under DF TELECOM)
	 */
	public final static short FID_EF_SMS = (short) 0x6F3C;
	/**
	 * File identifier : EF CCP = 0x6F3D (under DF TELECOM)
	 */
	public final static short FID_EF_CCP = (short) 0x6F3D;
	/**
	 * File identifier : EF MSISDN = 0x6F40 (under DF TELECOM)
	 */
	public final static short FID_EF_MSISDN = (short) 0x6F40;
	/**
	 * File identifier : EF SMSP = 0x6F42 (under DF TELECOM)
	 */
	public final static short FID_EF_SMSP = (short) 0x6F42;
	/**
	 * File identifier : EF SMSS = 0x6F43 (under DF TELECOM)
	 */
	public final static short FID_EF_SMSS = (short) 0x6F43;
	/**
	 * File identifier : EF LND = 0x6F44 (under DF TELECOM)
	 */
	public final static short FID_EF_LND = (short) 0x6F44;
	/**
	 * File identifier : EF SDN = 0x6F49 (under DF TELECOM)
	 */
	public final static short FID_EF_SDN = (short) 0x6F49;
	/**
	 * File identifier : EF EXT1 = 0x6F4A (under DF TELECOM)
	 */
	public final static short FID_EF_EXT1 = (short) 0x6F4A;
	/**
	 * File identifier : EF EXT2 = 0x6F4B (under DF TELECOM)
	 */
	public final static short FID_EF_EXT2 = (short) 0x6F4B;
	/**
	 * File identifier : EF EXT3 = 0x6F4C (under DF TELECOM)
	 */
	public final static short FID_EF_EXT3 = (short) 0x6F4C;
	/**
	 * File identifier : EF BDN = 0x6F4D (under DF TELECOM)
	 */
	public final static short FID_EF_BDN = (short) 0x6F4D;
	/**
	 * File identifier : EF EXT4 = 0x6F4E (under DF TELECOM)
	 */
	public final static short FID_EF_EXT4 = (short) 0x6F4E;
	/**
	 * File identifier : EF SMSR = 0x6F47 (under DF TELECOM)
	 */
	public final static short FID_EF_SMSR = (short) 0x6F47;

	/**
	 * EF under DF Graphics under DF TELECOM
	 */
	/**
	 * File identifier : EF IMG = 0x4F20 (under DF Graphics)
	 */
	public final static short FID_EF_IMG = (short) 0x4F20;

	/**
	 * Search mode forward  beginning at the given record number
	 */
	public final static byte SIMPLE_SEARCH_START_FORWARD = (byte) 0x04;
	/**
	 * Search mode backward beginning at the given record number
	 */
	public final static byte SIMPLE_SEARCH_START_BACKWARD = (byte) 0x05;
	/**
	 * Enhanced search
	 */
	public final static byte ENHANCED_SEARCH = (byte) 0x06;

	/**
	 * Search mode indication forward starting at given record number
	 */
	public final static short SEARCH_INDICATION_START_FORWARD_FROM_NEXT_GR = (short) 0x0400;
	/**
	 * Search mode indication backward starting at given record number
	 */
	public final static short SEARCH_INDICATION_START_BACKWARD_FROM_PREVIOUS_GR = (short) 0x0500;
	/**
	 * Search mode indication forward starting at next record
	 */
	public final static short SEARCH_INDICATION_START_FORWARD_FROM_NEXT = (short) 0x0600;
	/**
	 * Search mode indication backward starting from previous record
	 */
	public final static short SEARCH_INDICATION_START_BACKWARD_FROM_PREVIOUS = (short) 0x0700;

	/**
	 * Modes for record files
	 */
	/**
	 * Record access mode: CURRENT = 0x04
	 */
	public final static byte REC_ACC_MODE_CURRENT = (byte) 0x04;
	/**
	 * Record access mode: ABSOLUTE = 0x04
	 */
	public final static byte REC_ACC_MODE_ABSOLUTE = (byte) 0x04;
	/**
	 * Record access mode: NEXT = 0x02
	 */
	public final static byte REC_ACC_MODE_NEXT = (byte) 0x02;
	/**
	 * Record access mode PREVIOUS = 0x03
	 */
	public final static byte REC_ACC_MODE_PREVIOUS = (byte) 0x03;
        
        /**
	 * Modes for BER-TLV files
	 */
	/**
	 * First Block = 0x80
	 */
	public final static byte BER_TLV_ACC_MODE_FIRST = (byte) 0x80;
	/**
	 * Next Block = 0x00
	 */
	public final static byte BER_TLV_ACC_MODE_NEXT = (byte) 0x00;


	/**
	 * Tags defined in ETSI TS 102.221 for the FCP TLV structure
	 */
	/**
	 * TAG in FCP TLV structure: File Descriptor = 0x82
	 */
	public final static byte TAG_FCP_FILE_DESCRIPTOR = (byte) 0x82;
	/**
	 * TAG in FCP TLV structure: File Identifier = 0x83
	 */
	public final static byte TAG_FCP_FILE_IDENTIFIER = (byte) 0x83;
	/**
	 * Tag in FCP TLV structure: DF name (AID) = 0x84
	 */
	public final static byte TAG_FCP_FILE_AID = (byte) 0x84;
	/**
	 * Tag in FCP TLV structure: Proprietary information = 0xA5
	 */
	public final static byte TAG_FCP_FILE_PROPRIETARY_INFO = (byte) 0xA5;
	/**
	 * Tag in FCP TLV structure: Life Cycle Status Information = 0x8A
	 */
	public final static byte TAG_FCP_LCS_INTEGER = (byte) 0x8A;
	/**
	 * Tag in FCP TLV structure: PIN Status Template DO = 0xC6
	 */
	public final static byte TAG_FCP_PIN_STATUS_TEMPLATE_DO = (byte) 0xC6;
	/**
	 * Tag in FCP TLV structure: File Size = 0x80
	 */
	public final static byte TAG_FCP_FILE_SIZE = (byte) 0x80;
	/**
	 * Tag in FCP TLV structure: Total File Size = 0x81
	 */
	public final static byte TAG_FCP_TOTAL_FILE_SIZE = (byte) 0x81;
	/**
	 * TAG in FCP TLV structure: Short File Identifier = 0x88
	 */
	public final static byte TAG_FCP_SHORT_FILE_IDENTIFIER = (byte) 0x88;
	/**
	 * TAG in FCP TLV structure: Security attributes Compact Format = 0x8C
	 */
	public final static byte TAG_FCP_SECURITY_ATTRIBUTE_CF = (byte) 0x8C;
	/**
	 * TAG in FCP TLV structure: Security attributes Expanded Format = 0xAB
	 */
	public final static byte TAG_FCP_SECURITY_ATTRIBUTE_EF = (byte) 0xAB;
	/**
	 * @deprecated TAG in FCP TLV structure: Security attributes Ref. to Expanded Format = 0xAB
	 * Warning! The value of this constant is not in accordance with TS 102 221. 
	 * The value of this tag as defined in TS 102 221 is 0x8B. The use of this constant may yield undesired results. Use constant TAG_FCP_SECURITY_ATTRIBUTE_REFERENCED_EF instead.

	 */
	public final static byte TAG_FCP_SECURITY_ATTRIBUTE_REF_EF = (byte) 0xAB;
	/**
 	 * TAG in FCP TLV structure: Security attributes Referenced to Expanded Format = 0x8B
	 */
	public final static byte TAG_FCP_SECURITY_ATTRIBUTE_REFERENCED_EF = (byte) 0x8B;

}

