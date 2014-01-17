package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;
import uk.co.mo.app.mercury.domain.product.pricing.entity.BenifitTypeEntity;

privileged aspect BenifitTypeEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager BenifitTypeEntity.entityManager;    
    
    @Transactional    
    public void BenifitTypeEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void BenifitTypeEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            BenifitTypeEntity attached = this.entityManager.find(BenifitTypeEntity.class, this.benifitCode);            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void BenifitTypeEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void BenifitTypeEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        BenifitTypeEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.benifitCode = merged.getBenifitCode();        
    }    
    
    public static final EntityManager BenifitTypeEntity.entityManager() {    
        EntityManager em = new BenifitTypeEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long BenifitTypeEntity.countBenifitTypeEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from BenifitTypeEntity o").getSingleResult();        
    }    
    
    public static List<BenifitTypeEntity> BenifitTypeEntity.findAllBenifitTypeEntitys() {    
        return entityManager().createQuery("select o from BenifitTypeEntity o").getResultList();        
    }    
    
    public static BenifitTypeEntity BenifitTypeEntity.findBenifitTypeEntity(Long id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of BenifitTypeEntity");        
        return entityManager().find(BenifitTypeEntity.class, id);        
    }    
    
    public static List<BenifitTypeEntity> BenifitTypeEntity.findBenifitTypeEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from BenifitTypeEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
