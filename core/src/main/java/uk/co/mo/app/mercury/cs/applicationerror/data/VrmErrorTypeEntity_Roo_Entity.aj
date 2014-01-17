package uk.co.mo.app.mercury.cs.applicationerror.data;

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
import uk.co.mo.app.mercury.cs.applicationerror.data.VrmErrorTypeEntity;

privileged aspect VrmErrorTypeEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager VrmErrorTypeEntity.entityManager;    
    
    @Transactional    
    public void VrmErrorTypeEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void VrmErrorTypeEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            VrmErrorTypeEntity attached = this.entityManager.find(VrmErrorTypeEntity.class, this.errorTypeId);
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void VrmErrorTypeEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void VrmErrorTypeEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        VrmErrorTypeEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.errorTypeId = merged.getErrorTypeId();
    }    
    
    public static final EntityManager VrmErrorTypeEntity.entityManager() {    
        EntityManager em = new VrmErrorTypeEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long VrmErrorTypeEntity.countVrmErrorTypeEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from VrmErrorTypeEntity o").getSingleResult();        
    }    
    
    public static List<VrmErrorTypeEntity> VrmErrorTypeEntity.findAllVrmErrorTypeEntitys() {    
        return entityManager().createQuery("select o from VrmErrorTypeEntity o").getResultList();        
    }    
    
    public static VrmErrorTypeEntity VrmErrorTypeEntity.findVrmErrorTypeEntity(Integer errorTypeId) {
        if (errorTypeId == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of VrmErrorTypeEntity");        
        return entityManager().find(VrmErrorTypeEntity.class, errorTypeId);        
    }    
    
    public static List<VrmErrorTypeEntity> VrmErrorTypeEntity.findVrmErrorTypeEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from VrmErrorTypeEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
