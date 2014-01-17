package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.ModelCodeBean;


/**
 * The persistent class for the model_code database table.
 * 
 */
@Entity
@Table(name="model_code")
public class ModelCodeEntity implements Serializable {

	private static final long serialVersionUID = 1044718680415881261L;

	private ModelCodeBean modelCodeBean = new ModelCodeBean();
	private TransmissionCodeEntity transmissionCodeEntity;

	public ModelCodeEntity() {
    }

	@Transient
	public ModelCodeBean getModelCodeBean() {
		return modelCodeBean;
	}

	public void setModelCodeBean(ModelCodeBean modelCodeBean) {
		this.modelCodeBean = modelCodeBean;
	}

	@Id
	@Column(name="model_id", unique=true, nullable=false)
	public Integer getModelId() {
		return this.modelCodeBean.getModelId();
	}

	public void setModelId(Integer modelId) {
		this.modelCodeBean.setModelId(modelId);
	}


	@Column(name="body_code", nullable=false, length=1, columnDefinition="CHAR")
	public String getBodyCode() {
		return this.modelCodeBean.getBodyCode();
	}

	public void setBodyCode(String bodyCode) {
		this.modelCodeBean.setBodyCode(bodyCode);
	}


	@Column(name="body_doors", nullable=false, columnDefinition="TINYINT")
	public short getBodyDoors() {
		return this.modelCodeBean.getBodyDoors();
	}

	public void setBodyDoors(short bodyDoors) {
		this.modelCodeBean.setBodyDoors(bodyDoors);
	}


	@Column(name="country_code", nullable=false, length=2, columnDefinition="CHAR")
	public String getCountryCode() {
		return this.modelCodeBean.getCountryCode();
	}

	public void setCountryCode(String countryCode) {
		this.modelCodeBean.setCountryCode(countryCode);
	}


	@Column(name="derivative_code", nullable=false, length=2, columnDefinition="CHAR")
	public String getDerivativeCode() {
		return this.modelCodeBean.getDerivativeCode();
	}

	public void setDerivativeCode(String derivativeCode) {
		this.modelCodeBean.setDerivativeCode(derivativeCode);
	}


	@Column(name="engine_code", nullable=false, length=2, columnDefinition="CHAR")
	public String getEngineCode() {
		return this.modelCodeBean.getEngineCode();
	}

	public void setEngineCode(String engineCode) {
		this.modelCodeBean.setEngineCode(engineCode);
	}


	@Column(name="fuel_system_code", nullable=false, length=2, columnDefinition="CHAR")
	public String getFuelSystemCode() {
		return this.modelCodeBean.getFuelSystemCode();
	}

	public void setFuelSystemCode(String fuelSystemCode) {
		this.modelCodeBean.setFuelSystemCode(fuelSystemCode);
	}


	@Column(name="intro_date", nullable=false)
	public Integer getIntroDate() {
		return this.modelCodeBean.getIntroDate();
	}

	public void setIntroDate(Integer introDate) {
		this.modelCodeBean.setIntroDate(introDate);
	}


	@Column(name="manufacturer_code", nullable=false, length=2, columnDefinition="CHAR")
	public String getManufacturerCode() {
		return this.modelCodeBean.getManufacturerCode();
	}

	public void setManufacturerCode(String manufacturerCode) {
		this.modelCodeBean.setManufacturerCode(manufacturerCode);
	}


	@Column(name="model_type_code", nullable=false, columnDefinition="CHAR", length=1)
	public String getModelTypeCode() {
		return this.modelCodeBean.getModelTypeCode();
	}

	public void setModelTypeCode(String modelTypeCode) {
		this.modelCodeBean.setModelTypeCode(modelTypeCode);
	}


	@Column(name="modified_by", length=20)
	public String getModifiedBy() {
		return this.modelCodeBean.getModifiedBy();
	}

	public void setModifiedBy(String modifiedBy) {
		this.modelCodeBean.setModifiedBy(modifiedBy);
	}


	@Column(name="modified_when", nullable=false, columnDefinition="DATETIME")
	public Date getModifiedWhen() {
		return this.modelCodeBean.getModifiedWhen();
	}

	public void setModifiedWhen(Date modifiedWhen) {
		this.modelCodeBean.setModifiedWhen(modifiedWhen);
	}


	@Column(name="range_code", nullable=false, length=2, columnDefinition="CHAR")
	public String getRangeCode() {
		return this.modelCodeBean.getRangeCode();
	}

	public void setRangeCode(String rangeCode) {
		this.modelCodeBean.setRangeCode(rangeCode);
	}


	@Column(name="term_date")
	public Integer getTermDate() {
		return this.modelCodeBean.getTermDate();
	}

	public void setTermDate(Integer termDate) {
		this.modelCodeBean.setTermDate(termDate);
	}


	@Column(name="transmission_code", insertable=false, updatable=false, nullable=false, length=3, columnDefinition="CHAR")
	public String getTransmissionCode() {
		return this.modelCodeBean.getTransmissionCode();
	}

	public void setTransmissionCode(String transmissionCode) {
		this.modelCodeBean.setTransmissionCode(transmissionCode);
	}


	@Column(name="trim_code", nullable=false, length=2, columnDefinition="CHAR")
	public String getTrimCode() {
		return this.modelCodeBean.getTrimCode();
	}

	public void setTrimCode(String trimCode) {
		this.modelCodeBean.setTrimCode(trimCode);
	}

	@OneToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="transmission_code", referencedColumnName="trans_code")
	public TransmissionCodeEntity getTransmissionCodeEntity() {
		return transmissionCodeEntity;
	}

	public void setTransmissionCodeEntity(TransmissionCodeEntity transmissionCodeEntity) {
		this.transmissionCodeEntity = transmissionCodeEntity;
	}
}