package uk.co.mo.app.mercury.domain.customer.beans;

import java.io.Serializable;
import java.util.Date;

public class CustomerDlaAwardBean implements Serializable {

	private static final long serialVersionUID = -3613444081632515145L;
	private Integer customerId;
	private Date endDate;
	private Integer reasonId;
	private Date rowInsertDate;
	private Date rowUpdateDate;
	private Integer shortfallWeeks;
	private Date startDate;
	private String statusId;
	private String updateUser;

    //   PIP-139   - Add award type to the PWS inception feed
    //   PIP changes introduced the following Fields.
    private String benefitCode;
    private String comments;

	public CustomerDlaAwardBean() {
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getReasonId() {
		return reasonId;
	}

	public void setReasonId(Integer reasonId) {
		this.reasonId = reasonId;
	}

	public Date getRowInsertDate() {
		return rowInsertDate;
	}

	public void setRowInsertDate(Date rowInsertDate) {
		this.rowInsertDate = rowInsertDate;
	}

	public Date getRowUpdateDate() {
		return rowUpdateDate;
	}

	public void setRowUpdateDate(Date rowUpdateDate) {
		this.rowUpdateDate = rowUpdateDate;
	}

	public Integer getShortfallWeeks() {
		return shortfallWeeks;
	}

	public void setShortfallWeeks(Integer shortfallWeeks) {
		this.shortfallWeeks = shortfallWeeks;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

    //   PIP-139   - Add award type to the PWS inception feed
    public String getBenefitCode() {
		return benefitCode;
	}

	public void setBenefitCode(String benefitCode) {
		this.benefitCode = benefitCode;
	}

     public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
    // PIP - 139

}