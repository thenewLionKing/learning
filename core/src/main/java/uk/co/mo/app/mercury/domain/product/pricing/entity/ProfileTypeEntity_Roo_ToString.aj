package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.String;

privileged aspect ProfileTypeEntity_Roo_ToString {
    
    public String ProfileTypeEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("ProfileType: ").append(getProfileType()).append(", ");        
        sb.append("TypeDesc: ").append(getTypeDesc()).append(", ");        
        sb.append("ProductPriceProfiles: ").append(getProductPriceProfiles() == null ? "null" : getProductPriceProfiles().size()).append(", ");             
        return sb.toString();        
    }    
    
}
