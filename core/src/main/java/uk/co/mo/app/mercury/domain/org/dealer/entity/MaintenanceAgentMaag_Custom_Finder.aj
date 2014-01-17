package uk.co.mo.app.mercury.domain.org.dealer.entity;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public privileged aspect MaintenanceAgentMaag_Custom_Finder {

    public static Query MaintenanceAgentMaagEntity.countActiveDealers() {
        EntityManager em = MaintenanceAgentMaagEntity.entityManager();
        Query q = em.createQuery("SELECT COUNT(o) FROM MaintenanceAgentMaagEntity o WHERE o.activeStatus = 'Y'");
        return q;
    }
}
