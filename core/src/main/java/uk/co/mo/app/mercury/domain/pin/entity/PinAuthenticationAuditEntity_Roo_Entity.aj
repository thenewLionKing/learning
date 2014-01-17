package uk.co.mo.app.mercury.domain.pin.entity;

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
import uk.co.mo.app.mercury.domain.pin.entity.PinAuthenticationAuditEntity;

privileged aspect PinAuthenticationAuditEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager PinAuthenticationAuditEntity.entityManager;    
    
    @Transactional    
    public void PinAuthenticationAuditEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void PinAuthenticationAuditEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            PinAuthenticationAuditEntity attached = this.entityManager.find(PinAuthenticationAuditEntity.class, this.getAuditId());            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void PinAuthenticationAuditEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void PinAuthenticationAuditEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        PinAuthenticationAuditEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.auditId = merged.getAuditId();        
    }    
    
    public static final EntityManager PinAuthenticationAuditEntity.entityManager() {    
        EntityManager em = new PinAuthenticationAuditEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long PinAuthenticationAuditEntity.countPinAuthenticationAuditEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from PinAuthenticationAuditEntity o").getSingleResult();        
    }    
    
    public static List<PinAuthenticationAuditEntity> PinAuthenticationAuditEntity.findAllPinAuthenticationAuditEntitys() {    
        return entityManager().createQuery("select o from PinAuthenticationAuditEntity o").getResultList();        
    }    
    
    public static PinAuthenticationAuditEntity PinAuthenticationAuditEntity.findPinAuthenticationAuditEntity(Long id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of PinAuthenticationAuditEntity");        
        return entityManager().find(PinAuthenticationAuditEntity.class, id);        
    }    
    
    public static List<PinAuthenticationAuditEntity> PinAuthenticationAuditEntity.findPinAuthenticationAuditEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from PinAuthenticationAuditEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
