package uk.co.mo.app.mercury.domain.product.entity;

import java.lang.String;
import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect ProductRangeEntity_Roo_Finder {
    
    public static Query ProductRangeEntity.findProductRangeEntitysByNameEquals(String name) {    
        if (name == null || name.length() == 0) throw new IllegalArgumentException("The name argument is required");        
        EntityManager em = ProductRangeEntity.entityManager();        
        Query q = em.createQuery("SELECT ProductRangeEntity FROM ProductRangeEntity AS productrangeentity WHERE productrangeentity.name = :name");        
        q.setParameter("name", name);        
        return q;        
    }  
    
    public static Query ProductRangeEntity.findProductRangeEntitysByIdEquals(Integer id) {    
        if (id == null ) throw new IllegalArgumentException("The Id argument is required");        
        EntityManager em = ProductRangeEntity.entityManager();        
        Query q = em.createQuery("SELECT ProductRangeEntity FROM ProductRangeEntity AS productrangeentity WHERE productrangeentity.id = :id");        
        q.setParameter("id", id);        
        return q;        
    }
    
}
