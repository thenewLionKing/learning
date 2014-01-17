package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.String;

privileged aspect ProductOfferingEntity_Roo_ToString {
    
    public String ProductOfferingEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("EffectiveFrom: ").append(getEffectiveFrom()).append(", ");        
        sb.append("EffectiveTo: ").append(getEffectiveTo()).append(", ");        
        sb.append("InsertDate: ").append(getInsertDate()).append(", ");        
        sb.append("InsertUser: ").append(getInsertUser()).append(", ");        
        sb.append("IsHidden: ").append(isIsHidden()).append(", ");        
        sb.append("IsOneOff: ").append(isIsOneOff()).append(", ");        
        sb.append("ProductCode: ").append(getProductCode()).append(", ");        
        sb.append("ProductModelId: ").append(getProductModelId()).append(", ");        
        sb.append("ProductTypeId: ").append(getProductType().getId()).append(", ");        
        sb.append("UpdateDate: ").append(getUpdateDate()).append(", ");        
        sb.append("UpdateUser: ").append(getUpdateUser()).append(", ");        
        sb.append("Product Options: ").append(getOptions() == null ? "null" : getOptions().size()).append(", ");        
        sb.append("ProductPriceProfiles: ").append(getProductPriceProfiles() == null ? "null" : getProductPriceProfiles().size()).append(", ");        
        sb.append("Id: ").append(getId()).append(", ");        
        sb.append("Version: ").append(getVersion());        
        sb.append("IsHidden: ").append(isIsHidden());        
        sb.append("IsOneOff: ").append(isIsOneOff());        
        return sb.toString();        
    }    
    
}
