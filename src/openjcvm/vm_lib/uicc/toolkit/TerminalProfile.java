//-----------------------------------------------------------------------------
// PACKAGE DEFINITION
//-----------------------------------------------------------------------------
package uicc.toolkit;

//-----------------------------------------------------------------------------
// IMPORTS
//-----------------------------------------------------------------------------

/**
 * The <code>TerminalProfile</code> class contains methods to question the terminal
 * profile, regarding the support for "Common Application Toolkit CAT" and supposing that this
 * profile has been set by the <b>Terminal Profile</b> APDU command.<p>
 *
 */
public final class TerminalProfile {

	/**
	 * Profile Download index = 0
	 */
	public final static short IDX_PROFILE_DOWNLOAD = (short) 0;
	/**
	 * SMS PP Download index = 1
	 */
	public final static short IDX_SMS_PP_DOWNLOAD = (short) 1;
	/**
	 * Cell Broadcast Download index = 2
	 */
	public final static short IDX_CELL_BROADCAST_DOWNLOAD = (short) 2;
	/**
	 * Menu Selection index = 3
	 */
	public final static short IDX_MENU_SELECTION = (short) 3;
	/**
	 * Time Expiration index = 5
	 */
	public final static short IDX_TIMER_EXPIRATION = (short) 5;
	/**
	 * Call Control by NAA index = 7
	 */
	public final static short IDX_CALL_CONTROLL_BY_NAA = (short) 7;
	/**
	 * Command Result index = 8
	 */
	public final static short IDX_COMMAND_RESULT = (short) 8;
	/**
	 * UCS2 Entry index = 13
	 */
	public final static short IDX_UCS2_ENTRY = (short) 13;
	/**
	 * UCS2 Display index = 14
	 */
	public final static short IDX_UCS2_DISPLAY = (short) 14;
	/**
	 * Display Text index = 15
	 */
	public final static short IDX_DISPLAY_TEXT = (short) 15;
	/**
	 * Proactive UICC Display Text index = 16
	 */
	public final static short IDX_PROACTIVE_UICC_DISPLAY_TEXT = (short) 16;
	/**
	 * Proactive UICC Get Inkey index = 17
	 */
	public final static short IDX_PROACTIVE_UICC_GET_INKEY = (short) 17;
	/**
	 * Proactive UICC Get Input index = 18
	 */
	public final static short IDX_PROACTIVE_UICC_GET_INPUT = (short) 18;
	/**
	 * Proactive UICC More Time index = 19
	 */
	public final static short IDX_PROACTIVE_UICC_MORE_TIME = (short) 19;
	/**
	 * Proactive UICC Play Tone index = 20
	 */
	public final static short IDX_PROACTIVE_UICC_PLAY_TONE = (short) 20;
	/**
	 * Proactive UICC Poll Interval index = 21
	 */
	public final static short IDX_PROACTIVE_UICC_POLL_INTERVAL = (short) 21;
	/**
	 * Proactive UICC Polling OFF index = 22
	 */
	public final static short IDX_PROACTIVE_UICC_POLLING_OFF = (short) 22;
	/**
	 * Proactive UICC Refresh index = 23
	 */
	public final static short IDX_PROACTIVE_UICC_REFRESH = (short) 23;
	/**
	 * Proactive UICC Select Item index = 24
	 */
	public final static short IDX_PROACTIVE_UICC_SELECT_ITEM = (short) 24;
	/**
	 * Proactive UICC Send SS index = 26
	 */
	public final static short IDX_PROACTIVE_UICC_SEND_SS = (short) 26;
	/**
	 * Proactive UICC Set Up Call index = 28
	 */
	public final static short IDX_PROACTIVE_UICC_SET_UP_CALL = (short) 28;
	/**
	 * Proactive UICC Set Up Menu index = 29
	 */
	public final static short IDX_PROACTIVE_UICC_SET_UP_MENU = (short) 29;
	/**
	 * Proactive UICC Proactive Local Information MSS,MNC,LAC,CELLID,IMEI index = 30
	 */
	public final static short IDX_PROACTIVE_UICC_PROVIDE_LOCAL_INFORMATION_MCC_MNC_LAC_CELLID_IMEI = (short) 30;
	/**
	 * Proactive UICC Provide Local Information NMR index = 31
	 */
	public final static short IDX_PROACTIVE_UICC_PROVIDE_LOCAL_INFORMATION_NMR = (short) 31;
	/**
	 * Proactive UICC Set Up Event List index = 32
	 */
	public final static short IDX_PROACTIVE_UICC_SET_UP_EVENT_LIST = (short) 32;
	/**
	 * Event MT Call index = 33
	 */
	public final static short IDX_EVENT_MT_CALL = (short) 33;
	/**
	 * Event Call Connected index = 34
	 */
	public final static short IDX_EVENT_CALL_CONNECTED = (short) 34;
	/**
	 * Event Call Disconnected index = 35
	 */
	public final static short IDX_EVENT_CALL_DISCONNECTED = (short) 35;
	/**
	 * Event Location Status index = 36
	 */
	public final static short IDX_EVENT_LOCATION_STATTUS = (short) 36;
	/**
	 * Event User Activity index = 37
	 */
	public final static short IDX_EVENT_USER_ACTIVITY = (short) 37;
	/**
	 * Event Idle Screen Available index = 38
	 */
	public final static short IDX_EVENT_IDLE_SCREEN_AVAILABLE = (short) 38;
	/**
	 * Event Card Reader Status index = 39
	 */
	public final static short IDX_EVENT_CARD_READER_STATUS = (short) 39;
	/**
	 * Event Language Selection index = 40
	 */
	public final static short IDX_EVENT_LANGUAGAE_SELECTION = (short) 40;
	/**
	 * Event Browser Termination index = 41
	 */
	public final static short IDX_EVENT_BROWSER_TERMINATION = (short) 41;
	/**
	 * Event Data Available index = 42
	 */
	public final static short IDX_EVENT_DATA_AVAILABLE = (short) 42;
	/**
	 * Event Channel Status index = 43
	 */
	public final static short IDX_EVENT_CHANNEL_STATUS = (short) 43;
	/**
	 * Event Access Technology Change index = 44
	 */
	public final static short IDX_EVENT_ACCESS_TECHNOLOGY_CHANGE = (short) 44;
	/**
	 * Event Display Parameter Change index = 45
	 */
	public final static short IDX_EVENT_DISPLAY_PARAMETER_CHANGED = (short) 45;
	/**
	 * Event Local Connection index = 46
	 */
	public final static short IDX_EVENT_LOCAL_CONNECTION = (short) 46;
	/**
	 * Event Network Search Mode = 47
	 */
	public final static short IDX_EVENT_NRETWORK_SEARCH_MODE_CHANGE=(short)47;
	/**
	 * Proactive UICC Power On Card index = 48
	 */
	public final static short IDX_PROACTIVE_UICC_POWER_ON_CARD = (short) 48;
	/**
	 * Proactive UICC Power Off Card index = 49
	 */
	public final static short IDX_PROACTIVE_UICC_POWER_OFF_CARD = (short) 49;
	/**
	 * Proactive UICC Perform Card APDU index = 50
	 */
	public final static short IDX_PROACTIVE_UICC_PERFORM_CARD_APDU = (short) 50;
	/**
	 * Proactive UICC Get Reader Status (status) index = 51
	 */
	public final static short IDX_PROACTIVE_UICC_GET_READER_STATUS_STATUS = (short) 51;
	/**
	 * Proactive UICC Get Reader Status (identifier) index = 52
	 */
	public final static short IDX_PROACTIVE_UICC_GET_READER_STATUS_IDENTIFIER = (short) 52;
	/**
	 * Proactive UICC Timer Management (start, stop) index = 56
	 */
	public final static short IDX_PROACTIVE_UICC_TIMER_MANAGEMENT_START_STOP = (short) 56;
	/**
	 * Proactive UICC Timer Management (current value) index = 57
	 */
	public final static short IDX_PROACTIVE_UICC_TIMER_MANAGEMENT_CUR_VALUE = (short) 57;
	/**
	 * Proactive UICC Provide Local Information Date Time index = 58
	 */
	public final static short IDX_PROACTIVE_UICC_PROVIDE_LOCAL_INFORMATION_DATE_TIME = (short) 58;
	/**
	 * Proactive UICC Run AT Command index = 61
	 */
	public final static short IDX_PROACTIVE_UICC_RUN_AT_COMMAND = (short) 61;
	/**
	 * Proactive UICC Setup Call index = 62
	 */
	public final static short IDX_SETUP_CALL = (short) 62;
	/**
	 * Send DTMF index = 65
	 */
	public final static short IDX_SEND_DTMF = (short) 65;
	/**
	 * Proactive UICC Provide Local Information Language index = 67
	 */
	public final static short IDX_PROACTIVE_UICC_PROVIDE_LOCAL_INFORMATION_LANGUAGE = (short) 67;
	/**
	 * Proactive UICC Provide local Information Timing index = 68
	 */
	public final static short IDX_PROACTIVE_UICC_PROVIDE_LOCAL_INFORMATION_TIMING = (short) 68;
	/**
	 * Proactive UICC Provide Language Notification index = 69
	 */
	public final static short IDX_PROACTIVE_UICC_LANGUAGE_NOTIFICATION = (short) 69;
	/**
	 * Proactive UICC Launch Browser index = 70
	 */
	public final static short IDX_PROACTIVE_UICC_LAUNCH_BROWSER = (short) 70;
	/**
	 * Proactive UICC Provide Local Information Access Technology index = 71
	 */
	public final static short IDX_PROACTIVE_UICC_PROVIDE_LOCAL_INFORMATION_ACCESS_TECHNOLOGY = (short) 71;
	/**
	 * Soft Keys Select Item index = 72
	 */
	public final static short IDX_SOFT_KEYS_SELECT_ITEM = (short) 72;
	/**
	 * Soft Keys Set Up Menu index = 73
	 */
	public final static short IDX_SOFT_KEYS_SET_UP_MENU = (short) 73;
	/**
	 * Proactive UICC Open Channel index = 88
	 */
	public final static short IDX_PROACTIVE_UICC_OPEN_CHANNEL = (short) 88;
	/**
	 * Proactive UICC Close Channel index = 89
	 */
	public final static short IDX_PROACTIVE_UICC_CLOSE_CHANNEL = (short) 89;
	/**
	 * Proactive UICC Receive Data index = 90
	 */
	public final static short IDX_PROACTIVE_UICC_RECEIVE_DATA = (short) 90;
	/**
	 * Proactive UICC Send Data index = 91
	 */
	public final static short IDX_PROACTIVE_UICC_SEND_DATA = (short) 91;
	/**
	 * Proactive UICC Get Channel Status index = 92
	 */
	public final static short IDX_PROACTIVE_UICC_GET_CHANNEL_STATUS = (short) 92;
	/**
	 * Proactive UICC Service Search index = 93
	 */
	public final static short IDX_PROACTIVE_UICC_SERVICE_SEARCH = (short) 93;
	/**
	 * Proactive UICC Get Service information index = 94
	 */
	public final static short IDX_PROACTIVE_UICC_GET_SERVICE_INFORMATION = (short) 94;
	/**
	 *Proactive UICC Declare Service index = 95
	 */
	public final static short IDX_PROACTIVE_UICC_DECLARE_SERVICE = (short) 95;
	/**
	 * CSD index = 96
	 */
	public final static short IDX_CSD = (short) 96;
	/**
	 * GPRS index = 97
	 */
	public final static short IDX_GPRS = (short) 97;
	/**
	 * Bluetooth index = 98
	 */
	public final static short IDX_BLUETOOTH = (short) 98;
	/**
	 * IRDA index = 99
	 */
	public final static short IDX_IRDA = (short) 99;
	/**
	 * RS232 index = 100
	 */
	public final static short IDX_RS232 = (short) 100;
	/**
	 * Screen Sizing index = 111
	 */
	public final static short IDX_SCREEN_SIZING = (short) 111;
	/**
	 * Variable Size Fonts index = 119
	 */
	public final static short IDX_VARIABLE_SIZE_FONTS = (short) 119;
	/**
	 * Display Resize index = 120
	 */
	public final static short IDX_DISPLAY_RESIZE = (short) 120;
	/**
	 * Text Wrapping index = 121
	 */
	public final static short IDX_TEXT_WRAPPING = (short) 121;
	/**
	 * Text Scrolling index = 122
	 */
	public final static short IDX_TEXT_SCROLLING = (short) 122;
	/**
	 * Text Attribute index = 123
	 */
	public final static short IDX_TEXT_ATTRIBUTE = (short) 123;
	/**
	 * TCP index = 128
	 */
	public final static short IDX_TCP = (short) 128;
	/**
	 * UDP index = 129
	 */
	public final static short IDX_UDP = (short) 129;
	/**
	 * Proactive UICC Display Text Variable Timeout index = 136
	 */
	public final static short IDX_PROACTIVE_UICC_DISPLAY_TEXT_VARIABLE_TIMEOUT = (short) 136;
	/**
	 * Proactive UICC Get Inkey Help Supported index = 137
	 */
	public final static short IDX_PROACTIVE_UICC_GET_INKEY_HELP_SUPPORTED = (short) 137;
	/**
	 * USB index = 138
	 */
	public final static short IDX_USB = (short) 138;
	/**
	 * Proactive UICC Get Inkey Variable Timeout index = 139
	 */
	public final static short IDX_PROACTIVE_UICC_GET_INKEY_VARIABLE_TIMEOUT = (short) 139;
	/**
	 * Provide Local Information ESN index = 140
	 */
	public final static short IDX_PROVIDE_LOCAL_INFORMATION_ESN = (short) 140;
	 /**
	 * Provide Local Information  (IMEISV)= 142;
	 */
	public final static short IDX_PROVIDE_LOCAL_INFORMATION_IMEISV = (short) 142;     
        /**
	 * Provide Local Information (Search Mode Change) = 143
	 */
	public final static short IDX_PROVIDE_LOCAL_INFORMATION_SEARCH_MODE_CHANGE = (short) 143;
	/**
         * WML Browser supported = 160
         */
        public final static short IDX_WML_BROWSER_SUPPORTED = (short)160;
       /**
        * XHTML Browser supported = 161
        */
        public final static short IDX_XHTML_BROWSER_SUPPORTED = (short)161;
       /**
        * HTML Browser supported = 162
        */
        public final static short IDX_HTML_BROWSER_SUPPORTED = (short)162;
       /**
        * CHTML Browser supported = 163
        */
       public final static short IDX_CHTML_BROWSER_SUPPORTED = (short)163;
      /**
       * Provide Local Information (Battery State) = 169
       */
       public final static short IDX_PROVIDE_LOCAL_INFORMATION_BATTERY_STATE = (short) 169;
       /**
        * Play Tone (melody Tones and Themed tones) = 170
        */
        public static final short IDX_PLAY_TONE_MELODY_THEMED_TONES = (short)170;
       /**
        * Multi-media Call in SET UP CALL = 171
        */
       public static final short IDX_MULTI_MEDIA_CALL_IN_SET_UP_CALL = (short)171;
       /**
        * Set Frames = 176
        */
       public static final short IDX_SET_FRAMES = (short)176;
       /**
        * Get Frames Status = 177
        */
       public static final short IDX_GET_FRAMES_STATUS = (short)177;
       /**
        * Event: Browsing Status = 192
        */
       public final static short IDX_EVENT_BROWSING_STATUS = (short) 192;
               /**
        * Text Attribute: Alignment Left = 216
        */
       public final static short IDX_ALIGNMENT_LEFT = (short) 216;
       /**
        * Text Attribute: Alignment Center = 217
        */
       public final static short IDX_ALIGNMENT_CENTER = (short) 217;
        /**
        * Text Attribute: Alignment Right = 218
        */
        public final static short IDX_ALIGNMENT_RIGHT = (short) 218;
        /**
        * Text Attribute: Font Size Normal = 219
        */
        public final static short IDX_FONT_SIZE_NORMAL = (short) 219;
       /**
        * Text Attribute: Font Size Large = 220
        */
        public final static short IDX_FONT_SIZE_LARGE = (short) 220;
       /**
        * Text Attribute: Font Size Small = 221
        */
        public final static short IDX_FONT_SIZE_SMALL = (short) 221;
       /**
        * Text Attribute: Style Normal = 224
        */
        public final static short IDX_STYLE_NORMAL = (short) 224;
       /**
        * Text Attribute: Style Bold = 224
        */
        public final static short IDX_STYLE_BOLD = (short) 225;
       /**
        * Text Attribute: Style Italic = 226
        */
        public final static short IDX_STYLE_ITALIC = (short) 226;
       /**
        * Text Attribute: Style Underlined = 227
        */
        public final static short IDX_STYLE_UNDERLINED = (short) 227;
       /**
        * Text Attribute: Style Strikethrough = 228
        */
        public final static short IDX_STYLE_STRIKETHROUGH = (short) 228;
       /**
        * Text Attribute: Style Text Colour = 229
        */
        public final static short IDX_STYLE_TEXT_FOREGROUND_COLOUR = (short) 229;
       /**
        * Text Attribute: Style Text Background Colour = 230
        */
        public final static short IDX_STYLE_TEXT_BACKGROUND_COLOUR = (short) 230;

	/**
	 *Constructor for the TerminalProfile object
	 */
	private TerminalProfile() { }


	// ------------------------------- Public methods -------------------------
	/**
	 * Checks a facility in the handset profile.
	 *
	 * @param  index                 the number of the facility to check, according to the table above.
	 * @return                       true if the facility is supported, false if facility is not supported,
	 *         or if facility-index outside TerminalProfile data
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li>TERMINAL_PROFILE_NOT_AVAILABLE if Terminal Profile data are not available
	 *      <li>BAD_INPUT_PARAMETER if index has a negative value</ul>
	 */
	public static boolean check(byte index) throws ToolkitException {
		return false;
	}


	/**
	 * Checks a set of facilities in the handset profile.
	 * The method checks all the facilities corresponding to bits set to 1 in
	 * the mask buffer.
	 *
	 * <p>
	 * Notes:<ul>
	 * <li><em>If </em><code>offset</code><em> or </em><code>length</code><em> parameter is negative an </em><code>ArrayIndexOutOfBoundsException</code>
	 * <em> exception is thrown and no check is performed.</em>
	 * <li><em>If </em><code>offset+length</code><em> is greater than </em><code>mask.length</code><em>, the length
	 * of the </em><code>mask</code><em> array an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
	 * and no check is performed.</em>
	 * </ul>
	 *
	 * @param  mask                                a byte array containing the mask to compare with the profile
	 * @param  offset                              the starting offset of the mask in the byte array
	 * @param  length                              the length of the mask (at least 1)
	 * @return                                     true if the bitwise AND of the TerminalProfile data padded with 0 and the <code>mask</code> is equal to the
	 *         <code>mask</code> , false otherwise. If <code>length</code> is equal to <code>0</code>, true is returned.
	 * @exception  NullPointerException            if <code>mask</code> is <code>null</code>
	 * @exception  ArrayIndexOutOfBoundsException  if check would cause access of data outside mask array bounds
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li>TERMINAL_PROFILE_NOT_AVAILABLE if Terminal Profile data are not available</ul>
	 */
	public static boolean check(byte[] mask,
			short offset,
			short length) throws NullPointerException,
			ArrayIndexOutOfBoundsException,
			ToolkitException {
		return false;
	}


	/**
	 * Checks a facility in the handset profile.
	 *
	 * @param  index                 the number of the facility to check, according to the table above.
	 * @return                       true if the facility is supported, false if facility is not supported,
	 *         or if facility-index outside TerminalProfile data
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li>TERMINAL_PROFILE_NOT_AVAILABLE if Terminal Profile data are not available
	 *      <li>BAD_INPUT_PARAMETER if index has a negative value</ul>
	 */
	public static boolean check(short index) throws ToolkitException {
		return false;
	}


	/**
	 * Returns the binary value of a parameter, delimited by two indexes, from the handset profile.
	 *
	 * @param  indexMSB              index of the Most Significant Bit of the handset profile .
	 * @param  indexLSB              index of the Lowest Significant Bit of the handset profile .
	 * @return                       binary value of the data field indicated in the handset profile.
	 * The <code>indexLSB</code> bit in the TerminalProfile data is the Lowest Significant bit in the short returned value. If padding is necessary, the
	 * returned value is left padded with 0. The values outside the TerminalProfile data available are considered to bet set to 0.
	 *
	 *         The return value is according to the following example:<ul>
	 *             <li>If <code>indexMSB</code>=108 and <code>indexLSB</code>=104, the return value is the number of
	 *             characters down the Terminal display.</li>
	 *             <li>If <code>indexMSB</code>=31 and <code>indexLSB</code>=16, the return value is a short built
	 *             from the 4th and 3rd byte of the handset profile with the 4th byte as
	 *             the Most significant byte.</li></ul>
	 * @exception  ToolkitException  with the following reason codes: <ul>
	 *      <li>TERMINAL_PROFILE_NOT_AVAILABLE if Terminal Profile data are not available
	 *      <li>BAD_INPUT_PARAMETER if <code>(indexMSB >= indexLSB +16)</code> or <code>(indexMSB < indexLSB)</code> or
	 *      <code>(indexMSB < 0)</code> or <code>(indexLSB < 0)</code> </ul>
	 */
	public static short getValue(short indexMSB, short indexLSB) throws ToolkitException {
		return 0;
	}


	/**
	 * Copies a part of the handset profile in a buffer.
	 * The values outside the TerminalProfile data available are considered to bet set to 0.
	 *
	 * <p>
	 * Notes:<ul>
	 * <li><em>If </em><code>dstOffset</code><em> or </em><code>dstLength</code><em> parameter is negative an </em><code>ArrayIndexOutOfBoundsException</code>
	 * <em> exception is thrown and no copy is performed.</em>
	 * <li><em>If </em><code>dstOffset+dstLength</code><em> is greater than </em><code>dstBuffer.length</code><em>, the length
	 * of the </em><code>dstBuffer</code><em> array an </em><code>ArrayIndexOutOfBoundsException</code><em> exception is thrown
	 * and no copy is performed.</em>
	 * </ul>
	 *
	 * @param  startOffset                         offset of the handset profile first byte to be copied
	 * @param  dstBuffer                           destination byte array
	 * @param  dstOffset                           offset within destination byte array to start copy into
	 * @param  dstLength                           byte length to be copy
	 * @return                                     dstOffset + dstLength
	 * @exception  ArrayIndexOutOfBoundsException  if copy would cause access of data outside array bounds
	 * @exception  NullPointerException            if <code>dstBuffer<code> is null
	 * @exception  ToolkitException                with the following reason codes: <ul>
	 *      <li>TERMINAL_PROFILE_NOT_AVAILABLE if Terminal Profile data are not available
	 *      <li>BAD_INPUT_PARAMETER if the <code>startOffset</code> is negative</ul>
	 */
	public static short copy(short startOffset, byte[] dstBuffer, short dstOffset, short dstLength)
			 throws ArrayIndexOutOfBoundsException, NullPointerException, ToolkitException {
		return 0;
	}
}

