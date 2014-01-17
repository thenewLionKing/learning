package uk.co.mo.app.mercury.domain.agreement.entity;

import java.lang.String;

privileged aspect AgreementProductCustomisationEntity_Roo_ToString {
    
    public String AgreementProductCustomisationEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("Id: ").append(getId()).append(", ");        
        sb.append("AgreementProduct: ").append(getAgreementProduct()).append(", ");        
        sb.append("Description: ").append(getDescription()).append(", ");        
        sb.append("Cost: ").append(getCost()).append(", ");        
        sb.append("InsertDate: ").append(getInsertDate()).append(", ");        
        sb.append("InsertUser: ").append(getInsertUser()).append(", ");        
        sb.append("UpdateDate: ").append(getUpdateDate()).append(", ");        
        sb.append("UpdateUser: ").append(getUpdateUser());        
        return sb.toString();        
    }    
    
}
