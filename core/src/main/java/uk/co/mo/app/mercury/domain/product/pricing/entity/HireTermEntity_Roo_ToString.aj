package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.String;

privileged aspect HireTermEntity_Roo_ToString {
    
    public String HireTermEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("Code: ").append(getCode()).append(", ");        
        sb.append("EffectiveFrom: ").append(getEffectiveFrom()).append(", ");        
        sb.append("EffectiveTo: ").append(getEffectiveTo()).append(", ");        
        sb.append("InsertDate: ").append(getInsertDate()).append(", ");        
        sb.append("InsertUser: ").append(getInsertUser()).append(", ");        
        sb.append("TermMonths: ").append(getTermMonths()).append(", ");        
        sb.append("TermWeeks: ").append(getTermWeeks()).append(", ");        
        sb.append("TermYears: ").append(getTermYears()).append(", ");        
        sb.append("UpdateDate: ").append(getUpdateDate()).append(", ");        
        sb.append("UpdateUser: ").append(getUpdateUser()).append(", ");        
        sb.append("Version: ").append(getVersion()).append(", ");        
        sb.append("ProductPriceProfiles: ").append(getProductPriceProfiles() == null ? "null" : getProductPriceProfiles().size()).append(", ");               
        sb.append("version: ").append(getVersion());        
        return sb.toString();        
    }    
    
}
