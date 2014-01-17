package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.String;

privileged aspect ProductPriceProfileEntity_Roo_ToString {
    
    public String ProductPriceProfileEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("AdvancedPayment: ").append(getAdvancedPayment()).append(", ");        
        sb.append("BasicTotalPrice: ").append(getBasicTotalPrice()).append(", ");        
        sb.append("ConfirmationDate: ").append(getConfirmationDate()).append(", ");        
        sb.append("EffectiveFrom: ").append(getEffectiveFrom()).append(", ");        
        sb.append("EffectiveTo: ").append(getEffectiveTo()).append(", ");        
        sb.append("InsertDate: ").append(getInsertDate()).append(", ");        
        sb.append("InsertUser: ").append(getInsertUser()).append(", ");        
        sb.append("Maintenance: ").append(getMaintenance()).append(", ");        
        sb.append("ManufacturersDiscount: ").append(getManufacturersDiscount()).append(", ");        
        sb.append("MiscellaneousPayment: ").append(getMiscellaneousPayment()).append(", ");        
        sb.append("ProfileCode: ").append(getProfileCode()).append(", ");        
        sb.append("ProfileUploadDate: ").append(getProfileUploadDate()).append(", ");        
        sb.append("ResidualValue: ").append(getResidualValue()).append(", ");        
        sb.append("Subsidy: ").append(getSubsidy()).append(", ");        
        sb.append("SundryPayment: ").append(getSundryPayment()).append(", ");        
        sb.append("UpdateDate: ").append(getUpdateDate()).append(", ");        
        sb.append("UpdateUser: ").append(getUpdateUser()).append(", ");        
        sb.append("VatAmount: ").append(getVatAmount()).append(", ");        
        sb.append("WeeklyRental: ").append(getWeeklyRental()).append(", ");        
        sb.append("BenifitType: ").append(getBenifitType()).append(", ");        
        sb.append("HireTerm: ").append(getHireTerm()).append(", ");        
        sb.append("ProductOffering: ").append(getProductOffering()).append(", ");        
        sb.append("ProfileType: ").append(getProfileType()).append(", ");        
        sb.append("Id: ").append(getId()).append(", ");        
        sb.append("Version: ").append(getVersion());        
        return sb.toString();        
    }    
    
}
