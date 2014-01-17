package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.String;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import uk.co.mo.app.mercury.domain.product.pricing.entity.ProfileTypeEntity;

privileged aspect ProfileTypeEntity_Roo_Finder {
    
    public static Query ProfileTypeEntity.findProfileTypeEntityByProfileType(String profileType) {    
        if (profileType == null || profileType.length() == 0) throw new IllegalArgumentException("The profileCode argument is required");        
        EntityManager em = ProfileTypeEntity.entityManager();        
        Query q = em.createQuery("SELECT ProfileTypeEntity FROM ProfileTypeEntity AS profiletypeentity WHERE profiletypeentity.profileType = :profileType");        
        q.setParameter("profileType", profileType);        
        return q;        
    }    
    
}
