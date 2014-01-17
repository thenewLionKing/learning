package uk.co.mo.app.mercury.domain.translease.invoice.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.translease.invoice.beans.TlInvoiceCreditBean;

@Entity
@Table(name="tl_invoice_credit")
public class TlInvoiceCreditEntity implements Serializable {

	private static final long serialVersionUID = -3748084602422551310L;

	private TlInvoiceCreditBean tlInvoiceCreditBean = new TlInvoiceCreditBean();

	@Transient
	public TlInvoiceCreditBean getTlInvoiceCreditBean() {
		return tlInvoiceCreditBean;
	}
	public void setTlInvoiceCreditBean(TlInvoiceCreditBean tlInvoiceCreditBean) {
		this.tlInvoiceCreditBean = tlInvoiceCreditBean;
	}

	private List <TlItemLineEntity> tlItemLineEntity;
	private List <TlPartsDetailEntity> tlPartsDetailEntity;
	private List <TlVatSummaryEntity> tlVatSummaryEntity;

	@OneToMany (mappedBy="tlInvoiceCreditEntity", cascade={CascadeType.ALL} )
	public List<TlItemLineEntity> getTlItemLineEntity() {
		return tlItemLineEntity;
	}
	public void setTlItemLineEntity(List<TlItemLineEntity> tlItemLineEntity) {
		this.tlItemLineEntity = tlItemLineEntity;
	}
	@OneToMany (mappedBy="tlInvoiceCreditEntity", cascade={CascadeType.ALL} )
	public List<TlPartsDetailEntity> getTlPartsDetailEntity() {
		return tlPartsDetailEntity;
	}
	public void setTlPartsDetailEntity(List<TlPartsDetailEntity> tlPartsDetailEntity) {
		this.tlPartsDetailEntity = tlPartsDetailEntity;
	}
	@OneToMany (mappedBy="tlInvoiceCreditEntity", cascade={CascadeType.ALL} )
	public List<TlVatSummaryEntity> getTlVatSummaryEntity() {
		return tlVatSummaryEntity;
	}
	public void setTlVatSummaryEntity(List<TlVatSummaryEntity> tlVatSummaryEntity) {
		this.tlVatSummaryEntity = tlVatSummaryEntity;
	}

	@Id
	@Column(name="translease_transaction_number", unique=true, nullable=false, columnDefinition="INT")
	public Integer getTransleaseTransactionNumber() {
		return this.tlInvoiceCreditBean.getTransleaseTransactionNumber();
	}

	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.tlInvoiceCreditBean.setTransleaseTransactionNumber(transleaseTransactionNumber);
	}

	@Column(name="ic_transaction_type", nullable=false, length=2, columnDefinition="CHAR(2)")
	public String getIcTransactionType() {
		return this.tlInvoiceCreditBean.getIcTransactionType();
	}

	public void setIcTransactionType(String icTransactionType) {
		this.tlInvoiceCreditBean.setIcTransactionType(icTransactionType);
	}

	@Column(name="invoice_credit_number", nullable=false, length=10, columnDefinition="CHAR(10)")
	public String getInvoiceCreditNumber() {
		return this.tlInvoiceCreditBean.getInvoiceCreditNumber();
	}

	public void setInvoiceCreditNumber(String invoiceCreditNumber) {
		this.tlInvoiceCreditBean.setInvoiceCreditNumber(invoiceCreditNumber);
	}

	@Column(name="invoice_date", columnDefinition="SMALLDATETIME")
	public Date getInvoiceDate() {
		return this.tlInvoiceCreditBean.getInvoiceDate();
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.tlInvoiceCreditBean.setInvoiceDate(invoiceDate);
	}

	@Column(name="leaseco_authorisation_code", length=10, columnDefinition="CHAR(10)")
	public String getLeasecoAuthorisationCode() {
		return this.tlInvoiceCreditBean.getLeasecoAuthorisationCode();
	}

	public void setLeasecoAuthorisationCode(String leasecoAuthorisationCode) {
		this.tlInvoiceCreditBean.setLeasecoAuthorisationCode(leasecoAuthorisationCode);
	}

	@Column(name="leaseco_message", length=80, columnDefinition="CHAR(80)")
	public String getLeasecoMessage() {
		return this.tlInvoiceCreditBean.getLeasecoMessage();
	}

	public void setLeasecoMessage(String leasecoMessage) {
		this.tlInvoiceCreditBean.setLeasecoMessage(leasecoMessage);
	}

	@Column(name="original_invoice_number", length=10, columnDefinition="CHAR(10)")
	public String getOriginalInvoiceNumber() {
		return this.tlInvoiceCreditBean.getOriginalInvoiceNumber();
	}

	public void setOriginalInvoiceNumber(String originalInvoiceNumber) {
		this.tlInvoiceCreditBean.setOriginalInvoiceNumber(originalInvoiceNumber);
	}

	@Column(name="original_translease_tran_no", columnDefinition="INT")
	public Integer getOriginalTransleaseTranNo() {
		return this.tlInvoiceCreditBean.getOriginalTransleaseTranNo();
	}

	public void setOriginalTransleaseTranNo(Integer originalTransleaseTranNo) {
		this.tlInvoiceCreditBean.setOriginalTransleaseTranNo(originalTransleaseTranNo);
	}

	@Column(name="reason_for_credit", length=30, columnDefinition="CHAR(30)")
	public String getReasonForCredit() {
		return this.tlInvoiceCreditBean.getReasonForCredit();
	}

	public void setReasonForCredit(String reasonForCredit) {
		this.tlInvoiceCreditBean.setReasonForCredit(reasonForCredit);
	}

	@Column(name="repairer_invoice_text", length=16, columnDefinition="CHAR(16)")
	public String getRepairerInvoiceText() {
		return this.tlInvoiceCreditBean.getRepairerInvoiceText();
	}

	public void setRepairerInvoiceText(String repairerInvoiceText) {
		this.tlInvoiceCreditBean.setRepairerInvoiceText(repairerInvoiceText);
	}

	@Column(name="tax_point_date", nullable=false, columnDefinition="SMALLDATETIME")
	public Date getTaxPointDate() {
		return this.tlInvoiceCreditBean.getTaxPointDate();
	}

	public void setTaxPointDate(Date taxPointDate) {
		this.tlInvoiceCreditBean.setTaxPointDate(taxPointDate);
	}

	@Column(name="terms_status", length=1, columnDefinition="CHAR(1)")
	public String getTermsStatus() {
		return this.tlInvoiceCreditBean.getTermsStatus();
	}

	public void setTermsStatus(String termsStatus) {
		this.tlInvoiceCreditBean.setTermsStatus(termsStatus);
	}
}
