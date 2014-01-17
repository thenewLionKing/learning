package uk.co.mo.app.mercury.domain.product.entity;

import java.lang.String;

privileged aspect ProductTypeMakeEntity_Roo_ToString {
    
    public String ProductTypeMakeEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("CreatedBy: ").append(getCreatedBy()).append(", ");        
        sb.append("DateCreated: ").append(getDateCreated()).append(", ");        
        sb.append("EffectiveFrom: ").append(getEffectiveFrom()).append(", ");        
        sb.append("EffectiveTo: ").append(getEffectiveTo()).append(", ");        
        sb.append("LastUpdated: ").append(getLastUpdated()).append(", ");        
        sb.append("UpdatedBy: ").append(getUpdatedBy()).append(", ");        
        sb.append("ProductMake: ").append(getProductMake()).append(", ");        
        sb.append("ProductType: ").append(getProductType()).append(", ");                
        sb.append("Id: ").append(getId()).append(", ");        
        sb.append("Version: ").append(getVersion()).append(", ");                
        return sb.toString();        
    }    
    
}
