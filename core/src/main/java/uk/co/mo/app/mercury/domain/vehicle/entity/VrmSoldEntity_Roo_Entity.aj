// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

privileged aspect VrmSoldEntity_Roo_Entity {
    
    declare @type: VrmSoldEntity: @Entity;
    
    @PersistenceContext
    transient EntityManager VrmSoldEntity.entityManager;
    
    @Transactional
    public void VrmSoldEntity.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void VrmSoldEntity.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            VrmSoldEntity attached = VrmSoldEntity.findVrmSoldEntity(this.vrmSoldBean.getSoldId());
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void VrmSoldEntity.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void VrmSoldEntity.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public VrmSoldEntity VrmSoldEntity.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        VrmSoldEntity merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager VrmSoldEntity.entityManager() {
        EntityManager em = new VrmSoldEntity().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long VrmSoldEntity.countVrmSoldEntitys() {
        return entityManager().createQuery("SELECT COUNT(o) FROM VrmSoldEntity o", Long.class).getSingleResult();
    }
    
    public static List<VrmSoldEntity> VrmSoldEntity.findAllVrmSoldEntitys() {
        return entityManager().createQuery("SELECT o FROM VrmSoldEntity o", VrmSoldEntity.class).getResultList();
    }
    
    public static VrmSoldEntity VrmSoldEntity.findVrmSoldEntity(Integer soldId) {
        if (soldId == null) return null;
        return entityManager().find(VrmSoldEntity.class, soldId);
    }
    
    public static List<VrmSoldEntity> VrmSoldEntity.findVrmSoldEntityEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM VrmSoldEntity o", VrmSoldEntity.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static VrmSoldEntity VrmSoldEntity.findVrmSoldEntityByStockId(Integer stockId){
    try{
    	if(stockId==null) throw new IllegalArgumentException ("Stock id required");
    	EntityManager em = VrmSoldEntity.entityManager();
    	Query q = em.createQuery("SELECT VrmSoldEntity FROM VrmSoldEntity AS vrmSoldEntity WHERE vrmSoldEntity.stockId = :stockId");
    	q.setParameter("stockId", stockId);
    	return (VrmSoldEntity)q.getSingleResult();
    }catch(Exception e) {
            return null;
        }
    }
}
