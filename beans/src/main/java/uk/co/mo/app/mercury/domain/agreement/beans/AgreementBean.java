package uk.co.mo.app.mercury.domain.agreement.beans;

import uk.co.mo.app.mercury.domain.customer.beans.CustomerBean;
import uk.co.mo.app.mercury.domain.vehicle.beans.ProfilesBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class AgreementBean implements Serializable {

	private static final long serialVersionUID = 1713949325765753305L;

	private Integer agreementId;
	private String arn;
	private Short agreementStatus;
	private Date applicationAcceptedDate;
    private Integer assetNumber;
    private String authorisecode;
    private Integer creationSourceId;
    private Date endDate;
    private Date entryDate;
    private BigDecimal financeAmount;
    private BigDecimal financeCharge;
    private String grantFund;
    private Date handbackDate;
    private Integer handbackDealerOrgId;
    private BigDecimal jointWeeklyRental;
    private String maintenanceAgentId;
    private Date insertDate;
    private Date updateDate;
    private Date startDate;
    private String unadoptedIndicator;
    private String updateUser;
    private Integer primaryProductTypeId;
    private Character selfBill;
    private Character terminationType;
    private String dealerId;
    private Short schemeTypeId;
    private String supplyInvoiceNumber;
    private String chassisNumber;
    private BigDecimal custHolderAmt;

	private List<AgreementDeliveryDateHistoryBean> agreementDeliveryDateHistoryBean;
	private CustomerBean customer;

	private List<AgreementNominatedDriverBean> nominatedDrivers;

	private AgreementProductBean agreementProductBean;

	private ProfilesBean profilesBean;

	private Integer disabledPerson2Id;

	private Integer appointee2Id;

	private Integer nextOfKinId;

	private Date mflReceiptDate;

	private String mflReceiptUserId;

	private Integer replacementLeaseVehicleId;

	private Short jointAgreementContribution;

	private String carRegistrationNumber;

    private String newArn;

    private Boolean stleActive;

    private Date originalEndDate;

    private Date maxExtensionEndDate;

    private Integer extensionReasonId;

	public Integer getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(Integer agreementId) {
        this.agreementId = agreementId;
    }

    public String getArn() {
        return arn;
    }

    public void setArn(String arn) {
        this.arn = arn;
    }

    public Short getAgreementStatus() {
        return agreementStatus;
    }

    public void setAgreementStatus(Short agreementStatus) {
        this.agreementStatus = agreementStatus;
    }


    public Date getApplicationAcceptedDate() {
        return applicationAcceptedDate;
    }

    public void setApplicationAcceptedDate(Date applicationAcceptedDate) {
        this.applicationAcceptedDate = applicationAcceptedDate;
    }


    public Integer getAssetNumber() {
        return assetNumber;
    }

    public void setAssetNumber(Integer assetNumber) {
        this.assetNumber = assetNumber;
    }


    public String getAuthorisecode() {
        return authorisecode;
    }

    public void setAuthorisecode(String authorisecode) {
        this.authorisecode = authorisecode;
    }

    public Integer getCreationSourceId() {
        return creationSourceId;
    }

    public void setCreationSourceId(Integer creationSourceId) {
        this.creationSourceId = creationSourceId;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }


    public BigDecimal getFinanceAmount() {
        return financeAmount;
    }

    public void setFinanceAmount(BigDecimal financeAmount) {
        this.financeAmount = financeAmount;
    }


    public BigDecimal getFinanceCharge() {
        return financeCharge;
    }

    public void setFinanceCharge(BigDecimal financeCharge) {
        this.financeCharge = financeCharge;
    }
    
    public String getGrantFund() {
        return grantFund;
    }

    public void setGrantFund(String grantFund) {
        this.grantFund = grantFund;
    }

    public Date getHandbackDate() {
        return handbackDate;
    }

    public void setHandbackDate(Date handbackDate) {
        this.handbackDate = handbackDate;
    }


    public Integer getHandbackDealerOrgId() {
        return handbackDealerOrgId;
    }

    public void setHandbackDealerOrgId(Integer handbackDealerOrgId) {
        this.handbackDealerOrgId = handbackDealerOrgId;
    }


    public BigDecimal getJointWeeklyRental() {
        return jointWeeklyRental;
    }

    public void setJointWeeklyRental(BigDecimal jointWeeklyRental) {
        this.jointWeeklyRental = jointWeeklyRental;
    }

    public String getMaintenanceAgentId() {
        return maintenanceAgentId;
    }

    public void setMaintenanceAgentId(String maintenanceAgentId) {
        this.maintenanceAgentId = maintenanceAgentId;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getUnadoptedIndicator() {
        return unadoptedIndicator;
    }

    public void setUnadoptedIndicator(String unadoptedIndicator) {
        this.unadoptedIndicator = unadoptedIndicator;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getPrimaryProductTypeId() {
        return primaryProductTypeId;
    }

    public void setPrimaryProductTypeId(Integer primaryProductTypeId) {
        this.primaryProductTypeId = primaryProductTypeId;
    }

    public Character getSelfBill() {
        return selfBill;
    }

    public void setSelfBill(Character selfBill) {
        this.selfBill = selfBill;
    }

    public Character getTerminationType() {
        return terminationType;
    }

    public void setTerminationType(Character terminationType) {
        this.terminationType = terminationType;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public Short getSchemeTypeId() {
        return schemeTypeId;
    }

    public void setSchemeTypeId(Short schemeTypeId) {
        this.schemeTypeId = schemeTypeId;
    }

    public String getSupplyInvoiceNumber() {
        return supplyInvoiceNumber;
    }

    public void setSupplyInvoiceNumber(String supplyInvoiceNumber) {
        this.supplyInvoiceNumber = supplyInvoiceNumber;
    }

    public AgreementBean() {
    }

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}


	public BigDecimal getCustHolderAmt() {
		return custHolderAmt;
	}

	public void setCustHolderAmt(BigDecimal custHolderAmt) {
		this.custHolderAmt = custHolderAmt;
	}

	public void setAgreementDeliveryDateHistoryBean(List<AgreementDeliveryDateHistoryBean> agreementDeliveryDateHistoryBeanList) {
		this.agreementDeliveryDateHistoryBean = agreementDeliveryDateHistoryBeanList;
	}

	public List<AgreementDeliveryDateHistoryBean> getAgreementDeliveryDateHistoryBean() {
		return agreementDeliveryDateHistoryBean;
	}

	public void setCustomer(CustomerBean customer) {
		this.customer =customer;
	}
	
    public CustomerBean getCustomer() {
		return customer;
	}

	public void setNominatedDrivers(List<AgreementNominatedDriverBean> nominatedDrivers) {
		this.nominatedDrivers = nominatedDrivers;
	}
	
	public  List<AgreementNominatedDriverBean> getNominatedDrivers() {
		return this.nominatedDrivers;
	}

	public void setAgreementProductBean(AgreementProductBean agreementProductBean) {
		this.agreementProductBean = agreementProductBean;
	}
	
	public AgreementProductBean getAgreementProductBean () {
		return this.agreementProductBean;
	}

	public void setProfilesBean(ProfilesBean profilesBean) {
		this.profilesBean = profilesBean;
	}
	
	public ProfilesBean getProfilesBean() {
		return this.profilesBean;
	}

	public Integer getDisabledPerson2Id() {
		return this.disabledPerson2Id;
	}

	public void setDisabledPerson2Id(Integer disabledPerson2Id) {
		this.disabledPerson2Id = disabledPerson2Id;
	}

	public Integer getAppointee2Id() {
		return appointee2Id;
	}

	public void setAppointee2Id(Integer appointee2Id) {
		this.appointee2Id=appointee2Id;
	}

	public void setNextOfKinId(Integer nextOfKinId) {
		this.nextOfKinId=nextOfKinId;
	}

	public void setMflReceiptDate(Date mflReceiptDate) {
		this.mflReceiptDate=mflReceiptDate;
	}

	public void setMflReceiptUserId(String mflReceiptUserId) {
		this.mflReceiptUserId=mflReceiptUserId;
	}

	public void setReplacementLeaseVehicleId(Integer replacementLeaseVehicleId) {
		this.replacementLeaseVehicleId=replacementLeaseVehicleId;
	}

	public void setJointAgreementContribution(Short jointAgreementContribution) {
		this.jointAgreementContribution=jointAgreementContribution;
	}

	public void setCarRegistrationNumber(String carRegistrationNumber) {
		this.carRegistrationNumber=carRegistrationNumber;
	}

	public Integer getNextOfKinId() {
		return nextOfKinId;
	}

	public Date getMflReceiptDate() {
		return mflReceiptDate;
	}

	public String getMflReceiptUserId() {
		return mflReceiptUserId;
	}

	public Integer getReplacementLeaseVehicleId() {
		return replacementLeaseVehicleId;
	}

	public Short getJointAgreementContribution() {
		return jointAgreementContribution;
	}

	public String getCarRegistrationNumber() {
		return carRegistrationNumber;
	}

    public String getNewArn() {
        return newArn;
    }

    public void setNewArn(String newArn) {
        this.newArn = newArn;
    }

    public Boolean getStleActive() {
        return stleActive;
    }

    public void setStleActive(Boolean stleActive) {
        this.stleActive = stleActive;
    }

    public Date getOriginalEndDate() {
        return originalEndDate;
    }

    public void setOriginalEndDate(Date originalEndDate) {
        this.originalEndDate = originalEndDate;
    }

    public Date getMaxExtensionEndDate() {
        return maxExtensionEndDate;
    }

    public void setMaxExtensionEndDate(Date maxExtensionEndDate) {
        this.maxExtensionEndDate = maxExtensionEndDate;
    }

    public Integer getExtensionReasonId() {
        return extensionReasonId;
    }

    public void setExtensionReasonId(Integer extensionReasonId) {
        this.extensionReasonId = extensionReasonId;
    }
}