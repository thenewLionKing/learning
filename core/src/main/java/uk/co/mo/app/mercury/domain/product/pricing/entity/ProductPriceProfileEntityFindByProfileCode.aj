package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.String;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import uk.co.mo.app.mercury.domain.product.pricing.entity.ProductPriceProfileEntity;

public aspect ProductPriceProfileEntityFindByProfileCode {
	public static Query ProductPriceProfileEntity.findPriceProfileEntitysProfileCode(String profileCode) {    
        if (profileCode == null || profileCode.length() == 0) throw new IllegalArgumentException("The profileCode argument is required");  
        EntityManager em = ProductPriceProfileEntity.entityManager();        
        Query q = em.createQuery("SELECT ProductPriceProfileEntity FROM ProductPriceProfileEntity AS productpriceprofileentity WHERE productpriceprofileentity.profileCode = :profileCode");        
        q.setParameter("profileCode", profileCode); 
        return q;        
    }
}
