package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.String;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Date;

import uk.co.mo.app.mercury.domain.product.pricing.entity.ProductPriceProfileEntity;

privileged aspect PriceProfileEntitysFinderByProfileCodeEndDateEquals {
	public static Query ProductPriceProfileEntity.findPriceProfileEntitysByProfileCodeEquals(String profileCode, Date endDate) {    
        if (profileCode == null || profileCode.length() == 0) throw new IllegalArgumentException("The profileCode argument is required");  
        if (endDate == null) throw new IllegalArgumentException("The End Date argument is required");  
        EntityManager em = ProductPriceProfileEntity.entityManager();        
        Query q = em.createQuery("SELECT ProductPriceProfileEntity FROM ProductPriceProfileEntity AS productpriceProfileentity WHERE productpriceProfileentity.profileCode = :profileCode AND priceprofileentity.effectiveTo =:endDate");        
        q.setParameter("profileCode", profileCode); 
        q.setParameter("endDate", endDate);
        return q;        
    }    
}
