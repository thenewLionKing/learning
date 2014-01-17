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

import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlTyreItemBean;

@javax.persistence.Table(name = "tl_tyre_item", schema = "dbo", catalog = "Enterprise")
@Entity
public class TlTyreItemEntity implements Serializable {

	private static final long serialVersionUID = -9072329694409681723L;

	private TlTyreItemBean tlTyreItemBean;

	private TlTyreItemPKEntity id;
	private TlTyreEntity tlTyre;
	private TlFastFitProductEntity tlFastFitProduct;
	BigDecimal nettItemCost;
	BigDecimal vatRate;

    public TlTyreItemEntity() {	}

	@Transient
	public TlTyreItemBean getTlTyreItemBean() {
		return tlTyreItemBean;
	}
	public void setTlTyreItemBean(TlTyreItemBean tlTyreItemBean) {
		this.tlTyreItemBean = tlTyreItemBean;
	}

	@EmbeddedId
	public TlTyreItemPKEntity getId() {
		return this.id;
	}
	public void setId(TlTyreItemPKEntity id) {
		this.id = id;
	}
	@Column(name="action_code", nullable=false, length=3, columnDefinition="CHAR(3)")
	public String getActionCode() {
		return this.tlTyreItemBean.getActionCode();
	}
	public void setActionCode(String actionCode) {
		this.tlTyreItemBean.setActionCode( actionCode );
	}
	@Column(name="item_cost", nullable=false, precision=7, scale=2, columnDefinition="NUMERIC(7,2)")
	public BigDecimal getItemCost() {
		return this.tlTyreItemBean.getItemCost();
	}
	public void setItemCost(BigDecimal itemCost) {
		this.tlTyreItemBean.setItemCost( itemCost );
	}
	@Column(name="nett_item_cost", nullable=false, precision=7, scale=2, columnDefinition="NUMERIC(7,2)")
	public BigDecimal getNettItemCost() {
		return this.nettItemCost;
	}
	public void setNettItemCost(BigDecimal nettItemCost) {
		this.nettItemCost = nettItemCost;
	}
	@Column(name="position_description", length=40, columnDefinition="VARCHAR(40)")
	public String getPositionDescription() {
		return this.tlTyreItemBean.getPositionDescription();
	}
	public void setPositionDescription(String positionDescription) {
		this.tlTyreItemBean.setPositionDescription( positionDescription );
	}
	@Column(name="reason_code", nullable=false, length=3, columnDefinition="VARCHAR(3)")
	public String getReasonCode() {
		return this.tlTyreItemBean.getReasonCode();
	}
	public void setReasonCode(String reasonCode) {
		this.tlTyreItemBean.setReasonCode( reasonCode );
	}
	@Column(name="vat_rate", nullable=false, precision=7, scale=2, columnDefinition="NUMERIC(7,2)")
	public BigDecimal getVatRate() {
		return this.vatRate;
	}
	public void setVatRate(BigDecimal vatRate) {
		this.vatRate = vatRate;
	}

	//bi-directional many-to-one association to TlTyre
	@ManyToOne(fetch=FetchType.LAZY, cascade={CascadeType.ALL} )
	@JoinColumns({
		@JoinColumn(name="translease_transaction_number", referencedColumnName="translease_transaction_number", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="tyre_position", referencedColumnName="tyre_position", nullable=false, insertable=false, updatable=false)
		})
	public TlTyreEntity getTlTyre() {
		return this.tlTyre;
	}
	public void setTlTyre(TlTyreEntity tlTyre) {
		this.tlTyre = tlTyre;
	}

	@OneToOne(fetch=FetchType.LAZY, cascade={CascadeType.ALL} )
	@JoinColumn(name="fast_fit_product_id", nullable=false)
	public TlFastFitProductEntity getTlFastFitProduct() {
		return this.tlFastFitProduct;
	}
	public void setTlFastFitProduct(TlFastFitProductEntity tlFastFitProduct) {
		this.tlFastFitProduct = tlFastFitProduct;
	}
}
