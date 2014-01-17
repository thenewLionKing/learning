/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.domain.pin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *  Class comments go here
 * 
 *	@author : VinayRa
 *  @date	: 22 Mar 2010
 *	@time	: 08:36:37
 *
 *  Change Log - Who : When : Comment
 */
@Entity
@Table (name="pin_authentication_audit")


public class PinAuthenticationAuditEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="audit_id")
	private Integer auditId;
	
	@Column(name="pin_to_authenticate")	
	private String pinToAuthenticate;

	@Column(name="valid", columnDefinition="char 1")		
	private Boolean valid;
	
	@ManyToOne
	@JoinColumn (name="request_audit_id")
	private PinRequestAuditEntity pinRequest;

	/**
	 * @return the auditId
	 */
	public Integer getAuditId() {
		return auditId;
	}

	/**
	 * @return the pinToAuthenticate
	 */
	public String getPinToAuthenticate() {
		return pinToAuthenticate;
	}

	/**
	 * @return the valid
	 */
	public Boolean isValid() {
		return valid;
	}

	/**
	 * @return the pinRequest
	 */
	public PinRequestAuditEntity getPinRequest() {
		return pinRequest;
	}

	/**
	 * @param auditId the auditId to set
	 */
	public void setAuditId(Integer auditId) {
		this.auditId = auditId;
	}

	/**
	 * @param pinToAuthenticate the pinToAuthenticate to set
	 */
	public void setPinToAuthenticate(String pinToAuthenticate) {
		this.pinToAuthenticate = pinToAuthenticate;
	}

	/**
	 * @param valid the valid to set
	 */
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	/**
	 * @param pinRequest the pinRequest to set
	 */
	public void setPinRequest(PinRequestAuditEntity pinRequest) {
		this.pinRequest = pinRequest;
	}
	
	
	
}
