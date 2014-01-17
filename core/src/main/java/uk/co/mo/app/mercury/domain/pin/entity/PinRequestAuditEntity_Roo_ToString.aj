package uk.co.mo.app.mercury.domain.pin.entity;

import java.lang.String;

privileged aspect PinRequestAuditEntity_Roo_ToString {
    
    public String PinRequestAuditEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("AuditId: ").append(getAuditId()).append(", ");        
        sb.append("InsertDate: ").append(getInsertDate()).append(", ");        
        sb.append("InsertUser: ").append(getInsertUser()).append(", ");        
        sb.append("TransportTypeId: ").append(getTransportTypeId()).append(", ");        
        sb.append("PinRequestReason: ").append(getPinRequestReason()).append(", ");        
        sb.append("Pin: ").append(getPin()).append(", ");             
        return sb.toString();        
    }    
    
}
