package uk.co.mo.app.mercury.domain.pin.entity;

import java.lang.String;

privileged aspect PinAuthenticationAuditEntity_Roo_ToString {
    
    public String PinAuthenticationAuditEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("AuditId: ").append(getAuditId()).append(", ");        
        sb.append("PinToAuthenticate: ").append(getPinToAuthenticate()).append(", ");        
        sb.append("Valid: ").append(isValid()).append(", ");        
        sb.append("PinRequest: ").append(getPinRequest()).append(", ");        
        return sb.toString();        
    }    
    
}
