package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProfilesBean implements Serializable{
	
	private static final long serialVersionUID = 4138641778370365007L;

	private String profileCode;
	private BigDecimal aaWarrantyPremium;
	private Integer ABI_Group;
	private BigDecimal aprPercent;
	private String awardType;
	private String capVehicleCode;
	private Integer co2Value;
	private BigDecimal concentrationEffect;
	private String currentProfileIndicator;
	private BigDecimal discount_Amount;
	private String dontShowOnScreenIndicator;
	private Date endDate;
	private String excludeFromNewPriceList;
	private BigDecimal greenSundryAdjustment;
	private String hidden_Reason;
	private BigDecimal hpTotalCharge;
	private BigDecimal hpWeeklyRental;
	private Short inspectionCategory;
	private String jointProfileIndicator;
	private BigDecimal leaseModelInitialRental;
	private BigDecimal leaseModelWeeklyRental;
	private String leaseType;
	private Integer leaseVehicleId;
	private Integer les2_Profile_Number;
	private Integer les2_Report_Id;
	private BigDecimal manfSubsidyAmount;
	private BigDecimal manfSubsidyVat;
	private BigDecimal misc_Amount;
	private BigDecimal miscellaneousAdjustment;
	private String msreplTranVersion;
	private String newUsedIndicator;
	private String oneOffDesc;
	private String oneOffIndicator;
	private Date profileCreationDate;
	private String profileType;
	private BigDecimal repurchasePrice;
	private String rowguid;
	private Integer rvDataSetId;
	private Date rvFixingDate;
	private BigDecimal rvInsurancePremium;
	private String specialDealIndicator;
	private Date startDate;
	private BigDecimal sundryPayments;
	private Short termInWeeks;
	private String trueMarginDesc;
	private String trueMarginIndicator;
	private BigDecimal unadjMonthlyMaintenance;
	private BigDecimal vehicleBasicPrice;
	private BigDecimal vehicleDisposalCost;
	private BigDecimal vehicleValue;
	private BigDecimal vehicleVat;
	private String wheelchairIndicator;
	
	private LeaseVehicleModelBean leaseVehicleModelBean;

	public ProfilesBean() {
	}

	public String getProfileCode() {
		return profileCode;
	}

	public void setProfileCode(String profileCode) {
		this.profileCode = profileCode;
	}

	public BigDecimal getAaWarrantyPremium() {
		return aaWarrantyPremium;
	}

	public void setAaWarrantyPremium(BigDecimal aaWarrantyPremium) {
		this.aaWarrantyPremium = aaWarrantyPremium;
	}

	public Integer getABI_Group() {
		return ABI_Group;
	}

	public void setABI_Group(Integer aBI_Group) {
		ABI_Group = aBI_Group;
	}

	public BigDecimal getAprPercent() {
		return aprPercent;
	}

	public void setAprPercent(BigDecimal aprPercent) {
		this.aprPercent = aprPercent;
	}

	public String getAwardType() {
		return awardType;
	}

	public void setAwardType(String awardType) {
		this.awardType = awardType;
	}

	public String getCapVehicleCode() {
		return capVehicleCode;
	}

	public void setCapVehicleCode(String capVehicleCode) {
		this.capVehicleCode = capVehicleCode;
	}

	public Integer getCo2Value() {
		return co2Value;
	}

	public void setCo2Value(Integer co2Value) {
		this.co2Value = co2Value;
	}

	public BigDecimal getConcentrationEffect() {
		return concentrationEffect;
	}

	public void setConcentrationEffect(BigDecimal concentrationEffect) {
		this.concentrationEffect = concentrationEffect;
	}

	public String getCurrentProfileIndicator() {
		return currentProfileIndicator;
	}

	public void setCurrentProfileIndicator(String currentProfileIndicator) {
		this.currentProfileIndicator = currentProfileIndicator;
	}

	public BigDecimal getDiscount_Amount() {
		return discount_Amount;
	}

	public void setDiscount_Amount(BigDecimal discount_Amount) {
		this.discount_Amount = discount_Amount;
	}

	public String getDontShowOnScreenIndicator() {
		return dontShowOnScreenIndicator;
	}

	public void setDontShowOnScreenIndicator(String dontShowOnScreenIndicator) {
		this.dontShowOnScreenIndicator = dontShowOnScreenIndicator;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getExcludeFromNewPriceList() {
		return excludeFromNewPriceList;
	}

	public void setExcludeFromNewPriceList(String excludeFromNewPriceList) {
		this.excludeFromNewPriceList = excludeFromNewPriceList;
	}

	public BigDecimal getGreenSundryAdjustment() {
		return greenSundryAdjustment;
	}

	public void setGreenSundryAdjustment(BigDecimal greenSundryAdjustment) {
		this.greenSundryAdjustment = greenSundryAdjustment;
	}

	public String getHidden_Reason() {
		return hidden_Reason;
	}

	public void setHidden_Reason(String hidden_Reason) {
		this.hidden_Reason = hidden_Reason;
	}

	public BigDecimal getHpTotalCharge() {
		return hpTotalCharge;
	}

	public void setHpTotalCharge(BigDecimal hpTotalCharge) {
		this.hpTotalCharge = hpTotalCharge;
	}

	public BigDecimal getHpWeeklyRental() {
		return hpWeeklyRental;
	}

	public void setHpWeeklyRental(BigDecimal hpWeeklyRental) {
		this.hpWeeklyRental = hpWeeklyRental;
	}

	public Short getInspectionCategory() {
		return inspectionCategory;
	}

	public void setInspectionCategory(Short inspectionCategory) {
		this.inspectionCategory = inspectionCategory;
	}

	public String getJointProfileIndicator() {
		return jointProfileIndicator;
	}

	public void setJointProfileIndicator(String jointProfileIndicator) {
		this.jointProfileIndicator = jointProfileIndicator;
	}

	public BigDecimal getLeaseModelInitialRental() {
		return leaseModelInitialRental;
	}

	public void setLeaseModelInitialRental(BigDecimal leaseModelInitialRental) {
		this.leaseModelInitialRental = leaseModelInitialRental;
	}

	public BigDecimal getLeaseModelWeeklyRental() {
		return leaseModelWeeklyRental;
	}

	public void setLeaseModelWeeklyRental(BigDecimal leaseModelWeeklyRental) {
		this.leaseModelWeeklyRental = leaseModelWeeklyRental;
	}

	public String getLeaseType() {
		return leaseType;
	}

	public void setLeaseType(String leaseType) {
		this.leaseType = leaseType;
	}

	public Integer getLeaseVehicleId() {
		return leaseVehicleId;
	}

	public void setLeaseVehicleId(Integer leaseVehicleId) {
		this.leaseVehicleId = leaseVehicleId;
	}

	public Integer getLes2_Profile_Number() {
		return les2_Profile_Number;
	}

	public void setLes2_Profile_Number(Integer les2_Profile_Number) {
		this.les2_Profile_Number = les2_Profile_Number;
	}

	public Integer getLes2_Report_Id() {
		return les2_Report_Id;
	}

	public void setLes2_Report_Id(Integer les2_Report_Id) {
		this.les2_Report_Id = les2_Report_Id;
	}

	public BigDecimal getManfSubsidyAmount() {
		return manfSubsidyAmount;
	}

	public void setManfSubsidyAmount(BigDecimal manfSubsidyAmount) {
		this.manfSubsidyAmount = manfSubsidyAmount;
	}

	public BigDecimal getManfSubsidyVat() {
		return manfSubsidyVat;
	}

	public void setManfSubsidyVat(BigDecimal manfSubsidyVat) {
		this.manfSubsidyVat = manfSubsidyVat;
	}

	public BigDecimal getMisc_Amount() {
		return misc_Amount;
	}

	public void setMisc_Amount(BigDecimal misc_Amount) {
		this.misc_Amount = misc_Amount;
	}

	public BigDecimal getMiscellaneousAdjustment() {
		return miscellaneousAdjustment;
	}

	public void setMiscellaneousAdjustment(BigDecimal miscellaneousAdjustment) {
		this.miscellaneousAdjustment = miscellaneousAdjustment;
	}

	public String getMsreplTranVersion() {
		return msreplTranVersion;
	}

	public void setMsreplTranVersion(String msreplTranVersion) {
		this.msreplTranVersion = msreplTranVersion;
	}

	public String getNewUsedIndicator() {
		return newUsedIndicator;
	}

	public void setNewUsedIndicator(String newUsedIndicator) {
		this.newUsedIndicator = newUsedIndicator;
	}

	public String getOneOffDesc() {
		return oneOffDesc;
	}

	public void setOneOffDesc(String oneOffDesc) {
		this.oneOffDesc = oneOffDesc;
	}

	public String getOneOffIndicator() {
		return oneOffIndicator;
	}

	public void setOneOffIndicator(String oneOffIndicator) {
		this.oneOffIndicator = oneOffIndicator;
	}

	public Date getProfileCreationDate() {
		return profileCreationDate;
	}

	public void setProfileCreationDate(Date profileCreationDate) {
		this.profileCreationDate = profileCreationDate;
	}

	public String getProfileType() {
		return profileType;
	}

	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	public BigDecimal getRepurchasePrice() {
		return repurchasePrice;
	}

	public void setRepurchasePrice(BigDecimal repurchasePrice) {
		this.repurchasePrice = repurchasePrice;
	}

	public String getRowguid() {
		return rowguid;
	}

	public void setRowguid(String rowguid) {
		this.rowguid = rowguid;
	}

	public Integer getRvDataSetId() {
		return rvDataSetId;
	}

	public void setRvDataSetId(Integer rvDataSetId) {
		this.rvDataSetId = rvDataSetId;
	}

	public Date getRvFixingDate() {
		return rvFixingDate;
	}

	public void setRvFixingDate(Date rvFixingDate) {
		this.rvFixingDate = rvFixingDate;
	}

	public BigDecimal getRvInsurancePremium() {
		return rvInsurancePremium;
	}

	public void setRvInsurancePremium(BigDecimal rvInsurancePremium) {
		this.rvInsurancePremium = rvInsurancePremium;
	}

	public String getSpecialDealIndicator() {
		return specialDealIndicator;
	}

	public void setSpecialDealIndicator(String specialDealIndicator) {
		this.specialDealIndicator = specialDealIndicator;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public BigDecimal getSundryPayments() {
		return sundryPayments;
	}

	public void setSundryPayments(BigDecimal sundryPayments) {
		this.sundryPayments = sundryPayments;
	}

	public Short getTermInWeeks() {
		return termInWeeks;
	}

	public void setTermInWeeks(Short termInWeeks) {
		this.termInWeeks = termInWeeks;
	}

	public String getTrueMarginDesc() {
		return trueMarginDesc;
	}

	public void setTrueMarginDesc(String trueMarginDesc) {
		this.trueMarginDesc = trueMarginDesc;
	}

	public String getTrueMarginIndicator() {
		return trueMarginIndicator;
	}

	public void setTrueMarginIndicator(String trueMarginIndicator) {
		this.trueMarginIndicator = trueMarginIndicator;
	}

	public BigDecimal getUnadjMonthlyMaintenance() {
		return unadjMonthlyMaintenance;
	}

	public void setUnadjMonthlyMaintenance(BigDecimal unadjMonthlyMaintenance) {
		this.unadjMonthlyMaintenance = unadjMonthlyMaintenance;
	}

	public BigDecimal getVehicleBasicPrice() {
		return vehicleBasicPrice;
	}

	public void setVehicleBasicPrice(BigDecimal vehicleBasicPrice) {
		this.vehicleBasicPrice = vehicleBasicPrice;
	}

	public BigDecimal getVehicleDisposalCost() {
		return vehicleDisposalCost;
	}

	public void setVehicleDisposalCost(BigDecimal vehicleDisposalCost) {
		this.vehicleDisposalCost = vehicleDisposalCost;
	}

	public BigDecimal getVehicleValue() {
		return vehicleValue;
	}

	public void setVehicleValue(BigDecimal vehicleValue) {
		this.vehicleValue = vehicleValue;
	}

	public BigDecimal getVehicleVat() {
		return vehicleVat;
	}

	public void setVehicleVat(BigDecimal vehicleVat) {
		this.vehicleVat = vehicleVat;
	}

	public String getWheelchairIndicator() {
		return wheelchairIndicator;
	}

	public void setWheelchairIndicator(String wheelchairIndicator) {
		this.wheelchairIndicator = wheelchairIndicator;
	}

	public void setLeaseVehicleModelBean(LeaseVehicleModelBean leaseVehicleModelBean) {
		this.leaseVehicleModelBean = leaseVehicleModelBean;
	}

	public LeaseVehicleModelBean getLeaseVehicleModelBean() {
		return this.leaseVehicleModelBean;
	}
}