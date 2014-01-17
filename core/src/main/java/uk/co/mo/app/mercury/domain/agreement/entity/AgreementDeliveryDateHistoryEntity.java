package uk.co.mo.app.mercury.domain.agreement.entity;

import javax.persistence.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementDeliveryDateHistoryBean;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the agreement_delivery_date_history entitybase table.
 * 
 */
@Entity
@Table(name="agreement_delivery_date_history")
public class AgreementDeliveryDateHistoryEntity extends AbstractAuditableEntity implements Serializable {

	private static final long serialVersionUID = 8853721485465240987L;
	
	private AgreementDeliveryDateHistoryBean agreementDeliveryDateHistoryBean = new AgreementDeliveryDateHistoryBean();
	private AgreementEntity agreement;


	public AgreementDeliveryDateHistoryEntity() {
	}

	
	@Transient
	public AgreementDeliveryDateHistoryBean getAgreementDeliveryDateHistoryBean() {
		return agreementDeliveryDateHistoryBean;
	}

	public void setAgreementDeliveryDateHistoryBean(
			AgreementDeliveryDateHistoryBean agreementDeliveryDateHistoryBean) {
		this.agreementDeliveryDateHistoryBean = agreementDeliveryDateHistoryBean;
	}


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    @Column(name="agreement_delivery_date_id")
    public Integer getAgreementDeliveryDateId() {
    	return this.agreementDeliveryDateHistoryBean.getAgreementDeliveryDateId();
    }
    
    public void setAgreementDeliveryDateId(Integer agreementDeliveryDateId) {
    	this.agreementDeliveryDateHistoryBean
				.setAgreementDeliveryDateId(agreementDeliveryDateId);
    }
    
    
    @Column(name="agreement_delivery_date_warning_id")
    public Integer getAgreementDeliveryDateWarningId() {
    	return this.agreementDeliveryDateHistoryBean.getAgreementDeliveryDateWarningId();
    }
    
    public void setAgreementDeliveryDateWarningId(Integer agreementDeliveryDateWarningId) {
    	this.agreementDeliveryDateHistoryBean
				.setAgreementDeliveryDateWarningId(agreementDeliveryDateWarningId);
    }

	@Column(name="date_type")
	public Integer getDateType() {
		return this.agreementDeliveryDateHistoryBean.getDateType();
	}

	public void setDateType(int dateType) {
		this.agreementDeliveryDateHistoryBean.setDateType(dateType);
	}

	@Column(name="delivery_date", columnDefinition="datetime")
	public Date getDeliveryDate() {
		return this.agreementDeliveryDateHistoryBean.getDeliveryDate();
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.agreementDeliveryDateHistoryBean.setDeliveryDate(deliveryDate);
	}

	@Column(name="insert_date")
	public Date getInsertDate() {
		return this.agreementDeliveryDateHistoryBean.getInsertDate();
	}

	public void setInsertDate(Date insertDate) {
		this.agreementDeliveryDateHistoryBean.setInsertDate(insertDate);
	}

	@Column(name="insert_user")
	public String getInsertUser() {
		return this.agreementDeliveryDateHistoryBean.getInsertUser();
	}

	public void setInsertUser(String insertUser) {
		this.agreementDeliveryDateHistoryBean.setInsertUser(insertUser);
	}

	public Integer getProcessed() {
		return this.agreementDeliveryDateHistoryBean.getProcessed();
	}

	public void setProcessed(int processed) {
		this.agreementDeliveryDateHistoryBean.setProcessed(processed);
	}

	@Column(name="processed_date", columnDefinition="datetime")
	public Date getProcessedDate() {
		return this.agreementDeliveryDateHistoryBean.getProcessedDate();
	}

	public void setProcessedDate(Date processedDate) {
		this.agreementDeliveryDateHistoryBean.setProcessedDate(processedDate);
	}

	public void setAgreement(AgreementEntity agreement) {
		this.agreement = agreement;
	}

	@ManyToOne
	@JoinColumn(name="agreement_id")
	public AgreementEntity getAgreement() {
		return agreement;
	}

}