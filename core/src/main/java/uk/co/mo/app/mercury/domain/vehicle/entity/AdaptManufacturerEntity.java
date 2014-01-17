package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptManufacturerBean;


/**
 * The persistent class for the adapt_manufacturers database table.
 * 
 */
@Entity
@Table(name="adapt_manufacturers")
public class AdaptManufacturerEntity implements Serializable {

	private static final long serialVersionUID = -1658342902403310513L;
	private AdaptManufacturerBean adaptManufacturerBean = new AdaptManufacturerBean();

	public AdaptManufacturerEntity() {
    }

	@Transient
	public AdaptManufacturerBean getAdaptManufacturerBean() {
		return this.adaptManufacturerBean;
	}
	
	public void setAdaptManufacturerBean (AdaptManufacturerBean adaptManufacturerBean) {
		this.adaptManufacturerBean = adaptManufacturerBean;
	}
	
	@Id
	@Column(name="manufacturer_id", unique=true, nullable=false)
	public Integer getManufacturerId() {
		return this.adaptManufacturerBean.getManufacturerId();
	}

	public void setManufacturerId(Integer manufacturerId) {
		this.adaptManufacturerBean.setManufacturerId(manufacturerId);
	}


	@Column(name="active_ind", nullable=false)
	public Boolean getActiveInd() {
		return this.adaptManufacturerBean.isActiveInd();
	}

	public void setActiveInd(Boolean activeInd) {
		this.adaptManufacturerBean.setActiveInd(activeInd);
	}


	@Column(name="adaptation_prefix", nullable=false, length=50)
	public String getAdaptationPrefix() {
		return this.adaptManufacturerBean.getAdaptationPrefix();
	}

	public void setAdaptationPrefix(String adaptationPrefix) {
		this.adaptManufacturerBean.setAdaptationPrefix(adaptationPrefix);
	}


	@Column(name="manufacturer_name", nullable=false, length=50)
	public String getManufacturerName() {
		return this.adaptManufacturerBean.getManufacturerName();
	}

	public void setManufacturerName(String manufacturerName) {
		this.adaptManufacturerBean.setManufacturerName(manufacturerName);
	}


	@Column(length=15)
	public String getTelephone() {
		return this.adaptManufacturerBean.getTelephone();
	}

	public void setTelephone(String telephone) {
		this.adaptManufacturerBean.setTelephone(telephone);
	}


	@Column(length=100)
	public String getWebsite() {
		return this.adaptManufacturerBean.getWebsite();
	}

	public void setWebsite(String website) {
		this.adaptManufacturerBean.setWebsite(website);
	}
}