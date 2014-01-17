package uk.co.mo.app.mercury.domain.customer.beans;

import java.io.Serializable;

public class VrmCustomerSuspensionReasonBean implements Serializable {

	private static final long serialVersionUID = 7019692863560172803L;
	private Integer reasonId;
	private String actionRequired;
	private Boolean active;
	private String departmentId;
	private String description;
	private Boolean moneyRequired;
	private Boolean remedial;
	private String sapCode;

	public VrmCustomerSuspensionReasonBean() {
	}

	public Integer getReasonId() {
		return reasonId;
	}

	public void setReasonId(Integer reasonId) {
		this.reasonId = reasonId;
	}

	public String getActionRequired() {
		return actionRequired;
	}

	public void setActionRequired(String actionRequired) {
		this.actionRequired = actionRequired;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean isMoneyRequired() {
		return moneyRequired;
	}

	public void setMoneyRequired(Boolean moneyRequired) {
		this.moneyRequired = moneyRequired;
	}

	public Boolean isRemedial() {
		return remedial;
	}

	public void setRemedial(Boolean remedial) {
		this.remedial = remedial;
	}

	public String getSapCode() {
		return sapCode;
	}

	public void setSapCode(String sapCode) {
		this.sapCode = sapCode;
	}
}