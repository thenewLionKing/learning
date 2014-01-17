package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.VrmBvReturnBean;


/**
 * The persistent class for the vrm_bv_return database table.
 * 
 */
@Entity
@Table(name="vrm_bv_return")
public class VrmBvReturnEntity implements Serializable {
	
	private static final long serialVersionUID = 4179539945290612867L;

	private VrmBvReturnBean vrmBvReturnBean = new VrmBvReturnBean();
	private VrmDeliveryTypeEntity vrmDeliveryTypeEntity; 

	public VrmBvReturnEntity() {
    }

	@Transient
	public VrmBvReturnBean getVrmBvReturnBean() {
		return vrmBvReturnBean;
	}


	public void setVrmBvReturnBean(VrmBvReturnBean vrmBvReturnBean) {
		this.vrmBvReturnBean = vrmBvReturnBean;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bv_return_id")
	public Integer getBvReturnId() {
		return this.vrmBvReturnBean.getBvReturnId();
	}

	public void setBvReturnId(Integer bvReturnId) {
		this.vrmBvReturnBean.setBvReturnId(bvReturnId);
	}


	@Column(name="batch_trans_id")
	public Integer getBatchTransId() {
		return this.vrmBvReturnBean.getBatchTransId();
	}

	public void setBatchTransId(Integer batchTransId) {
		this.vrmBvReturnBean.setBatchTransId(batchTransId);
	}


	@Column(name="call_centre_user", columnDefinition="CHAR")
	public String getCallCentreUser() {
		return this.vrmBvReturnBean.getCallCentreUser();
	}

	public void setCallCentreUser(String callCentreUser) {
		this.vrmBvReturnBean.setCallCentreUser(callCentreUser);
	}


/*	public Integer getCascade() {
		return this.vrmBvReturnBean.getCascade();
	}

	public void setCascade(Integer cascade) {
		this.vrmBvReturnBean.setCascade(cascade);
	}
*/

	@Column(name="channel_id")
	public Integer getChannelId() {
		return this.vrmBvReturnBean.getChannelId();
	}

	public void setChannelId(Integer channelId) {
		this.vrmBvReturnBean.setChannelId(channelId);
	}


	@Column(name="completion_state")
	public Integer getCompletionState() {
		return this.vrmBvReturnBean.getCompletionState();
	}

	public void setCompletionState(Integer completionState) {
		this.vrmBvReturnBean.setCompletionState(completionState);
	}


	@Column(name="dealer_group")
	public Integer getDealerGroup() {
		return this.vrmBvReturnBean.getDealerGroup();
	}

	public void setDealerGroup(Integer dealerGroup) {
		this.vrmBvReturnBean.setDealerGroup(dealerGroup);
	}


	@Column(name="delivery_address_id")
	public Integer getDeliveryAddressId() {
		return this.vrmBvReturnBean.getDeliveryAddressId();
	}

	public void setDeliveryAddressId(Integer deliveryAddressId) {
		this.vrmBvReturnBean.setDeliveryAddressId(deliveryAddressId);
	}


	@Column(name="delivery_address1")
	public String getDeliveryAddress1() {
		return this.vrmBvReturnBean.getDeliveryAddress1();
	}

	public void setDeliveryAddress1(String deliveryAddress1) {
		this.vrmBvReturnBean.setDeliveryAddress1(deliveryAddress1);
	}


	@Column(name="delivery_address2")
	public String getDeliveryAddress2() {
		return this.vrmBvReturnBean.getDeliveryAddress2();
	}

	public void setDeliveryAddress2(String deliveryAddress2) {
		this.vrmBvReturnBean.setDeliveryAddress2(deliveryAddress2);
	}


	@Column(name="delivery_address3")
	public String getDeliveryAddress3() {
		return this.vrmBvReturnBean.getDeliveryAddress3();
	}

	public void setDeliveryAddress3(String deliveryAddress3) {
		this.vrmBvReturnBean.setDeliveryAddress3(deliveryAddress3);
	}


	@Column(name="delivery_cost", columnDefinition="DECIMAL")
	public BigDecimal getDeliveryCost() {
		return this.vrmBvReturnBean.getDeliveryCost();
	}

	public void setDeliveryCost(BigDecimal deliveryCost) {
		this.vrmBvReturnBean.setDeliveryCost(deliveryCost);
	}


	@Column(name="delivery_county")
	public String getDeliveryCounty() {
		return this.vrmBvReturnBean.getDeliveryCounty();
	}

	public void setDeliveryCounty(String deliveryCounty) {
		this.vrmBvReturnBean.setDeliveryCounty(deliveryCounty);
	}


	@Column(name="delivery_date", columnDefinition="DATETIME")
	public Date getDeliveryDate() {
		return this.vrmBvReturnBean.getDeliveryDate();
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.vrmBvReturnBean.setDeliveryDate(deliveryDate);
	}


	@Column(name="delivery_postcode", columnDefinition="CHAR")
	public String getDeliveryPostcode() {
		return this.vrmBvReturnBean.getDeliveryPostcode();
	}

	public void setDeliveryPostcode(String deliveryPostcode) {
		this.vrmBvReturnBean.setDeliveryPostcode(deliveryPostcode);
	}


	@Column(name="delivery_town")
	public String getDeliveryTown() {
		return this.vrmBvReturnBean.getDeliveryTown();
	}

	public void setDeliveryTown(String deliveryTown) {
		this.vrmBvReturnBean.setDeliveryTown(deliveryTown);
	}


	@Column(name="delivery_type")
	public String getDeliveryType() {
		return this.vrmBvReturnBean.getDeliveryType();
	}

	public void setDeliveryType(String deliveryType) {
		this.vrmBvReturnBean.setDeliveryType(deliveryType);
	}


	@Column(name="invoice_address1")
	public String getInvoiceAddress1() {
		return this.vrmBvReturnBean.getInvoiceAddress1();
	}

	public void setInvoiceAddress1(String invoiceAddress1) {
		this.vrmBvReturnBean.setInvoiceAddress1(invoiceAddress1);
	}


	@Column(name="invoice_address2")
	public String getInvoiceAddress2() {
		return this.vrmBvReturnBean.getInvoiceAddress2();
	}

	public void setInvoiceAddress2(String invoiceAddress2) {
		this.vrmBvReturnBean.setInvoiceAddress2(invoiceAddress2);
	}


	@Column(name="invoice_address3")
	public String getInvoiceAddress3() {
		return this.vrmBvReturnBean.getInvoiceAddress3();
	}

	public void setInvoiceAddress3(String invoiceAddress3) {
		this.vrmBvReturnBean.setInvoiceAddress3(invoiceAddress3);
	}


	@Column(name="invoice_county")
	public String getInvoiceCounty() {
		return this.vrmBvReturnBean.getInvoiceCounty();
	}

	public void setInvoiceCounty(String invoiceCounty) {
		this.vrmBvReturnBean.setInvoiceCounty(invoiceCounty);
	}


	@Column(name="invoice_postcode", columnDefinition="CHAR")
	public String getInvoicePostcode() {
		return this.vrmBvReturnBean.getInvoicePostcode();
	}

	public void setInvoicePostcode(String invoicePostcode) {
		this.vrmBvReturnBean.setInvoicePostcode(invoicePostcode);
	}


	@Column(name="invoice_town")
	public String getInvoiceTown() {
		return this.vrmBvReturnBean.getInvoiceTown();
	}

	public void setInvoiceTown(String invoiceTown) {
		this.vrmBvReturnBean.setInvoiceTown(invoiceTown);
	}


	@Column(name="organisation_code")
	public String getOrganisationCode() {
		return this.vrmBvReturnBean.getOrganisationCode();
	}

	public void setOrganisationCode(String organisationCode) {
		this.vrmBvReturnBean.setOrganisationCode(organisationCode);
	}


	@Column(name="payment_method")
	public Integer getPaymentMethod() {
		return this.vrmBvReturnBean.getPaymentMethod();
	}

	public void setPaymentMethod(Integer paymentMethod) {
		this.vrmBvReturnBean.setPaymentMethod(paymentMethod);
	}

	@Column(columnDefinition="CHAR")
	public String getProcessed() {
		return this.vrmBvReturnBean.getProcessed();
	}

	public void setProcessed(String processed) {
		this.vrmBvReturnBean.setProcessed(processed);
	}


	@Column(name="purchaser_email")
	public String getPurchaserEmail() {
		return this.vrmBvReturnBean.getPurchaserEmail();
	}

	public void setPurchaserEmail(String purchaserEmail) {
		this.vrmBvReturnBean.setPurchaserEmail(purchaserEmail);
	}


	@Column(name="purchaser_fax_no")
	public String getPurchaserFaxNo() {
		return this.vrmBvReturnBean.getPurchaserFaxNo();
	}

	public void setPurchaserFaxNo(String purchaserFaxNo) {
		this.vrmBvReturnBean.setPurchaserFaxNo(purchaserFaxNo);
	}


	@Column(name="purchaser_first_name")
	public String getPurchaserFirstName() {
		return this.vrmBvReturnBean.getPurchaserFirstName();
	}

	public void setPurchaserFirstName(String purchaserFirstName) {
		this.vrmBvReturnBean.setPurchaserFirstName(purchaserFirstName);
	}


	@Column(name="purchaser_initials")
	public String getPurchaserInitials() {
		return this.vrmBvReturnBean.getPurchaserInitials();
	}

	public void setPurchaserInitials(String purchaserInitials) {
		this.vrmBvReturnBean.setPurchaserInitials(purchaserInitials);
	}


	@Column(name="purchaser_mobile_no")
	public String getPurchaserMobileNo() {
		return this.vrmBvReturnBean.getPurchaserMobileNo();
	}

	public void setPurchaserMobileNo(String purchaserMobileNo) {
		this.vrmBvReturnBean.setPurchaserMobileNo(purchaserMobileNo);
	}


	@Column(name="purchaser_surname")
	public String getPurchaserSurname() {
		return this.vrmBvReturnBean.getPurchaserSurname();
	}

	public void setPurchaserSurname(String purchaserSurname) {
		this.vrmBvReturnBean.setPurchaserSurname(purchaserSurname);
	}


	@Column(name="purchaser_tel_no")
	public String getPurchaserTelNo() {
		return this.vrmBvReturnBean.getPurchaserTelNo();
	}

	public void setPurchaserTelNo(String purchaserTelNo) {
		this.vrmBvReturnBean.setPurchaserTelNo(purchaserTelNo);
	}


	@Column(name="purchaser_title")
	public String getPurchaserTitle() {
		return this.vrmBvReturnBean.getPurchaserTitle();
	}

	public void setPurchaserTitle(String purchaserTitle) {
		this.vrmBvReturnBean.setPurchaserTitle(purchaserTitle);
	}


	@Column(name="purchaser_work_phone")
	public String getPurchaserWorkPhone() {
		return this.vrmBvReturnBean.getPurchaserWorkPhone();
	}

	public void setPurchaserWorkPhone(String purchaserWorkPhone) {
		this.vrmBvReturnBean.setPurchaserWorkPhone(purchaserWorkPhone);
	}


	@Column(name="received_date", columnDefinition="DATETIME")
	public Date getReceivedDate() {
		return this.vrmBvReturnBean.getReceivedDate();
	}

	public void setReceivedDate(Date receivedDate) {
		this.vrmBvReturnBean.setReceivedDate(receivedDate);
	}


	@Column(name="record_type", columnDefinition="CHAR")
	public String getRecordType() {
		return this.vrmBvReturnBean.getRecordType();
	}

	public void setRecordType(String recordType) {
		this.vrmBvReturnBean.setRecordType(recordType);
	}


	@Column(name="registration_number", columnDefinition="CHAR")
	public String getRegistrationNumber() {
		return this.vrmBvReturnBean.getRegistrationNumber();
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.vrmBvReturnBean.setRegistrationNumber(registrationNumber);
	}


	@Column(name="row_insert_date", columnDefinition="DATETIME")
	public Date getRowInsertDate() {
		return this.vrmBvReturnBean.getRowInsertDate();
	}

	public void setRowInsertDate(Date rowInsertDate) {
		this.vrmBvReturnBean.setRowInsertDate(rowInsertDate);
	}


	@Column(name="rvc_trade_sale_id")
	public Integer getRvcTradeSaleId() {
		return this.vrmBvReturnBean.getRvcTradeSaleId();
	}

	public void setRvcTradeSaleId(Integer rvcTradeSaleId) {
		this.vrmBvReturnBean.setRvcTradeSaleId(rvcTradeSaleId);
	}


	@Column(name="sold_date", columnDefinition="DATETIME")
	public Date getSoldDate() {
		return this.vrmBvReturnBean.getSoldDate();
	}

	public void setSoldDate(Date soldDate) {
		this.vrmBvReturnBean.setSoldDate(soldDate);
	}


	@Column(name="sold_handback_location_id")
	public Integer getSoldHandbackLocationId() {
		return this.vrmBvReturnBean.getSoldHandbackLocationId();
	}

	public void setSoldHandbackLocationId(Integer soldHandbackLocationId) {
		this.vrmBvReturnBean.setSoldHandbackLocationId(soldHandbackLocationId);
	}


	@Column(name="sold_value", columnDefinition="DECIMAL")
	public BigDecimal getSoldValue() {
		return this.vrmBvReturnBean.getSoldValue();
	}

	public void setSoldValue(BigDecimal soldValue) {
		this.vrmBvReturnBean.setSoldValue(soldValue);
	}


	@Column(name="stock_id")
	public Integer getStockId() {
		return this.vrmBvReturnBean.getStockId();
	}

	public void setStockId(Integer stockId) {
		this.vrmBvReturnBean.setStockId(stockId);
	}


	@Column(name="vehicles_sold_id")
	public Integer getVehiclesSoldId() {
		return this.vrmBvReturnBean.getVehiclesSoldId();
	}

	public void setVehiclesSoldId(Integer vehiclesSoldId) {
		this.vrmBvReturnBean.setVehiclesSoldId(vehiclesSoldId);
	}
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="delivery_type", referencedColumnName="delivery_type_id", insertable=false, updatable=false)
	public VrmDeliveryTypeEntity getVrmDeliveryTypeEntity() {
		return vrmDeliveryTypeEntity;
	}

	public void setVrmDeliveryTypeEntity(VrmDeliveryTypeEntity vrmDeliveryTypeEntity) {
		this.vrmDeliveryTypeEntity = vrmDeliveryTypeEntity;
	}

}