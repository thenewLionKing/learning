package uk.co.mo.app.mercury.domain.agreement.entity;

import java.lang.String;

privileged aspect AgreementDeliveryDateHistoryEntity_Roo_ToString {
    
    public String AgreementDeliveryDateHistoryEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("AgreementDeliveryDateId: ").append(getAgreementDeliveryDateId()).append(", ");        
        sb.append("AgreementDeliveryDateWarningId: ").append(getAgreementDeliveryDateWarningId()).append(", ");        
        sb.append("DateType: ").append(getDateType()).append(", ");        
        sb.append("DeliveryDate: ").append(getDeliveryDate()).append(", ");        
        sb.append("InsertDate: ").append(getInsertDate()).append(", ");        
        sb.append("InsertUser: ").append(getInsertUser()).append(", ");        
        sb.append("Processed: ").append(getProcessed()).append(", ");        
        sb.append("ProcessedDate: ").append(getProcessedDate()).append(", ");        
        return sb.toString();        
    }    
    
}
