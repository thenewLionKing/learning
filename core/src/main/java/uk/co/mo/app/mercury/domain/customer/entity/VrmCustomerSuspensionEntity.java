package uk.co.mo.app.mercury.domain.customer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.customer.beans.VrmCustomerSuspensionBean;


/**
 * The persistent class for the vrm_customer_suspension database table.
 * 
 */
@Entity
@Table(name="vrm_customer_suspension")
public class VrmCustomerSuspensionEntity implements Serializable {

	private static final long serialVersionUID = -6784088688867014346L;
	private VrmCustomerSuspensionBean vrmCustomerSuspensionBean = new VrmCustomerSuspensionBean();
	private VrmCustomerSuspensionReasonEntity vrmCustomerSuspensionReasonEntity = new VrmCustomerSuspensionReasonEntity();

	public VrmCustomerSuspensionEntity() {
    }
	
	@Transient
	public VrmCustomerSuspensionBean getVrmCustomerSuspensionBean() {
		return vrmCustomerSuspensionBean;
	}

	@OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name="reason_id", referencedColumnName="reason_id", nullable=false, insertable=false, updatable=false)
	public VrmCustomerSuspensionReasonEntity getVrmCustomerSuspensionReasonEntity() {
		return this.vrmCustomerSuspensionReasonEntity;
	}
	public void setVrmCustomerSuspensionReasonEntity(
			VrmCustomerSuspensionReasonEntity vrmCustomerSuspensionReasonEntity) {
		this.vrmCustomerSuspensionReasonEntity = vrmCustomerSuspensionReasonEntity;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="suspension_id", unique=true, nullable=false)
	public Integer getSuspensionId() {
		return this.vrmCustomerSuspensionBean.getSuspensionId();
	}

	public void setSuspensionId(Integer suspensionId) {
		this.vrmCustomerSuspensionBean.setSuspensionId(suspensionId);
	}


	@Column(name="ceased_on")
	public Date getCeasedOn() {
		return this.vrmCustomerSuspensionBean.getCeasedOn();
	}

	public void setCeasedOn(Date ceasedOn) {
		this.vrmCustomerSuspensionBean.setCeasedOn(ceasedOn);
	}


	@Column(name="cleared_by", length=20, columnDefinition="CHAR")
	public String getClearedBy() {
		return this.vrmCustomerSuspensionBean.getClearedBy();
	}

	public void setClearedBy(String clearedBy) {
		this.vrmCustomerSuspensionBean.setClearedBy(clearedBy);
	}


	@Column(name="current_balance", precision=7, scale=2, columnDefinition="DECIMAL")
	public BigDecimal getCurrentBalance() {
		return this.vrmCustomerSuspensionBean.getCurrentBalance();
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.vrmCustomerSuspensionBean.setCurrentBalance(currentBalance);
	}


	@Column(name="customer_id", nullable=false,insertable=false, updatable=false)
	public Integer getCustomerId() {
		return this.vrmCustomerSuspensionBean.getCustomerId();
	}

	public void setCustomerId(Integer customerId) {
		this.vrmCustomerSuspensionBean.setCustomerId(customerId);
	}


	@Column(name="drs_contact_id", length=20)
	public String getDrsContactId() {
		return this.vrmCustomerSuspensionBean.getDrsContactId();
	}

	public void setDrsContactId(String drsContactId) {
		this.vrmCustomerSuspensionBean.setDrsContactId(drsContactId);
	}


	@Column(name="effective_from", nullable=false)
	public Date getEffectiveFrom() {
		return this.vrmCustomerSuspensionBean.getEffectiveFrom();
	}

	public void setEffectiveFrom(Date effectiveFrom) {
		this.vrmCustomerSuspensionBean.setEffectiveFrom(effectiveFrom);
	}


	@Column(length=255)
	public String getNote() {
		return this.vrmCustomerSuspensionBean.getNote();
	}

	public void setNote(String note) {
		this.vrmCustomerSuspensionBean.setNote(note);
	}


	@Column(name="reason_id", nullable=false)
	public Integer getReasonId() {
		return this.vrmCustomerSuspensionBean.getReasonId();
	}

	public void setReasonId(Integer reasonId) {
		this.vrmCustomerSuspensionBean.setReasonId(reasonId);
	}


	@Column(name="set_by", nullable=false, length=20, columnDefinition="CHAR")
	public String getSetBy() {
		return this.vrmCustomerSuspensionBean.getSetBy();
	}

	public void setSetBy(String setBy) {
		this.vrmCustomerSuspensionBean.setSetBy(setBy);
	}


	@Column(name="suspended_for_hp", nullable=false)
	public Boolean getSuspendedForHp() {
		return this.vrmCustomerSuspensionBean.isSuspendedForHp();
	}

	public void setSuspendedForHp(Boolean suspendedForHp) {
		this.vrmCustomerSuspensionBean.setSuspendedForHp(suspendedForHp);
	}


	@Column(name="suspended_for_lease", nullable=false)
	public Boolean getSuspendedForLease() {
		return this.vrmCustomerSuspensionBean.isSuspendedForLease();
	}

	public void setSuspendedForLease(Boolean suspendedForLease) {
		this.vrmCustomerSuspensionBean.setSuspendedForLease(suspendedForLease);
	}
}