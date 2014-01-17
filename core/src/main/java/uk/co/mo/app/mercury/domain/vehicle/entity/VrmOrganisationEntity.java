package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.VrmOrganisationBean;


/**
 * The persistent class for the vrm_organisation database table.
 * 
 */
@Entity
@Table(name="vrm_organisation")
public class VrmOrganisationEntity implements Serializable {

	private static final long serialVersionUID = 7302593927416673215L;

	private VrmOrganisationBean vrmOrganisationBean = new VrmOrganisationBean();
	private VrmOrganisationLinkAgentEntity vrmOrganisationLinkAgents;
	private List<VrmSoldEntity> vrmSolds;

    public VrmOrganisationEntity() {
    }

	@Transient
    public VrmOrganisationBean getVrmOrganisationBean() {
		return vrmOrganisationBean;
	}

	public void setVrmOrganisationBean(VrmOrganisationBean vrmOrganisationBean) {
		this.vrmOrganisationBean = vrmOrganisationBean;
	}
	
	@Id
	@Column(name="organisation_id", unique=true, nullable=false)
	public Integer getOrganisationId() {
		return this.vrmOrganisationBean.getOrganisationId();
	}

	public void setOrganisationId(Integer organisationId) {
		this.vrmOrganisationBean.setOrganisationId(organisationId);
	}


	@Column(nullable=false, columnDefinition="CHAR",length=1)
	public String getActive() {
		return this.vrmOrganisationBean.getActive();
	}

	public void setActive(String active) {
		this.vrmOrganisationBean.setActive(active);
	}


	@Column(length=30)
	public String getAddress1() {
		return this.vrmOrganisationBean.getAddress1();
	}

	public void setAddress1(String address1) {
		this.vrmOrganisationBean.setAddress1(address1);
	}


	@Column(length=30)
	public String getAddress2() {
		return this.vrmOrganisationBean.getAddress2();
	}

	public void setAddress2(String address2) {
		this.vrmOrganisationBean.setAddress2(address2);
	}


	@Column(length=30)
	public String getAddress3() {
		return this.vrmOrganisationBean.getAddress3();
	}

	public void setAddress3(String address3) {
		this.vrmOrganisationBean.setAddress3(address3);
	}


	@Column(name="bv_buy_view", columnDefinition="CHAR", length=1)
	public String getBvBuyView() {
		return this.vrmOrganisationBean.getBvBuyView();
	}

	public void setBvBuyView(String bvBuyView) {
		this.vrmOrganisationBean.setBvBuyView(bvBuyView);
	}


	@Column(length=100)
	public String getCounty() {
		return this.vrmOrganisationBean.getCounty();
	}

	public void setCounty(String county) {
		this.vrmOrganisationBean.setCounty(county);
	}


	@Column(name="credit_limit", columnDefinition="MONEY")
	public BigDecimal getCreditLimit() {
		return this.vrmOrganisationBean.getCreditLimit();
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.vrmOrganisationBean.setCreditLimit(creditLimit);
	}


	@Column(name="credit_outstanding", columnDefinition="MONEY")
	public BigDecimal getCreditOutstanding() {
		return this.vrmOrganisationBean.getCreditOutstanding();
	}

	public void setCreditOutstanding(BigDecimal creditOutstanding) {
		this.vrmOrganisationBean.setCreditOutstanding(creditOutstanding);
	}


	@Column(length=100)
	public String getEmail() {
		return this.vrmOrganisationBean.getEmail();
	}

	public void setEmail(String email) {
		this.vrmOrganisationBean.setEmail(email);
	}


	@Column(length=30)
	public String getFax() {
		return this.vrmOrganisationBean.getFax();
	}

	public void setFax(String fax) {
		this.vrmOrganisationBean.setFax(fax);
	}


	@Column(name="grm_dealer_id")
	public Integer getGrmDealerId() {
		return this.vrmOrganisationBean.getGrmDealerId();
	}

	public void setGrmDealerId(Integer grmDealerId) {
		this.vrmOrganisationBean.setGrmDealerId(grmDealerId);
	}


	@Column(name="jsvm_company_id")
	public Integer getJsvmCompanyId() {
		return this.vrmOrganisationBean.getJsvmCompanyId();
	}

	public void setJsvmCompanyId(Integer jsvmCompanyId) {
		this.vrmOrganisationBean.setJsvmCompanyId(jsvmCompanyId);
	}


	@Column(name="jsvm_control", nullable=false, length=1, columnDefinition="CHAR")
	public String getJsvmControl() {
		return this.vrmOrganisationBean.getJsvmControl();
	}

	public void setJsvmControl(String jsvmControl) {
		this.vrmOrganisationBean.setJsvmControl(jsvmControl);
	}


	@Column(name="jsvm_source_id")
	public Integer getJsvmSourceId() {
		return this.vrmOrganisationBean.getJsvmSourceId();
	}

	public void setJsvmSourceId(Integer jsvmSourceId) {
		this.vrmOrganisationBean.setJsvmSourceId(jsvmSourceId);
	}


	@Column(nullable=false, length=100)
	public String getOrganisation() {
		return this.vrmOrganisationBean.getOrganisation();
	}

	public void setOrganisation(String organisation) {
		this.vrmOrganisationBean.setOrganisation(organisation);
	}


	@Column(name="organisation_code", length=10, columnDefinition="CHAR")
	public String getOrganisationCode() {
		return this.vrmOrganisationBean.getOrganisationCode();
	}

	public void setOrganisationCode(String organisationCode) {
		this.vrmOrganisationBean.setOrganisationCode(organisationCode);
	}


	@Column(name="Paradox_Location", length=2, columnDefinition="CHAR")
	public String getParadox_Location() {
		return this.vrmOrganisationBean.getParadox_Location();
	}

	public void setParadox_Location(String paradox_Location) {
		this.vrmOrganisationBean.setParadox_Location(paradox_Location);
	}


	@Column(length=30)
	public String getPhone() {
		return this.vrmOrganisationBean.getPhone();
	}

	public void setPhone(String phone) {
		this.vrmOrganisationBean.setPhone(phone);
	}


	@Column(length=10, columnDefinition="CHAR")
	public String getPostcode() {
		return this.vrmOrganisationBean.getPostcode();
	}

	public void setPostcode(String postcode) {
		this.vrmOrganisationBean.setPostcode(postcode);
	}


	@Column(name="Publisher_Id")
	public Integer getPublisher_Id() {
		return this.vrmOrganisationBean.getPublisher_Id();
	}

	public void setPublisher_Id(Integer publisher_Id) {
		this.vrmOrganisationBean.setPublisher_Id(publisher_Id);
	}

	@Column(length=100)
	public String getTown() {
		return this.vrmOrganisationBean.getTown();
	}

	public void setTown(String town) {
		this.vrmOrganisationBean.setTown(town);
	}


	public Date getUpdated() {
		return this.vrmOrganisationBean.getUpdated();
	}

	public void setUpdated(Date updated) {
		this.vrmOrganisationBean.setUpdated(updated);
	}


	@OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
	@JoinColumn(name="organisation_id", referencedColumnName="organisation_id")
	public VrmOrganisationLinkAgentEntity getVrmOrganisationLinkAgents() {
		return this.vrmOrganisationLinkAgents;
	}

	public void setVrmOrganisationLinkAgents(VrmOrganisationLinkAgentEntity vrmOrganisationLinkAgents) {
		this.vrmOrganisationLinkAgents = vrmOrganisationLinkAgents;
	}
	

	//bi-directional many-to-one association to VrmSoldEntity
	@OneToMany(mappedBy="vrmOrganisation", fetch=FetchType.LAZY)
	public List<VrmSoldEntity> getVrmSolds() {
		return this.vrmSolds;
	}

	public void setVrmSolds(List<VrmSoldEntity> vrmSolds) {
		this.vrmSolds = vrmSolds;
	}
	
}