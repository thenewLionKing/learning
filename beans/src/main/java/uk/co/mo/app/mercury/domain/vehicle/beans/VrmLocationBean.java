package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.util.Date;

public class VrmLocationBean implements Serializable{
	
	private static final long serialVersionUID = -3022883966886708833L;

	private Integer locationId;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private String address5;
	private Integer alternate_Address_Id;
	private Integer customerId;
	private Integer locationTypeId;
	private Integer organisationId;
	private String postcode;
	private VrmOrganisationBean vrmOrganisationBean; 

	public VrmLocationBean() {
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getAddress5() {
		return address5;
	}

	public void setAddress5(String address5) {
		this.address5 = address5;
	}

	public Integer getAlternate_Address_Id() {
		return alternate_Address_Id;
	}

	public void setAlternate_Address_Id(Integer alternate_Address_Id) {
		this.alternate_Address_Id = alternate_Address_Id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getLocationTypeId() {
		return locationTypeId;
	}

	public void setLocationTypeId(Integer locationTypeId) {
		this.locationTypeId = locationTypeId;
	}

	public Integer getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(Integer organisationId) {
		this.organisationId = organisationId;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public void setVrmOrganisationBean(VrmOrganisationBean vrmOrganisationBean) {
		this.vrmOrganisationBean = vrmOrganisationBean;
	}

	public VrmOrganisationBean getVrmOrganisationBean() {
		return vrmOrganisationBean;
	}
}