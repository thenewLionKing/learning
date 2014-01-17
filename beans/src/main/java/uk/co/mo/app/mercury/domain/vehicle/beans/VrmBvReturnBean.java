package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class VrmBvReturnBean implements Serializable{
	
	private static final long serialVersionUID = -124567226477162990L;

	private Integer bvReturnId;
	private Integer batchTransId;
	private String callCentreUser;
	private Integer cascade;
	private Integer channelId;
	private Integer completionState;
	private Integer dealerGroup;
	private Integer deliveryAddressId;
	private String deliveryAddress1;
	private String deliveryAddress2;
	private String deliveryAddress3;
	private BigDecimal deliveryCost;
	private String deliveryCounty;
	private Date deliveryDate;
	private String deliveryPostcode;
	private String deliveryTown;
	private String deliveryType;
	private String invoiceAddress1;
	private String invoiceAddress2;
	private String invoiceAddress3;
	private String invoiceCounty;
	private String invoicePostcode;
	private String invoiceTown;
	private String organisationCode;
	private Integer paymentMethod;
	private String processed;
	private String purchaserEmail;
	private String purchaserFaxNo;
	private String purchaserFirstName;
	private String purchaserInitials;
	private String purchaserMobileNo;
	private String purchaserSurname;
	private String purchaserTelNo;
	private String purchaserTitle;
	private String purchaserWorkPhone;
	private Date receivedDate;
	private String recordType;
	private String registrationNumber;
	private Date rowInsertDate;
	private Integer rvcTradeSaleId;
	private Date soldDate;
	private Integer soldHandbackLocationId;
	private BigDecimal soldValue;
	private Integer stockId;
	private Integer vehiclesSoldId;
	
	private VrmDeliveryTypeBean vrmDeliveryTypeBean; 

	public VrmBvReturnBean() {
	}

	public Integer getBvReturnId() {
		return bvReturnId;
	}

	public void setBvReturnId(Integer bvReturnId) {
		this.bvReturnId = bvReturnId;
	}

	public Integer getBatchTransId() {
		return batchTransId;
	}

	public void setBatchTransId(Integer batchTransId) {
		this.batchTransId = batchTransId;
	}

	public String getCallCentreUser() {
		return callCentreUser;
	}

	public void setCallCentreUser(String callCentreUser) {
		this.callCentreUser = callCentreUser;
	}

	public Integer getCascade() {
		return cascade;
	}

	public void setCascade(Integer cascade) {
		this.cascade = cascade;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public Integer getCompletionState() {
		return completionState;
	}

	public void setCompletionState(Integer completionState) {
		this.completionState = completionState;
	}

	public Integer getDealerGroup() {
		return dealerGroup;
	}

	public void setDealerGroup(Integer dealerGroup) {
		this.dealerGroup = dealerGroup;
	}

	public Integer getDeliveryAddressId() {
		return deliveryAddressId;
	}

	public void setDeliveryAddressId(Integer deliveryAddressId) {
		this.deliveryAddressId = deliveryAddressId;
	}

	public String getDeliveryAddress1() {
		return deliveryAddress1;
	}

	public void setDeliveryAddress1(String deliveryAddress1) {
		this.deliveryAddress1 = deliveryAddress1;
	}

	public String getDeliveryAddress2() {
		return deliveryAddress2;
	}

	public void setDeliveryAddress2(String deliveryAddress2) {
		this.deliveryAddress2 = deliveryAddress2;
	}

	public String getDeliveryAddress3() {
		return deliveryAddress3;
	}

	public void setDeliveryAddress3(String deliveryAddress3) {
		this.deliveryAddress3 = deliveryAddress3;
	}

	public BigDecimal getDeliveryCost() {
		return deliveryCost;
	}

	public void setDeliveryCost(BigDecimal deliveryCost) {
		this.deliveryCost = deliveryCost;
	}

	public String getDeliveryCounty() {
		return deliveryCounty;
	}

	public void setDeliveryCounty(String deliveryCounty) {
		this.deliveryCounty = deliveryCounty;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryPostcode() {
		return deliveryPostcode;
	}

	public void setDeliveryPostcode(String deliveryPostcode) {
		this.deliveryPostcode = deliveryPostcode;
	}

	public String getDeliveryTown() {
		return deliveryTown;
	}

	public void setDeliveryTown(String deliveryTown) {
		this.deliveryTown = deliveryTown;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getInvoiceAddress1() {
		return invoiceAddress1;
	}

	public void setInvoiceAddress1(String invoiceAddress1) {
		this.invoiceAddress1 = invoiceAddress1;
	}

	public String getInvoiceAddress2() {
		return invoiceAddress2;
	}

	public void setInvoiceAddress2(String invoiceAddress2) {
		this.invoiceAddress2 = invoiceAddress2;
	}

	public String getInvoiceAddress3() {
		return invoiceAddress3;
	}

	public void setInvoiceAddress3(String invoiceAddress3) {
		this.invoiceAddress3 = invoiceAddress3;
	}

	public String getInvoiceCounty() {
		return invoiceCounty;
	}

	public void setInvoiceCounty(String invoiceCounty) {
		this.invoiceCounty = invoiceCounty;
	}

	public String getInvoicePostcode() {
		return invoicePostcode;
	}

	public void setInvoicePostcode(String invoicePostcode) {
		this.invoicePostcode = invoicePostcode;
	}

	public String getInvoiceTown() {
		return invoiceTown;
	}

	public void setInvoiceTown(String invoiceTown) {
		this.invoiceTown = invoiceTown;
	}

	public String getOrganisationCode() {
		return organisationCode;
	}

	public void setOrganisationCode(String organisationCode) {
		this.organisationCode = organisationCode;
	}

	public Integer getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(Integer paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	public String getPurchaserEmail() {
		return purchaserEmail;
	}

	public void setPurchaserEmail(String purchaserEmail) {
		this.purchaserEmail = purchaserEmail;
	}

	public String getPurchaserFaxNo() {
		return purchaserFaxNo;
	}

	public void setPurchaserFaxNo(String purchaserFaxNo) {
		this.purchaserFaxNo = purchaserFaxNo;
	}

	public String getPurchaserFirstName() {
		return purchaserFirstName;
	}

	public void setPurchaserFirstName(String purchaserFirstName) {
		this.purchaserFirstName = purchaserFirstName;
	}

	public String getPurchaserInitials() {
		return purchaserInitials;
	}

	public void setPurchaserInitials(String purchaserInitials) {
		this.purchaserInitials = purchaserInitials;
	}

	public String getPurchaserMobileNo() {
		return purchaserMobileNo;
	}

	public void setPurchaserMobileNo(String purchaserMobileNo) {
		this.purchaserMobileNo = purchaserMobileNo;
	}

	public String getPurchaserSurname() {
		return purchaserSurname;
	}

	public void setPurchaserSurname(String purchaserSurname) {
		this.purchaserSurname = purchaserSurname;
	}

	public String getPurchaserTelNo() {
		return purchaserTelNo;
	}

	public void setPurchaserTelNo(String purchaserTelNo) {
		this.purchaserTelNo = purchaserTelNo;
	}

	public String getPurchaserTitle() {
		return purchaserTitle;
	}

	public void setPurchaserTitle(String purchaserTitle) {
		this.purchaserTitle = purchaserTitle;
	}

	public String getPurchaserWorkPhone() {
		return purchaserWorkPhone;
	}

	public void setPurchaserWorkPhone(String purchaserWorkPhone) {
		this.purchaserWorkPhone = purchaserWorkPhone;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Date getRowInsertDate() {
		return rowInsertDate;
	}

	public void setRowInsertDate(Date rowInsertDate) {
		this.rowInsertDate = rowInsertDate;
	}

	public Integer getRvcTradeSaleId() {
		return rvcTradeSaleId;
	}

	public void setRvcTradeSaleId(Integer rvcTradeSaleId) {
		this.rvcTradeSaleId = rvcTradeSaleId;
	}

	public Date getSoldDate() {
		return soldDate;
	}

	public void setSoldDate(Date soldDate) {
		this.soldDate = soldDate;
	}

	public Integer getSoldHandbackLocationId() {
		return soldHandbackLocationId;
	}

	public void setSoldHandbackLocationId(Integer soldHandbackLocationId) {
		this.soldHandbackLocationId = soldHandbackLocationId;
	}

	public BigDecimal getSoldValue() {
		return soldValue;
	}

	public void setSoldValue(BigDecimal soldValue) {
		this.soldValue = soldValue;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public Integer getVehiclesSoldId() {
		return vehiclesSoldId;
	}

	public void setVehiclesSoldId(Integer vehiclesSoldId) {
		this.vehiclesSoldId = vehiclesSoldId;
	}

	@Override
	public String toString() {
		return "VrmBvReturnBean [bvReturnId=" + bvReturnId + ", batchTransId="
				+ batchTransId + ", callCentreUser=" + callCentreUser
				+ ", cascade=" + cascade + ", channelId=" + channelId
				+ ", completionState=" + completionState + ", dealerGroup="
				+ dealerGroup + ", deliveryAddressId=" + deliveryAddressId
				+ ", deliveryAddress1=" + deliveryAddress1
				+ ", deliveryAddress2=" + deliveryAddress2
				+ ", deliveryAddress3=" + deliveryAddress3 + ", deliveryCost="
				+ deliveryCost + ", deliveryCounty=" + deliveryCounty
				+ ", deliveryDate=" + deliveryDate + ", deliveryPostcode="
				+ deliveryPostcode + ", deliveryTown=" + deliveryTown
				+ ", deliveryType=" + deliveryType + ", invoiceAddress1="
				+ invoiceAddress1 + ", invoiceAddress2=" + invoiceAddress2
				+ ", invoiceAddress3=" + invoiceAddress3 + ", invoiceCounty="
				+ invoiceCounty + ", invoicePostcode=" + invoicePostcode
				+ ", invoiceTown=" + invoiceTown + ", organisationCode="
				+ organisationCode + ", paymentMethod=" + paymentMethod
				+ ", processed=" + processed + ", purchaserEmail="
				+ purchaserEmail + ", purchaserFaxNo=" + purchaserFaxNo
				+ ", purchaserFirstName=" + purchaserFirstName
				+ ", purchaserInitials=" + purchaserInitials
				+ ", purchaserMobileNo=" + purchaserMobileNo
				+ ", purchaserSurname=" + purchaserSurname
				+ ", purchaserTelNo=" + purchaserTelNo + ", purchaserTitle="
				+ purchaserTitle + ", purchaserWorkPhone=" + purchaserWorkPhone
				+ ", receivedDate=" + receivedDate + ", recordType="
				+ recordType + ", registrationNumber=" + registrationNumber
				+ ", rowInsertDate=" + rowInsertDate + ", rvcTradeSaleId="
				+ rvcTradeSaleId + ", soldDate=" + soldDate
				+ ", soldHandbackLocationId=" + soldHandbackLocationId
				+ ", soldValue=" + soldValue + ", stockId=" + stockId
				+ ", vehiclesSoldId=" + vehiclesSoldId + "]";
	}

	public VrmDeliveryTypeBean getVrmDeliveryTypeBean() {
		return vrmDeliveryTypeBean;
	}

	public void setVrmDeliveryTypeBean(VrmDeliveryTypeBean vrmDeliveryTypeBean) {
		this.vrmDeliveryTypeBean = vrmDeliveryTypeBean;
	}
}