package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.util.Date;

public class ManufacturerCodeBean {
	private String manufacturerCode;
	private String driveInOut;
	private String manufacturerDesc;
	private String modifiedBy;
	private Date modifiedWhen;
	private String roadTest;

	public ManufacturerCodeBean() {
	}

	public String getManufacturerCode() {
		return manufacturerCode;
	}

	public void setManufacturerCode(String manufacturerCode) {
		this.manufacturerCode = manufacturerCode;
	}

	public String getDriveInOut() {
		return driveInOut;
	}

	public void setDriveInOut(String driveInOut) {
		this.driveInOut = driveInOut;
	}

	public String getManufacturerDesc() {
		return manufacturerDesc;
	}

	public void setManufacturerDesc(String manufacturerDesc) {
		this.manufacturerDesc = manufacturerDesc;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedWhen() {
		return modifiedWhen;
	}

	public void setModifiedWhen(Date modifiedWhen) {
		this.modifiedWhen = modifiedWhen;
	}

	public String getRoadTest() {
		return roadTest;
	}

	public void setRoadTest(String roadTest) {
		this.roadTest = roadTest;
	}
}