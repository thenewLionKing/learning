/**
 * Copyright (c) 2001 Motability Operations PLC. All Rights Reserved.
 * This work is a trade secret of MO and unauthorized use or copying is prohibited.
 *
 */
package uk.co.mo.app.mercury.domain.customer.entity;

import javax.persistence.EntityManager;
import javax.persistence.Query;


public privileged aspect CustomerCRNNumberEntity_Custom_Finder {

     public static Query CustomerEntity.findCustomerByCRNNumber(String crnNumber) {
        if (crnNumber == null) throw new IllegalArgumentException("The crn number argument is required");
        EntityManager em = CustomerEntity.entityManager();
        Query q = em.createQuery("SELECT CustomerEntity FROM CustomerEntity AS customerentity WHERE customerentity.crn = :crnNumber");
        q.setParameter("crnNumber", crnNumber);
        return q;
    }

    public static Query CustomerEntity.countLiveCustomers() {
        EntityManager em = CustomerEntity.entityManager();
        Query q = em.createQuery("SELECT COUNT(o) FROM CustomerEntity o, AgreementEntity a WHERE a.applicant = o.customerId AND a.agreementStatus = 1");
        return q;
    }
}
