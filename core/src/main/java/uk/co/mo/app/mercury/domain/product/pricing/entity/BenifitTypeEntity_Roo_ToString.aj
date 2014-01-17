package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.String;

privileged aspect BenifitTypeEntity_Roo_ToString {
    
    public String BenifitTypeEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("BenifitCode: ").append(getBenifitCode()).append(", ");        
        sb.append("BenifitDesc: ").append(getBenifitDesc()).append(", ");        
        sb.append("ProductPriceProfiles: ").append(getProductPriceProfiles() == null ? "null" : getProductPriceProfiles().size()).append(", ");             
        return sb.toString();        
    }    
    
}
