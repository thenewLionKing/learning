package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.util.Date;

public class LeaseVehicleModelBean implements Serializable{
	
	private static final long serialVersionUID = -3967426420341078434L;

	private Integer leaseVehicleId;
	private Short abiGroupId;
	private Integer capBaseDerivative;
	private String capBaseDerivativeCode;
	private Integer capBaseModel;
	private String capVehicleCode;
	private String capVehicleCodeType;
	private Integer _capVehicleId__;
	private Integer categoryId;
	private Boolean convertibleInd;
	private Date endDate;
	private String excludeFromHarlowIndicator;
	private Integer glassModelId;
	private Integer glassQualifiedModelAssoc;
	private String glassVehicleDesc;
	private Integer greenestCarInd;
	private String insertUser;
	private String isHp;
	private String leaseVehicleDesc;
	private Short manufacturerId;
	private String mflVehicleCode;
	private String mflVehicleTypeNumber;
	private String modelNotAvailableIndicator;
	private String modelYear;
	private Integer originalManufacturerId;
	private Boolean removableBodyPanelsInd;
	private Boolean spareWheelLockProvidedInd;
	private Boolean spareWheelNotProvidedAsStandardInd;
	private Boolean spareWheelProvidedByMoInd;
	private Date startDate;
	private Date timestamp;
	private Boolean trackerFittedInd;
	private Boolean usedInd;
	private String vehicleOptionsDesc;
	private String vmsExportedIndicator;

	private ModelCodeBean modelCodebean;

	public LeaseVehicleModelBean() {
	}

	public Integer getLeaseVehicleId() {
		return leaseVehicleId;
	}

	public void setLeaseVehicleId(Integer leaseVehicleId) {
		this.leaseVehicleId = leaseVehicleId;
	}

	public Short getAbiGroupId() {
		return abiGroupId;
	}

	public void setAbiGroupId(Short abiGroupId) {
		this.abiGroupId = abiGroupId;
	}

	public Integer getCapBaseDerivative() {
		return capBaseDerivative;
	}

	public void setCapBaseDerivative(Integer capBaseDerivative) {
		this.capBaseDerivative = capBaseDerivative;
	}

	public String getCapBaseDerivativeCode() {
		return capBaseDerivativeCode;
	}

	public void setCapBaseDerivativeCode(String capBaseDerivativeCode) {
		this.capBaseDerivativeCode = capBaseDerivativeCode;
	}

	public Integer getCapBaseModel() {
		return capBaseModel;
	}

	public void setCapBaseModel(Integer capBaseModel) {
		this.capBaseModel = capBaseModel;
	}

	public String getCapVehicleCode() {
		return capVehicleCode;
	}

	public void setCapVehicleCode(String capVehicleCode) {
		this.capVehicleCode = capVehicleCode;
	}

	public String getCapVehicleCodeType() {
		return capVehicleCodeType;
	}

	public void setCapVehicleCodeType(String capVehicleCodeType) {
		this.capVehicleCodeType = capVehicleCodeType;
	}

	public Integer get_capVehicleId__() {
		return _capVehicleId__;
	}

	public void set_capVehicleId__(Integer _capVehicleId__) {
		this._capVehicleId__ = _capVehicleId__;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Boolean isConvertibleInd() {
		return convertibleInd;
	}

	public void setConvertibleInd(Boolean convertibleInd) {
		this.convertibleInd = convertibleInd;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getExcludeFromHarlowIndicator() {
		return excludeFromHarlowIndicator;
	}

	public void setExcludeFromHarlowIndicator(String excludeFromHarlowIndicator) {
		this.excludeFromHarlowIndicator = excludeFromHarlowIndicator;
	}

	public Integer getGlassModelId() {
		return glassModelId;
	}

	public void setGlassModelId(Integer glassModelId) {
		this.glassModelId = glassModelId;
	}

	public Integer getGlassQualifiedModelAssoc() {
		return glassQualifiedModelAssoc;
	}

	public void setGlassQualifiedModelAssoc(Integer glassQualifiedModelAssoc) {
		this.glassQualifiedModelAssoc = glassQualifiedModelAssoc;
	}

	public String getGlassVehicleDesc() {
		return glassVehicleDesc;
	}

	public void setGlassVehicleDesc(String glassVehicleDesc) {
		this.glassVehicleDesc = glassVehicleDesc;
	}

	public Integer getGreenestCarInd() {
		return greenestCarInd;
	}

	public void setGreenestCarInd(Integer greenestCarInd) {
		this.greenestCarInd = greenestCarInd;
	}

	public String getInsertUser() {
		return insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}

	public String getIsHp() {
		return isHp;
	}

	public void setIsHp(String isHp) {
		this.isHp = isHp;
	}

	public String getLeaseVehicleDesc() {
		return leaseVehicleDesc;
	}

	public void setLeaseVehicleDesc(String leaseVehicleDesc) {
		this.leaseVehicleDesc = leaseVehicleDesc;
	}

	public Short getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(Short manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getMflVehicleCode() {
		return mflVehicleCode;
	}

	public void setMflVehicleCode(String mflVehicleCode) {
		this.mflVehicleCode = mflVehicleCode;
	}

	public String getMflVehicleTypeNumber() {
		return mflVehicleTypeNumber;
	}

	public void setMflVehicleTypeNumber(String mflVehicleTypeNumber) {
		this.mflVehicleTypeNumber = mflVehicleTypeNumber;
	}

	public String getModelNotAvailableIndicator() {
		return modelNotAvailableIndicator;
	}

	public void setModelNotAvailableIndicator(String modelNotAvailableIndicator) {
		this.modelNotAvailableIndicator = modelNotAvailableIndicator;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public Integer getOriginalManufacturerId() {
		return originalManufacturerId;
	}

	public void setOriginalManufacturerId(Integer originalManufacturerId) {
		this.originalManufacturerId = originalManufacturerId;
	}

	public Boolean isRemovableBodyPanelsInd() {
		return removableBodyPanelsInd;
	}

	public void setRemovableBodyPanelsInd(Boolean removableBodyPanelsInd) {
		this.removableBodyPanelsInd = removableBodyPanelsInd;
	}

	public Boolean isSpareWheelLockProvidedInd() {
		return spareWheelLockProvidedInd;
	}

	public void setSpareWheelLockProvidedInd(Boolean spareWheelLockProvidedInd) {
		this.spareWheelLockProvidedInd = spareWheelLockProvidedInd;
	}

	public Boolean isSpareWheelNotProvidedAsStandardInd() {
		return spareWheelNotProvidedAsStandardInd;
	}

	public void setSpareWheelNotProvidedAsStandardInd(
			Boolean spareWheelNotProvidedAsStandardInd) {
		this.spareWheelNotProvidedAsStandardInd = spareWheelNotProvidedAsStandardInd;
	}

	public Boolean isSpareWheelProvidedByMoInd() {
		return spareWheelProvidedByMoInd;
	}

	public void setSpareWheelProvidedByMoInd(Boolean spareWheelProvidedByMoInd) {
		this.spareWheelProvidedByMoInd = spareWheelProvidedByMoInd;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Boolean isTrackerFittedInd() {
		return trackerFittedInd;
	}

	public void setTrackerFittedInd(Boolean trackerFittedInd) {
		this.trackerFittedInd = trackerFittedInd;
	}

	public Boolean isUsedInd() {
		return usedInd;
	}

	public void setUsedInd(Boolean usedInd) {
		this.usedInd = usedInd;
	}

	public String getVehicleOptionsDesc() {
		return vehicleOptionsDesc;
	}

	public void setVehicleOptionsDesc(String vehicleOptionsDesc) {
		this.vehicleOptionsDesc = vehicleOptionsDesc;
	}

	public String getVmsExportedIndicator() {
		return vmsExportedIndicator;
	}

	public void setVmsExportedIndicator(String vmsExportedIndicator) {
		this.vmsExportedIndicator = vmsExportedIndicator;
	}

	public void setModelCodeBean(ModelCodeBean modelCodebean) {
		this.modelCodebean = modelCodebean;
	}
	
	public ModelCodeBean getModelCodeBean(){
		return this.modelCodebean;
	}
}