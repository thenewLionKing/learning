// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package uk.co.mo.app.mercury.domain.serviceagent.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

privileged aspect ServiceAgentEntity_Roo_Entity {
    
    declare @type: ServiceAgentEntity: @Entity;
    
    @PersistenceContext
    transient EntityManager ServiceAgentEntity.entityManager;

    @Transactional
    public void ServiceAgentEntity.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void ServiceAgentEntity.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            ServiceAgentEntity attached = ServiceAgentEntity.findServiceAgentEntity( this.getBean().getTransleaseRepairerNumber() );
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void ServiceAgentEntity.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void ServiceAgentEntity.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public ServiceAgentEntity ServiceAgentEntity.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        ServiceAgentEntity merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager ServiceAgentEntity.entityManager() {
        EntityManager em = new ServiceAgentEntity().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long ServiceAgentEntity.countServiceAgentEntitys() {
        return entityManager().createQuery("SELECT COUNT(o) FROM ServiceAgentEntity o", Long.class).getSingleResult();
    }
    
    public static List<ServiceAgentEntity> ServiceAgentEntity.findAllServiceAgentEntitys() {
        return entityManager().createQuery("SELECT o FROM ServiceAgentEntity o", ServiceAgentEntity.class).getResultList();
    }
    
    public static ServiceAgentEntity ServiceAgentEntity.findServiceAgentEntity(Integer _id) {
        if (_id == null) return null;
        return entityManager().find(ServiceAgentEntity.class, _id);
    }
    
    public static List<ServiceAgentEntity> ServiceAgentEntity.findServiceAgentEntityEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM ServiceAgentEntity o", ServiceAgentEntity.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
