package uk.co.mo.app.mercury.domain.serviceagent.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.serviceagent.beans.TlSpecialPartBean;

@Entity
@Table(name="tl_special_parts")
public class TlSpecialPartEntity implements Serializable {

	private static final long serialVersionUID = 4555424094838808527L;

	private TlSpecialPartPKEntity id;
	private ServiceAgentEntity serviceAgent;

	private TlSpecialPartBean tlSpecialPartBean = new TlSpecialPartBean();

	@Transient
	public TlSpecialPartBean getTlSpecialPartBean() {
		return tlSpecialPartBean;
	}
	public void setTlSpecialPartBean(TlSpecialPartBean tlSpecialPartBean) {
		this.tlSpecialPartBean = tlSpecialPartBean;
	}

	public TlSpecialPartEntity() {
    }

	@EmbeddedId
	public TlSpecialPartPKEntity getId() {
		return this.id;
	}
	public void setId(TlSpecialPartPKEntity id) {
		this.id = id;
	}
	@Column(name="applied_level", nullable=false, length=1, columnDefinition = "CHAR 1 NOT NULL")
	public String getAppliedLevel() {
		return this.tlSpecialPartBean.getAppliedLevel();
	}
	public void setAppliedLevel(String appliedLevel) {
		this.tlSpecialPartBean.setAppliedLevel( appliedLevel );
	}
	@Column(name="rate_applicable", nullable=false, precision=6, scale=2)
	public BigDecimal getRateApplicable() {
		return this.tlSpecialPartBean.getRateApplicable();
	}
	public void setRateApplicable(BigDecimal rateApplicable) {
		this.tlSpecialPartBean.setRateApplicable( rateApplicable );
	}
	@Column(name="send_to_translease", nullable=false, length=1, columnDefinition = "CHAR 1 NOT NULL")
	public String getSendToTranslease() {
		return this.tlSpecialPartBean.getSendToTranslease();
	}
	public void setSendToTranslease(String sendToTranslease) {
		this.tlSpecialPartBean.setSendToTranslease( sendToTranslease );
	}
	@Column(name="translease_leaseco_ref", nullable=false)
	public Integer getTransleaseLeasecoRef() {
		return this.tlSpecialPartBean.getTransleaseLeasecoRef();
	}
	public void setTransleaseLeasecoRef(Integer transleaseLeasecoRef) {
		this.tlSpecialPartBean.setTransleaseLeasecoRef( transleaseLeasecoRef );
	}
	@Column(name="transmission_action", nullable=false, length=1, columnDefinition = "CHAR 1 NOT NULL")
	public String getTransmissionAction() {
		return this.tlSpecialPartBean.getTransmissionAction();
	}
	public void setTransmissionAction(String transmissionAction) {
		this.tlSpecialPartBean.setTransmissionAction( transmissionAction );
	}
	//bi-directional many-to-one association to ServiceAgent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="agent_number", referencedColumnName="leaseco_repairer_ref", nullable=false, insertable=false, updatable=false)
	public ServiceAgentEntity getServiceAgent() {
		return this.serviceAgent;
	}
	public void setServiceAgent(ServiceAgentEntity serviceAgent) {
		this.serviceAgent = serviceAgent;
	}
}
