package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.String;

privileged aspect ProductOfferingOptionEntity_Roo_ToString {
    
    public String ProductOfferingOptionEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("InsertDate: ").append(getInsertDate()).append(", ");        
        sb.append("InsertUser: ").append(getInsertUser()).append(", ");        
        sb.append("UpdateUser: ").append(getUpdateUser()).append(", ");        
        sb.append("UpdateDate: ").append(getUpdateDate()).append(", ");        
        sb.append("HostName: ").append(getHostName()).append(", ");        
        sb.append("Id: ").append(getId()).append(", ");        
        sb.append("Version: ").append(getVersion()).append(", ");        
        sb.append("ProductOffering: ").append(getProductOffering()).append(", ");        
        sb.append("ProductOptionTypeId: ").append(getProductOptionTypeId()).append(", ");        
        sb.append("Description: ").append(getDescription()).append(", ");        
        sb.append("Cost: ").append(getCost());        
        sb.append("InsertDate: ").append(getInsertDate());        
        sb.append("InsertUser: ").append(getInsertUser());        
        sb.append("UpdateDate: ").append(getUpdateDate());        
        sb.append("UpdateUser: ").append(getUpdateUser());        
        return sb.toString();        
    }    
    
}
