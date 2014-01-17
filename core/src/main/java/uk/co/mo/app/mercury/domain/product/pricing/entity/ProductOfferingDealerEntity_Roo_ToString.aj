package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.String;

privileged aspect ProductOfferingDealerEntity_Roo_ToString {
    
    public String ProductOfferingDealerEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("Id: ").append(getId()).append(", ");        
        sb.append("_id: ").append(getId()).append(", ");                
        return sb.toString();        
    }    
    
}
