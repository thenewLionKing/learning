package uk.co.mo.app.mercury.domain.org.dealer.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class DealerGroupBean implements Serializable{

	private static final long serialVersionUID = 7147560715495176925L;

	private Integer groupNumber;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private String email;
	private String faxReception;
	private String groupName;
	private Integer groupType;
	private String postcode;
	private String telReception;
	private String website;

	public DealerGroupBean() {
	}
	
	@XmlElement(required=true)
	public Integer getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(Integer groupNumber) {
		this.groupNumber = groupNumber;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFaxReception() {
		return faxReception;
	}

	public void setFaxReception(String faxReception) {
		this.faxReception = faxReception;
	}
	
	@XmlElement(required=true)
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	@XmlElement(required=true)
	public Integer getGroupType() {
		return groupType;
	}

	public void setGroupType(Integer groupType) {
		this.groupType = groupType;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getTelReception() {
		return telReception;
	}

	public void setTelReception(String telReception) {
		this.telReception = telReception;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
}