package uk.co.mo.app.mercury.domain.org.dealer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerGroupBean;

@Entity
@Table(name="dealer_group")
public class DealerGroupEntity implements Serializable {

	private static final long serialVersionUID = -2212764704028199267L;

	private DealerGroupBean dealerGroupBean = new DealerGroupBean();



	public DealerGroupEntity() {
    }
	
	@Transient
	public DealerGroupBean getDealerGroupBean() {
		return dealerGroupBean;
	}
	
	
	public void setDealerGroupBean(DealerGroupBean dealerGroupBean) {
		this.dealerGroupBean = dealerGroupBean;
	}

	@Id
	@Column(name="group_number", unique=true, nullable=false)
	public Integer getGroupNumber() {
		return this.dealerGroupBean.getGroupNumber();
	}

	public void setGroupNumber(Integer groupNumber) {
		this.dealerGroupBean.setGroupNumber(groupNumber);
	}


	@Column(length=30)
	public String getAddress1() {
		return this.dealerGroupBean.getAddress1();
	}

	public void setAddress1(String address1) {
		this.dealerGroupBean.setAddress1(address1);
	}


	@Column(length=30)
	public String getAddress2() {
		return this.dealerGroupBean.getAddress2();
	}

	public void setAddress2(String address2) {
		this.dealerGroupBean.setAddress2(address2);
	}


	@Column(length=30)
	public String getAddress3() {
		return this.dealerGroupBean.getAddress3();
	}

	public void setAddress3(String address3) {
		this.dealerGroupBean.setAddress3(address3);
	}


	@Column(length=30)
	public String getAddress4() {
		return this.dealerGroupBean.getAddress4();
	}

	public void setAddress4(String address4) {
		this.dealerGroupBean.setAddress4(address4);
	}


	@Column(length=100)
	public String getEmail() {
		return this.dealerGroupBean.getEmail();
	}

	public void setEmail(String email) {
		this.dealerGroupBean.setEmail(email);
	}


	@Column(name="fax_reception", length=15)
	public String getFaxReception() {
		return this.dealerGroupBean.getFaxReception();
	}

	public void setFaxReception(String faxReception) {
		this.dealerGroupBean.setFaxReception(faxReception);
	}


	@Column(name="group_name", nullable=false, length=50)
	public String getGroupName() {
		return this.dealerGroupBean.getGroupName();
	}

	public void setGroupName(String groupName) {
		this.dealerGroupBean.setGroupName(groupName);
	}


	@Column(name="group_type", nullable=false)
	public Integer getGroupType() {
		return this.dealerGroupBean.getGroupType();
	}

	public void setGroupType(Integer groupType) {
		this.dealerGroupBean.setGroupType(groupType);
	}


	@Column(length=8)
	public String getPostcode() {
		return this.dealerGroupBean.getPostcode();
	}

	public void setPostcode(String postcode) {
		this.dealerGroupBean.setPostcode(postcode);
	}


	@Column(name="tel_reception", length=15)
	public String getTelReception() {
		return this.dealerGroupBean.getTelReception();
	}

	public void setTelReception(String telReception) {
		this.dealerGroupBean.setTelReception(telReception);
	}


	@Column(length=100)
	public String getWebsite() {
		return this.dealerGroupBean.getWebsite();
	}

	public void setWebsite(String website) {
		this.dealerGroupBean.setWebsite(website);
	}
}
