package uk.co.mo.app.mercury.domain.serviceagent.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.serviceagent.beans.ServiceAgentBean;

@Entity
@Table(name="service_agent")
public class ServiceAgentEntity implements Serializable {

	private static final long serialVersionUID = -45763244578152733L;

	private List<AgentBandRatingEntity> agentBandRating;
	private List<TlSpecialPartEntity> tlSpecialParts;

	private ServiceAgentBean bean = new ServiceAgentBean();

    @Transient
	public ServiceAgentBean getBean() {
		return bean;
	}
	public void setBean(ServiceAgentBean bean) {
		this.bean = bean;
	}

	public ServiceAgentEntity() {	}

	@Id
	@Column(name="translease_repairer_number", unique=true, nullable=false)
	public Integer getTransleaseRepairerNumber() {
		return this.bean.getTransleaseRepairerNumber();
	}
	public void setTransleaseRepairerNumber(Integer transleaseRepairerNumber) {
		this.bean.setTransleaseRepairerNumber( transleaseRepairerNumber );
	}
	@Column(name="translease_leaseco_ref", unique=true, nullable=false)
	public Integer getTransleaseLeasecoRef() {
		return this.bean.getTransleaseLeasecoRef();
	}
	public void setTransleaseLeasecoRef(Integer transleaseLeasecoRef) {
		this.bean.setTransleaseLeasecoRef( transleaseLeasecoRef );
	}
	@Column(name="leaseco_repairer_ref", unique=true, nullable=false, columnDefinition = "CHAR 5 NOT NULL")
	public String getLeasecoRepairerRef() {
		return this.bean.getLeasecoRepairerRef();
	}
	public void setLeasecoRepairerRef(String leasecoRepairerRef) {
		this.bean.setLeasecoRepairerRef( leasecoRepairerRef );
	}
	@Column(name="transmission_action", nullable=false, length=1, columnDefinition = "CHAR 1 NOT NULL")
	public String getTransmissionAction() {
		return this.bean.getTransmissionAction();
	}
	public void setTransmissionAction(String transmissionAction) {
		this.bean.setTransmissionAction( transmissionAction );
	}
	@Column(name="comments", nullable=true, columnDefinition = "TEXT")
	public String getComments() {
		return this.bean.getComments();
	}
	public void setComments(String comments) {
		this.bean.setComments( comments );
	}

	@OneToMany(mappedBy="serviceAgent", cascade = {CascadeType.ALL})
    @JoinColumn(name="translease_repairer_number", referencedColumnName="translease_repairer_number", nullable = false)
    public List<AgentBandRatingEntity> getAgentBandRating() {
		return this.agentBandRating;
	}
	public void setAgentBandRating(List<AgentBandRatingEntity> agentBandRating) {
		this.agentBandRating = agentBandRating;
	}

	@OneToMany(mappedBy="serviceAgent", cascade = {CascadeType.ALL})
    @JoinColumn(name="translease_repairer_number", referencedColumnName="translease_repairer_number", nullable = false)
	public List<TlSpecialPartEntity> getTlSpecialParts() {
		return this.tlSpecialParts;
	}
	public void setTlSpecialParts(List<TlSpecialPartEntity> tlSpecialParts) {
		this.tlSpecialParts = tlSpecialParts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((agentBandRating == null) ? 0 : agentBandRating.hashCode());
		result = prime * result + ((bean == null) ? 0 : bean.hashCode());
		result = prime * result
				+ ((tlSpecialParts == null) ? 0 : tlSpecialParts.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServiceAgentEntity other = (ServiceAgentEntity) obj;
		if (agentBandRating == null) {
			if (other.agentBandRating != null)
				return false;
		} else if (!agentBandRating.equals(other.agentBandRating))
			return false;
		if (bean == null) {
			if (other.bean != null)
				return false;
		} else if (!bean.equals(other.bean))
			return false;
		if (tlSpecialParts == null) {
			if (other.tlSpecialParts != null)
				return false;
		} else if (!tlSpecialParts.equals(other.tlSpecialParts))
			return false;
		return true;
	}
}
