package uk.co.mo.app.mercury.domain.translease.invoice.beans;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class TlVatSummaryBean implements Serializable {

	private static final long serialVersionUID = 7269692456420841493L;

    private BigDecimal vatAmount;
	private BigDecimal vatApplicableAmount;
	private String vatCode;
    private BigDecimal vatRate;

	public BigDecimal getVatAmount() {
		return this.vatAmount;
	}
	public BigDecimal getVatRate() {
		return this.vatRate;
	}
	public void setVatAmount(BigDecimal vatAmount) {
		this.vatAmount = vatAmount;
	}
	public BigDecimal getVatApplicableAmount() {
		return this.vatApplicableAmount;
	}
	public void setVatApplicableAmount(BigDecimal vatApplicableAmount) {
		this.vatApplicableAmount = vatApplicableAmount;
	}
	public String getVatCode() {
		return this.vatCode;
	}
	public void setVatCode(String vatCode) {
		this.vatCode = vatCode;
	}
	public void setVatRate(BigDecimal vatRate) {
		this.vatRate = vatRate;
	}
}
