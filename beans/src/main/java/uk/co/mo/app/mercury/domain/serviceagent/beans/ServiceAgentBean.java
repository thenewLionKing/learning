package uk.co.mo.app.mercury.domain.serviceagent.beans;

import java.io.Serializable;
import java.util.List;

public class ServiceAgentBean implements Serializable {

	private static final long serialVersionUID = -3302273416405833903L;
	private Integer transleaseRepairerNumber;
	private Integer transleaseLeasecoRef;
	private String leasecoRepairerRef;
	private String transmissionAction;
    private String comments;
    private String fleetComment;

	private AgentBandRatingBean agentBandRatingBean;
	private List<TlSpecialPartBean> tlSpecialPartBeans;

	public Integer getTransleaseRepairerNumber() {
		return transleaseRepairerNumber;
	}
	public void setTransleaseRepairerNumber(Integer transleaseRepairerNumber) {
		this.transleaseRepairerNumber = transleaseRepairerNumber;
	}
	public Integer getTransleaseLeasecoRef() {
		return transleaseLeasecoRef;
	}
	public void setTransleaseLeasecoRef(Integer transleaseLeasecoRef) {
		this.transleaseLeasecoRef = transleaseLeasecoRef;
	}
	public String getLeasecoRepairerRef() {
		return leasecoRepairerRef;
	}
	public void setLeasecoRepairerRef(String leasecoRepairerRef) {
		this.leasecoRepairerRef = leasecoRepairerRef;
	}
	public String getTransmissionAction() {
		return transmissionAction;
	}
	public void setTransmissionAction(String transmissionAction) {
		this.transmissionAction = transmissionAction;
	}

	public AgentBandRatingBean getAgentBandRatingBean() {
		return agentBandRatingBean;
	}
	public void setAgentBandRatingBean(AgentBandRatingBean agentBandRatingBean) {
		this.agentBandRatingBean = agentBandRatingBean;
	}
	public List<TlSpecialPartBean> getTlSpecialPartBeans() {
		return tlSpecialPartBeans;
	}
	public void setTlSpecialPartBeans(List<TlSpecialPartBean> tlSpecialPartBeans) {
		this.tlSpecialPartBeans = tlSpecialPartBeans;
	}

    public String getFleetComment() {
        return fleetComment;
    }

    public void setFleetComment(String fleetComment) {
        this.fleetComment = fleetComment;
    }
	
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
	@Override
	public String toString() {
		return "ServiceAgentBean [transleaseRepairerNumber="
				+ transleaseRepairerNumber + ", transleaseLeasecoRef="
				+ transleaseLeasecoRef + ", leasecoRepairerRef="
				+ leasecoRepairerRef + ", transmissionAction="
				+ transmissionAction + ", comments=" + comments
				+ ", fleetComment=" + fleetComment + ", agentBandRatingBean="
				+ agentBandRatingBean + ", tlSpecialPartBeans="
				+ tlSpecialPartBeans + "]";
	}
}
