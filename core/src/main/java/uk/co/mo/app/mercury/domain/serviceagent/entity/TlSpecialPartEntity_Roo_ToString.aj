// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package uk.co.mo.app.mercury.domain.serviceagent.entity;

import java.lang.String;

privileged aspect TlSpecialPartEntity_Roo_ToString {
    
    public String TlSpecialPartEntity.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppliedLevel: ").append(getAppliedLevel()).append(", ");
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("RateApplicable: ").append(getRateApplicable()).append(", ");
        sb.append("SendToTranslease: ").append(getSendToTranslease()).append(", ");
        sb.append("TransleaseLeasecoRef: ").append(getTransleaseLeasecoRef()).append(", ");
        sb.append("TransmissionAction: ").append(getTransmissionAction()).append(", ");
        return sb.toString();
    }
    
}
