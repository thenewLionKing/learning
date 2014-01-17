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

import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlPartsDetailBean;
import uk.co.mo.app.mercury.domain.translease.transaction.entity.TlTransactionEntity;

@Entity
@Table(name="tl_parts_details")
public class TlPartsDetailEntity implements Serializable {

	private static final long serialVersionUID = 6436270381156170336L;

    public TlPartsDetailEntity() {	}

    private TlPartsDetailBean tlPartsDetailBean = new TlPartsDetailBean();

	@Transient
	public TlPartsDetailBean getTlPartsDetailBean() {
		return tlPartsDetailBean;
	}

	public void setTlPartsDetailBean(TlPartsDetailBean tlPartsDetailBean) {
		this.tlPartsDetailBean = tlPartsDetailBean;
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

	private TlPartsDetailPKEntity id;

	@EmbeddedId
	public TlPartsDetailPKEntity getId() {
		return this.id;
	}

	public void setId(TlPartsDetailPKEntity id) {
		this.id = id;
	}

    @Column(name="discounted_unit_price", nullable=false, columnDefinition="MONEY")
	public BigDecimal getDiscountedUnitPrice() {
		return this.tlPartsDetailBean.getDiscountedUnitPrice();
	}

	public void setDiscountedUnitPrice(BigDecimal discountedUnitPrice) {
		this.tlPartsDetailBean.setDiscountedUnitPrice(discountedUnitPrice);
	}

	@Column(name="goodwill_percentage", precision=5, scale=2, columnDefinition="NUMERIC(5,2)")
	public BigDecimal getGoodwillPercentage() {
		return this.tlPartsDetailBean.getGoodwillPercentage();
	}

	public void setGoodwillPercentage(BigDecimal goodwillPercentage) {
		this.tlPartsDetailBean.setGoodwillPercentage(goodwillPercentage);
	}

	@Column(name="manufacturer_of_part", length=3, columnDefinition="CHAR(3)")
	public String getManufacturerOfPart() {
		return this.tlPartsDetailBean.getManufacturerOfPart();
	}

	public void setManufacturerOfPart(String manufacturerOfPart) {
		this.tlPartsDetailBean.setManufacturerOfPart(manufacturerOfPart);
	}

	@Column(name="nett_parts_price", nullable=false, columnDefinition="MONEY")
	public BigDecimal getNettPartsPrice() {
		return this.tlPartsDetailBean.getNettPartsPrice();
	}

	public void setNettPartsPrice(BigDecimal nettPartsPrice) {
		this.tlPartsDetailBean.setNettPartsPrice( nettPartsPrice );
	}

	@Column(name="normal_part", nullable=false, length=1, columnDefinition="CHAR(1)")
	public String getNormalPart() {
		return this.tlPartsDetailBean.getNormalPart();
	}

	public void setNormalPart(String normalPart) {
		this.tlPartsDetailBean.setNormalPart( normalPart );
	}

	@Column(name="parts_code", length=24, columnDefinition="VARCHAR(24)")
	public String getPartsCode() {
		return this.tlPartsDetailBean.getPartsCode();
	}

	public void setPartsCode(String partsCode) {
		this.tlPartsDetailBean.setPartsCode( partsCode );
	}

	@Column(name="parts_description", nullable=false, length=30, columnDefinition="VARCHAR(30)")
	public String getPartsDescription() {
		return this.tlPartsDetailBean.getPartsDescription();
	}

	public void setPartsDescription(String partsDescription) {
		this.tlPartsDetailBean.setPartsDescription( partsDescription );
	}

	@Column(name="parts_discount_rate", nullable=false, precision=4, scale=2, columnDefinition="NUMERIC(4,2)")
	public BigDecimal getPartsDiscountRate() {
		return this.tlPartsDetailBean.getPartsDiscountRate();
	}

	public void setPartsDiscountRate(BigDecimal partsDiscountRate) {
		this.tlPartsDetailBean.setPartsDiscountRate( partsDiscountRate );
	}

	@Column(nullable=false, precision=4, scale=2, columnDefinition="NUMERIC(4,2)")
	public BigDecimal getQuantity() {
		return this.tlPartsDetailBean.getQuantity();
	}

	public void setQuantity(BigDecimal quantity) {
		this.tlPartsDetailBean.setQuantity( quantity );
	}

	@Column(name="unit_price", nullable=false, columnDefinition="MONEY")
	public BigDecimal getUnitPrice() {
		return this.tlPartsDetailBean.getUnitPrice();
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.tlPartsDetailBean.setUnitPrice( unitPrice );
	}

	@Column(name="vat_code", length=1, columnDefinition="CHAR(1)")
	public String getVatCode() {
		return this.tlPartsDetailBean.getVatCode();
	}

	public void setVatCode(String vatCode) {
		this.tlPartsDetailBean.setVatCode(vatCode);
	}

	@Column(name="vat_rate", precision=4, scale=2, columnDefinition="NUMERIC(4,2)")
	public BigDecimal getVatRate() {
		return this.tlPartsDetailBean.getVatRate();
	}

	public void setVatRate(BigDecimal vatRate) {
		this.tlPartsDetailBean.setVatRate(vatRate);
	}
}
