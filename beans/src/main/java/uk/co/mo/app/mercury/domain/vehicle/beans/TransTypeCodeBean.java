package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.util.Date;

public class TransTypeCodeBean implements Serializable{

	private static final long serialVersionUID = -2381530160314443311L;
	
	private String transTypeCode;
	private String modifiedBy;
	private Date modifiedWhen;
	private String transTypeDesc;

	public TransTypeCodeBean() {
	}

	public String getTransTypeCode() {
		return transTypeCode;
	}

	public void setTransTypeCode(String transTypeCode) {
		this.transTypeCode = transTypeCode;
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

	public String getTransTypeDesc() {
		return transTypeDesc;
	}

	public void setTransTypeDesc(String transTypeDesc) {
		this.transTypeDesc = transTypeDesc;
	}
}