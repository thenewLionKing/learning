package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptAdaptationBean;


/**
 * The persistent class for the adapt_adaptations database table.
 * 
 */
@Entity
@Table(name="adapt_adaptations")
public class AdaptAdaptationEntity implements Serializable {

	private static final long serialVersionUID = 8273857080035529762L;
	private AdaptAdaptationBean adaptAdaptationBean = new AdaptAdaptationBean();

	private AdaptAdaptationGroupEntity adaptAdaptationGroupEntity;
	private AdaptManufacturerEntity adaptManufacturerEntity;

	public AdaptAdaptationEntity() {
    }
	
	@Transient
	public AdaptAdaptationBean getAdaptAdaptationBean() {
		return adaptAdaptationBean;
	}

	public void setAdaptAdaptationBean(AdaptAdaptationBean adaptAdaptationBean) {
		this.adaptAdaptationBean = adaptAdaptationBean;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="adaptation_id", unique=true, nullable=false)
	public Integer getAdaptationId() {
		return this.adaptAdaptationBean.getAdaptationId();
	}

	public void setAdaptationId(Integer adaptationId) {
		this.adaptAdaptationBean.setAdaptationId(adaptationId);
	}

	@Column(name="adaptation_name", nullable=false, length=100)
	public String getAdaptationName() {
		return this.adaptAdaptationBean.getAdaptationName();
	}

	public void setAdaptationName(String adaptationName) {
		this.adaptAdaptationBean.setAdaptationName(adaptationName);
	}


	@Column(name="cust_price", columnDefinition = "money")
	public BigDecimal getCustPrice() {
		return this.adaptAdaptationBean.getCustPrice();
	}

	public void setCustPrice(BigDecimal custPrice) {
		this.adaptAdaptationBean.setCustPrice(custPrice);
	}


	@Column(name="cust_vat", columnDefinition = "money")
	public BigDecimal getCustVat() {
		return this.adaptAdaptationBean.getCustVat();
	}

	public void setCustVat(BigDecimal custVat) {
		this.adaptAdaptationBean.setCustVat(custVat);
	}


	@Column(length=255)
	public String getDescription() {
		return this.adaptAdaptationBean.getDescription();
	}

	public void setDescription(String description) {
		this.adaptAdaptationBean.setDescription(description);
	}
	@Column(name="price", columnDefinition = "money")
	public BigDecimal getPrice() {
		return this.adaptAdaptationBean.getPrice();
	}

	public void setPrice(BigDecimal price) {
		this.adaptAdaptationBean.setPrice(price);
	}
	
	@Column(name="vat", columnDefinition = "money")
	public BigDecimal getVat() {
		return this.adaptAdaptationBean.getVat();
	}

	public void setVat(BigDecimal vat) {
		this.adaptAdaptationBean.setVat(vat);
	}


	//bi-directional many-to-one association to AdaptAdaptationGroup
    @ManyToOne
	@JoinColumn(name="group_id", referencedColumnName="group_id", nullable=true)
	public AdaptAdaptationGroupEntity getAdaptAdaptationGroupEntity() {
		return this.adaptAdaptationGroupEntity;
	}

	public void setAdaptAdaptationGroupEntity(AdaptAdaptationGroupEntity adaptAdaptationGroupEntity) {
		this.adaptAdaptationGroupEntity = adaptAdaptationGroupEntity;
	}
	

	//bi-directional many-to-one association to AdaptManufacturer
    @ManyToOne
	@JoinColumn(name="manufacturer_id", referencedColumnName="manufacturer_id", nullable=true)
	public AdaptManufacturerEntity getAdaptManufacturerEntity() {
		return this.adaptManufacturerEntity;
	}

	public void setAdaptManufacturerEntity(AdaptManufacturerEntity adaptManufacturerEntity) {
		this.adaptManufacturerEntity = adaptManufacturerEntity;
	}
}