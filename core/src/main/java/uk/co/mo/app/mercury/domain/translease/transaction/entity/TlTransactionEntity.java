package uk.co.mo.app.mercury.domain.translease.transaction.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlItemLineEntity;
import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlPartsDetailEntity;
import uk.co.mo.app.mercury.domain.translease.transaction.beans.TlTransactionBean;

@javax.persistence.Table(name = "tl_transaction", schema = "dbo", catalog = "Enterprise")
@Entity
public class TlTransactionEntity implements Serializable {

	private static final long serialVersionUID = 7951280086348875626L;

	private String vrmOkToProcess;
	
	private TlTransactionBean tlTransactionBean = new TlTransactionBean();

	@Transient
	public TlTransactionBean getTlTransactionBean() {
		return tlTransactionBean;
	}
	public void setTlTransactionBean(TlTransactionBean tlTransactionBean) {
		this.tlTransactionBean = tlTransactionBean;
	}

	private List <TlItemLineEntity> tlItemLineEntity;
	private List <TlPartsDetailEntity> tlPartsDetailEntity;
	@OneToMany (mappedBy="tlTransactionEntity", cascade={CascadeType.ALL} )
	public List<TlItemLineEntity> getTlItemLineEntity() {
		return tlItemLineEntity;
	}
	public void setTlItemLineEntity(List<TlItemLineEntity> tlItemLineEntity) {
		this.tlItemLineEntity = tlItemLineEntity;
	}
	@OneToMany (mappedBy="tlTransactionEntity", cascade={CascadeType.ALL} )
	public List<TlPartsDetailEntity> getTlPartsDetailEntity() {
		return tlPartsDetailEntity;
	}
	public void setTlPartsDetailEntity(List<TlPartsDetailEntity> tlPartsDetailEntity) {
		this.tlPartsDetailEntity = tlPartsDetailEntity;
	}

	@Id
	@Column(name="translease_transaction_number", unique=true, nullable=false, columnDefinition="INT")
	public Integer getTransleaseTransactionNumber() {
		return tlTransactionBean.getTransleaseTransactionNumber();
	}

	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.tlTransactionBean.setTransleaseTransactionNumber(transleaseTransactionNumber);
	}

	@Column(name="asset_number", nullable=false, columnDefinition="INT")
	public Integer getAssetNumber() {
		return tlTransactionBean.getAssetNumber();
	}

	public void setAssetNumber(Integer assetNumber) {
		tlTransactionBean.setAssetNumber(assetNumber);
	}

	@Column(name="authorisation_code", length=10, columnDefinition="VARCHAR(10)")
	public String getAuthorisationCode() {
		return tlTransactionBean.getAuthorisationCode();
	}

	public void setAuthorisationCode(String authorisationCode) {
		tlTransactionBean.setAuthorisationCode(authorisationCode);
	}

	@Column(name="car_registration_number", nullable=false, length=8, columnDefinition="CHAR(8)")
	public String getCarRegistrationNumber() {
		return tlTransactionBean.getCarRegistrationNumber();
	}

	public void setCarRegistrationNumber(String carRegistrationNumber) {
		tlTransactionBean.setCarRegistrationNumber(carRegistrationNumber);
	}

	@Column(name="driver_name", length=40, columnDefinition="VARCHAR(40)")
	public String getDriverName() {
		return tlTransactionBean.getDriverName();
	}

	public void setDriverName(String driverName) {
		this.tlTransactionBean.setDriverName(driverName);
	}

	@Column(name="leaseco_controller_id", length=10, columnDefinition="CHAR(10)")
	public String getLeasecoControllerId() {
		return tlTransactionBean.getLeasecoControllerId();
	}

	public void setLeasecoControllerId(String leasecoControllerId) {
		this.tlTransactionBean.setLeasecoControllerId(leasecoControllerId);
	}

	@Column(name="leaseco_repairer_ref", nullable=false, length=5, columnDefinition="CHAR(5)")
	public String getLeasecoRepairerRef() {
		return tlTransactionBean.getLeasecoRepairerRef();
	}

	public void setLeasecoRepairerRef(String leasecoRepairerRef) {
		this.tlTransactionBean.setLeasecoRepairerRef(leasecoRepairerRef);
	}

	@Column(name="odometer_reading", nullable=false, columnDefinition="INT")
	public Integer getOdometerReading() {
		return this.tlTransactionBean.getOdometerReading();
	}

	public void setOdometerReading(Integer odometerReading) {
		this.tlTransactionBean.setOdometerReading(odometerReading);
	}

	@Column(name="order_number_or_auth_code", length=20, columnDefinition="VARCHAR(20)")
	public String getOrderNumberOrAuthCode() {
		return this.tlTransactionBean.getOrderNumberOrAuthCode();
	}

	public void setOrderNumberOrAuthCode(String orderNumberOrAuthCode) {
		this.tlTransactionBean.setOrderNumberOrAuthCode(orderNumberOrAuthCode);
	}

	@Column(name="repair_date")
	public Date getRepairDate() {
		return this.tlTransactionBean.getRepairDate();
	}

	public void setRepairDate(Date repairDate) {
		this.tlTransactionBean.setRepairDate(repairDate);
	}

	@Column(name="repairer_address_1", nullable=false, length=30, columnDefinition="CHAR(30)")
	public String getRepairerAddress1() {
		return this.tlTransactionBean.getRepairerAddress1();
	}

	public void setRepairerAddress1(String repairerAddress1) {
		this.tlTransactionBean.setRepairerAddress1(repairerAddress1);
	}

	@Column(name="repairer_address_2", nullable=false, length=30, columnDefinition="CHAR(30)")
	public String getRepairerAddress2() {
		return this.tlTransactionBean.getRepairerAddress2();
	}

	public void setRepairerAddress2(String repairerAddress2) {
		this.tlTransactionBean.setRepairerAddress2(repairerAddress2);
	}

	@Column(name="repairer_address_3", length=30, columnDefinition="CHAR(30)")
	public String getRepairerAddress3() {
		return this.tlTransactionBean.getRepairerAddress3();
	}

	public void setRepairerAddress3(String repairerAddress3) {
		this.tlTransactionBean.setRepairerAddress3(repairerAddress3);
	}

	@Column(name="repairer_address_4", length=30, columnDefinition="CHAR(30)")
	public String getRepairerAddress4() {
		return this.tlTransactionBean.getRepairerAddress4();
	}

	public void setRepairerAddress4(String repairerAddress4) {
		this.tlTransactionBean.setRepairerAddress4(repairerAddress4);
	}

	@Column(name="repairer_address_5", length=30, columnDefinition="VARCHAR(30)")
	public String getRepairerAddress5() {
		return this.tlTransactionBean.getRepairerAddress5();
	}

	public void setRepairerAddress5(String repairerAddress5) {
		this.tlTransactionBean.setRepairerAddress5(repairerAddress5);
	}

	@Column(name="repairer_contact_number", length=15, columnDefinition="VARCHAR(15)")
	public String getRepairerContactNumber() {
		return this.tlTransactionBean.getRepairerContactNumber();
	}

	public void setRepairerContactNumber(String repairerContactNumber) {
		this.tlTransactionBean.setRepairerContactNumber(repairerContactNumber);
	}

	@Column(name="repairer_job_no_or_depot_no", length=10, columnDefinition="VARCHAR(40)")
	public String getRepairerJobNoOrDepotNo() {
		return this.tlTransactionBean.getRepairerJobNoOrDepotNo();
	}

	public void setRepairerJobNoOrDepotNo(String repairerJobNoOrDepotNo) {
		this.tlTransactionBean.setRepairerJobNoOrDepotNo(repairerJobNoOrDepotNo);
	}

	@Column(name="repairer_name", nullable=false, length=30, columnDefinition="CHAR(30)")
	public String getRepairerName() {
		return this.tlTransactionBean.getRepairerName();
	}

	public void setRepairerName(String repairerName) {
		this.tlTransactionBean.setRepairerName(repairerName);
	}

	@Column(name="repairer_postcode", length=8, columnDefinition="CHAR(8)")
	public String getRepairerPostcode() {
		return this.tlTransactionBean.getRepairerPostcode();
	}

	public void setRepairerPostcode(String repairerPostcode) {
		this.tlTransactionBean.setRepairerPostcode(repairerPostcode);
	}

	@Column(name="repairer_vat_number", length=10, columnDefinition="VARCHAR(10)")
	public String getRepairerVatNumber() {
		return this.tlTransactionBean.getRepairerVatNumber();
	}

	public void setRepairerVatNumber(String repairerVatNumber) {
		this.tlTransactionBean.setRepairerVatNumber(repairerVatNumber);
	}

//TODO clean up if test passes
//	@Column(name="row_insert_date", columnDefinition="SMALLDATETIME")
//	public Date getRowInsertDate() {
//		return this.tlTransactionBean.getRowInsertDate();
//	}
//
//	public void setRowInsertDate(Date rowInsertDate) {
//		this.tlTransactionBean.setRowInsertDate(rowInsertDate);
//	}

	@Column(name="spare_utilised_flag", length=1, columnDefinition="CHAR(1)")
	public String getSpareUtilisedFlag() {
		return this.tlTransactionBean.getSpareUtilisedFlag();
	}

	public void setSpareUtilisedFlag(String spareUtilisedFlag) {
		this.tlTransactionBean.setSpareUtilisedFlag(spareUtilisedFlag);
	}

	@Column(name="total_driver_contribution", precision=7, scale=2, columnDefinition="NUMBERIC(7,2)")
	public BigDecimal getTotalDriverContribution() {
		return this.tlTransactionBean.getTotalDriverContribution();
	}

	public void setTotalDriverContribution(BigDecimal totalDriverContribution) {
		this.tlTransactionBean.setTotalDriverContribution(totalDriverContribution);
	}

	@Column(name="total_gross_labour_cost", precision=7, scale=2, columnDefinition="NUMBERIC(7,2)")
	public BigDecimal getTotalGrossLabourCost() {
		return this.tlTransactionBean.getTotalGrossLabourCost();
	}

	public void setTotalGrossLabourCost(BigDecimal totalGrossLabourCost) {
		this.tlTransactionBean.setTotalGrossLabourCost(totalGrossLabourCost);
	}

	@Column(name="total_gross_parts_cost", precision=7, scale=2, columnDefinition="NUMBERIC(7,2)")
	public BigDecimal getTotalGrossPartsCost() {
		return this.tlTransactionBean.getTotalGrossPartsCost();
	}

	public void setTotalGrossPartsCost(BigDecimal totalGrossPartsCost) {
		this.tlTransactionBean.setTotalGrossPartsCost(totalGrossPartsCost);
	}

	@Column(name="total_gross_transaction_cost", precision=7, scale=2, columnDefinition="NUMBERIC(7,2)")
	public BigDecimal getTotalGrossTransactionCost() {
		return this.tlTransactionBean.getTotalGrossTransactionCost();
	}

	public void setTotalGrossTransactionCost(BigDecimal totalGrossTransactionCost) {
		this.tlTransactionBean.setTotalGrossTransactionCost(totalGrossTransactionCost);
	}

	@Column(name="total_nett_labour_cost", nullable=false, precision=7, scale=2, columnDefinition="NUMBERIC(7,2)")
	public BigDecimal getTotalNettLabourCost() {
		return this.tlTransactionBean.getTotalNettLabourCost();
	}

	public void setTotalNettLabourCost(BigDecimal totalNettLabourCost) {
		this.tlTransactionBean.setTotalNettLabourCost(totalNettLabourCost);
	}

	@Column(name="total_nett_parts_cost", nullable=false, precision=7, scale=2, columnDefinition="NUMBERIC(7,2)")
	public BigDecimal getTotalNettPartsCost() {
		return this.tlTransactionBean.getTotalNettPartsCost();
	}

	public void setTotalNettPartsCost(BigDecimal totalNettPartsCost) {
		this.tlTransactionBean.setTotalNettPartsCost(totalNettPartsCost);
	}

	@Column(name="total_nett_transaction_cost", nullable=false, precision=7, scale=2, columnDefinition="NUMBERIC(7,2)")
	public BigDecimal getTotalNettTransactionCost() {
		return this.tlTransactionBean.getTotalNettTransactionCost();
	}

	public void setTotalNettTransactionCost(BigDecimal totalNettTransactionCost) {
		this.tlTransactionBean.setTotalNettTransactionCost(totalNettTransactionCost);
	}

	@Column(name="transaction_date", nullable=false, columnDefinition="SMALLDATETIME")
	public Date getTransactionDate() {
		return this.tlTransactionBean.getTransactionDate();
	}

	public void setTransactionDate(Date transactionDate) {
		this.tlTransactionBean.setTransactionDate(transactionDate);
	}

	@Column(name="transaction_serial_number", precision=8, columnDefinition="NUMBERIC(8,0)")
	public BigDecimal getTransactionSerialNumber() {
		return this.tlTransactionBean.getTransactionSerialNumber();
	}

	public void setTransactionSerialNumber(BigDecimal transactionSerialNumber) {
		this.tlTransactionBean.setTransactionSerialNumber(transactionSerialNumber);
	}

	@Column(name="transaction_type", nullable=false, length=1, columnDefinition="CHAR(1)")
	public String getTransactionType() {
		return this.tlTransactionBean.getTransactionType();
	}

	public void setTransactionType(String transactionType) {
		this.tlTransactionBean.setTransactionType(transactionType);
	}

	@Column(name="transaction_version_number", nullable=false, columnDefinition="TINYINT")
	public Long getTransactionVersionNumber() {
		return this.tlTransactionBean.getTransactionVersionNumber();
	}

	public void setTransactionVersionNumber(Long transactionVersionNumber) {
		this.tlTransactionBean.setTransactionVersionNumber(transactionVersionNumber);
	}

	@Column(name="translease_leaseco_ref", nullable=false, columnDefinition="INT")
	public Integer getTransleaseLeasecoRef() {
		return this.tlTransactionBean.getTransleaseLeasecoRef();
	}

	public void setTransleaseLeasecoRef(Integer transleaseLeasecoRef) {
		this.tlTransactionBean.setTransleaseLeasecoRef(transleaseLeasecoRef);
	}

	@Column(name="translease_repairer_number", nullable=false, columnDefinition="INT")
	public Integer getTransleaseRepairerNumber() {
		return this.tlTransactionBean.getTransleaseRepairerNumber();
	}

	public void setTransleaseRepairerNumber(Integer transleaseRepairerNumber) {
		this.tlTransactionBean.setTransleaseRepairerNumber(transleaseRepairerNumber);
	}

	@Column(name="vat_amount", precision=7, scale=2, columnDefinition="NUMBERIC(7,2)")
	public BigDecimal getVatAmount() {
		return this.tlTransactionBean.getVatAmount();
	}

	public void setVatAmount(BigDecimal vatAmount) {
		this.tlTransactionBean.setVatAmount(vatAmount);
	}

	@Column(name="vin_number", length=20, columnDefinition="VARCHAR(20)")
	public String getVinNumber() {
		return this.tlTransactionBean.getVinNumber();
	}

	public void setVinNumber(String vinNumber) {
		this.tlTransactionBean.setVinNumber(vinNumber);
	}

	@Column(name="vrm_ok_to_process", length=1, columnDefinition="CHAR(1)")
	public String getVrmOkToProcess() {
		return vrmOkToProcess;
	}

	public void setVrmOkToProcess(String vrmOkToProcess) {
		this.vrmOkToProcess = vrmOkToProcess;
	}
}
