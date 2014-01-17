package uk.co.mo.app.mercury.domain.serviceagent.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TlSpecialPartPKEntity implements Serializable {

	private static final long serialVersionUID = -2125194763675614000L;

	private int transleaseRepairerNumber;
	private String agentNumber;
	private String specialPartCode;
	private String ruleSet;

    public TlSpecialPartPKEntity() {	}

	@Column(name="translease_repairer_number", unique=true, nullable=false)
	public int getTransleaseRepairerNumber() {
		return this.transleaseRepairerNumber;
	}
	public void setTransleaseRepairerNumber(int transleaseRepairerNumber) {
		this.transleaseRepairerNumber = transleaseRepairerNumber;
	}

	@Column(name="agent_number", unique=true, nullable=false, length=5, columnDefinition = "CHAR 5 NOT NULL")
	public String getAgentNumber() {
		return this.agentNumber;
	}
	public void setAgentNumber(String agentNumber) {
		this.agentNumber = agentNumber;
	}

	@Column(name="special_part_code", unique=true, nullable=false, length=10, columnDefinition = "CHAR 10 NOT NULL")
	public String getSpecialPartCode() {
		return this.specialPartCode;
	}
	public void setSpecialPartCode(String specialPartCode) {
		this.specialPartCode = specialPartCode;
	}

	@Column(name="rule_set", unique=true, nullable=false, length=50)
	public String getRuleSet() {
		return this.ruleSet;
	}
	public void setRuleSet(String ruleSet) {
		this.ruleSet = ruleSet;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TlSpecialPartPKEntity)) {
			return false;
		}
		TlSpecialPartPKEntity castOther = (TlSpecialPartPKEntity)other;
		return 
			(this.transleaseRepairerNumber == castOther.transleaseRepairerNumber)
			&& this.agentNumber.equals(castOther.agentNumber)
			&& this.specialPartCode.equals(castOther.specialPartCode)
			&& this.ruleSet.equals(castOther.ruleSet);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.transleaseRepairerNumber;
		hash = hash * prime + this.agentNumber.hashCode();
		hash = hash * prime + this.specialPartCode.hashCode();
		hash = hash * prime + this.ruleSet.hashCode();
		
		return hash;
    }
}