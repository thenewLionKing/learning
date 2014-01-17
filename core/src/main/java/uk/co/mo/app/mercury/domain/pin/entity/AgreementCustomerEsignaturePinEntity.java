package uk.co.mo.app.mercury.domain.pin.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;

/**
 * Entity implementation class for Entity: AgreementCustomerEsignaturePinEntity
 *
 */
@Entity
@Table(name="agreement_customer_esignature_pin")



public class AgreementCustomerEsignaturePinEntity extends AbstractAuditableEntity implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="esignature_pin_id", columnDefinition = "Integer")
	private Integer esignaturePinId;
	
	
	@Column(name="agreement_id", columnDefinition = "Integer")
	private Integer agreementId;
	
	@Column(name="customer_id", columnDefinition = "Integer")
	private Integer customerId;
	
	@Column(name="pin_id", columnDefinition = "Integer")
	private Integer pinId;
	
	@Column(name="insert_date")
	private Date insertDate;
	
	@Column(name="insert_user")
	private String insertUser;
	
	private static final long serialVersionUID = 1L;

	public AgreementCustomerEsignaturePinEntity() {
		super();
	}   
	
	public Integer getPinId() {
		return this.pinId;
	}

	public void setPinId(Integer pinId) {
		this.pinId = pinId;
	}   
	public Date getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}   
	public String getInsertUser() {
		return this.insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @param esignaturePinId the esignaturePinId to set
	 */
	public void setEsignaturePinId(Integer esignaturePinId) {
		this.esignaturePinId = esignaturePinId;
	}
	/**
	 * @param agreementId the agreementId to set
	 */
	public void setAgreementId(Integer agreementId) {
		this.agreementId = agreementId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the esignaturePinId
	 */
	public Integer getEsignaturePinId() {
		return esignaturePinId;
	}

	/**
	 * @return the agreementId
	 */
	public Integer getAgreementId() {
		return agreementId;
	}

	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}
}
