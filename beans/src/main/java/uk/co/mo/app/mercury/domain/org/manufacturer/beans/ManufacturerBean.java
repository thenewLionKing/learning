package uk.co.mo.app.mercury.domain.org.manufacturer.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class ManufacturerBean implements Serializable {

	private static final long serialVersionUID = -4689242060332207717L;
    private Short manufacturerId;
	private String manufacturerCode;
	private String glassManufacturerCode;
	private String capManufacturerCode;
	private String manufacturerDesc;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private String postcode;
	private String phoneNumber;
	private String faxNumber;
	private String legacyIndicator;
	private String contactFirstname;
	private String contactLastname;
	private String isLease;
	private String stockVehicle;
	private Boolean active;
	private Boolean isLocked;
/*	private Boolean approvedNewHp;
	private Boolean approvedUsedHp;*/
	private String updateUser;
	private String websiteAddress;
	private Integer oracleKey;

	@XmlElement(required=true)
    public String getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    public String getGlassManufacturerCode() {
        return glassManufacturerCode;
    }

    public void setGlassManufacturerCode(String glassManufacturerCode) {
        this.glassManufacturerCode = glassManufacturerCode;
    }

    public String getCapManufacturerCode() {
        return capManufacturerCode;
    }

    public void setCapManufacturerCode(String capManufacturerCode) {
        this.capManufacturerCode = capManufacturerCode;
    }

    public String getManufacturerDesc() {
        return manufacturerDesc;
    }

    public void setManufacturerDesc(String manufacturerDesc) {
        this.manufacturerDesc = manufacturerDesc;
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


    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }


    public String getLegacyIndicator() {
        return legacyIndicator;
    }

    public void setLegacyIndicator(String legacyIndicator) {
        this.legacyIndicator = legacyIndicator;
    }


    public String getContactFirstname() {
        return contactFirstname;
    }

    public void setContactFirstname(String contactFirstname) {
        this.contactFirstname = contactFirstname;
    }


    public String getContactLastname() {
        return contactLastname;
    }

    public void setContactLastname(String contactLastname) {
        this.contactLastname = contactLastname;
    }


    public String getLease() {
        return isLease;
    }

    public void setLease(String lease) {
        isLease = lease;
    }


    public String getStockVehicle() {
        return stockVehicle;
    }

    public void setStockVehicle(String stockVehicle) {
        this.stockVehicle = stockVehicle;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @XmlElement(required=true)
    public Boolean isLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

/*    public Boolean isApprovedNewHp() {
        return approvedNewHp;
    }

    public void setApprovedNewHp(Boolean approvedNewHp) {
        this.approvedNewHp = approvedNewHp;
    }

    public Boolean isApprovedUsedHp() {
        return approvedUsedHp;
    }

    public void setApprovedUsedHp(Boolean approvedUsedHp) {
        this.approvedUsedHp = approvedUsedHp;
    }
*/

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }


    public String getWebsiteAddress() {
        return websiteAddress;
    }

    public void setWebsiteAddress(String websiteAddress) {
        this.websiteAddress = websiteAddress;
    }


    public Integer getOracleKey() {
        return oracleKey;
    }

    @XmlElement(required=true)
    public void setOracleKey(Integer oracleKey) {
        this.oracleKey = oracleKey;
    }

    public ManufacturerBean() {
    }

	public void setManufacturerId(Short manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public Short getManufacturerId() {
		return manufacturerId;
	}
}