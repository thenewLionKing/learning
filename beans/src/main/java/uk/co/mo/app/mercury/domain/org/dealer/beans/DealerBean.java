package uk.co.mo.app.mercury.domain.org.dealer.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class DealerBean implements Serializable {

	private static final long serialVersionUID = -2430845296832326004L;

	private String agentNumber;
    private String agentAddress1;
    private String agentAddress2;
    private String agentAddress3;
    private String agentAddress4;
    private String agentPostcode;
    private String agentRefCode;
    private String agentVatNumber;
    private String agentAccount;
    private String agentSortCode;
    private String agentApproveFlag;
    private Date agentAgreeDate;
    private String paymentMethod;
    private String paymentTerm;
    private String agentTypeFlag;
    private String vehicleManufacturerCode;
    private String maintenanceAgentLink;
    private String companyReferenceNumber;
    private String blacklistHpSupp;
    private String blacklistLeaseSupp;
    private String blacklistReasonSupp;
    private String blacklistLeaseMa;
    private String blacklistReasonMa;
    private String commitmentBlock;
    private String telephoneNumber;
    private String faxNumber;
    private BigDecimal maAbsLim;
    private BigDecimal maWarLim;
    private BigDecimal maPendCom;
    private BigDecimal maActCom;
    private BigDecimal maRepeat;
    private BigDecimal maLiability;
    private Date reminderDate;
    private Date renewalDate;
    private Short hpsOnlyIndicator;
    private String magtapeDiskette;
    private String dealerAccount;
    private String dealerSortCode;
    private String dealerPaymentMethod;
    private String serviceAgentAccount;
    private String serviceAgentSortCode;
    private String serviceAgentPaymentMethod;
    private Integer fleetSize;
    private Integer easting;
    private Integer northing;
    private String comment1;
    private String comment2;
    private String comment3;
    private String comment4;
    private String comment5;
    private String comment6;
    private String comment7;
    private String webEnabled;
    private BigDecimal creditLimit;
    private BigDecimal creditOutstanding;
    private Integer publisherId;
    private Integer grmDealerId;
    private String lastUser;
    private Date lastUpdate;
    private String fcsAccredDealer;
    private String franchiseDealerInd;
    private String defaultPurchaser;
    private String motEnabled;
    private String dealerName;
    private String dealerAddress1;
    private String dealerAddress2;
    private String dealerAddress3;
    private String dealerAddress4;
    private String dealerPostcode;
    private String dealerFax;
    private String dealerContact;
    private String newAgentNumber;
    private String newAgentName;
    private String newAgentPostcode;
    private String newAgentComment;
    private String dealerPhone;
    private String directDebit;
    private Integer excessStorage;
    private String fleetStatus;
    private Integer fleetGroupId;
    private Integer fleetOilBrand;
    private BigDecimal fleetMotRate;
    private String fleetComment;
    private String activeStatus;
    private Integer fordAgrmntNo;
    private String defunct;
    private String archived;
    private String blockDpsPayments;
    private String blockFordBuyback;
    private String blockHp;
    private String blockLease;
    private String blockMfldirect;
    private String busTypeLease;
    private String busTypeHp;
    private String busTypeWheelchair;
    private String busTypeConverter;
    private String busTypeBodyshop;
    private String comments;
    private String companyNumber;
    private String companyType;
    private BigDecimal creditLimitAgreed;
    private Date creditRevisedDate;
    private Date creditReminderDate;
    private String dealerTypeAuction;
    private String dealerTypeFordBuyback;
    private String dealerTypeMflDirect;
    private String dealerTypeOtherBuyback;
    private String faxNumberService;
    private String faxNumberSales;
    private Date fcsAccredDate;
    private String fcsAftersales;
    private String fcsAftersalesOnly;
    private String financeComments;
    private String fleetAftersaleAgree;
    private Date fleetAftersaleAgreeDate;
    private String fleetContractRecd;
    private Date fleetContractRecdDate;
    private String fordApplPackSent;
    private Date fordApplPackSentDate;
    private String fordContractSet;
    private Date fordContractSetDate;
    private String fordDirectDebitRecd;
    private Date fordDirectDebitRecdDate;
    private String fordGuaranteeRecd;
    private Date fordGuaranteeRecdDate;
    private Integer fordHpiClearanceDays;
    private Integer fordLogBookV5ReleaseDays;
    private Integer fordPaymentTermsDays;
    private BigDecimal fordTotalExposure;
    private String fordVsaRecd;
    private Date fordVsaRecdDate;
    private String groupGuarantee;
    private String groupGuarantor;
    private String guaranteeType;
    private String handbackDealer;
    private Integer hpiClearanceDays;
    private Integer logBookV5ReleaseDays;
    private String mflAccountHandlerDept;
    private String mflAccountHandler;
    private String mflAreaManagerDept;
    private String mflAreaManager;
    private String mflCreditControllerDept;
    private String mflCreditController;
    private String mfldApplPackSent;
    private Date mfldApplPackSentDate;
    private String mfldAgreementRecd;
    private Date mfldAgreementRecdDate;
    private String mfldCreditApplRecd;
    private Date mfldCreditApplRecdDate;
    private String mfldCreditLimitSet;
    private Date mfldCreditLimitSetDate;
    private String mfldDirectDebitRecd;
    private Date mfldDirectDebitRecdDate;
    private String mfldPasswordIssued;
    private Date mfldPasswordIssuedDate;
    private String motSubLet;
    private Integer paymentTermsDays;
    private String refundAccount;
    private String refundSortCode;
    private String refundPaymentMethod;
    private String telephoneNumberService;
    private String telephoneNumberSales;
    private String vsRaIndicator;
    private Date vsRaAgreementDate;
    private String fleetNegotiator;
    private String financeEmail;
    private String agentEmail;
    private String agentWebsite;
    private String agentName;
    private String agentLegalName;
    private String dealerEmail;
    private DealerPartner partnerType;
    private Integer fsaRegType;
    private String fsaRegNo;
    private String selfBillable;
    private String esignatureInd;
    private String refundHolderName;
    private String creditFacilitiesInd;
    private String purchasingInvoiceEmail;
    private String accountManager;
    private String blockHpNewOnly;
    private String blockLeaseNewOnly;
    private String tradeIn;
    private DealerCategory dealerCategory;
    private String isInsuranceRepairer;
    private String isHomeVisitor;
    private String hasShowroom;
    private String consumerCreditLicenceNo;
    private DealerExtraBean extra;
    private List<DealerFcsDateBean> dealerFcsDateBean;
    private List<DealerGroupDealerLinkBean> dealerGroupDealerlink;
    private List<DealerCoverage> dealerCoverage;
    private List<DealerProductType> productType;

    public DealerBean() {
    }
    
    @XmlElement(required=true)
    public String getAgentNumber() {
        return agentNumber;
    }

    public void setAgentNumber(String agentNumber) {
        this.agentNumber = agentNumber;
    }

    public String getAgentAddress1() {
        return agentAddress1;
    }

    public void setAgentAddress1(String agentAddress1) {
        this.agentAddress1 = agentAddress1;
    }

    public String getAgentAddress2() {
        return agentAddress2;
    }

    public void setAgentAddress2(String agentAddress2) {
        this.agentAddress2 = agentAddress2;
    }

    public String getAgentAddress3() {
        return agentAddress3;
    }

    public void setAgentAddress3(String agentAddress3) {
        this.agentAddress3 = agentAddress3;
    }

    public String getAgentAddress4() {
        return agentAddress4;
    }

    public void setAgentAddress4(String agentAddress4) {
        this.agentAddress4 = agentAddress4;
    }

    public String getAgentPostcode() {
        return agentPostcode;
    }

    public void setAgentPostcode(String agentPostcode) {
        this.agentPostcode = agentPostcode;
    }

    public String getAgentRefCode() {
        return agentRefCode;
    }

    public void setAgentRefCode(String agentRefCode) {
        this.agentRefCode = agentRefCode;
    }

    public String getAgentVatNumber() {
        return agentVatNumber;
    }

    public void setAgentVatNumber(String agentVatNumber) {
        this.agentVatNumber = agentVatNumber;
    }

    public String getAgentAccount() {
        return agentAccount;
    }

    public void setAgentAccount(String agentAccount) {
        this.agentAccount = agentAccount;
    }

    public String getAgentSortCode() {
        return agentSortCode;
    }

    public void setAgentSortCode(String agentSortCode) {
        this.agentSortCode = agentSortCode;
    }

    public String getAgentApproveFlag() {
        return agentApproveFlag;
    }

    public void setAgentApproveFlag(String agentApproveFlag) {
        this.agentApproveFlag = agentApproveFlag;
    }

    public Date getAgentAgreeDate() {
        return agentAgreeDate;
    }

    public void setAgentAgreeDate(Date agentAgreeDate) {
        this.agentAgreeDate = agentAgreeDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(String paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public String getAgentTypeFlag() {
        return agentTypeFlag;
    }

    public void setAgentTypeFlag(String agentTypeFlag) {
        this.agentTypeFlag = agentTypeFlag;
    }

    public String getVehicleManufacturerCode() {
        return vehicleManufacturerCode;
    }

    public void setVehicleManufacturerCode(String vehicleManufacturerCode) {
        this.vehicleManufacturerCode = vehicleManufacturerCode;
    }

    public String getMaintenanceAgentLink() {
        return maintenanceAgentLink;
    }

    public void setMaintenanceAgentLink(String maintenanceAgentLink) {
        this.maintenanceAgentLink = maintenanceAgentLink;
    }

    public String getCompanyReferenceNumber() {
        return companyReferenceNumber;
    }

    public void setCompanyReferenceNumber(String companyReferenceNumber) {
        this.companyReferenceNumber = companyReferenceNumber;
    }

    public String getBlacklistHpSupp() {
        return blacklistHpSupp;
    }

    public void setBlacklistHpSupp(String blacklistHpSupp) {
        this.blacklistHpSupp = blacklistHpSupp;
    }

    public String getBlacklistLeaseSupp() {
        return blacklistLeaseSupp;
    }

    public void setBlacklistLeaseSupp(String blacklistLeaseSupp) {
        this.blacklistLeaseSupp = blacklistLeaseSupp;
    }

    public String getBlacklistReasonSupp() {
        return blacklistReasonSupp;
    }

    public void setBlacklistReasonSupp(String blacklistReasonSupp) {
        this.blacklistReasonSupp = blacklistReasonSupp;
    }

    public String getBlacklistLeaseMa() {
        return blacklistLeaseMa;
    }

    public void setBlacklistLeaseMa(String blacklistLeaseMa) {
        this.blacklistLeaseMa = blacklistLeaseMa;
    }

    public String getBlacklistReasonMa() {
        return blacklistReasonMa;
    }

    public void setBlacklistReasonMa(String blacklistReasonMa) {
        this.blacklistReasonMa = blacklistReasonMa;
    }

    public String getCommitmentBlock() {
        return commitmentBlock;
    }

    public void setCommitmentBlock(String commitmentBlock) {
        this.commitmentBlock = commitmentBlock;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public BigDecimal getMaAbsLim() {
        return maAbsLim;
    }

    public void setMaAbsLim(BigDecimal maAbsLim) {
        this.maAbsLim = maAbsLim;
    }

    public BigDecimal getMaWarLim() {
        return maWarLim;
    }

    public void setMaWarLim(BigDecimal maWarLim) {
        this.maWarLim = maWarLim;
    }

    public BigDecimal getMaPendCom() {
        return maPendCom;
    }

    public void setMaPendCom(BigDecimal maPendCom) {
        this.maPendCom = maPendCom;
    }

    public BigDecimal getMaActCom() {
        return maActCom;
    }

    public void setMaActCom(BigDecimal maActCom) {
        this.maActCom = maActCom;
    }

    public BigDecimal getMaRepeat() {
        return maRepeat;
    }

    public void setMaRepeat(BigDecimal maRepeat) {
        this.maRepeat = maRepeat;
    }

    public BigDecimal getMaLiability() {
        return maLiability;
    }

    public void setMaLiability(BigDecimal maLiability) {
        this.maLiability = maLiability;
    }

    public Date getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(Date reminderDate) {
        this.reminderDate = reminderDate;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    public Short getHpsOnlyIndicator() {
        return hpsOnlyIndicator;
    }

    public void setHpsOnlyIndicator(Short hpsOnlyIndicator) {
        this.hpsOnlyIndicator = hpsOnlyIndicator;
    }

    public String getMagtapeDiskette() {
        return magtapeDiskette;
    }

    public void setMagtapeDiskette(String magtapeDiskette) {
        this.magtapeDiskette = magtapeDiskette;
    }

    public String getDealerAccount() {
        return dealerAccount;
    }

    public void setDealerAccount(String dealerAccount) {
        this.dealerAccount = dealerAccount;
    }

    public String getDealerSortCode() {
        return dealerSortCode;
    }

    public void setDealerSortCode(String dealerSortCode) {
        this.dealerSortCode = dealerSortCode;
    }

    public String getDealerPaymentMethod() {
        return dealerPaymentMethod;
    }

    public void setDealerPaymentMethod(String dealerPaymentMethod) {
        this.dealerPaymentMethod = dealerPaymentMethod;
    }

    public String getServiceAgentAccount() {
        return serviceAgentAccount;
    }

    public void setServiceAgentAccount(String serviceAgentAccount) {
        this.serviceAgentAccount = serviceAgentAccount;
    }

    public String getServiceAgentSortCode() {
        return serviceAgentSortCode;
    }

    public void setServiceAgentSortCode(String serviceAgentSortCode) {
        this.serviceAgentSortCode = serviceAgentSortCode;
    }

    public String getServiceAgentPaymentMethod() {
        return serviceAgentPaymentMethod;
    }

    public void setServiceAgentPaymentMethod(String serviceAgentPaymentMethod) {
        this.serviceAgentPaymentMethod = serviceAgentPaymentMethod;
    }

    public Integer getFleetSize() {
        return fleetSize;
    }

    public void setFleetSize(Integer fleetSize) {
        this.fleetSize = fleetSize;
    }

    public Integer getEasting() {
        return easting;
    }

    public void setEasting(Integer easting) {
        this.easting = easting;
    }

    public Integer getNorthing() {
        return northing;
    }

    public void setNorthing(Integer northing) {
        this.northing = northing;
    }

    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1;
    }

    public String getComment2() {
        return comment2;
    }

    public void setComment2(String comment2) {
        this.comment2 = comment2;
    }

    public String getComment3() {
        return comment3;
    }

    public void setComment3(String comment3) {
        this.comment3 = comment3;
    }

    public String getComment4() {
        return comment4;
    }

    public void setComment4(String comment4) {
        this.comment4 = comment4;
    }

    public String getComment5() {
        return comment5;
    }

    public void setComment5(String comment5) {
        this.comment5 = comment5;
    }

    public String getComment6() {
        return comment6;
    }

    public void setComment6(String comment6) {
        this.comment6 = comment6;
    }

    public String getComment7() {
        return comment7;
    }

    public void setComment7(String comment7) {
        this.comment7 = comment7;
    }

    public String getWebEnabled() {
        return webEnabled;
    }

    public void setWebEnabled(String webEnabled) {
        this.webEnabled = webEnabled;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public BigDecimal getCreditOutstanding() {
        return creditOutstanding;
    }

    public void setCreditOutstanding(BigDecimal creditOutstanding) {
        this.creditOutstanding = creditOutstanding;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
    	if(publisherId == null) 
    		publisherId=1;
        this.publisherId = publisherId;
    }

    public Integer getGrmDealerId() {
        return grmDealerId;
    }

    public void setGrmDealerId(Integer grmDealerId) {
        this.grmDealerId = grmDealerId;
    }

    public String getLastUser() {
        return lastUser;
    }

    public void setLastUser(String lastUser) {
        this.lastUser = lastUser;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getFcsAccredDealer() {
        return fcsAccredDealer;
    }

    public void setFcsAccredDealer(String fcsAccredDealer) {
        this.fcsAccredDealer = fcsAccredDealer;
    }

    public String getFranchiseDealerInd() {
        return franchiseDealerInd;
    }

    public void setFranchiseDealerInd(String franchiseDealerInd) {
        this.franchiseDealerInd = franchiseDealerInd;
    }

    public String getDefaultPurchaser() {
        return defaultPurchaser;
    }

    public void setDefaultPurchaser(String defaultPurchaser) {
        this.defaultPurchaser = defaultPurchaser;
    }

    public String getMotEnabled() {
        return motEnabled;
    }

    public void setMotEnabled(String motEnabled) {
        this.motEnabled = motEnabled;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerAddress1() {
        return dealerAddress1;
    }

    public void setDealerAddress1(String dealerAddress1) {
        this.dealerAddress1 = dealerAddress1;
    }

    public String getDealerAddress2() {
        return dealerAddress2;
    }

    public void setDealerAddress2(String dealerAddress2) {
        this.dealerAddress2 = dealerAddress2;
    }

    public String getDealerAddress3() {
        return dealerAddress3;
    }

    public void setDealerAddress3(String dealerAddress3) {
        this.dealerAddress3 = dealerAddress3;
    }

    public String getDealerAddress4() {
        return dealerAddress4;
    }

    public void setDealerAddress4(String dealerAddress4) {
        this.dealerAddress4 = dealerAddress4;
    }

    public String getDealerPostcode() {
        return dealerPostcode;
    }

    public void setDealerPostcode(String dealerPostcode) {
        this.dealerPostcode = dealerPostcode;
    }

    public String getDealerFax() {
        return dealerFax;
    }

    public void setDealerFax(String dealerFax) {
        this.dealerFax = dealerFax;
    }

    public String getDealerContact() {
        return dealerContact;
    }

    public void setDealerContact(String dealerContact) {
        this.dealerContact = dealerContact;
    }

    public String getNewAgentNumber() {
        return newAgentNumber;
    }

    public void setNewAgentNumber(String newAgentNumber) {
        this.newAgentNumber = newAgentNumber;
    }

    public String getNewAgentName() {
        return newAgentName;
    }

    public void setNewAgentName(String newAgentName) {
        this.newAgentName = newAgentName;
    }

    public String getNewAgentPostcode() {
        return newAgentPostcode;
    }

    public void setNewAgentPostcode(String newAgentPostcode) {
        this.newAgentPostcode = newAgentPostcode;
    }

    public String getNewAgentComment() {
        return newAgentComment;
    }

    public void setNewAgentComment(String newAgentComment) {
        this.newAgentComment = newAgentComment;
    }

    public String getDealerPhone() {
        return dealerPhone;
    }

    public void setDealerPhone(String dealerPhone) {
        this.dealerPhone = dealerPhone;
    }

    public String getDirectDebit() {
        return directDebit;
    }

    public void setDirectDebit(String directDebit) {
        this.directDebit = directDebit;
    }

    public Integer getExcessStorage() {
        return excessStorage;
    }

    public void setExcessStorage(Integer excessStorage) {
        this.excessStorage = excessStorage;
    }

    public String getFleetStatus() {
        return fleetStatus;
    }

    public void setFleetStatus(String fleetStatus) {
        this.fleetStatus = fleetStatus;
    }

    public Integer getFleetGroupId() {
        return fleetGroupId;
    }

    public void setFleetGroupId(Integer fleetGroupId) {
        this.fleetGroupId = fleetGroupId;
    }

    public Integer getFleetOilBrand() {
        return fleetOilBrand;
    }

    public void setFleetOilBrand(Integer fleetOilBrand) {
        this.fleetOilBrand = fleetOilBrand;
    }

    public BigDecimal getFleetMotRate() {
        return fleetMotRate;
    }

    public void setFleetMotRate(BigDecimal fleetMotRate) {
        this.fleetMotRate = fleetMotRate;
    }

    public String getFleetComment() {
        return fleetComment;
    }

    public void setFleetComment(String fleetComment) {
        this.fleetComment = fleetComment;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Integer getFordAgrmntNo() {
        return fordAgrmntNo;
    }

    public void setFordAgrmntNo(Integer fordAgrmntNo) {
        this.fordAgrmntNo = fordAgrmntNo;
    }

    public String getDefunct() {
        return defunct;
    }

    public void setDefunct(String defunct) {
        this.defunct = defunct;
    }

    public String getArchived() {
        return archived;
    }

    public void setArchived(String archived) {
        this.archived = archived;
    }

    public String getBlockDpsPayments() {
        return blockDpsPayments;
    }

    public void setBlockDpsPayments(String blockDpsPayments) {
        this.blockDpsPayments = blockDpsPayments;
    }

    public String getBlockFordBuyback() {
        return blockFordBuyback;
    }

    public void setBlockFordBuyback(String blockFordBuyback) {
        this.blockFordBuyback = blockFordBuyback;
    }

    public String getBlockHp() {
        return blockHp;
    }

    public void setBlockHp(String blockHp) {
        this.blockHp = blockHp;
    }

    public String getBlockLease() {
        return blockLease;
    }

    public void setBlockLease(String blockLease) {
        this.blockLease = blockLease;
    }

    public String getBlockMfldirect() {
        return blockMfldirect;
    }

    public void setBlockMfldirect(String blockMfldirect) {
        this.blockMfldirect = blockMfldirect;
    }

    public String getBusTypeLease() {
        return busTypeLease;
    }

    public void setBusTypeLease(String busTypeLease) {
        this.busTypeLease = busTypeLease;
    }

    public String getBusTypeHp() {
        return busTypeHp;
    }

    public void setBusTypeHp(String busTypeHp) {
        this.busTypeHp = busTypeHp;
    }

    public String getBusTypeWheelchair() {
        return busTypeWheelchair;
    }

    public void setBusTypeWheelchair(String busTypeWheelchair) {
        this.busTypeWheelchair = busTypeWheelchair;
    }

    public String getBusTypeConverter() {
        return busTypeConverter;
    }

    public void setBusTypeConverter(String busTypeConverter) {
        this.busTypeConverter = busTypeConverter;
    }

    public String getBusTypeBodyshop() {
        return busTypeBodyshop;
    }

    public void setBusTypeBodyshop(String busTypeBodyshop) {
        this.busTypeBodyshop = busTypeBodyshop;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public BigDecimal getCreditLimitAgreed() {
        return creditLimitAgreed;
    }

    public void setCreditLimitAgreed(BigDecimal creditLimitAgreed) {
        this.creditLimitAgreed = creditLimitAgreed;
    }

    public Date getCreditRevisedDate() {
        return creditRevisedDate;
    }

    public void setCreditRevisedDate(Date creditRevisedDate) {
        this.creditRevisedDate = creditRevisedDate;
    }

    public Date getCreditReminderDate() {
        return creditReminderDate;
    }

    public void setCreditReminderDate(Date creditReminderDate) {
        this.creditReminderDate = creditReminderDate;
    }

    public String getDealerTypeAuction() {
        return dealerTypeAuction;
    }

    public void setDealerTypeAuction(String dealerTypeAuction) {
        this.dealerTypeAuction = dealerTypeAuction;
    }

    public String getDealerTypeFordBuyback() {
        return dealerTypeFordBuyback;
    }

    public void setDealerTypeFordBuyback(String dealerTypeFordBuyback) {
        this.dealerTypeFordBuyback = dealerTypeFordBuyback;
    }

    public String getDealerTypeMflDirect() {
        return dealerTypeMflDirect;
    }

    public void setDealerTypeMflDirect(String dealerTypeMflDirect) {
        this.dealerTypeMflDirect = dealerTypeMflDirect;
    }

    public String getDealerTypeOtherBuyback() {
        return dealerTypeOtherBuyback;
    }

    public void setDealerTypeOtherBuyback(String dealerTypeOtherBuyback) {
        this.dealerTypeOtherBuyback = dealerTypeOtherBuyback;
    }

    public String getFaxNumberService() {
        return faxNumberService;
    }

    public void setFaxNumberService(String faxNumberService) {
        this.faxNumberService = faxNumberService;
    }

    public String getFaxNumberSales() {
        return faxNumberSales;
    }

    public void setFaxNumberSales(String faxNumberSales) {
        this.faxNumberSales = faxNumberSales;
    }

    public Date getFcsAccredDate() {
        return fcsAccredDate;
    }

    public void setFcsAccredDate(Date fcsAccredDate) {
        this.fcsAccredDate = fcsAccredDate;
    }

    public String getFcsAftersales() {
        return fcsAftersales;
    }

    public void setFcsAftersales(String fcsAftersales) {
        this.fcsAftersales = fcsAftersales;
    }

    public String getFcsAftersalesOnly() {
        return fcsAftersalesOnly;
    }

    public void setFcsAftersalesOnly(String fcsAftersalesOnly) {
        this.fcsAftersalesOnly = fcsAftersalesOnly;
    }

    public String getFinanceComments() {
        return financeComments;
    }

    public void setFinanceComments(String financeComments) {
        this.financeComments = financeComments;
    }

    public String getFleetAftersaleAgree() {
        return fleetAftersaleAgree;
    }

    public void setFleetAftersaleAgree(String fleetAftersaleAgree) {
        this.fleetAftersaleAgree = fleetAftersaleAgree;
    }

    public Date getFleetAftersaleAgreeDate() {
        return fleetAftersaleAgreeDate;
    }

    public void setFleetAftersaleAgreeDate(Date fleetAftersaleAgreeDate) {
        this.fleetAftersaleAgreeDate = fleetAftersaleAgreeDate;
    }

    public String getFleetContractRecd() {
        return fleetContractRecd;
    }

    public void setFleetContractRecd(String fleetContractRecd) {
        this.fleetContractRecd = fleetContractRecd;
    }

    public Date getFleetContractRecdDate() {
        return fleetContractRecdDate;
    }

    public void setFleetContractRecdDate(Date fleetContractRecdDate) {
        this.fleetContractRecdDate = fleetContractRecdDate;
    }

    public String getFordApplPackSent() {
        return fordApplPackSent;
    }

    public void setFordApplPackSent(String fordApplPackSent) {
        this.fordApplPackSent = fordApplPackSent;
    }

    public Date getFordApplPackSentDate() {
        return fordApplPackSentDate;
    }

    public void setFordApplPackSentDate(Date fordApplPackSentDate) {
        this.fordApplPackSentDate = fordApplPackSentDate;
    }

    public String getFordContractSet() {
        return fordContractSet;
    }

    public void setFordContractSet(String fordContractSet) {
        this.fordContractSet = fordContractSet;
    }

    public Date getFordContractSetDate() {
        return fordContractSetDate;
    }

    public void setFordContractSetDate(Date fordContractSetDate) {
        this.fordContractSetDate = fordContractSetDate;
    }

    public String getFordDirectDebitRecd() {
        return fordDirectDebitRecd;
    }

    public void setFordDirectDebitRecd(String fordDirectDebitRecd) {
        this.fordDirectDebitRecd = fordDirectDebitRecd;
    }

    public Date getFordDirectDebitRecdDate() {
        return fordDirectDebitRecdDate;
    }

    public void setFordDirectDebitRecdDate(Date fordDirectDebitRecdDate) {
        this.fordDirectDebitRecdDate = fordDirectDebitRecdDate;
    }

    public String getFordGuaranteeRecd() {
        return fordGuaranteeRecd;
    }

    public void setFordGuaranteeRecd(String fordGuaranteeRecd) {
        this.fordGuaranteeRecd = fordGuaranteeRecd;
    }

    public Date getFordGuaranteeRecdDate() {
        return fordGuaranteeRecdDate;
    }

    public void setFordGuaranteeRecdDate(Date fordGuaranteeRecdDate) {
        this.fordGuaranteeRecdDate = fordGuaranteeRecdDate;
    }

    public Integer getFordHpiClearanceDays() {
        return fordHpiClearanceDays;
    }

    public void setFordHpiClearanceDays(Integer fordHpiClearanceDays) {
        this.fordHpiClearanceDays = fordHpiClearanceDays;
    }

    public Integer getFordLogBookV5ReleaseDays() {
        return fordLogBookV5ReleaseDays;
    }

    public void setFordLogBookV5ReleaseDays(Integer fordLogBookV5ReleaseDays) {
        this.fordLogBookV5ReleaseDays = fordLogBookV5ReleaseDays;
    }

    public Integer getFordPaymentTermsDays() {
        return fordPaymentTermsDays;
    }

    public void setFordPaymentTermsDays(Integer fordPaymentTermsDays) {
        this.fordPaymentTermsDays = fordPaymentTermsDays;
    }

    public BigDecimal getFordTotalExposure() {
        return fordTotalExposure;
    }

    public void setFordTotalExposure(BigDecimal fordTotalExposure) {
        this.fordTotalExposure = fordTotalExposure;
    }

    public String getFordVsaRecd() {
        return fordVsaRecd;
    }

    public void setFordVsaRecd(String fordVsaRecd) {
        this.fordVsaRecd = fordVsaRecd;
    }

    public Date getFordVsaRecdDate() {
        return fordVsaRecdDate;
    }

    public void setFordVsaRecdDate(Date fordVsaRecdDate) {
        this.fordVsaRecdDate = fordVsaRecdDate;
    }

    public String getGroupGuarantee() {
        return groupGuarantee;
    }

    public void setGroupGuarantee(String groupGuarantee) {
        this.groupGuarantee = groupGuarantee;
    }

    public String getGroupGuarantor() {
        return groupGuarantor;
    }

    public void setGroupGuarantor(String groupGuarantor) {
        this.groupGuarantor = groupGuarantor;
    }

    public String getGuaranteeType() {
        return guaranteeType;
    }

    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }

    public String getHandbackDealer() {
        return handbackDealer;
    }

    public void setHandbackDealer(String handbackDealer) {
        this.handbackDealer = handbackDealer;
    }

    public Integer getHpiClearanceDays() {
        return hpiClearanceDays;
    }

    public void setHpiClearanceDays(Integer hpiClearanceDays) {
        this.hpiClearanceDays = hpiClearanceDays;
    }

    public Integer getLogBookV5ReleaseDays() {
        return logBookV5ReleaseDays;
    }

    public void setLogBookV5ReleaseDays(Integer logBookV5ReleaseDays) {
        this.logBookV5ReleaseDays = logBookV5ReleaseDays;
    }

    public String getMflAccountHandlerDept() {
        return mflAccountHandlerDept;
    }

    public void setMflAccountHandlerDept(String mflAccountHandlerDept) {
        this.mflAccountHandlerDept = mflAccountHandlerDept;
    }

    public String getMflAccountHandler() {
        return mflAccountHandler;
    }

    public void setMflAccountHandler(String mflAccountHandler) {
        this.mflAccountHandler = mflAccountHandler;
    }

    public String getMflAreaManagerDept() {
        return mflAreaManagerDept;
    }

    public void setMflAreaManagerDept(String mflAreaManagerDept) {
        this.mflAreaManagerDept = mflAreaManagerDept;
    }

    public String getMflAreaManager() {
        return mflAreaManager;
    }

    public void setMflAreaManager(String mflAreaManager) {
        this.mflAreaManager = mflAreaManager;
    }

    public String getMflCreditControllerDept() {
        return mflCreditControllerDept;
    }

    public void setMflCreditControllerDept(String mflCreditControllerDept) {
        this.mflCreditControllerDept = mflCreditControllerDept;
    }

    public String getMflCreditController() {
        return mflCreditController;
    }

    public void setMflCreditController(String mflCreditController) {
        this.mflCreditController = mflCreditController;
    }

    public String getMfldApplPackSent() {
        return mfldApplPackSent;
    }

    public void setMfldApplPackSent(String mfldApplPackSent) {
        this.mfldApplPackSent = mfldApplPackSent;
    }

    public Date getMfldApplPackSentDate() {
        return mfldApplPackSentDate;
    }

    public void setMfldApplPackSentDate(Date mfldApplPackSentDate) {
        this.mfldApplPackSentDate = mfldApplPackSentDate;
    }

    public String getMfldAgreementRecd() {
        return mfldAgreementRecd;
    }

    public void setMfldAgreementRecd(String mfldAgreementRecd) {
        this.mfldAgreementRecd = mfldAgreementRecd;
    }

    public Date getMfldAgreementRecdDate() {
        return mfldAgreementRecdDate;
    }

    public void setMfldAgreementRecdDate(Date mfldAgreementRecdDate) {
        this.mfldAgreementRecdDate = mfldAgreementRecdDate;
    }

    public String getMfldCreditApplRecd() {
        return mfldCreditApplRecd;
    }

    public void setMfldCreditApplRecd(String mfldCreditApplRecd) {
        this.mfldCreditApplRecd = mfldCreditApplRecd;
    }

    public Date getMfldCreditApplRecdDate() {
        return mfldCreditApplRecdDate;
    }

    public void setMfldCreditApplRecdDate(Date mfldCreditApplRecdDate) {
        this.mfldCreditApplRecdDate = mfldCreditApplRecdDate;
    }

    public String getMfldCreditLimitSet() {
        return mfldCreditLimitSet;
    }

    public void setMfldCreditLimitSet(String mfldCreditLimitSet) {
        this.mfldCreditLimitSet = mfldCreditLimitSet;
    }

    public Date getMfldCreditLimitSetDate() {
        return mfldCreditLimitSetDate;
    }

    public void setMfldCreditLimitSetDate(Date mfldCreditLimitSetDate) {
        this.mfldCreditLimitSetDate = mfldCreditLimitSetDate;
    }

    public String getMfldDirectDebitRecd() {
        return mfldDirectDebitRecd;
    }

    public void setMfldDirectDebitRecd(String mfldDirectDebitRecd) {
        this.mfldDirectDebitRecd = mfldDirectDebitRecd;
    }

    public Date getMfldDirectDebitRecdDate() {
        return mfldDirectDebitRecdDate;
    }

    public void setMfldDirectDebitRecdDate(Date mfldDirectDebitRecdDate) {
        this.mfldDirectDebitRecdDate = mfldDirectDebitRecdDate;
    }

    public String getMfldPasswordIssued() {
        return mfldPasswordIssued;
    }

    public void setMfldPasswordIssued(String mfldPasswordIssued) {
        this.mfldPasswordIssued = mfldPasswordIssued;
    }

    public Date getMfldPasswordIssuedDate() {
        return mfldPasswordIssuedDate;
    }

    public void setMfldPasswordIssuedDate(Date mfldPasswordIssuedDate) {
        this.mfldPasswordIssuedDate = mfldPasswordIssuedDate;
    }

    public String getMotSubLet() {
        return motSubLet;
    }

    public void setMotSubLet(String motSubLet) {
        this.motSubLet = motSubLet;
    }

    public Integer getPaymentTermsDays() {
        return paymentTermsDays;
    }

    public void setPaymentTermsDays(Integer paymentTermsDays) {
        this.paymentTermsDays = paymentTermsDays;
    }

    public String getRefundAccount() {
        return refundAccount;
    }

    public void setRefundAccount(String refundAccount) {
        this.refundAccount = refundAccount;
    }

    public String getRefundSortCode() {
        return refundSortCode;
    }

    public void setRefundSortCode(String refundSortCode) {
        this.refundSortCode = refundSortCode;
    }

    public String getRefundPaymentMethod() {
        return refundPaymentMethod;
    }

    public void setRefundPaymentMethod(String refundPaymentMethod) {
        this.refundPaymentMethod = refundPaymentMethod;
    }

    public String getTelephoneNumberService() {
        return telephoneNumberService;
    }

    public void setTelephoneNumberService(String telephoneNumberService) {
        this.telephoneNumberService = telephoneNumberService;
    }

    public String getTelephoneNumberSales() {
        return telephoneNumberSales;
    }

    public void setTelephoneNumberSales(String telephoneNumberSales) {
        this.telephoneNumberSales = telephoneNumberSales;
    }

    public String getVsRaIndicator() {
        return vsRaIndicator;
    }

    public void setVsRaIndicator(String vsRaIndicator) {
        this.vsRaIndicator = vsRaIndicator;
    }

    public Date getVsRaAgreementDate() {
        return vsRaAgreementDate;
    }

    public void setVsRaAgreementDate(Date vsRaAgreementDate) {
        this.vsRaAgreementDate = vsRaAgreementDate;
    }

    public String getFleetNegotiator() {
        return fleetNegotiator;
    }

    public void setFleetNegotiator(String fleetNegotiator) {
        this.fleetNegotiator = fleetNegotiator;
    }

    public String getFinanceEmail() {
        return financeEmail;
    }

    public void setFinanceEmail(String financeEmail) {
        this.financeEmail = financeEmail;
    }

    public String getAgentEmail() {
        return agentEmail;
    }

    public void setAgentEmail(String agentEmail) {
        this.agentEmail = agentEmail;
    }

    public String getAgentWebsite() {
        return agentWebsite;
    }

    public void setAgentWebsite(String agentWebsite) {
        this.agentWebsite = agentWebsite;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentLegalName() {
        return agentLegalName;
    }

    public void setAgentLegalName(String agentLegalName) {
        this.agentLegalName = agentLegalName;
    }

    public String getDealerEmail() {
        return dealerEmail;
    }

    public void setDealerEmail(String dealerEmail) {
        this.dealerEmail = dealerEmail;
    }

    public DealerPartner getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(DealerPartner partnerType) {
        this.partnerType = partnerType;
    }

    public Integer getFsaRegType() {
        return fsaRegType;
    }

    public void setFsaRegType(Integer fsaRegType) {
        this.fsaRegType = fsaRegType;
    }

    public String getFsaRegNo() {
        return fsaRegNo;
    }

    public void setFsaRegNo(String fsaRegNo) {
        this.fsaRegNo = fsaRegNo;
    }

    public String getSelfBillable() {
        return selfBillable;
    }

    public void setSelfBillable(String selfBillable) {
        this.selfBillable = selfBillable;
    }
    @XmlElement(required=true)
    public String getEsignatureInd() {
        return esignatureInd;
    }

    public void setEsignatureInd(String esignatureInd) {
        this.esignatureInd = esignatureInd;
    }

    public String getRefundHolderName() {
        return refundHolderName;
    }

    public void setRefundHolderName(String refundHolderName) {
        this.refundHolderName = refundHolderName;
    }

    public String getCreditFacilitiesInd() {
        return creditFacilitiesInd;
    }

    public void setCreditFacilitiesInd(String creditFacilitiesInd) {
        this.creditFacilitiesInd = creditFacilitiesInd;
    }

    public String getPurchasingInvoiceEmail() {
        return purchasingInvoiceEmail;
    }

    public void setPurchasingInvoiceEmail(String purchasingInvoiceEmail) {
        this.purchasingInvoiceEmail = purchasingInvoiceEmail;
    }

    public String getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(String accountManager) {
        this.accountManager = accountManager;
    }

    public String getBlockHpNewOnly() {
        return blockHpNewOnly;
    }

    public void setBlockHpNewOnly(String blockHpNewOnly) {
        this.blockHpNewOnly = blockHpNewOnly;
    }

    public String getBlockLeaseNewOnly() {
        return blockLeaseNewOnly;
    }

    public void setBlockLeaseNewOnly(String blockLeaseNewOnly) {
        this.blockLeaseNewOnly = blockLeaseNewOnly;
    }

    public String getTradeIn() {
        return tradeIn;
    }

    public void setTradeIn(String tradeIn) {
        this.tradeIn = tradeIn;
    }
    @XmlElement(required=true)
    public DealerCategory getDealerCategory() {
        return dealerCategory;
    }

    public void setDealerCategory(DealerCategory dealerCategory) {
        this.dealerCategory = dealerCategory;
    }

    public String getInsuranceRepairer() {
        return isInsuranceRepairer;
    }

    public void setInsuranceRepairer(String insuranceRepairer) {
        isInsuranceRepairer = insuranceRepairer;
    }

    public String getHomeVisitor() {
        return isHomeVisitor;
    }

    public void setHomeVisitor(String homeVisitor) {
        isHomeVisitor = homeVisitor;
    }

    public String getHasShowroom() {
        return hasShowroom;
    }

    public void setHasShowroom(String hasShowroom) {
        this.hasShowroom = hasShowroom;
    }

    public String getConsumerCreditLicenceNo() {
        return consumerCreditLicenceNo;
    }

    public void setConsumerCreditLicenceNo(String consumerCreditLicenceNo) {
        this.consumerCreditLicenceNo = consumerCreditLicenceNo;
    }

    public DealerExtraBean getExtra() {
        return extra;
    }

    public void setExtra(DealerExtraBean extra) {
        this.extra = extra;
    }

    public List<DealerFcsDateBean> getDealerFcsDateBean() {
        return dealerFcsDateBean;
    }

    public void setDealerFcsDateBean(List<DealerFcsDateBean> dealerFcsDateBean) {
        this.dealerFcsDateBean = dealerFcsDateBean;
    }

    public List<DealerCoverage> getDealerCoverage() {
        return dealerCoverage;
    }

    public void setDealerCoverage(List<DealerCoverage> dealerCoverage) {
        this.dealerCoverage = dealerCoverage;
    }

    public List<DealerProductType> getProductType() {
        return productType;
    }

    public void setProductType(List<DealerProductType> productType) {
        this.productType = productType;
    }

	public void setDealerGroupDealerlink(List<DealerGroupDealerLinkBean> dealerGroupDealerlink) {
		this.dealerGroupDealerlink = dealerGroupDealerlink;
	}

	public List<DealerGroupDealerLinkBean> getDealerGroupDealerlink() {
		return dealerGroupDealerlink;
	}
}