package uk.co.mo.app.mercury.domain.product.entity;

import java.lang.String;
import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect ProductMakeEntity_Roo_Finder {
    
    public static Query ProductMakeEntity.findProductMakeEntitysByNameEquals(String name) {    
        if (name == null || name.length() == 0) throw new IllegalArgumentException("The name argument is required");        
        EntityManager em = ProductMakeEntity.entityManager();        
        Query q = em.createQuery("SELECT ProductMakeEntity FROM ProductMakeEntity AS productmakeentity WHERE productmakeentity.name = :name");        
        q.setParameter("name", name);        
        return q;        
    }    
    
    public static Query ProductMakeEntity.findProductMakeEntitysByOraclePartyNumberEquals(String oraclePartyNumber) {    
        if (oraclePartyNumber == null || oraclePartyNumber.length() == 0) throw new IllegalArgumentException("The oraclePartyNumber argument is required");        
        EntityManager em = ProductMakeEntity.entityManager();        
        Query q = em.createQuery("SELECT ProductMakeEntity FROM ProductMakeEntity AS productmakeentity WHERE productmakeentity.oraclePartyNumber = :oraclePartyNumber");        
        q.setParameter("oraclePartyNumber", oraclePartyNumber);        
        return q;        
    }    
    
    public static Query ProductMakeEntity.findProductMakeEntitysByIdEquals(Integer id) {    
        if (id == null) throw new IllegalArgumentException("The oraclePartyNumber argument is required");        
        EntityManager em = ProductMakeEntity.entityManager();        
        Query q = em.createQuery("SELECT ProductMakeEntity FROM ProductMakeEntity AS productmakeentity WHERE productmakeentity.id = :id");        
        q.setParameter("id", id);        
        return q;        
    } 
    
}
