package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class VehicleBean implements Serializable {

	private static final long serialVersionUID = -8371431189976192147L;
	private Integer assetNumber;
	private String adapted;
	private Integer agreementStatus;
	private Short badgedCompany;
	private String carRegistrationNumber;
	private String comments;
	private Date contractStartDate;
	private String contractType;
	private String controllerId;
	private String customerNumber;
	private Date firstRegDate;
	private String fleetnetEdiCode;
	private Short freeServiceDistance;
	private Short freeServicePeriod;
	private Boolean heavyAccidentDamage;
	private String highMileageIndicator;
	private Integer icmeModelCode;
	private Boolean ineligible;
	private Integer ineligibleReasonId;
	private Short initialServiceDistance;
	private String initialServiceFree;
	private Short initialServicePeriod;
	private BigDecimal maintenanceBudget;
	private BigDecimal maintenanceCostTotal;
	private Integer odometerReplReading;
	private String refAllIndicator;
	private BigDecimal referralValue;
	private Date replacementDate;
	private Integer replacementMileage;
	private Date repurchaseDate;
	private String specialInformation;
	private Short standardServiceDistance;
	private Short standardServicePeriod;
	private Integer stockId;
	private Integer suspended;
//	private Timestamp timestamp;
	private Integer transleaseLeasecoRef;
	private String transmissionAction;
	private Short vehicleBandRating;
	private String vehicleColour;
	private String vinNumber;
	private Short warrantyDistance;
	private Date warrantyExpiryDate;
	private List<AgreementAdaptationBean> agreementAdaptation = new ArrayList<AgreementAdaptationBean>(0);
	private VrmStockBean vrmStockBean;
	private ProfilesBean profilesBean;
	private List<VrmBvReturnBean> vrmBvReturn = new ArrayList<VrmBvReturnBean>(0);
	private ModelDescriptionBean modelDescriptionBean;
	private VehicleColourBean vehicleColourBean;

	public VehicleBean() {
	}

	public Integer getAssetNumber() {
		return assetNumber;
	}

	public void setAssetNumber(Integer assetNumber) {
		this.assetNumber = assetNumber;
	}

	public String getAdapted() {
		return adapted;
	}

	public void setAdapted(String adapted) {
		this.adapted = adapted;
	}

	public Integer getAgreementStatus() {
		return agreementStatus;
	}

	public void setAgreementStatus(Integer agreementStatus) {
		this.agreementStatus = agreementStatus;
	}

	public Short getBadgedCompany() {
		return badgedCompany;
	}

	public void setBadgedCompany(Short badgedCompany) {
		this.badgedCompany = badgedCompany;
	}

	public String getCarRegistrationNumber() {
		return carRegistrationNumber;
	}

	public void setCarRegistrationNumber(String carRegistrationNumber) {
		this.carRegistrationNumber = carRegistrationNumber;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getContractStartDate() {
		return contractStartDate;
	}

	public void setContractStartDate(Date contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getControllerId() {
		return controllerId;
	}

	public void setControllerId(String controllerId) {
		this.controllerId = controllerId;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public Date getFirstRegDate() {
		return firstRegDate;
	}

	public void setFirstRegDate(Date firstRegDate) {
		this.firstRegDate = firstRegDate;
	}

	public String getFleetnetEdiCode() {
		return fleetnetEdiCode;
	}

	public void setFleetnetEdiCode(String fleetnetEdiCode) {
		this.fleetnetEdiCode = fleetnetEdiCode;
	}

	public Short getFreeServiceDistance() {
		return freeServiceDistance;
	}

	public void setFreeServiceDistance(Short freeServiceDistance) {
		this.freeServiceDistance = freeServiceDistance;
	}

	public Short getFreeServicePeriod() {
		return freeServicePeriod;
	}

	public void setFreeServicePeriod(Short freeServicePeriod) {
		this.freeServicePeriod = freeServicePeriod;
	}

	public Boolean isHeavyAccidentDamage() {
		return heavyAccidentDamage;
	}

	public void setHeavyAccidentDamage(Boolean heavyAccidentDamage) {
		this.heavyAccidentDamage = heavyAccidentDamage;
	}

	public String getHighMileageIndicator() {
		return highMileageIndicator;
	}

	public void setHighMileageIndicator(String highMileageIndicator) {
		this.highMileageIndicator = highMileageIndicator;
	}

	public Integer getIcmeModelCode() {
		return icmeModelCode;
	}

	public void setIcmeModelCode(Integer icmeModelCode) {
		this.icmeModelCode = icmeModelCode;
	}

	public Boolean isIneligible() {
		return ineligible;
	}

	public void setIneligible(Boolean ineligible) {
		this.ineligible = ineligible;
	}

	public Integer getIneligibleReasonId() {
		return ineligibleReasonId;
	}

	public void setIneligibleReasonId(Integer ineligibleReasonId) {
		this.ineligibleReasonId = ineligibleReasonId;
	}

	public Short getInitialServiceDistance() {
		return initialServiceDistance;
	}

	public void setInitialServiceDistance(Short initialServiceDistance) {
		this.initialServiceDistance = initialServiceDistance;
	}

	public String getInitialServiceFree() {
		return initialServiceFree;
	}

	public void setInitialServiceFree(String initialServiceFree) {
		this.initialServiceFree = initialServiceFree;
	}

	public Short getInitialServicePeriod() {
		return initialServicePeriod;
	}

	public void setInitialServicePeriod(Short initialServicePeriod) {
		this.initialServicePeriod = initialServicePeriod;
	}

	public BigDecimal getMaintenanceBudget() {
		return maintenanceBudget;
	}

	public void setMaintenanceBudget(BigDecimal maintenanceBudget) {
		this.maintenanceBudget = maintenanceBudget;
	}

	public BigDecimal getMaintenanceCostTotal() {
		return maintenanceCostTotal;
	}

	public void setMaintenanceCostTotal(BigDecimal maintenanceCostTotal) {
		this.maintenanceCostTotal = maintenanceCostTotal;
	}

	public Integer getOdometerReplReading() {
		return odometerReplReading;
	}

	public void setOdometerReplReading(Integer odometerReplReading) {
		this.odometerReplReading = odometerReplReading;
	}

	public String getRefAllIndicator() {
		return refAllIndicator;
	}

	public void setRefAllIndicator(String refAllIndicator) {
		this.refAllIndicator = refAllIndicator;
	}

	public BigDecimal getReferralValue() {
		return referralValue;
	}

	public void setReferralValue(BigDecimal referralValue) {
		this.referralValue = referralValue;
	}

	public Date getReplacementDate() {
		return replacementDate;
	}

	public void setReplacementDate(Date replacementDate) {
		this.replacementDate = replacementDate;
	}

	public Integer getReplacementMileage() {
		return replacementMileage;
	}

	public void setReplacementMileage(Integer replacementMileage) {
		this.replacementMileage = replacementMileage;
	}

	public Date getRepurchaseDate() {
		return repurchaseDate;
	}

	public void setRepurchaseDate(Date repurchaseDate) {
		this.repurchaseDate = repurchaseDate;
	}

	public String getSpecialInformation() {
		return specialInformation;
	}

	public void setSpecialInformation(String specialInformation) {
		this.specialInformation = specialInformation;
	}

	public Short getStandardServiceDistance() {
		return standardServiceDistance;
	}

	public void setStandardServiceDistance(Short standardServiceDistance) {
		this.standardServiceDistance = standardServiceDistance;
	}

	public Short getStandardServicePeriod() {
		return standardServicePeriod;
	}

	public void setStandardServicePeriod(Short standardServicePeriod) {
		this.standardServicePeriod = standardServicePeriod;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public Integer getSuspended() {
		return suspended;
	}

	public void setSuspended(Integer suspended) {
		this.suspended = suspended;
	}

/*	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
*/
	public Integer getTransleaseLeasecoRef() {
		return transleaseLeasecoRef;
	}

	public void setTransleaseLeasecoRef(Integer transleaseLeasecoRef) {
		this.transleaseLeasecoRef = transleaseLeasecoRef;
	}

	public String getTransmissionAction() {
		return transmissionAction;
	}

	public void setTransmissionAction(String transmissionAction) {
		this.transmissionAction = transmissionAction;
	}

	public Short getVehicleBandRating() {
		return vehicleBandRating;
	}

	public void setVehicleBandRating(Short vehicleBandRating) {
		this.vehicleBandRating = vehicleBandRating;
	}

	public String getVehicleColour() {
		return vehicleColour;
	}

	public void setVehicleColour(String vehicleColour) {
		this.vehicleColour = vehicleColour;
	}

	public String getVinNumber() {
		return vinNumber;
	}

	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}

	public Short getWarrantyDistance() {
		return warrantyDistance;
	}

	public void setWarrantyDistance(Short warrantyDistance) {
		this.warrantyDistance = warrantyDistance;
	}

	public Date getWarrantyExpiryDate() {
		return warrantyExpiryDate;
	}

	public void setWarrantyExpiryDate(Date warrantyExpiryDate) {
		this.warrantyExpiryDate = warrantyExpiryDate;
	}

	public void setAgreementAdaptationBean(List<AgreementAdaptationBean> agreementAdaptation) {
		this.agreementAdaptation = agreementAdaptation;
	}

	public List<AgreementAdaptationBean> getAgreementAdaptationBean() {
		return agreementAdaptation;
	}
	
	public VrmStockBean getVrmStockBean() {
		return this.vrmStockBean;
	}

	public void setVrmStockBean(VrmStockBean vrmStockBean) {
		this.vrmStockBean = vrmStockBean;
	}
	
	public void setProfilesBean(ProfilesBean profilesBean) {
		this.profilesBean = profilesBean;
	}

	public ProfilesBean getProfilesBean() {
		return this.profilesBean;
	}

	public List<VrmBvReturnBean> getVrmBvReturn() {
		return vrmBvReturn;
	}

	public void setVrmBvReturn(List<VrmBvReturnBean> vrmBvReturn) {
		this.vrmBvReturn = vrmBvReturn;
	}

	public void setModelDescription(ModelDescriptionBean modelDescriptionBean) {
		this.setModelDescriptionBean(modelDescriptionBean);
	}

	public ModelDescriptionBean getModelDescriptionBean() {
		return this.modelDescriptionBean;
	}

	public void setModelDescriptionBean(ModelDescriptionBean modelDescriptionBean) {
		this.modelDescriptionBean = modelDescriptionBean;
	}

	public VehicleColourBean getVehicleColourBean() {
		return vehicleColourBean;
	}

	public void setVehicleColourBean(VehicleColourBean vehicleColourBean) {
		this.vehicleColourBean = vehicleColourBean;
	}
}