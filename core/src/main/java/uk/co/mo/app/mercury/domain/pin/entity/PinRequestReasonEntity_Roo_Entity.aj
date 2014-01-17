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
import uk.co.mo.app.mercury.domain.pin.entity.PinRequestReasonEntity;

privileged aspect PinRequestReasonEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager PinRequestReasonEntity.entityManager;    
    
    @Transactional    
    public void PinRequestReasonEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void PinRequestReasonEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            PinRequestReasonEntity attached = this.entityManager.find(PinRequestReasonEntity.class, this.getRequestReasonId());            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void PinRequestReasonEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void PinRequestReasonEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        PinRequestReasonEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.setRequestReasonId(merged.getRequestReasonId());        
    }    
    
    public static final EntityManager PinRequestReasonEntity.entityManager() {    
        EntityManager em = new PinRequestReasonEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long PinRequestReasonEntity.countPinRequestReasonEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from PinRequestReasonEntity o").getSingleResult();        
    }    
    
    public static List<PinRequestReasonEntity> PinRequestReasonEntity.findAllPinRequestReasonEntitys() {    
        return entityManager().createQuery("select o from PinRequestReasonEntity o").getResultList();        
    }    
    
    public static PinRequestReasonEntity PinRequestReasonEntity.findPinRequestReasonEntity(Integer id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of PinRequestReasonEntity");        
        return entityManager().find(PinRequestReasonEntity.class, id);        
    }    
    
    public static List<PinRequestReasonEntity> PinRequestReasonEntity.findPinRequestReasonEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from PinRequestReasonEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
