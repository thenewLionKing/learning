package uk.co.mo.app.mercury.domain.agreement.entity;

import java.lang.String;

privileged aspect AgreementDealerEntity_Roo_ToString {
    
    public String AgreementDealerEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("Id: ").append(getId()).append(", ");        
        sb.append("AgentNumber: ").append(getAgentNumber()).append(", ");        
        sb.append("MoveReason: ").append(getMoveReason()).append(", ");        
        sb.append("StopLetter: ").append(getStopLetter()).append(", ");               
        return sb.toString();        
    }    
    
}
