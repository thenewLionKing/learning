package uk.co.mo.app.mercury.domain.customer.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class VrmCustomerSuspensionBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4051040577900117809L;
	private Integer suspensionId;
	private Date ceasedOn;
	private String clearedBy;
	private BigDecimal currentBalance;
	private Integer customerId;
	private String drsContactId;
	private Date effectiveFrom;
	private String note;
	private Integer reasonId;
	private String setBy;
	private Boolean suspendedForHp;
	private Boolean suspendedForLease;
	private VrmCustomerSuspensionReasonBean vrmCustomerSuspensionReasonBean;

	public VrmCustomerSuspensionBean() {
	}

	public Integer getSuspensionId() {
		return suspensionId;
	}

	public void setSuspensionId(Integer suspensionId) {
		this.suspensionId = suspensionId;
	}

	public Date getCeasedOn() {
		return ceasedOn;
	}

	public void setCeasedOn(Date ceasedOn) {
		this.ceasedOn = ceasedOn;
	}

	public String getClearedBy() {
		return clearedBy;
	}

	public void setClearedBy(String clearedBy) {
		this.clearedBy = clearedBy;
	}

	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getDrsContactId() {
		return drsContactId;
	}

	public void setDrsContactId(String drsContactId) {
		this.drsContactId = drsContactId;
	}

	public Date getEffectiveFrom() {
		return effectiveFrom;
	}

	public void setEffectiveFrom(Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getReasonId() {
		return reasonId;
	}

	public void setReasonId(Integer reasonId) {
		this.reasonId = reasonId;
	}

	public String getSetBy() {
		return setBy;
	}

	public void setSetBy(String setBy) {
		this.setBy = setBy;
	}

	public Boolean isSuspendedForHp() {
		return suspendedForHp;
	}

	public void setSuspendedForHp(Boolean suspendedForHp) {
		this.suspendedForHp = suspendedForHp;
	}

	public Boolean isSuspendedForLease() {
		return suspendedForLease;
	}

	public void setSuspendedForLease(Boolean suspendedForLease) {
		this.suspendedForLease = suspendedForLease;
	}
	
	public VrmCustomerSuspensionReasonBean getVrmCustomerSuspensionReasonBean() {
		return vrmCustomerSuspensionReasonBean;
	}

	public void setVrmCustomerSuspensionReasonBean(
			VrmCustomerSuspensionReasonBean vrmCustomerSuspensionReasonBean) {
		this.vrmCustomerSuspensionReasonBean = vrmCustomerSuspensionReasonBean;
	}
}