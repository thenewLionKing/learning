package uk.co.mo.app.mercury.domain.product.entity;

import java.lang.String;

privileged aspect BasicColourEntity_Roo_ToString {
    
    public String BasicColourEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("Name: ").append(getName()).append(", ");        
        sb.append("DisplaySequence: ").append(getDisplaySequence()).append(", ");        
        sb.append("AgreementProducts: ").append(getAgreementProducts() == null ? "null" : getAgreementProducts().size()).append(", ");        
        return sb.toString();        
    }    
    
}
