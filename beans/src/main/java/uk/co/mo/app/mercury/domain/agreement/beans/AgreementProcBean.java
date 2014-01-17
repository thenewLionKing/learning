package uk.co.mo.app.mercury.domain.agreement.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class AgreementProcBean implements Serializable {

	private static final long serialVersionUID = -7948448618216428250L;

	private String arn;
	private Date endDate;
	private Date startDate;
	private String status; //--New, Eligibility, Pending, Insurance, Handover, Live, Expired, Terminated, Defaulted, Returned, Pre-Live
	private String type;  // --CL, FL, HP, JL, OC, OJ, OL
	private String deliveryDateType; //-- EDD, CDD, ADD
	private String supplyingDealerRef_IdentifierType_PrimaryKey;
	private String supplyingDealerRef_IdentifierType_BusinessKey;
	private String terminationType_Code;
	private String terminationType_CodeDescription;
	private String vehicle_Registration;
	private String vehicle_Description;
	private String vehicle_AfterSalesDealerRef_IdentifierType_PrimaryKey;
	private String vehicle_AfterSalesDealerRef_IdentifierType_BusinessKey;
	private String vehicle_HandbackDealerRef_IdentifierType_PrimaryKey;
	private String vehicle_HandbackDealerRef_IdentifierType_BusinessKey;
	private String vehicleModelType_MakeCode;
	private String vehicleModelType_MakeDesc;
	private String vehicleModelType_ModelCode;
	private String vehicleModelType_ModelDesc;
	private String vehicleModelType_TransmissionCode;
	private String vehicleModelType_TransmissionDesc;
	private String eoEReasonForLeaving;
	private String eoCCarPurchase;
	private Integer customerRecordId;
	private Integer jointCustomerRecordId;
	private Integer appointeeRecordId;
	private Integer jointAppointeeRecordId;
	private Integer customerId;
	private Integer jointCustomerId;
	private Integer appointeeId;
	private Integer jointAppointeeId;
	private Integer sequenceNumber;
	private Integer agreementRecordId;
	private String recommenderRef_IdentifierType_PrimaryKey;
	private String vehicle_CurrentLocation;
	private Date recordDate;
	private Integer agreementId;
	private Integer leaseVehicleId;
	private String bonusLevel;
	private String goodConditionStatus;
	private String grantFund;
	private String grantTotalAmount;
	private List <GrantItemBean> grantItemBean;
	private Date applicationSubmitDate;
	private String auditId;
	private String sapCode;
	
	
	public String getArn() {
		return arn;
	}
	public void setArn(String arn) {
		this.arn = arn;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDeliveryDateType() {
		return deliveryDateType;
	}
	public void setDeliveryDateType(String deliveryDateType) {
		this.deliveryDateType = deliveryDateType;
	}
	public String getSupplyingDealerRef_IdentifierType_PrimaryKey() {
		return supplyingDealerRef_IdentifierType_PrimaryKey;
	}
	public void setSupplyingDealerRef_IdentifierType_PrimaryKey(
			String supplyingDealerRef_IdentifierType_PrimaryKey) {
		this.supplyingDealerRef_IdentifierType_PrimaryKey = supplyingDealerRef_IdentifierType_PrimaryKey;
	}
	public String getSupplyingDealerRef_IdentifierType_BusinessKey() {
		return supplyingDealerRef_IdentifierType_BusinessKey;
	}
	public void setSupplyingDealerRef_IdentifierType_BusinessKey(
			String supplyingDealerRef_IdentifierType_BusinessKey) {
		this.supplyingDealerRef_IdentifierType_BusinessKey = supplyingDealerRef_IdentifierType_BusinessKey;
	}
	public String getTerminationType_Code() {
		return terminationType_Code;
	}
	public void setTerminationType_Code(String terminationType_Code) {
		this.terminationType_Code = terminationType_Code;
	}
	public String getTerminationType_CodeDescription() {
		return terminationType_CodeDescription;
	}
	public void setTerminationType_CodeDescription(
			String terminationType_CodeDescription) {
		this.terminationType_CodeDescription = terminationType_CodeDescription;
	}
	public String getVehicle_Registration() {
		return vehicle_Registration;
	}
	public void setVehicle_Registration(String vehicle_Registration) {
		this.vehicle_Registration = vehicle_Registration;
	}
	public String getVehicle_Description() {
		return vehicle_Description;
	}
	public void setVehicle_Description(String vehicle_Description) {
		this.vehicle_Description = vehicle_Description;
	}
	public String getVehicle_AfterSalesDealerRef_IdentifierType_PrimaryKey() {
		return vehicle_AfterSalesDealerRef_IdentifierType_PrimaryKey;
	}
	public void setVehicle_AfterSalesDealerRef_IdentifierType_PrimaryKey(
			String vehicle_AfterSalesDealerRef_IdentifierType_PrimaryKey) {
		this.vehicle_AfterSalesDealerRef_IdentifierType_PrimaryKey = vehicle_AfterSalesDealerRef_IdentifierType_PrimaryKey;
	}
	public String getVehicle_AfterSalesDealerRef_IdentifierType_BusinessKey() {
		return vehicle_AfterSalesDealerRef_IdentifierType_BusinessKey;
	}
	public void setVehicle_AfterSalesDealerRef_IdentifierType_BusinessKey(
			String vehicle_AfterSalesDealerRef_IdentifierType_BusinessKey) {
		this.vehicle_AfterSalesDealerRef_IdentifierType_BusinessKey = vehicle_AfterSalesDealerRef_IdentifierType_BusinessKey;
	}
	public String getVehicle_HandbackDealerRef_IdentifierType_PrimaryKey() {
		return vehicle_HandbackDealerRef_IdentifierType_PrimaryKey;
	}
	public void setVehicle_HandbackDealerRef_IdentifierType_PrimaryKey(
			String vehicle_HandbackDealerRef_IdentifierType_PrimaryKey) {
		this.vehicle_HandbackDealerRef_IdentifierType_PrimaryKey = vehicle_HandbackDealerRef_IdentifierType_PrimaryKey;
	}
	public String getVehicle_HandbackDealerRef_IdentifierType_BusinessKey() {
		return vehicle_HandbackDealerRef_IdentifierType_BusinessKey;
	}
	public void setVehicle_HandbackDealerRef_IdentifierType_BusinessKey(
			String vehicle_HandbackDealerRef_IdentifierType_BusinessKey) {
		this.vehicle_HandbackDealerRef_IdentifierType_BusinessKey = vehicle_HandbackDealerRef_IdentifierType_BusinessKey;
	}
	public String getVehicleModelType_MakeCode() {
		return vehicleModelType_MakeCode;
	}
	public void setVehicleModelType_MakeCode(String vehicleModelType_MakeCode) {
		this.vehicleModelType_MakeCode = vehicleModelType_MakeCode;
	}
	public String getVehicleModelType_MakeDesc() {
		return vehicleModelType_MakeDesc;
	}
	public void setVehicleModelType_MakeDesc(String vehicleModelType_MakeDesc) {
		this.vehicleModelType_MakeDesc = vehicleModelType_MakeDesc;
	}
	public String getVehicleModelType_ModelCode() {
		return vehicleModelType_ModelCode;
	}
	public void setVehicleModelType_ModelCode(String vehicleModelType_ModelCode) {
		this.vehicleModelType_ModelCode = vehicleModelType_ModelCode;
	}
	public String getVehicleModelType_ModelDesc() {
		return vehicleModelType_ModelDesc;
	}
	public void setVehicleModelType_ModelDesc(String vehicleModelType_ModelDesc) {
		this.vehicleModelType_ModelDesc = vehicleModelType_ModelDesc;
	}
	public String getVehicleModelType_TransmissionCode() {
		return vehicleModelType_TransmissionCode;
	}
	public void setVehicleModelType_TransmissionCode(
			String vehicleModelType_TransmissionCode) {
		this.vehicleModelType_TransmissionCode = vehicleModelType_TransmissionCode;
	}
	public String getVehicleModelType_TransmissionDesc() {
		return vehicleModelType_TransmissionDesc;
	}
	public void setVehicleModelType_TransmissionDesc(
			String vehicleModelType_TransmissionDesc) {
		this.vehicleModelType_TransmissionDesc = vehicleModelType_TransmissionDesc;
	}
	public String getEoEReasonForLeaving() {
		return eoEReasonForLeaving;
	}
	public void setEoEReasonForLeaving(String eoEReasonForLeaving) {
		this.eoEReasonForLeaving = eoEReasonForLeaving;
	}
	public String getEoCCarPurchase() {
		return eoCCarPurchase;
	}
	public void setEoCCarPurchase(String eoCCarPurchase) {
		this.eoCCarPurchase = eoCCarPurchase;
	}
	public Integer getCustomerRecordId() {
		return customerRecordId;
	}
	public void setCustomerRecordId(Integer customerRecordId) {
		this.customerRecordId = customerRecordId;
	}
	public Integer getJointCustomerRecordId() {
		return jointCustomerRecordId;
	}
	public void setJointCustomerRecordId(Integer jointCustomerRecordId) {
		this.jointCustomerRecordId = jointCustomerRecordId;
	}
	public Integer getAppointeeRecordId() {
		return appointeeRecordId;
	}
	public void setAppointeeRecordId(Integer appointeeRecordId) {
		this.appointeeRecordId = appointeeRecordId;
	}
	public Integer getJointAppointeeRecordId() {
		return jointAppointeeRecordId;
	}
	public void setJointAppointeeRecordId(Integer jointAppointeeRecordId) {
		this.jointAppointeeRecordId = jointAppointeeRecordId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getJointCustomerId() {
		return jointCustomerId;
	}
	public void setJointCustomerId(Integer jointCustomerId) {
		this.jointCustomerId = jointCustomerId;
	}
	public Integer getAppointeeId() {
		return appointeeId;
	}
	public void setAppointeeId(Integer appointeeId) {
		this.appointeeId = appointeeId;
	}
	public Integer getJointAppointeeId() {
		return jointAppointeeId;
	}
	public void setJointAppointeeId(Integer jointAppointeeId) {
		this.jointAppointeeId = jointAppointeeId;
	}
	public Integer getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public Integer getAgreementRecordId() {
		return agreementRecordId;
	}
	public void setAgreementRecordId(Integer agreementRecordId) {
		this.agreementRecordId = agreementRecordId;
	}
	public String getRecommenderRef_IdentifierType_PrimaryKey() {
		return recommenderRef_IdentifierType_PrimaryKey;
	}
	public void setRecommenderRef_IdentifierType_PrimaryKey(
			String recommenderRef_IdentifierType_PrimaryKey) {
		this.recommenderRef_IdentifierType_PrimaryKey = recommenderRef_IdentifierType_PrimaryKey;
	}
	public String getVehicle_CurrentLocation() {
		return vehicle_CurrentLocation;
	}
	public void setVehicle_CurrentLocation(String vehicle_CurrentLocation) {
		this.vehicle_CurrentLocation = vehicle_CurrentLocation;
	}
	public Date getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}
	public Integer getAgreementId() {
		return agreementId;
	}
	public void setAgreementId(Integer agreementId) {
		this.agreementId = agreementId;
	}
	public Integer getLeaseVehicleId() {
		return leaseVehicleId;
	}
	public void setLeaseVehicleId(Integer leaseVehicleId) {
		this.leaseVehicleId = leaseVehicleId;
	}
	public String getBonusLevel() {
		return bonusLevel;
	}
	public void setBonusLevel(String bonusLevel) {
		this.bonusLevel = bonusLevel;
	}
	public String getGoodConditionStatus() {
		return goodConditionStatus;
	}
	public void setGoodConditionStatus(String goodConditionStatus) {
		this.goodConditionStatus = goodConditionStatus;
	}
	public String getGrantFund() {
		return grantFund;
	}
	public void setGrantFund(String grantFund) {
		this.grantFund = grantFund;
	}
	public String getGrantTotalAmount() {
		return grantTotalAmount;
	}
	public void setGrantTotalAmount(String grantTotalAmount) {
		this.grantTotalAmount = grantTotalAmount;
	}

	public Date getApplicationSubmitDate() {
		return applicationSubmitDate;
	}
	public void setApplicationSubmitDate(Date applicationSubmitDate) {
		this.applicationSubmitDate = applicationSubmitDate;
	}
	public void setGrantItemBean(List <GrantItemBean> grantItemBean) {
		this.grantItemBean = grantItemBean;
	}
	public List <GrantItemBean> getGrantItemBean() {
		return grantItemBean;
	}
	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}
	public String getAuditId() {
		return auditId;
	}
	public void setSapCode(String sapCode) {
		this.sapCode = sapCode;
	}
	public String getSapCode() {
		return sapCode;
	}
	
}
