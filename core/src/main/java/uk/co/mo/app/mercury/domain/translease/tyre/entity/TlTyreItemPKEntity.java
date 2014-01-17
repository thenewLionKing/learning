package uk.co.mo.app.mercury.domain.translease.tyre.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TlTyreItemPKEntity implements Serializable {

	private static final long serialVersionUID = -777813516282240739L;

	private Integer transleaseTransactionNumber;
	private Short itemNumber;
	private String tyrePosition;

    public TlTyreItemPKEntity() {
    }

    @Column(name="translease_transaction_number", unique=true, nullable=false, columnDefinition="INT")
	public int getTransleaseTransactionNumber() {
		return this.transleaseTransactionNumber;
	}
	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.transleaseTransactionNumber = transleaseTransactionNumber;
	}
	@Column(name="item_number", unique=true, nullable=false, columnDefinition="TINYINT")
	public short getItemNumber() {
		return this.itemNumber;
	}
	public void setItemNumber(Short itemNumber) {
		this.itemNumber = itemNumber;
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
		if (!(other instanceof TlTyreItemPKEntity)) {
			return false;
		}
		TlTyreItemPKEntity castOther = (TlTyreItemPKEntity)other;
		return 
			(this.transleaseTransactionNumber == castOther.transleaseTransactionNumber)
			&& (this.itemNumber == castOther.itemNumber)
			&& this.tyrePosition.equals(castOther.tyrePosition);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.transleaseTransactionNumber;
		hash = hash * prime + ((int) this.itemNumber);
		hash = hash * prime + this.tyrePosition.hashCode();
		
		return hash;
    }
}