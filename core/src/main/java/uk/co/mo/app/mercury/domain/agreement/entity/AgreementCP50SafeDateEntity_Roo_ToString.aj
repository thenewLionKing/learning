package uk.co.mo.app.mercury.domain.agreement.entity;

import java.lang.String;

privileged aspect AgreementCP50SafeDateEntity_Roo_ToString {
    
    public String AgreementCP50SafeDateEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("AgreementSafeDateId: ").append(getAgreementSafeDateId()).append(", ");        
        sb.append("SafeDateStatusId: ").append(getSafeDateStatusId()).append(", ");        
        sb.append("SafeDate: ").append(getSafeDate()).append(", ");        
        sb.append("InsertDate: ").append(getInsertDate()).append(", ");        
        sb.append("InsertUser: ").append(getInsertUser()).append(", ");        
        sb.append("Agreement: ").append(getAgreement()).append(", ");               
        return sb.toString();        
    }    
    
}
