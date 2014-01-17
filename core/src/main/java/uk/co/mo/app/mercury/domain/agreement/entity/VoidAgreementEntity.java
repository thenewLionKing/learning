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
@Table(name = "void_agreements", schema = "dbo", catalog = "Enterprise")
public class VoidAgreementEntity implements Serializable {

	private static final long serialVersionUID = -4625191164936009779L;
	private transient  final AgreementBean agreementBean = new AgreementBean();
	
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
    

    @Column(name="grant_fund" , columnDefinition = "CHAR 10")
    public String getGrantFund() {    
        return this.agreementBean.getGrantFund();
    }    
    
    public void setGrantFund(String grantFund) {
        this.agreementBean.setGrantFund(grantFund);
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
    

    @Column(name="invoice_number")
    public String getSupplyInvoiceNumber() {
        return agreementBean.getSupplyInvoiceNumber();
    }

    public void setSupplyInvoiceNumber(String supplyInvoiceNumber) {
        this.agreementBean.setSupplyInvoiceNumber(supplyInvoiceNumber);
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
	
/*	@OneToMany(mappedBy="agreement" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public List<AgreementNominatedDriverEntity> getNominatedDrivers() {
		return this.nominatedDrivers;
	}

	public void setNominatedDrivers(List<AgreementNominatedDriverEntity> nominatedDrivers) {
		this.nominatedDrivers = nominatedDrivers;
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

    *//**
	 * @param applicant the applicant to set
	 *//*
	public void setApplicant(CustomerEntity applicant) {
		this.applicant = applicant;
	}


    *//**
	 * @return the applicant
	 *//*
    //bi-directional many-to-one association to CustomerEntity
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH}, targetEntity = CustomerEntity.class, fetch = FetchType.LAZY)
	@JoinColumn(name="disabled_person1_id", referencedColumnName="customer_id")
    @NotNull
    public CustomerEntity getApplicant() {
		return applicant;
	}*/

	
}
