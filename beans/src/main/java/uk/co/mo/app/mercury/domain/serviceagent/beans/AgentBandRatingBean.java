package uk.co.mo.app.mercury.domain.serviceagent.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class AgentBandRatingBean implements Serializable {

	private static final long serialVersionUID = -5883975635629555177L;

	private Integer transleaseRepairerNumber;
	private String agentNumber;
	private Short bandRating;
	private String ruleSet;

	private BigDecimal labourRate;
	private BigDecimal partsDiscount;
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
	public Short getBandRating() {
		return bandRating;
	}
	public void setBandRating(Short bandRating) {
		this.bandRating = bandRating;
	}
	public String getRuleSet() {
		return ruleSet;
	}
	public void setRuleSet(String ruleSet) {
		this.ruleSet = ruleSet;
	}
	public BigDecimal getLabourRate() {
		return labourRate;
	}
	public void setLabourRate(BigDecimal labourRate) {
		this.labourRate = labourRate;
	}
	public BigDecimal getPartsDiscount() {
		return partsDiscount;
	}
	public void setPartsDiscount(BigDecimal partsDiscount) {
		this.partsDiscount = partsDiscount;
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
