package uk.co.mo.app.mercury.domain.agreement.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementNominatedDriverBean;


/**
 * The persistent class for the agreement_nominated_driver database table.
 * 
 */
@Entity
@Table(name="agreement_nominated_driver")
public class AgreementNominatedDriverEntity extends AbstractAuditableEntity implements Serializable{

	private static final long serialVersionUID = 52419694756094330L;

	private AgreementNominatedDriverBean agreementNominatedDriverBean = new AgreementNominatedDriverBean();

	private AgreementEntity agreement;

	public AgreementNominatedDriverEntity() {
    }

	@Transient
	public AgreementNominatedDriverBean getAgreementNominatedDriverBean() {
		return agreementNominatedDriverBean;
	}


	public void setAgreementNominatedDriverBean(AgreementNominatedDriverBean agreementNominatedDriverBean) {
		this.agreementNominatedDriverBean = agreementNominatedDriverBean;
	}

	@Id
	@Column(name="agreement_nominated_driver_id", unique=true, nullable=false)
	public Integer getAgreementNominatedDriverId() {
		return this.agreementNominatedDriverBean.getAgreementNominatedDriverId();
	}

	public void setAgreementNominatedDriverId(Integer agreementNominatedDriverId) {
		this.agreementNominatedDriverBean
				.setAgreementNominatedDriverId(agreementNominatedDriverId);
	}


	@Column(name="customer_id", nullable=false)
	public Integer getCustomerId() {
		return this.agreementNominatedDriverBean.getCustomerId();
	}

	public void setCustomerId(Integer customerId) {
		this.agreementNominatedDriverBean.setCustomerId(customerId);
	}


	@Column(name="driver_status", nullable=false, columnDefinition="TINYINT")
	public Short getDriverStatus() {
		return this.agreementNominatedDriverBean.getDriverStatus();
	}

	public void setDriverStatus(Short driverStatus) {
		this.agreementNominatedDriverBean.setDriverStatus(driverStatus);
	}


	@Column(name="dvla_request_sent_date", columnDefinition="DATETIME")
	public Date getDvlaRequestSentDate() {
		return this.agreementNominatedDriverBean.getDvlaRequestSentDate();
	}

	public void setDvlaRequestSentDate(Date dvlaRequestSentDate) {
		this.agreementNominatedDriverBean.setDvlaRequestSentDate(dvlaRequestSentDate);
	}


	@Column(name="dvla_response_received_date", columnDefinition="DATETIME")
	public Date getDvlaResponseReceivedDate() {
		return this.agreementNominatedDriverBean.getDvlaResponseReceivedDate();
	}

	public void setDvlaResponseReceivedDate(Date dvlaResponseReceivedDate) {
		this.agreementNominatedDriverBean.setDvlaResponseReceivedDate(dvlaResponseReceivedDate);
	}

	@Column(name="insurer_eligibility_request_sent_date", columnDefinition="DATETIME")
	public Date getInsurerEligibilityRequestSentDate() {
		return this.agreementNominatedDriverBean.getInsurerEligibilityRequestSentDate();
	}

	public void setInsurerEligibilityRequestSentDate(Date insurerEligibilityRequestSentDate) {
		this.agreementNominatedDriverBean
				.setInsurerEligibilityRequestSentDate(insurerEligibilityRequestSentDate);
	}


	@Column(name="insurer_eligibility_response_received_date", columnDefinition="DATETIME")
	public Date getInsurerEligibilityResponseReceivedDate() {
		return this.agreementNominatedDriverBean
				.getInsurerEligibilityResponseReceivedDate();
	}

	public void setInsurerEligibilityResponseReceivedDate(Date insurerEligibilityResponseReceivedDate) {
		this.agreementNominatedDriverBean
				.setInsurerEligibilityResponseReceivedDate(insurerEligibilityResponseReceivedDate);
	}


	@Column(name="insurer_eligibility_status", length=10)
	public String getInsurerEligibilityStatus() {
		return this.agreementNominatedDriverBean.getInsurerEligibilityStatus();
	}

	public void setInsurerEligibilityStatus(String insurerEligibilityStatus) {
		this.agreementNominatedDriverBean.setInsurerEligibilityStatus(insurerEligibilityStatus);
	}


	@Column(name="pass_plus_booking_required", columnDefinition="BIT")
	public Boolean getPassPlusBookingRequired() {
		return this.agreementNominatedDriverBean.isPassPlusBookingRequired();
	}

	public void setPassPlusBookingRequired(Boolean passPlusBookingRequired) {
		this.agreementNominatedDriverBean.setPassPlusBookingRequired(passPlusBookingRequired);
	}


	@Column(name="pass_plus_completed", columnDefinition="BIT")
	public Boolean getPassPlusCompleted() {
		return this.agreementNominatedDriverBean.isPassPlusCompleted();
	}

	public void setPassPlusCompleted(Boolean passPlusCompleted) {
		this.agreementNominatedDriverBean.setPassPlusCompleted(passPlusCompleted);
	}


	@Column(name="primary_driver_ind", nullable=false, columnDefinition="BIT")
	public Boolean getPrimaryDriverInd() {
		return this.agreementNominatedDriverBean.isPrimaryDriverInd();
	}

	public void setPrimaryDriverInd(Boolean primaryDriverInd) {
		this.agreementNominatedDriverBean.setPrimaryDriverInd(primaryDriverInd);
	}

	//bi-directional many-to-one association to Agreement
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="agreement_id", nullable=false)
	public AgreementEntity getAgreement() {
		return this.agreement;
	}

	public void setAgreement(AgreementEntity agreement) {
		this.agreement = agreement;
	}
	
}