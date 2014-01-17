package uk.co.mo.app.mercury.domain.serviceagent.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class TlSpecialPartBean implements Serializable {

	private static final long serialVersionUID = -2843521183523080969L;

	private Integer transleaseRepairerNumber;
	private String agentNumber;
	private String specialPartCode;
	private String ruleSet;

	private String appliedLevel;
	private BigDecimal rateApplicable;
	private String sendToTranslease;
	private Integer transleaseLeasecoRef;
	private String transmissionAction;

	public Integer getTransleaseRepairerNumber() {
		return transleaseRepairerNumber;
	}
	public void setTransleaseRepairerNumber(Integer transleaseRepairerNumber) {
		this.transleaseRepairerNumber = transleaseRepairerNumber;
	}
	public String getAgentNumber() {
		return agentNumber;
	}
	public void setAgentNumber(String agentNumber) {
		this.agentNumber = agentNumber;
	}
	public String getSpecialPartCode() {
		return specialPartCode;
	}
	public void setSpecialPartCode(String specialPartCode) {
		this.specialPartCode = specialPartCode;
	}
	public String getRuleSet() {
		return ruleSet;
	}
	public void setRuleSet(String ruleSet) {
		this.ruleSet = ruleSet;
	}
	public String getAppliedLevel() {
		return appliedLevel;
	}
	public void setAppliedLevel(String appliedLevel) {
		this.appliedLevel = appliedLevel;
	}
	public BigDecimal getRateApplicable() {
		return rateApplicable;
	}
	public void setRateApplicable(BigDecimal rateApplicable) {
		this.rateApplicable = rateApplicable;
	}
	public String getSendToTranslease() {
		return sendToTranslease;
	}
	public void setSendToTranslease(String sendToTranslease) {
		this.sendToTranslease = sendToTranslease;
	}
	public Integer getTransleaseLeasecoRef() {
		return transleaseLeasecoRef;
	}
	public void setTransleaseLeasecoRef(Integer transleaseLeasecoRef) {
		this.transleaseLeasecoRef = transleaseLeasecoRef;
	}
	public String getTransmissionAction() {
		return transmissionAction;
	}
	public void setTransmissionAction(String transmissionAction) {
		this.transmissionAction = transmissionAction;
	}
}
