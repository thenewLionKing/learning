package uk.co.mo.app.mercury.domain.org.dealer.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the dealer_personnel_dealer_link database table.
 * 
 */
@Entity
@Table(name="dealer_personnel_dealer_link")
public class DealerPersonnelDealerLinkEntity implements Serializable {


	private static final long serialVersionUID = -754178539791762129L;
	private DealerPersonnelDealerLinkEntityPK id;
	private Boolean active;
	private DealerPersonnelEntity dealerPersonnel;

    public DealerPersonnelDealerLinkEntity() {
    }


	@EmbeddedId
	public DealerPersonnelDealerLinkEntityPK getId() {
		return this.id;
	}

	public void setId(DealerPersonnelDealerLinkEntityPK id) {
		this.id = id;
	}
	

	@Column(nullable=false)
	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	//bi-directional many-to-one association to DealerPersonnelEntity
	@ManyToOne(fetch=FetchType.LAZY , cascade = {CascadeType.ALL})
	@JoinColumn(name="dealer_personnel_id", nullable=false, insertable=false, updatable=false)
	public DealerPersonnelEntity getDealerPersonnel() {
		return this.dealerPersonnel;
	}

	public void setDealerPersonnel(DealerPersonnelEntity dealerPersonnel) {
		this.dealerPersonnel = dealerPersonnel;
	}
}
