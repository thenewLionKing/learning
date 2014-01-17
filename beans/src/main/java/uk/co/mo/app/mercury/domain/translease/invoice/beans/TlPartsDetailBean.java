package uk.co.mo.app.mercury.domain.translease.invoice.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class TlPartsDetailBean implements Serializable {

	private static final long serialVersionUID = 9079891928003034290L;

    private Integer itemNumber;
    private Integer partsNumber;
	private BigDecimal discountedUnitPrice;
	private BigDecimal goodwillPercentage;
	private String manufacturerOfPart;
	private BigDecimal nettPartsPrice;
	private String normalPart;
	private String partsCode;
	private String partsDescription;
	private BigDecimal partsDiscountRate;
	private BigDecimal quantity;
	private BigDecimal unitPrice;
	private String vatCode;
	private BigDecimal vatRate;

    public TlPartsDetailBean() {	}

	public BigDecimal getDiscountedUnitPrice() {
		return this.discountedUnitPrice;
	}

	public void setDiscountedUnitPrice(BigDecimal discountedUnitPrice) {
		this.discountedUnitPrice = discountedUnitPrice;
	}
	public BigDecimal getGoodwillPercentage() {
		return this.goodwillPercentage;
	}
	public void setGoodwillPercentage(BigDecimal goodwillPercentage) {
		this.goodwillPercentage = goodwillPercentage;
	}
	public String getManufacturerOfPart() {
		return this.manufacturerOfPart;
	}
	public void setManufacturerOfPart(String manufacturerOfPart) {
		this.manufacturerOfPart = manufacturerOfPart;
	}
	public BigDecimal getNettPartsPrice() {
		return this.nettPartsPrice;
	}
	public void setNettPartsPrice(BigDecimal nettPartsPrice) {
		this.nettPartsPrice = nettPartsPrice;
	}
	public String getNormalPart() {
		return this.normalPart;
	}
	public void setNormalPart(String normalPart) {
		this.normalPart = normalPart;
	}
	public String getPartsCode() {
		return this.partsCode;
	}
	public void setPartsCode(String partsCode) {
		this.partsCode = partsCode;
	}
	public String getPartsDescription() {
		return this.partsDescription;
	}
	public void setPartsDescription(String partsDescription) {
		this.partsDescription = partsDescription;
	}
	public BigDecimal getPartsDiscountRate() {
		return this.partsDiscountRate;
	}
	public void setPartsDiscountRate(BigDecimal partsDiscountRate) {
		this.partsDiscountRate = partsDiscountRate;
	}
	public BigDecimal getQuantity() {
		return this.quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getVatCode() {
		return this.vatCode;
	}
	public void setVatCode(String vatCode) {
		this.vatCode = vatCode;
	}
	public BigDecimal getVatRate() {
		return this.vatRate;
	}
	public void setVatRate(BigDecimal vatRate) {
		this.vatRate = vatRate;
	}
	public Integer getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(Integer itemNumber) {
		this.itemNumber = itemNumber;
	}
	public Integer getPartsNumber() {
		return partsNumber;
	}
	public void setPartsNumber(Integer partsNumber) {
		this.partsNumber = partsNumber;
	}
}
