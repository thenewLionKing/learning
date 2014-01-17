package uk.co.mo.app.mercury.domain.agreement.beans;

import java.io.Serializable;

public class AgreementDealerBean implements Serializable{

	private static final long serialVersionUID = -1110173560990718435L;

	private String agentNumber;
	private Integer moveReason;
	private Boolean stopLetter;
	private Integer dealerTypeId;
	private Integer agreementId;

	public AgreementDealerBean() {
	}

	public String getAgentNumber() {
		return agentNumber;
	}

	public void setAgentNumber(String agentNumber) {
		this.agentNumber = agentNumber;
	}

	public Integer getMoveReason() {
		return moveReason;
	}

	public void setMoveReason(Integer moveReason) {
		this.moveReason = moveReason;
	}

	public Boolean isStopLetter() {
		return stopLetter;
	}

	public void setStopLetter(Boolean stopLetter) {
		this.stopLetter = stopLetter;
	}



	public void setDealerTypeId(Integer dealerTypeId) {
		this.dealerTypeId = dealerTypeId;
	}



	public Integer getDealerTypeId() {
		return dealerTypeId;
	}



	public void setAgreementId(Integer agreementId) {
		this.agreementId = agreementId;
	}



	public Integer getAgreementId() {
		return agreementId;
	}
}