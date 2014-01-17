package uk.co.mo.app.mercury.domain.product.entity;

import java.lang.String;

privileged aspect ProductRangeEntity_Roo_ToString {
    
    public String ProductRangeEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("InsertUser: ").append(getInsertUser()).append(", ");        
        sb.append("InsertDate: ").append(getInsertDate()).append(", ");        
        sb.append("Description: ").append(getDescription()).append(", ");        
        sb.append("EffectiveFrom: ").append(getEffectiveFrom()).append(", ");        
        sb.append("EffectiveTo: ").append(getEffectiveTo()).append(", ");        
        sb.append("UpdateDate: ").append(getUpdateDate()).append(", ");        
        sb.append("Name: ").append(getName()).append(", ");        
        sb.append("UpdateUser: ").append(getUpdateUser()).append(", ");        
        sb.append("ProductModels: ").append(getProductModels() == null ? "null" : getProductModels().size()).append(", ");                   
        sb.append("Id: ").append(getId()).append(", ");        
        sb.append("Version: ").append(getVersion()).append(", ");        
        sb.append("ProductMake: ").append(getProductMake());        
        return sb.toString();        
    }    
    
}
