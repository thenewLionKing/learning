package uk.co.mo.app.mercury.cs.applicationerror.data;

import java.lang.String;

privileged aspect VrmApplicationErrorEntity_Roo_ToString {
    
    public String VrmApplicationErrorEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("ErrorId: ").append(getErrorId()).append(", ");        
        sb.append("ApplicationId: ").append(getApplicationId()).append(", ");        
        sb.append("FailureKey: ").append(getFailureKey()).append(", ");        
        sb.append("ErrorStatusId: ").append(getErrorStatusId()).append(", ");        
        sb.append("LoggedBy: ").append(getLoggedBy()).append(", ");        
        sb.append("LoggedDate: ").append(getLoggedDate()).append(", ");        
        sb.append("ErrorSeverityId: ").append(getErrorSeverityId()).append(", ");        
        sb.append("ApplicationMessage: ").append(getApplicationMessage()).append(", ");        
        sb.append("AcknowledgedBy: ").append(getAcknowledgedBy()).append(", ");        
        sb.append("AcknowledgedDate: ").append(getAcknowledgedDate()).append(", ");        
        sb.append("Comment: ").append(getComment()).append(", ");        
        sb.append("Exception: ").append(getException()).append(", ");        
        sb.append("LastRepeatedDate: ").append(getLastRepeatedDate()).append(", ");        
        sb.append("Hostname: ").append(getHostname()).append(", ");        
        sb.append("ErrorAudits: ").append(getErrorAudits() == null ? "null" : getErrorAudits().size()).append(", ");        
        sb.append("ErrorType: ").append(getErrorType()).append(", ");        
        return sb.toString();        
    }    
    
}
