package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.LeaseVehicleModelBean;


/**
 * The persistent class for the lease_vehicle_models database table.
 * 
 */
@Entity
@Table(name="lease_vehicle_models")
public class LeaseVehicleModelEntity implements Serializable {

	private static final long serialVersionUID = -4818273597245174531L;

	private LeaseVehicleModelBean leaseVehicleModelBean = new LeaseVehicleModelBean();
	private ModelCodeEntity modelCodeEntity;

	public LeaseVehicleModelEntity() {
    }

	@Transient
	public LeaseVehicleModelBean getLeaseVehicleModelBean() {
		return leaseVehicleModelBean;
	}

	public void setLeaseVehicleModelBean(LeaseVehicleModelBean leaseVehicleModelBean) {
		this.leaseVehicleModelBean = leaseVehicleModelBean;
	}
	
	@Id
	@Column(name="lease_vehicle_id", unique=true, nullable=false)
	public Integer getLeaseVehicleId() {
		return this.getLeaseVehicleModelBean().getLeaseVehicleId();
	}

	public void setLeaseVehicleId(Integer leaseVehicleId) {
		this.getLeaseVehicleModelBean().setLeaseVehicleId(leaseVehicleId);
	}


	@Column(name="abi_group_id",columnDefinition="TINYINT")
	public Short getAbiGroupId() {
		return this.getLeaseVehicleModelBean().getAbiGroupId();
	}

	public void setAbiGroupId(Short abiGroupId) {
		this.getLeaseVehicleModelBean().setAbiGroupId(abiGroupId);
	}


	@Column(name="cap_base_derivative")
	public Integer getCapBaseDerivative() {
		return this.getLeaseVehicleModelBean().getCapBaseDerivative();
	}

	public void setCapBaseDerivative(Integer capBaseDerivative) {
		this.getLeaseVehicleModelBean().setCapBaseDerivative(capBaseDerivative);
	}


	@Column(name="cap_base_derivative_code", length=20, columnDefinition="CHAR")
	public String getCapBaseDerivativeCode() {
		return this.getLeaseVehicleModelBean().getCapBaseDerivativeCode();
	}

	public void setCapBaseDerivativeCode(String capBaseDerivativeCode) {
		this.getLeaseVehicleModelBean().setCapBaseDerivativeCode(capBaseDerivativeCode);
	}


	@Column(name="cap_base_model")
	public Integer getCapBaseModel() {
		return this.getLeaseVehicleModelBean().getCapBaseModel();
	}

	public void setCapBaseModel(Integer capBaseModel) {
		this.getLeaseVehicleModelBean().setCapBaseModel(capBaseModel);
	}


	@Column(name="cap_vehicle_code", length=20, columnDefinition="CHAR")
	public String getCapVehicleCode() {
		return this.getLeaseVehicleModelBean().getCapVehicleCode();
	}

	public void setCapVehicleCode(String capVehicleCode) {
		this.getLeaseVehicleModelBean().setCapVehicleCode(capVehicleCode);
	}


	@Column(name="cap_vehicle_code_type", length=1, columnDefinition="CHAR")
	public String getCapVehicleCodeType() {
		return this.getLeaseVehicleModelBean().getCapVehicleCodeType();
	}

	public void setCapVehicleCodeType(String capVehicleCodeType) {
		this.getLeaseVehicleModelBean().setCapVehicleCodeType(capVehicleCodeType);
	}


	@Column(name="cap_vehicle_id ")
	public Integer get_capVehicleId__() {
		return this.getLeaseVehicleModelBean().get_capVehicleId__();
	}

	public void set_capVehicleId__(Integer _capVehicleId__) {
		this.getLeaseVehicleModelBean().set_capVehicleId__(_capVehicleId__);
	}


	@Column(name="category_id")
	public Integer getCategoryId() {
		return this.getLeaseVehicleModelBean().getCategoryId();
	}

	public void setCategoryId(Integer categoryId) {
		this.getLeaseVehicleModelBean().setCategoryId(categoryId);
	}


	@Column(name="convertible_ind", nullable=false)
	public Boolean getConvertibleInd() {
		return this.getLeaseVehicleModelBean().isConvertibleInd();
	}

	public void setConvertibleInd(Boolean convertibleInd) {
		this.getLeaseVehicleModelBean().setConvertibleInd(convertibleInd);
	}


	@Column(name="end_date")
	public Date getEndDate() {
		return this.getLeaseVehicleModelBean().getEndDate();
	}

	public void setEndDate(Date endDate) {
		this.getLeaseVehicleModelBean().setEndDate(endDate);
	}


	@Column(name="exclude_from_harlow_indicator", length=1, columnDefinition="CHAR")
	public String getExcludeFromHarlowIndicator() {
		return this.getLeaseVehicleModelBean().getExcludeFromHarlowIndicator();
	}

	public void setExcludeFromHarlowIndicator(String excludeFromHarlowIndicator) {
		this.getLeaseVehicleModelBean().setExcludeFromHarlowIndicator(excludeFromHarlowIndicator);
	}


	@Column(name="glass_model_id", insertable=false, updatable=false)
	public Integer getGlassModelId() {
		return this.getLeaseVehicleModelBean().getGlassModelId();
	}

	public void setGlassModelId(Integer glassModelId) {
		this.getLeaseVehicleModelBean().setGlassModelId(glassModelId);
	}


	@Column(name="glass_qualified_model_assoc")
	public Integer getGlassQualifiedModelAssoc() {
		return this.getLeaseVehicleModelBean().getGlassQualifiedModelAssoc();
	}

	public void setGlassQualifiedModelAssoc(Integer glassQualifiedModelAssoc) {
		this.getLeaseVehicleModelBean().setGlassQualifiedModelAssoc(glassQualifiedModelAssoc);
	}


	@Column(name="glass_vehicle_desc", length=255)
	public String getGlassVehicleDesc() {
		return this.getLeaseVehicleModelBean().getGlassVehicleDesc();
	}

	public void setGlassVehicleDesc(String glassVehicleDesc) {
		this.getLeaseVehicleModelBean().setGlassVehicleDesc(glassVehicleDesc);
	}


	@Column(name="greenest_car_ind")
	public Integer getGreenestCarInd() {
		return this.getLeaseVehicleModelBean().getGreenestCarInd();
	}

	public void setGreenestCarInd(Integer greenestCarInd) {
		this.getLeaseVehicleModelBean().setGreenestCarInd(greenestCarInd);
	}

	@Column(name="insert_user", length=50)
	public String getInsertUser() {
		return this.getLeaseVehicleModelBean().getInsertUser();
	}

	public void setInsertUser(String insertUser) {
		this.getLeaseVehicleModelBean().setInsertUser(insertUser);
	}


	@Column(name="is_hp", length=1, columnDefinition="CHAR")
	public String getIsHp() {
		return this.getLeaseVehicleModelBean().getIsHp();
	}

	public void setIsHp(String isHp) {
		this.getLeaseVehicleModelBean().setIsHp(isHp);
	}


	@Column(name="lease_vehicle_desc", length=255)
	public String getLeaseVehicleDesc() {
		return this.getLeaseVehicleModelBean().getLeaseVehicleDesc();
	}

	public void setLeaseVehicleDesc(String leaseVehicleDesc) {
		this.getLeaseVehicleModelBean().setLeaseVehicleDesc(leaseVehicleDesc);
	}


	@Column(name="manufacturer_id", columnDefinition="SMALLINT")
	public Short getManufacturerId() {
		return this.getLeaseVehicleModelBean().getManufacturerId();
	}

	public void setManufacturerId(Short manufacturerId) {
		this.getLeaseVehicleModelBean().setManufacturerId(manufacturerId);
	}


	@Column(name="mfl_vehicle_code", length=30)
	public String getMflVehicleCode() {
		return this.getLeaseVehicleModelBean().getMflVehicleCode();
	}

	public void setMflVehicleCode(String mflVehicleCode) {
		this.getLeaseVehicleModelBean().setMflVehicleCode(mflVehicleCode);
	}


	@Column(name="mfl_vehicle_type_number", length=6,columnDefinition="CHAR")
	public String getMflVehicleTypeNumber() {
		return this.getLeaseVehicleModelBean().getMflVehicleTypeNumber();
	}

	public void setMflVehicleTypeNumber(String mflVehicleTypeNumber) {
		this.getLeaseVehicleModelBean().setMflVehicleTypeNumber(mflVehicleTypeNumber);
	}


	@Column(name="model_not_available_indicator", length=1, columnDefinition="CHAR")
	public String getModelNotAvailableIndicator() {
		return this.getLeaseVehicleModelBean().getModelNotAvailableIndicator();
	}

	public void setModelNotAvailableIndicator(String modelNotAvailableIndicator) {
		this.getLeaseVehicleModelBean().setModelNotAvailableIndicator(modelNotAvailableIndicator);
	}


	@Column(name="model_year", length=20)
	public String getModelYear() {
		return this.getLeaseVehicleModelBean().getModelYear();
	}

	public void setModelYear(String modelYear) {
		this.getLeaseVehicleModelBean().setModelYear(modelYear);
	}


	@Column(name="original_manufacturer_id")
	public Integer getOriginalManufacturerId() {
		return this.getLeaseVehicleModelBean().getOriginalManufacturerId();
	}

	public void setOriginalManufacturerId(Integer originalManufacturerId) {
		this.getLeaseVehicleModelBean().setOriginalManufacturerId(originalManufacturerId);
	}


	@Column(name="removable_body_panels_ind", nullable=false)
	public Boolean getRemovableBodyPanelsInd() {
		return this.getLeaseVehicleModelBean().isRemovableBodyPanelsInd();
	}

	public void setRemovableBodyPanelsInd(Boolean removableBodyPanelsInd) {
		this.getLeaseVehicleModelBean().setRemovableBodyPanelsInd(removableBodyPanelsInd);
	}


	@Column(name="spare_wheel_lock_provided_ind", nullable=false)
	public Boolean getSpareWheelLockProvidedInd() {
		return this.getLeaseVehicleModelBean().isSpareWheelLockProvidedInd();
	}

	public void setSpareWheelLockProvidedInd(Boolean spareWheelLockProvidedInd) {
		this.getLeaseVehicleModelBean().setSpareWheelLockProvidedInd(spareWheelLockProvidedInd);
	}


	@Column(name="spare_wheel_not_provided_as_standard_ind", nullable=false)
	public Boolean getSpareWheelNotProvidedAsStandardInd() {
		return this.getLeaseVehicleModelBean().isSpareWheelNotProvidedAsStandardInd();
	}

	public void setSpareWheelNotProvidedAsStandardInd(Boolean spareWheelNotProvidedAsStandardInd) {
		this.getLeaseVehicleModelBean()
				.setSpareWheelNotProvidedAsStandardInd(spareWheelNotProvidedAsStandardInd);
	}


	@Column(name="spare_wheel_provided_by_mo_ind", nullable=false)
	public Boolean getSpareWheelProvidedByMoInd() {
		return this.getLeaseVehicleModelBean().isSpareWheelProvidedByMoInd();
	}

	public void setSpareWheelProvidedByMoInd(Boolean spareWheelProvidedByMoInd) {
		this.getLeaseVehicleModelBean().setSpareWheelProvidedByMoInd(spareWheelProvidedByMoInd);
	}


	@Column(name="start_date", nullable=false)
	public Date getStartDate() {
		return this.getLeaseVehicleModelBean().getStartDate();
	}

	public void setStartDate(Date startDate) {
		this.getLeaseVehicleModelBean().setStartDate(startDate);
	}

	@Column(name="tracker_fitted_ind", nullable=false)
	public Boolean getTrackerFittedInd() {
		return this.getLeaseVehicleModelBean().isTrackerFittedInd();
	}

	public void setTrackerFittedInd(Boolean trackerFittedInd) {
		this.getLeaseVehicleModelBean().setTrackerFittedInd(trackerFittedInd);
	}

	@Column(name="used_ind")
	public Boolean getUsedInd() {
		return this.getLeaseVehicleModelBean().isUsedInd();
	}

	public void setUsedInd(Boolean usedInd) {
		this.getLeaseVehicleModelBean().setUsedInd(usedInd);
	}


	@Column(name="vehicle_options_desc", length=255)
	public String getVehicleOptionsDesc() {
		return this.getLeaseVehicleModelBean().getVehicleOptionsDesc();
	}

	public void setVehicleOptionsDesc(String vehicleOptionsDesc) {
		this.getLeaseVehicleModelBean().setVehicleOptionsDesc(vehicleOptionsDesc);
	}


	@Column(name="vms_exported_indicator", nullable=false, length=1, columnDefinition="CHAR")
	public String getVmsExportedIndicator() {
		return this.getLeaseVehicleModelBean().getVmsExportedIndicator();
	}

	public void setVmsExportedIndicator(String vmsExportedIndicator) {
		this.getLeaseVehicleModelBean().setVmsExportedIndicator(vmsExportedIndicator);
	}

	@OneToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="glass_model_id", referencedColumnName="model_id")
	public ModelCodeEntity getModelCodeEntity() {
		return this.modelCodeEntity;
	}
	public void setModelCodeEntity(ModelCodeEntity modelCodeEntity) {
		this.modelCodeEntity = modelCodeEntity;
	}
}