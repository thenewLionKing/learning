package uk.co.mo.app.mercury.domain.pin.entity;

import java.lang.String;

privileged aspect PinRequestReasonEntity_Roo_ToString {
    
    public String PinRequestReasonEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("PinId: ").append(getRequestReasonId()).append(", ");        
        sb.append("RequestReasonDesc: ").append(getRequestReasonDesc()).append(", ");        
        sb.append("PinRequestAudits: ").append(getPinRequestAudits() == null ? "null" : getPinRequestAudits().size()).append(", ");        
        return sb.toString();        
    }    
    
}
