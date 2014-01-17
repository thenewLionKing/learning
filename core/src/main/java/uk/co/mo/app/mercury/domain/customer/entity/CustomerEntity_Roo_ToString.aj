package uk.co.mo.app.mercury.domain.customer.entity;

import java.lang.String;

privileged aspect CustomerEntity_Roo_ToString {
    
    public String CustomerEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("CustomerId: ").append(getCustomerId()).append(", ");        
        sb.append("Crn: ").append(getCrn()).append(", ");        
        sb.append("MobilityNumber: ").append(getMobilityNumber()).append(", ");        
        sb.append("Title: ").append(getTitle()).append(", ");        
        sb.append("Forename: ").append(getForename()).append(", ");        
        sb.append("Surname: ").append(getSurname()).append(", ");        
        sb.append("Version: ").append(getVersion()).append(", ");        
        sb.append("Address1: ").append(getAddress1()).append(", ");        
        sb.append("Address2: ").append(getAddress2()).append(", ");        
        sb.append("Address3: ").append(getAddress3()).append(", ");        
        sb.append("Address4: ").append(getAddress4()).append(", ");        
        //sb.append("AltPhoneNumber2: ").append(getAltPhoneNumber2()).append(", ");        
        //sb.append("AltPhoneNumber3: ").append(getAltPhoneNumber3()).append(", ");        
        sb.append("CharitableFundRaisingInd: ").append(isCharitableFundRaisingInd()).append(", ");        
        sb.append("Cp50SafeDate: ").append(getCp50SafeDate()).append(", ");        
        sb.append("CustomerStatus: ").append(getCustomerStatus()).append(", ");        
        sb.append("DateOfBirth: ").append(getDateOfBirth()).append(", ");        
        sb.append("EmailAddress: ").append(getEmailAddress()).append(", ");        
        sb.append("FraudInd: ").append(getFraudInd()).append(", ");        
        //sb.append("InhibitMailshots: ").append(getInhibitMailshots()).append(", ");        
        //sb.append("InhibitPhoneCalls: ").append(getInhibitPhoneCalls()).append(", ");        
        sb.append("Initials: ").append(getInitials()).append(", ");        
        //sb.append("InsuranceInd: ").append(getInsuranceInd()).append(", ");        
        sb.append("Location: ").append(getLocation()).append(", ");        
        sb.append("MobilityAid: ").append(getMobilityAid()).append(", ");        
        sb.append("NationalInsuranceNumber: ").append(getNationalInsuranceNumber()).append(", ");        
        sb.append("PhoneMobile: ").append(getPhoneMobile()).append(", ");        
        sb.append("PhoneNumber: ").append(getPhoneNumber()).append(", ");        
        //sb.append("PhoneWork: ").append(getPhoneWork()).append(", ");        
        //sb.append("PhoneWorkExt: ").append(getPhoneWorkExt()).append(", ");        
        sb.append("Postcode: ").append(getPostcode()).append(", ");        
        sb.append("InsertDate: ").append(getInsertDate()).append(", ");        
        sb.append("UpdateDate: ").append(getUpdateDate()).append(", ");        
        sb.append("TerminationInd: ").append(getTerminationInd()).append(", ");        
        sb.append("UpdateUser: ").append(getUpdateUser()).append(", ");        
        sb.append("WarPensionerIndicator: ").append(getWarPensionerIndicator()).append(", ");
        sb.append("Lifestyle Indicator: ").append(isLifestyleIndicator()).append(", ");
        sb.append("Address Type: ").append(isCareHome()).append(", ");
        //sb.append("Agreements1: ").append(getAgreements1() == null ? "null" : getAgreements1().size()).append(", ");        
        sb.append("Agreements2: ").append(getAgreements2() == null ? "null" : getAgreements2().size()).append(", ");          
        return sb.toString();        
    }    
    
}
