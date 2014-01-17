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
import uk.co.mo.app.mercury.domain.pin.entity.PinRequestAuditEntity;

privileged aspect PinRequestAuditEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager PinRequestAuditEntity.entityManager;    
    
   
    
    @Transactional    
    public void PinRequestAuditEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void PinRequestAuditEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            PinRequestAuditEntity attached = this.entityManager.find(PinRequestAuditEntity.class, this.getAuditId());            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void PinRequestAuditEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void PinRequestAuditEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        PinRequestAuditEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.setAuditId(merged.getAuditId());        
    }    
    
    public static final EntityManager PinRequestAuditEntity.entityManager() {    
        EntityManager em = new PinRequestAuditEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long PinRequestAuditEntity.countPinRequestAuditEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from PinRequestAuditEntity o").getSingleResult();        
    }    
    
    public static List<PinRequestAuditEntity> PinRequestAuditEntity.findAllPinRequestAuditEntitys() {    
        return entityManager().createQuery("select o from PinRequestAuditEntity o").getResultList();        
    }    
    
    public static PinRequestAuditEntity PinRequestAuditEntity.findPinRequestAuditEntity(Long id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of PinRequestAuditEntity");        
        return entityManager().find(PinRequestAuditEntity.class, id);        
    }    
    
    public static List<PinRequestAuditEntity> PinRequestAuditEntity.findPinRequestAuditEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from PinRequestAuditEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
