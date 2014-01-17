package uk.co.mo.app.mercury.domain.pin.entity;

import java.lang.String;

privileged aspect PinTypeEntity_Roo_ToString {
    
    public String PinTypeEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("PinTypeId: ").append(getPinTypeId()).append(", ");        
        sb.append("PinTypeDesc: ").append(getPinTypeDesc()).append(", ");        
        sb.append("Pins: ").append(getPins() == null ? "null" : getPins().size()).append(", ");              
        return sb.toString();        
    }    
    
}
