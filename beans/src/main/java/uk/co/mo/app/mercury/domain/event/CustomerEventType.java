package uk.co.mo.app.mercury.domain.event;

import uk.co.mo.app.mercury.domain.common.CustomerEventSubType;

/**
 * <p/>
 * User: Amit Maheshwari
 * Date: 24/06/11
 * Time: 10:23
 * <p/>
 * Change Log - Who : When : Comment
 */
public class CustomerEventType implements EventType {

	private static final long serialVersionUID = 1015095550385788381L;
	private String arn;
	private String crn;
	private Integer customerId;
	private Integer agreementId;
	private Integer recordId;
	
	private CustomerEventSubType type;
	

	public CustomerEventSubType getType() {
		return type;
	}

	public void setType(CustomerEventSubType type) {
		this.type = type;
	}

	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getArn() {
        return arn;
    }

    public void setArn(String arn) {
        this.arn = arn;
    }

    @Override
    public String getEventType() {
        return "CustomerEventType";
    }

	public void setAgreementId(Integer agreementId) {
		this.agreementId = agreementId;
	}

	public Integer getAgreementId() {
		return agreementId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Integer getRecordId() {
		return recordId;
	}
}
