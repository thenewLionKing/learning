package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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

import uk.co.mo.app.mercury.domain.vehicle.beans.ProfilesBean;


/**
 * The persistent class for the profiles database table.
 * 
 */
@Entity
@Table(name="profiles")
public class ProfilesEntity implements Serializable {

	private static final long serialVersionUID = -4646820941537340184L;

	private ProfilesBean profilesBean = new ProfilesBean();
	private LeaseVehicleModelEntity leaseVehicleModelEntity;

	public ProfilesEntity() {
    }

	@Transient
	public ProfilesBean getProfilesBean() {
		return profilesBean;
	}
	
	public void setProfilesBean(ProfilesBean profilesBean) {
		this.profilesBean = profilesBean;
	}

	@Id
	@Column(name="profile_code", unique=true, nullable=false, length=12, columnDefinition="CHAR")
	public String getProfileCode() {
		return this.getProfilesBean().getProfileCode();
	}

	public void setProfileCode(String profileCode) {
		this.getProfilesBean().setProfileCode(profileCode);
	}


	@Column(name="aa_warranty_premium", columnDefinition="SMALLMONEY")
	public BigDecimal getAaWarrantyPremium() {
		return this.getProfilesBean().getAaWarrantyPremium();
	}

	public void setAaWarrantyPremium(BigDecimal aaWarrantyPremium) {
		this.getProfilesBean().setAaWarrantyPremium(aaWarrantyPremium);
	}


	public Integer getABI_Group() {
		return this.getProfilesBean().getABI_Group();
	}

	public void setABI_Group(Integer ABI_Group) {
		this.getProfilesBean().setABI_Group(ABI_Group);
	}


	@Column(name="apr_percent", precision=7, scale=4)
	public BigDecimal getAprPercent() {
		return this.getProfilesBean().getAprPercent();
	}

	public void setAprPercent(BigDecimal aprPercent) {
		this.getProfilesBean().setAprPercent(aprPercent);
	}


	@Column(name="award_type", length=1, columnDefinition="CHAR")
	public String getAwardType() {
		return this.getProfilesBean().getAwardType();
	}

	public void setAwardType(String awardType) {
		this.getProfilesBean().setAwardType(awardType);
	}


	@Column(name="cap_vehicle_code", length=20, columnDefinition="CHAR")
	public String getCapVehicleCode() {
		return this.getProfilesBean().getCapVehicleCode();
	}

	public void setCapVehicleCode(String capVehicleCode) {
		this.getProfilesBean().setCapVehicleCode(capVehicleCode);
	}


	@Column(name="co2_value")
	public Integer getCo2Value() {
		return this.getProfilesBean().getCo2Value();
	}

	public void setCo2Value(Integer co2Value) {
		this.getProfilesBean().setCo2Value(co2Value);
	}


	@Column(name="concentration_effect", precision=6, scale=2, columnDefinition="DECIMAL")
	public BigDecimal getConcentrationEffect() {
		return this.getProfilesBean().getConcentrationEffect();
	}

	public void setConcentrationEffect(BigDecimal concentrationEffect) {
		this.getProfilesBean().setConcentrationEffect(concentrationEffect);
	}


	@Column(name="current_profile_indicator", length=1, columnDefinition="CHAR")
	public String getCurrentProfileIndicator() {
		return this.getProfilesBean().getCurrentProfileIndicator();
	}

	public void setCurrentProfileIndicator(String currentProfileIndicator) {
		this.getProfilesBean().setCurrentProfileIndicator(currentProfileIndicator);
	}


	@Column(name="Discount_Amount", columnDefinition="SMALLMONEY")
	public BigDecimal getDiscount_Amount() {
		return this.getProfilesBean().getDiscount_Amount();
	}

	public void setDiscount_Amount(BigDecimal discount_Amount) {
		this.getProfilesBean().setDiscount_Amount(discount_Amount);
	}


	@Column(name="dont_show_on_screen_indicator", length=1, columnDefinition="CHAR")
	public String getDontShowOnScreenIndicator() {
		return this.getProfilesBean().getDontShowOnScreenIndicator();
	}

	public void setDontShowOnScreenIndicator(String dontShowOnScreenIndicator) {
		this.getProfilesBean().setDontShowOnScreenIndicator(dontShowOnScreenIndicator);
	}


	@Column(name="end_date", columnDefinition="SMALLDATETIME")
	public Date getEndDate() {
		return this.getProfilesBean().getEndDate();
	}

	public void setEndDate(Date endDate) {
		this.getProfilesBean().setEndDate(endDate);
	}


	@Column(name="exclude_from_new_price_list", length=1, columnDefinition="CHAR")
	public String getExcludeFromNewPriceList() {
		return this.getProfilesBean().getExcludeFromNewPriceList();
	}

	public void setExcludeFromNewPriceList(String excludeFromNewPriceList) {
		this.getProfilesBean().setExcludeFromNewPriceList(excludeFromNewPriceList);
	}


	@Column(name="green_sundry_adjustment", precision=6, scale=2, columnDefinition="DECIMAL")
	public BigDecimal getGreenSundryAdjustment() {
		return this.getProfilesBean().getGreenSundryAdjustment();
	}

	public void setGreenSundryAdjustment(BigDecimal greenSundryAdjustment) {
		this.getProfilesBean().setGreenSundryAdjustment(greenSundryAdjustment);
	}


	@Column(name="Hidden_Reason", length=255)
	public String getHidden_Reason() {
		return this.getProfilesBean().getHidden_Reason();
	}

	public void setHidden_Reason(String hidden_Reason) {
		this.getProfilesBean().setHidden_Reason(hidden_Reason);
	}


	@Column(name="hp_total_charge", columnDefinition="SMALLMONEY")
	public BigDecimal getHpTotalCharge() {
		return this.getProfilesBean().getHpTotalCharge();
	}

	public void setHpTotalCharge(BigDecimal hpTotalCharge) {
		this.getProfilesBean().setHpTotalCharge(hpTotalCharge);
	}


	@Column(name="hp_weekly_rental", columnDefinition="SMALLMONEY")
	public BigDecimal getHpWeeklyRental() {
		return this.getProfilesBean().getHpWeeklyRental();
	}

	public void setHpWeeklyRental(BigDecimal hpWeeklyRental) {
		this.getProfilesBean().setHpWeeklyRental(hpWeeklyRental);
	}


	@Column(name="inspection_category", columnDefinition="TINYINT")
	public Short getInspectionCategory() {
		return this.getProfilesBean().getInspectionCategory();
	}

	public void setInspectionCategory(Short inspectionCategory) {
		this.getProfilesBean().setInspectionCategory(inspectionCategory);
	}


	@Column(name="joint_profile_indicator", length=1, columnDefinition="CHAR")
	public String getJointProfileIndicator() {
		return this.getProfilesBean().getJointProfileIndicator();
	}

	public void setJointProfileIndicator(String jointProfileIndicator) {
		this.getProfilesBean().setJointProfileIndicator(jointProfileIndicator);
	}


	@Column(name="lease_model_initial_rental", columnDefinition="SMALLMONEY")
	public BigDecimal getLeaseModelInitialRental() {
		return this.getProfilesBean().getLeaseModelInitialRental();
	}

	public void setLeaseModelInitialRental(BigDecimal leaseModelInitialRental) {
		this.getProfilesBean().setLeaseModelInitialRental(leaseModelInitialRental);
	}


	@Column(name="lease_model_weekly_rental", columnDefinition="SMALLMONEY")
	public BigDecimal getLeaseModelWeeklyRental() {
		return this.getProfilesBean().getLeaseModelWeeklyRental();
	}

	public void setLeaseModelWeeklyRental(BigDecimal leaseModelWeeklyRental) {
		this.getProfilesBean().setLeaseModelWeeklyRental(leaseModelWeeklyRental);
	}


	@Column(name="lease_type", length=1, columnDefinition="CHAR")
	public String getLeaseType() {
		return this.getProfilesBean().getLeaseType();
	}

	public void setLeaseType(String leaseType) {
		this.getProfilesBean().setLeaseType(leaseType);
	}


	@Column(name="lease_vehicle_id")
	public Integer getLeaseVehicleId() {
		return this.getProfilesBean().getLeaseVehicleId();
	}

	public void setLeaseVehicleId(Integer leaseVehicleId) {
		this.getProfilesBean().setLeaseVehicleId(leaseVehicleId);
	}


	@Column(name="Les2_Profile_Number")
	public Integer getLes2_Profile_Number() {
		return this.getProfilesBean().getLes2_Profile_Number();
	}

	public void setLes2_Profile_Number(Integer les2_Profile_Number) {
		this.getProfilesBean().setLes2_Profile_Number(les2_Profile_Number);
	}


	@Column(name="Les2_Report_Id")
	public Integer getLes2_Report_Id() {
		return this.getProfilesBean().getLes2_Report_Id();
	}

	public void setLes2_Report_Id(Integer les2_Report_Id) {
		this.getProfilesBean().setLes2_Report_Id(les2_Report_Id);
	}


	@Column(name="manf_subsidy_amount", columnDefinition="SMALLMONEY")
	public BigDecimal getManfSubsidyAmount() {
		return this.getProfilesBean().getManfSubsidyAmount();
	}

	public void setManfSubsidyAmount(BigDecimal manfSubsidyAmount) {
		this.getProfilesBean().setManfSubsidyAmount(manfSubsidyAmount);
	}


	@Column(name="manf_subsidy_vat", columnDefinition="SMALLMONEY")
	public BigDecimal getManfSubsidyVat() {
		return this.getProfilesBean().getManfSubsidyVat();
	}

	public void setManfSubsidyVat(BigDecimal manfSubsidyVat) {
		this.getProfilesBean().setManfSubsidyVat(manfSubsidyVat);
	}


	@Column(name="Misc_Amount", columnDefinition="SMALLMONEY")
	public BigDecimal getMisc_Amount() {
		return this.getProfilesBean().getMisc_Amount();
	}

	public void setMisc_Amount(BigDecimal misc_Amount) {
		this.getProfilesBean().setMisc_Amount(misc_Amount);
	}


	@Column(name="miscellaneous_adjustment", precision=6, scale=2, columnDefinition="DECIMAL")
	public BigDecimal getMiscellaneousAdjustment() {
		return this.getProfilesBean().getMiscellaneousAdjustment();
	}

	public void setMiscellaneousAdjustment(BigDecimal miscellaneousAdjustment) {
		this.getProfilesBean().setMiscellaneousAdjustment(miscellaneousAdjustment);
	}


	@Column(name="msrepl_tran_version", nullable=false, length=1, columnDefinition="UNIQUEIDENTIFIER")
	public String getMsreplTranVersion() {
		return this.getProfilesBean().getMsreplTranVersion();
	}

	public void setMsreplTranVersion(String msreplTranVersion) {
		this.getProfilesBean().setMsreplTranVersion(msreplTranVersion);
	}


	@Column(name="new_used_indicator", length=1, columnDefinition="CHAR")
	public String getNewUsedIndicator() {
		return this.getProfilesBean().getNewUsedIndicator();
	}

	public void setNewUsedIndicator(String newUsedIndicator) {
		this.getProfilesBean().setNewUsedIndicator(newUsedIndicator);
	}


	@Column(name="one_off_desc", length=255)
	public String getOneOffDesc() {
		return this.getProfilesBean().getOneOffDesc();
	}

	public void setOneOffDesc(String oneOffDesc) {
		this.getProfilesBean().setOneOffDesc(oneOffDesc);
	}


	@Column(name="one_off_indicator", length=1, columnDefinition="CHAR")
	public String getOneOffIndicator() {
		return this.getProfilesBean().getOneOffIndicator();
	}

	public void setOneOffIndicator(String oneOffIndicator) {
		this.getProfilesBean().setOneOffIndicator(oneOffIndicator);
	}


	@Column(name="profile_creation_date", columnDefinition="SMALLDATETIME")
	public Date getProfileCreationDate() {
		return this.getProfilesBean().getProfileCreationDate();
	}

	public void setProfileCreationDate(Date profileCreationDate) {
		this.getProfilesBean().setProfileCreationDate(profileCreationDate);
	}


	@Column(name="profile_type", length=2, columnDefinition="CHAR")
	public String getProfileType() {
		return this.getProfilesBean().getProfileType();
	}

	public void setProfileType(String profileType) {
		this.getProfilesBean().setProfileType(profileType);
	}


	@Column(name="repurchase_price", columnDefinition="SMALLMONEY")
	public BigDecimal getRepurchasePrice() {
		return this.getProfilesBean().getRepurchasePrice();
	}

	public void setRepurchasePrice(BigDecimal repurchasePrice) {
		this.getProfilesBean().setRepurchasePrice(repurchasePrice);
	}

	@Column(nullable=false, length=1, columnDefinition="UNIQUEIDENTIFIER")
	public String getRowguid() {
		return this.getProfilesBean().getRowguid();
	}

	public void setRowguid(String rowguid) {
		this.getProfilesBean().setRowguid(rowguid);
	}


	@Column(name="rv_data_set_id")
	public Integer getRvDataSetId() {
		return this.getProfilesBean().getRvDataSetId();
	}

	public void setRvDataSetId(Integer rvDataSetId) {
		this.getProfilesBean().setRvDataSetId(rvDataSetId);
	}


	@Column(name="rv_fixing_date", columnDefinition="SMALLDATETIME")
	public Date getRvFixingDate() {
		return this.getProfilesBean().getRvFixingDate();
	}

	public void setRvFixingDate(Date rvFixingDate) {
		this.getProfilesBean().setRvFixingDate(rvFixingDate);
	}


	@Column(name="rv_insurance_premium", columnDefinition="SMALLMONEY")
	public BigDecimal getRvInsurancePremium() {
		return this.getProfilesBean().getRvInsurancePremium();
	}

	public void setRvInsurancePremium(BigDecimal rvInsurancePremium) {
		this.getProfilesBean().setRvInsurancePremium(rvInsurancePremium);
	}


	@Column(name="special_deal_indicator", length=1, columnDefinition="CHAR")
	public String getSpecialDealIndicator() {
		return this.getProfilesBean().getSpecialDealIndicator();
	}

	public void setSpecialDealIndicator(String specialDealIndicator) {
		this.getProfilesBean().setSpecialDealIndicator(specialDealIndicator);
	}


	@Column(name="start_date", columnDefinition="SMALLDATETIME")
	public Date getStartDate() {
		return this.getProfilesBean().getStartDate();
	}

	public void setStartDate(Date startDate) {
		this.getProfilesBean().setStartDate(startDate);
	}


	@Column(name="sundry_payments", precision=6, scale=2, columnDefinition="DECIMAL")
	public BigDecimal getSundryPayments() {
		return this.getProfilesBean().getSundryPayments();
	}

	public void setSundryPayments(BigDecimal sundryPayments) {
		this.getProfilesBean().setSundryPayments(sundryPayments);
	}


	@Column(name="term_in_weeks", columnDefinition="SMALLINT")
	public Short getTermInWeeks() {
		return this.getProfilesBean().getTermInWeeks();
	}

	public void setTermInWeeks(Short termInWeeks) {
		this.getProfilesBean().setTermInWeeks(termInWeeks);
	}


	@Column(name="true_margin_desc", length=255)
	public String getTrueMarginDesc() {
		return this.getProfilesBean().getTrueMarginDesc();
	}

	public void setTrueMarginDesc(String trueMarginDesc) {
		this.getProfilesBean().setTrueMarginDesc(trueMarginDesc);
	}


	@Column(name="true_margin_indicator", length=1, columnDefinition="CHAR")
	public String getTrueMarginIndicator() {
		return this.getProfilesBean().getTrueMarginIndicator();
	}

	public void setTrueMarginIndicator(String trueMarginIndicator) {
		this.getProfilesBean().setTrueMarginIndicator(trueMarginIndicator);
	}


	@Column(name="unadj_monthly_maintenance", columnDefinition="SMALLMONEY")
	public BigDecimal getUnadjMonthlyMaintenance() {
		return this.getProfilesBean().getUnadjMonthlyMaintenance();
	}

	public void setUnadjMonthlyMaintenance(BigDecimal unadjMonthlyMaintenance) {
		this.getProfilesBean().setUnadjMonthlyMaintenance(unadjMonthlyMaintenance);
	}

	@Column(name="vehicle_basic_price", columnDefinition="SMALLMONEY")
	public BigDecimal getVehicleBasicPrice() {
		return this.getProfilesBean().getVehicleBasicPrice();
	}

	public void setVehicleBasicPrice(BigDecimal vehicleBasicPrice) {
		this.getProfilesBean().setVehicleBasicPrice(vehicleBasicPrice);
	}


	@Column(name="vehicle_disposal_cost", precision=6, scale=2, columnDefinition="DECIMAL")
	public BigDecimal getVehicleDisposalCost() {
		return this.getProfilesBean().getVehicleDisposalCost();
	}

	public void setVehicleDisposalCost(BigDecimal vehicleDisposalCost) {
		this.getProfilesBean().setVehicleDisposalCost(vehicleDisposalCost);
	}


	@Column(name="vehicle_value", columnDefinition="SMALLMONEY")
	public BigDecimal getVehicleValue() {
		return this.getProfilesBean().getVehicleValue();
	}

	public void setVehicleValue(BigDecimal vehicleValue) {
		this.getProfilesBean().setVehicleValue(vehicleValue);
	}


	@Column(name="vehicle_vat", columnDefinition="SMALLMONEY")
	public BigDecimal getVehicleVat() {
		return this.getProfilesBean().getVehicleVat();
	}

	public void setVehicleVat(BigDecimal vehicleVat) {
		this.getProfilesBean().setVehicleVat(vehicleVat);
	}


	@Column(name="wheelchair_indicator", length=1, columnDefinition="CHAR")
	public String getWheelchairIndicator() {
		return this.getProfilesBean().getWheelchairIndicator();
	}

	public void setWheelchairIndicator(String wheelchairIndicator) {
		this.getProfilesBean().setWheelchairIndicator(wheelchairIndicator);
	}

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "lease_vehicle_id", referencedColumnName= "lease_vehicle_id", insertable=false, updatable=false, nullable = false)
	public LeaseVehicleModelEntity getLeaseVehicleModelEntity() {
		return this.leaseVehicleModelEntity;
	}
    
	public void setLeaseVehicleModelEntity(LeaseVehicleModelEntity leaseVehicleModelEntity) {
		this.leaseVehicleModelEntity = leaseVehicleModelEntity;
	}
}