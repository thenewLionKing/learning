package uk.co.mo.app.mercury.domain.customer.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CustomerBean implements Serializable {

	private static final long serialVersionUID = 8773340020585101622L;
	private Integer customerId;
	private String crn;
	private String mobilityNumber;
	private String title;
	private String forename;
	private String surname;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private Boolean charitableFundRaisingInd;
	private Date cp50SafeDate;
	private Integer customerStatus;
	private Date dateOfBirth;
	private String emailAddress;
	private String fraudInd;
	private String initials;
	private String location;
	private Integer mobilityAid;
	private String nationalInsuranceNumber;
	private String phoneMobile;
	private String phoneNumber;
	private String postcode;
	private Date insertDate;
	private Date updateDate;
	private String terminationInd;
	private String updateUser;
	private String warPensionerIndicator;
	private String dssPaymentOfficeCode;
	private String complaintInd;
	private Boolean lifestyleIndicator;
	private Boolean careHome;
	private String deceased;
	private Date deceasedDate;
	private String phoneWork;
	private String phoneWorkExt;
	private String altPhoneNumber2;
	private String altPhoneNumber3;

    //   PIP-139   - Add award type to the PWS inception feed
    private String benefitCode;
	
	private List <VrmCustomerSuspensionBean> vrmCustomerSuspensionBean;
	private CustomerDlaAwardBean customerDlaAwardBean; 

	
	public String getDeceased() {
		return deceased;
	}

	public void setDeceased(String deceased) {
		this.deceased = deceased;
	}

	public String getPhoneWork() {
		return phoneWork;
	}

	public void setPhoneWork(String phoneWork) {
		this.phoneWork = phoneWork;
	}

	public String getPhoneWorkExt() {
		return phoneWorkExt;
	}

	public void setPhoneWorkExt(String phoneWorkExt) {
		this.phoneWorkExt = phoneWorkExt;
	}

	public String getAltPhoneNumber2() {
		return altPhoneNumber2;
	}

	public void setAltPhoneNumber2(String altPhoneNumber2) {
		this.altPhoneNumber2 = altPhoneNumber2;
	}

	public String getAltPhoneNumber3() {
		return altPhoneNumber3;
	}

	public void setAltPhoneNumber3(String altPhoneNumber3) {
		this.altPhoneNumber3 = altPhoneNumber3;
	}

    //   PIP-139   - Add award type to the PWS inception feed
    public String getBenefitCode() {
        if   ("HRMC".equalsIgnoreCase(benefitCode)) return "DLA";
        else return benefitCode;
	}

	public void setBenefitCode(String benefitCode) {
		this.benefitCode = benefitCode;
	}
    // End of PIP-139 Changes

	public Date getDeceasedDate() {
		return deceasedDate;
	}

	public void setDeceasedDate(Date deceasedDate) {
		this.deceasedDate = deceasedDate;
	}


	public List<VrmCustomerSuspensionBean> getVrmCustomerSuspensionBean() {
		return vrmCustomerSuspensionBean;
	}

	public void setVrmCustomerSuspensionBean(
			List<VrmCustomerSuspensionBean> vrmCustomerSuspensionBean) {
		this.vrmCustomerSuspensionBean = vrmCustomerSuspensionBean;
	}

	public CustomerBean() {
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}

	public String getMobilityNumber() {
		return mobilityNumber;
	}

	public void setMobilityNumber(String mobilityNumber) {
		this.mobilityNumber = mobilityNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	public Boolean isCharitableFundRaisingInd() {
		return charitableFundRaisingInd;
	}

	public void setCharitableFundRaisingInd(Boolean charitableFundRaisingInd) {
		this.charitableFundRaisingInd = charitableFundRaisingInd;
	}

	public Date getCp50SafeDate() {
		return cp50SafeDate;
	}

	public void setCp50SafeDate(Date cp50SafeDate) {
		this.cp50SafeDate = cp50SafeDate;
	}

	public Integer getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(Integer customerStatus) {
		this.customerStatus = customerStatus;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFraudInd() {
		return fraudInd;
	}

	public void setFraudInd(String fraudInd) {
		this.fraudInd = fraudInd;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getMobilityAid() {
		return mobilityAid;
	}

	public void setMobilityAid(Integer mobilityAid) {
		this.mobilityAid = mobilityAid;
	}

	public String getNationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}

	public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}

	public String getPhoneMobile() {
		return phoneMobile;
	}

	public void setPhoneMobile(String phoneMobile) {
		this.phoneMobile = phoneMobile;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getTerminationInd() {
		return terminationInd;
	}

	public void setTerminationInd(String terminationInd) {
		this.terminationInd = terminationInd;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getWarPensionerIndicator() {
		return warPensionerIndicator;
	}

	public void setWarPensionerIndicator(String warPensionerIndicator) {
		this.warPensionerIndicator = warPensionerIndicator;
	}

	public String getDssPaymentOfficeCode() {
		return dssPaymentOfficeCode;
	}

	public void setDssPaymentOfficeCode(String dssPaymentOfficeCode) {
		this.dssPaymentOfficeCode = dssPaymentOfficeCode;
	}

	public String getComplaintInd() {
		return complaintInd;
	}

	public void setComplaintInd(String complaintInd) {
		this.complaintInd = complaintInd;
	}

	public Boolean isLifestyleIndicator() {
		return lifestyleIndicator;
	}

	public void setLifestyleIndicator(Boolean lifestyleIndicator) {
		this.lifestyleIndicator = lifestyleIndicator;
	}

	public Boolean isCareHome() {
		return careHome;
	}

	public void setCareHome(Boolean careHome) {
		this.careHome = careHome;
	}

	public void setCustomerDlaAwardBean(CustomerDlaAwardBean customerDlaAwardBean) {
		this.customerDlaAwardBean = customerDlaAwardBean;
	}

	public CustomerDlaAwardBean getCustomerDlaAwardBean() {
		return customerDlaAwardBean;
	}
}