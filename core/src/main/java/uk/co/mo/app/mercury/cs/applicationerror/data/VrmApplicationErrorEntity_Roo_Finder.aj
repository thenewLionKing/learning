package uk.co.mo.app.mercury.cs.applicationerror.data;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import uk.co.mo.app.mercury.cs.applicationerror.data.VrmErrorTypeEntity;

privileged aspect VrmApplicationErrorEntity_Roo_Finder {
    
    public static Query VrmApplicationErrorEntity.findVrmApplicationErrorEntitysByErrorType(VrmErrorTypeEntity errorType) {
        if (errorType == null) throw new IllegalArgumentException("The errorType argument is required");
        EntityManager em = VrmApplicationErrorEntity.entityManager();
        Query q = em.createQuery("SELECT VrmApplicationErrorEntity FROM VrmApplicationErrorEntity AS vrmapplicationerrorentity WHERE vrmapplicationerrorentity.errorType = :errorType");
        q.setParameter("errorType", errorType);
        return q;
    }

    public static Query VrmApplicationErrorEntity.findByTypeAndStatusAndFailureKey(
            VrmErrorTypeEntity errorType,
            int status,
            String failureKey
    ) {
        if (errorType == null) throw new IllegalArgumentException("The errorType argument is required");
        EntityManager em = VrmApplicationErrorEntity.entityManager();
        Query q = em.createQuery("SELECT VrmApplicationErrorEntity FROM VrmApplicationErrorEntity AS vrmapplicationerrorentity WHERE vrmapplicationerrorentity.errorType = :errorType AND vrmapplicationerrorentity.errorStatusId = :status AND vrmapplicationerrorentity.failureKey = :failureKey");
        q.setParameter("errorType", errorType);
        q.setParameter("status", status);
        q.setParameter("failureKey", failureKey);
        return q;
    }
    
}
