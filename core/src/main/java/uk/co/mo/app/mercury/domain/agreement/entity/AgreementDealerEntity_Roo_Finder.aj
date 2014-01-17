package uk.co.mo.app.mercury.domain.agreement.entity;

import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.Query;
import uk.co.mo.app.mercury.domain.agreement.entity.AgreementDealerEntityPK;

privileged aspect AgreementDealerEntity_Roo_Finder {
    
    public static Query AgreementDealerEntity.findAgreementDealerEntitysById(AgreementDealerEntityPK id) {    
        if (id == null) throw new IllegalArgumentException("The id argument is required");        
        EntityManager em = AgreementDealerEntity.entityManager();        
        Query q = em.createQuery("SELECT AgreementDealerEntity FROM AgreementDealerEntity AS agreementdealerentity WHERE agreementdealerentity.id = :id");        
        q.setParameter("id", id);        
        return q;        
    }    
    
}
