package uk.co.mo.app.mercury.domain.agreement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

import uk.co.mo.app.mercury.domain.agreement.beans.AgreementDealerBean;


/**
 * The persistent class for the agreement_dealer entitybase table.
 * 
 */
@Entity
@Table(name="agreement_dealer")
@RooEntity
@RooToString
public class AgreementDealerEntity implements Serializable {

	private static final long serialVersionUID = 4419903139985438953L;

	private AgreementDealerBean agreementDealerBean = new AgreementDealerBean();
	private AgreementDealerEntityPK id;
	
	public AgreementDealerEntity() {
	}

	@Transient
	public AgreementDealerBean getAgreementDealerBean() {
		return agreementDealerBean;
	}

	public void setAgreementDealerBean(AgreementDealerBean agreementDealerBean) {
		this.agreementDealerBean = agreementDealerBean;
	}

	@EmbeddedId
	public AgreementDealerEntityPK getId() {
		return id;
	}

	public void setId(AgreementDealerEntityPK id) {
		this.id= id;
	}
	
	@Column(name="agent_number", columnDefinition="CHAR 5")
	public String getAgentNumber() {
		return this.agreementDealerBean.getAgentNumber();
	}

	public void setAgentNumber(String agentNumber) {
		this.agreementDealerBean.setAgentNumber(agentNumber);
	}

	@Column(name="move_reason")
	public Integer getMoveReason() {
		return this.agreementDealerBean.getMoveReason();
	}

	public void setMoveReason(Integer moveReason) {
		this.agreementDealerBean.setMoveReason(moveReason);
	}

	@Column(name="stop_letter", columnDefinition="bit")
	public Boolean getStopLetter() {
		return this.agreementDealerBean.isStopLetter();
	}

	public void setStopLetter(Boolean stopLetter) {
		this.agreementDealerBean.setStopLetter(stopLetter);
	}

	

}