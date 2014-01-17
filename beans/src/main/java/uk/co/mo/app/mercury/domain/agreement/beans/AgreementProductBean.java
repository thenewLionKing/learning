package uk.co.mo.app.mercury.domain.agreement.beans;

import java.io.Serializable;
import java.util.Date;

import uk.co.mo.app.mercury.domain.product.pricing.beans.ProductPriceProfileBean;

public class AgreementProductBean implements Serializable{
	
	private static final long serialVersionUID = 7984990052327334596L;

	private String assetNumber;
	private String chassisNumber;
	private String transaxleNumber;
	private String batteryNumber;
	private String motorNumber;
	private String registrationNumber;
	private Date registrationDate;
	private Date effectiveFrom;
	private Date effectiveTo;
	private Date insertDate;
	private Date updateDate;
	private String insertUser;
	private String updateUser;
	private Boolean keptSecure;
	private Short secrureDuringTransit;
	private Boolean soleUser;
	private String colour;
	
	private ProductPriceProfileBean priceProfile;


	public AgreementProductBean() {
	}

	public String getAssetNumber() {
		return assetNumber;
	}

	public void setAssetNumber(String assetNumber) {
		this.assetNumber = assetNumber;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getTransaxleNumber() {
		return transaxleNumber;
	}

	public void setTransaxleNumber(String transaxleNumber) {
		this.transaxleNumber = transaxleNumber;
	}

	public String getBatteryNumber() {
		return batteryNumber;
	}

	public void setBatteryNumber(String batteryNumber) {
		this.batteryNumber = batteryNumber;
	}

	public String getMotorNumber() {
		return motorNumber;
	}

	public void setMotorNumber(String motorNumber) {
		this.motorNumber = motorNumber;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getEffectiveFrom() {
		return effectiveFrom;
	}

	public void setEffectiveFrom(Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}

	public Date getEffectiveTo() {
		return effectiveTo;
	}

	public void setEffectiveTo(Date effectiveTo) {
		this.effectiveTo = effectiveTo;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getInsertUser() {
		return insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Boolean isKeptSecure() {
		return keptSecure;
	}

	public void setKeptSecure(Boolean keptSecure) {
		this.keptSecure = keptSecure;
	}

	public Short getSecrureDuringTransit() {
		return secrureDuringTransit;
	}

	public void setSecrureDuringTransit(Short secrureDuringTransit) {
		this.secrureDuringTransit = secrureDuringTransit;
	}

	public Boolean isSoleUser() {
		return soleUser;
	}

	public void setSoleUser(Boolean soleUser) {
		this.soleUser = soleUser;
	}

	public void setPriceProfile(ProductPriceProfileBean priceProfile) {
		this.priceProfile = priceProfile;
	}

	public ProductPriceProfileBean getPriceProfile() {
		return priceProfile;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour=colour;
	}

	@Override
	public String toString() {
		return "AgreementProductBean [assetNumber=" + assetNumber
				+ ", chassisNumber=" + chassisNumber + ", transaxleNumber="
				+ transaxleNumber + ", batteryNumber=" + batteryNumber
				+ ", motorNumber=" + motorNumber + ", registrationNumber="
				+ registrationNumber + ", registrationDate=" + registrationDate
				+ ", effectiveFrom=" + effectiveFrom + ", effectiveTo="
				+ effectiveTo + ", insertDate=" + insertDate + ", updateDate="
				+ updateDate + ", insertUser=" + insertUser + ", updateUser="
				+ updateUser + ", keptSecure=" + keptSecure
				+ ", secrureDuringTransit=" + secrureDuringTransit
				+ ", soleUser=" + soleUser + ", colour=" + colour
				+ ", priceProfile=" + priceProfile + "]";
	}
}