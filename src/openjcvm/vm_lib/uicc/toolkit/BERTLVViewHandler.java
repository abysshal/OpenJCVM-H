package uicc.toolkit;

/**
 * The BERTLVViewHandler interface offers methods to retrieve information about TLVs stored in BER TLV list.
 */
public interface BERTLVViewHandler extends ViewHandler{
	/**
	 * Returns the BER Tag of the BER TLV list 
	 * @return the tag value
	 */
	public byte getTag();
	/**
	 * Returns the BER TLV size, this includes the tag and the length.
	 * The length of the TLV list can be retrieved with the ViewHandler.getLength() method.
	 * @return the size of the BER TLV structure 
	 */
	public short getSize();
}

