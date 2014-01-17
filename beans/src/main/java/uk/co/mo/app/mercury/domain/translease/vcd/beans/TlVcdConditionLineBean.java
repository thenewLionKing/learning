package uk.co.mo.app.mercury.domain.translease.vcd.beans;

import java.io.Serializable;

public class TlVcdConditionLineBean implements Serializable {

	private static final long serialVersionUID = -5613722636587275572L;

	private Integer transleaseTransactionNumber;
	private String attributeCode;
	private String attributeValue;
	private String mobilityAidDamageValue;

	public Integer getTransleaseTransactionNumber() {
		return transleaseTransactionNumber;
	}
	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.transleaseTransactionNumber = transleaseTransactionNumber;
	}
	public String getAttributeCode() {
		return attributeCode;
	}
	public void setAttributeCode(String attributeCode) {
		this.attributeCode = attributeCode;
	}
	public String getAttributeValue() {
		return attributeValue;
	}
	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
	public String getMobilityAidDamageValue() {
		return mobilityAidDamageValue;
	}
	public void setMobilityAidDamageValue(String mobilityAidDamageValue) {
		this.mobilityAidDamageValue = mobilityAidDamageValue;
	}
}
