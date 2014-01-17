package uk.co.mo.app.mercury.domain.product.entity;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import uk.co.mo.app.mercury.domain.product.pricing.entity.ProductOfferingEntity;

public aspect ProductModelEntitysfindProductModelNameEquals {
	public static Query ProductModelEntity.findProductProductModelEntityEquals(String name) {    
        if (name == null) throw new IllegalArgumentException("The productCode argument is required");  
        EntityManager em = ProductModelEntity.entityManager();        
        Query q = em.createQuery("SELECT ProductModelEntity FROM ProductModelEntity AS productmodelentity WHERE productmodelentity.name = :name");        
        q.setParameter("name", name); 
        return q;        
    }    

}
