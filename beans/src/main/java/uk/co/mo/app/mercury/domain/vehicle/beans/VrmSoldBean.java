package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class VrmSoldBean implements Serializable {
	
	private static final long serialVersionUID = -1598139388106796388L;

	private Integer soldId;
	private Integer contactId;
	private Date insertDate;
	private Integer mileage;
	private Integer organisationTypeId;
	private Date paidDate;
	private BigDecimal paidValue;
	private Integer publisher_id;
	private String sale_Logged_By;
	private Integer sent_To_Paradox;
	private Integer sold_Cascade_Id;
	private Integer sold_Channel_Id;
	private Date soldDate;
	private BigDecimal soldValue;
	private String status;
	private Integer stockId;
	private Date timestamp;

	public VrmSoldBean() {
	}

	public Integer getSoldId() {
		return soldId;
	}

	public void setSoldId(Integer soldId) {
		this.soldId = soldId;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Integer getMileage() {
		return mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	public Integer getOrganisationTypeId() {
		return organisationTypeId;
	}

	public void setOrganisationTypeId(Integer organisationTypeId) {
		this.organisationTypeId = organisationTypeId;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	public BigDecimal getPaidValue() {
		return paidValue;
	}

	public void setPaidValue(BigDecimal paidValue) {
		this.paidValue = paidValue;
	}

	public Integer getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(Integer publisher_id) {
		this.publisher_id = publisher_id;
	}

	public String getSale_Logged_By() {
		return sale_Logged_By;
	}

	public void setSale_Logged_By(String sale_Logged_By) {
		this.sale_Logged_By = sale_Logged_By;
	}

	public Integer getSent_To_Paradox() {
		return sent_To_Paradox;
	}

	public void setSent_To_Paradox(Integer sent_To_Paradox) {
		this.sent_To_Paradox = sent_To_Paradox;
	}

	public Integer getSold_Cascade_Id() {
		return sold_Cascade_Id;
	}

	public void setSold_Cascade_Id(Integer sold_Cascade_Id) {
		this.sold_Cascade_Id = sold_Cascade_Id;
	}

	public Integer getSold_Channel_Id() {
		return sold_Channel_Id;
	}

	public void setSold_Channel_Id(Integer sold_Channel_Id) {
		this.sold_Channel_Id = sold_Channel_Id;
	}

	public Date getSoldDate() {
		return soldDate;
	}

	public void setSoldDate(Date soldDate) {
		this.soldDate = soldDate;
	}

	public BigDecimal getSoldValue() {
		return soldValue;
	}

	public void setSoldValue(BigDecimal soldValue) {
		this.soldValue = soldValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}