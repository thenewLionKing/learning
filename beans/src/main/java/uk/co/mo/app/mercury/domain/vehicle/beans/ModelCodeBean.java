package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.util.Date;


public class ModelCodeBean implements Serializable{
	
	private static final long serialVersionUID = 7396042205534740550L;

	private Integer modelId;
	private String bodyCode;
	private Short bodyDoors;
	private String countryCode;
	private String derivativeCode;
	private String engineCode;
	private String fuelSystemCode;
	private Integer introDate;
	private String manufacturerCode;
	private String modelTypeCode;
	private String modifiedBy;
	private Date modifiedWhen;
	private String rangeCode;
	private Integer termDate;
	private String transmissionCode;
	private String trimCode;

	private TransmissionCodeBean transmissionCodeBean;

	public ModelCodeBean() {
	}

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	public String getBodyCode() {
		return bodyCode;
	}

	public void setBodyCode(String bodyCode) {
		this.bodyCode = bodyCode;
	}

	public Short getBodyDoors() {
		return bodyDoors;
	}

	public void setBodyDoors(Short bodyDoors) {
		this.bodyDoors = bodyDoors;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDerivativeCode() {
		return derivativeCode;
	}

	public void setDerivativeCode(String derivativeCode) {
		this.derivativeCode = derivativeCode;
	}

	public String getEngineCode() {
		return engineCode;
	}

	public void setEngineCode(String engineCode) {
		this.engineCode = engineCode;
	}

	public String getFuelSystemCode() {
		return fuelSystemCode;
	}

	public void setFuelSystemCode(String fuelSystemCode) {
		this.fuelSystemCode = fuelSystemCode;
	}

	public Integer getIntroDate() {
		return introDate;
	}

	public void setIntroDate(Integer introDate) {
		this.introDate = introDate;
	}

	public String getManufacturerCode() {
		return manufacturerCode;
	}

	public void setManufacturerCode(String manufacturerCode) {
		this.manufacturerCode = manufacturerCode;
	}

	public String getModelTypeCode() {
		return modelTypeCode;
	}

	public void setModelTypeCode(String modelTypeCode) {
		this.modelTypeCode = modelTypeCode;
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

	public String getRangeCode() {
		return rangeCode;
	}

	public void setRangeCode(String rangeCode) {
		this.rangeCode = rangeCode;
	}

	public Integer getTermDate() {
		return termDate;
	}

	public void setTermDate(Integer termDate) {
		this.termDate = termDate;
	}

	public String getTransmissionCode() {
		return transmissionCode;
	}

	public void setTransmissionCode(String transmissionCode) {
		this.transmissionCode = transmissionCode;
	}

	public String getTrimCode() {
		return trimCode;
	}

	public void setTrimCode(String trimCode) {
		this.trimCode = trimCode;
	}

	public void setTransmissionCodeBean(TransmissionCodeBean transmissionCodeBean) {
		this.transmissionCodeBean = transmissionCodeBean;
	}
	
	public TransmissionCodeBean getTransmissionCodeBean(){
		return this.transmissionCodeBean;
	}
	
}