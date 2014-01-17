// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package uk.co.mo.app.mercury.domain.org.dealer.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

privileged aspect DealerGroupEntity_Roo_Entity {
    
    declare @type: DealerGroupEntity: @Entity;
    
    @PersistenceContext
    transient EntityManager DealerGroupEntity.entityManager;
    
    @Transactional
    public void DealerGroupEntity.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void DealerGroupEntity.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            DealerGroupEntity attached = DealerGroupEntity.findDealerGroupEntity(this.getGroupNumber());
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void DealerGroupEntity.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void DealerGroupEntity.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public DealerGroupEntity DealerGroupEntity.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        DealerGroupEntity merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager DealerGroupEntity.entityManager() {
        EntityManager em = new DealerGroupEntity().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long DealerGroupEntity.countDealerGroupEntitys() {
        return entityManager().createQuery("SELECT COUNT(o) FROM DealerGroupEntity o", Long.class).getSingleResult();
    }
    
    public static List<DealerGroupEntity> DealerGroupEntity.findAllDealerGroupEntitys() {
        return entityManager().createQuery("SELECT o FROM DealerGroupEntity o", DealerGroupEntity.class).getResultList();
    }
    
    public static DealerGroupEntity DealerGroupEntity.findDealerGroupEntity(Integer id) {
        if (id == null) return null;
        return entityManager().find(DealerGroupEntity.class, id);
    }
    
    public static List<DealerGroupEntity> DealerGroupEntity.findDealerGroupEntityEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM DealerGroupEntity o", DealerGroupEntity.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
