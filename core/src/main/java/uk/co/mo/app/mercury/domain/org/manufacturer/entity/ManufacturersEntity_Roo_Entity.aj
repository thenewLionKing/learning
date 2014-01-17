// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package uk.co.mo.app.mercury.domain.org.manufacturer.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

privileged aspect ManufacturersEntity_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager ManufacturersEntity.entityManager;
    
    @Transactional
    public void ManufacturersEntity.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void ManufacturersEntity.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            ManufacturersEntity attached = ManufacturersEntity.findManufacturersEntity(this.getManufacturerId());
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void ManufacturersEntity.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void ManufacturersEntity.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public ManufacturersEntity ManufacturersEntity.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        ManufacturersEntity merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager ManufacturersEntity.entityManager() {
        EntityManager em = new ManufacturersEntity().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long ManufacturersEntity.countManufacturersEntitys() {
        return entityManager().createQuery("SELECT COUNT(o) FROM ManufacturersEntity o", Long.class).getSingleResult();
    }
    
    public static List<ManufacturersEntity> ManufacturersEntity.findAllManufacturersEntitys() {
        return entityManager().createQuery("SELECT o FROM ManufacturersEntity o", ManufacturersEntity.class).getResultList();
    }
    
    public static ManufacturersEntity ManufacturersEntity.findManufacturersEntity(Short id) {
        if (id == null) return null;
        return entityManager().find(ManufacturersEntity.class, id);
    }
    
    public static List<ManufacturersEntity> ManufacturersEntity.findManufacturersEntityEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM ManufacturersEntity o", ManufacturersEntity.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
