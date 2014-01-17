package uk.co.mo.app.mercury.domain.agreement.entity;

import java.lang.Integer;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;
import uk.co.mo.app.mercury.domain.agreement.entity.AgreementCP50SafeDateEntity;

privileged aspect AgreementCP50SafeDateEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager AgreementCP50SafeDateEntity.entityManager;    
    
 
    
    @Transactional    
    public void AgreementCP50SafeDateEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void AgreementCP50SafeDateEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            AgreementCP50SafeDateEntity attached = this.entityManager.find(AgreementCP50SafeDateEntity.class, this.agreementSafeDateId);            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void AgreementCP50SafeDateEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void AgreementCP50SafeDateEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        AgreementCP50SafeDateEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.agreementSafeDateId = merged.getAgreementSafeDateId();        
    }    
    
    public static final EntityManager AgreementCP50SafeDateEntity.entityManager() {    
        EntityManager em = new AgreementCP50SafeDateEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long AgreementCP50SafeDateEntity.countAgreementCP50SafeDateEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from AgreementCP50SafeDateEntity o").getSingleResult();        
    }    
    
    public static List<AgreementCP50SafeDateEntity> AgreementCP50SafeDateEntity.findAllAgreementCP50SafeDateEntitys() {    
        return entityManager().createQuery("select o from AgreementCP50SafeDateEntity o").getResultList();        
    }    
    
    public static AgreementCP50SafeDateEntity AgreementCP50SafeDateEntity.findAgreementCP50SafeDateEntity(Integer id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of AgreementCP50SafeDateEntity");        
        return entityManager().find(AgreementCP50SafeDateEntity.class, id);        
    }    
    
    public static List<AgreementCP50SafeDateEntity> AgreementCP50SafeDateEntity.findAgreementCP50SafeDateEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from AgreementCP50SafeDateEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
