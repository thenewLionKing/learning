package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.ModelDescriptionBean;


/**
 * The persistent class for the model_description database table.
 * 
 */
@Entity
@Table(name="model_description")
public class ModelDescriptionEntity implements Serializable {

	private static final long serialVersionUID = 925716959203054786L;

	private ModelDescriptionBean modelDescriptionBean = new ModelDescriptionBean();

	public ModelDescriptionEntity() {
    }

	@Transient
	public ModelDescriptionBean getModelDescriptionBean() {
		return modelDescriptionBean;
	}


	public void setModelDescriptionBean(ModelDescriptionBean modelDescriptionBean) {
		this.modelDescriptionBean = modelDescriptionBean;
	}


	@Id
	@Column(name="model_id")
	public Integer getModelId() {
		return this.modelDescriptionBean.getModelId();
	}

	public void setModelId(Integer modelId) {
		this.modelDescriptionBean.setModelId(modelId);
	}


	@Column(name="abi_code")
	public Integer getAbiCode() {
		return this.modelDescriptionBean.getAbiCode();
	}

	public void setAbiCode(Integer abiCode) {
		this.modelDescriptionBean.setAbiCode(abiCode);
	}


	@Column(name="body_code", columnDefinition="CHAR")
	public String getBodyCode() {
		return this.modelDescriptionBean.getBodyCode();
	}

	public void setBodyCode(String bodyCode) {
		this.modelDescriptionBean.setBodyCode(bodyCode);
	}


	@Column(name="body_code_short_desc")
	public String getBodyCodeShortDesc() {
		return this.modelDescriptionBean.getBodyCodeShortDesc();
	}

	public void setBodyCodeShortDesc(String bodyCodeShortDesc) {
		this.modelDescriptionBean.setBodyCodeShortDesc(bodyCodeShortDesc);
	}


	@Column(name="body_doors", columnDefinition="TINYINT")
	public Short getBodyDoors() {
		return this.modelDescriptionBean.getBodyDoors();
	}

	public void setBodyDoors(Short bodyDoors) {
		this.modelDescriptionBean.setBodyDoors(bodyDoors);
	}


	@Column(name="body_type_desc")
	public String getBodyTypeDesc() {
		return this.modelDescriptionBean.getBodyTypeDesc();
	}

	public void setBodyTypeDesc(String bodyTypeDesc) {
		this.modelDescriptionBean.setBodyTypeDesc(bodyTypeDesc);
	}


	@Column(name="cam_shaft", columnDefinition="CHAR")
	public String getCamShaft() {
		return this.modelDescriptionBean.getCamShaft();
	}

	public void setCamShaft(String camShaft) {
		this.modelDescriptionBean.setCamShaft(camShaft);
	}


	@Column(name="country_code", columnDefinition="CHAR")
	public String getCountryCode() {
		return this.modelDescriptionBean.getCountryCode();
	}

	public void setCountryCode(String countryCode) {
		this.modelDescriptionBean.setCountryCode(countryCode);
	}


	@Column(name="country_desc")
	public String getCountryDesc() {
		return this.modelDescriptionBean.getCountryDesc();
	}

	public void setCountryDesc(String countryDesc) {
		this.modelDescriptionBean.setCountryDesc(countryDesc);
	}


	@Column(name="cubic_capacity")
	public Integer getCubicCapacity() {
		return this.modelDescriptionBean.getCubicCapacity();
	}

	public void setCubicCapacity(Integer cubicCapacity) {
		this.modelDescriptionBean.setCubicCapacity(cubicCapacity);
	}

	@Column( columnDefinition="CHAR")
	public String getCylinders() {
		return this.modelDescriptionBean.getCylinders();
	}

	public void setCylinders(String cylinders) {
		this.modelDescriptionBean.setCylinders(cylinders);
	}


	@Column(name="derivative_code", columnDefinition="CHAR")
	public String getDerivativeCode() {
		return this.modelDescriptionBean.getDerivativeCode();
	}

	public void setDerivativeCode(String derivativeCode) {
		this.modelDescriptionBean.setDerivativeCode(derivativeCode);
	}


	@Column(name="derivative_description")
	public String getDerivativeDescription() {
		return this.modelDescriptionBean.getDerivativeDescription();
	}

	public void setDerivativeDescription(String derivativeDescription) {
		this.modelDescriptionBean.setDerivativeDescription(derivativeDescription);
	}


	@Column(name="engine_code", columnDefinition="CHAR")
	public String getEngineCode() {
		return this.modelDescriptionBean.getEngineCode();
	}

	public void setEngineCode(String engineCode) {
		this.modelDescriptionBean.setEngineCode(engineCode);
	}


	@Column(name="fuel_aspiration")
	public String getFuelAspiration() {
		return this.modelDescriptionBean.getFuelAspiration();
	}

	public void setFuelAspiration(String fuelAspiration) {
		this.modelDescriptionBean.setFuelAspiration(fuelAspiration);
	}


	@Column(name="fuel_catalyst", columnDefinition="CHAR")
	public String getFuelCatalyst() {
		return this.modelDescriptionBean.getFuelCatalyst();
	}

	public void setFuelCatalyst(String fuelCatalyst) {
		this.modelDescriptionBean.setFuelCatalyst(fuelCatalyst);
	}


	@Column(name="fuel_delivery")
	public String getFuelDelivery() {
		return this.modelDescriptionBean.getFuelDelivery();
	}

	public void setFuelDelivery(String fuelDelivery) {
		this.modelDescriptionBean.setFuelDelivery(fuelDelivery);
	}


	@Column(name="fuel_system_code", columnDefinition="CHAR")
	public String getFuelSystemCode() {
		return this.modelDescriptionBean.getFuelSystemCode();
	}

	public void setFuelSystemCode(String fuelSystemCode) {
		this.modelDescriptionBean.setFuelSystemCode(fuelSystemCode);
	}


	@Column(name="fuel_type", columnDefinition="CHAR")
	public String getFuelType() {
		return this.modelDescriptionBean.getFuelType();
	}

	public void setFuelType(String fuelType) {
		this.modelDescriptionBean.setFuelType(fuelType);
	}


	@Column(name="horse_power")
	public Integer getHorsePower() {
		return this.modelDescriptionBean.getHorsePower();
	}

	public void setHorsePower(Integer horsePower) {
		this.modelDescriptionBean.setHorsePower(horsePower);
	}


	@Column(name="insurance_group", columnDefinition="TINYINT")
	public Short getInsuranceGroup() {
		return this.modelDescriptionBean.getInsuranceGroup();
	}

	public void setInsuranceGroup(Short insuranceGroup) {
		this.modelDescriptionBean.setInsuranceGroup(insuranceGroup);
	}


	@Column(name="intro_date")
	public Integer getIntroDate() {
		return this.modelDescriptionBean.getIntroDate();
	}

	public void setIntroDate(Integer introDate) {
		this.modelDescriptionBean.setIntroDate(introDate);
	}


	@Column(name="manufacturer_code", columnDefinition="CHAR")
	public String getManufacturerCode() {
		return this.modelDescriptionBean.getManufacturerCode();
	}

	public void setManufacturerCode(String manufacturerCode) {
		this.modelDescriptionBean.setManufacturerCode(manufacturerCode);
	}


	@Column(name="manufacturer_desc")
	public String getManufacturerDesc() {
		return this.modelDescriptionBean.getManufacturerDesc();
	}

	public void setManufacturerDesc(String manufacturerDesc) {
		this.modelDescriptionBean.setManufacturerDesc(manufacturerDesc);
	}


	@Column(name="range_code", columnDefinition="CHAR")
	public String getRangeCode() {
		return this.modelDescriptionBean.getRangeCode();
	}

	public void setRangeCode(String rangeCode) {
		this.modelDescriptionBean.setRangeCode(rangeCode);
	}


	@Column(name="range_desc")
	public String getRangeDesc() {
		return this.modelDescriptionBean.getRangeDesc();
	}

	public void setRangeDesc(String rangeDesc) {
		this.modelDescriptionBean.setRangeDesc(rangeDesc);
	}


	@Column(name="term_date")
	public Integer getTermDate() {
		return this.modelDescriptionBean.getTermDate();
	}

	public void setTermDate(Integer termDate) {
		this.modelDescriptionBean.setTermDate(termDate);
	}


	@Column(name="trans_drive_code", columnDefinition="CHAR")
	public String getTransDriveCode() {
		return this.modelDescriptionBean.getTransDriveCode();
	}

	public void setTransDriveCode(String transDriveCode) {
		this.modelDescriptionBean.setTransDriveCode(transDriveCode);
	}


	@Column(name="trans_drive_desc")
	public String getTransDriveDesc() {
		return this.modelDescriptionBean.getTransDriveDesc();
	}

	public void setTransDriveDesc(String transDriveDesc) {
		this.modelDescriptionBean.setTransDriveDesc(transDriveDesc);
	}


	@Column(name="trans_drive_short_desc")
	public String getTransDriveShortDesc() {
		return this.modelDescriptionBean.getTransDriveShortDesc();
	}

	public void setTransDriveShortDesc(String transDriveShortDesc) {
		this.modelDescriptionBean.setTransDriveShortDesc(transDriveShortDesc);
	}


	@Column(name="trans_speed_code", columnDefinition="CHAR")
	public String getTransSpeedCode() {
		return this.modelDescriptionBean.getTransSpeedCode();
	}

	public void setTransSpeedCode(String transSpeedCode) {
		this.modelDescriptionBean.setTransSpeedCode(transSpeedCode);
	}


	@Column(name="trans_speed_desc")
	public String getTransSpeedDesc() {
		return this.modelDescriptionBean.getTransSpeedDesc();
	}

	public void setTransSpeedDesc(String transSpeedDesc) {
		this.modelDescriptionBean.setTransSpeedDesc(transSpeedDesc);
	}


	@Column(name="trans_speed_short_desc")
	public String getTransSpeedShortDesc() {
		return this.modelDescriptionBean.getTransSpeedShortDesc();
	}

	public void setTransSpeedShortDesc(String transSpeedShortDesc) {
		this.modelDescriptionBean.setTransSpeedShortDesc(transSpeedShortDesc);
	}


	@Column(name="trans_type_code", columnDefinition="CHAR")
	public String getTransTypeCode() {
		return this.modelDescriptionBean.getTransTypeCode();
	}

	public void setTransTypeCode(String transTypeCode) {
		this.modelDescriptionBean.setTransTypeCode(transTypeCode);
	}


	@Column(name="trans_type_desc")
	public String getTransTypeDesc() {
		return this.modelDescriptionBean.getTransTypeDesc();
	}

	public void setTransTypeDesc(String transTypeDesc) {
		this.modelDescriptionBean.setTransTypeDesc(transTypeDesc);
	}


	@Column(name="trans_type_short_desc")
	public String getTransTypeShortDesc() {
		return this.modelDescriptionBean.getTransTypeShortDesc();
	}

	public void setTransTypeShortDesc(String transTypeShortDesc) {
		this.modelDescriptionBean.setTransTypeShortDesc(transTypeShortDesc);
	}


	@Column(name="transmission_code", columnDefinition="CHAR")
	public String getTransmissionCode() {
		return this.modelDescriptionBean.getTransmissionCode();
	}

	public void setTransmissionCode(String transmissionCode) {
		this.modelDescriptionBean.setTransmissionCode(transmissionCode);
	}


	@Column(name="trim_code", columnDefinition="CHAR")
	public String getTrimCode() {
		return this.modelDescriptionBean.getTrimCode();
	}

	public void setTrimCode(String trimCode) {
		this.modelDescriptionBean.setTrimCode(trimCode);
	}


	@Column(name="trim_desc")
	public String getTrimDesc() {
		return this.modelDescriptionBean.getTrimDesc();
	}

	public void setTrimDesc(String trimDesc) {
		this.modelDescriptionBean.setTrimDesc(trimDesc);
	}

	@Column(columnDefinition="SMALLINT")
	public Short getValves() {
		return this.modelDescriptionBean.getValves();
	}

	public void setValves(Short valves) {
		this.modelDescriptionBean.setValves(valves);
	}

}