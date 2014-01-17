package uk.co.mo.app.mercury.domain.translease.tyre.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlNonTyreItemBean;

@javax.persistence.Table(name = "tl_non_tyre_item", schema = "dbo", catalog = "Enterprise")
@Entity
public class TlNonTyreItemEntity implements Serializable {

	private static final long serialVersionUID = -4091400240088918813L;

	private TlNonTyreItemBean tlNonTyreItemBean;

	private TlNonTyreItemPKEntity id;
	BigDecimal nettItemCost;
	BigDecimal vatRate;

	private TlTyreEntity tlTyre;
	private TlFastFitProductEntity tlFastFitProduct;

    public TlNonTyreItemEntity() {	}

	@Transient
	public TlNonTyreItemBean getTlNonTyreItemBean() {
		return tlNonTyreItemBean;
	}
	public void setTlNonTyreItemBean(TlNonTyreItemBean tlNonTyreItemBean) {
		this.tlNonTyreItemBean = tlNonTyreItemBean;
	}

	@EmbeddedId
	public TlNonTyreItemPKEntity getId() {
		return this.id;
	}
	public void setId(TlNonTyreItemPKEntity id) {
		this.id = id;
	}
	@Column(name="action_code", nullable=false, length=3, columnDefinition="CHAR(3)")
	public String getActionCode() {
		return this.tlNonTyreItemBean.getActionCode();
	}
	public void setActionCode(String actionCode) {
		this.tlNonTyreItemBean.setActionCode( actionCode );
	}
	@Column(name="item_cost", nullable=false, precision=7, scale=2, columnDefinition="NUMERIC(7,2)")
	public BigDecimal getItemCost() {
		return this.tlNonTyreItemBean.getItemCost();
	}
	public void setItemCost(BigDecimal itemCost) {
		this.tlNonTyreItemBean.setItemCost( itemCost );
	}
	@Column(name="nett_item_cost", nullable=false, precision=7, scale=2, columnDefinition="NUMERIC(7,2)")
	public BigDecimal getNettItemCost() {
		return this.nettItemCost;
	}
	public void setNettItemCost(BigDecimal nettItemCost) {
		this.nettItemCost = nettItemCost;
	}

    /*
    @Column(name="product_description", nullable=false, length=40, columnDefinition="CHAR(40)")
	public String getProductDescription() {
		return this.tlNonTyreItemBean.getProductDescription();
	}
	public void setProductDescription(String productDescription) {
		this.tlNonTyreItemBean.setProductDescription( productDescription );
	}
	*/
	@Column(name="reason_code", nullable=false, length=3, columnDefinition="VARCHAR(3)")
	public String getReasonCode() {
		return this.tlNonTyreItemBean.getReasonCode();
	}
	public void setReasonCode(String reasonCode) {
		this.tlNonTyreItemBean.setReasonCode( reasonCode );
	}
	@Column(name="vat_rate", nullable=false, precision=7, scale=2, columnDefinition="NUMERIC(7,2)")
	public BigDecimal getVatRate() {
		return this.vatRate;
	}
	public void setVatRate(BigDecimal vatRate) {
		this.vatRate = vatRate;
	}
	@Column(name="wheel_position_description", length=40, columnDefinition="VARCHAR(40)")
	public String getWheelPositionDescription() {
		return this.tlNonTyreItemBean.getWheelPositionDescription();
	}
	public void setWheelPositionDescription(String wheelPositionDescription) {
		this.tlNonTyreItemBean.setWheelPositionDescription( wheelPositionDescription );
	}

	//bi-directional many-to-one association to TlTyre
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="translease_transaction_number", referencedColumnName="translease_transaction_number", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="wheel_or_axle_position", referencedColumnName="tyre_position", nullable=false, insertable=false, updatable=false)
		})
	public TlTyreEntity getTlTyre() {
		return this.tlTyre;
	}
	public void setTlTyre(TlTyreEntity tlTyre) {
		this.tlTyre = tlTyre;
	}
	//uni-directional one-to-one association to TlFastFitProduct
	@OneToOne(fetch=FetchType.LAZY, cascade={CascadeType.ALL} )
	@JoinColumn(name="fast_fit_product_id", nullable=false)
	public TlFastFitProductEntity getTlFastFitProduct() {
		return this.tlFastFitProduct;
	}
	public void setTlFastFitProduct(TlFastFitProductEntity tlFastFitProduct) {
		this.tlFastFitProduct = tlFastFitProduct;
	}
}
