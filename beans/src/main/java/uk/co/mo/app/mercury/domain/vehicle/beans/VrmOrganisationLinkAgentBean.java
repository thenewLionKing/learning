package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;

public class VrmOrganisationLinkAgentBean implements Serializable{

	private static final long serialVersionUID = 1703332506328446145L;
	
	private String agentNumber;
	private Integer organisationId;

	public String getAgentNumber() {
		return agentNumber;
	}
	public void setAgentNumber(String agentNumber) {
		this.agentNumber = agentNumber;
	}
	public Integer getOrganisationId() {
		return organisationId;
	}
	public void setOrganisationId(Integer organisationId) {
		this.organisationId = organisationId;
	}
	
	@Override
	public String toString() {
		return "VrmOrganisationLinkAgentBean [agentNumber=" + agentNumber
				+ ", organisationId=" + organisationId + "]";
	}
}
