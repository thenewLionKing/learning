package uk.co.mo.app.mercury.cs.applicationerror.data;

import java.lang.String;

privileged aspect VrmErrorTypeEntity_Roo_ToString {
    
    public String VrmErrorTypeEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("ErrorTypeId: ").append(getErrorTypeId()).append(", ");        
        sb.append("ApplicationId: ").append(getApplicationId()).append(", ");        
        sb.append("ErrorTypeDesc: ").append(getErrorTypeDesc()).append(", ");        
        return sb.toString();        
    }    
    
}
