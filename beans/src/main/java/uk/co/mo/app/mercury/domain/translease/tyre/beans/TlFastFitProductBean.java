package uk.co.mo.app.mercury.domain.translease.tyre.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class TlFastFitProductBean implements Serializable {

	private static final long serialVersionUID = 6435908564133305293L;

	private String fastFitRecordType;
	private String transmissionAction;
	private Short tyreAspectRatio;
	private String tyreConstruction;
	private String tyreManufacturer;
	private String tyrePlyRating;
	private String tyreSpeedRating;
	private Short tyreWheelRimSize;
	private Short tyreWidth;
	private Short versionNumber;
	private String productCode;

//	@XmlElement(required=true)
	public String getFastFitRecordType() {
		return fastFitRecordType;
	}
	public void setFastFitRecordType(String fastFitRecordType) {
		this.fastFitRecordType = fastFitRecordType;
	}
	public String getTransmissionAction() {
		return transmissionAction;
	}
	public void setTransmissionAction(String transmissionAction) {
		this.transmissionAction = transmissionAction;
	}
	public Short getTyreAspectRatio() {
		return tyreAspectRatio;
	}
	public void setTyreAspectRatio(Short tyreAspectRatio) {
		this.tyreAspectRatio = tyreAspectRatio;
	}
	public String getTyreConstruction() {
		return tyreConstruction;
	}
	public void setTyreConstruction(String tyreConstruction) {
		this.tyreConstruction = tyreConstruction;
	}
	public String getTyreManufacturer() {
		return tyreManufacturer;
	}
	public void setTyreManufacturer(String tyreManufacturer) {
		this.tyreManufacturer = tyreManufacturer;
	}
	public String getTyrePlyRating() {
		return tyrePlyRating;
	}
	public void setTyrePlyRating(String tyrePlyRating) {
		this.tyrePlyRating = tyrePlyRating;
	}
	public String getTyreSpeedRating() {
		return tyreSpeedRating;
	}
	public void setTyreSpeedRating(String tyreSpeedRating) {
		this.tyreSpeedRating = tyreSpeedRating;
	}
	public Short getTyreWheelRimSize() {
		return tyreWheelRimSize;
	}
	public void setTyreWheelRimSize(Short tyreWheelRimSize) {
		this.tyreWheelRimSize = tyreWheelRimSize;
	}
	public Short getTyreWidth() {
		return tyreWidth;
	}
	public void setTyreWidth(Short tyreWidth) {
		this.tyreWidth = tyreWidth;
	}
	public Short getVersionNumber() {
		return versionNumber;
	}
	public void setVersionNumber(Short versionNumber) {
		this.versionNumber = versionNumber;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
