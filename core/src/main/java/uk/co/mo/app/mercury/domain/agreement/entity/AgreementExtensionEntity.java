package uk.co.mo.app.mercury.domain.agreement.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.agreement.beans.AgreementExtensionBean;



/**
 * The persistent class for the agreement_extension database table.
 * 
 */
@Entity
@Table(name="agreement_extension")
public class AgreementExtensionEntity implements Serializable {

	private static final long serialVersionUID = -4766355808910501022L;

	private AgreementExtensionBean agreementExtensionBean = new AgreementExtensionBean();

	public AgreementExtensionEntity() {
    }

	@Transient
	public AgreementExtensionBean getAgreementExtensionBean() {
		return agreementExtensionBean;
	}


	public void setAgreementExtensionBean(
			AgreementExtensionBean agreementExtensionBean) {
		this.agreementExtensionBean = agreementExtensionBean;
	}


	@Id
	@Column(name="agreement_id", unique=true, nullable=false)
	public Integer getAgreementId() {
		return this.agreementExtensionBean.getAgreementId();
	}

	public void setAgreementId(Integer agreementId) {
		this.agreementExtensionBean.setAgreementId(agreementId);
	}


	@Column(nullable=false, length=8, columnDefinition="CHAR")
	public String getArn() {
		return this.agreementExtensionBean.getArn();
	}

	public void setArn(String arn) {
		this.agreementExtensionBean.setArn(arn);
	}


	@Column(nullable=false, columnDefinition="DATETIME")
	public Date getCreated() {
		return this.agreementExtensionBean.getCreated();
	}

	public void setCreated(Date created) {
		this.agreementExtensionBean.setCreated(created);
	}


	@Column(name="created_by", length=30)
	public String getCreatedBy() {
		return this.agreementExtensionBean.getCreatedBy();
	}

	public void setCreatedBy(String createdBy) {
		this.agreementExtensionBean.setCreatedBy(createdBy);
	}


	@Column(name="end_date", nullable=false, columnDefinition="DATETIME")
	public Date getEndDate() {
		return this.agreementExtensionBean.getEndDate();
	}

	public void setEndDate(Date endDate) {
		this.agreementExtensionBean.setEndDate(endDate);
	}


	@Column(name="last_modified", nullable=false, columnDefinition="DATETIME")
	public Date getLastModified() {
		return this.agreementExtensionBean.getLastModified();
	}

	public void setLastModified(Date lastModified) {
		this.agreementExtensionBean.setLastModified(lastModified);
	}


	@Column(name="last_modified_by", length=30)
	public String getLastModifiedBy() {
		return this.agreementExtensionBean.getLastModifiedBy();
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.agreementExtensionBean.setLastModifiedBy(lastModifiedBy);
	}


	@Column(name="type_id", nullable=false)
	public Integer getTypeId() {
		return this.agreementExtensionBean.getTypeId();
	}

	public void setTypeId(Integer typeId) {
		this.agreementExtensionBean.setTypeId(typeId);
	}
}