package uk.co.mo.app.mercury.domain.serviceagent.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

import uk.co.mo.app.mercury.domain.serviceagent.beans.AgentBandRatingBean;

@Entity
@Table(name="agent_band_rating")
public class AgentBandRatingEntity implements Serializable {

	private static final long serialVersionUID = 4451997504192353582L;

	private AgentBandRatingBean bean = new AgentBandRatingBean();

    private AgentBandRatingPKEntity id;
    private ServiceAgentEntity serviceAgent;


	@Transient
    public AgentBandRatingBean getBean() {
		return bean;
	}
	public void setBean(AgentBandRatingBean bean) {
		this.bean = bean;
	}

	public AgentBandRatingEntity() {	}


    @EmbeddedId
	public AgentBandRatingPKEntity getId() {
		return this.id;
	}
	public void setId(AgentBandRatingPKEntity id) {
		this.id = id;
	}


	@Column(name="labour_rate", nullable=false, precision=7, scale=2)
	public BigDecimal getLabourRate() {
		return this.bean.getLabourRate();
	}
	public void setLabourRate(BigDecimal labourRate) {
		this.bean.setLabourRate( labourRate );
	}
	@Column(name="parts_discount", nullable=false, precision=7, scale=2)
	public BigDecimal getPartsDiscount() {
		return this.bean.getPartsDiscount();
	}
	public void setPartsDiscount(BigDecimal partsDiscount) {
		this.bean.setPartsDiscount( partsDiscount );
	}
	@Column(name="send_to_translease", nullable=false, length=1, columnDefinition="CHAR 1 ")
	public String getSendToTranslease() {
		return this.bean.getSendToTranslease();
	}
	public void setSendToTranslease(String sendToTranslease) {
		this.bean.setSendToTranslease( sendToTranslease );
	}
	@Column(name="translease_leaseco_ref", nullable=false)
	public Integer getTransleaseLeasecoRef() {
		return this.bean.getTransleaseLeasecoRef();
	}
	public void setTransleaseLeasecoRef(Integer transleaseLeasecoRef) {
		this.bean.setTransleaseLeasecoRef( transleaseLeasecoRef );
	}
	@Column(name="transmission_action", nullable=false, length=1, columnDefinition="char 1")
	public String getTransmissionAction() {
		return this.bean.getTransmissionAction();
	}
	public void setTransmissionAction(String transmissionAction) {
		this.bean.setTransmissionAction( transmissionAction );
	}

    	//bi-directional many-to-one association to ServiceAgent
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="agent_number", referencedColumnName="leaseco_repairer_ref", nullable=false, insertable=false, updatable=false)
	public ServiceAgentEntity getServiceAgent() {
		return this.serviceAgent;
	}
	public void setServiceAgent(ServiceAgentEntity serviceAgent) {
		this.serviceAgent = serviceAgent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bean == null) ? 0 : bean.hashCode());
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
		AgentBandRatingEntity other = (AgentBandRatingEntity) obj;
		if (bean == null) {
			if (other.bean != null)
				return false;
		} else if (!bean.equals(other.bean))
			return false;
		return true;
	}
}
