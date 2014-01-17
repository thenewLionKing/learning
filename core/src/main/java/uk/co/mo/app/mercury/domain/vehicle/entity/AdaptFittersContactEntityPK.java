package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the adapt_fitters_contacts database table.
 * 
 */
@Embeddable
public class AdaptFittersContactEntityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private int contactId;
	private int fitterId;

    public AdaptFittersContactEntityPK() {
    }

	@Column(name="contact_id", unique=true, nullable=false)
	public int getContactId() {
		return this.contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	@Column(name="fitter_id", unique=true, nullable=false)
	public int getFitterId() {
		return this.fitterId;
	}
	public void setFitterId(int fitterId) {
		this.fitterId = fitterId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdaptFittersContactEntityPK)) {
			return false;
		}
		AdaptFittersContactEntityPK castOther = (AdaptFittersContactEntityPK)other;
		return 
			(this.contactId == castOther.contactId)
			&& (this.fitterId == castOther.fitterId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.contactId;
		hash = hash * prime + this.fitterId;
		
		return hash;
    }
}