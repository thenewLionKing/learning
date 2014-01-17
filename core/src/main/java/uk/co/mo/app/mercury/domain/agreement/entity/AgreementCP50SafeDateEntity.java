/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.domain.agreement.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;

/**
 *  Class comments go here
 * 
 *	@author : VinayRa
 *  @date	: 19 Mar 2010
 *	@time	: 10:05:24
 *
 *  Change Log - Who : When : Comment
 */

@Entity
@org.hibernate.annotations.Entity(dynamicUpdate = true)
@Table(name = "agreement_cp50_safe_date")


public class AgreementCP50SafeDateEntity  extends AbstractAuditableEntity  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "agreement_safe_date_id")
	private Integer agreementSafeDateId;
	
	@Column(name = "safe_date_status_id")
	private Integer safeDateStatusId;
	
	@Column(name = "safe_date")
	private Date safeDate;

	@Column(name = "insert_date")
	private Date insertDate;
	
	@Column(name = "insert_user")
	private String insertUser;
	
	@ManyToOne
	@JoinColumn(name="agreement_id")
	private AgreementEntity agreement;

	/**
	 * @return the agreementSafeDateId
	 */
	public Integer getAgreementSafeDateId() {
		return agreementSafeDateId;
	}

	/**
	 * @return the safeDateStatusId
	 */
	public Integer getSafeDateStatusId() {
		return safeDateStatusId;
	}

	/**
	 * @return the safeDate
	 */
	public Date getSafeDate() {
		return safeDate;
	}

	/**
	 * @return the insertDate
	 */
	public Date getInsertDate() {
		return insertDate;
	}

	/**
	 * @return the insertUser
	 */
	public String getInsertUser() {
		return insertUser;
	}

	/**
	 * @return the agreement
	 */
	public AgreementEntity getAgreement() {
		return agreement;
	}

	/**
	 * @param agreementSafeDateId the agreementSafeDateId to set
	 */
	public void setAgreementSafeDateId(Integer agreementSafeDateId) {
		this.agreementSafeDateId = agreementSafeDateId;
	}

	/**
	 * @param safeDateStatusId the safeDateStatusId to set
	 */
	public void setSafeDateStatusId(Integer safeDateStatusId) {
		this.safeDateStatusId = safeDateStatusId;
	}

	/**
	 * @param safeDate the safeDate to set
	 */
	public void setSafeDate(Date safeDate) {
		this.safeDate = safeDate;
	}

	/**
	 * @param insertDate the insertDate to set
	 */
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	/**
	 * @param insertUser the insertUser to set
	 */
	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}

	/**
	 * @param agreement the agreement to set
	 */
	public void setAgreement(AgreementEntity agreement) {
		this.agreement = agreement;
	}
	

}
