// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package uk.co.mo.app.mercury.domain.translease.tyre.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

privileged aspect TlNonTyreItemEntity_Roo_Entity {
    
    declare @type: TlNonTyreItemEntity: @Entity;
    
    @PersistenceContext
    transient EntityManager TlNonTyreItemEntity.entityManager;
    
    @Transactional
    public void TlNonTyreItemEntity.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void TlNonTyreItemEntity.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            TlNonTyreItemEntity attached = TlNonTyreItemEntity.findTlNonTyreItemEntity(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void TlNonTyreItemEntity.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void TlNonTyreItemEntity.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public TlNonTyreItemEntity TlNonTyreItemEntity.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        TlNonTyreItemEntity merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager TlNonTyreItemEntity.entityManager() {
        EntityManager em = new TlNonTyreItemEntity().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long TlNonTyreItemEntity.countTlNonTyreItemEntitys() {
        return entityManager().createQuery("SELECT COUNT(o) FROM TlNonTyreItemEntity o", Long.class).getSingleResult();
    }
    
    public static List<TlNonTyreItemEntity> TlNonTyreItemEntity.findAllTlNonTyreItemEntitys() {
        return entityManager().createQuery("SELECT o FROM TlNonTyreItemEntity o", TlNonTyreItemEntity.class).getResultList();
    }
    
    public static TlNonTyreItemEntity TlNonTyreItemEntity.findTlNonTyreItemEntity(TlNonTyreItemPKEntity _id) {
        if (_id == null) return null;
        return entityManager().find(TlNonTyreItemEntity.class, _id);
    }
    
    public static List<TlNonTyreItemEntity> TlNonTyreItemEntity.findTlNonTyreItemEntityEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM TlNonTyreItemEntity o", TlNonTyreItemEntity.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}