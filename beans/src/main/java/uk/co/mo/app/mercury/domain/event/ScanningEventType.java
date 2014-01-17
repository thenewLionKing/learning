package uk.co.mo.app.mercury.domain.event;

import uk.co.mo.app.mercury.domain.common.ScanningEventSubType;

/**
 * <p/>
 * User: Amit Maheshwari
 * Date: 24/06/11
 * Time: 10:23
 * <p/>
 * Change Log - Who : When : Comment
 */
public class ScanningEventType implements EventType {

	private static final long serialVersionUID = 1015095550385788381L;
	private String docNumber;
	
	private ScanningEventSubType type;
	

	public ScanningEventSubType getType() {
		return type;
	}

	public void setType(ScanningEventSubType type) {
		this.type = type;
	}
	
	@Override
	public String getEventType() {
		return "ScanningEventType";
	}

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}
}
