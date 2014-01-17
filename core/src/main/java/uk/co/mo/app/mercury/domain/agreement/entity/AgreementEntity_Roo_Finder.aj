package uk.co.mo.app.mercury.domain.agreement.entity;

import java.lang.String;
import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect AgreementEntity_Roo_Finder {
    
    public static Query AgreementEntity.findAgreementEntitysByArnEquals(String arn) {    
        if (arn == null || arn.length() == 0) throw new IllegalArgumentException("The arn argument is required");        
        EntityManager em = AgreementEntity.entityManager();        
        Query q = em.createQuery("SELECT AgreementEntity FROM AgreementEntity AS agreemententity WHERE agreemententity.arn = :arn");        
        q.setParameter("arn", arn);        
        return q;        
    }    
    
}
