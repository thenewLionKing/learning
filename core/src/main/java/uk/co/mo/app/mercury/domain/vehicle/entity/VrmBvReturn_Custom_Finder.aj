package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public privileged aspect VrmBvReturn_Custom_Finder {
	

    public static List<VrmBvReturnEntity> VrmBvReturnEntity.findAllEntitiesByStockId(Integer stockId) {
        if (stockId == null) throw new IllegalArgumentException("The stock Id argument is required");
        EntityManager em = VrmBvReturnEntity.entityManager();
//        TypedQuery<VrmBvReturnEntity> q = em.createQuery("SELECT VrmBvReturnEntity FROM VrmBvReturnEntity AS vrmbvreturnentity " +
//        		"WHERE vrmbvreturnentity.stockId = :stockId", VrmBvReturnEntity.class);
        Query q = em.createQuery("SELECT VrmBvReturnEntity FROM VrmBvReturnEntity AS vrmbvreturnentity " +
        		"WHERE vrmbvreturnentity.stockId = :stockId");
        q.setParameter("stockId", stockId);
        List<VrmBvReturnEntity> list = q.getResultList();
        return list;
    }
}
