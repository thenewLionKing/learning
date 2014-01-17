package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.AgreementAdaptationBean;


/**
 * The persistent class for the agreement_adaptations database table.
 * 
 */
@Entity
@Table(name="agreement_adaptations")
public class AgreementAdaptationEntity implements Serializable {

	private static final long serialVersionUID = -2464652937975716784L;
	private AgreementAdaptationBean agreementAdaptationBean = new AgreementAdaptationBean();
	private AdaptFitterEntity adaptFitterEntity;
	private AdaptAdaptationEntity adaptAdaptationEntity;

	public AgreementAdaptationEntity() {
    }
	
	@Transient
	public AgreementAdaptationBean getAgreementAdaptationBean() {
		return this.agreementAdaptationBean;
	}

	public void setAgreementAdaptationBean(AgreementAdaptationBean agreementAdaptationBean) {
		this.agreementAdaptationBean = agreementAdaptationBean;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="agreement_adaptation_id", unique=true, nullable=false)
	public Integer getAgreementAdaptationId() {
		return this.agreementAdaptationBean.getAgreementAdaptationId();
	}

	public void setAgreementAdaptationId(Integer agreementAdaptationId) {
		this.agreementAdaptationBean.setAgreementAdaptationId(agreementAdaptationId);
	}


	@Column(name="adaptation_id")
	public Integer getAdaptationId() {
		return this.agreementAdaptationBean.getAdaptationId();
	}

	public void setAdaptationId(Integer adaptationId) {
		this.agreementAdaptationBean.setAdaptationId(adaptationId);
	}

	@Column(name="added_date")
	public Date getAddedDate() {
		return this.agreementAdaptationBean.getAddedDate();
	}

	public void setAddedDate(Date addedDate) {
		this.agreementAdaptationBean.setAddedDate(addedDate);
	}

	@Column(name="agreement_id",insertable=false, updatable=false)
	public Integer getAgreementId() {
		return this.agreementAdaptationBean.getAgreementId();
	}

	public void setAgreementId(Integer agreementId) {
		this.agreementAdaptationBean.setAgreementId(agreementId);
	}


	@Column(name="cust_price", columnDefinition="MONEY")
	public BigDecimal getCustPrice() {
		return this.agreementAdaptationBean.getCustPrice();
	}

	public void setCustPrice(BigDecimal custPrice) {
		this.agreementAdaptationBean.setCustPrice(custPrice);
	}


	@Column(name="cust_vat", columnDefinition="MONEY")
	public BigDecimal getCustVat() {
		return this.agreementAdaptationBean.getCustVat();
	}

	public void setCustVat(BigDecimal custVat) {
		this.agreementAdaptationBean.setCustVat(custVat);
	}

	@Column(name="deleted_date")
	public Date getDeletedDate() {
		return this.agreementAdaptationBean.getDeletedDate();
	}

	public void setDeletedDate(Date deletedDate) {
		this.agreementAdaptationBean.setDeletedDate(deletedDate);
	}


	@Column(name="deleted_ind")
	public Boolean getDeletedInd() {
		return this.agreementAdaptationBean.getDeletedInd();
	}

	public void setDeletedInd(Boolean deletedInd) {
		this.agreementAdaptationBean.setDeletedInd(deletedInd);
	}


	@Column(name="demonstration_required")
	public Boolean getDemonstrationRequired() {
		return this.agreementAdaptationBean.getDemonstrationRequired();
	}

	public void setDemonstrationRequired(Boolean demonstrationRequired) {
		this.agreementAdaptationBean.setDemonstrationRequired(demonstrationRequired);
	}
	
	@Column(name="fitter_id")
	public Integer getFitterId() {
		return this.agreementAdaptationBean.getFitterId();
	}

	public void setFitterId(Integer fitterId) {
		this.agreementAdaptationBean.setFitterId(fitterId);
	}


	@Column(name="group_id")
	public Integer getGroupId() {
		return this.agreementAdaptationBean.getGroupId();
	}

	public void setGroupId(Integer groupId) {
		this.agreementAdaptationBean.setGroupId(groupId);
	}

	@Column(name="impact_id")
	public Integer getImpactId() {
		return this.agreementAdaptationBean.getImpactId();
	}

	public void setImpactId(Integer impactId) {
		this.agreementAdaptationBean.setImpactId(impactId);
	}
	
	@Column(name="manufacturer_id")
	public Integer getManufacturerId() {
		return this.agreementAdaptationBean.getManufacturerId();
	}

	public void setManufacturerId(Integer manufacturerId) {
		this.agreementAdaptationBean.setManufacturerId(manufacturerId);
	}

	@Column(name="monthly_top_up_rental_amount", columnDefinition="MONEY")
	public BigDecimal getMonthlyTopUpRentalAmount() {
		return this.agreementAdaptationBean.getMonthlyTopUpRentalAmount();
	}

	public void setMonthlyTopUpRentalAmount(BigDecimal monthlyTopUpRentalAmount) {
		this.agreementAdaptationBean.setMonthlyTopUpRentalAmount(monthlyTopUpRentalAmount);
	}
	
	@Column(length=200)
	public String getName() {
		return this.agreementAdaptationBean.getName();
	}

	public void setName(String name) {
		this.agreementAdaptationBean.setName(name);
	}

	@Column(name="on_scheme_ind")
	public Boolean getOnSchemeInd() {
		return this.agreementAdaptationBean.getOnSchemeInd();
	}

	public void setOnSchemeInd(Boolean onSchemeInd) {
		this.agreementAdaptationBean.setOnSchemeInd(onSchemeInd);
	}
	
	@Column(name="price", columnDefinition="MONEY")
	public BigDecimal getPrice() {
		return this.agreementAdaptationBean.getPrice();
	}

	public void setPrice(BigDecimal price) {
		this.agreementAdaptationBean.setPrice(price);
	}
	
	@Column(name="removed_date")
	public Date getRemovedDate() {
		return this.agreementAdaptationBean.getRemovedDate();
	}

	public void setRemovedDate(Date removedDate) {
		this.agreementAdaptationBean.setRemovedDate(removedDate);
	}


	@Column(name="removed_ind")
	public Boolean getRemovedInd() {
		return this.agreementAdaptationBean.getRemovedInd();
	}

	public void setRemovedInd(Boolean removedInd) {
		this.agreementAdaptationBean.setRemovedInd(removedInd);
	}
	
	@Column(name="vat", columnDefinition="MONEY")
	public BigDecimal getVat() {
		return this.agreementAdaptationBean.getVat();
	}

	public void setVat(BigDecimal vat) {
		this.agreementAdaptationBean.setVat(vat);
	}
	
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "fitter_id", referencedColumnName= "fitter_id", nullable = true, insertable=false, updatable=false)
    public AdaptFitterEntity getAdaptFitterEntity() {
        return this.adaptFitterEntity;
    }
    
    public void setAdaptFitterEntity(AdaptFitterEntity adaptFitterEntity) {
    	this.adaptFitterEntity = adaptFitterEntity;
    }
    
	@OneToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name="adaptation_id", referencedColumnName="adaptation_id", nullable=true, insertable=false, updatable=false)
	public AdaptAdaptationEntity getAdaptAdaptationEntity() {
		return this.adaptAdaptationEntity;
	}

	public void setAdaptAdaptationEntity(AdaptAdaptationEntity adaptAdaptationEntity) {
		this.adaptAdaptationEntity = adaptAdaptationEntity;
	}
	
}