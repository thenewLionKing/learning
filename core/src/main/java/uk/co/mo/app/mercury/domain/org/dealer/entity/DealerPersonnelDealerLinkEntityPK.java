package uk.co.mo.app.mercury.domain.org.dealer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the dealer_personnel_dealer_link database table.
 * 
 */
@Embeddable
public class DealerPersonnelDealerLinkEntityPK implements Serializable {
	//default serial version id, required for serializable classes.

	private static final long serialVersionUID = 425103494026873872L;
	private Integer dealerPersonnelId;
	private String agentNumber;

    public DealerPersonnelDealerLinkEntityPK() {
    }

	@Column(name="dealer_personnel_id", unique=true, nullable=false)
	public Integer getDealerPersonnelId() {
		return this.dealerPersonnelId;
	}
	public void setDealerPersonnelId(Integer dealerPersonnelId) {
		this.dealerPersonnelId = dealerPersonnelId;
	}

	@Column(name="agent_number", columnDefinition="CHAR", unique=true, nullable=false, length=5)
	public String getAgentNumber() {
		return this.agentNumber;
	}
	public void setAgentNumber(String agentNumber) {
		this.agentNumber = agentNumber;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DealerPersonnelDealerLinkEntityPK)) {
			return false;
		}
		DealerPersonnelDealerLinkEntityPK castOther = (DealerPersonnelDealerLinkEntityPK)other;
		return 
			(this.dealerPersonnelId == castOther.dealerPersonnelId)
			&& this.agentNumber.equals(castOther.agentNumber);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dealerPersonnelId;
		hash = hash * prime + this.agentNumber.hashCode();
		
		return hash;
    }
}