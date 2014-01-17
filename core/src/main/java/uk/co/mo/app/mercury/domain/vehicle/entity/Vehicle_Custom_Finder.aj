package uk.co.mo.app.mercury.domain.vehicle.entity;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public privileged aspect Vehicle_Custom_Finder {

    public static Query VehicleEntity.countSchemeVehicles() {
        EntityManager em = VehicleEntity.entityManager();
        Query q = em.createQuery("SELECT COUNT(o) FROM VehicleEntity o, AgreementEntity a WHERE a.assetNumber = o.assetNumber AND a.agreementStatus = 1");
        return q;
    }
}
