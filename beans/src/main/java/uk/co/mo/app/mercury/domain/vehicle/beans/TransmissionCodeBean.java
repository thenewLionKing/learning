package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.util.Date;



public class TransmissionCodeBean implements Serializable{

	private static final long serialVersionUID = -4220129433032909264L;

	private String transCode;
	private String transDriveCode;
	private String transModifiedBy;
	private Date transModifiedWhen;
	private String transSpeedCode;
	private String transTypeCode;

	private TransTypeCodeBean transTypeCodeBean;

	public TransmissionCodeBean() {
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getTransDriveCode() {
		return transDriveCode;
	}

	public void setTransDriveCode(String transDriveCode) {
		this.transDriveCode = transDriveCode;
	}

	public String getTransModifiedBy() {
		return transModifiedBy;
	}

	public void setTransModifiedBy(String transModifiedBy) {
		this.transModifiedBy = transModifiedBy;
	}

	public Date getTransModifiedWhen() {
		return transModifiedWhen;
	}

	public void setTransModifiedWhen(Date transModifiedWhen) {
		this.transModifiedWhen = transModifiedWhen;
	}

	public String getTransSpeedCode() {
		return transSpeedCode;
	}

	public void setTransSpeedCode(String transSpeedCode) {
		this.transSpeedCode = transSpeedCode;
	}

	public String getTransTypeCode() {
		return transTypeCode;
	}

	public void setTransTypeCode(String transTypeCode) {
		this.transTypeCode = transTypeCode;
	}

	public TransTypeCodeBean getTransTypeCodeBean(){
		return this.transTypeCodeBean;
	}
	
	public void setTransTypeCodeBean(TransTypeCodeBean transTypeCodeBean) {
		this.transTypeCodeBean = transTypeCodeBean;
	}
}