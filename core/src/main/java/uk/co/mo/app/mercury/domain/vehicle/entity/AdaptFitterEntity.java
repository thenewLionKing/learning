package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.AdaptFitterBean;


/**
 * The persistent class for the adapt_fitters database table.
 * 
 */
@Entity
@Table(name="adapt_fitters")
public class AdaptFitterEntity implements Serializable {

	private static final long serialVersionUID = -1313965117253435450L;
	private AdaptFitterBean adaptFitterBean = new AdaptFitterBean();

	
	@Transient
	public AdaptFitterBean getAdaptFitterBean() {
		return adaptFitterBean;
	}
	public void setAdaptFitterBean(AdaptFitterBean adaptFitterBean) {
		this.adaptFitterBean = adaptFitterBean;
	}


	public AdaptFitterEntity() {
    }


	@Id
	@Column(name="fitter_id", unique=true, nullable=false)
	public Integer getFitterId() {
		return this.adaptFitterBean.getFitterId();
	}

	public void setFitterId(Integer fitterId) {
		this.adaptFitterBean.setFitterId(fitterId);
	}


	@Column(length=8 , columnDefinition="CHAR")
	public String getAccount() {
		return this.adaptFitterBean.getAccount();
	}

	public void setAccount(String account) {
		this.adaptFitterBean.setAccount(account);
	}


	@Column(length=35)
	public String getAddress1() {
		return this.adaptFitterBean.getAddress1();
	}

	public void setAddress1(String address1) {
		this.adaptFitterBean.setAddress1(address1);
	}


	@Column(length=35)
	public String getAddress2() {
		return this.adaptFitterBean.getAddress2();
	}

	public void setAddress2(String address2) {
		this.adaptFitterBean.setAddress2(address2);
	}


	@Column(length=35)
	public String getAddress3() {
		return this.adaptFitterBean.getAddress3();
	}

	public void setAddress3(String address3) {
		this.adaptFitterBean.setAddress3(address3);
	}


	@Column(length=35)
	public String getAddress4() {
		return this.adaptFitterBean.getAddress4();
	}

	public void setAddress4(String address4) {
		this.adaptFitterBean.setAddress4(address4);
	}


	@Column(name="contract_signed")
	public Boolean getContractSigned() {
		return this.adaptFitterBean.isContractSigned();
	}

	public void setContractSigned(Boolean contractSigned) {
		this.adaptFitterBean.setContractSigned(contractSigned);
	}


	@Column(name="contract_signed_date", columnDefinition = "DATETIME")
	public Date getContractSignedDate() {
		return this.adaptFitterBean.getContractSignedDate();
	}

	public void setContractSignedDate(Date contractSignedDate) {
		this.adaptFitterBean.setContractSignedDate(contractSignedDate);
	}


	@Column(length=150)
	public String getEmail() {
		return this.adaptFitterBean.getEmail();
	}

	public void setEmail(String email) {
		this.adaptFitterBean.setEmail(email);
	}


	@Column(length=15)
	public String getFax() {
		return this.adaptFitterBean.getFax();
	}

	public void setFax(String fax) {
		this.adaptFitterBean.setFax(fax);
	}


	@Column(name="fitter_name", nullable=false, length=50)
	public String getFitterName() {
		return this.adaptFitterBean.getFitterName();
	}

	public void setFitterName(String fitterName) {
		this.adaptFitterBean.setFitterName(fitterName);
	}


	@Column(name="fitting_type_id")
	public Integer getFittingTypeId() {
		return this.adaptFitterBean.getFittingTypeId();
	}

	public void setFittingTypeId(Integer fittingTypeId) {
		this.adaptFitterBean.setFittingTypeId(fittingTypeId);
	}


	@Column(name="inside_m25")
	public Boolean getInsideM25() {
		return this.adaptFitterBean.isInsideM25();
	}

	public void setInsideM25(Boolean insideM25) {
		this.adaptFitterBean.setInsideM25(insideM25);
	}


	@Column(name="max_delivery_range")
	public Integer getMaxDeliveryRange() {
		return this.adaptFitterBean.getMaxDeliveryRange();
	}

	public void setMaxDeliveryRange(Integer maxDeliveryRange) {
		this.adaptFitterBean.setMaxDeliveryRange(maxDeliveryRange);
	}


	@Column(name="motability_sourced", nullable=false)
	public Boolean getMotabilitySourced() {
		return this.adaptFitterBean.isMotabilitySourced();
	}

	public void setMotabilitySourced(Boolean motabilitySourced) {
		this.adaptFitterBean.setMotabilitySourced(motabilitySourced);
	}


	@Column(name="open_ind", nullable=false)
	public Boolean getOpenInd() {
		return this.adaptFitterBean.isOpenInd();
	}

	public void setOpenInd(Boolean openInd) {
		this.adaptFitterBean.setOpenInd(openInd);
	}


	@Column(name="payment_method", length=2, columnDefinition="CHAR")
	public String getPaymentMethod() {
		return this.adaptFitterBean.getPaymentMethod();
	}

	public void setPaymentMethod(String paymentMethod) {
		this.adaptFitterBean.setPaymentMethod(paymentMethod);
	}


	@Column(length=8)
	public String getPostcode() {
		return this.adaptFitterBean.getPostcode();
	}

	public void setPostcode(String postcode) {
		this.adaptFitterBean.setPostcode(postcode);
	}


	@Column(length=6, columnDefinition="CHAR")
	public String getSortcode() {
		return this.adaptFitterBean.getSortcode();
	}

	public void setSortcode(String sortcode) {
		this.adaptFitterBean.setSortcode(sortcode);
	}


	@Column(length=15)
	public String getTelephone() {
		return this.adaptFitterBean.getTelephone();
	}

	public void setTelephone(String telephone) {
		this.adaptFitterBean.setTelephone(telephone);
	}


	@Column(name="vat_number", length=9, columnDefinition="CHAR")
	public String getVatNumber() {
		return this.adaptFitterBean.getVatNumber();
	}

	public void setVatNumber(String vatNumber) {
		this.adaptFitterBean.setVatNumber(vatNumber);
	}


	@Column(length=100)
	public String getWebsite() {
		return this.adaptFitterBean.getWebsite();
	}

	public void setWebsite(String website) {
		this.adaptFitterBean.setWebsite(website);
	}

}