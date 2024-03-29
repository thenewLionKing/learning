// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package uk.co.mo.app.mercury.domain.serviceagent.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

privileged aspect TlSpecialPartEntity_Roo_Entity {

    declare @type: TlSpecialPartEntity: @Entity;

    @PersistenceContext
    transient EntityManager TlSpecialPartEntity.entityManager;

    @Transactional
    public void TlSpecialPartEntity.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void TlSpecialPartEntity.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            TlSpecialPartEntity attached = TlSpecialPartEntity.findTlSpecialPartEntity( this.id );
            this.entityManager.remove(attached);
        }
    }

    @Transactional
    public void TlSpecialPartEntity.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void TlSpecialPartEntity.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public TlSpecialPartEntity TlSpecialPartEntity.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        TlSpecialPartEntity merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager TlSpecialPartEntity.entityManager() {
        EntityManager em = new TlSpecialPartEntity().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long TlSpecialPartEntity.countTlSpecialPartEntitys() {
        return entityManager().createQuery("SELECT COUNT(o) FROM TlSpecialPartEntity o", Long.class).getSingleResult();
    }
    
    public static List<TlSpecialPartEntity> TlSpecialPartEntity.findAllTlSpecialPartEntitys() {
        return entityManager().createQuery("SELECT o FROM TlSpecialPartEntity o", TlSpecialPartEntity.class).getResultList();
    }
    
    public static TlSpecialPartEntity TlSpecialPartEntity.findTlSpecialPartEntity(TlSpecialPartPKEntity _id) {
        if (_id == null) return null;
        return entityManager().find(TlSpecialPartEntity.class, _id);
    }
    
    public static List<TlSpecialPartEntity> TlSpecialPartEntity.findTlSpecialPartEntityEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM TlSpecialPartEntity o", TlSpecialPartEntity.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
