/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.domain.serviceagent.entity;

import javax.persistence.EntityManager;
import javax.persistence.Query;


privileged aspect TlSpecialPartEntity_Custom_Finder {

     public static Query TlSpecialPartEntity.findTlSpecialPartsByTLRepairerNumber(Integer repairerNumber) {
        if (repairerNumber == null) throw new IllegalArgumentException("The asset number argument is required");
        EntityManager em = TlSpecialPartEntity.entityManager();
        Query q = em.createQuery("SELECT TlSpecialPartEntity FROM TlSpecialPartEntity AS tlSpecialPartEntity WHERE tlSpecialPartEntity.id.transleaseRepairerNumber = :repairerNumber");
        q.setParameter("repairerNumber", repairerNumber);

        return q;
    }
}
