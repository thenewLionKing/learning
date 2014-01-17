package uk.co.mo.app.mercury.domain.agreement.entity;

import java.lang.Integer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import uk.co.mo.app.mercury.domain.agreement.entity.AgreementProductCustomisationEntity;

privileged aspect AgreementProductCustomisationEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager AgreementProductCustomisationEntity.entityManager;    
    
    @Transactional    
    public void AgreementProductCustomisationEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void AgreementProductCustomisationEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            AgreementProductCustomisationEntity attached = this.entityManager.find(AgreementProductCustomisationEntity.class, this.id);            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void AgreementProductCustomisationEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void AgreementProductCustomisationEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        AgreementProductCustomisationEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.id = merged.getId();        
    }    
    
    public static final EntityManager AgreementProductCustomisationEntity.entityManager() {    
        EntityManager em = new AgreementProductCustomisationEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long AgreementProductCustomisationEntity.countAgreementProductCustomisationEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from AgreementProductCustomisationEntity o").getSingleResult();        
    }    
    
    public static List<AgreementProductCustomisationEntity> AgreementProductCustomisationEntity.findAllAgreementProductCustomisationEntitys() {    
        return entityManager().createQuery("select o from AgreementProductCustomisationEntity o").getResultList();        
    }    
    
    public static AgreementProductCustomisationEntity AgreementProductCustomisationEntity.findAgreementProductCustomisationEntity(Integer id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of AgreementProductCustomisationEntity");        
        return entityManager().find(AgreementProductCustomisationEntity.class, id);        
    }    
    
    public static List<AgreementProductCustomisationEntity> AgreementProductCustomisationEntity.findAgreementProductCustomisationEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from AgreementProductCustomisationEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
