package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.String;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public aspect HireTermEntity_Roo_Finder {
	
	public static Query HireTermEntity.findHireTermEntityEntityByCodeEquals(String code) {    
        if (code == null || code.length() == 0) throw new IllegalArgumentException("The Code argument is required");        
        EntityManager em = HireTermEntity.entityManager();        
        Query q = em.createQuery("SELECT HireTermEntity FROM HireTermEntity AS hiretermentity WHERE hiretermentity.code = :code");        
        q.setParameter("code", code);        
        return q;        
    }   
}
