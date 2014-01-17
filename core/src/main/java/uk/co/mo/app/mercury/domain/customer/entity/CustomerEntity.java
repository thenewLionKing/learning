/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.domain.customer.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import uk.co.mo.app.mercury.cs.entity.AbstractAuditableEntity;
import uk.co.mo.app.mercury.cs.entity.MoEntity;
import uk.co.mo.app.mercury.domain.agreement.entity.AgreementEntity;
import uk.co.mo.app.mercury.domain.customer.beans.CustomerBean;
import uk.co.mo.app.mercury.domain.pin.entity.PinEntity;



@Entity
@org.hibernate.annotations.Entity(dynamicUpdate = true)
@Table(name = "customers", schema = "dbo", catalog = "Enterprise")
public class CustomerEntity extends AbstractAuditableEntity implements MoEntity, Serializable{
	
		private static final long serialVersionUID = 6152846800758094370L;
	
	
		private CustomerBean customerBean = new CustomerBean();
		private List<AgreementEntity> agreementsByApplicant;
		private  List<AgreementEntity> agreementsByAppointee;
		private Set<PinEntity> pins;
		private List<VrmCustomerSuspensionEntity> vrmCustomerSuspensionEntity;
		private CustomerDlaAwardEntity customerDlaAwardEntity;
	
		@Transient
		public CustomerBean getCustomerBean() {
			return customerBean;
		}

		@Id
	    @NotNull
	    @Column(name = "customer_id")
		public Integer getCustomerId() {
			return customerBean.getCustomerId();
		}
	
		public void setCustomerId(Integer customerId) {
			this.customerBean.setCustomerId(customerId);
		}
	
	    @Column(name = "crn", columnDefinition = "CHAR 8 NULL")
		public String getCrn() {
			return customerBean.getCrn();
		}
	
	    public void setCrn(String crn) {
			this.customerBean.setCrn(crn);
		}
	    
	    @Column(name = "deceased", columnDefinition = "CHAR 1 NULL")
		public String getDeceased() {
			return customerBean.getDeceased();
		}
	
	    public void setDeceased(String deceased) {
			this.customerBean.setDeceased(deceased);
		}
	    
	    @Column(name = "deceased_date", columnDefinition = "DATETIME")
		public Date getDeceasedDate() {
			return customerBean.getDeceasedDate();
		}
	
	    public void setDeceasedDate(Date deceasedDate) {
			this.customerBean.setDeceasedDate(deceasedDate);
		}
	    
	    @Column(name = "mobility_number", columnDefinition = "CHAR 7 NULL")
		public String getMobilityNumber() {
			return customerBean.getMobilityNumber();
		}
	
	    public void setMobilityNumber(String mobilityNumber) {
			this.customerBean.setMobilityNumber(mobilityNumber);
		}
	    
	    @Column(name = "title", columnDefinition = "CHAR 4 NULL")
		public String getTitle() {
			return customerBean.getTitle();
		}
	
	    public void setTitle(String title) {
			this.customerBean.setTitle(title);
		}
	    
	    @Size(max = 50)
		public String getForename() {
			return customerBean.getForename();
		}
	
	    public void setForename(String forename) {
			this.customerBean.setForename(forename);
		}
	    @Size(max = 50)
		public String getSurname() {
			return customerBean.getSurname();
		}
	    
	    public void setSurname(String surname) {
			this.customerBean.setSurname(surname);
		}
	

	    public String getAddress1() {    
	        return this.customerBean.getAddress1();        
	    }    
	    
	    public void setAddress1(String address1) {    
	        this.customerBean.setAddress1(address1);        
	    }    
	    
	    public String getAddress2() {    
	        return this.customerBean.getAddress2();        
	    }    
	    
	    public void setAddress2(String address2) {    
	        this.customerBean.setAddress2(address2);        
	    }    
	    
	    public String getAddress3() {    
	        return this.customerBean.getAddress3();        
	    }    
	    
	    public void setAddress3(String address3) {    
	        this.customerBean.setAddress3(address3);        
	    }    
	    
	    public String getAddress4() {    
	        return this.customerBean.getAddress4();        
	    }    
	    
	    public void setAddress4(String address4) {    
	        this.customerBean.setAddress4(address4);        
	    }    
	    
	    @Column(name="charitable_fund_raising_ind")
	    public Boolean isCharitableFundRaisingInd() {    
	        return this.customerBean.isCharitableFundRaisingInd();        
	    }    
	    
	    public void setCharitableFundRaisingInd(Boolean charitableFundRaisingInd) {    
	        this.customerBean.setCharitableFundRaisingInd(charitableFundRaisingInd);        
	    }    

	    @Column(name="cp50_safe_date")
	    public Date getCp50SafeDate() {    
	        return this.customerBean.getCp50SafeDate();        
	    }    
	    
	    public void setCp50SafeDate(Date cp50SafeDate) {    
	        this.customerBean.setCp50SafeDate(cp50SafeDate);        
	    }    

		@Column(name="customer_status",columnDefinition = "smallint")
	    public Integer getCustomerStatus() {    
	        return this.customerBean.getCustomerStatus();        
	    }    
	    
	    public void setCustomerStatus(Integer customerStatus) {    
	        this.customerBean.setCustomerStatus(customerStatus);        
	    }    

	    @Column(name="date_of_birth")
	    public Date getDateOfBirth() {    
	        return this.customerBean.getDateOfBirth();        
	    }    
	    
	    public void setDateOfBirth(Date dateOfBirth) {    
	        this.customerBean.setDateOfBirth(dateOfBirth);        
	    }    

		@Column(name="email_address")
	    public String getEmailAddress() {    
	        return this.customerBean.getEmailAddress();        
	    }    
	    
	    public void setEmailAddress(String emailAddress) {    
	        this.customerBean.setEmailAddress(emailAddress);        
	    }    

		@Column(name="fraud_ind",	columnDefinition = "char 1")
	    public String getFraudInd() {    
	        return this.customerBean.getFraudInd();        
	    }    
	    
	    public void setFraudInd(String fraudInd) {    
	        this.customerBean.setFraudInd(fraudInd);        
	    }    
	    
	    @Column(columnDefinition = "char 4")
	    public String getInitials() {    
	        return this.customerBean.getInitials();        
	    }    
	    
	    public void setInitials(String initials) {    
	        this.customerBean.setInitials(initials);        
	    }    
		
	    @Column(columnDefinition = "char 1")
	    public String getLocation() {    
	        return this.customerBean.getLocation();        
	    }    
	    
	    public void setLocation(String location) {    
	        this.customerBean.setLocation(location);        
	    }    

	    @Column(name="mobility_aid")
	    public Integer getMobilityAid() {    
	        return this.customerBean.getMobilityAid();        
	    }    
	    
	    public void setMobilityAid(Integer mobilityAid) {    
	        this.customerBean.setMobilityAid(mobilityAid);        
	    }    

	    @Column(name="national_insurance_number",columnDefinition = "char 9")
	    public String getNationalInsuranceNumber() {    
	        return this.customerBean.getNationalInsuranceNumber();        
	    }    
	    
	    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {    
	        this.customerBean.setNationalInsuranceNumber(nationalInsuranceNumber);        
	    }    
	    
		@Column(name="phone_mobile")
	    public String getPhoneMobile() {    
	        return this.customerBean.getPhoneMobile();        
	    }    
	    
	    public void setPhoneMobile(String phoneMobile) {    
	        this.customerBean.setPhoneMobile(phoneMobile);        
	    }    
	    
		@Column(name="phone_number")
	    public String getPhoneNumber() {    
	        return this.customerBean.getPhoneNumber();        
	    }    
	    
	    public void setPhoneNumber(String phoneNumber) {    
	        this.customerBean.setPhoneNumber(phoneNumber);        
	    }    

		@Column(name="alt_phone_number_2", length=15)
		public String getAltPhoneNumber2() {
			return this.customerBean.getAltPhoneNumber2();
		}

		public void setAltPhoneNumber2(String altPhoneNumber2) {
			this.customerBean.setAltPhoneNumber2(altPhoneNumber2);
		}


		@Column(name="alt_phone_number_3", length=15)
		public String getAltPhoneNumber3() {
			return this.customerBean.getAltPhoneNumber3();
		}

		public void setAltPhoneNumber3(String altPhoneNumber3) {
			this.customerBean.setAltPhoneNumber3(altPhoneNumber3);
		}

         //   PIP-139   - Add award type to the PWS inception feed
        //   PIP changes introduced the following Field in customer table.
        @Column(name="benefit_code", length=10)
		public String getBenefitCode() {
			return this.customerBean.getBenefitCode();
		}

		public void setBenefitCode(String benefitCode) {
			this.customerBean.setBenefitCode(benefitCode);
		}

        // End of PIP-139

		@Column(name="phone_work", length=15)
		public String getPhoneWork() {
			return this.customerBean.getPhoneWork();
		}

		public void setPhoneWork(String phoneWork) {
			this.customerBean.setPhoneWork(phoneWork);
		}


		@Column(name="phone_work_ext", length=4)
		public String getPhoneWorkExt() {
			return this.customerBean.getPhoneWorkExt();
		}

		public void setPhoneWorkExt(String phoneWorkExt) {
			this.customerBean.setPhoneWorkExt(phoneWorkExt);
		}
		
		@Column(columnDefinition = "char 8")
	    public String getPostcode() {    
	        return this.customerBean.getPostcode();        
	    }    
	    
	    public void setPostcode(String postcode) {    
	        this.customerBean.setPostcode(postcode);        
	    }    
	    
		@Column(name="row_insert_date")
	    public Date getInsertDate() {    
	        return this.customerBean.getInsertDate();        
	    }    
	    
	    public void setInsertDate(Date insertDate) {    
	        this.customerBean.setInsertDate(insertDate);        
	    }    
	    
		@Column(name="row_update_date")
	    public Date getUpdateDate() {    
	        return this.customerBean.getUpdateDate();        
	    }    
	    
	    public void setUpdateDate(Date updateDate) {    
	        this.customerBean.setUpdateDate(updateDate);        
	    }    
	    
		@Column(name="termination_ind",	columnDefinition = "char 1")
	    public String getTerminationInd() {    
	        return this.customerBean.getTerminationInd();        
	    }    
	    
	    public void setTerminationInd(String terminationInd) {    
	        this.customerBean.setTerminationInd(terminationInd);        
	    }    
	    
		@Column(name="update_user")
	    public String getUpdateUser() {    
	        return this.customerBean.getUpdateUser();        
	    }    
	    
	    public void setUpdateUser(String updateUser) {    
	        this.customerBean.setUpdateUser(updateUser);        
	    }    
	    
		@Column(name="war_pensioner_indicator",	columnDefinition = "char 1")
	    public String getWarPensionerIndicator() {    
	        return this.customerBean.getWarPensionerIndicator();        
	    }    
	    
	    public void setWarPensionerIndicator(String warPensionerIndicator) {    
	        this.customerBean.setWarPensionerIndicator(warPensionerIndicator);        
	    }    
		
	    
	    public void addAgreementsByApplicant(AgreementEntity agreements1) {    
	        if(agreementsByApplicant==null){
	        	agreementsByApplicant = new ArrayList();
	        }
	    	this.agreementsByApplicant.add(agreements1);        
	    }    

	    public void addAgreementsByAppointee(AgreementEntity agreements2) {    
	        if(agreementsByAppointee==null){
	        	agreementsByAppointee = new ArrayList();
	        }
	    	this.agreementsByAppointee.add(agreements2);        
	    }


	    @Column(name="dss_payment_office",	columnDefinition = "char 1")    
	    public String getDssPaymentOfficeCode() {
	    	return customerBean.getDssPaymentOfficeCode();
	    }

	    public void setDssPaymentOfficeCode(String dssPaymentOfficeCode) {
	    	this.customerBean.setDssPaymentOfficeCode(dssPaymentOfficeCode);
	    }

	    @Column(name="complaint_ind",	columnDefinition = "char 1")    
	    public String getComplaintInd() {
	    	return customerBean.getComplaintInd();
	    }

	    public void setComplaintInd(String complaintInd) {
	    	this.customerBean.setComplaintInd(complaintInd);
	    }
	    
	    @Transient
	    public String getFullname() {
	    	return getTitle() + " " + getForename() + " " + getSurname();
	    }

	    @Column(name="lifestyle_ind",	columnDefinition = "int")    
	    public Boolean isLifestyleIndicator() {
	    	return customerBean.isLifestyleIndicator();
	    }
	    
	    @Column(name="address_type",	columnDefinition = "int")
	    public Boolean isCareHome() {
	    	return customerBean.isCareHome();
	    }
	    public void setCareHome(Boolean addressType) {
	    	this.customerBean.setCareHome(addressType);
	    }

	    public void setLifestyleIndicator(Boolean lifestyleIndicator) {
	    	this.customerBean.setLifestyleIndicator(lifestyleIndicator);
	    }

	    //bi-directional many-to-one association to AgreementEntity
		@OneToMany(mappedBy="applicant")
	    public List<AgreementEntity> getAgreementsByApplicant() {    
	        return this.agreementsByApplicant;        
	    }    
	    
	    public void setAgreementsByApplicant(List<AgreementEntity> agreements1) {    
	        this.agreementsByApplicant = agreements1;        
	    }    

	    //bi-directional many-to-one association to AgreementEntity
		@OneToMany(mappedBy="appointee")
	    public List<AgreementEntity> getAgreements2() {    
	        return this.agreementsByAppointee;        
	    }    
	    
	    public void setAgreements2(List<AgreementEntity> agreements2) {    
	        this.agreementsByAppointee = agreements2;        
	    }
	    
		//bi-directional many-to-many association to PinEntity
	    @ManyToMany (cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
		@JoinTable(name="agreement_customer_esignature_pin" , joinColumns={
				@JoinColumn(name="customer_id", insertable=false, updatable=false)} , inverseJoinColumns={
				@JoinColumn(name="pin_id",insertable=false, updatable=false)})
		public Set<PinEntity> getPins() {
			return this.pins;
		}

		public void setPins(Set<PinEntity> pins) {
			this.pins = pins;
		}
	    
	    
		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		@JoinColumn(name = "customer_id", referencedColumnName= "customer_id", nullable = true, insertable=false, updatable=false)
		public List<VrmCustomerSuspensionEntity> getVrmCustomerSuspensionEntity() {
	    	return this.vrmCustomerSuspensionEntity;
		}
		    
		public void setVrmCustomerSuspensionEntity(List<VrmCustomerSuspensionEntity> vrmCustomerSuspensionEntity) {
		   	this.vrmCustomerSuspensionEntity = vrmCustomerSuspensionEntity;
		}

		@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		@JoinColumn(name = "customer_id", referencedColumnName= "customer_id", nullable = true, insertable=false, updatable=false)
		public CustomerDlaAwardEntity getCustomerDlaAwardEntity() {
			return customerDlaAwardEntity;
		}

		public void setCustomerDlaAwardEntity(
				CustomerDlaAwardEntity customerDlaAwardEntity) {
			this.customerDlaAwardEntity = customerDlaAwardEntity;
		}
}
