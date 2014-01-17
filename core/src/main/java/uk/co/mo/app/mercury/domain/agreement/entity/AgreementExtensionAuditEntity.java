package uk.co.mo.app.mercury.domain.agreement.entity;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.agreement.beans.AgreementExtensionAuditBean;



/**
 * The persistent class for the agreement_extension_audit database table.
 * 
 */
@Entity
@Table(name="agreement_extension_audit")
public class AgreementExtensionAuditEntity implements Serializable {

	private static final long serialVersionUID = -3112779771481245920L;

	private AgreementExtensionAuditBean agreementExtensionAuditBean = new AgreementExtensionAuditBean();

	@Transient
	public AgreementExtensionAuditBean getAgreementExtensionAuditBean() {
		return agreementExtensionAuditBean;
	}


	public void setAgreementExtensionAuditBean(
			AgreementExtensionAuditBean agreementExtensionAuditBean) {
		this.agreementExtensionAuditBean = agreementExtensionAuditBean;
	}


	public AgreementExtensionAuditEntity() {
    }


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="audit_id", unique=true, nullable=false)
	public Integer getAuditId() {
		return this.agreementExtensionAuditBean.getAuditId();
	}

	public void setAuditId(Integer auditId) {
		this.agreementExtensionAuditBean.setAuditId(auditId);
	}


	@Column(name="agreement_id", nullable=false)
	public Integer getAgreementId() {
		return this.agreementExtensionAuditBean.getAgreementId();
	}

	public void setAgreementId(Integer agreementId) {
		this.agreementExtensionAuditBean.setAgreementId(agreementId);
	}


	@Column(nullable=false, length=8, columnDefinition="CHAR")
	public String getArn() {
		return this.agreementExtensionAuditBean.getArn();
	}

	public void setArn(String arn) {
		this.agreementExtensionAuditBean.setArn(arn);
	}


	@Column(name="audit_action", length=1, columnDefinition="CHAR")
	public String getAuditAction() {
		return this.agreementExtensionAuditBean.getAuditAction();
	}

	public void setAuditAction(String auditAction) {
		this.agreementExtensionAuditBean.setAuditAction(auditAction);
	}


	@Column(nullable=false, columnDefinition="DATETIME")
	public Date getCreated() {
		return this.agreementExtensionAuditBean.getCreated();
	}

	public void setCreated(Date created) {
		this.agreementExtensionAuditBean.setCreated(created);
	}


	@Column(name="created_by", length=30)
	public String getCreatedBy() {
		return this.agreementExtensionAuditBean.getCreatedBy();
	}

	public void setCreatedBy(String createdBy) {
		this.agreementExtensionAuditBean.setCreatedBy(createdBy);
	}


	@Column(name="end_date", nullable=false, columnDefinition="DATETIME")
	public Date getEndDate() {
		return this.agreementExtensionAuditBean.getEndDate();
	}

	public void setEndDate(Date endDate) {
		this.agreementExtensionAuditBean.setEndDate(endDate);
	}


	@Column(name="last_modified", nullable=false, columnDefinition="DATETIME")
	public Date getLastModified() {
		return this.agreementExtensionAuditBean.getLastModified();
	}

	public void setLastModified(Date lastModified) {
		this.agreementExtensionAuditBean.setLastModified(lastModified);
	}


	@Column(name="last_modified_by", length=30, columnDefinition="CHAR")
	public String getLastModifiedBy() {
		return this.agreementExtensionAuditBean.getLastModifiedBy();
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.agreementExtensionAuditBean.setLastModifiedBy(lastModifiedBy);
	}


	@Column(name="type_id")
	public Integer getTypeId() {
		return this.agreementExtensionAuditBean.getTypeId();
	}

	public void setTypeId(Integer typeId) {
		this.agreementExtensionAuditBean.setTypeId(typeId);
	}

}