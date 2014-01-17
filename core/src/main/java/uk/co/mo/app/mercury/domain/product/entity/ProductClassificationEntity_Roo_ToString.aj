package uk.co.mo.app.mercury.domain.product.entity;

import java.lang.String;

privileged aspect ProductClassificationEntity_Roo_ToString {
    
    public String ProductClassificationEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("CreatedBy: ").append(getCreatedBy()).append(", ");        
        sb.append("DateCreated: ").append(getDateCreated()).append(", ");        
        sb.append("Description: ").append(getDescription()).append(", ");        
        sb.append("EffectiveFrom: ").append(getEffectiveFrom()).append(", ");        
        sb.append("EffectiveTo: ").append(getEffectiveTo()).append(", ");        
        sb.append("LastUpdated: ").append(getLastUpdated()).append(", ");        
        sb.append("Name: ").append(getName()).append(", ");        
        sb.append("UpdatedBy: ").append(getUpdatedBy()).append(", ");        
        sb.append("ProductType: ").append(getProductType()).append(", ");        
        sb.append("ProductModels: ").append(getProductModels() == null ? "null" : getProductModels().size()).append(", ");        
        sb.append("Id: ").append(getId()).append(", ");        
        sb.append("Version: ").append(getVersion());        
        return sb.toString();        
    }    
    
}
