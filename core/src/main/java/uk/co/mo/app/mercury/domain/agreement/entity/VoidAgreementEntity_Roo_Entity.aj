package uk.co.mo.app.mercury.domain.agreement.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;

import org.springframework.transaction.annotation.Transactional;

privileged aspect VoidAgreementEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager VoidAgreementEntity.entityManager;    
            
    @Transactional    
    public void VoidAgreementEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void VoidAgreementEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {   
            VoidAgreementEntity attached = this.entityManager.find(VoidAgreementEntity.class, this.getAgreementId());
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void VoidAgreementEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void VoidAgreementEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        VoidAgreementEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.setAgreementId(merged.getAgreementId());
    }    
    
    public static final EntityManager VoidAgreementEntity.entityManager() {    
        EntityManager em = new VoidAgreementEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long VoidAgreementEntity.countVoidAgreementEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from VoidAgreementEntity o").getSingleResult();        
    }    
    
    public static List<VoidAgreementEntity> VoidAgreementEntity.findAllVoidAgreementEntitys() {    
        return entityManager().createQuery("select o from VoidAgreementEntity o").getResultList();        
    }    
    
    public static VoidAgreementEntity VoidAgreementEntity.findVoidAgreementEntity(Integer id) {
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of VoidAgreementEntity");        
        return entityManager().find(VoidAgreementEntity.class, id);        
    }    
    
    public static List<VoidAgreementEntity> VoidAgreementEntity.findVoidAgreementEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from VoidAgreementEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
