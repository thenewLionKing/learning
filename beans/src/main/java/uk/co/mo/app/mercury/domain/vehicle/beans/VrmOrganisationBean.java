package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class VrmOrganisationBean implements Serializable{
	
	private static final long serialVersionUID = -3715042069345257927L;

	private Integer organisationId;
	private String active;
	private String address1;
	private String address2;
	private String address3;
	private String bvBuyView;
	private String county;
	private BigDecimal creditLimit;
	private BigDecimal creditOutstanding;
	private String email;
	private String fax;
	private Integer grmDealerId;
	private Integer jsvmCompanyId;
	private String jsvmControl;
	private Integer jsvmSourceId;
	private String organisation;
	private String organisationCode;
	private String paradox_Location;
	private String phone;
	private String postcode;
	private Integer publisher_Id;
	private Date timestamp;
	private String town;
	private Date updated;
	private List <VrmSoldBean> vrmSoldBean;
	private VrmOrganisationLinkAgentBean vrmOrganisationLinkAgentBean;

	public VrmOrganisationBean() {
	}

	public Integer getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(Integer organisationId) {
		this.organisationId = organisationId;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getBvBuyView() {
		return bvBuyView;
	}

	public void setBvBuyView(String bvBuyView) {
		this.bvBuyView = bvBuyView;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public BigDecimal getCreditOutstanding() {
		return creditOutstanding;
	}

	public void setCreditOutstanding(BigDecimal creditOutstanding) {
		this.creditOutstanding = creditOutstanding;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Integer getGrmDealerId() {
		return grmDealerId;
	}

	public void setGrmDealerId(Integer grmDealerId) {
		this.grmDealerId = grmDealerId;
	}

	public Integer getJsvmCompanyId() {
		return jsvmCompanyId;
	}

	public void setJsvmCompanyId(Integer jsvmCompanyId) {
		this.jsvmCompanyId = jsvmCompanyId;
	}

	public String getJsvmControl() {
		return jsvmControl;
	}

	public void setJsvmControl(String jsvmControl) {
		this.jsvmControl = jsvmControl;
	}

	public Integer getJsvmSourceId() {
		return jsvmSourceId;
	}

	public void setJsvmSourceId(Integer jsvmSourceId) {
		this.jsvmSourceId = jsvmSourceId;
	}

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	public String getOrganisationCode() {
		return organisationCode;
	}

	public void setOrganisationCode(String organisationCode) {
		this.organisationCode = organisationCode;
	}

	public String getParadox_Location() {
		return paradox_Location;
	}

	public void setParadox_Location(String paradox_Location) {
		this.paradox_Location = paradox_Location;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public Integer getPublisher_Id() {
		return publisher_Id;
	}

	public void setPublisher_Id(Integer publisher_Id) {
		this.publisher_Id = publisher_Id;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public void setVrmSoldBean(List <VrmSoldBean> vrmSoldBean) {
		this.vrmSoldBean = vrmSoldBean;
	}

	public List <VrmSoldBean> getVrmSoldBean() {
		return vrmSoldBean;
	}

	public VrmOrganisationLinkAgentBean getVrmOrganisationLinkAgentBean() {
		return vrmOrganisationLinkAgentBean;
	}

	public void setVrmOrganisationLinkAgentBean(
			VrmOrganisationLinkAgentBean vrmOrganisationLinkAgentBean) {
		this.vrmOrganisationLinkAgentBean = vrmOrganisationLinkAgentBean;
	}

	@Override
	public String toString() {
		return "VrmOrganisationBean [organisationId=" + organisationId
				+ ", active=" + active + ", address1=" + address1
				+ ", address2=" + address2 + ", address3=" + address3
				+ ", bvBuyView=" + bvBuyView + ", county=" + county
				+ ", creditLimit=" + creditLimit + ", creditOutstanding="
				+ creditOutstanding + ", email=" + email + ", fax=" + fax
				+ ", grmDealerId=" + grmDealerId + ", jsvmCompanyId="
				+ jsvmCompanyId + ", jsvmControl=" + jsvmControl
				+ ", jsvmSourceId=" + jsvmSourceId + ", organisation="
				+ organisation + ", organisationCode=" + organisationCode
				+ ", paradox_Location=" + paradox_Location + ", phone=" + phone
				+ ", postcode=" + postcode + ", publisher_Id=" + publisher_Id
				+ ", timestamp=" + timestamp + ", town=" + town + ", updated="
				+ updated + ", vrmSoldBean=" + vrmSoldBean
				+ ", vrmOrganisationLinkAgentBean="
				+ getVrmOrganisationLinkAgentBean() + "]";
	}
}