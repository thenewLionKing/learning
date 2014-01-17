package uk.co.mo.app.mercury.domain.org.dealer.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerPersonnelBean;


/**
 * The persistent class for the dealer_personnel database table.
 * 
 */
@Entity
@Table(name="dealer_personnel")
public class DealerPersonnelEntity implements Serializable {

	private static final long serialVersionUID = -3470002150599331565L;
	private DealerPersonnelBean dealerPersonnelBean = new DealerPersonnelBean();
	private List<DealerPersonnelDealerLinkEntity> dealerPersonnelDealerLinks;
	private List<DealerPersonnelTrainingEntity> dealerPersonnelTrainings;

    public DealerPersonnelEntity() {
    }

    @Transient
    public DealerPersonnelBean getDealerPersonnelBean(){
    	return this.dealerPersonnelBean;
    }
    public void setDealerPersonnelBean(DealerPersonnelBean bean){
    	this.dealerPersonnelBean = bean;
    }

	@Id
	@Column(name="dealer_personnel_id", unique=true, nullable=false)
	public Integer getDealerPersonnelId() {
		return this.dealerPersonnelBean.getDealerPersonnelId();
	}

	public void setDealerPersonnelId(Integer dealerPersonnelId) {
		this.dealerPersonnelBean.setDealerPersonnelId(dealerPersonnelId);
	}


	@Column(nullable=false)
	public Boolean getActive() {
		return this.dealerPersonnelBean.isActive();
	}

	public void setActive(Boolean active) {
		this.dealerPersonnelBean.setActive(active);
	}


	@Column(name="first_name", nullable=false, length=100)
	public String getFirstName() {
		return this.dealerPersonnelBean.getFirstName();
	}

	public void setFirstName(String firstName) {
		this.dealerPersonnelBean.setFirstName(firstName);
	}


	@Column(name="last_name", nullable=false, length=100)
	public String getLastName() {
		return this.dealerPersonnelBean.getLastName();
	}

	public void setLastName(String lastName) {
		this.dealerPersonnelBean.setLastName(lastName);
	}


	//bi-directional many-to-one association to DealerPersonnelDealerLinkEntity
	@OneToMany(mappedBy="dealerPersonnel", cascade = {CascadeType.ALL})
	public List<DealerPersonnelDealerLinkEntity> getDealerPersonnelDealerLinks() {
		return this.dealerPersonnelDealerLinks;
	}

	public void setDealerPersonnelDealerLinks(List<DealerPersonnelDealerLinkEntity> dealerPersonnelDealerLinks) {
		this.dealerPersonnelDealerLinks = dealerPersonnelDealerLinks;
	}
	

	//bi-directional many-to-one association to DealerPersonnelTrainingEntity
	@OneToMany(mappedBy="dealerPersonnel" ,orphanRemoval=true, cascade = {CascadeType.ALL})
	public List<DealerPersonnelTrainingEntity> getDealerPersonnelTrainings() {
		return this.dealerPersonnelTrainings;
	}

	public void setDealerPersonnelTrainings(List<DealerPersonnelTrainingEntity> dealerPersonnelTrainings) {
		this.dealerPersonnelTrainings = dealerPersonnelTrainings;
	}
	
}