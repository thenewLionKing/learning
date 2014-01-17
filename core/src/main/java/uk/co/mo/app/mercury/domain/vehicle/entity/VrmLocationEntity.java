package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.VrmLocationBean;


/**
 * The persistent class for the vrm_location database table.
 * 
 */
@Entity
@Table(name="vrm_location")
public class VrmLocationEntity implements Serializable {

	private static final long serialVersionUID = 2646710947231292147L;

	private VrmLocationBean vrmLocationBean = new VrmLocationBean();
	private VrmOrganisationEntity vrmOrganisationEntity = new VrmOrganisationEntity(); 
	
	public VrmLocationEntity() {
    }

	@Transient
	public VrmLocationBean getVrmLocationBean() {
		return vrmLocationBean;
	}

	public void setVrmLocationBean(VrmLocationBean vrmLocationBean) {
		this.vrmLocationBean = vrmLocationBean;
	}


	@Id
	@Column(name="location_id", unique=true,insertable=false, updatable=false, nullable=false)
	public Integer getLocationId() {
		return this.vrmLocationBean.getLocationId();
	}

	public void setLocationId(Integer locationId) {
		this.vrmLocationBean.setLocationId(locationId);
	}


	@Column(length=75)
	public String getAddress1() {
		return this.vrmLocationBean.getAddress1();
	}

	public void setAddress1(String address1) {
		this.vrmLocationBean.setAddress1(address1);
	}


	@Column(length=75)
	public String getAddress2() {
		return this.vrmLocationBean.getAddress2();
	}

	public void setAddress2(String address2) {
		this.vrmLocationBean.setAddress2(address2);
	}


	@Column(length=75)
	public String getAddress3() {
		return this.vrmLocationBean.getAddress3();
	}

	public void setAddress3(String address3) {
		this.vrmLocationBean.setAddress3(address3);
	}


	@Column(length=75)
	public String getAddress4() {
		return this.vrmLocationBean.getAddress4();
	}

	public void setAddress4(String address4) {
		this.vrmLocationBean.setAddress4(address4);
	}


	@Column(length=75)
	public String getAddress5() {
		return this.vrmLocationBean.getAddress5();
	}

	public void setAddress5(String address5) {
		this.vrmLocationBean.setAddress5(address5);
	}


	@Column(name="Alternate_Address_Id")
	public Integer getAlternate_Address_Id() {
		return this.vrmLocationBean.getAlternate_Address_Id();
	}

	public void setAlternate_Address_Id(Integer alternate_Address_Id) {
		this.vrmLocationBean.setAlternate_Address_Id(alternate_Address_Id);
	}


	@Column(name="customer_id")
	public Integer getCustomerId() {
		return this.vrmLocationBean.getCustomerId();
	}

	public void setCustomerId(Integer customerId) {
		this.vrmLocationBean.setCustomerId(customerId);
	}


	@Column(name="location_type_id", nullable=false)
	public Integer getLocationTypeId() {
		return this.vrmLocationBean.getLocationTypeId();
	}

	public void setLocationTypeId(Integer locationTypeId) {
		this.vrmLocationBean.setLocationTypeId(locationTypeId);
	}


	@Column(name="organisation_id", insertable=false, updatable=false)
	public Integer getOrganisationId() {
		return this.vrmLocationBean.getOrganisationId();
	}

	public void setOrganisationId(Integer organisationId) {
		this.vrmLocationBean.setOrganisationId(organisationId);
	}


	@Column(length=10, columnDefinition="CHAR")
	public String getPostcode() {
		return this.vrmLocationBean.getPostcode();
	}

	public void setPostcode(String postcode) {
		this.vrmLocationBean.setPostcode(postcode);
	}
	
	@OneToOne(cascade=CascadeType.ALL, fetch= FetchType.LAZY)
	@JoinColumn(name="organisation_id", referencedColumnName="organisation_id")
	public VrmOrganisationEntity getVrmOrganisationEntity() {
		return vrmOrganisationEntity;
	}
	
	public void setVrmOrganisationEntity(VrmOrganisationEntity vrmOrganisationEntity) {
		this.vrmOrganisationEntity = vrmOrganisationEntity;
	}

}