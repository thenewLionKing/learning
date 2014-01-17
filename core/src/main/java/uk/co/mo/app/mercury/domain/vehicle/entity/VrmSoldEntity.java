package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.VrmSoldBean;



/**
 * The persistent class for the vrm_sold database table.
 * 
 */
@Entity
@Table(name="vrm_sold")
public class VrmSoldEntity implements Serializable {

	private static final long serialVersionUID = 81163661260290465L;

	private VrmSoldBean vrmSoldBean = new VrmSoldBean();

	private VrmOrganisationEntity vrmOrganisation;

    public VrmSoldEntity() {
    }

    @Transient
    public VrmSoldBean getVrmSoldBean() {
		return vrmSoldBean;
	}

	public void setVrmSoldBean(VrmSoldBean vrmSoldBean) {
		this.vrmSoldBean = vrmSoldBean;
	}
	
	@Id
	@Column(name="sold_id", unique=true, nullable=false)
	public Integer getSoldId() {
		return this.vrmSoldBean.getSoldId();
	}

	public void setSoldId(Integer soldId) {
		this.vrmSoldBean.setSoldId(soldId);
	}

	@Column(name="stock_id", nullable=false)
	public Integer getStockId() {
		return this.vrmSoldBean.getStockId();
	}

	public void setStockId(Integer stockId) {
		this.vrmSoldBean.setStockId(stockId);
	}

	@Column(name="contact_id")
	public Integer getContactId() {
		return this.vrmSoldBean.getContactId();
	}

	public void setContactId(Integer contactId) {
		this.vrmSoldBean.setContactId(contactId);
	}


	@Column(name="insert_date")
	public Date getInsertDate() {
		return this.vrmSoldBean.getInsertDate();
	}

	public void setInsertDate(Date insertDate) {
		this.vrmSoldBean.setInsertDate(insertDate);
	}


	public Integer getMileage() {
		return this.vrmSoldBean.getMileage();
	}

	public void setMileage(Integer mileage) {
		this.vrmSoldBean.setMileage(mileage);
	}


	@Column(name="organisation_type_id")
	public Integer getOrganisationTypeId() {
		return this.vrmSoldBean.getOrganisationTypeId();
	}

	public void setOrganisationTypeId(Integer organisationTypeId) {
		this.vrmSoldBean.setOrganisationTypeId(organisationTypeId);
	}


	@Column(name="paid_date")
	public Date getPaidDate() {
		return this.vrmSoldBean.getPaidDate();
	}

	public void setPaidDate(Date paidDate) {
		this.vrmSoldBean.setPaidDate(paidDate);
	}


	@Column(name="paid_value", columnDefinition="MONEY")
	public BigDecimal getPaidValue() {
		return this.vrmSoldBean.getPaidValue();
	}

	public void setPaidValue(BigDecimal paidValue) {
		this.vrmSoldBean.setPaidValue(paidValue);
	}


	@Column(name="Publisher_id")
	public Integer getPublisher_id() {
		return this.vrmSoldBean.getPublisher_id();
	}

	public void setPublisher_id(Integer publisher_id) {
		this.vrmSoldBean.setPublisher_id(publisher_id);
	}


	@Column(name="Sale_Logged_By", length=50)
	public String getSale_Logged_By() {
		return this.vrmSoldBean.getSale_Logged_By();
	}

	public void setSale_Logged_By(String sale_Logged_By) {
		this.vrmSoldBean.setSale_Logged_By(sale_Logged_By);
	}


	@Column(name="Sent_To_Paradox")
	public Integer getSent_To_Paradox() {
		return this.vrmSoldBean.getSent_To_Paradox();
	}

	public void setSent_To_Paradox(Integer sent_To_Paradox) {
		this.vrmSoldBean.setSent_To_Paradox(sent_To_Paradox);
	}


	@Column(name="Sold_Cascade_Id")
	public Integer getSold_Cascade_Id() {
		return this.vrmSoldBean.getSold_Cascade_Id();
	}

	public void setSold_Cascade_Id(Integer sold_Cascade_Id) {
		this.vrmSoldBean.setSold_Cascade_Id(sold_Cascade_Id);
	}


	@Column(name="Sold_Channel_Id")
	public Integer getSold_Channel_Id() {
		return this.vrmSoldBean.getSold_Channel_Id();
	}

	public void setSold_Channel_Id(Integer sold_Channel_Id) {
		this.vrmSoldBean.setSold_Channel_Id(sold_Channel_Id);
	}


	@Column(name="sold_date", nullable=false)
	public Date getSoldDate() {
		return this.vrmSoldBean.getSoldDate();
	}

	public void setSoldDate(Date soldDate) {
		this.vrmSoldBean.setSoldDate(soldDate);
	}


	@Column(name="sold_value", nullable=false, columnDefinition="MONEY")
	public BigDecimal getSoldValue() {
		return this.vrmSoldBean.getSoldValue();
	}

	public void setSoldValue(BigDecimal soldValue) {
		this.vrmSoldBean.setSoldValue(soldValue);
	}


	@Column(length=1, columnDefinition="CHAR")
	public String getStatus() {
		return this.vrmSoldBean.getStatus();
	}

	public void setStatus(String status) {
		this.vrmSoldBean.setStatus(status);
	}

	//bi-directional many-to-one association to VrmOrganisationEntity
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="organisation_id")
	public VrmOrganisationEntity getVrmOrganisation() {
		return this.vrmOrganisation;
	}

	public void setVrmOrganisation(VrmOrganisationEntity vrmOrganisation) {
		this.vrmOrganisation = vrmOrganisation;
	}
}