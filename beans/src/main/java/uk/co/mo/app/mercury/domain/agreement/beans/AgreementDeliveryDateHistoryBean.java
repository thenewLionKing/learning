package uk.co.mo.app.mercury.domain.agreement.beans;

import java.io.Serializable;
import java.util.Date;

public class AgreementDeliveryDateHistoryBean implements Serializable{
	
	private static final long serialVersionUID = 7349872363727677300L;

	private Integer agreementDeliveryDateId;
	private Integer agreementDeliveryDateWarningId;
	private Integer dateType;
	private Date deliveryDate;
	private Date insertDate;
	private String insertUser;
	private Integer processed;
	private Date processedDate;

	public AgreementDeliveryDateHistoryBean() {
	}

	public Integer getAgreementDeliveryDateId() {
		return agreementDeliveryDateId;
	}

	public void setAgreementDeliveryDateId(Integer agreementDeliveryDateId) {
		this.agreementDeliveryDateId = agreementDeliveryDateId;
	}

	public Integer getAgreementDeliveryDateWarningId() {
		return agreementDeliveryDateWarningId;
	}

	public void setAgreementDeliveryDateWarningId(
			Integer agreementDeliveryDateWarningId) {
		this.agreementDeliveryDateWarningId = agreementDeliveryDateWarningId;
	}

	public Integer getDateType() {
		return dateType;
	}

	public void setDateType(Integer dateType) {
		this.dateType = dateType;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public String getInsertUser() {
		return insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}

	public Integer getProcessed() {
		return processed;
	}

	public void setProcessed(Integer processed) {
		this.processed = processed;
	}

	public Date getProcessedDate() {
		return processedDate;
	}

	public void setProcessedDate(Date processedDate) {
		this.processedDate = processedDate;
	}
}