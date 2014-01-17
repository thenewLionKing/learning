package uk.co.mo.app.mercury.domain.agreement.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;
import uk.co.mo.app.mercury.cs.entity.AuditTypes;
import uk.co.mo.app.mercury.cs.entity.MoEntity;
import uk.co.mo.app.mercury.domain.agreement.beans.AgreementBean;
import uk.co.mo.app.mercury.domain.customer.entity.CustomerEntity;
import uk.co.mo.app.mercury.domain.pin.entity.PinEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.AgreementAdaptationEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.ProfilesEntity;
import uk.co.mo.app.mercury.domain.vehicle.entity.VehicleEntity;

/**
 * A JPA Entity that models enterprise agreement.
 *
 * <p/>
 * User: PrabaT
 * Date: 08-Jan-2010
 * Time: 10:09:23
 * <p/>
 * Change Log - Who : When : Comment
 */
@Entity
@Table(name = "agreements", schema = "dbo", catalog = "Enterprise")
public class AgreementEntity extends AbstractAuditableEntity implements MoEntity, Serializable {

	private static final long serialVersionUID = -4625191164936009779L;
	private transient  final AgreementBean agreementBean = new AgreementBean();
	private Set<PinEntity> pins;
    private List<AgreementProductEntity> agreementProducts;
    private List<AgreementCP50SafeDateEntity> safeDates;
    private List<AgreementDeliveryDateHistoryEntity> deliveryDates;
    private CustomerEntity applicant;
    private CustomerEntity appointee;
    private List<AgreementDealerEntity>  agreementDealers;
	private List<AgreementAdaptationEntity> agreementAdaptationEntity;
	private VehicleEntity vehicleEntity;
	private List<AgreementNominatedDriverEntity> nominatedDrivers;
	private ProfilesEntity profilesEntity;
	
    @Transient
    public AgreementBean getAgreementBean() {
        return agreementBean;
    }

    /**
	 * @return the dealerId
	 */
	//bi-directional many-to-one association to MaintenanceAgentMaagEntity
    //@ManyToOne
	//@JoinColumn(name="dealer_id",columnDefinition = "char 5")
	//private DealerEntity dealer;
	@Column(columnDefinition = "CHAR 5 NULL")
	public String getDealerId() {
		return agreementBean.getDealerId();
	}

	/**
	 * @param dealerId the dealerId to set
	 */
	public void setDealerId(String dealerId) {
        this.agreementBean.setDealerId(dealerId);
	}

	@Id
    @Column(name = "agreement_id")
    public Integer getAgreementId() {
        return agreementBean.getAgreementId();
    }

    public void setAgreementId(Integer agreementId) {
        this.agreementBean.setAgreementId(agreementId);
    }

		//bi-directional many-to-many association to PinEntity
    @ManyToMany (cascade= CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(
		name="agreement_customer_esignature_pin"
		, joinColumns={
			@JoinColumn(name="agreement_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="pin_id")
			}
		)
    public Set<PinEntity> getPins() {
		return this.pins;
	}

	public void setPins(Set<PinEntity> pins) {
		this.pins = pins;
	}
	
    /**
    public Integer getDisabledPerson1Id() {
        return disabledPerson1Id;
    }
    public void setDisabledPerson1Id(Integer disabledPerson1Id) {
        this.disabledPerson1Id = disabledPerson1Id;
    }
    */

    @Column(columnDefinition = "CHAR 8 NULL")
    public String getArn() {
        return agreementBean.getArn();
    }

    public void setArn(String arn) {
        this.agreementBean.setArn(arn);
    }


    @Column(name="agreement_status",   columnDefinition="tinyInt")
    public Short getAgreementStatus() {    
        return this.agreementBean.getAgreementStatus();
    }    
    
    public void setAgreementStatus(Short agreementStatus) {
        this.agreementBean.setAgreementStatus(agreementStatus);
    }    
    
    @Column(name="application_accepted_date")
    public Date getApplicationAcceptedDate() {
        return this.agreementBean.getApplicationAcceptedDate();
    }    
    
    public void setApplicationAcceptedDate(Date applicationAcceptedDate) {
        this.agreementBean.setApplicationAcceptedDate(applicationAcceptedDate);
    }    
    
    @Column(name="asset_number")
    public Integer getAssetNumber() {
        return this.agreementBean.getAssetNumber();
    }    
    
    public void setAssetNumber(Integer assetNumber) {
        this.agreementBean.setAssetNumber(assetNumber);
    }    

    @Column(name="chassis_number")
    public String getChassisNumber() {
        return this.agreementBean.getChassisNumber();
    }    
    
    public void setChassisNumber(String chassisNumber) {
        this.agreementBean.setChassisNumber(chassisNumber);
    }
    
    @Column(columnDefinition = "CHAR 7 NULL")
    public String getAuthorisecode() {
        return this.agreementBean.getAuthorisecode();
    }    
    
    public void setAuthorisecode(String authorisecode) {
        this.agreementBean.setAuthorisecode(authorisecode);
    }    
    
    @Column(name="creation_source_id")
    public Integer getCreationSourceId() {
        return this.agreementBean.getCreationSourceId();
    }    
    
    public void setCreationSourceId(Integer creationSourceId) {
        this.agreementBean.setCreationSourceId(creationSourceId);
    }    
    
    @Column(name="end_date")
    public Date getEndDate() {
        return this.agreementBean.getEndDate();
    }    
    
    public void setEndDate(Date endDate) {
        this.agreementBean.setEndDate(endDate);
    }    
    
    @Column(name="entry_date")
    public Date getEntryDate() {
        return this.agreementBean.getEntryDate();
    }    
    
    public void setEntryDate(Date entryDate) {
        this.agreementBean.setEntryDate(entryDate);
    }    
    
    @Column(name="finance_amount",columnDefinition = "money")
    public BigDecimal getFinanceAmount() {
        return this.agreementBean.getFinanceAmount();
    }    
    
    public void setFinanceAmount(BigDecimal financeAmount) {
        this.agreementBean.setFinanceAmount(financeAmount);
    }    
    
    @Column(name="cust_holder_amt",columnDefinition = "money")
    public BigDecimal getCustHolderAmt() {
        return this.agreementBean.getCustHolderAmt();
    }    
    
    public void setCustHolderAmt(BigDecimal custHolderAmt) {
        this.agreementBean.setCustHolderAmt(custHolderAmt);
    } 
    
    @Column(name="finance_charge",columnDefinition = "money")
    public BigDecimal getFinanceCharge() {
        return this.agreementBean.getFinanceCharge();
    }    
    
    public void setFinanceCharge(BigDecimal financeCharge) {
        this.agreementBean.setFinanceCharge(financeCharge);
    }    

    @Column(name="grant_fund" , columnDefinition = "CHAR 10")
    public String getGrantFund() {    
        return this.agreementBean.getGrantFund();
    }    
    
    public void setGrantFund(String grantFund) {
        this.agreementBean.setGrantFund(grantFund);
    }    
    
    @Column(name="handback_date")
    public Date getHandbackDate() {
        return this.agreementBean.getHandbackDate();
    }    
    
    public void setHandbackDate(Date handbackDate) {
        this.agreementBean.setHandbackDate(handbackDate);
    }    
    
    @Column(name="handback_dealer_org_id")
    public Integer getHandbackDealerOrgId() {
        return this.agreementBean.getHandbackDealerOrgId();
    }    
    
    public void setHandbackDealerOrgId(Integer handbackDealerOrgId) {
        this.agreementBean.setHandbackDealerOrgId(handbackDealerOrgId);
    }    
    
    @Column(name="joint_weekly_rental", columnDefinition = "smallmoney")
    public BigDecimal getJointWeeklyRental() {
        return this.agreementBean.getJointWeeklyRental();
    }    
    
    public void setJointWeeklyRental(BigDecimal jointWeeklyRental) {
        this.agreementBean.setJointWeeklyRental(jointWeeklyRental);
    }    
    
    @Column(name="maintenance_agent_id",columnDefinition = "char 5")
    public String getMaintenanceAgentId() {
        return this.agreementBean.getMaintenanceAgentId();
    }    
    
    public void setMaintenanceAgentId(String maintenanceAgentId) {
        this.agreementBean.setMaintenanceAgentId(maintenanceAgentId);
    }    
    
    @Column(name="row_insert_date")
    public Date getInsertDate() {
        return this.agreementBean.getInsertDate();
    }    
    
    public void setInsertDate(Date insertDate) {
        this.agreementBean.setInsertDate(insertDate);
    }    
    
    @Column(name="row_update_date")
    public Date getUpdateDate() {
        return this.agreementBean.getUpdateDate();
    }    
    
    public void setUpdateDate(Date updateDate) {
        this.agreementBean.setUpdateDate(updateDate);
    }    
    
    @Column(name="start_date")
    public Date getStartDate() {
        return this.agreementBean.getStartDate();
    }    
    
    public void setStartDate(Date startDate) {
        this.agreementBean.setStartDate(startDate);
    }    
    
    @Column(name="unadopted_indicator", columnDefinition = "char 1")
    public String getUnadoptedIndicator() {
        return this.agreementBean.getUnadoptedIndicator();
    }    
    
    public void setUnadoptedIndicator(String unadoptedIndicator) {
        this.agreementBean.setUnadoptedIndicator(unadoptedIndicator);
    }    
    
    @Column(name="update_user")
    public String getUpdateUser() {
        return this.agreementBean.getUpdateUser();
    }    
    
    public void setUpdateUser(String updateUser) {
        this.agreementBean.setUpdateUser(updateUser);
    }    

    //bi-directional many-to-one association to AgreementProductEntity
	@OneToMany(mappedBy="agreement" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<AgreementProductEntity> getAgreementProducts() {
        return this.agreementProducts;        
    }

    @Transient
    public AgreementProductEntity getAgreementProductEntity() {
        List productEntities = getAgreementProducts();
        AgreementProductEntity entity = (productEntities != null
                ? (AgreementProductEntity)productEntities.get(0) : null);

        if(entity != null) {
            addObserver(createObserver(entity));
        }

        return entity;
    }
    
    public void setAgreementProducts(List<AgreementProductEntity> agreementProducts) {    
        this.agreementProducts = agreementProducts;        
    }
    
    public void addAgreementProduct(final AgreementProductEntity agreementProduct) {
    	if(this.agreementProducts==null) this.agreementProducts = new ArrayList();
    	addObserver(createObserver(agreementProduct));
        this.agreementProducts.add(agreementProduct);
    }

    private Observer createObserver(final AgreementProductEntity agreementProduct) {
        return new Observer(){
            private AgreementProductEntity product = agreementProduct;
            public void update(Observable o,Object args){
                product.audit((AuditTypes)args);
            }
        };
    }

    public void addSafeDates(final AgreementCP50SafeDateEntity safeDate) {
      	if(this.safeDates==null) this.safeDates = new ArrayList<AgreementCP50SafeDateEntity>();
        this.safeDates.add(safeDate);
        
    }

    @OneToMany(mappedBy="agreement" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<AgreementCP50SafeDateEntity> getSafeDates(){
    	return this.safeDates;
    }

    public void setSafeDates(List<AgreementCP50SafeDateEntity> safeDates) {
        this.safeDates = safeDates;
    }

    public void addDeliveryDates(final AgreementDeliveryDateHistoryEntity deliveryDates) {
    	if(this.deliveryDates==null) new ArrayList<AgreementDeliveryDateHistoryEntity>();
        this.deliveryDates.add(deliveryDates);
        
    }

    @OneToMany(mappedBy="agreement" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<AgreementDeliveryDateHistoryEntity> getDeliveryDates() {
        return deliveryDates;
    }

    public void setDeliveryDates(List<AgreementDeliveryDateHistoryEntity> deliveryDates) {
        this.deliveryDates = deliveryDates;
    }

    /**
	 * @param applicant the applicant to set
	 */
	public void setApplicant(CustomerEntity applicant) {
		this.applicant = applicant;
	}


    /**
	 * @return the applicant
	 */
    //bi-directional many-to-one association to CustomerEntity
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH}, targetEntity = CustomerEntity.class, fetch = FetchType.LAZY)
	@JoinColumn(name="disabled_person1_id", referencedColumnName="customer_id")
    @NotNull
    public CustomerEntity getApplicant() {
		return applicant;
	}

	/**
	 * @return the appointee
     */
	//bi-directional many-to-one association to CustomerEntity
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH}, targetEntity = CustomerEntity.class, fetch = FetchType.LAZY)
	@JoinColumn(name="appointee1_id" , referencedColumnName="customer_id")
    public CustomerEntity getAppointee() {
		return appointee;
	}



	/**
	 * @param appointee the appointee to set
	 */
	public void setAppointee(CustomerEntity appointee) {
		this.appointee = appointee;
	}

	/**
	 * @return the primaryProductTypeId
	 */
	@Column(name="primary_product_type_id")
    public Integer getPrimaryProductTypeId() {
		return agreementBean.getPrimaryProductTypeId();
	}

	/**
	 * @param primaryProductTypeId the primaryProductTypeId to set
	 */
	public void setPrimaryProductTypeId(Integer primaryProductTypeId) {
        this.agreementBean.setPrimaryProductTypeId(primaryProductTypeId);
	}

    @Column(name="self_bill")
    public Character getSelfBill() {
        return agreementBean.getSelfBill();
    }

    public void setSelfBill(Character selfBill) {
        this.agreementBean.setSelfBill(selfBill);
    }

    @Column(name="disabled_person2_id")
    public Integer getDisabledPerson2Id() {
        return agreementBean.getDisabledPerson2Id();
    }

    public void setDisabledPerson2Id(Integer disabledPerson2Id) {
        this.agreementBean.setDisabledPerson2Id(disabledPerson2Id);
    }
    
    @Column(name="appointee2_id")
    public Integer getAppointee2Id() {
        return agreementBean.getAppointee2Id();
    }

    public void setAppointee2Id(Integer appointee2Id) {
        this.agreementBean.setAppointee2Id(appointee2Id);
    }
    
    @Column(name="next_of_kin_id")
    public Integer getNextOfKinId() {
        return agreementBean.getNextOfKinId();
    }

    public void setNextOfKinId(Integer nextOfKinId) {
        this.agreementBean.setNextOfKinId(nextOfKinId);
    }    

    @Column(name="mfl_receipt_date", columnDefinition="SMALLDATETIME")
    public Date getMflReceiptDate() {
        return agreementBean.getMflReceiptDate();
    }

    public void setMflReceiptDate(Date mflReceiptDate) {
        this.agreementBean.setMflReceiptDate(mflReceiptDate);
    }    
    
    @Column(name="mfl_receipt_user_id")
    public String getMflReceiptUserId() {
        return agreementBean.getMflReceiptUserId();
    }

    public void setMflReceiptUserId(String mflReceiptUserId) {
        this.agreementBean.setMflReceiptUserId(mflReceiptUserId);
    }    
    
    @Column(name="replacement_lease_vehicle_id")
    public Integer getReplacementLeaseVehicleId() {
        return agreementBean.getReplacementLeaseVehicleId();
    }

    public void setReplacementLeaseVehicleId(Integer replacementLeaseVehicleId) {
        this.agreementBean.setReplacementLeaseVehicleId(replacementLeaseVehicleId);
    }
    
    @Column(name="joint_agreement_contribution", columnDefinition="TINYINT")
    public Short getJointAgreementContribution() {
        return agreementBean.getJointAgreementContribution();
    }

    public void setJointAgreementContribution(Short jointAgreementContribution) {
        this.agreementBean.setJointAgreementContribution(jointAgreementContribution);
    }    
    
    @Column(name="car_registration_number", columnDefinition="CHAR")
    public String getCarRegistrationNumber() {
        return agreementBean.getCarRegistrationNumber();
    }

    public void setCarRegistrationNumber(String carRegistrationNumber) {
        this.agreementBean.setCarRegistrationNumber(carRegistrationNumber);
    }
    
    
    
    @Column(name="invoice_number")
    public String getSupplyInvoiceNumber() {
        return agreementBean.getSupplyInvoiceNumber();
    }

    public void setSupplyInvoiceNumber(String supplyInvoiceNumber) {
        this.agreementBean.setSupplyInvoiceNumber(supplyInvoiceNumber);
    }

	/**
	 * @return the schemeTypeId
	 */
	@Column(name="scheme_type_id" , columnDefinition = "tinyint")
    public Short getSchemeTypeId() {
		return agreementBean.getSchemeTypeId();
	}

	/**
	 * @param schemeType the schemeTypeId to set
	 */
	public void setSchemeTypeId(Short schemeType) {
        this.agreementBean.setSchemeTypeId(schemeType);
	}

    /**
	 * @return the agreementDealers
	 */
	@OneToMany(mappedBy="id.agreement" ,cascade = CascadeType.ALL)
    public List<AgreementDealerEntity> getAgreementDealers() {
		return agreementDealers;
	}

    public void setAgreementDealers(List<AgreementDealerEntity> agreementDealers) {
        this.agreementDealers = agreementDealers;
    }

    /**
	 * @param agreementDealer the agreementDealers to set
	 */
	public void addAgreementDealer(AgreementDealerEntity agreementDealer) {
		if(this.agreementDealers == null) this.agreementDealers = new ArrayList<AgreementDealerEntity>(0);
		this.agreementDealers.add(agreementDealer);
	}

	/**
	 * @return the terminationType
	 */
	@Column(name="termination_type", columnDefinition = "char 1")
    public Character getTerminationType() {
		return agreementBean.getTerminationType();
	}

	/**
	 * @param terminationType the terminationType to set
	 */
	public void setTerminationType(Character terminationType) {
        this.agreementBean.setTerminationType(terminationType);
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "agreement_id", referencedColumnName= "agreement_id")
	public List<AgreementAdaptationEntity> getAgreementAdaptationEntity() {
    	return this.agreementAdaptationEntity;
	}
	    
	public void setAgreementAdaptationEntity(List<AgreementAdaptationEntity> agreementAdaptationEntity) {
	   	this.agreementAdaptationEntity = agreementAdaptationEntity;
	}
	
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_number", referencedColumnName= "asset_number", insertable=false, updatable=false, nullable = false)
    public VehicleEntity getVehicleEntity(){
    	return this.vehicleEntity;
    }
    public void setVehicleEntity(VehicleEntity vehicleEntity){
    	this.vehicleEntity = vehicleEntity;
    }

	@OneToMany(mappedBy="agreement" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public List<AgreementNominatedDriverEntity> getNominatedDrivers() {
		return this.nominatedDrivers;
	}

	public void setNominatedDrivers(List<AgreementNominatedDriverEntity> nominatedDrivers) {
		this.nominatedDrivers = nominatedDrivers;
	}

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_code", referencedColumnName= "profile_code", insertable=false, updatable=false, nullable = false)
	public ProfilesEntity getProfilesEntity() {
		return this.profilesEntity;
	}
	public void setProfilesEntity(ProfilesEntity profilesEntity) {
		this.profilesEntity = profilesEntity;
	}
}
