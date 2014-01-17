package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.String;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public aspect BenifitTypeEntity_Roo_Finder {
	public static Query BenifitTypeEntity.findBenifitTypeEntityByBenefitCodeEquals(String benifitCode) {    
        if (benifitCode == null || benifitCode.length() == 0) throw new IllegalArgumentException("The benefitCode argument is required");        
        EntityManager em = BenifitTypeEntity.entityManager();        
        Query q = em.createQuery("SELECT BenifitTypeEntity FROM BenifitTypeEntity AS benifittypeentity WHERE benifittypeentity.benifitCode = :benifitCode");        
        q.setParameter("benifitCode", benifitCode);        
        return q;        
    }   
}
