/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.domain.agreement.entity;

import javax.persistence.EntityManager;
import javax.persistence.Query;


privileged aspect AgreementAssetNumberEntity_Custom_Finder {

     public static Query AgreementEntity.findAgreementByAssetNumber(Integer assetNumber) {
        if (assetNumber == null) throw new IllegalArgumentException("The asset number argument is required");
        EntityManager em = AgreementEntity.entityManager();
        Query q = em.createQuery("SELECT AgreementEntity FROM AgreementEntity AS agreemententity WHERE agreemententity.assetNumber = :assetNumber");
        q.setParameter("assetNumber", assetNumber);
        return q;
    }
}
