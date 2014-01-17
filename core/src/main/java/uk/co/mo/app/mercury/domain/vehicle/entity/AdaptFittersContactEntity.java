package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptFittersContactBean;


/**
 * The persistent class for the adapt_fitters_contacts database table.
 * 
 */
@Entity
@Table(name="adapt_fitters_contacts")
public class AdaptFittersContactEntity implements Serializable {
	
	private static final long serialVersionUID = 2957833936736770973L;

	private AdaptFittersContactBean adaptFittersContactBean = new AdaptFittersContactBean();

	private AdaptFittersContactEntityPK id;

	public AdaptFittersContactEntity() {
    }


	@Transient
	public AdaptFittersContactBean getAdaptFittersContactBean() {
		return adaptFittersContactBean;
	}
	
	
	public void setAdaptFittersContactBean(
			AdaptFittersContactBean adaptFittersContactBean) {
		this.adaptFittersContactBean = adaptFittersContactBean;
	}

	@EmbeddedId
	public AdaptFittersContactEntityPK getId() {
		return this.id;
	}

	public void setId(AdaptFittersContactEntityPK id) {
		this.id=id;
	}
	

	@Column(length=50)
	public String getDepartment() {
		return this.adaptFittersContactBean.getDepartment();
	}

	public void setDepartment(String department) {
		this.adaptFittersContactBean.setDepartment(department);
	}


	@Column(length=150)
	public String getEmail() {
		return this.adaptFittersContactBean.getEmail();
	}

	public void setEmail(String email) {
		this.adaptFittersContactBean.setEmail(email);
	}


	@Column(length=30)
	public String getForename() {
		return this.adaptFittersContactBean.getForename();
	}

	public void setForename(String forename) {
		this.adaptFittersContactBean.setForename(forename);
	}


	@Column(length=15)
	public String getMobile() {
		return this.adaptFittersContactBean.getMobile();
	}

	public void setMobile(String mobile) {
		this.adaptFittersContactBean.setMobile(mobile);
	}


	public Boolean getPrime() {
		return this.adaptFittersContactBean.isPrime();
	}

	public void setPrime(Boolean prime) {
		this.adaptFittersContactBean.setPrime(prime);
	}


	@Column(length=30)
	public String getSurname() {
		return this.adaptFittersContactBean.getSurname();
	}

	public void setSurname(String surname) {
		this.adaptFittersContactBean.setSurname(surname);
	}


	@Column(length=15)
	public String getTelephone() {
		return this.adaptFittersContactBean.getTelephone();
	}

	public void setTelephone(String telephone) {
		this.adaptFittersContactBean.setTelephone(telephone);
	}


	@Column(length=4)
	public String getTitle() {
		return this.adaptFittersContactBean.getTitle();
	}

	public void setTitle(String title) {
		this.adaptFittersContactBean.setTitle(title);
	}

}