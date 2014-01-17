package uk.co.mo.app.mercury.domain.agreement.entity;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public privileged aspect Agreement_Custom_Finder {

    public static Query AgreementEntity.countLiveAgreements() {
        EntityManager em = AgreementEntity.entityManager();
        Query q = em.createQuery("SELECT COUNT(o) FROM AgreementEntity o WHERE o.agreementStatus = 1");
        return q;
    }
}