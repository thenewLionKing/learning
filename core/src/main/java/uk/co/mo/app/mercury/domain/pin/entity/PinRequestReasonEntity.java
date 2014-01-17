package uk.co.mo.app.mercury.domain.pin.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the pin_request_reason entitybase table.
 * 
 */
@Entity
@Table(name="pin_request_reason")



public class PinRequestReasonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="request_reason_id", columnDefinition = "tinyint")
	private Integer requestReasonId;
	
	/**
	 * @return the requestReasonId
	 */
	public Integer getRequestReasonId() {
		return requestReasonId;
	}

	/**
	 * @param requestReasonId the requestReasonId to set
	 */
	public void setRequestReasonId(Integer pinId) {
		this.requestReasonId = pinId;
	}

	@Column(name="request_reason_desc")
	private String requestReasonDesc;

	//bi-directional many-to-one association to PinRequestAuditEntity
	@OneToMany(mappedBy="pinRequestReason")
	private Set<PinRequestAuditEntity> pinRequestAudits;

    public PinRequestReasonEntity() {
    }

	public String getRequestReasonDesc() {
		return this.requestReasonDesc;
	}

	public void setRequestReasonDesc(String requestReasonDesc) {
		this.requestReasonDesc = requestReasonDesc;
	}

	public Set<PinRequestAuditEntity> getPinRequestAudits() {
		return this.pinRequestAudits;
	}

	public void setPinRequestAudits(Set<PinRequestAuditEntity> pinRequestAudits) {
		this.pinRequestAudits = pinRequestAudits;
	}
	
}