package uk.co.mo.app.mercury.domain.pin.entity;

import java.lang.String;

privileged aspect AgreementCustomerEsignaturePinEntity_Roo_ToString {
    
    public String AgreementCustomerEsignaturePinEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("PinId: ").append(getPinId()).append(", ");        
        sb.append("InsertDate: ").append(getInsertDate()).append(", ");        
        sb.append("InsertUser: ").append(getInsertUser()).append(", ");        
        sb.append("Serialversionuid: ").append(getSerialversionuid()).append(", ");        
        sb.append("EsignaturePinId: ").append(getEsignaturePinId()).append(", ");        
        sb.append("AgreementId: ").append(getAgreementId()).append(", ");        
        sb.append("CustomerId: ").append(getCustomerId()).append(", ");        
        sb.append("Id: ").append(this.getEsignaturePinId()).append(", ");             
        return sb.toString();        
    }    
    
}
