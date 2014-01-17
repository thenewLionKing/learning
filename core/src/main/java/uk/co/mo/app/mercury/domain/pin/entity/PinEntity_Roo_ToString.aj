package uk.co.mo.app.mercury.domain.pin.entity;

import java.lang.String;

privileged aspect PinEntity_Roo_ToString {
    
    public String PinEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("PinType: ").append(getPinType()).append(", ");        
        sb.append("PinId: ").append(getPinId()).append(", ");        
        sb.append("Pin: ").append(getPin()).append(", ");        
        sb.append("InsertDate: ").append(getInsertDate()).append(", ");        
        sb.append("InsertUser: ").append(getInsertUser()).append(", ");        
        sb.append("RequestAudit: ").append(getRequestAudit() == null ? "null" : getRequestAudit().size()).append(", ");        
        sb.append("Customers: ").append(getCustomers() == null ? "null" : getCustomers().size()).append(", ");        
        sb.append("Agreements: ").append(getAgreements() == null ? "null" : getAgreements().size()).append(", ");                   
        return sb.toString();        
    }    
    
}
