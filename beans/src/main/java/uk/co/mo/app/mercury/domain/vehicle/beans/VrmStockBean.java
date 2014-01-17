package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import uk.co.mo.app.mercury.domain.agreement.beans.AgreementDealerBean;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementDeliveryDateHistoryBean;
import uk.co.mo.app.mercury.domain.org.manufacturer.beans.ManufacturerBean;

public class VrmStockBean implements Serializable{
	
	private static final long serialVersionUID = -4956534485189617150L;
	
	private Integer stockId;
	private Integer agreementId;
	private Integer agreementStatus;
	private String arn;
	private Integer assetNumber;
	private BigDecimal capBlackTradeValue;
	private BigDecimal capBlackValue;
	private String capCode;
	private BigDecimal capMonitorTradeValue;
	private BigDecimal capMonitorValue;
	private Integer capVin;
	private String colour;
	private Short fleetGrade;
	private Integer fleetGradeUpdateDept;
	private Integer glassModelId;
	private Integer glassQualifiedModelAssoc;
	private BigDecimal glassRetailValue;
	private BigDecimal glassTradeValue;
	private String gradingComment;
	private Boolean heavyAccidentDamage;
	private Integer initialLocationId;
	private Integer leaseVehicleId;
	private Integer locationId;
	private Short manufacturerId;
	private BigDecimal marketValue;
	private Integer mileage;
	private BigDecimal offerValue;
	private String plateLetter;
	private Short pricing_Availability;
	private String profileCode;
	private String rangeCode;
	private Date receiptDate;
	private String registration;
	private BigDecimal reserveValue;
	private BigDecimal residualValue;
	private Date rowInsertDate;
	private Integer stockGradeId;
	private Integer stockStandardId;
	private Integer stockStatusId;
	private Integer stockTypeId;
	private Short substandard;
	private Boolean suspended;
	private Date targetSaleDate;
	private String terminationType;
	private Date timestamp;
	private Short vehicleType;
	private String vmsMobilityNumber;
	private String year;
	private VrmStockDescriptionBean vrmStockDescriptionBean;
	private List<VrmMoveBean> vrmMoveBean;
	private List<VrmHandbackDetailsHistoryBean> vrmHandbackDetailsHistoryBean;
	private List<AgreementDeliveryDateHistoryBean> agreementDeliveryDateHistoryBeanList;
	private ManufacturerBean manufacturerBean;
	private List<AgreementDealerBean> agreementDealerBean;
	private VrmOrganisationBean vrmOrganisationBean;

	private VrmVcrGradeIdBean vrmVcrGradeIdBean;


	public VrmStockBean() {
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public Integer getAgreementId() {
		return agreementId;
	}

	public void setAgreementId(Integer agreementId) {
		this.agreementId = agreementId;
	}

	public Integer getAgreementStatus() {
		return agreementStatus;
	}

	public void setAgreementStatus(Integer agreementStatus) {
		this.agreementStatus = agreementStatus;
	}

	public String getArn() {
		return arn;
	}

	public void setArn(String arn) {
		this.arn = arn;
	}

	public Integer getAssetNumber() {
		return assetNumber;
	}

	public void setAssetNumber(Integer assetNumber) {
		this.assetNumber = assetNumber;
	}

	public BigDecimal getCapBlackTradeValue() {
		return capBlackTradeValue;
	}

	public void setCapBlackTradeValue(BigDecimal capBlackTradeValue) {
		this.capBlackTradeValue = capBlackTradeValue;
	}

	public BigDecimal getCapBlackValue() {
		return capBlackValue;
	}

	public void setCapBlackValue(BigDecimal capBlackValue) {
		this.capBlackValue = capBlackValue;
	}

	public String getCapCode() {
		return capCode;
	}

	public void setCapCode(String capCode) {
		this.capCode = capCode;
	}

	public BigDecimal getCapMonitorTradeValue() {
		return capMonitorTradeValue;
	}

	public void setCapMonitorTradeValue(BigDecimal capMonitorTradeValue) {
		this.capMonitorTradeValue = capMonitorTradeValue;
	}

	public BigDecimal getCapMonitorValue() {
		return capMonitorValue;
	}

	public void setCapMonitorValue(BigDecimal capMonitorValue) {
		this.capMonitorValue = capMonitorValue;
	}

	public Integer getCapVin() {
		return capVin;
	}

	public void setCapVin(Integer capVin) {
		this.capVin = capVin;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Short getFleetGrade() {
		return fleetGrade;
	}

	public void setFleetGrade(Short fleetGrade) {
		this.fleetGrade = fleetGrade;
	}

	public Integer getFleetGradeUpdateDept() {
		return fleetGradeUpdateDept;
	}

	public void setFleetGradeUpdateDept(Integer fleetGradeUpdateDept) {
		this.fleetGradeUpdateDept = fleetGradeUpdateDept;
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

	public BigDecimal getGlassRetailValue() {
		return glassRetailValue;
	}

	public void setGlassRetailValue(BigDecimal glassRetailValue) {
		this.glassRetailValue = glassRetailValue;
	}

	public BigDecimal getGlassTradeValue() {
		return glassTradeValue;
	}

	public void setGlassTradeValue(BigDecimal glassTradeValue) {
		this.glassTradeValue = glassTradeValue;
	}

	public String getGradingComment() {
		return gradingComment;
	}

	public void setGradingComment(String gradingComment) {
		this.gradingComment = gradingComment;
	}

	public Boolean isHeavyAccidentDamage() {
		return heavyAccidentDamage;
	}

	public void setHeavyAccidentDamage(Boolean heavyAccidentDamage) {
		this.heavyAccidentDamage = heavyAccidentDamage;
	}

	public Integer getInitialLocationId() {
		return initialLocationId;
	}

	public void setInitialLocationId(Integer initialLocationId) {
		this.initialLocationId = initialLocationId;
	}

	public Integer getLeaseVehicleId() {
		return leaseVehicleId;
	}

	public void setLeaseVehicleId(Integer leaseVehicleId) {
		this.leaseVehicleId = leaseVehicleId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public Short getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(Short manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public BigDecimal getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(BigDecimal marketValue) {
		this.marketValue = marketValue;
	}

	public Integer getMileage() {
		return mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	public BigDecimal getOfferValue() {
		return offerValue;
	}

	public void setOfferValue(BigDecimal offerValue) {
		this.offerValue = offerValue;
	}

	public String getPlateLetter() {
		return plateLetter;
	}

	public void setPlateLetter(String plateLetter) {
		this.plateLetter = plateLetter;
	}

	public Short getPricing_Availability() {
		return pricing_Availability;
	}

	public void setPricing_Availability(Short pricing_Availability) {
		this.pricing_Availability = pricing_Availability;
	}

	public String getProfileCode() {
		return profileCode;
	}

	public void setProfileCode(String profileCode) {
		this.profileCode = profileCode;
	}

	public String getRangeCode() {
		return rangeCode;
	}

	public void setRangeCode(String rangeCode) {
		this.rangeCode = rangeCode;
	}

	public Date getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public BigDecimal getReserveValue() {
		return reserveValue;
	}

	public void setReserveValue(BigDecimal reserveValue) {
		this.reserveValue = reserveValue;
	}

	public BigDecimal getResidualValue() {
		return residualValue;
	}

	public void setResidualValue(BigDecimal residualValue) {
		this.residualValue = residualValue;
	}

	public Date getRowInsertDate() {
		return rowInsertDate;
	}

	public void setRowInsertDate(Date rowInsertDate) {
		this.rowInsertDate = rowInsertDate;
	}

	public Integer getStockGradeId() {
		return stockGradeId;
	}

	public void setStockGradeId(Integer stockGradeId) {
		this.stockGradeId = stockGradeId;
	}

	public Integer getStockStandardId() {
		return stockStandardId;
	}

	public void setStockStandardId(Integer stockStandardId) {
		this.stockStandardId = stockStandardId;
	}

	public Integer getStockStatusId() {
		return stockStatusId;
	}

	public void setStockStatusId(Integer stockStatusId) {
		this.stockStatusId = stockStatusId;
	}

	public Integer getStockTypeId() {
		return stockTypeId;
	}

	public void setStockTypeId(Integer stockTypeId) {
		this.stockTypeId = stockTypeId;
	}

	public Short getSubstandard() {
		return substandard;
	}

	public void setSubstandard(Short substandard) {
		this.substandard = substandard;
	}

	public Boolean isSuspended() {
		return suspended;
	}

	public void setSuspended(Boolean suspended) {
		this.suspended = suspended;
	}

	public Date getTargetSaleDate() {
		return targetSaleDate;
	}

	public void setTargetSaleDate(Date targetSaleDate) {
		this.targetSaleDate = targetSaleDate;
	}

	public String getTerminationType() {
		return terminationType;
	}

	public void setTerminationType(String terminationType) {
		this.terminationType = terminationType;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Short getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(Short vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVmsMobilityNumber() {
		return vmsMobilityNumber;
	}

	public void setVmsMobilityNumber(String vmsMobilityNumber) {
		this.vmsMobilityNumber = vmsMobilityNumber;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public VrmStockDescriptionBean getVrmStockDescriptionBean(){
		return this.vrmStockDescriptionBean;
	}
	public void setVrmStockDescriptionBean(VrmStockDescriptionBean vrmStockDescriptionBean) {
		this.vrmStockDescriptionBean =vrmStockDescriptionBean;
	}

	public void setVrmMoveBean(List<VrmMoveBean> vrmMoveBean) {
		this.vrmMoveBean = vrmMoveBean;
	}

	public List<VrmMoveBean> getVrmMoveBean() {
		return vrmMoveBean;
	}

	public void setVrmHandbackDetailsHistoryBean(
			List<VrmHandbackDetailsHistoryBean> vrmHandbackDetailsHistoryBean) {
		this.vrmHandbackDetailsHistoryBean = vrmHandbackDetailsHistoryBean;
	}

	public List<VrmHandbackDetailsHistoryBean> getVrmHandbackDetailsHistoryBean() {
		return vrmHandbackDetailsHistoryBean;
	}

	public void setAgreementDeliveryDateHistoryBean(List<AgreementDeliveryDateHistoryBean> agreementDeliveryDateHistoryBeanList) {
		this.setAgreementDeliveryDateHistoryBeanList(agreementDeliveryDateHistoryBeanList);
				
	}

	public List<AgreementDeliveryDateHistoryBean> getAgreementDeliveryDateHistoryBeanList() {
		return agreementDeliveryDateHistoryBeanList;
	}

	public void setAgreementDeliveryDateHistoryBeanList(List<AgreementDeliveryDateHistoryBean> agreementDeliveryDateHistoryBeanList) {
		this.agreementDeliveryDateHistoryBeanList = agreementDeliveryDateHistoryBeanList;
	}

	public ManufacturerBean getManufacturerBean() {
		return manufacturerBean;
	}
	
	public void setManufacturerBean(ManufacturerBean manufacturerBean) {
		this.manufacturerBean = manufacturerBean;		
	}

	public List<AgreementDealerBean> getAgreementDealerBean() {
		return agreementDealerBean;
	}

	public void setAgreementDealerBean(List<AgreementDealerBean> agreementDealerBeanList) {
		this.agreementDealerBean =agreementDealerBeanList;		
	}

	public void setVrmOrganisationBean(VrmOrganisationBean vrmOrganisationBean) {
		this.vrmOrganisationBean = vrmOrganisationBean;
	}

	public VrmOrganisationBean getVrmOrganisationBean() {
		return vrmOrganisationBean;
	}

	public VrmVcrGradeIdBean getVrmVcrGradeIdBean() {
		return this.vrmVcrGradeIdBean;
	}
	
	public void setVrmVcrGradeIdBean(VrmVcrGradeIdBean vrmVcrGradeIdBean) {
		this.vrmVcrGradeIdBean = vrmVcrGradeIdBean;
	}
}