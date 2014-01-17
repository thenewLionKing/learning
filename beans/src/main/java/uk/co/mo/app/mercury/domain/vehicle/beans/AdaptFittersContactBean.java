package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class AdaptFittersContactBean implements Serializable{

	private static final long serialVersionUID = 7181062301946018125L;

	private String department;
	private String email;
	private String forename;
	private String mobile;
	private Boolean prime;
	private String surname;
	private String telephone;
	private String title;
	private Integer contactId;
	private Integer fitterId;
	// Flag required to indicate if the Adaptation Fitter is active or not.
	private Boolean activeFlag; 


	public AdaptFittersContactBean() {
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Boolean isPrime() {
		return prime;
	}

	public void setPrime(Boolean prime) {
		this.prime = prime;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	@XmlElement(required=true)
	public Integer getContactId() {
		return contactId;
	}

	public void setFitterId(Integer fitterId) {
		this.fitterId = fitterId;
	}
	@XmlElement(required=true)
	public Integer getFitterId() {
		return fitterId;
	}

	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
	@XmlElement(required=true)
	public Boolean getActiveFlag() {
		return activeFlag;
	}
}