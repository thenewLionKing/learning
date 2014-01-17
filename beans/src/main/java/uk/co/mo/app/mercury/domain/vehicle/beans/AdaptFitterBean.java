package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class AdaptFitterBean implements Serializable {

	private static final long serialVersionUID = -3799377661916346961L;
	private Integer fitterId;
	private String account;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private Boolean contractSigned;
	private Date contractSignedDate;
	private String email;
	private String fax;
	private String fitterName;
	private Integer fittingTypeId;
	private Boolean insideM25;
	private Integer maxDeliveryRange;
	private Boolean motabilitySourced;
	private Boolean openInd;
	private String paymentMethod;
	private String postcode;
	private String sortcode;
	private String telephone;
	private String vatNumber;
	private String website;

	public AdaptFitterBean() {
	}
	
	@XmlElement(required=true)
	public Integer getFitterId() {
		return fitterId;
	}

	public void setFitterId(Integer fitterId) {
		this.fitterId = fitterId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
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

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public Boolean isContractSigned() {
		return contractSigned;
	}

	public void setContractSigned(Boolean contractSigned) {
		this.contractSigned = contractSigned;
	}

	public Date getContractSignedDate() {
		return contractSignedDate;
	}

	public void setContractSignedDate(Date contractSignedDate) {
		this.contractSignedDate = contractSignedDate;
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
	
	@XmlElement(required=true)
	public String getFitterName() {
		return fitterName;
	}

	public void setFitterName(String fitterName) {
		this.fitterName = fitterName;
	}

	public Integer getFittingTypeId() {
		return fittingTypeId;
	}

	public void setFittingTypeId(Integer fittingTypeId) {
		this.fittingTypeId = fittingTypeId;
	}

	public Boolean isInsideM25() {
		return insideM25;
	}

	public void setInsideM25(Boolean insideM25) {
		this.insideM25 = insideM25;
	}

	public Integer getMaxDeliveryRange() {
		return maxDeliveryRange;
	}

	public void setMaxDeliveryRange(Integer maxDeliveryRange) {
		this.maxDeliveryRange = maxDeliveryRange;
	}
	
	@XmlElement(required=true)
	public Boolean isMotabilitySourced() {
		return motabilitySourced;
	}

	public void setMotabilitySourced(Boolean motabilitySourced) {
		this.motabilitySourced = motabilitySourced;
	}

	@XmlElement(required=true)
	public Boolean isOpenInd() {
		return openInd;
	}

	public void setOpenInd(Boolean openInd) {
		this.openInd = openInd;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getSortcode() {
		return sortcode;
	}

	public void setSortcode(String sortcode) {
		this.sortcode = sortcode;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
}