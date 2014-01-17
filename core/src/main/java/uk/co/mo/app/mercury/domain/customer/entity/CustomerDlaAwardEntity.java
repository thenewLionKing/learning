package uk.co.mo.app.mercury.domain.customer.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.customer.beans.CustomerDlaAwardBean;


/**
 * The persistent class for the customer_dla_award database table.
 * 
 */
@Entity
@Table(name="customer_dla_award")
public class CustomerDlaAwardEntity implements Serializable {
	

	private static final long serialVersionUID = -6409288700429516065L;
	private CustomerDlaAwardBean customerDlaAwardBean = new CustomerDlaAwardBean();
	
	@Transient
	public CustomerDlaAwardBean getCustomerDlaAwardBean() {
		return customerDlaAwardBean;
	}

	public void setCustomerDlaAwardBean(CustomerDlaAwardBean customerDlaAwardBean) {
		this.customerDlaAwardBean = customerDlaAwardBean;
	}

	public CustomerDlaAwardEntity() {
    }


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customer_id", unique=true, nullable=false, insertable=false, updatable=false)
	public Integer getCustomerId() {
		return this.customerDlaAwardBean.getCustomerId();
	}

	public void setCustomerId(Integer customerId) {
		this.customerDlaAwardBean.setCustomerId(customerId);
	}


	@Column(name="end_date", columnDefinition="SMALLDATETIME")
	public Date getEndDate() {
		return this.customerDlaAwardBean.getEndDate();
	}

	public void setEndDate(Date endDate) {
		this.customerDlaAwardBean.setEndDate(endDate);
	}


	@Column(name="reason_id")
	public Integer getReasonId() {
		return this.customerDlaAwardBean.getReasonId();
	}

	public void setReasonId(Integer reasonId) {
		this.customerDlaAwardBean.setReasonId(reasonId);
	}


	@Column(name="row_insert_date", columnDefinition="SMALLDATETIME")
	public Date getRowInsertDate() {
		return this.customerDlaAwardBean.getRowInsertDate();
	}

	public void setRowInsertDate(Date rowInsertDate) {
		this.customerDlaAwardBean.setRowInsertDate(rowInsertDate);
	}


	@Column(name="row_update_date", columnDefinition="SMALLDATETIME")
	public Date getRowUpdateDate() {
		return this.customerDlaAwardBean.getRowUpdateDate();
	}

	public void setRowUpdateDate(Date rowUpdateDate) {
		this.customerDlaAwardBean.setRowUpdateDate(rowUpdateDate);
	}


	@Column(name="shortfall_weeks")
	public Integer getShortfallWeeks() {
		return this.customerDlaAwardBean.getShortfallWeeks();
	}

	public void setShortfallWeeks(Integer shortfallWeeks) {
		this.customerDlaAwardBean.setShortfallWeeks(shortfallWeeks);
	}


	@Column(name="start_date", columnDefinition="SMALLDATETIME")
	public Date getStartDate() {
		return this.customerDlaAwardBean.getStartDate();
	}

	public void setStartDate(Date startDate) {
		this.customerDlaAwardBean.setStartDate(startDate);
	}


	@Column(name="status_id", length=1, columnDefinition="CHAR")
	public String getStatusId() {
		return this.customerDlaAwardBean.getStatusId();
	}

	public void setStatusId(String statusId) {
		this.customerDlaAwardBean.setStatusId(statusId);
	}


	@Column(name="update_user", length=20)
	public String getUpdateUser() {
		return this.customerDlaAwardBean.getUpdateUser();
	}

	public void setUpdateUser(String updateUser) {
		this.customerDlaAwardBean.setUpdateUser(updateUser);
	}

    //   PIP-139   - Add award type to the PWS inception feed
    //   PIP changes introduced the following Fields in customer_dla_award db table.
    @Column(name="benefit_code", length=10)
	public String getBenefitCode() {
		return this.customerDlaAwardBean.getBenefitCode();
	}

	public void setBenefitCode(String benefitCode) {
		this.customerDlaAwardBean.setBenefitCode(benefitCode);
	}

    @Column(name="comments", length=255)
	public String getComments() {
		return this.customerDlaAwardBean.getComments();
	}

	public void setComments(String comments) {
		this.customerDlaAwardBean.setComments(comments);
	}
    // End of  PIP-139 


}