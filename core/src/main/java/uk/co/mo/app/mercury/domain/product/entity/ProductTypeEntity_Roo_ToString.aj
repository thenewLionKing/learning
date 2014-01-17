package uk.co.mo.app.mercury.domain.product.entity;

import java.lang.String;

privileged aspect ProductTypeEntity_Roo_ToString {
    
    public String ProductTypeEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("Description: ").append(getDescription()).append(", ");        
        sb.append("ProductClassifications: ").append(getProductClassifications() == null ? "null" : getProductClassifications().size()).append(", ");        
        sb.append("ProductModels: ").append(getProductModels() == null ? "null" : getProductModels().size()).append(", ");        
        sb.append("ProductOriginators: ").append(getProductMakes() == null ? "null" : getProductMakes().size()).append(", ");        
        sb.append("Id: ").append(getId()).append(", ");        
       // sb.append("Version: ").append(getVersion());        
        return sb.toString();        
    }    
    
}
