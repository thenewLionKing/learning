package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import javax.persistence.*;

import uk.co.mo.app.mercury.domain.vehicle.beans.ManufacturerCodeBean;

import java.util.Date;


/**
 * The persistent class for the manufacturer_code database table.
 * 
 */
@Entity
@Table(name="manufacturer_code")
public class ManufacturerCodeEntity implements Serializable {
	
	private static final long serialVersionUID = 401568796990260225L;
	private ManufacturerCodeBean manufacturerCodeBean = new ManufacturerCodeBean();

	
	@Transient
	public ManufacturerCodeBean getManufacturerCodeBean() {
		return manufacturerCodeBean;
	}


	public void setManufacturerCodeBean(ManufacturerCodeBean manufacturerCodeBean) {
		this.manufacturerCodeBean = manufacturerCodeBean;
	}


	public ManufacturerCodeEntity() {
    }


	@Id
	@Column(name="manufacturer_code", unique=true, nullable=false, length=2, columnDefinition="CHAR")
	public String getManufacturerCode() {
		return this.manufacturerCodeBean.getManufacturerCode();
	}

	public void setManufacturerCode(String manufacturerCode) {
		this.manufacturerCodeBean.setManufacturerCode(manufacturerCode);
	}


	@Column(name="drive_in_out", length=1, columnDefinition="CHAR")
	public String getDriveInOut() {
		return this.manufacturerCodeBean.getDriveInOut();
	}

	public void setDriveInOut(String driveInOut) {
		this.manufacturerCodeBean.setDriveInOut(driveInOut);
	}


	@Column(name="manufacturer_desc", nullable=false, length=50)
	public String getManufacturerDesc() {
		return this.manufacturerCodeBean.getManufacturerDesc();
	}

	public void setManufacturerDesc(String manufacturerDesc) {
		this.manufacturerCodeBean.setManufacturerDesc(manufacturerDesc);
	}


	@Column(name="modified_by", length=20)
	public String getModifiedBy() {
		return this.manufacturerCodeBean.getModifiedBy();
	}

	public void setModifiedBy(String modifiedBy) {
		this.manufacturerCodeBean.setModifiedBy(modifiedBy);
	}


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="modified_when", nullable=false)
	public Date getModifiedWhen() {
		return this.manufacturerCodeBean.getModifiedWhen();
	}

	public void setModifiedWhen(Date modifiedWhen) {
		this.manufacturerCodeBean.setModifiedWhen(modifiedWhen);
	}


	@Column(name="road_test", length=1, columnDefinition="CHAR")
	public String getRoadTest() {
		return this.manufacturerCodeBean.getRoadTest();
	}

	public void setRoadTest(String roadTest) {
		this.manufacturerCodeBean.setRoadTest(roadTest);
	}

}