package uk.co.mo.app.mercury.domain.translease.invoice.beans;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class TlItemLineBean implements Serializable {

	private static final long serialVersionUID = 2528499363187051545L;

	private Integer transleaseTransactionNumber;
	private String chargeCode;
    private String costTypeCode;
	private BigDecimal goodwillPercentage;
    private String icmeActionCode;
	private String icmeTransleaseJobCode;
	private BigDecimal labourRate;
	private BigDecimal labourTime;
	private String manufacturerRepairCode;
	private String manufacturerRepairDesc;
	private BigDecimal nettLabourCost;
	private Integer numberOfParts;
    private BigDecimal quantity;
	private BigDecimal rechargeAmount;
	private BigDecimal rechargePercentage;
	private String rechargeText;
	private String repairerAuthText;
	private BigDecimal totalNettLineCost;
	private BigDecimal totalNettPartsCost;
	private String vatCode;
	private BigDecimal vatRateLabour;
	private String workReasonCode;
    private Short itemNumber;

	public Integer getTransleaseTransactionNumber() {
		return transleaseTransactionNumber;
	}
	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.transleaseTransactionNumber = transleaseTransactionNumber;
	}
	public Short getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(Short itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getChargeCode() {
		return this.chargeCode;
	}
	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}
	public String getCostTypeCode() {
		return this.costTypeCode;
	}
	public void setCostTypeCode(String costTypeCode) {
		this.costTypeCode = costTypeCode;
	}
	public BigDecimal getGoodwillPercentage() {
		return this.goodwillPercentage;
	}
	public void setGoodwillPercentage(BigDecimal goodwillPercentage) {
		this.goodwillPercentage = goodwillPercentage;
	}
	public String getIcmeActionCode() {
		return this.icmeActionCode;
	}
	public void setIcmeActionCode(String icmeActionCode) {
		this.icmeActionCode = icmeActionCode;
	}
	public String getIcmeTransleaseJobCode() {
		return this.icmeTransleaseJobCode;
	}
	public void setIcmeTransleaseJobCode(String icmeTransleaseJobCode) {
		this.icmeTransleaseJobCode = icmeTransleaseJobCode;
	}
	public BigDecimal getLabourRate() {
		return this.labourRate;
	}
	public void setLabourRate(BigDecimal labourRate) {
		this.labourRate = labourRate;
	}
	public BigDecimal getLabourTime() {
		return this.labourTime;
	}
	public void setLabourTime(BigDecimal labourTime) {
		this.labourTime = labourTime;
	}
	public String getManufacturerRepairCode() {
		return this.manufacturerRepairCode;
	}
	public void setManufacturerRepairCode(String manufacturerRepairCode) {
		this.manufacturerRepairCode = manufacturerRepairCode;
	}
	public String getManufacturerRepairDesc() {
		return this.manufacturerRepairDesc;
	}
	public void setManufacturerRepairDesc(String manufacturerRepairDesc) {
		this.manufacturerRepairDesc = manufacturerRepairDesc;
	}
	public BigDecimal getNettLabourCost() {
		return this.nettLabourCost;
	}
	public void setNettLabourCost(BigDecimal nettLabourCost) {
		this.nettLabourCost = nettLabourCost;
	}
	public Integer getNumberOfParts() {
		return this.numberOfParts;
	}
	public void setNumberOfParts(Integer numberOfParts) {
		this.numberOfParts = numberOfParts;
	}
	public BigDecimal getQuantity() {
		return this.quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getRechargeAmount() {
		return this.rechargeAmount;
	}
	public void setRechargeAmount(BigDecimal rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}
	public BigDecimal getRechargePercentage() {
		return this.rechargePercentage;
	}
	public void setRechargePercentage(BigDecimal rechargePercentage) {
		this.rechargePercentage = rechargePercentage;
	}
	public String getRechargeText() {
		return this.rechargeText;
	}
	public void setRechargeText(String rechargeText) {
		this.rechargeText = rechargeText;
	}
	public String getRepairerAuthText() {
		return this.repairerAuthText;
	}
	public void setRepairerAuthText(String repairerAuthText) {
		this.repairerAuthText = repairerAuthText;
	}
	public BigDecimal getTotalNettLineCost() {
		return this.totalNettLineCost;
	}
	public void setTotalNettLineCost(BigDecimal totalNettLineCost) {
		this.totalNettLineCost = totalNettLineCost;
	}
	public BigDecimal getTotalNettPartsCost() {
		return this.totalNettPartsCost;
	}
	public void setTotalNettPartsCost(BigDecimal totalNettPartsCost) {
		this.totalNettPartsCost = totalNettPartsCost;
	}
	public String getVatCode() {
		return this.vatCode;
	}
	public void setVatCode(String vatCode) {
		this.vatCode = vatCode;
	}
	public BigDecimal getVatRateLabour() {
		return this.vatRateLabour;
	}
	public void setVatRateLabour(BigDecimal vatRateLabour) {
		this.vatRateLabour = vatRateLabour;
	}
	public String getWorkReasonCode() {
		return this.workReasonCode;
	}
	public void setWorkReasonCode(String workReasonCode) {
		this.workReasonCode = workReasonCode;
	}
}
