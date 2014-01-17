package uk.co.mo.app.mercury.domain.org.manufacturer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.org.manufacturer.beans.ManufacturerBean;

/**
 * <p/>
 * User: prabat
 * Date: 01/07/11
 * Time: 11:38
 * <p/>
 * Change Log - Who : When : Comment
 */
@Table(name = "manufacturers", schema = "dbo", catalog = "Enterprise")
@Entity
public class ManufacturersEntity {

    private ManufacturerBean manufacturerBean = new ManufacturerBean();

    @Transient
	public ManufacturerBean getManufacturerBean() {
		return manufacturerBean;
	}

	public void setManufacturerBean(ManufacturerBean manufacturerBean) {
		this.manufacturerBean = manufacturerBean;
	}

	@Column(name = "manufacturer_id")
    @Id
    public Short getManufacturerId() {
        return this.manufacturerBean.getManufacturerId();
    }

    public void setManufacturerId(Short manufacturerId) {
    	this.manufacturerBean.setManufacturerId(manufacturerId);
    }

    @Column(name = "manufacturer_code", columnDefinition = "CHAR 2 NOT NULL" , unique=true)
    public String getManufacturerCode() {
        return manufacturerBean.getManufacturerCode();
    }

    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerBean.setManufacturerCode(manufacturerCode);
    }

    @Column(name = "glass_manufacturer_code", columnDefinition = "CHAR 2 NULL")
    public String getGlassManufacturerCode() {
        return manufacturerBean.getGlassManufacturerCode();
    }

    public void setGlassManufacturerCode(String glassManufacturerCode) {
        this.manufacturerBean.setGlassManufacturerCode(glassManufacturerCode);
    }

    @Column(name = "cap_manufacturer_code", columnDefinition = "CHAR 2 NULL")
    public String getCapManufacturerCode() {
        return manufacturerBean.getCapManufacturerCode();
    }

    public void setCapManufacturerCode(String capManufacturerCode) {
        this.manufacturerBean.setCapManufacturerCode(capManufacturerCode);
    }

    @Column(name = "manufacturer_desc")
    public String getManufacturerDesc() {
        return manufacturerBean.getManufacturerDesc();
    }

    public void setManufacturerDesc(String manufacturerDesc) {
        this.manufacturerBean.setManufacturerDesc(manufacturerDesc);
    }

    @Column(name = "address1")
    public String getAddress1() {
        return manufacturerBean.getAddress1();
    }

    public void setAddress1(String address1) {
        this.manufacturerBean.setAddress1(address1);
    }

    @Column(name = "address2")
    public String getAddress2() {
        return manufacturerBean.getAddress2();
    }

    public void setAddress2(String address2) {
        this.manufacturerBean.setAddress2(address2);
    }

    @Column(name = "address3")
    public String getAddress3() {
        return manufacturerBean.getAddress3();
    }

    public void setAddress3(String address3) {
        this.manufacturerBean.setAddress3(address3);
    }

    @Column(name = "address4")
    public String getAddress4() {
        return manufacturerBean.getAddress4();
    }

    public void setAddress4(String address4) {
        this.manufacturerBean.setAddress4(address4);
    }

    @Column(name = "postcode", columnDefinition = "CHAR 8 NULL")
    public String getPostcode() {
        return manufacturerBean.getPostcode();
    }

    public void setPostcode(String postcode) {
        this.manufacturerBean.setPostcode(postcode);
    }

    @Column(name = "phone_number")
    public String getPhoneNumber() {
        return manufacturerBean.getPhoneNumber();
    }

    public void setPhoneNumber(String phoneNumber) {
        this.manufacturerBean.setPhoneNumber(phoneNumber);
    }

    @Column(name = "fax_number")
    public String getFaxNumber() {
        return manufacturerBean.getFaxNumber();
    }

    public void setFaxNumber(String faxNumber) {
        this.manufacturerBean.setFaxNumber(faxNumber);
    }

    @Column(name = "legacy_indicator", columnDefinition = "CHAR 1 NULL")
    public String getLegacyIndicator() {
        return manufacturerBean.getLegacyIndicator();
    }

    public void setLegacyIndicator(String legacyIndicator) {
        this.manufacturerBean.setLegacyIndicator(legacyIndicator);
    }

    @Column(name = "contact_firstname")
    public String getContactFirstname() {
        return manufacturerBean.getContactFirstname();
    }

    public void setContactFirstname(String contactFirstname) {
        this.manufacturerBean.setContactFirstname(contactFirstname);
    }

    @Column(name = "contact_lastname")
    public String getContactLastname() {
        return manufacturerBean.getContactLastname();
    }

    public void setContactLastname(String contactLastname) {
        this.manufacturerBean.setContactLastname(contactLastname);
    }

    @Column(name = "is_lease", columnDefinition = "CHAR 1 NULL")
    public String getLease() {
        return manufacturerBean.getLease();
    }

    public void setLease(String lease) {
        manufacturerBean.setLease(lease);
    }

    @Column(name = "stock_vehicle", columnDefinition = "CHAR 1 NULL")
    public String getStockVehicle() {
        return manufacturerBean.getStockVehicle();
    }

    public void setStockVehicle(String stockVehicle) {
        this.manufacturerBean.setStockVehicle(stockVehicle);
    }

    @Column(name = "active")
    public Boolean isActive() {
        return manufacturerBean.isActive();
    }

    public void setActive(Boolean active) {
        this.manufacturerBean.setActive(active);
    }

/*    @Column(name = "approved_new_hp")
    public Boolean isApprovedNewHp() {
        return manufacturerBean.isApprovedNewHp();
    }

    public void setApprovedNewHp(Boolean approvedNewHp) {
        this.manufacturerBean.setApprovedNewHp(approvedNewHp);
    }

    @Column(name = "approved_used_hp")
    public Boolean isApprovedUsedHp() {
        return manufacturerBean.isApprovedUsedHp();
    }

    public void setApprovedUsedHp(Boolean approvedUsedHp) {
        this.manufacturerBean.setApprovedUsedHp(approvedUsedHp);
    }*/

    @Column(name = "update_user")
    public String getUpdateUser() {
        return manufacturerBean.getUpdateUser();
    }

    public void setUpdateUser(String updateUser) {
        this.manufacturerBean.setUpdateUser(updateUser);
    }

    @Column(name = "website_address")
    public String getWebsiteAddress() {
        return manufacturerBean.getWebsiteAddress();
    }

    public void setWebsiteAddress(String websiteAddress) {
        this.manufacturerBean.setWebsiteAddress(websiteAddress);
    }

    @Column(name = "oracle_key")
    public Integer getOracleKey() {
        return manufacturerBean.getOracleKey();
    }

    public void setOracleKey(Integer oracleKey) {
        this.manufacturerBean.setOracleKey(oracleKey);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ManufacturersEntity that = (ManufacturersEntity) o;

        if (manufacturerBean.getOracleKey() != null ? !manufacturerBean.getOracleKey().equals(that.manufacturerBean.getOracleKey()) : that.manufacturerBean.getOracleKey() != null) 
        	return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 31 * 7 + (manufacturerBean.getOracleKey() != null ? manufacturerBean.getOracleKey().hashCode() : 0);
        return result;
    }
}
