package uk.co.mo.app.mercury.domain.agreement.entity;

import java.lang.String;

privileged aspect AgreementProductEntity_Roo_ToString {
    
    public String AgreementProductEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("Id: ").append(getId()).append(", ");        
        return sb.toString();        
    }    
    
}
