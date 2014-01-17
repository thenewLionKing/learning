package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
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

import uk.co.mo.app.mercury.domain.vehicle.beans.TransmissionCodeBean;


/**
 * The persistent class for the transmission_code database table.
 * 
 */
@Entity
@Table(name="transmission_code")
public class TransmissionCodeEntity implements Serializable {

	private static final long serialVersionUID = -1967946211225287147L;

	private TransmissionCodeBean transmissionCodeBean = new TransmissionCodeBean();
	private TransTypeCodeEntity transTypeCodeEntity;

	public TransmissionCodeEntity() {
    }
	
	@Transient
	public TransmissionCodeBean getTransmissionCodeBean() {
		return transmissionCodeBean;
	}

	public void setTransmissionCodeBean(TransmissionCodeBean transmissionCodeBean) {
		this.transmissionCodeBean = transmissionCodeBean;
	}


	@Id
	@Column(name="trans_code", unique=true, nullable=false, length=3, columnDefinition="CHAR")
	public String getTransCode() {
		return this.transmissionCodeBean.getTransCode();
	}

	public void setTransCode(String transCode) {
		this.transmissionCodeBean.setTransCode(transCode);
	}


	@Column(name="trans_drive_code", nullable=false, length=1, columnDefinition="CHAR")
	public String getTransDriveCode() {
		return this.transmissionCodeBean.getTransDriveCode();
	}

	public void setTransDriveCode(String transDriveCode) {
		this.transmissionCodeBean.setTransDriveCode(transDriveCode);
	}


	@Column(name="trans_modified_by", length=20)
	public String getTransModifiedBy() {
		return this.transmissionCodeBean.getTransModifiedBy();
	}

	public void setTransModifiedBy(String transModifiedBy) {
		this.transmissionCodeBean.setTransModifiedBy(transModifiedBy);
	}


	@Column(name="trans_modified_when", nullable=false, columnDefinition="DATETIME")
	public Date getTransModifiedWhen() {
		return this.transmissionCodeBean.getTransModifiedWhen();
	}

	public void setTransModifiedWhen(Date transModifiedWhen) {
		this.transmissionCodeBean.setTransModifiedWhen(transModifiedWhen);
	}


	@Column(name="trans_speed_code", nullable=false, length=1, columnDefinition="CHAR")
	public String getTransSpeedCode() {
		return this.transmissionCodeBean.getTransSpeedCode();
	}

	public void setTransSpeedCode(String transSpeedCode) {
		this.transmissionCodeBean.setTransSpeedCode(transSpeedCode);
	}


	@Column(name="trans_type_code", insertable=false, updatable=false, nullable=false, length=1, columnDefinition="CHAR")
	public String getTransTypeCode() {
		return this.transmissionCodeBean.getTransTypeCode();
	}

	public void setTransTypeCode(String transTypeCode) {
		this.transmissionCodeBean.setTransTypeCode(transTypeCode);
	}

	@OneToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="trans_type_code", referencedColumnName="trans_type_code")
	public TransTypeCodeEntity getTransTypeCodeEntity() {
		return transTypeCodeEntity;
	}

	public void setTransTypeCodeEntity(TransTypeCodeEntity transTypeCodeEntity) {
		this.transTypeCodeEntity = transTypeCodeEntity;
	}
}