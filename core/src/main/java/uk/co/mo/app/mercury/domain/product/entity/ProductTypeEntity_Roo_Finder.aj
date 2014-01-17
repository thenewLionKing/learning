package uk.co.mo.app.mercury.domain.product.entity;

import java.lang.String;
import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect ProductTypeEntity_Roo_Finder {
    
    public static Query ProductTypeEntity.findProductTypeEntitysByNameEquals(String name) {    
        if (name == null || name.length() == 0) throw new IllegalArgumentException("The name argument is required");        
        EntityManager em = ProductTypeEntity.entityManager();        
        Query q = em.createQuery("SELECT ProductTypeEntity FROM ProductTypeEntity AS producttypeentity WHERE producttypeentity.name = :name");        
        q.setParameter("name", name);        
        return q;        
    }    
    
}
