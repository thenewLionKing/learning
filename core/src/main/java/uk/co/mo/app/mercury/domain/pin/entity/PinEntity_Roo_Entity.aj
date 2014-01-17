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
import uk.co.mo.app.mercury.domain.pin.entity.PinEntity;

privileged aspect PinEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager PinEntity.entityManager;    
    
      
    @Transactional    
    public void PinEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void PinEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            PinEntity attached = this.entityManager.find(PinEntity.class, this.getPinId());            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void PinEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void PinEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        PinEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.setPinId(merged.getPinId());        
    }    
    
    public static final EntityManager PinEntity.entityManager() {    
        EntityManager em = new PinEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long PinEntity.countPinEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from PinEntity o").getSingleResult();        
    }    
    
    public static List<PinEntity> PinEntity.findAllPinEntitys() {    
        return entityManager().createQuery("select o from PinEntity o").getResultList();        
    }    
    
    public static PinEntity PinEntity.findPinEntity(Integer id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of PinEntity");        
        return entityManager().find(PinEntity.class, id);        
    }    
    
    public static List<PinEntity> PinEntity.findPinEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from PinEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
