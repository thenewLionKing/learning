package uk.co.mo.app.mercury.domain.agreement.entity;

import java.lang.String;
import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect VoidAgreementEntity_Roo_Finder {
    
    public static Query VoidAgreementEntity.findVoidAgreementEntitysByArnEquals(String arn) {    
        if (arn == null || arn.length() == 0) throw new IllegalArgumentException("The arn argument is required");        
        EntityManager em = VoidAgreementEntity.entityManager();        
        Query q = em.createQuery("SELECT VoidAgreementEntity FROM VoidAgreementEntity AS voidagreemententity WHERE voidagreemententity.arn = :arn");        
        q.setParameter("arn", arn);        
        return q;        
    }    
 
    public static Query VoidAgreementEntity.findVoidAgreementEntitysByAgreementIdEquals(Integer agreementId) {    
        if (agreementId == null) throw new IllegalArgumentException("The agreementId argument is required");        
        EntityManager em = VoidAgreementEntity.entityManager();        
        Query q = em.createQuery("SELECT VoidAgreementEntity FROM VoidAgreementEntity AS voidagreemententity WHERE voidagreemententity.agreementId = :agreementId");        
        q.setParameter("agreementId", agreementId);        
        return q;        
    }   
}
