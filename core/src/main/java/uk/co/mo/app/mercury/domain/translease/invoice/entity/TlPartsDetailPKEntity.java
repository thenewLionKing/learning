package uk.co.mo.app.mercury.domain.translease.invoice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TlPartsDetailPKEntity implements Serializable {

	private static final long serialVersionUID = -4916579331814192765L;

	private Integer transleaseTransactionNumber;

	private Integer itemNumber;

	private Integer partsNumber;

    public TlPartsDetailPKEntity() {
    }

    @Column(name="translease_transaction_number", unique=true, nullable=false, columnDefinition="INT")
	public Integer getTransleaseTransactionNumber() {
		return this.transleaseTransactionNumber;
	}
	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.transleaseTransactionNumber = transleaseTransactionNumber;
	}

	@Column(name="item_number", unique=true, nullable=false, columnDefinition="TINYINT")
	public Integer getItemNumber() {
		return this.itemNumber;
	}
	public void setItemNumber(Integer itemNumber) {
		this.itemNumber = itemNumber;
	}

	@Column(name="parts_number", unique=true, nullable=false, columnDefinition="TINYINT")
	public Integer getPartsNumber() {
		return this.partsNumber;
	}
	public void setPartsNumber(Integer partsNumber) {
		this.partsNumber = partsNumber;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TlPartsDetailPKEntity)) {
			return false;
		}
		TlPartsDetailPKEntity castOther = (TlPartsDetailPKEntity)other;
		return 
			(this.transleaseTransactionNumber == castOther.transleaseTransactionNumber)
			&& (this.itemNumber == castOther.itemNumber)
			&& (this.partsNumber == castOther.partsNumber);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.transleaseTransactionNumber;
		hash = hash * prime + ((int) this.itemNumber);
		hash = hash * prime + ((int) this.partsNumber);
		
		return hash;
    }
}