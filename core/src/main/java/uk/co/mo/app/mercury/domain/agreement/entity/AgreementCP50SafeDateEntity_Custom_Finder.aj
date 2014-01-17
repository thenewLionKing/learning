/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.domain.agreement.entity;

import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * <p/>
 * User: PrabaT
 * Date: 06-Apr-2010
 * Time: 11:27:34
 * <p/>
 * Change Log - Who : When : Comment
 */
privileged aspect AgreementCP50SafeDateEntity_Custom_Finder {

     public static Query AgreementCP50SafeDateEntity.findAgreementCP50SafeDateEntitysByAgreement(Integer agreementId) {
        if (agreementId == null) throw new IllegalArgumentException("The agreement Id argument is required");
        EntityManager em = AgreementCP50SafeDateEntity.entityManager();
        Query q = em.createQuery("SELECT AgreementCP50SafeDateEntity FROM AgreementCP50SafeDateEntity AS agreementcp50safedateentity WHERE agreementcp50safedateentity.agreement.agreementId = :agreementId");
        q.setParameter("agreementId", agreementId);
        return q;
    }
}
