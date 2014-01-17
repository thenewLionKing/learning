// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package uk.co.mo.app.mercury.domain.agreement.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;

import org.springframework.transaction.annotation.Transactional;

privileged aspect AgreementExtensionEntity_Roo_Entity {
    
    declare @type: AgreementExtensionEntity: @Entity;
    
    @PersistenceContext
    transient EntityManager AgreementExtensionEntity.entityManager;
    

    @Transactional
    public void AgreementExtensionEntity.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void AgreementExtensionEntity.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            AgreementExtensionEntity attached = AgreementExtensionEntity.findAgreementExtensionEntity(this.getAgreementId());
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void AgreementExtensionEntity.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void AgreementExtensionEntity.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public AgreementExtensionEntity AgreementExtensionEntity.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        AgreementExtensionEntity merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager AgreementExtensionEntity.entityManager() {
        EntityManager em = new AgreementExtensionEntity().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long AgreementExtensionEntity.countAgreementExtensionEntitys() {
        return entityManager().createQuery("SELECT COUNT(o) FROM AgreementExtensionEntity o", Long.class).getSingleResult();
    }
    
    public static List<AgreementExtensionEntity> AgreementExtensionEntity.findAllAgreementExtensionEntitys() {
        return entityManager().createQuery("SELECT o FROM AgreementExtensionEntity o", AgreementExtensionEntity.class).getResultList();
    }
    
    public static AgreementExtensionEntity AgreementExtensionEntity.findAgreementExtensionEntity(Integer id) {
        if (id == null) return null;
        return entityManager().find(AgreementExtensionEntity.class, id);
    }
    
    public static List<AgreementExtensionEntity> AgreementExtensionEntity.findAgreementExtensionEntityEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM AgreementExtensionEntity o", AgreementExtensionEntity.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}