package uk.co.mo.app.mercury.domain.translease.invoice.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlItemLineBean;
import uk.co.mo.app.mercury.domain.translease.transaction.entity.TlTransactionEntity;

@Entity
@Table(name="tl_item_lines")
public class TlItemLineEntity implements Serializable {
	private static final long serialVersionUID = 6407698471117683456L;

	private TlItemLinePKEntity id;

	private TlItemLineBean tlItemLineBean = new TlItemLineBean();

	@Transient
	public TlItemLineBean getTlItemLineBean() {
		return tlItemLineBean;
	}

	public void setTlItemLineBean(TlItemLineBean tlItemLineBean) {
		this.tlItemLineBean = tlItemLineBean;
	}

	private TlInvoiceCreditEntity tlInvoiceCreditEntity;

	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn ( name="translease_transaction_number", nullable=false, updatable=false, insertable=false)
	public TlInvoiceCreditEntity getTlInvoiceCreditEntity() {
		return tlInvoiceCreditEntity;
	}
	public void setTlInvoiceCreditEntity(TlInvoiceCreditEntity tlInvoiceCreditEntity) {
		this.tlInvoiceCreditEntity = tlInvoiceCreditEntity;
	}

	private TlTransactionEntity tlTransactionEntity;

	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn ( name="translease_transaction_number", nullable=false, updatable=false, insertable=false)
	public TlTransactionEntity getTlTransactionEntity() {
		return this.tlTransactionEntity;
	}
	public void setTlTransactionEntity(TlTransactionEntity tlTransactionEntity) {
		this.tlTransactionEntity = tlTransactionEntity;
	}

	@EmbeddedId
	public TlItemLinePKEntity getId() {
		return this.id;
	}

	public void setId(TlItemLinePKEntity id) {
		this.id = id;
	}

	@Column(name="charge_code", length=1, columnDefinition="CHAR(1)")
	public String getChargeCode() {
		return this.tlItemLineBean.getChargeCode();
	}

	public void setChargeCode(String chargeCode) {
		this.tlItemLineBean.setChargeCode(chargeCode);
	}

	@Column(name="cost_type_code", nullable=false, length=1, columnDefinition="VARCHAR(1)")
	public String getCostTypeCode() {
		return this.tlItemLineBean.getCostTypeCode();
	}

	public void setCostTypeCode(String costTypeCode) {
		this.tlItemLineBean.setCostTypeCode(costTypeCode);
	}

	@Column(name="goodwill_percentage", precision=5, scale=2, columnDefinition="NUMERIC(5,2)")
	public BigDecimal getGoodwillPercentage() {
		return this.tlItemLineBean.getGoodwillPercentage();
	}

	public void setGoodwillPercentage(BigDecimal goodwillPercentage) {
		this.tlItemLineBean.setGoodwillPercentage(goodwillPercentage);
	}

	@Column(name="icme_action_code", nullable=false, length=3, columnDefinition="CHAR(3)")
	public String getIcmeActionCode() {
		return this.tlItemLineBean.getIcmeActionCode();
	}

	public void setIcmeActionCode(String icmeActionCode) {
		this.tlItemLineBean.setIcmeActionCode(icmeActionCode);
	}

	@Column(name="icme_translease_job_code", length=5, columnDefinition="CHAR(5)")
	public String getIcmeTransleaseJobCode() {
		return this.tlItemLineBean.getIcmeTransleaseJobCode();
	}

	public void setIcmeTransleaseJobCode(String icmeTransleaseJobCode) {
		this.tlItemLineBean.setIcmeTransleaseJobCode(icmeTransleaseJobCode);
	}

	@Column(name="labour_rate", columnDefinition="MONEY")
	public BigDecimal getLabourRate() {
		return this.tlItemLineBean.getLabourRate();
	}

	public void setLabourRate(BigDecimal labourRate) {
		this.tlItemLineBean.setLabourRate(labourRate);
	}

	@Column(name="labour_time", precision=7, scale=2, columnDefinition="NUMERIC(7,2)")
	public BigDecimal getLabourTime() {
		return this.tlItemLineBean.getLabourTime();
	}

	public void setLabourTime(BigDecimal labourTime) {
		this.tlItemLineBean.setLabourTime(labourTime);
	}

	@Column(name="manufacturer_repair_code", length=40, columnDefinition="VARCHAR(40)")
	public String getManufacturerRepairCode() {
		return this.tlItemLineBean.getManufacturerRepairCode();
	}

	public void setManufacturerRepairCode(String manufacturerRepairCode) {
		this.tlItemLineBean.setManufacturerRepairCode(manufacturerRepairCode);
	}

	@Column(name="manufacturer_repair_desc", length=150, columnDefinition="VARCHAR(150)")
	public String getManufacturerRepairDesc() {
		return this.tlItemLineBean.getManufacturerRepairDesc();
	}

	public void setManufacturerRepairDesc(String manufacturerRepairDesc) {
		this.tlItemLineBean.setManufacturerRepairDesc(manufacturerRepairDesc);
	}

	@Column(name="nett_labour_cost", columnDefinition="MONEY")
	public BigDecimal getNettLabourCost() {
		return this.tlItemLineBean.getNettLabourCost();
	}

	public void setNettLabourCost(BigDecimal nettLabourCost) {
		this.tlItemLineBean.setNettLabourCost(nettLabourCost);
	}

	@Column(name="number_of_parts", columnDefinition="TINYINT")
	public Integer getNumberOfParts() {
		return this.tlItemLineBean.getNumberOfParts();
	}

	public void setNumberOfParts(Integer numberOfParts) {
		this.tlItemLineBean.setNumberOfParts(numberOfParts);
	}

	@Column(nullable=false, precision=4, scale=2, columnDefinition="NUMERIC(4,2)")
	public BigDecimal getQuantity() {
		return this.tlItemLineBean.getQuantity();
	}

	public void setQuantity(BigDecimal quantity) {
		this.tlItemLineBean.setQuantity(quantity);
	}

	@Column(name="recharge_amount", precision=7, scale=2, columnDefinition="NUMERIC(7,2)")
	public BigDecimal getRechargeAmount() {
		return this.tlItemLineBean.getRechargeAmount();
	}

	public void setRechargeAmount(BigDecimal rechargeAmount) {
		this.tlItemLineBean.setRechargeAmount(rechargeAmount);
	}

	@Column(name="recharge_percentage", precision=5, scale=2, columnDefinition="NUMERIC(5,2)")
	public BigDecimal getRechargePercentage() {
		return this.tlItemLineBean.getRechargePercentage();
	}

	public void setRechargePercentage(BigDecimal rechargePercentage) {
		this.tlItemLineBean.setRechargePercentage(rechargePercentage);
	}

	@Column(name="recharge_text", length=40, columnDefinition="VARCHAR(40)")
	public String getRechargeText() {
		return this.tlItemLineBean.getRechargeText();
	}

	public void setRechargeText(String rechargeText) {
		this.tlItemLineBean.setRechargeText( rechargeText );
	}

	@Column(name="repairer_auth_text", length=75, columnDefinition="VARCHAR(75)")
	public String getRepairerAuthText() {
		return this.tlItemLineBean.getRepairerAuthText();
	}

	public void setRepairerAuthText(String repairerAuthText) {
		this.tlItemLineBean.setRepairerAuthText(repairerAuthText);
	}

	@Column(name="total_nett_line_cost", precision=7, scale=2, columnDefinition="NUMERIC(7,2)")
	public BigDecimal getTotalNettLineCost() {
		return this.tlItemLineBean.getTotalNettLineCost();
	}

	public void setTotalNettLineCost(BigDecimal totalNettLineCost) {
		this.tlItemLineBean.setTotalNettLineCost(totalNettLineCost);
	}

	@Column(name="total_nett_parts_cost", precision=7, scale=2, columnDefinition="NUMERIC(7,2)")
	public BigDecimal getTotalNettPartsCost() {
		return this.tlItemLineBean.getTotalNettPartsCost();
	}

	public void setTotalNettPartsCost(BigDecimal totalNettPartsCost) {
		this.tlItemLineBean.setTotalNettPartsCost( totalNettPartsCost );
	}

	@Column(name="vat_code", length=1, columnDefinition="CHAR(1)")
	public String getVatCode() {
		return this.tlItemLineBean.getVatCode();
	}

	public void setVatCode(String vatCode) {
		this.tlItemLineBean.setVatCode(vatCode);
	}

	@Column(name="vat_rate_labour", precision=4, scale=2, columnDefinition="NUMERIC(4,2)")
	public BigDecimal getVatRateLabour() {
		return this.tlItemLineBean.getVatRateLabour();
	}

	public void setVatRateLabour(BigDecimal vatRateLabour) {
		this.tlItemLineBean.setVatRateLabour(vatRateLabour);
	}

	@Column(name="work_reason_code", nullable=false, length=3, columnDefinition="CHAR(3)")
	public String getWorkReasonCode() {
		return this.tlItemLineBean.getWorkReasonCode();
	}

	public void setWorkReasonCode(String workReasonCode) {
		this.tlItemLineBean.setWorkReasonCode( workReasonCode );
	}
}
