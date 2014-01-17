package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.String;

privileged aspect ProductOptionTypeEntity_Roo_ToString {
    
    public String ProductOptionTypeEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("Id: ").append(getId()).append(", ");        
        sb.append("Description: ").append(getDescription()).append(", ");            
        return sb.toString();        
    }    
    
}
