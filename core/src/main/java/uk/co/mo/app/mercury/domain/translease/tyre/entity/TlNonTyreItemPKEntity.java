package uk.co.mo.app.mercury.domain.translease.tyre.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TlNonTyreItemPKEntity implements Serializable {

	private static final long serialVersionUID = -9095379461056148679L;

	private int transleaseTransactionNumber;
	private short itemNumber;
	private String wheelOrAxlePosition;
    private String productDescription;

    public TlNonTyreItemPKEntity() {	}

	@Column(name="translease_transaction_number", unique=true, nullable=false, columnDefinition="INT")
	public int getTransleaseTransactionNumber() {
		return this.transleaseTransactionNumber;
	}
	public void setTransleaseTransactionNumber(int transleaseTransactionNumber) {
		this.transleaseTransactionNumber = transleaseTransactionNumber;
	}

	@Column(name="item_number", unique=true, nullable=false, columnDefinition="TINYINT")
	public short getItemNumber() {
		return this.itemNumber;
	}
	public void setItemNumber(short itemNumber) {
		this.itemNumber = itemNumber;
	}

	@Column(name="wheel_or_axle_position", unique=true, nullable=false, length=4, columnDefinition="CHAR(4)")
	public String getWheelOrAxlePosition() {
		return this.wheelOrAxlePosition;
	}
	public void setWheelOrAxlePosition(String wheelOrAxlePosition) {
		this.wheelOrAxlePosition = wheelOrAxlePosition;
	}

    @Column(name="product_description", unique=true, nullable=false, length=40, columnDefinition="CHAR(40)")
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TlNonTyreItemPKEntity)) {
			return false;
		}
		TlNonTyreItemPKEntity castOther = (TlNonTyreItemPKEntity)other;
		return 
			(this.transleaseTransactionNumber == castOther.transleaseTransactionNumber)
			&& (this.itemNumber == castOther.itemNumber)
			&& this.wheelOrAxlePosition.equals(castOther.wheelOrAxlePosition);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.transleaseTransactionNumber;
		hash = hash * prime + ((int) this.itemNumber);
		hash = hash * prime + this.wheelOrAxlePosition.hashCode();
		
		return hash;
    }
}