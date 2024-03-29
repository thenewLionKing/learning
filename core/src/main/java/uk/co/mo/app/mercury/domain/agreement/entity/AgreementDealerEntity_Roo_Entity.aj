// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package uk.co.mo.app.mercury.domain.agreement.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

privileged aspect AgreementDealerEntity_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager AgreementDealerEntity.entityManager;
    
  
    @Transactional
    public void AgreementDealerEntity.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void AgreementDealerEntity.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            AgreementDealerEntity attached = AgreementDealerEntity.findAgreementDealerEntity(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void AgreementDealerEntity.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void AgreementDealerEntity.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public AgreementDealerEntity AgreementDealerEntity.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        AgreementDealerEntity merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager AgreementDealerEntity.entityManager() {
        EntityManager em = new AgreementDealerEntity().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long AgreementDealerEntity.countAgreementDealerEntitys() {
        return entityManager().createQuery("SELECT COUNT(o) FROM AgreementDealerEntity o", Long.class).getSingleResult();
    }
    
    public static List<AgreementDealerEntity> AgreementDealerEntity.findAllAgreementDealerEntitys() {
        return entityManager().createQuery("SELECT o FROM AgreementDealerEntity o", AgreementDealerEntity.class).getResultList();
    }
    
    public static AgreementDealerEntity AgreementDealerEntity.findAgreementDealerEntity(AgreementDealerEntityPK id) {
        if (id == null) return null;
        return entityManager().find(AgreementDealerEntity.class, id);
    }
    
    public static List<AgreementDealerEntity> AgreementDealerEntity.findAgreementDealerEntityEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM AgreementDealerEntity o", AgreementDealerEntity.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
