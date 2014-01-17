package uk.co.mo.app.mercury.domain.org.dealer.beans;

import java.io.Serializable;

public class DealerGroupDealerLinkBean implements Serializable {

	private static final long serialVersionUID = 8104761555037428001L;
	
	private Integer groupNumber;
	private String agentNumber;
	private Boolean flag;
	
	public Integer getGroupNumber() {
		return groupNumber;
	}
	public void setGroupNumber(Integer groupNumber) {
		this.groupNumber = groupNumber;
	}
	public String getAgentNumber() {
		return agentNumber;
	}
	public void setAgentNumber(String agentNumber) {
		this.agentNumber = agentNumber;
	}
	public Boolean getFlag() {
		return flag;
	}
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

}
