package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * The primary key class for the vrm_organisation_link_agent database table.
 * 
 */
@Embeddable
public class VrmOrganisationLinkAgentEntityPK implements Serializable {

	private static final long serialVersionUID = -3144741739530858017L;
	//default serial version id, required for serializable classes.
	
	private String agentNumber;
	private Integer organisationId;
	
	private List<VrmHandbackDetailsHistoryEntity> historyEntity;

    public VrmOrganisationLinkAgentEntityPK() {
    }

	@Column(name="agent_number", unique=true, nullable=false, length=5, columnDefinition="CHAR")
	public String getAgentNumber() {
		return this.agentNumber;
	}
	public void setAgentNumber(String agentNumber) {
		this.agentNumber = agentNumber;
	}

	@Column(name="organisation_id", unique=true, nullable=false)
	public Integer getOrganisationId() {
		return this.organisationId;
	}
	public void setOrganisationId(Integer organisationId) {
		this.organisationId = organisationId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VrmOrganisationLinkAgentEntityPK)) {
			return false;
		}
		VrmOrganisationLinkAgentEntityPK castOther = (VrmOrganisationLinkAgentEntityPK)other;
		return 
			this.agentNumber.equals(castOther.agentNumber)
			&& (this.organisationId == castOther.organisationId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.agentNumber.hashCode();
		hash = hash * prime + this.organisationId;
		
		return hash;
    }

	@OneToMany
	@JoinColumn(name="handback_dealer_id", referencedColumnName="organisation_id")
	public List<VrmHandbackDetailsHistoryEntity> getHistoryEntity() {
		return historyEntity;
	}

	public void setHistoryEntity(List<VrmHandbackDetailsHistoryEntity> historyEntity) {
		this.historyEntity = historyEntity;
	}

}