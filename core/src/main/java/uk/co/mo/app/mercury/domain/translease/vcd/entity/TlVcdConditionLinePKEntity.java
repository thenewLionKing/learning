package uk.co.mo.app.mercury.domain.translease.vcd.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TlVcdConditionLinePKEntity implements Serializable {

	private static final long serialVersionUID = -6953577811787826624L;

	private Integer transleaseTransactionNumber;
	private String attributeCode;

    public TlVcdConditionLinePKEntity() {	}

	@Column(name="translease_transaction_number", unique=true, nullable=false, columnDefinition="INT")
	public Integer getTransleaseTransactionNumber() {
		return this.transleaseTransactionNumber;
	}
	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.transleaseTransactionNumber = transleaseTransactionNumber;
	}

	@Column(name="attribute_code", unique=true, nullable=false, length=2, columnDefinition="VARCHAR(2)")
	public String getAttributeCode() {
		return this.attributeCode;
	}
	public void setAttributeCode(String attributeCode) {
		this.attributeCode = attributeCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TlVcdConditionLinePKEntity)) {
			return false;
		}
		TlVcdConditionLinePKEntity castOther = (TlVcdConditionLinePKEntity)other;
		return 
			(this.transleaseTransactionNumber == castOther.transleaseTransactionNumber)
			&& this.attributeCode.equals(castOther.attributeCode);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.transleaseTransactionNumber;
		hash = hash * prime + this.attributeCode.hashCode();
		
		return hash;
    }
}
