package uk.co.mo.app.mercury.domain.product.pricing.entity;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public aspect ProductOfferingEntitysfindProductCodeEquals {
	public static Query ProductOfferingEntity.findProductOfferingEntitysProductCodeEquals(String productCode) {    
        if (productCode == null) throw new IllegalArgumentException("The productCode argument is required");  
        EntityManager em = ProductOfferingEntity.entityManager();        
        Query q = em.createQuery("SELECT ProductOfferingEntity FROM ProductOfferingEntity AS productofferingentity WHERE productofferingentity.productCode = :productCode");        
        q.setParameter("productCode", productCode); 
        return q;        
    }    
}
