package uk.co.mo.app.mercury.domain.translease.invoice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TlItemLinePKEntity implements Serializable {

	private static final long serialVersionUID = 7415687766864482499L;

	private Integer transleaseTransactionNumber;

	private Short itemNumber;

    public TlItemLinePKEntity() {
    }

	@Column(name="translease_transaction_number", unique=true, nullable=false)
    public Integer getTransleaseTransactionNumber() {
		return this.transleaseTransactionNumber;
	}
	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.transleaseTransactionNumber = transleaseTransactionNumber;
	}

	@Column(name="item_number", unique=true, nullable=false, columnDefinition="TINYINT")
	public Short getItemNumber() {
		return this.itemNumber;
	}
	public void setItemNumber(Short itemNumber) {
		this.itemNumber = itemNumber;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TlItemLinePKEntity)) {
			return false;
		}
		TlItemLinePKEntity castOther = (TlItemLinePKEntity)other;
		return 
			(this.transleaseTransactionNumber == castOther.transleaseTransactionNumber)
			&& (this.itemNumber == castOther.itemNumber);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.transleaseTransactionNumber;
		hash = hash * prime + ((int) this.itemNumber);
		
		return hash;
    }
}
