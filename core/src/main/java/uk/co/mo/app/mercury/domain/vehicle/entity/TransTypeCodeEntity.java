package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.TransTypeCodeBean;


/**
 * The persistent class for the trans_type_code database table.
 * 
 */
@Entity
@Table(name="trans_type_code")
public class TransTypeCodeEntity implements Serializable {

	private static final long serialVersionUID = 732347083094868408L;

	private TransTypeCodeBean transTypeCodeBean = new TransTypeCodeBean();

	public TransTypeCodeEntity() {
    }

	@Transient
	public TransTypeCodeBean getTransTypeCodeBean() {
		return transTypeCodeBean;
	}


	public void setTransTypeCodeBean(TransTypeCodeBean transTypeCodeBean) {
		this.transTypeCodeBean = transTypeCodeBean;
	}


	@Id
	@Column(name="trans_type_code", unique=true, nullable=false, length=1, columnDefinition="CHAR")
	public String getTransTypeCode() {
		return this.transTypeCodeBean.getTransTypeCode();
	}

	public void setTransTypeCode(String transTypeCode) {
		this.transTypeCodeBean.setTransTypeCode(transTypeCode);
	}


	@Column(name="modified_by", length=20)
	public String getModifiedBy() {
		return this.transTypeCodeBean.getModifiedBy();
	}

	public void setModifiedBy(String modifiedBy) {
		this.transTypeCodeBean.setModifiedBy(modifiedBy);
	}


	@Column(name="modified_when", nullable=false, columnDefinition="DATETIME")
	public Date getModifiedWhen() {
		return this.transTypeCodeBean.getModifiedWhen();
	}

	public void setModifiedWhen(Date modifiedWhen) {
		this.transTypeCodeBean.setModifiedWhen(modifiedWhen);
	}


	@Column(name="trans_type_desc", nullable=false, length=50)
	public String getTransTypeDesc() {
		return this.transTypeCodeBean.getTransTypeDesc();
	}

	public void setTransTypeDesc(String transTypeDesc) {
		this.transTypeCodeBean.setTransTypeDesc(transTypeDesc);
	}

}