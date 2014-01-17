package uk.co.mo.app.mercury.domain.agreement.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.io.Serializable;

/**
 * The primary key class for the agreement_dealer entitybase table.
 * 
 */
@Embeddable
public class AgreementDealerEntityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private AgreementEntity agreement;
	private Integer dealerTypeId;

    public AgreementDealerEntityPK() {
    }
	
	@ManyToOne
	@JoinColumn(name="agreement_id")
    public AgreementEntity getAgreement() {
		return this.agreement;
	}
	public void setAgreement(AgreementEntity agreement) {
		this.agreement = agreement;
	}
	
	@Column(name="dealer_type_id")
	public Integer getDealerTypeId() {
		return this.dealerTypeId;
	}
	public void setDealerTypeId(Integer dealerTypeId) {
		this.dealerTypeId = dealerTypeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AgreementDealerEntityPK)) {
			return false;
		}
		AgreementDealerEntityPK castOther = (AgreementDealerEntityPK)other;
		return 
			(this.agreement == castOther.agreement)
			&& (this.dealerTypeId == castOther.dealerTypeId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.agreement.getAgreementId();
		hash = hash * prime + this.dealerTypeId;
		
		return hash;
    }
}