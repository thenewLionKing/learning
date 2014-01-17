package uk.co.mo.app.mercury.domain.product.entity;

import java.lang.String;
import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect ProductClassificationEntity_Roo_Finder {
    
    public static Query ProductClassificationEntity.findProductClassificationEntitysByNameEquals(String name) {    
        if (name == null || name.length() == 0) throw new IllegalArgumentException("The name argument is required");        
        EntityManager em = ProductClassificationEntity.entityManager();        
        Query q = em.createQuery("SELECT ProductClassificationEntity FROM ProductClassificationEntity AS productclassificationentity WHERE productclassificationentity.name = :name");        
        q.setParameter("name", name);        
        return q;        
    }    
    
}
