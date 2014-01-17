package uk.co.mo.app.mercury.domain.agreement.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;

import org.springframework.transaction.annotation.Transactional;

privileged aspect AgreementEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager AgreementEntity.entityManager;    
            
    @Version    
    @Column(name = "version" ,   columnDefinition="BigInteger")    
    private Integer AgreementEntity.version;    
    
     
    public Integer AgreementEntity.getVersion() {    
        return this.version;        
    }    
    
    public void AgreementEntity.setVersion(Integer version) {    
        this.version = version;        
    }    
    
    @Transactional    
    public void AgreementEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void AgreementEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {   
            AgreementEntity attached = this.entityManager.find(AgreementEntity.class, this.getAgreementId());
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void AgreementEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void AgreementEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        AgreementEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.setAgreementId(merged.getAgreementId());
    }    
    
    public static final EntityManager AgreementEntity.entityManager() {    
        EntityManager em = new AgreementEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long AgreementEntity.countAgreementEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from AgreementEntity o").getSingleResult();        
    }    
    
    public static List<AgreementEntity> AgreementEntity.findAllAgreementEntitys() {    
        return entityManager().createQuery("select o from AgreementEntity o").getResultList();        
    }    
    
    public static AgreementEntity AgreementEntity.findAgreementEntity(Integer id) {
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of AgreementEntity");        
        return entityManager().find(AgreementEntity.class, id);        
    }    
    
    public static List<AgreementEntity> AgreementEntity.findAgreementEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from AgreementEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
