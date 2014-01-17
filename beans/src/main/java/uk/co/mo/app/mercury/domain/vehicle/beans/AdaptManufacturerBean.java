package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;


public class AdaptManufacturerBean implements Serializable {

	private static final long serialVersionUID = 464711412245640228L;
	private Integer manufacturerId;
	private Boolean activeInd;
	private String adaptationPrefix;
	private String manufacturerName;
	private String telephone;
	private String website;


	public AdaptManufacturerBean() {
	}
	
	@XmlElement(required=true)
	public Integer getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	
	@XmlElement(required=true)
	public Boolean isActiveInd() {
		return activeInd;
	}

	public void setActiveInd(Boolean activeInd) {
		this.activeInd = activeInd;
	}
	
	@XmlElement(required=true)
	public String getAdaptationPrefix() {
		return adaptationPrefix;
	}

	public void setAdaptationPrefix(String adaptationPrefix) {
		this.adaptationPrefix = adaptationPrefix;
	}

	@XmlElement(required=true)
	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
}