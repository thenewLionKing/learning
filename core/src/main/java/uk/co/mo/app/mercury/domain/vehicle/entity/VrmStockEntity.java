package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.VrmStockBean;


/**
 * The persistent class for the vrm_stock database table.
 * 
 */
@Entity
@Table(name="vrm_stock")
public class VrmStockEntity implements Serializable {

	private static final long serialVersionUID = -5951392747637588553L;
	private VrmStockBean vrmStockBean = new VrmStockBean();
	private VrmStockDescriptionEntity vrmStockDescriptionEntity;
	private List<VrmMoveEntity> vrmMoveEntity;
	private List<VrmHandbackDetailsHistoryEntity> vrmHandbackDetailsHistoryEntity;
	private VrmSoldEntity vrmSoldEntity;
	private VrmHandbackEntity vrmHandbackEntity;
	private VrmVcrGradeIdEntity vrmVcrGradeIdEntity; 
	
 

	@Transient
	public VrmStockBean getVrmStockBean() {
		return this.vrmStockBean;
	}

	public void setVrmStockBean(VrmStockBean vrmStockBean) {
		this.vrmStockBean = vrmStockBean;
	}


	public VrmStockEntity() {
    }


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stock_id", unique=true, nullable=false)
	public Integer getStockId() {
		return this.vrmStockBean.getStockId();
	}

	public void setStockId(Integer stockId) {
		this.vrmStockBean.setStockId(stockId);
	}


	@Column(name="agreement_id", nullable=false)
	public Integer getAgreementId() {
		return this.vrmStockBean.getAgreementId();
	}

	public void setAgreementId(Integer agreementId) {
		this.vrmStockBean.setAgreementId(agreementId);
	}


	@Column(name="agreement_status")
	public Integer getAgreementStatus() {
		return this.vrmStockBean.getAgreementStatus();
	}

	public void setAgreementStatus(Integer agreementStatus) {
		this.vrmStockBean.setAgreementStatus(agreementStatus);
	}


	@Column(name="ARN",columnDefinition="CHAR", length=8)
	public String getArn() {
		return this.vrmStockBean.getArn();
	}

	public void setArn(String arn) {
		this.vrmStockBean.setArn(arn);
	}


	@Column(name="asset_number")
	public Integer getAssetNumber() {
		return this.vrmStockBean.getAssetNumber();
	}

	public void setAssetNumber(Integer assetNumber) {
		this.vrmStockBean.setAssetNumber(assetNumber);
	}


	@Column(name="cap_black_trade_value", columnDefinition="MONEY")
	public BigDecimal getCapBlackTradeValue() {
		return this.vrmStockBean.getCapBlackTradeValue();
	}

	public void setCapBlackTradeValue(BigDecimal capBlackTradeValue) {
		this.vrmStockBean.setCapBlackTradeValue(capBlackTradeValue);
	}


	@Column(name="cap_black_value", columnDefinition="MONEY")
	public BigDecimal getCapBlackValue() {
		return this.vrmStockBean.getCapBlackValue();
	}

	public void setCapBlackValue(BigDecimal capBlackValue) {
		this.vrmStockBean.setCapBlackValue(capBlackValue);
	}


	@Column(name="cap_code", columnDefinition="CHAR", length=20)
	public String getCapCode() {
		return this.vrmStockBean.getCapCode();
	}

	public void setCapCode(String capCode) {
		this.vrmStockBean.setCapCode(capCode);
	}


	@Column(name="cap_monitor_trade_value", columnDefinition="MONEY")
	public BigDecimal getCapMonitorTradeValue() {
		return this.vrmStockBean.getCapMonitorTradeValue();
	}

	public void setCapMonitorTradeValue(BigDecimal capMonitorTradeValue) {
		this.vrmStockBean.setCapMonitorTradeValue(capMonitorTradeValue);
	}


	@Column(name="cap_monitor_value", columnDefinition="MONEY")
	public BigDecimal getCapMonitorValue() {
		return this.vrmStockBean.getCapMonitorValue();
	}

	public void setCapMonitorValue(BigDecimal capMonitorValue) {
		this.vrmStockBean.setCapMonitorValue(capMonitorValue);
	}


	@Column(name="cap_vin")
	public Integer getCapVin() {
		return this.vrmStockBean.getCapVin();
	}

	public void setCapVin(Integer capVin) {
		this.vrmStockBean.setCapVin(capVin);
	}


	@Column(length=50)
	public String getColour() {
		return this.vrmStockBean.getColour();
	}

	public void setColour(String colour) {
		this.vrmStockBean.setColour(colour);
	}


	@Column(name="fleet_grade", columnDefinition="TINYINT", insertable=false, updatable=false)
	public Short getFleetGrade() {
		return this.vrmStockBean.getFleetGrade();
	}

	public void setFleetGrade(Short fleetGrade) {
		this.vrmStockBean.setFleetGrade(fleetGrade);
	}


	@Column(name="fleet_grade_update_dept")
	public Integer getFleetGradeUpdateDept() {
		return this.vrmStockBean.getFleetGradeUpdateDept();
	}

	public void setFleetGradeUpdateDept(Integer fleetGradeUpdateDept) {
		this.vrmStockBean.setFleetGradeUpdateDept(fleetGradeUpdateDept);
	}


	@Column(name="glass_model_id")
	public Integer getGlassModelId() {
		return this.vrmStockBean.getGlassModelId();
	}

	public void setGlassModelId(Integer glassModelId) {
		this.vrmStockBean.setGlassModelId(glassModelId);
	}


	@Column(name="glass_qualified_model_assoc")
	public Integer getGlassQualifiedModelAssoc() {
		return this.vrmStockBean.getGlassQualifiedModelAssoc();
	}

	public void setGlassQualifiedModelAssoc(Integer glassQualifiedModelAssoc) {
		this.vrmStockBean.setGlassQualifiedModelAssoc(glassQualifiedModelAssoc);
	}


	@Column(name="glass_retail_value",columnDefinition="MONEY")
	public BigDecimal getGlassRetailValue() {
		return this.vrmStockBean.getGlassRetailValue();
	}

	public void setGlassRetailValue(BigDecimal glassRetailValue) {
		this.vrmStockBean.setGlassRetailValue(glassRetailValue);
	}


	@Column(name="glass_trade_value",columnDefinition="MONEY")
	public BigDecimal getGlassTradeValue() {
		return this.vrmStockBean.getGlassTradeValue();
	}

	public void setGlassTradeValue(BigDecimal glassTradeValue) {
		this.vrmStockBean.setGlassTradeValue(glassTradeValue);
	}


	@Column(name="grading_comment", length=1000)
	public String getGradingComment() {
		return this.vrmStockBean.getGradingComment();
	}

	public void setGradingComment(String gradingComment) {
		this.vrmStockBean.setGradingComment(gradingComment);
	}


	@Column(name="heavy_accident_damage")
	public Boolean getHeavyAccidentDamage() {
		return this.vrmStockBean.isHeavyAccidentDamage();
	}

	public void setHeavyAccidentDamage(Boolean heavyAccidentDamage) {
		this.vrmStockBean.setHeavyAccidentDamage(heavyAccidentDamage);
	}


	@Column(name="initial_location_id")
	public Integer getInitialLocationId() {
		return this.vrmStockBean.getInitialLocationId();
	}

	public void setInitialLocationId(Integer initialLocationId) {
		this.vrmStockBean.setInitialLocationId(initialLocationId);
	}


	@Column(name="lease_vehicle_id")
	public Integer getLeaseVehicleId() {
		return this.vrmStockBean.getLeaseVehicleId();
	}

	public void setLeaseVehicleId(Integer leaseVehicleId) {
		this.vrmStockBean.setLeaseVehicleId(leaseVehicleId);
	}


	@Column(name="location_id")
	public Integer getLocationId() {
		return this.vrmStockBean.getLocationId();
	}

	public void setLocationId(Integer locationId) {
		this.vrmStockBean.setLocationId(locationId);
	}


	@Column(name="manufacturer_id", columnDefinition="SMALLINT", nullable=false)
	public Short getManufacturerId() {
		return this.vrmStockBean.getManufacturerId();
	}

	public void setManufacturerId(Short manufacturerId) {
		this.vrmStockBean.setManufacturerId(manufacturerId);
	}


	@Column(name="market_value", columnDefinition="MONEY")
	public BigDecimal getMarketValue() {
		return this.vrmStockBean.getMarketValue();
	}

	public void setMarketValue(BigDecimal marketValue) {
		this.vrmStockBean.setMarketValue(marketValue);
	}


	public Integer getMileage() {
		return this.vrmStockBean.getMileage();
	}

	public void setMileage(Integer mileage) {
		this.vrmStockBean.setMileage(mileage);
	}


	@Column(name="offer_value", columnDefinition="MONEY")
	public BigDecimal getOfferValue() {
		return this.vrmStockBean.getOfferValue();
	}

	public void setOfferValue(BigDecimal offerValue) {
		this.vrmStockBean.setOfferValue(offerValue);
	}


	@Column(name="plate_letter", length=2, columnDefinition="CHAR")
	public String getPlateLetter() {
		return this.vrmStockBean.getPlateLetter();
	}

	public void setPlateLetter(String plateLetter) {
		this.vrmStockBean.setPlateLetter(plateLetter);
	}


	@Column(name="Pricing_Availability", columnDefinition="TINYINT")
	public Short getPricing_Availability() {
		return this.vrmStockBean.getPricing_Availability();
	}

	public void setPricing_Availability(Short pricing_Availability) {
		this.vrmStockBean.setPricing_Availability(pricing_Availability);
	}


	@Column(name="profile_code", length=12, columnDefinition="CHAR")
	public String getProfileCode() {
		return this.vrmStockBean.getProfileCode();
	}

	public void setProfileCode(String profileCode) {
		this.vrmStockBean.setProfileCode(profileCode);
	}


	@Column(name="range_code", length=2, columnDefinition="CHAR")
	public String getRangeCode() {
		return this.vrmStockBean.getRangeCode();
	}

	public void setRangeCode(String rangeCode) {
		this.vrmStockBean.setRangeCode(rangeCode);
	}


	@Column(name="receipt_date", columnDefinition="DATETIME")
	public Date getReceiptDate() {
		return this.vrmStockBean.getReceiptDate();
	}

	public void setReceiptDate(Date receiptDate) {
		this.vrmStockBean.setReceiptDate(receiptDate);
	}


	@Column(length=8, columnDefinition="CHAR")
	public String getRegistration() {
		return this.vrmStockBean.getRegistration();
	}

	public void setRegistration(String registration) {
		this.vrmStockBean.setRegistration(registration);
	}


	@Column(name="reserve_value", columnDefinition="MONEY")
	public BigDecimal getReserveValue() {
		return this.vrmStockBean.getReserveValue();
	}

	public void setReserveValue(BigDecimal reserveValue) {
		this.vrmStockBean.setReserveValue(reserveValue);
	}


	@Column(name="residual_value", columnDefinition="MONEY")
	public BigDecimal getResidualValue() {
		return this.vrmStockBean.getResidualValue();
	}

	public void setResidualValue(BigDecimal residualValue) {
		this.vrmStockBean.setResidualValue(residualValue);
	}


	@Column(name="row_insert_date", columnDefinition="DATETIME")
	public Date getRowInsertDate() {
		return this.vrmStockBean.getRowInsertDate();
	}

	public void setRowInsertDate(Date rowInsertDate) {
		this.vrmStockBean.setRowInsertDate(rowInsertDate);
	}


	@Column(name="stock_grade_id")
	public Integer getStockGradeId() {
		return this.vrmStockBean.getStockGradeId();
	}

	public void setStockGradeId(Integer stockGradeId) {
		this.vrmStockBean.setStockGradeId(stockGradeId);
	}


	@Column(name="stock_standard_id")
	public Integer getStockStandardId() {
		return this.vrmStockBean.getStockStandardId();
	}

	public void setStockStandardId(Integer stockStandardId) {
		this.vrmStockBean.setStockStandardId(stockStandardId);
	}


	@Column(name="stock_status_id", nullable=false)
	public Integer getStockStatusId() {
		return this.vrmStockBean.getStockStatusId();
	}

	public void setStockStatusId(Integer stockStatusId) {
		this.vrmStockBean.setStockStatusId(stockStatusId);
	}


	@Column(name="stock_type_id", nullable=false)
	public Integer getStockTypeId() {
		return this.vrmStockBean.getStockTypeId();
	}

	public void setStockTypeId(Integer stockTypeId) {
		this.vrmStockBean.setStockTypeId(stockTypeId);
	}


	@Column(name="Substandard", columnDefinition="SMALLINT")
	public Short getSubstandard() {
		return this.vrmStockBean.getSubstandard();
	}

	public void setSubstandard(Short substandard) {
		this.vrmStockBean.setSubstandard(substandard);
	}


	public Boolean getSuspended() {
		return this.vrmStockBean.isSuspended();
	}

	public void setSuspended(Boolean suspended) {
		this.vrmStockBean.setSuspended(suspended);
	}


	@Column(name="target_sale_date", columnDefinition="DATETIME")
	public Date getTargetSaleDate() {
		return this.vrmStockBean.getTargetSaleDate();
	}

	public void setTargetSaleDate(Date targetSaleDate) {
		this.vrmStockBean.setTargetSaleDate(targetSaleDate);
	}


	@Column(name="termination_type", length=3, columnDefinition="CHAR")
	public String getTerminationType() {
		return this.vrmStockBean.getTerminationType();
	}

	public void setTerminationType(String terminationType) {
		this.vrmStockBean.setTerminationType(terminationType);
	}

	@Column(name="vehicle_type", columnDefinition="TINYINT")
	public Short getVehicleType() {
		return this.vrmStockBean.getVehicleType();
	}

	public void setVehicleType(Short vehicleType) {
		this.vrmStockBean.setVehicleType(vehicleType);
	}


	@Column(name="vms_mobility_number", length=7, columnDefinition="CHAR")
	public String getVmsMobilityNumber() {
		return this.vrmStockBean.getVmsMobilityNumber();
	}

	public void setVmsMobilityNumber(String vmsMobilityNumber) {
		this.vrmStockBean.setVmsMobilityNumber(vmsMobilityNumber);
	}


	@Column(length=4, columnDefinition="CHAR")
	public String getYear() {
		return this.vrmStockBean.getYear();
	}

	public void setYear(String year) {
		this.vrmStockBean.setYear(year);
	}
	
    @OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name = "stock_id", referencedColumnName= "stock_id")
    public VrmStockDescriptionEntity getVrmStockDescriptionEntity(){
    	return this.vrmStockDescriptionEntity;
    }
	
    public void setVrmStockDescriptionEntity(VrmStockDescriptionEntity vrmStockDescriptionEntity){
    	this.vrmStockDescriptionEntity = vrmStockDescriptionEntity;
    }

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name= "stock_id", referencedColumnName="stock_id")
    public List<VrmMoveEntity> getVrmMoveEntity() {
    	return this.vrmMoveEntity;
    }

    public void setVrmMoveEntity(List<VrmMoveEntity> vrmMoveEntity) {
		this.vrmMoveEntity = vrmMoveEntity;
	}

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name= "agreement_id", referencedColumnName="agreement_id")
    public List<VrmHandbackDetailsHistoryEntity> getVrmHandbackDetailsHistoryEntity() {
    	return this.vrmHandbackDetailsHistoryEntity;
    }

    public void setVrmHandbackDetailsHistoryEntity(List<VrmHandbackDetailsHistoryEntity> vrmHandbackDetailsHistoryEntity) {
		this.vrmHandbackDetailsHistoryEntity = vrmHandbackDetailsHistoryEntity;
	}

    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn (name="stock_id", referencedColumnName="stock_id")
    public VrmSoldEntity getVrmSoldEntity() {
		return this.vrmSoldEntity;
	}
    
	public void setVrmSoldEntity(VrmSoldEntity vrmSoldEntity) {
		this.vrmSoldEntity = vrmSoldEntity;
	}

	@OneToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="stock_id", referencedColumnName="stock_id")
	public VrmHandbackEntity getVrmHandbackEntity() {
		return this.vrmHandbackEntity;
	}
	public void setVrmHandbackEntity(VrmHandbackEntity vrmHandbackEntity) {
		this.vrmHandbackEntity = vrmHandbackEntity;
	}

	@OneToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="fleet_grade", referencedColumnName="vcr_grade_id")
	public VrmVcrGradeIdEntity getVrmVcrGradeIdEntity() {
		return vrmVcrGradeIdEntity;
	}

	public void setVrmVcrGradeIdEntity(VrmVcrGradeIdEntity vrmVcrGradeIdEntity) {
		this.vrmVcrGradeIdEntity = vrmVcrGradeIdEntity;
	}
}