package uk.co.mo.app.mercury.domain.pin.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;

/**
 * The persistent class for the pin_request_audit entitybase table.
 * 
 */
@Entity
@Table(name="pin_request_audit")



public class PinRequestAuditEntity extends AbstractAuditableEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="audit_id" , columnDefinition = "tinyint")
	private Integer auditId;

	@Column(name="insert_date")
	private Date insertDate;

	@Column(name="insert_user")
	private String insertUser;

	@Column(name="transport_type_id" , columnDefinition = "tinyint")
	private Short transportTypeId;

	//bi-directional many-to-one association to PinRequestReasonEntity
    @ManyToOne
	@JoinColumn(name="request_reason_id", columnDefinition = "tinyint")
	private PinRequestReasonEntity pinRequestReason;

	//bi-directional many-to-one association to PinEntity
    @ManyToOne
	@JoinColumn(name="pin_id")
	private PinEntity pin;

	@OneToMany (mappedBy="pinRequest",  cascade=CascadeType.ALL)
    private List<PinAuthenticationAuditEntity> authenticationAudit;
    
    public PinRequestAuditEntity() {
    }

	public Integer getAuditId() {
		return this.auditId;
	}

	public void setAuditId(Integer auditId) {
		this.auditId = auditId;
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

	public Short getTransportTypeId() {
		return this.transportTypeId;
	}

	public void setTransportTypeId(Short transportTypeId) {
		this.transportTypeId = transportTypeId;
	}

	public PinRequestReasonEntity getPinRequestReason() {
		return this.pinRequestReason;
	}

	public void setPinRequestReason(PinRequestReasonEntity pinRequestReason) {
		this.pinRequestReason = pinRequestReason;
	}
	
	public PinEntity getPin() {
		return this.pin;
	}

	public void setPin(PinEntity pin) {
		this.pin = pin;
	}

	/**
	 * @return the authenticationAudit
	 */
	public List<PinAuthenticationAuditEntity> getAuthenticationAudit() {
		return authenticationAudit;
	}

	/**
	 * @param authenticationAudit the authenticationAudit to set
	 */
	public void addAuthenticationAudit(
			PinAuthenticationAuditEntity authenticationAudit) {
		if(this.authenticationAudit==null) this.authenticationAudit = new ArrayList<PinAuthenticationAuditEntity>();
		this.authenticationAudit.add(authenticationAudit);
	}
	
}