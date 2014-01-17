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

import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlVatSummaryBean;

@Entity
@Table(name="tl_vat_summary")
public class TlVatSummaryEntity implements Serializable {

	private static final long serialVersionUID = -2150927963635126025L;

	private TlVatSummaryBean tlVatSummaryBean = new TlVatSummaryBean();

	@Transient
	public TlVatSummaryBean getTlVatSummaryBean() {
		return tlVatSummaryBean;
	}
	public void setTlVatSummaryBean(TlVatSummaryBean tlVatSummaryBean) {
		this.tlVatSummaryBean = tlVatSummaryBean;
	}

	private TlInvoiceCreditEntity tlInvoiceCreditEntity;

	@ManyToOne ( fetch=FetchType.LAZY )
	@JoinColumn ( name="translease_transaction_number", nullable=false, updatable=false, insertable=false)
	public TlInvoiceCreditEntity getTlInvoiceCreditEntity() {
		return tlInvoiceCreditEntity;
	}
	public void setTlInvoiceCreditEntity(TlInvoiceCreditEntity tlInvoiceCreditEntity) {
		this.tlInvoiceCreditEntity = tlInvoiceCreditEntity;
	}

	private TlVatSummaryPKEntity id;

	@EmbeddedId
	public TlVatSummaryPKEntity getId() {
		return this.id;
	}

	public void setId(TlVatSummaryPKEntity id) {
		this.id = id;
	}

	@Column(name="vat_amount", nullable=false, precision=7, scale=2, columnDefinition="NUMERIC(7,2)")
	public BigDecimal getVatAmount() {
		return this.tlVatSummaryBean.getVatAmount();
	}

	public void setVatAmount(BigDecimal vatAmount) {
		this.tlVatSummaryBean.setVatAmount(vatAmount);
	}

	@Column(name="vat_applicable_amount", nullable=false, precision=7, scale=2, columnDefinition="NUMERIC(7,2)")
	public BigDecimal getVatApplicableAmount() {
		return this.tlVatSummaryBean.getVatApplicableAmount();
	}

	public void setVatApplicableAmount(BigDecimal vatApplicableAmount) {
		this.tlVatSummaryBean.setVatApplicableAmount(vatApplicableAmount);
	}

	@Column(name="vat_code", length=1, columnDefinition="CHAR(1)")
	public String getVatCode() {
		return this.tlVatSummaryBean.getVatCode();
	}

	public void setVatCode(String vatCode) {
		this.tlVatSummaryBean.setVatCode(vatCode);
	}
}
