package uk.co.mo.app.mercury.domain.customer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.customer.beans.VrmCustomerSuspensionReasonBean;



/**
 * The persistent class for the vrm_customer_suspension_reason database table.
 * 
 */
@Entity
@Table(name="vrm_customer_suspension_reason")
public class VrmCustomerSuspensionReasonEntity implements Serializable {


	private static final long serialVersionUID = 7890495156921702643L;
	private VrmCustomerSuspensionReasonBean vrmCustomerSuspensionReasonBean = new VrmCustomerSuspensionReasonBean();

	public VrmCustomerSuspensionReasonEntity() {
    }

	@Transient
	public VrmCustomerSuspensionReasonBean getVrmCustomerSuspensionReasonBean() {
		return vrmCustomerSuspensionReasonBean;
	}


	public void setVrmCustomerSuspensionReasonBean(
			VrmCustomerSuspensionReasonBean vrmCustomerSuspensionReasonBean) {
		this.vrmCustomerSuspensionReasonBean = vrmCustomerSuspensionReasonBean;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="reason_id", unique=true, nullable=false)
	public Integer getReasonId() {
		return this.vrmCustomerSuspensionReasonBean.getReasonId();
	}

	public void setReasonId(Integer reasonId) {
		this.vrmCustomerSuspensionReasonBean.setReasonId(reasonId);
	}


	@Column(name="action_required", length=255)
	public String getActionRequired() {
		return this.vrmCustomerSuspensionReasonBean.getActionRequired();
	}

	public void setActionRequired(String actionRequired) {
		this.vrmCustomerSuspensionReasonBean.setActionRequired(actionRequired);
	}


	@Column(nullable=false)
	public Boolean getActive() {
		return this.vrmCustomerSuspensionReasonBean.isActive();
	}

	public void setActive(Boolean active) {
		this.vrmCustomerSuspensionReasonBean.setActive(active);
	}

	@Column(name="department_id", nullable=false, length=2, columnDefinition="CHAR")
	public String getDepartmentId() {
		return this.vrmCustomerSuspensionReasonBean.getDepartmentId();
	}

	public void setDepartmentId(String departmentId) {
		this.vrmCustomerSuspensionReasonBean.setDepartmentId(departmentId);
	}


	@Column(nullable=false, length=255)
	public String getDescription() {
		return this.vrmCustomerSuspensionReasonBean.getDescription();
	}

	public void setDescription(String description) {
		this.vrmCustomerSuspensionReasonBean.setDescription(description);
	}

	@Column(name="money_required", nullable=false)
	public Boolean getMoneyRequired() {
		return this.vrmCustomerSuspensionReasonBean.isMoneyRequired();
	}

	public void setMoneyRequired(Boolean moneyRequired) {
		this.vrmCustomerSuspensionReasonBean.setMoneyRequired(moneyRequired);
	}


	@Column(nullable=false)
	public Boolean getRemedial() {
		return this.vrmCustomerSuspensionReasonBean.isRemedial();
	}

	public void setRemedial(Boolean remedial) {
		this.vrmCustomerSuspensionReasonBean.setRemedial(remedial);
	}


	@Column(name="sap_code", length=5, columnDefinition="CHAR")
	public String getSapCode() {
		return this.vrmCustomerSuspensionReasonBean.getSapCode();
	}

	public void setSapCode(String sapCode) {
		this.vrmCustomerSuspensionReasonBean.setSapCode(sapCode);
	}

}