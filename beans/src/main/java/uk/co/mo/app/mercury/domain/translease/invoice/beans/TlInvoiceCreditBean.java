package uk.co.mo.app.mercury.domain.translease.invoice.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class TlInvoiceCreditBean implements Serializable {

	private static final long serialVersionUID = -4746603025559856346L;

	private List <TlVatSummaryBean> tlVatSummaryBeans;
	private List <TlItemLineBean> tlItemLineBeans;
	private List <TlPartsDetailBean> tlPartsDetailBeans;

    private Integer transleaseTransactionNumber;
    private String icTransactionType;
    private String invoiceCreditNumber;
	private Date invoiceDate;
	private String leasecoAuthorisationCode;
	private String leasecoMessage;
	private String originalInvoiceNumber;
	private Integer originalTransleaseTranNo;
	private String reasonForCredit;
	private String repairerInvoiceText;
    private Date taxPointDate;
	private String termsStatus;

	public List<TlVatSummaryBean> getTlVatSummaryBeans() {
		return tlVatSummaryBeans;
	}

	public void setTlVatSummaryBeans(List<TlVatSummaryBean> tlVatSummaryBeans) {
		this.tlVatSummaryBeans = tlVatSummaryBeans;
	}

	public List<TlItemLineBean> getTlItemLineBeans() {
		return tlItemLineBeans;
	}

	public void setTlItemLineBeans(List<TlItemLineBean> tlItemLineBeans) {
		this.tlItemLineBeans = tlItemLineBeans;
	}

	public List<TlPartsDetailBean> getTlPartsDetailBeans() {
		return tlPartsDetailBeans;
	}

	public void setTlPartsDetailBeans(List<TlPartsDetailBean> tlPartsDetailBeans) {
		this.tlPartsDetailBeans = tlPartsDetailBeans;
	}
	public Integer getTransleaseTransactionNumber() {
		return this.transleaseTransactionNumber;
	}
	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.transleaseTransactionNumber = transleaseTransactionNumber;
	}
	public String getIcTransactionType() {
		return this.icTransactionType;
	}
	public void setIcTransactionType(String icTransactionType) {
		this.icTransactionType = icTransactionType;
	}
	public String getInvoiceCreditNumber() {
		return this.invoiceCreditNumber;
	}
	public void setInvoiceCreditNumber(String invoiceCreditNumber) {
		this.invoiceCreditNumber = invoiceCreditNumber;
	}
	public Date getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getLeasecoAuthorisationCode() {
		return this.leasecoAuthorisationCode;
	}

	public void setLeasecoAuthorisationCode(String leasecoAuthorisationCode) {
		this.leasecoAuthorisationCode = leasecoAuthorisationCode;
	}

	public String getLeasecoMessage() {
		return this.leasecoMessage;
	}

	public void setLeasecoMessage(String leasecoMessage) {
		this.leasecoMessage = leasecoMessage;
	}

	public String getOriginalInvoiceNumber() {
		return this.originalInvoiceNumber;
	}

	public void setOriginalInvoiceNumber(String originalInvoiceNumber) {
		this.originalInvoiceNumber = originalInvoiceNumber;
	}

	public Integer getOriginalTransleaseTranNo() {
		return this.originalTransleaseTranNo;
	}

	public void setOriginalTransleaseTranNo(Integer originalTransleaseTranNo) {
		this.originalTransleaseTranNo = originalTransleaseTranNo;
	}

	public String getReasonForCredit() {
		return this.reasonForCredit;
	}

	public void setReasonForCredit(String reasonForCredit) {
		this.reasonForCredit = reasonForCredit;
	}

	public String getRepairerInvoiceText() {
		return this.repairerInvoiceText;
	}

	public void setRepairerInvoiceText(String repairerInvoiceText) {
		this.repairerInvoiceText = repairerInvoiceText;
	}
	public Date getTaxPointDate() {
		return this.taxPointDate;
	}

	public void setTaxPointDate(Date taxPointDate) {
		this.taxPointDate = taxPointDate;
	}

	public String getTermsStatus() {
		return this.termsStatus;
	}

	public void setTermsStatus(String termsStatus) {
		this.termsStatus = termsStatus;
	}
}
