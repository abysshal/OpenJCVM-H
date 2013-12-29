//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------


/**
 * <code>ToolkitConstants</code> encapsulates constants related to the Toolkit Applets.
 *
 */
public interface ToolkitConstants {
	// --------------------------- Events Constants --------------------------
	/**
	 * Event : Profile Download  = 1
	 */
	final static short EVENT_PROFILE_DOWNLOAD = (short) 1;
	/**
	 * Event : Menu Selection  = 7
	 */
	final static short EVENT_MENU_SELECTION = (short) 7;
	/**
	 * Event : Menu Selection Help Request = 8
	 */
	final static short EVENT_MENU_SELECTION_HELP_REQUEST = (short) 8;
	/**
	 * Event : Call Control by NAA = 9
	 */
	final static short EVENT_CALL_CONTROL_BY_NAA = (short) 9;
	/**
	 * Event : Timer Expiration = 11
	 */
	final static short EVENT_TIMER_EXPIRATION = (short) 11;
	/**
	 * Event : Event Download - MT call type = 12
	 */
	final static short EVENT_EVENT_DOWNLOAD_MT_CALL = (short) 12;
	/**
	 * Event : Event Download - Call connected type = 13
	 */
	final static short EVENT_EVENT_DOWNLOAD_CALL_CONNECTED = (short) 13;
	/**
	 * Event : Event Download - Call disconnected type = 14
	 */
	final static short EVENT_EVENT_DOWNLOAD_CALL_DISCONNECTED = (short) 14;
	/**
	 * Event : Event Download - Location status type = 15
	 */
	final static short EVENT_EVENT_DOWNLOAD_LOCATION_STATUS = (short) 15;
	/**
	 * Event : Event Download - User activity type = 16
	 */
	final static short EVENT_EVENT_DOWNLOAD_USER_ACTIVITY = (short) 16;
	/**
	 * Event : Event Download - Idle screen available type = 17
	 */
	final static short EVENT_EVENT_DOWNLOAD_IDLE_SCREEN_AVAILABLE = (short) 17;
	/**
	 * Event : Event Download - Card Reader Status = 18
	 */
	final static short EVENT_EVENT_DOWNLOAD_CARD_READER_STATUS = (short) 18;
	/**
	 * Event : Status APDU command = 19
	 */
	final static short EVENT_STATUS_COMMAND = (short) 19;
	/**
	 * Event : Event Download - Language Selection type = 20
	 */
	final static short EVENT_EVENT_DOWNLOAD_LANGUAGE_SELECTION = (short) 20;
	/**
	 * Event : Event Download - Browser Termination type =21
	 */
	final static short EVENT_EVENT_DOWNLOAD_BROWSER_TERMINATION = (short) 21;
	/**
	 * Event : Event Download - Data Available type = 22
	 */
	final static short EVENT_EVENT_DOWNLOAD_DATA_AVAILABLE = (short) 22;
	/**
	 * Event : Event Download - Channel Status type = 23
	 */
	final static short EVENT_EVENT_DOWNLOAD_CHANNEL_STATUS = (short) 23;
	/**
	 * Event : Event Download - Access Technology Change type = 25
	 */
	final static short EVENT_EVENT_DOWNLOAD_ACCESS_TECHNOLOGY_CHANGE = (short) 25;
	/**
	 * Event : Event Download - Display Parameter Change type = 26
	 */
	final static short EVENT_EVENT_DOWNLOAD_DISPLAY_PARAMETER_CHANGED = (short) 26;
	/**
	 * Event : Event Download - Local Connection type = 27
	 */
	final static short EVENT_EVENT_DOWNLOAD_LOCAL_CONNECTION = (short) 27;
	/**
	 * Event: Event Network Search Mode Change = 28
	 */
	 final static short EVENT_EVENT_DOWNLOAD_NETWORK_SEARCH_MODE_CHANGE =(short)28;
	 /**
	  * Event: Event Browsing Status = 29
	  */
	 final static short EVENT_EVENT_BROWSING_STATUS =(short)29;
	//
	// Event : First Command After Select type = 127
	//
	// final static short EVENT_FIRST_COMMAND_AFTER_SELECT = (short) 127;
	/** 
	 * Event: Proactive Handler Available =  123
	 */
        final static short EVENT_PROACTIVE_HANDLER_AVAILABLE = (short)123;
	/**
	 * Event: External File Update = 124
	 */
	 final static short EVENT_EXTERNAL_FILE_UPDATE = (short)124;
	/**
	 * Event : Application Deselect type = 126
	 */
	final static short EVENT_APPLICATION_DESELECT = (short) 126;
	/** 
	 * Event: First Command After ATR = 127 
	 */
        final static short EVENT_FIRST_COMMAND_AFTER_ATR = (short)127;
	
	/**
	 * Event : Proprietary events reserved range = [-32768, -1]
	 */
	/**
	 * Event : Unrecognized Envelope = -1
	 */
	final static short EVENT_UNRECOGNIZED_ENVELOPE = (short) -1;

	// -------------------------- BER-TLV Constants -------------------------
	/**
	 * BER-TLV : Proactive UICC command tag                          = 0xD0
	 */
	final static byte BTAG_PROACTIVE_UICC_COMMAND = (byte) 0xD0;
	/**
	 * BER-TLV : Menu Selection tag                                 = 0xD3
	 */
	final static byte BTAG_MENU_SELECTION = (byte) 0xD3;
	/**
	 * BER-TLV : Call Control tag                                   = 0xD4
	 */
	final static byte BTAG_CALL_CONTROL = (byte) 0xD4;
	/**
	 * BER-TLV : Event download tag                                 = 0xD6
	 */
	final static byte BTAG_EVENT_DOWNLOAD = (byte) 0xD6;
	/**
	 * BER-TLV : Timer Expiration tag                               = 0xD7
	 */
	final static byte BTAG_TIMER_EXPIRATION = (byte) 0xD7;

	// ------------------------ Comprehension-TLV Constants -------------------------
	/**
	 * Comprehension-TLV : Command Details tag                             = 0x01
	 */
	final static byte TAG_COMMAND_DETAILS = (byte) 0x01;
	/**
	 * Comprehension-TLV : Device Identities tag                           = 0x02
	 */
	final static byte TAG_DEVICE_IDENTITIES = (byte) 0x02;
	/**
	 * Comprehension-TLV : Result tag                                      = 0x03
	 */
	final static byte TAG_RESULT = (byte) 0x03;
	/**
	 * Comprehension-TLV : Duration tag                                    = 0x04
	 */
	final static byte TAG_DURATION = (byte) 0x04;
	/**
	 * Comprehension-TLV : Alpha Identifier tag                            = 0x05
	 */
	final static byte TAG_ALPHA_IDENTIFIER = (byte) 0x05;
	/**
	 * Comprehension-TLV : Address tag                                     = 0x06
	 */
	final static byte TAG_ADDRESS = (byte) 0x06;
	/**
	 * Comprehension-TLV : Capability Configuration Parameters tag         = 0x07
	 */
	final static byte TAG_CAPABILITY_CONFIGURATION_PARAMETERS = (byte) 0x07;
	/**
	 * Comprehension-TLV : Called Party Subaddress tag                     = 0x08
	 */
	final static byte TAG_CALLED_PARTY_SUBADDRESS = (byte) 0x08;
	/**
	 * Comprehension-TLV : Text String tag                                 = 0x0D
	 */
	final static byte TAG_TEXT_STRING = (byte) 0x0D;
	/**
	 * Comprehension-TLV : Tone tag                                        = 0x0E
	 */
	final static byte TAG_TONE = (byte) 0x0E;
	/**
	 * Comprehension-TLV : Item tag                                        = 0x0F
	 */
	final static byte TAG_ITEM = (byte) 0x0F;
	/**
	 * Comprehension-TLV : Item Identifier tag                             = 0x10
	 */
	final static byte TAG_ITEM_IDENTIFIER = (byte) 0x10;
	/**
	 * Comprehension-TLV : Response Length tag                             = 0x11
	 */
	final static byte TAG_RESPONSE_LENGTH = (byte) 0x11;
	/**
	 * Comprehension-TLV : File List tag                                   = 0x12
	 */
	final static byte TAG_FILE_LIST = (byte) 0x12;
	/**
	 * Comprehension-TLV : Location Information tag                        = 0x13
	 */
	final static byte TAG_LOCATION_INFORMATION = (byte) 0x13;
	/**
	 * Comprehension-TLV : IMEI tag                                        = 0x14
	 */
	final static byte TAG_IMEI = (byte) 0x14;
	/**
	 * Comprehension-TLV : Help Request tag                                = 0x15
	 */
	final static byte TAG_HELP_REQUEST = (byte) 0x15;
	/**
	 * Comprehension-TLV : Network Measurement Results tag                 = 0x16
	 */
	final static byte TAG_NETWORK_MEASUREMENT_RESULTS = (byte) 0x16;
	/**
	 * Comprehension-TLV : Default Text tag                                = 0x17
	 */
	final static byte TAG_DEFAULT_TEXT = (byte) 0x17;
	/**
	 * Comprehension-TLV : Items Next Action Indicator tag                 = 0x18
	 */
	final static byte TAG_ITEMS_NEXT_ACTION_INDICATOR = (byte) 0x18;
	/**
	 * Comprehension-TLV : Event List tag                                  = 0x19
	 */
	final static byte TAG_EVENT_LIST = (byte) 0x19;
	/**
	 * Comprehension-TLV : Location Status tag                             = 0x1B
	 */
	final static byte TAG_LOCATION_STATUS = (byte) 0x1B;
	/**
	 * Comprehension-TLV : Icon Identifier tag                             = 0x1E
	 */
	final static byte TAG_ICON_IDENTIFIER = (byte) 0x1E;
	/**
	 * Comprehension-TLV : Item Icon Identifier list tag                   = 0x1F
	 */
	final static byte TAG_ITEM_ICON_IDENTIFIER_LIST = (byte) 0x1F;
	/**
	 * Comprehension-TLV : Card Reader status tag                          = 0x20
	 */
	final static byte TAG_CARD_READER_STATUS = (byte) 0x20;
	/**
	 * Comprehension-TLV : Card ATR tag                                    = 0x21
	 */
	final static byte TAG_CARD_ATR = (byte) 0x21;
	/**
	 * Comprehension-TLV : C-APDU tag                                      = 0x22
	 */
	final static byte TAG_C_APDU = (byte) 0x22;
	/**
	 * Comprehension-TLV : R-APDU tag                                      = 0x23
	 */
	final static byte TAG_R_APDU = (byte) 0x23;
	/**
	 * Comprehension-TLV : Timer Identifier tag                            = 0x24
	 */
	final static byte TAG_TIMER_IDENTIFIER = (byte) 0x24;
	/**
	 * Comprehension-TLV : Timer Value tag                                 = 0x25
	 */
	final static byte TAG_TIMER_VALUE = (byte) 0x25;
	/**
	 * Comprehension-TLV : Date-Time and Time Zone tag                     = 0x26
	 */
	final static byte TAG_DATE_TIME_AND_TIME_ZONE = (byte) 0x26;
	/**
	 * Comprehension-TLV : Call Control requested action tag               = 0x27
	 */
	final static byte TAG_CALL_CONTROL_REQUESTED_ACTION = (byte) 0x27;
	/**
	 * Comprehension-TLV : AT Command tag                                  = 0x28
	 */
	final static byte TAG_AT_COMMAND = (byte) 0x28;
	/**
	 * Comprehension-TLV : AT Response tag                                 = 0x29
	 */
	final static byte TAG_AT_RESPONSE = (byte) 0x29;
	/**
	 * Comprehension-TLV : Immediate response tag                          = 0x2B
	 */
	final static byte TAG_IMMEDIATE_RESPONSE = (byte) 0x2B;
	/**
	 * Comprehension-TLV : DTMF string tag                                 = 0x2C
	 */
	final static byte TAG_DTMF_STRING = (byte) 0x2C;
	/**
	 * Comprehension-TLV : Language Tag                                    = 0x2D
	 */
	final static byte TAG_LANGUAGE = (byte) 0x2D;
	/**
	 * Comprehension-TLV : AID TAG                                         = 0x2F
	 */
	final static byte TAG_AID = (byte) 0x2F;
	/**
	 * Comprehension-TLV : Browser Identity Tag                            = 0x30
	 */
	final static byte TAG_BROWSER_IDENTITY = (byte) 0x30;
	/**
	 * Comprehension-TLV : URL Tag					       = 0x31
	 */
	final static byte TAG_URL = (byte) 0x31;
	/**
	 * Comprehension-TLV : Bearer TAG                                      = 0x32
	 */
	final static byte TAG_BEARER = (byte) 0x32;
	/**
	 * Comprehension-TLV : Provisioning Reference File Tag                 = 0x33
	 */
	final static byte TAG_PROVISION_REFERENCE_FILE = (byte) 0x33;
	/**
	 * Comprehension-TLV : Browser Termination Cause Tag                  = 0x34
	 */
	final static byte TAG_BROWSER_TERMINATION = (byte) 0x34;
	/**
	 * Comprehension-TLV : Bearer Description Tag                          = 0x35
	 */
	final static byte TAG_BEARER_DESCRIPTION = (byte) 0x35;
	/**
	 * Comprehension-TLV : Channel Data Tag                                = 0x36
	 */
	final static byte TAG_CHANNEL_DATA = (byte) 0x36;
	/**
	 * Comprehension-TLV : Channel Data Length Tag                         = 0x37
	 */
	final static byte TAG_CHANNEL_DATA_LENGTH = (byte) 0x37;
	/**
	 * Comprehension-TLV : Channel Status Tag                              = 0x38
	 */
	final static byte TAG_CHANNEL_DATA_STATUS = (byte) 0x38;
	/**
	 * Comprehension-TLV : Buffer size Tag                                 = 0x39;
	 */
	final static byte TAG_BUFFER_SIZE = (byte) 0x39;
	/**
	 * Comprehension-TLV : Card reader identifier Tag                      = 0x3A
	 */
	final static byte TAG_CARD_READER_ID = (byte) 0x3A;
	/**
	 * Comprehension-TLV : UICC/Terminal interface transport level         = 0x3C
	 */
	final static byte TAG_UICC_TERMINAL_TRANSPORT_LEVEL = (byte) 0x3C;
	/**
	 * Comprehension-TLV : Other address (data destination address)        = 0x3E
	 */
	final static byte TAG_OTHER_DATA_DESTINATION_ADDRESS = (byte) 0x3E;
	/**
	 * Comprehension-TLV : Access Technology Tag                           = 0x3F
	 */
	final static byte TAG_ACCESS_TECHNOLOGY = (byte) 0x3F;
	/**
	 * Comprehension-TLV : Display parameter tags                          = 0x40
	 */
	final static byte TAG_DISPLAY_PARAMETERS = (byte) 0x40;
	/**
	 * Comprehension-TLV : Service Record                                  = 0x41
	 */
	final static byte TAG_SERVICE_RECORD = (byte) 0x41;
	/**
	 * Comprehension-TLV : Device Filter                                   = 0x42
	 */
	final static byte TAG_DEVICE_FILTER = (byte) 0x42;
	/**
	 * Comprehension-TLV : Service Search                                  = 0x43
	 */
	final static byte TAG_SERVICE_SEARCH = (byte) 0x43;
	/**
	 * Comprehension-TLV : Attribute Information                           = 0x44
	 */
	final static byte TAG_ATTRIBUTE_INFORMATION = (byte) 0x44;
	/**
	 * Comprehension-TLV : Service Availability                            = 0x45
	 */
	final static byte TAG_SERVICE_AVAILABILITY = (byte) 0x45;
	/**
	 * Comprehension-TLV : ESN tag                                         = 0x46
	 */
	final static byte TAG_ESN = (byte) 0x46;
	/**
	 * Comprehension-TLV: Network Access name tag                           = 0x47
	 */
	final static byte TAG_NETWORK_ACCESS_NAME = (byte)0x47;
	/**
	 * Comprehension-TLV: Remote Entity Address tag                         = 0x49
	 */
         final static byte TAG_REMOTE_ENTITY_ADDRESS=(byte)0x49;
	/**
	 * Comprehension-TLV: Text attribute tag                                = 0x50
	 */
	 final static byte TAG_TEXT_ATTRIBUTE_TAG=(byte)0x50;
	/**
	 * Comprehension-TLV: Item Text attribute list tag                      = 0x51
	 */
	 final static byte TAG_ITEM_TEXT_ATTRIBUTE_LIST=(byte)0x51;
	/**
	 * Comprehension-TLV: IMEISV                                            = 0x62
	 */
	 final static byte TAG_IMEISV=(byte)0x62;
	/**
	 * Comprehension-TLV: Battery State tag                                 = 0x63
	 */
	 final static byte TAG_BATTERY_STATE=(byte)0x63;
	 /**
          * Comprehension-TLV: Browsing Status tag                              = 0x64
          */
         final static byte TAG_BROWSING_STATUS =(byte)0x64;
        /**
         * Comprehension-TLV: Network Search Mode tag                           = 0x65
         */
        final static byte TAG_NETWORK_SEARCH_MODE =(byte)0x65;
	/**
	 * Comprehension-TLV : mask to set the CR flag of any Comprehension-TLV tag   = 0x80
	 */
	final static byte TAG_SET_CR = (byte) 0x80;
	/**
	 * Comprehension-TLV : mask to reset the CR flag of any Comprehension-TLV tag = 0x7F
	 */
	final static byte TAG_SET_NO_CR = (byte) 0x7F;

	// ---------------------- Constants for TLV management --------------------
	/**
	 * Value of a TLV Length field's first byte in TLV with a Value field is
	 *  greater than 127 bytes					     = 0x81
	 */
	final static byte TLV_LENGTH_CODED_2BYTES = (byte) 0x81;

	// ---------------------- Constants for findTLV method --------------------
	/**
	 * findTLV method result : if TLV is not found in the handler   = 0x00
	 */
	final static byte TLV_NOT_FOUND = (byte) 0;
	/**
	 * findTLV method result : if TLV is found with CR set          = 0x01
	 */
	final static byte TLV_FOUND_CR_SET = (byte) 1;
	/**
	 * findTLV method result : if TLV is found with CR not set      = 0x02
	 */
	final static byte TLV_FOUND_CR_NOT_SET = (byte) 2;

	// ------------------ Type of proactive command constants -----------------
	/**
	 * Type of proactive command : REFRESH                          = 0x01
	 */
	final static byte PRO_CMD_REFRESH = (byte) 0x01;
	/**
	 * Type of proactive command : MORE TIME                        = 0x02
	 */
	final static byte PRO_CMD_MORE_TIME = (byte) 0x02;
	/**
	 * Type of proactive command : SET UP CALL                      = 0x10
	 */
	final static byte PRO_CMD_SET_UP_CALL = (byte) 0x10;
	/**
         * Type of proactive command : SEND SHORT MESSAGE                =0x13
         */
        final static byte PRO_CMD_SEND_SHORT_MESSAGE=(byte)0x13;
	/**
	 * Type of proactive command : SEND DTMF                        = 0x14
	 */
	final static byte PRO_CMD_SEND_DTMF = (byte) 0x14;
	/**
	 * Type of proactive command : LAUNCH BROWSER                   = 0x15
	 */
	final static byte PRO_CMD_LAUNCH_BROWSER = (byte) 0x15;
	/**
	 * Type of proactive command : PLAY TONE                        = 0x20
	 */
	final static byte PRO_CMD_PLAY_TONE = (byte) 0x20;
	/**
	 * Type of proactive command : DISPLAY TEXT                     = 0x21
	 */
	final static byte PRO_CMD_DISPLAY_TEXT = (byte) 0x21;
	/**
	 * Type of proactive command : GET INKEY                        = 0x22
	 */
	final static byte PRO_CMD_GET_INKEY = (byte) 0x22;
	/**
	 * Type of proactive command : GET INPUT                        = 0x23
	 */
	final static byte PRO_CMD_GET_INPUT = (byte) 0x23;
	/**
	 * Type of proactive command : SELECT ITEM                      = 0x24
	 */
	final static byte PRO_CMD_SELECT_ITEM = (byte) 0x24;
	/**
	 * Type of proactive command : PROVIDE LOCAL INFORMATION        = 0x26
	 */
	final static byte PRO_CMD_PROVIDE_LOCAL_INFORMATION = (byte) 0x26;
	/**
	 * Type of proactive command : TIMER MANAGEMENT                 = 0x27
	 */
	final static byte PRO_CMD_TIMER_MANAGEMENT = (byte) 0x27;
	/**
	 * Type of proactive command : SET UP IDLE MODE TEXT            = 0x28
	 */
	final static byte PRO_CMD_SET_UP_IDLE_MODE_TEXT = (byte) 0x28;
	/**
	 * Type of proactive command : PERFORM CARD APDU                = 0x30
	 */
	final static byte PRO_CMD_PERFORM_CARD_APDU = (byte) 0x30;
	/**
	 * Type of proactive command : POWER ON CARD                    = 0x31
	 */
	final static byte PRO_CMD_POWER_ON_CARD = (byte) 0x31;
	/**
	 * Type of proactive command : POWER OFF CARD                   = 0x32
	 */
	final static byte PRO_CMD_POWER_OFF_CARD = (byte) 0x32;
	/**
	 * Type of proactive command : GET READER STATUS                = 0x33
	 */
	final static byte PRO_CMD_GET_READER_STATUS = (byte) 0x33;
	/**
	 * Type of proactive command : RUN AT COMMAND                   = 0x34
	 */
	final static byte PRO_CMD_RUN_AT_COMMAND = (byte) 0x34;
	/**
	 * Type of proactive command : Language Notification            = 0x35
	 */
	final static byte PRO_CMD_LANGUAGE_NOTIFICATION = (byte) 0x35;
	/**
	 * Type of proactive command : Open Channel                     = 0x40
	 */
	final static byte PRO_CMD_OPEN_CHANNEL = (byte) 0x40;
	/**
	 * Type of proactive command : Close Channel                    = 0x41
	 */
	final static byte PRO_CMD_CLOSE_CHANNEL = (byte) 0x41;
	/**
	 * Type of proactive command : Receive Data                     = 0x42
	 */
	final static byte PRO_CMD_RECEIVE_DATA = (byte) 0x42;
	/**
	 * Type of proactive command : Send Data                        = 0x43
	 */
	final static byte PRO_CMD_SEND_DATA = (byte) 0x43;
	/**
	 * Type of proactive command : Get Channel Status               = 0x44
	 */
	final static byte PRO_CMD_GET_CHANNEL_STATUS = (byte) 0x44;
	/**
	 * Type of proactive command : Service Search                   = 0x45
	 */
	final static byte PRO_CMD_SERVICE_SEARCH = (byte) 0x45;
	/**
	 * Type of proactive command : Get Service Information          = 0x46
	 */
	final static byte PRO_CMD_GET_SERVICE_INFORMATION = (byte) 0x46;
	/**
	 * Type of proactive command : Declare Service                  = 0x47
	 */
	final static byte PRO_CMD_DECLARE_SERVICE = (byte) 0x47;

	// ----------------------- Device Identity constants ----------------------
	/**
	 * Device Identity : Keypad                                     = 0x01
	 */
	final static byte DEV_ID_KEYPAD = (byte) 0x01;
	/**
	 * Device Identity : Display                                    = 0x02
	 */
	final static byte DEV_ID_DISPLAY = (byte) 0x02;
	/**
	 * Device Identity : Earpiece                                   = 0x03
	 */
	final static byte DEV_ID_EARPIECE = (byte) 0x03;
	/**
	 * Device Identity : Additional Card Reader 0                   = 0x10
	 */
	final static byte DEV_ID_ADDITIONAL_CARD_READER_0 = (byte) 0x10;
	/**
	 * Device Identity : Additional Card Reader 1                   = 0x11
	 */
	final static byte DEV_ID_ADDITIONAL_CARD_READER_1 = (byte) 0x11;
	/**
	 * Device Identity : Additional Card Reader 2                   = 0x12
	 */
	final static byte DEV_ID_ADDITIONAL_CARD_READER_2 = (byte) 0x12;
	/**
	 * Device Identity : Additional Card Reader 3                   = 0x13
	 */
	final static byte DEV_ID_ADDITIONAL_CARD_READER_3 = (byte) 0x13;
	/**
	 * Device Identity : Additional Card Reader 4                   = 0x14
	 */
	final static byte DEV_ID_ADDITIONAL_CARD_READER_4 = (byte) 0x14;
	/**
	 * Device Identity : Additional Card Reader 5                   = 0x15
	 */
	final static byte DEV_ID_ADDITIONAL_CARD_READER_5 = (byte) 0x15;
	/**
	 * Device Identity : Additional Card Reader 6                   = 0x16
	 */
	final static byte DEV_ID_ADDITIONAL_CARD_READER_6 = (byte) 0x16;
	/**
	 * Device Identity : Additional Card Reader 7                   = 0x17
	 */
	final static byte DEV_ID_ADDITIONAL_CARD_READER_7 = (byte) 0x17;
	/**
	 * Device identity : Base Channel                               = 0x20
	 */
	final static byte DEV_ID_CHANNEL_BASE = (byte) 0x20;
	/**
	 * Device Identity : Channel 1                                  = 0x21;
	 */
	final static byte DEV_ID_CHANNEL_1 = (byte) 0x21;
	/**
	 * Device Identity : Channel 1                                  = 0x22;
	 */
	final static byte DEV_ID_CHANNEL_2 = (byte) 0x22;
	/**
	 * Device Identity : Channel 1                                  = 0x23;
	 */
	final static byte DEV_ID_CHANNEL_3 = (byte) 0x23;
	/**
	 * Device Identity : Channel 1                                  = 0x24;
	 */
	final static byte DEV_ID_CHANNEL_4 = (byte) 0x24;
	/**
	 * Device Identity : Channel 1                                  = 0x25;
	 */
	final static byte DEV_ID_CHANNEL_5 = (byte) 0x25;
	/**
	 * Device Identity : Channel 1                                  = 0x26;
	 */
	final static byte DEV_ID_CHANNEL_6 = (byte) 0x26;
	/**
	 * Device Identity : Channel 1                                  = 0x27;
	 */
	final static byte DEV_ID_CHANNEL_7 = (byte) 0x27;
	/**
	 * Device Identity : UICC                                       = 0x81
	 */
	final static byte DEV_ID_UICC = (byte) 0x81;
	/**
	 * Device Identity : Terminal                                   = 0x82
	 */
	final static byte DEV_ID_TERMINAL = (byte) 0x82;
	/**
	 * Device Identity : Network                                    = 0x83
	 */
	final static byte DEV_ID_NETWORK = (byte) 0x83;

	// ---------------- Data Coding Scheme (GSM03.38) constants ---------------
	/**
	 * Data Coding Scheme : GSM Default Alphabet                     = 0x00
	 */
	//public static final byte DCS_DEFAULT_ALPHABET                  = (byte)0x00;
	/**
	 * Data Coding Scheme : GSM 8 bit Data                          = 0x04
	 */
	//public static final byte DCS_8_BIT_DATA                        = (byte)0x04;
	/**
	 * Data Coding Scheme : UCS2                                    = 0x08
	 */
	//public static final byte DCS_UCS2                              = (byte)0x08;

	// -------------------- Status Word for SMS data download  -----------------
	/**
	 * Status Word 1 : use RP_ERROR channel                         = 0x9E
	 */
	//public static final byte SW1_RP_ERROR     	                = (byte)0x9E;
	/**
	 * Status Word 1 : use RP_ACK channel                           = 0x9F
	 */
	//public static final byte SW1_RP_ACK                           = (byte)0x9F;

	// -------------------------- Poll Interval Constants ---------------------
	/**
	 * Poll Interval : request to deregister from proactive polling = 0
	 */
	final static byte POLL_NO_DURATION = (byte) 0;
	/**
	 * Poll Interval : request the system duration   		= -1
	 */
	final static byte POLL_SYSTEM_DURATION = (byte) -1;

	// -------------------------- General Result constants ---------------------
	/**
	 * General Result : command performed successfully              = 0x00
	 */
	final static byte RES_CMD_PERF = (byte) 0x00;
	/**
	 * General Result : command performed with partial comprehension= 0x01
	 */
	final static byte RES_CMD_PERF_PARTIAL_COMPR = (byte) 0x01;
	/**
	 * General Result : command performed with missing information  = 0x02
	 */
	final static byte RES_CMD_PERF_MISSING_INFO = (byte) 0x02;
	/**
	 * General Result : REFRESH performed with additional EFs read    = 0x03
	 */
	final static byte RES_CMD_PERF_REFRESH_ADD_EF_READ = (byte) 0x03;
	/**
	 * General Result : command performed requested icon not displayed= 0x04
	 */
	final static byte RES_CMD_PERF_REQ_ICON_NOT_DISP = (byte) 0x04;
	/**
	 * General Result : command performed modified by Call Control  = 0x05
	 */
	final static byte RES_CMD_PERF_MODIF_CC_NAA = (byte) 0x05;
	/**
	 * General Result : command performed successfully limited service = 0x06
	 */
	final static byte RES_CMD_PERF_LIMITED_SERVICE = (byte) 0x06;
	/**
	 * General Result : command performed with modifications        = 0x07
	 */
	final static byte RES_CMD_PERF_WITH_MODIFICATION = (byte) 0x07;
	/**
	 * General Result : REFRESH performed but indicated NAA was not active = 0x08
	 */
	final static byte RES_REFRESH_PERF_NO_NAA_ACTIVE = (byte) 0x08;
	/**
	 * General Result : proactive UICC session terminated by user   = 0x10
	 */
	final static byte RES_CMD_PERF_SESSION_TERM_USER = (byte) 0x10;
	/**
	 * General Result : command performed backward move requested   = 0x11
	 */
	final static byte RES_CMD_PERF_BACKWARD_MOVE_REQ = (byte) 0x11;
	/**
	 * General Result : command performed no response from user     = 0x12
	 */
	final static byte RES_CMD_PERF_NO_RESP_FROM_USER = (byte) 0x12;
	/**
	 * General Result : command performed help information required= 0x13
	 */
	final static byte RES_CMD_PERF_HELP_INFO_REQ = (byte) 0x13;

	/**
	 * General Result : Terminal currently unable to process command= 0x20
	 */
	final static byte RES_TEMP_PB_TERMINAL_UNABLE_PROC = (byte) 0x20;
	/**
	 * General Result : Network currently unable to process command = 0x21
	 */
	final static byte RES_TEMP_PB_SESSION_TERM_USER = (byte) 0x21;
	/**
	 * General Result : User did not accept call set-up request     = 0x22
	 */
	final static byte RES_TEMP_PB_USER_REJECT_CALL_REQ = (byte) 0x22;
	/**
	 * General Result : User cleared call before connected or before the network released it  = 0x23
	 */
	final static byte RES_TEMP_PB_USER_CLEAR_CALL = (byte) 0x23;
	/**
	 * General Result : Action in contradiction with timer state    = 0x24
	 */
	final static byte RES_TEMP_PB_IN_CONTR_TIMER_STATE = (byte) 0x24;
	/**
	 * General Result : Interaction with call control by SIM        = 0x25
	 */
	final static byte RES_TEMP_PB_INTERACT_CC_BY_NAA = (byte) 0x25;

	/**
	 * Generic Result : Launch browser generic error code           = 0x26;
	 */
	final static byte RES_ERROR_LAUNCH_BROWSE_GENERIC_CODE = (byte) 0x26;
	/**
	 * General Result : command beyond terminal's capabilities      = 0x30
	 */
	final static byte RES_ERROR_CMD_BEYOND_TERMINAL_CAPAB = (byte) 0x30;
	/**
	 * General Result : command type not understood by terminal     = 0x31
	 */
	final static byte RES_ERROR_CMD_TYP_NOT_UNDERSTOOD = (byte) 0x31;
	/**
	 * General Result : command data not understood by terminal     = 0x32
	 */
	final static byte RES_ERROR_CMD_DATA_NOT_UNDERSTOOD = (byte) 0x32;
	/**
	 * General Result : command number not known by terminal        = 0x33
	 */
	final static byte RES_ERROR_CMD_NUMBER_NOT_KNOWN = (byte) 0x33;
	/**
	 * General Result : required values are missing                 = 0x36
	 */
	final static byte RES_ERROR_REQ_VALUES_MISS = (byte) 0x36;
	/**
	 * General Result : Multiple card command error                 = 0x38
	 */
	final static byte RES_ERROR_MULTIPLE_CARD_ERROR = (byte) 0x38;
	/**
	 * General Result : interaction with CC NAA                     = 0x39
	 */
	final static byte RES_ERROR_INTERACT_CC_SMSMO_BY_NAA = (byte) 0x39;
	/**
	 * General Result : Bearer Independent Protocol error           = 0x3A
	 */
	final static byte RES_ERROR_BEARER_INDEPENDENT_PROTOCOL_ERROR = (byte) 0x3A;
	/**
	 * General Result : Access Technology unable to process command = 0x3B
	 */
	final static byte RES_ERROR_ACCESS_TECH_ERROR = (byte) 0x3B;
}

