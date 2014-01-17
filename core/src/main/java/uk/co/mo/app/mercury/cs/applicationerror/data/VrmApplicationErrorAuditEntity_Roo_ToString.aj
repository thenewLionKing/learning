package uk.co.mo.app.mercury.cs.applicationerror.data;

import java.lang.String;

privileged aspect VrmApplicationErrorAuditEntity_Roo_ToString {
    
    public String VrmApplicationErrorAuditEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("ErrorAuditId: ").append(getErrorAuditId()).append(", ");        
        sb.append("ErrorStatusId: ").append(getErrorStatusId()).append(", ");        
        sb.append("ErrorSeverityId: ").append(getErrorSeverityId()).append(", ");        
        sb.append("AcknowledgedBy: ").append(getAcknowledgedBy()).append(", ");        
        sb.append("AcknowledgedDate: ").append(getAcknowledgedDate()).append(", ");        
        sb.append("Comment: ").append(getComment()).append(", ");        
        sb.append("Error: ").append(getError()).append(", ");        
        return sb.toString();        
    }    
    
}
