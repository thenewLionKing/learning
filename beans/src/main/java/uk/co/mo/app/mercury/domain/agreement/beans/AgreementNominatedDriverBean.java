package uk.co.mo.app.mercury.domain.agreement.beans;

import java.io.Serializable;
import java.util.Date;

public class AgreementNominatedDriverBean implements Serializable{
	
	private static final long serialVersionUID = 535260998810364438L;

	private Integer agreementNominatedDriverId;
	private Integer customerId;
	private Short driverStatus;
	private Date dvlaRequestSentDate;
	private Date dvlaResponseReceivedDate;
	private Date insertDate;
	private String insertUser;
	private Date insurerEligibilityRequestSentDate;
	private Date insurerEligibilityResponseReceivedDate;
	private String insurerEligibilityStatus;
	private Boolean passPlusBookingRequired;
	private Boolean passPlusCompleted;
	private Boolean primaryDriverInd;
	private Date updateDate;
	private String updateUser;

	public AgreementNominatedDriverBean() {
	}

	public Integer getAgreementNominatedDriverId() {
		return agreementNominatedDriverId;
	}

	public void setAgreementNominatedDriverId(Integer agreementNominatedDriverId) {
		this.agreementNominatedDriverId = agreementNominatedDriverId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Short getDriverStatus() {
		return driverStatus;
	}

	public void setDriverStatus(Short driverStatus) {
		this.driverStatus = driverStatus;
	}

	public Date getDvlaRequestSentDate() {
		return dvlaRequestSentDate;
	}

	public void setDvlaRequestSentDate(Date dvlaRequestSentDate) {
		this.dvlaRequestSentDate = dvlaRequestSentDate;
	}

	public Date getDvlaResponseReceivedDate() {
		return dvlaResponseReceivedDate;
	}

	public void setDvlaResponseReceivedDate(Date dvlaResponseReceivedDate) {
		this.dvlaResponseReceivedDate = dvlaResponseReceivedDate;
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

	public Date getInsurerEligibilityRequestSentDate() {
		return insurerEligibilityRequestSentDate;
	}

	public void setInsurerEligibilityRequestSentDate(
			Date insurerEligibilityRequestSentDate) {
		this.insurerEligibilityRequestSentDate = insurerEligibilityRequestSentDate;
	}

	public Date getInsurerEligibilityResponseReceivedDate() {
		return insurerEligibilityResponseReceivedDate;
	}

	public void setInsurerEligibilityResponseReceivedDate(
			Date insurerEligibilityResponseReceivedDate) {
		this.insurerEligibilityResponseReceivedDate = insurerEligibilityResponseReceivedDate;
	}

	public String getInsurerEligibilityStatus() {
		return insurerEligibilityStatus;
	}

	public void setInsurerEligibilityStatus(String insurerEligibilityStatus) {
		this.insurerEligibilityStatus = insurerEligibilityStatus;
	}

	public Boolean isPassPlusBookingRequired() {
		return passPlusBookingRequired;
	}

	public void setPassPlusBookingRequired(Boolean passPlusBookingRequired) {
		this.passPlusBookingRequired = passPlusBookingRequired;
	}

	public Boolean isPassPlusCompleted() {
		return passPlusCompleted;
	}

	public void setPassPlusCompleted(Boolean passPlusCompleted) {
		this.passPlusCompleted = passPlusCompleted;
	}

	public Boolean isPrimaryDriverInd() {
		return primaryDriverInd;
	}

	public void setPrimaryDriverInd(Boolean primaryDriverInd) {
		this.primaryDriverInd = primaryDriverInd;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
}