package uk.co.mo.app.mercury.domain.product.pricing.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProductPriceProfileBean implements Serializable{
	
	private static final long serialVersionUID = 1905899794272157472L;
	
	private Integer id;
	private String profileCode;
	private BigDecimal basicTotalPrice;
	private BigDecimal weeklyRental;
	private BigDecimal advancedPayment;
	private BigDecimal residualValue;
	private BigDecimal subsidy;
	private BigDecimal manufacturersDiscount;
	private BigDecimal sundryPayment;
	private BigDecimal miscellaneousPayment;
	private BigDecimal vatAmount;
	private BigDecimal maintenance;
	private Date confirmationDate;
	private Date profileUploadDate;
	private Date effectiveFrom;
	private Date effectiveTo;
	private String insertUser;
	private Date insertDate;
	private Date updateDate;
	private String updateUser;
	private BigDecimal discountPercentage;
	private BigDecimal subsidyPercentage;
	private BigDecimal subtotal;
	private BigDecimal invoicePrice;
	private BigDecimal moSupport1;
	private BigDecimal moSupport2;
	private BigDecimal miscellaneousAdjustment;
	private BigDecimal netPrice;

	public ProductPriceProfileBean() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProfileCode() {
		return profileCode;
	}

	public void setProfileCode(String profileCode) {
		this.profileCode = profileCode;
	}

	public BigDecimal getBasicTotalPrice() {
		return basicTotalPrice;
	}

	public void setBasicTotalPrice(BigDecimal basicTotalPrice) {
		this.basicTotalPrice = basicTotalPrice;
	}

	public BigDecimal getWeeklyRental() {
		return weeklyRental;
	}

	public void setWeeklyRental(BigDecimal weeklyRental) {
		this.weeklyRental = weeklyRental;
	}

	public BigDecimal getAdvancedPayment() {
		return advancedPayment;
	}

	public void setAdvancedPayment(BigDecimal advancedPayment) {
		this.advancedPayment = advancedPayment;
	}

	public BigDecimal getResidualValue() {
		return residualValue;
	}

	public void setResidualValue(BigDecimal residualValue) {
		this.residualValue = residualValue;
	}

	public BigDecimal getSubsidy() {
		return subsidy;
	}

	public void setSubsidy(BigDecimal subsidy) {
		this.subsidy = subsidy;
	}

	public BigDecimal getManufacturersDiscount() {
		return manufacturersDiscount;
	}

	public void setManufacturersDiscount(BigDecimal manufacturersDiscount) {
		this.manufacturersDiscount = manufacturersDiscount;
	}

	public BigDecimal getSundryPayment() {
		return sundryPayment;
	}

	public void setSundryPayment(BigDecimal sundryPayment) {
		this.sundryPayment = sundryPayment;
	}

	public BigDecimal getMiscellaneousPayment() {
		return miscellaneousPayment;
	}

	public void setMiscellaneousPayment(BigDecimal miscellaneousPayment) {
		this.miscellaneousPayment = miscellaneousPayment;
	}

	public BigDecimal getVatAmount() {
		return vatAmount;
	}

	public void setVatAmount(BigDecimal vatAmount) {
		this.vatAmount = vatAmount;
	}

	public BigDecimal getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(BigDecimal maintenance) {
		this.maintenance = maintenance;
	}

	public Date getConfirmationDate() {
		return confirmationDate;
	}

	public void setConfirmationDate(Date confirmationDate) {
		this.confirmationDate = confirmationDate;
	}

	public Date getProfileUploadDate() {
		return profileUploadDate;
	}

	public void setProfileUploadDate(Date profileUploadDate) {
		this.profileUploadDate = profileUploadDate;
	}

	public Date getEffectiveFrom() {
		return effectiveFrom;
	}

	public void setEffectiveFrom(Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}

	public Date getEffectiveTo() {
		return effectiveTo;
	}

	public void setEffectiveTo(Date effectiveTo) {
		this.effectiveTo = effectiveTo;
	}

	public String getInsertUser() {
		return insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public BigDecimal getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(BigDecimal discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public BigDecimal getSubsidyPercentage() {
		return subsidyPercentage;
	}

	public void setSubsidyPercentage(BigDecimal subsidyPercentage) {
		this.subsidyPercentage = subsidyPercentage;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getInvoicePrice() {
		return invoicePrice;
	}

	public void setInvoicePrice(BigDecimal invoicePrice) {
		this.invoicePrice = invoicePrice;
	}

	public BigDecimal getMoSupport1() {
		return moSupport1;
	}

	public void setMoSupport1(BigDecimal moSupport1) {
		this.moSupport1 = moSupport1;
	}

	public BigDecimal getMoSupport2() {
		return moSupport2;
	}

	public void setMoSupport2(BigDecimal moSupport2) {
		this.moSupport2 = moSupport2;
	}

	public BigDecimal getMiscellaneousAdjustment() {
		return miscellaneousAdjustment;
	}

	public void setMiscellaneousAdjustment(BigDecimal miscellaneousAdjustment) {
		this.miscellaneousAdjustment = miscellaneousAdjustment;
	}

	public BigDecimal getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(BigDecimal netPrice) {
		this.netPrice = netPrice;
	}
}