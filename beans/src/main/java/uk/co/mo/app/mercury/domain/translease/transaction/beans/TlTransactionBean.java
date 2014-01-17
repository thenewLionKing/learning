package uk.co.mo.app.mercury.domain.translease.transaction.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlItemLineBean;
import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlPartsDetailBean;

@XmlAccessorType(XmlAccessType.FIELD)
public class TlTransactionBean implements Serializable {

	private static final long serialVersionUID = 991050893160200683L;

    private Integer transleaseTransactionNumber;
    private Long transactionVersionNumber;
    private Integer transleaseLeasecoRef;
	private Integer transleaseRepairerNumber;
	private Integer assetNumber;
    private String leasecoRepairerRef;
    private Integer odometerReading;
    private Date transactionDate;
    private String transactionType;
    private String repairerName;
    private String repairerAddress1;
    private String repairerAddress2;
    private BigDecimal totalNettLabourCost;
    private BigDecimal totalNettPartsCost;
    private BigDecimal totalNettTransactionCost;
    private String carRegistrationNumber;
    private BigDecimal vatAmount;
    private BigDecimal totalGrossLabourCost;
	private BigDecimal totalGrossPartsCost;
	private BigDecimal totalGrossTransactionCost;

    private String authorisationCode;

	private String driverName;
	private String leasecoControllerId;
	private String orderNumberOrAuthCode;
	private Date repairDate;
	private String repairerAddress3;
	private String repairerAddress4;
	private String repairerAddress5;
	private String repairerContactNumber;
	private String repairerJobNoOrDepotNo;
	private String repairerPostcode;
	private String repairerVatNumber;
	private String spareUtilisedFlag;
	private BigDecimal totalDriverContribution;
	private BigDecimal transactionSerialNumber;

	private String vinNumber;

	private List <TlItemLineBean> tlItemLineBeans;
	private List <TlPartsDetailBean> tlPartsDetailBeans;

	public List<TlItemLineBean> getTlItemLineBeans() {
		return tlItemLineBeans;
	}
	public void setTlItemLineBeans(List<TlItemLineBean> tlItemLineBeans) {
		this.tlItemLineBeans = tlItemLineBeans;
	}

	public List<TlPartsDetailBean> getTlPartsDetailBeans() {
		return tlPartsDetailBeans;
	}
	public void setTlPartsDetailBeans(List<TlPartsDetailBean> tlPartsDetailBeans) {
		this.tlPartsDetailBeans = tlPartsDetailBeans;
	}

	public Integer getTransleaseTransactionNumber() {
		return this.transleaseTransactionNumber;
	}
	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.transleaseTransactionNumber = transleaseTransactionNumber;
	}

	public Integer getAssetNumber() {
		return this.assetNumber;
	}

	public void setAssetNumber(Integer assetNumber) {
		this.assetNumber = assetNumber;
	}

	public String getAuthorisationCode() {
		return this.authorisationCode;
	}

	public void setAuthorisationCode(String authorisationCode) {
		this.authorisationCode = authorisationCode;
	}

	public String getCarRegistrationNumber() {
		return this.carRegistrationNumber;
	}

	public void setCarRegistrationNumber(String carRegistrationNumber) {
		this.carRegistrationNumber = carRegistrationNumber;
	}

	public String getDriverName() {
		return this.driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getLeasecoControllerId() {
		return this.leasecoControllerId;
	}

	public void setLeasecoControllerId(String leasecoControllerId) {
		this.leasecoControllerId = leasecoControllerId;
	}

	public String getLeasecoRepairerRef() {
		return this.leasecoRepairerRef;
	}

	public void setLeasecoRepairerRef(String leasecoRepairerRef) {
		this.leasecoRepairerRef = leasecoRepairerRef;
	}

	public Integer getOdometerReading() {
		return this.odometerReading;
	}

	public void setOdometerReading(Integer odometerReading) {
		this.odometerReading = odometerReading;
	}

	public String getOrderNumberOrAuthCode() {
		return this.orderNumberOrAuthCode;
	}

	public void setOrderNumberOrAuthCode(String orderNumberOrAuthCode) {
		this.orderNumberOrAuthCode = orderNumberOrAuthCode;
	}

	public Date getRepairDate() {
		return this.repairDate;
	}

	public void setRepairDate(Date repairDate) {
		this.repairDate = repairDate;
	}

	public String getRepairerAddress1() {
		return this.repairerAddress1;
	}

	public void setRepairerAddress1(String repairerAddress1) {
		this.repairerAddress1 = repairerAddress1;
	}

	public String getRepairerAddress2() {
		return this.repairerAddress2;
	}

	public void setRepairerAddress2(String repairerAddress2) {
		this.repairerAddress2 = repairerAddress2;
	}

	public String getRepairerAddress3() {
		return this.repairerAddress3;
	}

	public void setRepairerAddress3(String repairerAddress3) {
		this.repairerAddress3 = repairerAddress3;
	}

	public String getRepairerAddress4() {
		return this.repairerAddress4;
	}

	public void setRepairerAddress4(String repairerAddress4) {
		this.repairerAddress4 = repairerAddress4;
	}

	public String getRepairerAddress5() {
		return this.repairerAddress5;
	}

	public void setRepairerAddress5(String repairerAddress5) {
		this.repairerAddress5 = repairerAddress5;
	}

	public String getRepairerContactNumber() {
		return this.repairerContactNumber;
	}

	public void setRepairerContactNumber(String repairerContactNumber) {
		this.repairerContactNumber = repairerContactNumber;
	}

	public String getRepairerJobNoOrDepotNo() {
		return this.repairerJobNoOrDepotNo;
	}

	public void setRepairerJobNoOrDepotNo(String repairerJobNoOrDepotNo) {
		this.repairerJobNoOrDepotNo = repairerJobNoOrDepotNo;
	}

	public String getRepairerName() {
		return this.repairerName;
	}

	public void setRepairerName(String repairerName) {
		this.repairerName = repairerName;
	}

	public String getRepairerPostcode() {
		return this.repairerPostcode;
	}

	public void setRepairerPostcode(String repairerPostcode) {
		this.repairerPostcode = repairerPostcode;
	}

	public String getRepairerVatNumber() {
		return this.repairerVatNumber;
	}

	public void setRepairerVatNumber(String repairerVatNumber) {
		this.repairerVatNumber = repairerVatNumber;
	}
	public String getSpareUtilisedFlag() {
		return this.spareUtilisedFlag;
	}

	public void setSpareUtilisedFlag(String spareUtilisedFlag) {
		this.spareUtilisedFlag = spareUtilisedFlag;
	}

	public BigDecimal getTotalDriverContribution() {
		return this.totalDriverContribution;
	}

	public void setTotalDriverContribution(BigDecimal totalDriverContribution) {
		this.totalDriverContribution = totalDriverContribution;
	}

	public BigDecimal getTotalGrossLabourCost() {
		return this.totalGrossLabourCost;
	}

	public void setTotalGrossLabourCost(BigDecimal totalGrossLabourCost) {
		this.totalGrossLabourCost = totalGrossLabourCost;
	}

	public BigDecimal getTotalGrossPartsCost() {
		return this.totalGrossPartsCost;
	}

	public void setTotalGrossPartsCost(BigDecimal totalGrossPartsCost) {
		this.totalGrossPartsCost = totalGrossPartsCost;
	}

	public BigDecimal getTotalGrossTransactionCost() {
		return this.totalGrossTransactionCost;
	}

	public void setTotalGrossTransactionCost(BigDecimal totalGrossTransactionCost) {
		this.totalGrossTransactionCost = totalGrossTransactionCost;
	}

	public BigDecimal getTotalNettLabourCost() {
		return this.totalNettLabourCost;
	}

	public void setTotalNettLabourCost(BigDecimal totalNettLabourCost) {
		this.totalNettLabourCost = totalNettLabourCost;
	}
	public BigDecimal getTotalNettPartsCost() {
		return this.totalNettPartsCost;
	}

	public void setTotalNettPartsCost(BigDecimal totalNettPartsCost) {
		this.totalNettPartsCost = totalNettPartsCost;
	}
	public BigDecimal getTotalNettTransactionCost() {
		return this.totalNettTransactionCost;
	}
	public void setTotalNettTransactionCost(BigDecimal totalNettTransactionCost) {
		this.totalNettTransactionCost = totalNettTransactionCost;
	}
	public Date getTransactionDate() {
		return this.transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public BigDecimal getTransactionSerialNumber() {
		return this.transactionSerialNumber;
	}
	public void setTransactionSerialNumber(BigDecimal transactionSerialNumber) {
		this.transactionSerialNumber = transactionSerialNumber;
	}
	public String getTransactionType() {
		return this.transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Long getTransactionVersionNumber() {
		return this.transactionVersionNumber;
	}
	public void setTransactionVersionNumber(Long transactionVersionNumber) {
		this.transactionVersionNumber = transactionVersionNumber;
	}
	public Integer getTransleaseLeasecoRef() {
		return this.transleaseLeasecoRef;
	}
	public void setTransleaseLeasecoRef(Integer transleaseLeasecoRef) {
		this.transleaseLeasecoRef = transleaseLeasecoRef;
	}
	public Integer getTransleaseRepairerNumber() {
		return this.transleaseRepairerNumber;
	}
	public void setTransleaseRepairerNumber(Integer transleaseRepairerNumber) {
		this.transleaseRepairerNumber = transleaseRepairerNumber;
	}
	public BigDecimal getVatAmount() {
		return this.vatAmount;
	}

	public void setVatAmount(BigDecimal vatAmount) {
		this.vatAmount = vatAmount;
	}

	public String getVinNumber() {
		return this.vinNumber;
	}

	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}

    @Override
    public String toString() {
        return "TlTransactionBean{" +
                "transleaseTransactionNumber=" + transleaseTransactionNumber +
                ", transactionVersionNumber=" + transactionVersionNumber +
                ", transleaseLeasecoRef=" + transleaseLeasecoRef +
                ", transleaseRepairerNumber=" + transleaseRepairerNumber +
                ", assetNumber=" + assetNumber +
                ", leasecoRepairerRef='" + leasecoRepairerRef + '\'' +
                ", odometerReading=" + odometerReading +
                ", transactionDate=" + transactionDate +
                ", transactionType='" + transactionType + '\'' +
                ", repairerName='" + repairerName + '\'' +
                ", repairerAddress1='" + repairerAddress1 + '\'' +
                ", repairerAddress2='" + repairerAddress2 + '\'' +
                ", totalNettLabourCost=" + totalNettLabourCost +
                ", totalNettPartsCost=" + totalNettPartsCost +
                ", totalNettTransactionCost=" + totalNettTransactionCost +
                ", carRegistrationNumber='" + carRegistrationNumber + '\'' +
                ", vatAmount=" + vatAmount +
                ", totalGrossLabourCost=" + totalGrossLabourCost +
                ", totalGrossPartsCost=" + totalGrossPartsCost +
                ", totalGrossTransactionCost=" + totalGrossTransactionCost +
                ", authorisationCode='" + authorisationCode + '\'' +
                ", driverName='" + driverName + '\'' +
                ", leasecoControllerId='" + leasecoControllerId + '\'' +
                ", orderNumberOrAuthCode='" + orderNumberOrAuthCode + '\'' +
                ", repairDate=" + repairDate +
                ", repairerAddress3='" + repairerAddress3 + '\'' +
                ", repairerAddress4='" + repairerAddress4 + '\'' +
                ", repairerAddress5='" + repairerAddress5 + '\'' +
                ", repairerContactNumber='" + repairerContactNumber + '\'' +
                ", repairerJobNoOrDepotNo='" + repairerJobNoOrDepotNo + '\'' +
                ", repairerPostcode='" + repairerPostcode + '\'' +
                ", repairerVatNumber='" + repairerVatNumber + '\'' +
                ", spareUtilisedFlag='" + spareUtilisedFlag + '\'' +
                ", totalDriverContribution=" + totalDriverContribution +
                ", transactionSerialNumber=" + transactionSerialNumber +
                ", vinNumber='" + vinNumber + '\'' +
                '}';
    }
}
