package uk.co.mo.app.mercury.domain.org.dealer.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class DealerPersonnelDealerLinkBean implements Serializable {

	private static final long serialVersionUID = -6722895304006997616L;
	private Boolean active;
	private Integer dealerPersonnelId;
	private String agentNumber;
	
	@XmlElement(required=true)
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	@XmlElement(required=true)
	public Integer getDealerPersonnelId() {
		return dealerPersonnelId;
	}
	public void setDealerPersonnelId(Integer dealerPersonnelId) {
		this.dealerPersonnelId = dealerPersonnelId;
	}
	@XmlElement(required=true)
	public String getAgentNumber() {
		return agentNumber;
	}
	public void setAgentNumber(String agentNumber) {
		this.agentNumber = agentNumber;
	}
}
