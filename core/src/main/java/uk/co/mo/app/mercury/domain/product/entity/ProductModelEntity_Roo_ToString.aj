package uk.co.mo.app.mercury.domain.product.entity;

import java.lang.String;

privileged aspect ProductModelEntity_Roo_ToString {
    
    public String ProductModelEntity.toString() {    
        StringBuilder sb = new StringBuilder();        
        sb.append("InsertDate: ").append(getInsertDate()).append(", ");        
        sb.append("InsertUser: ").append(getInsertUser()).append(", ");        
        sb.append("UpdateUser: ").append(getUpdateUser()).append(", ");        
        sb.append("UpdateDate: ").append(getUpdateDate()).append(", ");        
        sb.append("HostName: ").append(getHostName()).append(", ");        
        sb.append("InsertUser: ").append(getInsertUser()).append(", ");        
        sb.append("InsertDate: ").append(getInsertDate()).append(", ");        
        sb.append("UpdateUser: ").append(getUpdateUser()).append(", ");        
        sb.append("UpdateDate: ").append(getUpdateDate()).append(", ");        
        sb.append("EffectiveFrom: ").append(getEffectiveFrom()).append(", ");        
        sb.append("EffectiveTo: ").append(getEffectiveTo()).append(", ");        
        sb.append("HeightCm: ").append(getHeightCm()).append(", ");        
        sb.append("InvalidCarriageClass: ").append(getInvalidCarriageClass()).append(", ");        
        sb.append("LengthCm: ").append(getLengthCm()).append(", ");        
        sb.append("MaxUserWeightKg: ").append(getMaxUserWeightKg()).append(", ");        
        sb.append("MaximumRangeMiles: ").append(getMaximumRangeMiles()).append(", ");        
        sb.append("MaximumSpeedMph: ").append(getMaximumSpeedMph()).append(", ");        
        sb.append("Name: ").append(getName()).append(", ");        
        sb.append("NumberOfWheels: ").append(getNumberOfWheels()).append(", ");        
        sb.append("WeightKg: ").append(getWeightKg()).append(", ");        
        sb.append("WidthCm: ").append(getWidthCm()).append(", ");        
        sb.append("ProductClassification: ").append(getProductClassification());        
        sb.append("ProductRange: ").append(getProductRange());        
        sb.append("ProductType: ").append(getProductType());        
        sb.append("Id: ").append(getId());        
        sb.append("Version: ").append(getVersion());        
        return sb.toString();        
    }    
    
}
