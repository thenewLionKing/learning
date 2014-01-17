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
import uk.co.mo.app.mercury.domain.pin.entity.PinTypeEntity;

privileged aspect PinTypeEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager PinTypeEntity.entityManager;    
    
  
    @Transactional    
    public void PinTypeEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void PinTypeEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            PinTypeEntity attached = this.entityManager.find(PinTypeEntity.class, this.getPinTypeId());            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void PinTypeEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void PinTypeEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        PinTypeEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.setPinTypeId(merged.getPinTypeId());        
    }    
    
    public static final EntityManager PinTypeEntity.entityManager() {    
        EntityManager em = new PinTypeEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long PinTypeEntity.countPinTypeEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from PinTypeEntity o").getSingleResult();        
    }    
    
    public static List<PinTypeEntity> PinTypeEntity.findAllPinTypeEntitys() {    
        return entityManager().createQuery("select o from PinTypeEntity o").getResultList();        
    }    
    
    public static PinTypeEntity PinTypeEntity.findPinTypeEntity(Short id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of PinTypeEntity");        
        return entityManager().find(PinTypeEntity.class, id);        
    }    
    
    public static List<PinTypeEntity> PinTypeEntity.findPinTypeEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from PinTypeEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
