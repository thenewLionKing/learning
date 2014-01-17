package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import javax.persistence.*;

import uk.co.mo.app.mercury.domain.vehicle.beans.VrmOrganisationLinkAgentBean;


/**
 * The persistent class for the vrm_organisation_link_agent database table.
 * 
 */
@Entity
@Table(name="vrm_organisation_link_agent")
public class VrmOrganisationLinkAgentEntity implements Serializable {

	private static final long serialVersionUID = 5227871303907600817L;
	private VrmOrganisationLinkAgentBean vrmOrganisationLinkAgentBean = new VrmOrganisationLinkAgentBean();
	
    public VrmOrganisationLinkAgentEntity() {
    }

    @Transient
	public VrmOrganisationLinkAgentBean getVrmOrganisationLinkAgentBean() {
		return this.vrmOrganisationLinkAgentBean;
	}

	public void setVrmOrganisationLinkAgentBean(VrmOrganisationLinkAgentBean vrmOrganisationLinkAgentBean) {
		this.vrmOrganisationLinkAgentBean = vrmOrganisationLinkAgentBean;
	}

	@Id
	@Column(name="organisation_id")
	public Integer getOrganisationId() {
		return this.vrmOrganisationLinkAgentBean.getOrganisationId();
	}
	public void setOrganisationId(Integer organisationId) {
		this.vrmOrganisationLinkAgentBean.setOrganisationId(organisationId);
	}
    
	@Column(name="agent_number", length=5, columnDefinition="CHAR")
	public String getAgentNumber() {
		return this.vrmOrganisationLinkAgentBean.getAgentNumber();
	}
	
	public void setAgentNumber(String agentNumber) {
		this.vrmOrganisationLinkAgentBean.setAgentNumber(agentNumber);
	}
}