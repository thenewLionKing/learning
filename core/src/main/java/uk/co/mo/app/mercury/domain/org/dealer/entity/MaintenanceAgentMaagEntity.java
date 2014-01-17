package uk.co.mo.app.mercury.domain.org.dealer.entity;

import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerBean;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerCategory;
import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerPartner;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * <p/>
 * User: prabat
 * Date: 13-May-2011
 * Time: 12:14:47
 * <p/>
 * Change Log - Who : When : Comment
 */
@javax.persistence.Table(name = "maintenance_agent_maag", schema = "dbo", catalog = "Enterprise")
@Entity
public class MaintenanceAgentMaagEntity implements Serializable {

	private static final long serialVersionUID = -8146068112499923960L;

	private DealerBean dealerBean = new DealerBean();
    
	private List<DealerFcsDateEntity> fcsDates;
    private MaintenanceAgentExtraEntity extra;
    private List<DealerGroupDealersLinkEntity> dealerGroupLinks;
    private List<DealerCoverageEntity> coverageEntities;
    private List<DealerProductTypeEntity> productTypes;
    

    @Transient
    public DealerBean getDealerBean() {
        return dealerBean;
    }

    public void setDealerBean(DealerBean dealerBean) {
        this.dealerBean = dealerBean;
    }

    @javax.persistence.Column(name = "agent_number", insertable = true, updatable = true, columnDefinition = "CHAR 8 NOT NULL")
    @Id
    public String getAgentNumber() {
        return dealerBean.getAgentNumber();
    }

    public void setAgentNumber(String agentNumber) {
        this.dealerBean.setAgentNumber(agentNumber);
    }

    @javax.persistence.Column(name = "agent_address1", nullable = true, insertable = true, updatable = true, length = 30, precision = 0)
    @Basic
    public String getAgentAddress1() {
        return dealerBean.getAgentAddress1();
    }

    public void setAgentAddress1(String agentAddress1) {
        this.dealerBean.setAgentAddress1(agentAddress1);
    }

    @javax.persistence.Column(name = "agent_address2", nullable = true, insertable = true, updatable = true, length = 30, precision = 0)
    @Basic
    public String getAgentAddress2() {
        return dealerBean.getAgentAddress2();
    }

    public void setAgentAddress2(String agentAddress2) {
        this.dealerBean.setAgentAddress2(agentAddress2);
    }

    @javax.persistence.Column(name = "agent_address3", nullable = true, insertable = true, updatable = true, length = 30, precision = 0)
    @Basic
    public String getAgentAddress3() {
        return dealerBean.getAgentAddress3();
    }

    public void setAgentAddress3(String agentAddress3) {
        this.dealerBean.setAgentAddress3(agentAddress3);
    }

    @javax.persistence.Column(name = "agent_address4", nullable = true, insertable = true, updatable = true, length = 30, precision = 0)
    @Basic
    public String getAgentAddress4() {
        return dealerBean.getAgentAddress4();
    }

    public void setAgentAddress4(String agentAddress4) {
        this.dealerBean.setAgentAddress4(agentAddress4);
    }

    @javax.persistence.Column(name = "agent_postcode", insertable = true, updatable = true, columnDefinition = "CHAR 8 NULL")
    @Basic
    public String getAgentPostcode() {
        return dealerBean.getAgentPostcode();
    }

    public void setAgentPostcode(String agentPostcode) {
        this.dealerBean.setAgentPostcode(agentPostcode);
    }

    @javax.persistence.Column(name = "agent_ref_code", insertable = true, updatable = true, columnDefinition = "CHAR 10 NULL")
    @Basic
    public String getAgentRefCode() {
        return dealerBean.getAgentRefCode();
    }

    public void setAgentRefCode(String agentRefCode) {
        this.dealerBean.setAgentRefCode(agentRefCode);
    }

    @javax.persistence.Column(name = "agent_vat_number", insertable = true, updatable = true, columnDefinition = "CHAR 9 NULL")
    @Basic
    public String getAgentVatNumber() {
        return dealerBean.getAgentVatNumber();
    }

    public void setAgentVatNumber(String agentVatNumber) {
        this.dealerBean.setAgentVatNumber(agentVatNumber);
    }

    @javax.persistence.Column(name = "agent_account", insertable = true, updatable = true, columnDefinition = "CHAR 8 NULL")
    @Basic
    public String getAgentAccount() {
        return dealerBean.getAgentAccount();
    }

    public void setAgentAccount(String agentAccount) {
        this.dealerBean.setAgentAccount(agentAccount);
    }

    @javax.persistence.Column(name = "agent_sort_code", insertable = true, updatable = true, columnDefinition = "CHAR 6 NULL")
    @Basic
    public String getAgentSortCode() {
        return dealerBean.getAgentSortCode();
    }

    public void setAgentSortCode(String agentSortCode) {
        this.dealerBean.setAgentSortCode(agentSortCode);
    }

    @javax.persistence.Column(name = "agent_approve_flag", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getAgentApproveFlag() {
        return dealerBean.getAgentApproveFlag();
    }

    public void setAgentApproveFlag(String agentApproveFlag) {
        this.dealerBean.setAgentApproveFlag(agentApproveFlag);
    }

    @javax.persistence.Column(name = "agent_agree_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getAgentAgreeDate() {
        return dealerBean.getAgentAgreeDate();
    }

    public void setAgentAgreeDate(Date agentAgreeDate) {
        this.dealerBean.setAgentAgreeDate(agentAgreeDate);
    }

    @javax.persistence.Column(name = "payment_method", insertable = true, updatable = true, columnDefinition = "CHAR 2 NULL")
    @Basic
    public String getPaymentMethod() {
        return dealerBean.getPaymentMethod();
    }

    public void setPaymentMethod(String paymentMethod) {
        this.dealerBean.setPaymentMethod(paymentMethod);
    }

    @javax.persistence.Column(name = "payment_term", insertable = true, updatable = true, columnDefinition = "CHAR 4 NULL")
    @Basic
    public String getPaymentTerm() {
        return dealerBean.getPaymentTerm();
    }

    public void setPaymentTerm(String paymentTerm) {
        this.dealerBean.setPaymentTerm(paymentTerm);
    }

    @javax.persistence.Column(name = "agent_type_flag", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getAgentTypeFlag() {
        return dealerBean.getAgentTypeFlag();
    }

    public void setAgentTypeFlag(String agentTypeFlag) {
        this.dealerBean.setAgentTypeFlag(agentTypeFlag);
    }

    @javax.persistence.Column(name = "vehicle_manufacturer_code", insertable = true, updatable = true, columnDefinition = "CHAR 2 NULL")
    @Basic
    public String getVehicleManufacturerCode() {
        return dealerBean.getVehicleManufacturerCode();
    }

    public void setVehicleManufacturerCode(String vehicleManufacturerCode) {
        this.dealerBean.setVehicleManufacturerCode(vehicleManufacturerCode);
    }

    @javax.persistence.Column(name = "maintenance_agent_link", insertable = true, updatable = true, columnDefinition = "CHAR 5 NULL")
    @Basic
    public String getMaintenanceAgentLink() {
        return dealerBean.getMaintenanceAgentLink();
    }

    public void setMaintenanceAgentLink(String maintenanceAgentLink) {
        this.dealerBean.setMaintenanceAgentLink(maintenanceAgentLink);
    }

    @javax.persistence.Column(name = "company_reference_number", insertable = true, updatable = true, columnDefinition = "CHAR 7 NULL")
    @Basic
    public String getCompanyReferenceNumber() {
        return dealerBean.getCompanyReferenceNumber();
    }

    public void setCompanyReferenceNumber(String companyReferenceNumber) {
        this.dealerBean.setCompanyReferenceNumber(companyReferenceNumber);
    }

    @javax.persistence.Column(name = "blacklist_hp_supp", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getBlacklistHpSupp() {
        return dealerBean.getBlacklistHpSupp();
    }

    public void setBlacklistHpSupp(String blacklistHpSupp) {
        this.dealerBean.setBlacklistHpSupp(blacklistHpSupp);
    }

    @javax.persistence.Column(name = "blacklist_lease_supp", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getBlacklistLeaseSupp() {
        return dealerBean.getBlacklistLeaseSupp();
    }

    public void setBlacklistLeaseSupp(String blacklistLeaseSupp) {
        this.dealerBean.setBlacklistLeaseSupp(blacklistLeaseSupp);
    }

    @javax.persistence.Column(name = "blacklist_reason_supp", insertable = true, updatable = true, columnDefinition = "CHAR 40 NULL")
    @Basic
    public String getBlacklistReasonSupp() {
        return dealerBean.getBlacklistReasonSupp();
    }

    public void setBlacklistReasonSupp(String blacklistReasonSupp) {
        this.dealerBean.setBlacklistReasonSupp(blacklistReasonSupp);
    }

    @javax.persistence.Column(name = "blacklist_lease_ma", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getBlacklistLeaseMa() {
        return dealerBean.getBlacklistLeaseMa();
    }

    public void setBlacklistLeaseMa(String blacklistLeaseMa) {
        this.dealerBean.setBlacklistLeaseMa(blacklistLeaseMa);
    }

    @javax.persistence.Column(name = "blacklist_reason_ma", insertable = true, updatable = true, columnDefinition = "CHAR 40 NULL")
    @Basic
    public String getBlacklistReasonMa() {
        return dealerBean.getBlacklistReasonMa();
    }

    public void setBlacklistReasonMa(String blacklistReasonMa) {
        this.dealerBean.setBlacklistReasonMa(blacklistReasonMa);
    }

    @javax.persistence.Column(name = "commitment_block", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getCommitmentBlock() {
        return dealerBean.getCommitmentBlock();
    }

    public void setCommitmentBlock(String commitmentBlock) {
        this.dealerBean.setCommitmentBlock(commitmentBlock);
    }

    @javax.persistence.Column(name = "telephone_number", insertable = true, updatable = true, columnDefinition = "CHAR 15 NULL")
    @Basic
    public String getTelephoneNumber() {
        return dealerBean.getTelephoneNumber();
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.dealerBean.setTelephoneNumber(telephoneNumber);
    }

    @javax.persistence.Column(name = "fax_number", insertable = true, updatable = true, columnDefinition = "CHAR 15 NULL")
    @Basic
    public String getFaxNumber() {
        return dealerBean.getFaxNumber();
    }

    public void setFaxNumber(String faxNumber) {
        this.dealerBean.setFaxNumber(faxNumber);
    }

    @javax.persistence.Column(name = "ma_abs_lim", nullable = true, insertable = true, updatable = true, length = 19, precision = 4, columnDefinition = "money")
    @Basic
    public BigDecimal getMaAbsLim() {
        return dealerBean.getMaAbsLim();
    }

    public void setMaAbsLim(BigDecimal maAbsLim) {
        this.dealerBean.setMaAbsLim(maAbsLim);
    }

    @javax.persistence.Column(name = "ma_war_lim", nullable = true, insertable = true, updatable = true, length = 19, precision = 4, columnDefinition = "money")
    @Basic
    public BigDecimal getMaWarLim() {
        return dealerBean.getMaWarLim();
    }

    public void setMaWarLim(BigDecimal maWarLim) {
        this.dealerBean.setMaWarLim(maWarLim);
    }

    @javax.persistence.Column(name = "ma_pend_com", nullable = true, insertable = true, updatable = true, length = 19, precision = 4, columnDefinition = "money")
    @Basic
    public BigDecimal getMaPendCom() {
        return dealerBean.getMaPendCom();
    }

    public void setMaPendCom(BigDecimal maPendCom) {
        this.dealerBean.setMaPendCom(maPendCom);
    }

    @javax.persistence.Column(name = "ma_act_com", nullable = true, insertable = true, updatable = true, length = 19, precision = 4, columnDefinition = "money")
    @Basic
    public BigDecimal getMaActCom() {
        return dealerBean.getMaActCom();
    }

    public void setMaActCom(BigDecimal maActCom) {
        this.dealerBean.setMaActCom(maActCom);
    }

    @javax.persistence.Column(name = "ma_repeat", nullable = true, insertable = true, updatable = true, length = 19, precision = 4, columnDefinition = "money")
    @Basic
    public BigDecimal getMaRepeat() {
        return dealerBean.getMaRepeat();
    }

    public void setMaRepeat(BigDecimal maRepeat) {
        this.dealerBean.setMaRepeat(maRepeat);
    }

    @javax.persistence.Column(name = "ma_liability", nullable = true, insertable = true, updatable = true, length = 19, precision = 4, columnDefinition = "money")
    @Basic
    public BigDecimal getMaLiability() {
        return dealerBean.getMaLiability();
    }

    public void setMaLiability(BigDecimal maLiability) {
        this.dealerBean.setMaLiability(maLiability);
    }

    @javax.persistence.Column(name = "reminder_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getReminderDate() {
        return dealerBean.getReminderDate();
    }

    public void setReminderDate(Date reminderDate) {
        this.dealerBean.setReminderDate(reminderDate);
    }

    @javax.persistence.Column(name = "renewal_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getRenewalDate() {
        return dealerBean.getRenewalDate();
    }

    public void setRenewalDate(Date renewalDate) {
        this.dealerBean.setRenewalDate(renewalDate);
    }

    @javax.persistence.Column(name = "hps_only_indicator", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    @Basic
    public Short getHpsOnlyIndicator() {
        return dealerBean.getHpsOnlyIndicator();
    }

    public void setHpsOnlyIndicator(Short hpsOnlyIndicator) {
        this.dealerBean.setHpsOnlyIndicator(hpsOnlyIndicator);
    }

    @javax.persistence.Column(name = "magtape_diskette", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getMagtapeDiskette() {
        return dealerBean.getMagtapeDiskette();
    }

    public void setMagtapeDiskette(String magtapeDiskette) {
        this.dealerBean.setMagtapeDiskette(magtapeDiskette);
    }

    @javax.persistence.Column(name = "dealer_account", insertable = true, updatable = true, columnDefinition = "CHAR 8 NULL")
    @Basic
    public String getDealerAccount() {
        return dealerBean.getDealerAccount();
    }

    public void setDealerAccount(String dealerAccount) {
        this.dealerBean.setDealerAccount(dealerAccount);
    }

    @javax.persistence.Column(name = "dealer_sort_code", insertable = true, updatable = true, columnDefinition = "CHAR 6 NULL")
    @Basic
    public String getDealerSortCode() {
        return dealerBean.getDealerSortCode();
    }

    public void setDealerSortCode(String dealerSortCode) {
        this.dealerBean.setDealerSortCode(dealerSortCode);
    }

    @javax.persistence.Column(name = "dealer_payment_method", insertable = true, updatable = true, columnDefinition = "CHAR 2 NULL")
    @Basic
    public String getDealerPaymentMethod() {
        return dealerBean.getDealerPaymentMethod();
    }

    public void setDealerPaymentMethod(String dealerPaymentMethod) {
        this.dealerBean.setDealerPaymentMethod(dealerPaymentMethod);
    }

    @javax.persistence.Column(name = "service_agent_account", insertable = true, updatable = true, columnDefinition = "CHAR 8 NULL")
    @Basic
    public String getServiceAgentAccount() {
        return dealerBean.getServiceAgentAccount();
    }

    public void setServiceAgentAccount(String serviceAgentAccount) {
        this.dealerBean.setServiceAgentAccount(serviceAgentAccount);
    }

    @javax.persistence.Column(name = "service_agent_sort_code", insertable = true, updatable = true, columnDefinition = "CHAR 6 NULL")
    @Basic
    public String getServiceAgentSortCode() {
        return dealerBean.getServiceAgentSortCode();
    }

    public void setServiceAgentSortCode(String serviceAgentSortCode) {
        this.dealerBean.setServiceAgentSortCode(serviceAgentSortCode);
    }

    @javax.persistence.Column(name = "service_agent_payment_method", insertable = true, updatable = true, columnDefinition = "CHAR 2 NULL")
    @Basic
    public String getServiceAgentPaymentMethod() {
        return dealerBean.getServiceAgentPaymentMethod();
    }

    public void setServiceAgentPaymentMethod(String serviceAgentPaymentMethod) {
        this.dealerBean.setServiceAgentPaymentMethod(serviceAgentPaymentMethod);
    }

    @javax.persistence.Column(name = "fleet_size", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getFleetSize() {
        return dealerBean.getFleetSize();
    }

    public void setFleetSize(Integer fleetSize) {
        this.dealerBean.setFleetSize(fleetSize);
    }

    @javax.persistence.Column(name = "easting", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getEasting() {
        return dealerBean.getEasting();
    }

    public void setEasting(Integer easting) {
        this.dealerBean.setEasting(easting);
    }

    @javax.persistence.Column(name = "northing", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getNorthing() {
        return dealerBean.getNorthing();
    }

    public void setNorthing(Integer northing) {
        this.dealerBean.setNorthing(northing);
    }

    @javax.persistence.Column(name = "comment1", nullable = true, insertable = true, updatable = true, length = 38, precision = 0)
    @Basic
    public String getComment1() {
        return dealerBean.getComment1();
    }

    public void setComment1(String comment1) {
        this.dealerBean.setComment1(comment1);
    }

    @javax.persistence.Column(name = "comment2", nullable = true, insertable = true, updatable = true, length = 38, precision = 0)
    @Basic
    public String getComment2() {
        return dealerBean.getComment2();
    }

    public void setComment2(String comment2) {
        this.dealerBean.setComment2(comment2);
    }

    @javax.persistence.Column(name = "comment3", nullable = true, insertable = true, updatable = true, length = 38, precision = 0)
    @Basic
    public String getComment3() {
        return dealerBean.getComment3();
    }

    public void setComment3(String comment3) {
        this.dealerBean.setComment3(comment3);
    }

    @javax.persistence.Column(name = "comment4", nullable = true, insertable = true, updatable = true, length = 38, precision = 0)
    @Basic
    public String getComment4() {
        return dealerBean.getComment4();
    }

    public void setComment4(String comment4) {
        this.dealerBean.setComment4(comment4);
    }

    @javax.persistence.Column(name = "comment5", nullable = true, insertable = true, updatable = true, length = 38, precision = 0)
    @Basic
    public String getComment5() {
        return dealerBean.getComment5();
    }

    public void setComment5(String comment5) {
        this.dealerBean.setComment5(comment5);
    }

    @javax.persistence.Column(name = "comment6", nullable = true, insertable = true, updatable = true, length = 38, precision = 0)
    @Basic
    public String getComment6() {
        return dealerBean.getComment6();
    }

    public void setComment6(String comment6) {
        this.dealerBean.setComment6(comment6);
    }

    @javax.persistence.Column(name = "comment7", nullable = true, insertable = true, updatable = true, length = 38, precision = 0)
    @Basic
    public String getComment7() {
        return dealerBean.getComment7();
    }

    public void setComment7(String comment7) {
        this.dealerBean.setComment7(comment7);
    }


    @javax.persistence.Column(name = "web_enabled", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getWebEnabled() {
        return dealerBean.getWebEnabled();
    }

    public void setWebEnabled(String webEnabled) {
        this.dealerBean.setWebEnabled(webEnabled);
    }

    @javax.persistence.Column(name = "credit_limit", nullable = true, insertable = true, updatable = true, length = 19, precision = 4, columnDefinition = "money")
    @Basic
    public BigDecimal getCreditLimit() {
        return dealerBean.getCreditLimit();
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.dealerBean.setCreditLimit(creditLimit);
    }

    @javax.persistence.Column(name = "credit_outstanding", nullable = true, insertable = true, updatable = true, length = 19, precision = 4, columnDefinition = "money")
    @Basic
    public BigDecimal getCreditOutstanding() {
        return dealerBean.getCreditOutstanding();
    }

    public void setCreditOutstanding(BigDecimal creditOutstanding) {
        this.dealerBean.setCreditOutstanding(creditOutstanding);
    }

    @javax.persistence.Column(name = "Publisher_Id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getPublisherId() {
        return dealerBean.getPublisherId();
    }

    public void setPublisherId(Integer publisherId) {
        this.dealerBean.setPublisherId(publisherId);
    }

    @javax.persistence.Column(name = "grm_dealer_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getGrmDealerId() {
        return dealerBean.getGrmDealerId();
    }

    public void setGrmDealerId(Integer grmDealerId) {
        this.dealerBean.setGrmDealerId(grmDealerId);
    }

    @javax.persistence.Column(name = "Last_User", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    @Basic
    public String getLastUser() {
        return dealerBean.getLastUser();
    }

    public void setLastUser(String lastUser) {
        this.dealerBean.setLastUser(lastUser);
    }

    @javax.persistence.Column(name = "Last_Update", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getLastUpdate() {
        return dealerBean.getLastUpdate();
    }

    public void setLastUpdate(Date lastUpdate) {
        this.dealerBean.setLastUpdate(lastUpdate);
    }

    @javax.persistence.Column(name = "fcs_accred_dealer", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getFcsAccredDealer() {
        return dealerBean.getFcsAccredDealer();
    }

    public void setFcsAccredDealer(String fcsAccredDealer) {
        this.dealerBean.setFcsAccredDealer(fcsAccredDealer);
    }

    @javax.persistence.Column(name = "franchise_dealer_ind", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getFranchiseDealerInd() {
        return dealerBean.getFranchiseDealerInd();
    }

    public void setFranchiseDealerInd(String franchiseDealerInd) {
        this.dealerBean.setFranchiseDealerInd(franchiseDealerInd);
    }

    @javax.persistence.Column(name = "default_purchaser", insertable = true, updatable = true, columnDefinition = "CHAR 5 NULL")
    @Basic
    public String getDefaultPurchaser() {
        return dealerBean.getDefaultPurchaser();
    }

    public void setDefaultPurchaser(String defaultPurchaser) {
        this.dealerBean.setDefaultPurchaser(defaultPurchaser);
    }

    @javax.persistence.Column(name = "mot_enabled", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getMotEnabled() {
        return dealerBean.getMotEnabled();
    }

    public void setMotEnabled(String motEnabled) {
        this.dealerBean.setMotEnabled(motEnabled);
    }

    @javax.persistence.Column(name = "dealer_name", insertable = true, updatable = true, columnDefinition = "CHAR 30 NULL")
    @Basic
    public String getDealerName() {
        return dealerBean.getDealerName();
    }

    public void setDealerName(String dealerName) {
        this.dealerBean.setDealerName(dealerName);
    }

    @javax.persistence.Column(name = "dealer_address1", insertable = true, updatable = true, columnDefinition = "CHAR 30 NULL")
    @Basic
    public String getDealerAddress1() {
        return dealerBean.getDealerAddress1();
    }

    public void setDealerAddress1(String dealerAddress1) {
        this.dealerBean.setDealerAddress1(dealerAddress1);
    }

    @javax.persistence.Column(name = "dealer_address2", insertable = true, updatable = true, columnDefinition = "CHAR 30 NULL")
    @Basic
    public String getDealerAddress2() {
        return dealerBean.getDealerAddress2();
    }

    public void setDealerAddress2(String dealerAddress2) {
        this.dealerBean.setDealerAddress2(dealerAddress2);
    }

    @javax.persistence.Column(name = "dealer_address3", insertable = true, updatable = true, columnDefinition = "CHAR 30 NULL")
    @Basic
    public String getDealerAddress3() {
        return dealerBean.getDealerAddress3();
    }

    public void setDealerAddress3(String dealerAddress3) {
        this.dealerBean.setDealerAddress3(dealerAddress3);
    }

    @javax.persistence.Column(name = "dealer_address4", insertable = true, updatable = true, columnDefinition = "CHAR 30 NULL")
    @Basic
    public String getDealerAddress4() {
        return dealerBean.getDealerAddress4();
    }

    public void setDealerAddress4(String dealerAddress4) {
        this.dealerBean.setDealerAddress4(dealerAddress4);
    }

    @javax.persistence.Column(name = "dealer_postcode", insertable = true, updatable = true, columnDefinition = "CHAR 8 NULL")
    @Basic
    public String getDealerPostcode() {
        return dealerBean.getDealerPostcode();
    }

    public void setDealerPostcode(String dealerPostcode) {
        this.dealerBean.setDealerPostcode(dealerPostcode);
    }

    @javax.persistence.Column(name = "dealer_fax", insertable = true, updatable = true, columnDefinition = "CHAR 15 NULL")
    @Basic
    public String getDealerFax() {
        return dealerBean.getDealerFax();
    }

    public void setDealerFax(String dealerFax) {
        this.dealerBean.setDealerFax(dealerFax);
    }

    @javax.persistence.Column(name = "dealer_contact", insertable = true, updatable = true, columnDefinition = "CHAR 30 NULL")
    @Basic
    public String getDealerContact() {
        return dealerBean.getDealerContact();
    }

    public void setDealerContact(String dealerContact) {
        this.dealerBean.setDealerContact(dealerContact);
    }

    @javax.persistence.Column(name = "new_agent_number", insertable = true, updatable = true, columnDefinition = "CHAR 5 NULL")
    @Basic
    public String getNewAgentNumber() {
        return dealerBean.getNewAgentNumber();
    }

    public void setNewAgentNumber(String newAgentNumber) {
        this.dealerBean.setNewAgentNumber(newAgentNumber);
    }

    @javax.persistence.Column(name = "new_agent_name", insertable = true, updatable = true, columnDefinition = "CHAR 30 NULL")
    @Basic
    public String getNewAgentName() {
        return dealerBean.getNewAgentName();
    }

    public void setNewAgentName(String newAgentName) {
        this.dealerBean.setNewAgentName(newAgentName);
    }

    @javax.persistence.Column(name = "new_agent_postcode", insertable = true, updatable = true, columnDefinition = "CHAR 8 NULL")
    @Basic
    public String getNewAgentPostcode() {
        return dealerBean.getNewAgentPostcode();
    }

    public void setNewAgentPostcode(String newAgentPostcode) {
        this.dealerBean.setNewAgentPostcode(newAgentPostcode);
    }

    @javax.persistence.Column(name = "new_agent_comment", insertable = true, updatable = true, columnDefinition = "CHAR 100 NULL")
    @Basic
    public String getNewAgentComment() {
        return dealerBean.getNewAgentComment();
    }

    public void setNewAgentComment(String newAgentComment) {
        this.dealerBean.setNewAgentComment(newAgentComment);
    }

    @javax.persistence.Column(name = "dealer_phone", insertable = true, updatable = true, columnDefinition = "CHAR 15 NULL")
    @Basic
    public String getDealerPhone() {
        return dealerBean.getDealerPhone();
    }

    public void setDealerPhone(String dealerPhone) {
        this.dealerBean.setDealerPhone(dealerPhone);
    }

    @javax.persistence.Column(name = "direct_debit", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getDirectDebit() {
        return dealerBean.getDirectDebit();
    }

    public void setDirectDebit(String directDebit) {
        this.dealerBean.setDirectDebit(directDebit);
    }

    @javax.persistence.Column(name = "excess_storage", nullable = true, insertable = true, updatable = true, columnDefinition = "CHAR 10 NULL")
    @Basic
    public Integer getExcessStorage() {
        return dealerBean.getExcessStorage();
    }

    public void setExcessStorage(Integer excessStorage) {
        this.dealerBean.setExcessStorage(excessStorage);
    }

    @javax.persistence.Column(name = "fleet_status", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getFleetStatus() {
        return dealerBean.getFleetStatus();
    }

    public void setFleetStatus(String fleetStatus) {
        this.dealerBean.setFleetStatus(fleetStatus);
    }

    @javax.persistence.Column(name = "fleet_group_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getFleetGroupId() {
        return dealerBean.getFleetGroupId();
    }

    public void setFleetGroupId(Integer fleetGroupId) {
        this.dealerBean.setFleetGroupId(fleetGroupId);
    }

    @javax.persistence.Column(name = "fleet_oil_brand", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getFleetOilBrand() {
        return dealerBean.getFleetOilBrand();
    }

    public void setFleetOilBrand(Integer fleetOilBrand) {
        this.dealerBean.setFleetOilBrand(fleetOilBrand);
    }

    @javax.persistence.Column(name = "fleet_mot_rate", nullable = true, insertable = true, updatable = true, length = 7, precision = 2, columnDefinition = "decimal")
    @Basic
    public BigDecimal getFleetMotRate() {
        return dealerBean.getFleetMotRate();
    }

    public void setFleetMotRate(BigDecimal fleetMotRate) {
        this.dealerBean.setFleetMotRate(fleetMotRate);
    }

    @javax.persistence.Column(name = "fleet_comment", insertable = true, updatable = true, columnDefinition = "CHAR 300 NULL")
    @Basic
    public String getFleetComment() {
        return dealerBean.getFleetComment();
    }

    public void setFleetComment(String fleetComment) {
        this.dealerBean.setFleetComment(fleetComment);
    }

    @javax.persistence.Column(name = "active_status", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getActiveStatus() {
        return dealerBean.getActiveStatus();
    }

    public void setActiveStatus(String activeStatus) {
        this.dealerBean.setActiveStatus(activeStatus);
    }

    @javax.persistence.Column(name = "ford_agrmnt_no", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getFordAgrmntNo() {
        return dealerBean.getFordAgrmntNo();
    }

    public void setFordAgrmntNo(Integer fordAgrmntNo) {
        this.dealerBean.setFordAgrmntNo(fordAgrmntNo);
    }

    @javax.persistence.Column(name = "defunct", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getDefunct() {
        return dealerBean.getDefunct();
    }

    public void setDefunct(String defunct) {
        this.dealerBean.setDefunct(defunct);
    }

    @javax.persistence.Column(name = "archived", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getArchived() {
        return dealerBean.getArchived();
    }

    public void setArchived(String archived) {
        this.dealerBean.setArchived(archived);
    }

    @javax.persistence.Column(name = "block_dps_payments", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getBlockDpsPayments() {
        return dealerBean.getBlockDpsPayments();
    }

    public void setBlockDpsPayments(String blockDpsPayments) {
        this.dealerBean.setBlockDpsPayments(blockDpsPayments);
    }

    @javax.persistence.Column(name = "block_ford_buyback", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getBlockFordBuyback() {
        return dealerBean.getBlockFordBuyback();
    }

    public void setBlockFordBuyback(String blockFordBuyback) {
        this.dealerBean.setBlockFordBuyback(blockFordBuyback);
    }

    @javax.persistence.Column(name = "block_hp", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getBlockHp() {
        return dealerBean.getBlockHp();
    }

    public void setBlockHp(String blockHp) {
        this.dealerBean.setBlockHp(blockHp);
    }

    @javax.persistence.Column(name = "block_lease", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getBlockLease() {
        return dealerBean.getBlockLease();
    }

    public void setBlockLease(String blockLease) {
        this.dealerBean.setBlockLease(blockLease);
    }

    @javax.persistence.Column(name = "block_mfldirect", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getBlockMfldirect() {
        return dealerBean.getBlockMfldirect();
    }

    public void setBlockMfldirect(String blockMfldirect) {
        this.dealerBean.setBlockMfldirect(blockMfldirect);
    }

    @javax.persistence.Column(name = "bus_type_lease", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getBusTypeLease() {
        return dealerBean.getBusTypeLease();
    }

    public void setBusTypeLease(String busTypeLease) {
        this.dealerBean.setBusTypeLease(busTypeLease);
    }

    @javax.persistence.Column(name = "bus_type_hp", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getBusTypeHp() {
        return dealerBean.getBusTypeHp();
    }

    public void setBusTypeHp(String busTypeHp) {
        this.dealerBean.setBusTypeHp(busTypeHp);
    }

    @javax.persistence.Column(name = "bus_type_wheelchair", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getBusTypeWheelchair() {
        return dealerBean.getBusTypeWheelchair();
    }

    public void setBusTypeWheelchair(String busTypeWheelchair) {
        this.dealerBean.setBusTypeWheelchair(busTypeWheelchair);
    }

    @javax.persistence.Column(name = "bus_type_converter", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getBusTypeConverter() {
        return dealerBean.getBusTypeConverter();
    }

    public void setBusTypeConverter(String busTypeConverter) {
        this.dealerBean.setBusTypeConverter(busTypeConverter);
    }

    @javax.persistence.Column(name = "bus_type_bodyshop", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getBusTypeBodyshop() {
        return dealerBean.getBusTypeBodyshop();
    }

    public void setBusTypeBodyshop(String busTypeBodyshop) {
        this.dealerBean.setBusTypeBodyshop(busTypeBodyshop);
    }

    @javax.persistence.Column(name = "comments", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    @Basic
    public String getComments() {
        return dealerBean.getComments();
    }

    public void setComments(String comments) {
        this.dealerBean.setComments(comments);
    }

    @javax.persistence.Column(name = "company_number", nullable = true, insertable = true, updatable = true, length = 12, precision = 0)
    @Basic
    public String getCompanyNumber() {
        return dealerBean.getCompanyNumber();
    }

    public void setCompanyNumber(String companyNumber) {
        this.dealerBean.setCompanyNumber(companyNumber);
    }

    @javax.persistence.Column(name = "company_type", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getCompanyType() {
        return dealerBean.getCompanyType();
    }

    public void setCompanyType(String companyType) {
        this.dealerBean.setCompanyType(companyType);
    }

    @javax.persistence.Column(name = "credit_limit_agreed", nullable = true, insertable = true, updatable = true, length = 19, precision = 4, columnDefinition = "money")
    @Basic
    public BigDecimal getCreditLimitAgreed() {
        return dealerBean.getCreditLimitAgreed();
    }

    public void setCreditLimitAgreed(BigDecimal creditLimitAgreed) {
        this.dealerBean.setCreditLimitAgreed(creditLimitAgreed);
    }

    @javax.persistence.Column(name = "credit_revised_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getCreditRevisedDate() {
        return dealerBean.getCreditRevisedDate();
    }

    public void setCreditRevisedDate(Date creditRevisedDate) {
        this.dealerBean.setCreditRevisedDate(creditRevisedDate);
    }

    @javax.persistence.Column(name = "credit_reminder_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getCreditReminderDate() {
        return dealerBean.getCreditReminderDate();
    }

    public void setCreditReminderDate(Date creditReminderDate) {
        this.dealerBean.setCreditReminderDate(creditReminderDate);
    }

    @javax.persistence.Column(name = "dealer_type_auction", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getDealerTypeAuction() {
        return dealerBean.getDealerTypeAuction();
    }

    public void setDealerTypeAuction(String dealerTypeAuction) {
        this.dealerBean.setDealerTypeAuction(dealerTypeAuction);
    }

    @javax.persistence.Column(name = "dealer_type_ford_buyback", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getDealerTypeFordBuyback() {
        return dealerBean.getDealerTypeFordBuyback();
    }

    public void setDealerTypeFordBuyback(String dealerTypeFordBuyback) {
        this.dealerBean.setDealerTypeFordBuyback(dealerTypeFordBuyback);
    }

    @javax.persistence.Column(name = "dealer_type_mfl_direct", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getDealerTypeMflDirect() {
        return dealerBean.getDealerTypeMflDirect();
    }

    public void setDealerTypeMflDirect(String dealerTypeMflDirect) {
        this.dealerBean.setDealerTypeMflDirect(dealerTypeMflDirect);
    }

    @javax.persistence.Column(name = "dealer_type_other_buyback", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getDealerTypeOtherBuyback() {
        return dealerBean.getDealerTypeOtherBuyback();
    }

    public void setDealerTypeOtherBuyback(String dealerTypeOtherBuyback) {
        this.dealerBean.setDealerTypeOtherBuyback(dealerTypeOtherBuyback);
    }

    @javax.persistence.Column(name = "fax_number_service", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    @Basic
    public String getFaxNumberService() {
        return dealerBean.getFaxNumberService();
    }

    public void setFaxNumberService(String faxNumberService) {
        this.dealerBean.setFaxNumberService(faxNumberService);
    }

    @javax.persistence.Column(name = "fax_number_sales", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    @Basic
    public String getFaxNumberSales() {
        return dealerBean.getFaxNumberSales();
    }

    public void setFaxNumberSales(String faxNumberSales) {
        this.dealerBean.setFaxNumberSales(faxNumberSales);
    }

    @javax.persistence.Column(name = "fcs_accred_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getFcsAccredDate() {
        return dealerBean.getFcsAccredDate();
    }

    public void setFcsAccredDate(Date fcsAccredDate) {
        this.dealerBean.setFcsAccredDate(fcsAccredDate);
    }

    @javax.persistence.Column(name = "fcs_aftersales", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getFcsAftersales() {
        return dealerBean.getFcsAftersales();
    }

    public void setFcsAftersales(String fcsAftersales) {
        this.dealerBean.setFcsAftersales(fcsAftersales);
    }

    @javax.persistence.Column(name = "fcs_aftersales_only", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getFcsAftersalesOnly() {
        return dealerBean.getFcsAftersalesOnly();
    }

    public void setFcsAftersalesOnly(String fcsAftersalesOnly) {
        this.dealerBean.setFcsAftersalesOnly(fcsAftersalesOnly);
    }

    @javax.persistence.Column(name = "finance_comments", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    @Basic
    public String getFinanceComments() {
        return dealerBean.getFinanceComments();
    }

    public void setFinanceComments(String financeComments) {
        this.dealerBean.setFinanceComments(financeComments);
    }

    @javax.persistence.Column(name = "fleet_aftersale_agree", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getFleetAftersaleAgree() {
        return dealerBean.getFleetAftersaleAgree();
    }

    public void setFleetAftersaleAgree(String fleetAftersaleAgree) {
        this.dealerBean.setFleetAftersaleAgree(fleetAftersaleAgree);
    }

    @javax.persistence.Column(name = "fleet_aftersale_agree_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getFleetAftersaleAgreeDate() {
        return dealerBean.getFleetAftersaleAgreeDate();
    }

    public void setFleetAftersaleAgreeDate(Date fleetAftersaleAgreeDate) {
        this.dealerBean.setFleetAftersaleAgreeDate(fleetAftersaleAgreeDate);
    }

    @javax.persistence.Column(name = "fleet_contract_recd", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getFleetContractRecd() {
        return dealerBean.getFleetContractRecd();
    }

    public void setFleetContractRecd(String fleetContractRecd) {
        this.dealerBean.setFleetContractRecd(fleetContractRecd);
    }

    @javax.persistence.Column(name = "fleet_contract_recd_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getFleetContractRecdDate() {
        return dealerBean.getFleetContractRecdDate();
    }

    public void setFleetContractRecdDate(Date fleetContractRecdDate) {
        this.dealerBean.setFleetContractRecdDate(fleetContractRecdDate);
    }

    @javax.persistence.Column(name = "ford_appl_pack_sent", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getFordApplPackSent() {
        return dealerBean.getFordApplPackSent();
    }

    public void setFordApplPackSent(String fordApplPackSent) {
        this.dealerBean.setFordApplPackSent(fordApplPackSent);
    }

    @javax.persistence.Column(name = "ford_appl_pack_sent_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getFordApplPackSentDate() {
        return dealerBean.getFordApplPackSentDate();
    }

    public void setFordApplPackSentDate(Date fordApplPackSentDate) {
        this.dealerBean.setFordApplPackSentDate(fordApplPackSentDate);
    }

    @javax.persistence.Column(name = "ford_contract_set", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getFordContractSet() {
        return dealerBean.getFordContractSet();
    }

    public void setFordContractSet(String fordContractSet) {
        this.dealerBean.setFordContractSet(fordContractSet);
    }

    @javax.persistence.Column(name = "ford_contract_set_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getFordContractSetDate() {
        return dealerBean.getFordContractSetDate();
    }

    public void setFordContractSetDate(Date fordContractSetDate) {
        this.dealerBean.setFordContractSetDate(fordContractSetDate);
    }

    @javax.persistence.Column(name = "ford_direct_debit_recd", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getFordDirectDebitRecd() {
        return dealerBean.getFordDirectDebitRecd();
    }

    public void setFordDirectDebitRecd(String fordDirectDebitRecd) {
        this.dealerBean.setFordDirectDebitRecd(fordDirectDebitRecd);
    }

    @javax.persistence.Column(name = "ford_direct_debit_recd_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getFordDirectDebitRecdDate() {
        return dealerBean.getFordDirectDebitRecdDate();
    }

    public void setFordDirectDebitRecdDate(Date fordDirectDebitRecdDate) {
        this.dealerBean.setFordDirectDebitRecdDate(fordDirectDebitRecdDate);
    }

    @javax.persistence.Column(name = "ford_guarantee_recd", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getFordGuaranteeRecd() {
        return dealerBean.getFordGuaranteeRecd();
    }

    public void setFordGuaranteeRecd(String fordGuaranteeRecd) {
        this.dealerBean.setFordGuaranteeRecd(fordGuaranteeRecd);
    }

    @javax.persistence.Column(name = "ford_guarantee_recd_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getFordGuaranteeRecdDate() {
        return dealerBean.getFordGuaranteeRecdDate();
    }

    public void setFordGuaranteeRecdDate(Date fordGuaranteeRecdDate) {
        this.dealerBean.setFordGuaranteeRecdDate(fordGuaranteeRecdDate);
    }

    @javax.persistence.Column(name = "ford_hpi_clearance_days", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getFordHpiClearanceDays() {
        return dealerBean.getFordHpiClearanceDays();
    }

    public void setFordHpiClearanceDays(Integer fordHpiClearanceDays) {
        this.dealerBean.setFordHpiClearanceDays(fordHpiClearanceDays);
    }

    @javax.persistence.Column(name = "ford_log_book_v5_release_days", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getFordLogBookV5ReleaseDays() {
        return dealerBean.getFordLogBookV5ReleaseDays();
    }

    public void setFordLogBookV5ReleaseDays(Integer fordLogBookV5ReleaseDays) {
        this.dealerBean.setFordLogBookV5ReleaseDays(fordLogBookV5ReleaseDays);
    }

    @javax.persistence.Column(name = "ford_payment_terms_days", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getFordPaymentTermsDays() {
        return dealerBean.getFordPaymentTermsDays();
    }

    public void setFordPaymentTermsDays(Integer fordPaymentTermsDays) {
        this.dealerBean.setFordPaymentTermsDays(fordPaymentTermsDays);
    }

    @javax.persistence.Column(name = "ford_total_exposure", nullable = true, insertable = true, updatable = true, length = 19, precision = 4, columnDefinition = "money")
    @Basic
    public BigDecimal getFordTotalExposure() {
        return dealerBean.getFordTotalExposure();
    }

    public void setFordTotalExposure(BigDecimal fordTotalExposure) {
        this.dealerBean.setFordTotalExposure(fordTotalExposure);
    }

    @javax.persistence.Column(name = "ford_vsa_recd", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getFordVsaRecd() {
        return dealerBean.getFordVsaRecd();
    }

    public void setFordVsaRecd(String fordVsaRecd) {
        this.dealerBean.setFordVsaRecd(fordVsaRecd);
    }

    @javax.persistence.Column(name = "ford_vsa_recd_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getFordVsaRecdDate() {
        return dealerBean.getFordVsaRecdDate();
    }

    public void setFordVsaRecdDate(Date fordVsaRecdDate) {
        this.dealerBean.setFordVsaRecdDate(fordVsaRecdDate);
    }

    @javax.persistence.Column(name = "group_guarantee", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getGroupGuarantee() {
        return dealerBean.getGroupGuarantee();
    }

    public void setGroupGuarantee(String groupGuarantee) {
        this.dealerBean.setGroupGuarantee(groupGuarantee);
    }

    @javax.persistence.Column(name = "group_guarantor", insertable = true, updatable = true, columnDefinition = "CHAR 5 NULL")
    @Basic
    public String getGroupGuarantor() {
        return dealerBean.getGroupGuarantor();
    }

    public void setGroupGuarantor(String groupGuarantor) {
        this.dealerBean.setGroupGuarantor(groupGuarantor);
    }

    @javax.persistence.Column(name = "guarantee_type", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getGuaranteeType() {
        return dealerBean.getGuaranteeType();
    }

    public void setGuaranteeType(String guaranteeType) {
        this.dealerBean.setGuaranteeType(guaranteeType);
    }

    @javax.persistence.Column(name = "handback_dealer", insertable = true, updatable = true, columnDefinition = "CHAR 5 NULL")
    @Basic
    public String getHandbackDealer() {
        return dealerBean.getHandbackDealer();
    }

    public void setHandbackDealer(String handbackDealer) {
        this.dealerBean.setHandbackDealer(handbackDealer);
    }

    @javax.persistence.Column(name = "hpi_clearance_days", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getHpiClearanceDays() {
        return dealerBean.getHpiClearanceDays();
    }

    public void setHpiClearanceDays(Integer hpiClearanceDays) {
        this.dealerBean.setHpiClearanceDays(hpiClearanceDays);
    }

    @javax.persistence.Column(name = "log_book_v5_release_days", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getLogBookV5ReleaseDays() {
        return dealerBean.getLogBookV5ReleaseDays();
    }

    public void setLogBookV5ReleaseDays(Integer logBookV5ReleaseDays) {
        this.dealerBean.setLogBookV5ReleaseDays(logBookV5ReleaseDays);
    }

    @javax.persistence.Column(name = "mfl_account_handler_dept", nullable = true, insertable = true, updatable = true, length = 2, precision = 0)
    @Basic
    public String getMflAccountHandlerDept() {
        return dealerBean.getMflAccountHandlerDept();
    }

    public void setMflAccountHandlerDept(String mflAccountHandlerDept) {
        this.dealerBean.setMflAccountHandlerDept(mflAccountHandlerDept);
    }

    @javax.persistence.Column(name = "mfl_account_handler", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    @Basic
    public String getMflAccountHandler() {
        return dealerBean.getMflAccountHandler();
    }

    public void setMflAccountHandler(String mflAccountHandler) {
        this.dealerBean.setMflAccountHandler(mflAccountHandler);
    }

    @javax.persistence.Column(name = "mfl_area_manager_dept", nullable = true, insertable = true, updatable = true, length = 2, precision = 0)
    @Basic
    public String getMflAreaManagerDept() {
        return dealerBean.getMflAreaManagerDept();
    }

    public void setMflAreaManagerDept(String mflAreaManagerDept) {
        this.dealerBean.setMflAreaManagerDept(mflAreaManagerDept);
    }

    @javax.persistence.Column(name = "mfl_area_manager", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    @Basic
    public String getMflAreaManager() {
        return dealerBean.getMflAreaManager();
    }

    public void setMflAreaManager(String mflAreaManager) {
        this.dealerBean.setMflAreaManager(mflAreaManager);
    }

    @javax.persistence.Column(name = "mfl_credit_controller_dept", nullable = true, insertable = true, updatable = true, length = 2, precision = 0)
    @Basic
    public String getMflCreditControllerDept() {
        return dealerBean.getMflCreditControllerDept();
    }

    public void setMflCreditControllerDept(String mflCreditControllerDept) {
        this.dealerBean.setMflCreditControllerDept(mflCreditControllerDept);
    }

    @javax.persistence.Column(name = "mfl_credit_controller", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    @Basic
    public String getMflCreditController() {
        return dealerBean.getMflCreditController();
    }

    public void setMflCreditController(String mflCreditController) {
        this.dealerBean.setMflCreditController(mflCreditController);
    }

    @javax.persistence.Column(name = "mfld_appl_pack_sent", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getMfldApplPackSent() {
        return dealerBean.getMfldApplPackSent();
    }

    public void setMfldApplPackSent(String mfldApplPackSent) {
        this.dealerBean.setMfldApplPackSent(mfldApplPackSent);
    }

    @javax.persistence.Column(name = "mfld_appl_pack_sent_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getMfldApplPackSentDate() {
        return dealerBean.getMfldApplPackSentDate();
    }

    public void setMfldApplPackSentDate(Date mfldApplPackSentDate) {
        this.dealerBean.setMfldApplPackSentDate(mfldApplPackSentDate);
    }

    @javax.persistence.Column(name = "mfld_agreement_recd", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getMfldAgreementRecd() {
        return dealerBean.getMfldAgreementRecd();
    }

    public void setMfldAgreementRecd(String mfldAgreementRecd) {
        this.dealerBean.setMfldAgreementRecd(mfldAgreementRecd);
    }

    @javax.persistence.Column(name = "mfld_agreement_recd_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getMfldAgreementRecdDate() {
        return dealerBean.getMfldAgreementRecdDate();
    }

    public void setMfldAgreementRecdDate(Date mfldAgreementRecdDate) {
        this.dealerBean.setMfldAgreementRecdDate(mfldAgreementRecdDate);
    }

    @javax.persistence.Column(name = "mfld_credit_appl_recd", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getMfldCreditApplRecd() {
        return dealerBean.getMfldCreditApplRecd();
    }

    public void setMfldCreditApplRecd(String mfldCreditApplRecd) {
        this.dealerBean.setMfldCreditApplRecd(mfldCreditApplRecd);
    }

    @javax.persistence.Column(name = "mfld_credit_appl_recd_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getMfldCreditApplRecdDate() {
        return dealerBean.getMfldCreditApplRecdDate();
    }

    public void setMfldCreditApplRecdDate(Date mfldCreditApplRecdDate) {
        this.dealerBean.setMfldCreditApplRecdDate(mfldCreditApplRecdDate);
    }

    @javax.persistence.Column(name = "mfld_credit_limit_set", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getMfldCreditLimitSet() {
        return dealerBean.getMfldCreditLimitSet();
    }

    public void setMfldCreditLimitSet(String mfldCreditLimitSet) {
        this.dealerBean.setMfldCreditLimitSet(mfldCreditLimitSet);
    }

    @javax.persistence.Column(name = "mfld_credit_limit_set_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getMfldCreditLimitSetDate() {
        return dealerBean.getMfldCreditLimitSetDate();
    }

    public void setMfldCreditLimitSetDate(Date mfldCreditLimitSetDate) {
        this.dealerBean.setMfldCreditLimitSetDate(mfldCreditLimitSetDate);
    }

    @javax.persistence.Column(name = "mfld_direct_debit_recd", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getMfldDirectDebitRecd() {
        return dealerBean.getMfldDirectDebitRecd();
    }

    public void setMfldDirectDebitRecd(String mfldDirectDebitRecd) {
        this.dealerBean.setMfldDirectDebitRecd(mfldDirectDebitRecd);
    }

    @javax.persistence.Column(name = "mfld_direct_debit_recd_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getMfldDirectDebitRecdDate() {
        return dealerBean.getMfldDirectDebitRecdDate();
    }

    public void setMfldDirectDebitRecdDate(Date mfldDirectDebitRecdDate) {
        this.dealerBean.setMfldDirectDebitRecdDate(mfldDirectDebitRecdDate);
    }

    @javax.persistence.Column(name = "mfld_password_issued", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getMfldPasswordIssued() {
        return dealerBean.getMfldPasswordIssued();
    }

    public void setMfldPasswordIssued(String mfldPasswordIssued) {
        this.dealerBean.setMfldPasswordIssued(mfldPasswordIssued);
    }

    @javax.persistence.Column(name = "mfld_password_issued_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getMfldPasswordIssuedDate() {
        return dealerBean.getMfldPasswordIssuedDate();
    }

    public void setMfldPasswordIssuedDate(Date mfldPasswordIssuedDate) {
        this.dealerBean.setMfldPasswordIssuedDate(mfldPasswordIssuedDate);
    }

    @javax.persistence.Column(name = "mot_sub_let", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getMotSubLet() {
        return dealerBean.getMotSubLet();
    }

    public void setMotSubLet(String motSubLet) {
        this.dealerBean.setMotSubLet(motSubLet);
    }

    @javax.persistence.Column(name = "payment_terms_days", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getPaymentTermsDays() {
        return dealerBean.getPaymentTermsDays();
    }

    public void setPaymentTermsDays(Integer paymentTermsDays) {
        this.dealerBean.setPaymentTermsDays(paymentTermsDays);
    }

    @javax.persistence.Column(name = "refund_account", insertable = true, updatable = true, columnDefinition = "CHAR 8 NULL")
    @Basic
    public String getRefundAccount() {
        return dealerBean.getRefundAccount();
    }

    public void setRefundAccount(String refundAccount) {
        this.dealerBean.setRefundAccount(refundAccount);
    }

    @javax.persistence.Column(name = "refund_sort_code", insertable = true, updatable = true, columnDefinition = "CHAR 6 NULL")
    @Basic
    public String getRefundSortCode() {
        return dealerBean.getRefundSortCode();
    }

    public void setRefundSortCode(String refundSortCode) {
        this.dealerBean.setRefundSortCode(refundSortCode);
    }

    @javax.persistence.Column(name = "refund_payment_method", insertable = true, updatable = true, columnDefinition = "CHAR 2 NULL")
    @Basic
    public String getRefundPaymentMethod() {
        return dealerBean.getRefundPaymentMethod();
    }

    public void setRefundPaymentMethod(String refundPaymentMethod) {
        this.dealerBean.setRefundPaymentMethod(refundPaymentMethod);
    }

    @javax.persistence.Column(name = "telephone_number_service", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    @Basic
    public String getTelephoneNumberService() {
        return dealerBean.getTelephoneNumberService();
    }

    public void setTelephoneNumberService(String telephoneNumberService) {
        this.dealerBean.setTelephoneNumberService(telephoneNumberService);
    }

    @javax.persistence.Column(name = "telephone_number_sales", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    @Basic
    public String getTelephoneNumberSales() {
        return dealerBean.getTelephoneNumberSales();
    }

    public void setTelephoneNumberSales(String telephoneNumberSales) {
        this.dealerBean.setTelephoneNumberSales(telephoneNumberSales);
    }

    @javax.persistence.Column(name = "vs_ra_indicator", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getVsRaIndicator() {
        return dealerBean.getVsRaIndicator();
    }

    public void setVsRaIndicator(String vsRaIndicator) {
        this.dealerBean.setVsRaIndicator(vsRaIndicator);
    }

    @javax.persistence.Column(name = "vs_ra_agreement_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getVsRaAgreementDate() {
        return dealerBean.getVsRaAgreementDate();
    }

    public void setVsRaAgreementDate(Date vsRaAgreementDate) {
        this.dealerBean.setVsRaAgreementDate(vsRaAgreementDate);
    }

    @javax.persistence.Column(name = "fleet_negotiator", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getFleetNegotiator() {
        return dealerBean.getFleetNegotiator();
    }

    public void setFleetNegotiator(String fleetNegotiator) {
        this.dealerBean.setFleetNegotiator(fleetNegotiator);
    }

    @javax.persistence.Column(name = "finance_email", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    @Basic
    public String getFinanceEmail() {
        return dealerBean.getFinanceEmail();
    }

    public void setFinanceEmail(String financeEmail) {
        this.dealerBean.setFinanceEmail(financeEmail);
    }

    @javax.persistence.Column(name = "agent_email", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    @Basic
    public String getAgentEmail() {
        return dealerBean.getAgentEmail();
    }

    public void setAgentEmail(String agentEmail) {
        this.dealerBean.setAgentEmail(agentEmail);
    }

    @javax.persistence.Column(name = "agent_website", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    @Basic
    public String getAgentWebsite() {
        return dealerBean.getAgentWebsite();
    }

    public void setAgentWebsite(String agentWebsite) {
        this.dealerBean.setAgentWebsite(agentWebsite);
    }

    @javax.persistence.Column(name = "agent_name", nullable = true, insertable = true, updatable = true, length = 35, precision = 0)
    @Basic
    public String getAgentName() {
        return dealerBean.getAgentName();
    }

    public void setAgentName(String agentName) {
        this.dealerBean.setAgentName(agentName);
    }

    @javax.persistence.Column(name = "agent_legal_name", nullable = true, insertable = true, updatable = true, length = 35, precision = 0)
    @Basic
    public String getAgentLegalName() {
        return dealerBean.getAgentLegalName();
    }

    public void setAgentLegalName(String agentLegalName) {
        this.dealerBean.setAgentLegalName(agentLegalName);
    }

    @javax.persistence.Column(name = "dealer_email", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    @Basic
    public String getDealerEmail() {
        return dealerBean.getDealerEmail();
    }

    public void setDealerEmail(String dealerEmail) {
        this.dealerBean.setDealerEmail(dealerEmail);
    }

    @javax.persistence.Column(name = "partner_type", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getPartnerType() {
        return dealerBean.getPartnerType() != null ? (int) dealerBean.getPartnerType().getCode() : null;
    }

    public void setPartnerType(Integer partnerType) {
        if(partnerType !=null) this.dealerBean.setPartnerType(DealerPartner.getDealerPartner(partnerType.shortValue()));
        else this.dealerBean.setPartnerType(null);
    }

    @javax.persistence.Column(name = "fsa_reg_type", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public Integer getFsaRegType() {
        return dealerBean.getFsaRegType();
    }

    public void setFsaRegType(Integer fsaRegType) {
        this.dealerBean.setFsaRegType(fsaRegType);
    }

    @javax.persistence.Column(name = "fsa_reg_no", nullable = true, insertable = true, updatable = true, length = 8, precision = 0)
    @Basic
    public String getFsaRegNo() {
        return dealerBean.getFsaRegNo();
    }

    public void setFsaRegNo(String fsaRegNo) {
        this.dealerBean.setFsaRegNo(fsaRegNo);
    }

    @javax.persistence.Column(name = "self_billable", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getSelfBillable() {
        return dealerBean.getSelfBillable();
    }

    public void setSelfBillable(String selfBillable) {
        this.dealerBean.setSelfBillable(selfBillable);
    }

    @javax.persistence.Column(name = "esignature_ind", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getEsignatureInd() {
        return dealerBean.getEsignatureInd();
    }

    public void setEsignatureInd(String esignatureInd) {
        this.dealerBean.setEsignatureInd(esignatureInd);
    }

    @javax.persistence.Column(name = "refund_holder_name", nullable = true, insertable = true, updatable = true, length = 60, precision = 0)
    @Basic
    public String getRefundHolderName() {
        return dealerBean.getRefundHolderName();
    }

    public void setRefundHolderName(String refundHolderName) {
        this.dealerBean.setRefundHolderName(refundHolderName);
    }

    @javax.persistence.Column(name = "credit_facilities_ind", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getCreditFacilitiesInd() {
        return dealerBean.getCreditFacilitiesInd();
    }

    public void setCreditFacilitiesInd(String creditFacilitiesInd) {
        this.dealerBean.setCreditFacilitiesInd(creditFacilitiesInd);
    }

    @javax.persistence.Column(name = "purchasing_invoice_email", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    @Basic
    public String getPurchasingInvoiceEmail() {
        return dealerBean.getPurchasingInvoiceEmail();
    }

    public void setPurchasingInvoiceEmail(String purchasingInvoiceEmail) {
        this.dealerBean.setPurchasingInvoiceEmail(purchasingInvoiceEmail);
    }

    @javax.persistence.Column(name = "account_manager", nullable = true, insertable = true, updatable = true, length = 240, precision = 0)
    @Basic
    public String getAccountManager() {
        return dealerBean.getAccountManager();
    }

    public void setAccountManager(String accountManager) {
        this.dealerBean.setAccountManager(accountManager);
    }

    @javax.persistence.Column(name = "block_hp_new_only", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getBlockHpNewOnly() {
        return dealerBean.getBlockHpNewOnly();
    }

    public void setBlockHpNewOnly(String blockHpNewOnly) {
        this.dealerBean.setBlockHpNewOnly(blockHpNewOnly);
    }

    @javax.persistence.Column(name = "block_lease_new_only", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getBlockLeaseNewOnly() {
        return dealerBean.getBlockLeaseNewOnly();
    }

    public void setBlockLeaseNewOnly(String blockLeaseNewOnly) {
        this.dealerBean.setBlockLeaseNewOnly(blockLeaseNewOnly);
    }

    @javax.persistence.Column(name = "trade_in", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getTradeIn() {
        return dealerBean.getTradeIn();
    }

    public void setTradeIn(String tradeIn) {
        this.dealerBean.setTradeIn(tradeIn);
    }

    @javax.persistence.Column(name = "dealer_category_id", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public int getDealerCategoryId() {
        return dealerBean.getDealerCategory() != null ? dealerBean.getDealerCategory().getCode() : null;
    }

    public void setDealerCategoryId(int dealerCategoryId) {
        this.dealerBean.setDealerCategory(DealerCategory.getDealerCategory((short)dealerCategoryId));
    }

    @javax.persistence.Column(name = "is_insurance_repairer", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getInsuranceRepairer() {
        return dealerBean.getInsuranceRepairer();
    }

    public void setInsuranceRepairer(String insuranceRepairer) {
        dealerBean.setInsuranceRepairer(insuranceRepairer);
    }

    @javax.persistence.Column(name = "is_home_visitor", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getHomeVisitor() {
        return dealerBean.getHomeVisitor();
    }

    public void setHomeVisitor(String homeVisitor) {
        dealerBean.setHomeVisitor(homeVisitor);
    }

    @javax.persistence.Column(name = "has_showroom", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getHasShowroom() {
        return dealerBean.getHasShowroom();
    }

    public void setHasShowroom(String hasShowroom) {
        this.dealerBean.setHasShowroom(hasShowroom);
    }

    @javax.persistence.Column(name = "consumer_credit_licence_no", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    @Basic
    public String getConsumerCreditLicenceNo() {
        return dealerBean.getConsumerCreditLicenceNo();
    }

    public void setConsumerCreditLicenceNo(String consumerCreditLicenceNo) {
        this.dealerBean.setConsumerCreditLicenceNo(consumerCreditLicenceNo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaintenanceAgentMaagEntity that = (MaintenanceAgentMaagEntity) o;
        if (dealerBean.getAgentNumber() != null ? !dealerBean.getAgentNumber().equals(that.dealerBean.getAgentNumber()) : that.dealerBean.getAgentNumber() != null) 
        	return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = dealerBean.getAgentNumber() != null ? dealerBean.getAgentNumber().hashCode() : 0;
        return result;
    }

    @OneToOne(cascade = {CascadeType.ALL}, optional = true)
    @JoinColumn(name = "agent_number", nullable = true)
    public MaintenanceAgentExtraEntity getExtra() {
        return extra;
    }

    public void setExtra(MaintenanceAgentExtraEntity extra) {
        this.extra = extra;
    }

    @OneToMany(mappedBy = "id.parent", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    public List<DealerFcsDateEntity> getFcsDates() {
        return fcsDates;
    }

    public void setFcsDates(List<DealerFcsDateEntity> fcsDates) {
        this.fcsDates = fcsDates;
    }

    @OneToMany(mappedBy = "id.parent", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, orphanRemoval=true)
    public List<DealerGroupDealersLinkEntity> getDealerGroupLinks() {
        return dealerGroupLinks;
    }

    public void setDealerGroupLinks(List<DealerGroupDealersLinkEntity> dealerGroupLinks) {
        this.dealerGroupLinks = dealerGroupLinks;
    }


    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "agent_number", referencedColumnName = "agent_number", nullable = true)
    public List<DealerCoverageEntity> getCoverageEntities() {
        return coverageEntities;
    }

    public void setCoverageEntities(List<DealerCoverageEntity> coverageEntities) {
        this.coverageEntities = coverageEntities;
    }


    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "agent_number", referencedColumnName = "agent_number", nullable = true)
    public List<DealerProductTypeEntity> getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(List<DealerProductTypeEntity> productTypes) {
        this.productTypes = productTypes;
    }
}
