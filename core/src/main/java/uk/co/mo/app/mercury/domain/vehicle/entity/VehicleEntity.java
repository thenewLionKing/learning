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
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.VehicleBean;

@Entity
@Table(name="vehicle")
public class VehicleEntity implements Serializable {


	private static final long serialVersionUID = -248585881802936633L;
	private VehicleBean vehicleBean = new VehicleBean();
	private VrmStockEntity vrmStockEntity;
	private ModelDescriptionEntity modelDescriptionEntity;
	private VehicleColourEntity vehicleColourEntity;

//	private AgreementEntity agreementEntity;
	
	@Transient
	public VehicleBean getVehicleBean() {
		return vehicleBean;
	}

	public void setVehicleBean(VehicleBean vehicleBean) {
		this.vehicleBean = vehicleBean;
	}

	@Id
	@Column(name="asset_number", unique=true, nullable=false)
	public Integer getAssetNumber() {
		return this.vehicleBean.getAssetNumber();
	}

	public void setAssetNumber(Integer assetNumber) {
		this.vehicleBean.setAssetNumber(assetNumber);
	}


	@Column(length=1, columnDefinition = "CHAR")
	public String getAdapted() {
		return this.vehicleBean.getAdapted();
	}

	public void setAdapted(String adapted) {
		this.vehicleBean.setAdapted(adapted);
	}


	@Column(name="agreement_status")
	public Integer getAgreementStatus() {
		return this.vehicleBean.getAgreementStatus();
	}

	public void setAgreementStatus(Integer agreementStatus) {
		this.vehicleBean.setAgreementStatus(agreementStatus);
	}


	@Column(name="badged_company", columnDefinition = "TINYINT")
	public Short getBadgedCompany() {
		return this.vehicleBean.getBadgedCompany();
	}

	public void setBadgedCompany(Short badgedCompany) {
		this.vehicleBean.setBadgedCompany(badgedCompany);
	}


	@Column(name="car_registration_number", nullable=false, length=8, columnDefinition = "CHAR")
	public String getCarRegistrationNumber() {
		return this.vehicleBean.getCarRegistrationNumber();
	}

	public void setCarRegistrationNumber(String carRegistrationNumber) {
		this.vehicleBean.setCarRegistrationNumber(carRegistrationNumber);
	}


    @Lob()
	public String getComments() {
		return this.vehicleBean.getComments();
	}

	public void setComments(String comments) {
		this.vehicleBean.setComments(comments);
	}


	@Column(name="contract_start_date", nullable=false, columnDefinition = "SMALLDATETIME")
	public Date getContractStartDate() {
		return this.vehicleBean.getContractStartDate();
	}

	public void setContractStartDate(Date contractStartDate) {
		this.vehicleBean.setContractStartDate(contractStartDate);
	}


	@Column(name="contract_type", length=1, columnDefinition = "CHAR")
	public String getContractType() {
		return this.vehicleBean.getContractType();
	}

	public void setContractType(String contractType) {
		this.vehicleBean.setContractType(contractType);
	}


	@Column(name="controller_id", length=10, columnDefinition = "CHAR")
	public String getControllerId() {
		return this.vehicleBean.getControllerId();
	}

	public void setControllerId(String controllerId) {
		this.vehicleBean.setControllerId(controllerId);
	}


	@Column(name="customer_number", length=10, columnDefinition = "CHAR")
	public String getCustomerNumber() {
		return this.vehicleBean.getCustomerNumber();
	}

	public void setCustomerNumber(String customerNumber) {
		this.vehicleBean.setCustomerNumber(customerNumber);
	}


	@Column(name="first_reg_date", columnDefinition = "SMALLDATETIME")
	public Date getFirstRegDate() {
		return this.vehicleBean.getFirstRegDate();
	}

	public void setFirstRegDate(Date firstRegDate) {
		this.vehicleBean.setFirstRegDate(firstRegDate);
	}


	@Column(name="fleetnet_edi_code", length=8, columnDefinition = "CHAR")
	public String getFleetnetEdiCode() {
		return this.vehicleBean.getFleetnetEdiCode();
	}

	public void setFleetnetEdiCode(String fleetnetEdiCode) {
		this.vehicleBean.setFleetnetEdiCode(fleetnetEdiCode);
	}


	@Column(name="free_service_distance", columnDefinition = "TINYINT")
	public Short getFreeServiceDistance() {
		return this.vehicleBean.getFreeServiceDistance();
	}

	public void setFreeServiceDistance(Short freeServiceDistance) {
		this.vehicleBean.setFreeServiceDistance(freeServiceDistance);
	}


	@Column(name="free_service_period", columnDefinition = "TINYINT")
	public Short getFreeServicePeriod() {
		return this.vehicleBean.getFreeServicePeriod();
	}

	public void setFreeServicePeriod(Short freeServicePeriod) {
		this.vehicleBean.setFreeServicePeriod(freeServicePeriod);
	}


	@Column(name="heavy_accident_damage", columnDefinition = "BIT")
	public Boolean getHeavyAccidentDamage() {
		return this.vehicleBean.isHeavyAccidentDamage();
	}

	public void setHeavyAccidentDamage(Boolean heavyAccidentDamage) {
		this.vehicleBean.setHeavyAccidentDamage(heavyAccidentDamage);
	}


	@Column(name="high_mileage_indicator", length=1, columnDefinition = "CHAR")
	public String getHighMileageIndicator() {
		return this.vehicleBean.getHighMileageIndicator();
	}

	public void setHighMileageIndicator(String highMileageIndicator) {
		this.vehicleBean.setHighMileageIndicator(highMileageIndicator);
	}


	@Column(name="icme_model_code", nullable=false)
	public Integer getIcmeModelCode() {
		return this.vehicleBean.getIcmeModelCode();
	}

	public void setIcmeModelCode(Integer icmeModelCode) {
		this.vehicleBean.setIcmeModelCode(icmeModelCode);
	}


	@Column(nullable=false, columnDefinition = "BIT")
	public Boolean getIneligible() {
		return this.vehicleBean.isIneligible();
	}

	public void setIneligible(Boolean ineligible) {
		this.vehicleBean.setIneligible(ineligible);
	}


	@Column(name="ineligible_reason_id")
	public Integer getIneligibleReasonId() {
		return this.vehicleBean.getIneligibleReasonId();
	}

	public void setIneligibleReasonId(Integer ineligibleReasonId) {
		this.vehicleBean.setIneligibleReasonId(ineligibleReasonId);
	}


	@Column(name="initial_service_distance", nullable=false, columnDefinition = "SMALLIINT")
	public Short getInitialServiceDistance() {
		return this.vehicleBean.getInitialServiceDistance();
	}

	public void setInitialServiceDistance(Short initialServiceDistance) {
		this.vehicleBean.setInitialServiceDistance(initialServiceDistance);
	}


	@Column(name="initial_service_free", length=1, columnDefinition = "CHAR")
	public String getInitialServiceFree() {
		return this.vehicleBean.getInitialServiceFree();
	}

	public void setInitialServiceFree(String initialServiceFree) {
		this.vehicleBean.setInitialServiceFree(initialServiceFree);
	}


	@Column(name="initial_service_period", columnDefinition = "TINYINT")
	public Short getInitialServicePeriod() {
		return this.vehicleBean.getInitialServicePeriod();
	}

	public void setInitialServicePeriod(Short initialServicePeriod) {
		this.vehicleBean.setInitialServicePeriod(initialServicePeriod);
	}


	@Column(name="maintenance_budget", columnDefinition = "MONEY")
	public BigDecimal getMaintenanceBudget() {
		return this.vehicleBean.getMaintenanceBudget();
	}

	public void setMaintenanceBudget(BigDecimal maintenanceBudget) {
		this.vehicleBean.setMaintenanceBudget(maintenanceBudget);
	}


	@Column(name="maintenance_cost_total", columnDefinition = "MONEY")
	public BigDecimal getMaintenanceCostTotal() {
		return this.vehicleBean.getMaintenanceCostTotal();
	}

	public void setMaintenanceCostTotal(BigDecimal maintenanceCostTotal) {
		this.vehicleBean.setMaintenanceCostTotal(maintenanceCostTotal);
	}


	@Column(name="odometer_repl_reading")
	public Integer getOdometerReplReading() {
		return this.vehicleBean.getOdometerReplReading();
	}

	public void setOdometerReplReading(Integer odometerReplReading) {
		this.vehicleBean.setOdometerReplReading(odometerReplReading);
	}


	@Column(name="ref_all_indicator", length=1, columnDefinition = "CHAR")
	public String getRefAllIndicator() {
		return this.vehicleBean.getRefAllIndicator();
	}

	public void setRefAllIndicator(String refAllIndicator) {
		this.vehicleBean.setRefAllIndicator(refAllIndicator);
	}


	@Column(name="referral_value", precision=7, scale=2)
	public BigDecimal getReferralValue() {
		return this.vehicleBean.getReferralValue();
	}

	public void setReferralValue(BigDecimal referralValue) {
		this.vehicleBean.setReferralValue(referralValue);
	}


	@Column(name="replacement_date", columnDefinition = "SMALLDATETIME")
	public Date getReplacementDate() {
		return this.vehicleBean.getReplacementDate();
	}

	public void setReplacementDate(Date replacementDate) {
		this.vehicleBean.setReplacementDate(replacementDate);
	}


	@Column(name="replacement_mileage")
	public Integer getReplacementMileage() {
		return this.vehicleBean.getReplacementMileage();
	}

	public void setReplacementMileage(Integer replacementMileage) {
		this.vehicleBean.setReplacementMileage(replacementMileage);
	}


	@Column(name="repurchase_date", columnDefinition = "SMALLDATETIME")
	public Date getRepurchaseDate() {
		return this.vehicleBean.getRepurchaseDate();
	}

	public void setRepurchaseDate(Date repurchaseDate) {
		this.vehicleBean.setRepurchaseDate(repurchaseDate);
	}


	@Column(name="special_information", length=75)
	public String getSpecialInformation() {
		return this.vehicleBean.getSpecialInformation();
	}

	public void setSpecialInformation(String specialInformation) {
		this.vehicleBean.setSpecialInformation(specialInformation);
	}


	@Column(name="standard_service_distance", nullable=false, columnDefinition = "SMALLINT")
	public Short getStandardServiceDistance() {
		return this.vehicleBean.getStandardServiceDistance();
	}

	public void setStandardServiceDistance(Short standardServiceDistance) {
		this.vehicleBean.setStandardServiceDistance(standardServiceDistance);
	}


	@Column(name="standard_service_period", nullable=false, columnDefinition = "TINYINT")
	public Short getStandardServicePeriod() {
		return this.vehicleBean.getStandardServicePeriod();
	}

	public void setStandardServicePeriod(Short standardServicePeriod) {
		this.vehicleBean.setStandardServicePeriod(standardServicePeriod);
	}

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stock_id", unique=true, nullable=false)
	public Integer getStockId() {
		return this.vehicleBean.getStockId();
	}

	public void setStockId(Integer stockId) {
		this.vehicleBean.setStockId(stockId);
	}


	public Integer getSuspended() {
		return this.vehicleBean.getSuspended();
	}

	public void setSuspended(Integer suspended) {
		this.vehicleBean.setSuspended(suspended);
	}

/*	@Column(name="timestamp", columnDefinition = "DATETIME")
	public Timestamp getTimestamp() {
		return this.vehicleBean.getTimestamp();
	}

	public void setTimestamp(Timestamp timestamp) {
		this.vehicleBean.setTimestamp(timestamp);
	}
*/

	@Column(name="translease_leaseco_ref")
	public Integer getTransleaseLeasecoRef() {
		return this.vehicleBean.getTransleaseLeasecoRef();
	}

	public void setTransleaseLeasecoRef(Integer transleaseLeasecoRef) {
		this.vehicleBean.setTransleaseLeasecoRef(transleaseLeasecoRef);
	}


	@Column(name="transmission_action", nullable=false, length=1, columnDefinition = "CHAR")
	public String getTransmissionAction() {
		return this.vehicleBean.getTransmissionAction();
	}

	public void setTransmissionAction(String transmissionAction) {
		this.vehicleBean.setTransmissionAction(transmissionAction);
	}


	@Column(name="vehicle_band_rating", columnDefinition = "TINYINT")
	public Short getVehicleBandRating() {
		return this.vehicleBean.getVehicleBandRating();
	}

	public void setVehicleBandRating(Short vehicleBandRating) {
		this.vehicleBean.setVehicleBandRating(vehicleBandRating);
	}


	@Column(name="vehicle_colour", length=10, columnDefinition = "CHAR")
	public String getVehicleColour() {
		return this.vehicleBean.getVehicleColour();
	}

	public void setVehicleColour(String vehicleColour) {
		this.vehicleBean.setVehicleColour(vehicleColour);
	}


	@Column(name="vin_number", nullable=false, length=17, columnDefinition = "CHAR")
	public String getVinNumber() {
		return this.vehicleBean.getVinNumber();
	}

	public void setVinNumber(String vinNumber) {
		this.vehicleBean.setVinNumber(vinNumber);
	}


	@Column(name="warranty_distance", nullable=false, columnDefinition = "TINYINT")
	public Short getWarrantyDistance() {
		return this.vehicleBean.getWarrantyDistance();
	}

	public void setWarrantyDistance(Short warrantyDistance) {
		this.vehicleBean.setWarrantyDistance(warrantyDistance);
	}


	@Column(name="warranty_expiry_date", columnDefinition = "SMALLDATETIME")
	public Date getWarrantyExpiryDate() {
		return this.vehicleBean.getWarrantyExpiryDate();
	}

	public void setWarrantyExpiryDate(Date warrantyExpiryDate) {
		this.vehicleBean.setWarrantyExpiryDate(warrantyExpiryDate);
	}

    
    @OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name = "stock_id", referencedColumnName= "stock_id", insertable=false, updatable=false)
    public VrmStockEntity getVrmStockEntity(){
    	return this.vrmStockEntity;
    }
	
    public void setVrmStockEntity(VrmStockEntity vrmStockEntity){
    	this.vrmStockEntity = vrmStockEntity;
    }
    
    @OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name = "icme_model_code", referencedColumnName= "model_id", insertable=false, updatable=false)
	public ModelDescriptionEntity getModelDescriptionEntity() {
		return modelDescriptionEntity;
	}

	public void setModelDescriptionEntity(ModelDescriptionEntity modelDescriptionEntity) {
		this.modelDescriptionEntity = modelDescriptionEntity;
	}

    @OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name = "stock_id", referencedColumnName= "stock_id", insertable=false, updatable=false)
	public VehicleColourEntity getVehicleColourEntity() {
		return vehicleColourEntity;
	}

	public void setVehicleColourEntity(VehicleColourEntity vehicleColourEntity) {
		this.vehicleColourEntity = vehicleColourEntity;
	}
 }