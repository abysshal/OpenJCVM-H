package uicc.toolkit;

/**
 * The BERTLVEditHandler interface offers methods to set the TAG of a BER TLV List and to edit the BER TLV list.
 * An object that implements this interface has to take care that the length information of the BER TLV list is updated.
 */
public interface BERTLVEditHandler extends EditHandler, BERTLVViewHandler {
	/**
	 * Sets the tag of the BER TLV list
	 * 
	 * @param bBERTag the TAG value of the BER TLV list
	 */
	public void setTag(byte bBERTag);
}

