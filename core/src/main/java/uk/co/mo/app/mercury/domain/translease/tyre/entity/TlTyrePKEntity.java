package uk.co.mo.app.mercury.domain.translease.tyre.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TlTyrePKEntity implements Serializable {

	private static final long serialVersionUID = 1428769866942856638L;

	private Integer transleaseTransactionNumber;
	private String tyrePosition;

    public TlTyrePKEntity() {	}

	@Column(name="translease_transaction_number", unique=true, nullable=false, columnDefinition="INT")
	public Integer getTransleaseTransactionNumber() {
		return this.transleaseTransactionNumber;
	}
	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.transleaseTransactionNumber = transleaseTransactionNumber;
	}
	@Column(name="tyre_position", unique=true, nullable=false, length=4, columnDefinition="CHAR(4)")
	public String getTyrePosition() {
		return this.tyrePosition;
	}
	public void setTyrePosition(String tyrePosition) {
		this.tyrePosition = tyrePosition;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TlTyrePKEntity)) {
			return false;
		}
		TlTyrePKEntity castOther = (TlTyrePKEntity)other;
		return 
			(this.transleaseTransactionNumber == castOther.transleaseTransactionNumber)
			&& this.tyrePosition.equals(castOther.tyrePosition);

    }

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.transleaseTransactionNumber;
		hash = hash * prime + this.tyrePosition.hashCode();
		
		return hash;
    }
}
