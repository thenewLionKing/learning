package uk.co.mo.app.mercury.domain.org.manufacturer.entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public privileged aspect Manufacturers_Custom_Finder {


    public static Query ManufacturersEntity.findManufacturerByCode(String code) {
        if (code == null || code.length() == 0) throw new IllegalArgumentException("The code argument is required");
        EntityManager em = ManufacturersEntity.entityManager();
        Query q = em.createQuery("SELECT ManufacturersEntity FROM ManufacturersEntity AS manufacturersentity WHERE manufacturersentity.manufacturerCode = :code");
        q.setParameter("code", code);
        return q;
    }
    
    public static Query ManufacturersEntity.findManufacturerByOracleKey(Integer oracleKey) {
        if (oracleKey == null || oracleKey.intValue() == 0) throw new IllegalArgumentException("The oracle key argument is required");
        EntityManager em = ManufacturersEntity.entityManager();
        Query q = em.createQuery("SELECT ManufacturersEntity FROM ManufacturersEntity AS manufacturersentity WHERE manufacturersentity.oracleKey = :oracleKey");
        q.setParameter("oracleKey", oracleKey);
        return q;
    }

    public static Query ManufacturersEntity.countManufacturers() {
        EntityManager em = ManufacturersEntity.entityManager();
        Query q = em.createQuery("SELECT COUNT(o) FROM ManufacturersEntity o");
        return q;
    }
}
