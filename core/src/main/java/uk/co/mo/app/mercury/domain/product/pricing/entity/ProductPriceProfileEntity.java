package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;
import uk.co.mo.app.mercury.domain.agreement.entity.AgreementProductEntity;
import uk.co.mo.app.mercury.domain.product.pricing.beans.ProductPriceProfileBean;


/**
 * The persistent class for the product_price_profile database table.
 * 
 */
@Entity
@Table(name="product_price_profile")
public class ProductPriceProfileEntity extends AbstractAuditableEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private BenifitTypeEntity benifitType;
	private HireTermEntity hireTerm;
	private ProductOfferingEntity productOffering;
	private ProfileTypeEntity profileType;
    private List<AgreementProductEntity> agreementProducts;
	
    
	private ProductPriceProfileBean productPriceProfileBean = new ProductPriceProfileBean();

	@Transient
	public ProductPriceProfileBean getProductPriceProfileBean() {
		return productPriceProfileBean;
	}

	public void setProductPriceProfileBean(ProductPriceProfileBean productPriceProfileBean) {
		this.productPriceProfileBean = productPriceProfileBean;
	}

	@Id      
	@Column(name = "id",columnDefinition="Integer") 
    public Integer getId() {    
        return this.productPriceProfileBean.getId();        
    }    
    
    public void setId(Integer id) {    
        this.productPriceProfileBean.setId(id);        
    }  

	public ProductPriceProfileEntity() {
    }

	@Column(name="advance_payment",columnDefinition="smallmoney")
	public BigDecimal getAdvancedPayment() {
		return this.productPriceProfileBean.getAdvancedPayment();
	}

	public void setAdvancedPayment(BigDecimal advancedPayment) {
		this.productPriceProfileBean.setAdvancedPayment(advancedPayment);
	}

	@Column(name="basic_total_price",columnDefinition="smallmoney")    
	public BigDecimal getBasicTotalPrice() {
		return this.productPriceProfileBean.getBasicTotalPrice();
	}

	public void setBasicTotalPrice(BigDecimal basicTotalPrice) {
		this.productPriceProfileBean.setBasicTotalPrice(basicTotalPrice);
	}

	@Column(name="confirmation_date",columnDefinition="smalldatetime")
	public Date getConfirmationDate() {
		return this.productPriceProfileBean.getConfirmationDate();
	}

	public void setConfirmationDate(Date confirmationDate) {
		this.productPriceProfileBean.setConfirmationDate(confirmationDate);
	}

	@Column(name="effective_from")
	public Date getEffectiveFrom() {
		return this.productPriceProfileBean.getEffectiveFrom();
	}

	public void setEffectiveFrom(Date effectiveFrom) {
		this.productPriceProfileBean.setEffectiveFrom(effectiveFrom);
	}

	@Column(name="effective_to")
	public Date getEffectiveTo() {
		return this.productPriceProfileBean.getEffectiveTo();
	}

	public void setEffectiveTo(Date effectiveTo) {
		this.productPriceProfileBean.setEffectiveTo(effectiveTo);
	}

	@Column(name="insert_date")
	public Date getInsertDate() {
		return this.productPriceProfileBean.getInsertDate();
	}

	public void setInsertDate(Date insertDate) {
		this.productPriceProfileBean.setInsertDate(insertDate);
	}

	@Column(name="insert_user")
	public String getInsertUser() {
		return this.productPriceProfileBean.getInsertUser();
	}

	public void setInsertUser(String insertUser) {
		this.productPriceProfileBean.setInsertUser(insertUser);
	}

	@Column(name="maintenance",columnDefinition="smallmoney")
	public BigDecimal getMaintenance() {
		return this.productPriceProfileBean.getMaintenance();
	}

	public void setMaintenance(BigDecimal maintenance) {
		this.productPriceProfileBean.setMaintenance(maintenance);
	}

	@Column(name="manufacturers_discount",columnDefinition="smallmoney")
	public BigDecimal getManufacturersDiscount() {
		return this.productPriceProfileBean.getManufacturersDiscount();
	}

	public void setManufacturersDiscount(BigDecimal manufacturersDiscount) {
		this.productPriceProfileBean.setManufacturersDiscount(manufacturersDiscount);
	}

	@Column(name="miscellaneous_payment",columnDefinition="smallmoney")
	public BigDecimal getMiscellaneousPayment() {
		return this.productPriceProfileBean.getMiscellaneousPayment();
	}

	public void setMiscellaneousPayment(BigDecimal miscellaneousPayment) {
		this.productPriceProfileBean.setMiscellaneousPayment(miscellaneousPayment);
	}
	
	@Column(name="profile_code", columnDefinition="char(32)")
	public String getProfileCode() {
		return this.productPriceProfileBean.getProfileCode();
	}

	public void setProfileCode(String profileCode) {
		this.productPriceProfileBean.setProfileCode(profileCode);
	}

	@Column(name="profile_upload_date",columnDefinition="smalldateDate")
	public Date getProfileUploadDate() {
		return this.productPriceProfileBean.getProfileUploadDate();
	}

	public void setProfileUploadDate(Date profileUploadDate) {
		this.productPriceProfileBean.setProfileUploadDate(profileUploadDate);
	}

	@Column(name="residual_value",columnDefinition="smallmoney")
	public BigDecimal getResidualValue() {
		return this.productPriceProfileBean.getResidualValue();
	}

	public void setResidualValue(BigDecimal residualValue) {
		this.productPriceProfileBean.setResidualValue(residualValue);
	}

	@Column(name="subsidy",columnDefinition="smallmoney")
	public BigDecimal getSubsidy() {
		return this.productPriceProfileBean.getSubsidy();
	}

	public void setSubsidy(BigDecimal subsidy) {
		this.productPriceProfileBean.setSubsidy(subsidy);
	}

	@Column(name="sundry_payment",columnDefinition="smallmoney")
	public BigDecimal getSundryPayment() {
		return this.productPriceProfileBean.getSundryPayment();
	}

	public void setSundryPayment(BigDecimal sundryPayment) {
		this.productPriceProfileBean.setSundryPayment(sundryPayment);
	}

	@Column(name="update_date")
	public Date getUpdateDate() {
		return this.productPriceProfileBean.getUpdateDate();
	}

	public void setUpdateDate(Date updateDate) {
		this.productPriceProfileBean.setUpdateDate(updateDate);
	}

	@Column(name="update_user")
	public String getUpdateUser() {
		return this.productPriceProfileBean.getUpdateUser();
	}

	public void setUpdateUser(String updateUser) {
		this.productPriceProfileBean.setUpdateUser(updateUser);
	}

	@Column(name="vat_amount",columnDefinition="smallmoney")
	public BigDecimal getVatAmount() {
		return this.productPriceProfileBean.getVatAmount();
	}

	public void setVatAmount(BigDecimal vatAmount) {
		this.productPriceProfileBean.setVatAmount(vatAmount);
	}

	@Column(name="weekly_rental",columnDefinition="smallmoney")
	public BigDecimal getWeeklyRental() {
		return this.productPriceProfileBean.getWeeklyRental();
	}

	public void setWeeklyRental(BigDecimal weeklyRental) {
		this.productPriceProfileBean.setWeeklyRental(weeklyRental);
	}

	/**
	 * @return the discountPercentage
	 */
	@Column(name="discount_percentage",columnDefinition="smallmoney")
	public BigDecimal getDiscountPercentage() {
		return productPriceProfileBean.getDiscountPercentage();
	}

	/**
	 * @return the subsidyPercentage
	 */
	@Column(name="subsidy_percentage",columnDefinition="smallmoney")
	public BigDecimal getSubsidyPercentage() {
		return productPriceProfileBean.getSubsidyPercentage();
	}

	/**
	 * @return the subtotal
	 */

	@Column(name="subtotal",columnDefinition="smallmoney")
	public BigDecimal getSubtotal() {
		return productPriceProfileBean.getSubtotal();
	}

	/**
	 * @return the invoicePrice
	 */

	@Column(name="invoice_price",columnDefinition="smallmoney")
	public BigDecimal getInvoicePrice() {
		return productPriceProfileBean.getInvoicePrice();
	}

	/**
	 * @return the moSupport1
	 */
	@Column(name="sundry_1",columnDefinition="smallmoney")
	public BigDecimal getmoSupport1() {
		return productPriceProfileBean.getMoSupport1();
	}

	/**
	 * @return the moSupport2
	 */
	@Column(name="sundry_2",columnDefinition="smallmoney")
	public BigDecimal getMoSupport2() {
		return productPriceProfileBean.getMoSupport2();
	}

	/**
	 * @return the miscellaneousAdjustment
	 */
	@Column(name="miscellaneous_adjustment",columnDefinition="smallmoney")
	public BigDecimal getMiscellaneousAdjustment() {
		return productPriceProfileBean.getMiscellaneousAdjustment();
	}

	/**
	 * @return the netPrice
	 */
	@Column(name="net_price",columnDefinition="smallmoney")
	public BigDecimal getNetPrice() {
		return productPriceProfileBean.getNetPrice();
	}


	/**
	 * @param discountPercentage the discountPercentage to set
	 */
	public void setDiscountPercentage(BigDecimal discountPercentage) {
		this.productPriceProfileBean.setDiscountPercentage(discountPercentage);
	}

	/**
	 * @param subsidyPercentage the subsidyPercentage to set
	 */
	public void setSubsidyPercentage(BigDecimal subsidyPercentage) {
		this.productPriceProfileBean.setSubsidyPercentage(subsidyPercentage);
	}

	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(BigDecimal subtotal) {
		this.productPriceProfileBean.setSubtotal(subtotal);
	}

	/**
	 * @param invoicePrice the invoicePrice to set
	 */
	public void setInvoicePrice(BigDecimal invoicePrice) {
		this.productPriceProfileBean.setInvoicePrice(invoicePrice);
	}

	/**
	 * @param productPriceProfileBean.getMoSupport1() the moSupport1 to set
	 */
	public void setMoSupport1(BigDecimal sundry1) {
		this.productPriceProfileBean.setMoSupport1(sundry1);
	}

	/**
	 * @param productPriceProfileBean.getMoSupport2() the moSupport2 to set
	 */
	public void setMoSupport2(BigDecimal sundry2) {
		this.productPriceProfileBean.setMoSupport2(sundry2);
	}

	/**
	 * @param miscellaneousAdjustment the miscellaneousAdjustment to set
	 */
	public void setMiscellaneousAdjustment(BigDecimal miscellaneousAdjustment) {
		this.productPriceProfileBean.setMiscellaneousAdjustment(miscellaneousAdjustment);
	}

	/**
	 * @param netPrice the netPrice to set
	 */
	public void setNetPrice(BigDecimal netPrice) {
		this.productPriceProfileBean.setNetPrice(netPrice);
	}

	//bi-directional many-to-one association to BenifitType
    @ManyToOne
	@JoinColumn(name="benefit_award_type_code")
	public BenifitTypeEntity getBenifitType() {
		return this.benifitType;
	}

	public void setBenifitType(BenifitTypeEntity benifitType) {
		this.benifitType = benifitType;
	}

	//bi-directional many-to-one association to HireTerm
    @ManyToOne
	@JoinColumn(name="hire_term_code")	
	public HireTermEntity getHireTerm() {
		return this.hireTerm;
	}

	public void setHireTerm(HireTermEntity hireTerm) {
		this.hireTerm = hireTerm;
	}

	//bi-directional many-to-one association to ProductOffering
    @ManyToOne
	@JoinColumn(name="product_offering_id")
	public ProductOfferingEntity getProductOffering() {
		return this.productOffering;
	}

	public void setProductOffering(ProductOfferingEntity productOffering) {
		this.productOffering = productOffering;
	}
	
	//bi-directional many-to-one association to ProfileType
    @ManyToOne
	@JoinColumn(name="profile_type")
	public ProfileTypeEntity getProfileType() {
		return this.profileType;
	}

	public void setProfileType(ProfileTypeEntity profileType) {
		this.profileType = profileType;
	}
	
    /**
	 * @return the agreementProducts
	 */
    @OneToMany(mappedBy="priceProfile")
	public List<AgreementProductEntity> getAgreementProducts() {
		return agreementProducts;
	}

	/**
	 * @param agreementProducts the agreementProducts to set
	 */
	public void setAgreementProducts(List<AgreementProductEntity> agreementProducts) {
		this.agreementProducts = agreementProducts;
	}

}