package uk.co.mo.app.mercury.domain.translease.invoice.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
/**
 * The primary key class for the tl_vat_summary database table.
 */
public class TlVatSummaryPKEntity implements Serializable {

	private static final long serialVersionUID = 5171966996973839572L;

	private Integer transleaseTransactionNumber;

	private BigDecimal vatRate;

    public TlVatSummaryPKEntity() {	}

	@Column(name="translease_transaction_number", unique=true, nullable=false, columnDefinition="INT")
	public Integer getTransleaseTransactionNumber() {
		return this.transleaseTransactionNumber;
	}
	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.transleaseTransactionNumber = transleaseTransactionNumber;
	}

	@Column(name="vat_rate", unique=true, nullable=false, precision=5, scale=2, columnDefinition="NUMERIC(5,2)")
	public BigDecimal getVatRate() {
		return this.vatRate;
	}
	public void setVatRate(BigDecimal vatRate) {
		this.vatRate = vatRate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TlVatSummaryPKEntity)) {
			return false;
		}
		TlVatSummaryPKEntity castOther = (TlVatSummaryPKEntity)other;
		return 
			(this.transleaseTransactionNumber == castOther.transleaseTransactionNumber)
			&& (this.vatRate == castOther.vatRate);

    }

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.transleaseTransactionNumber;
		hash = hash * prime + ((int) (this.vatRate.intValue() * 32));

		return hash;
    }
}
