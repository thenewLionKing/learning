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
import uk.co.mo.app.mercury.cs.applicationerror.data.VrmApplicationErrorAuditEntity;

privileged aspect VrmApplicationErrorAuditEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager VrmApplicationErrorAuditEntity.entityManager;    
    

    @Transactional    
    public void VrmApplicationErrorAuditEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void VrmApplicationErrorAuditEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            VrmApplicationErrorAuditEntity attached = this.entityManager.find(VrmApplicationErrorAuditEntity.class, this.errorAuditId);
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void VrmApplicationErrorAuditEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void VrmApplicationErrorAuditEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        VrmApplicationErrorAuditEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.errorAuditId = merged.getErrorAuditId();
    }    
    
    public static final EntityManager VrmApplicationErrorAuditEntity.entityManager() {    
        EntityManager em = new VrmApplicationErrorAuditEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long VrmApplicationErrorAuditEntity.countVrmApplicationErrorAuditEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from VrmApplicationErrorAuditEntity o").getSingleResult();        
    }    
    
    public static List<VrmApplicationErrorAuditEntity> VrmApplicationErrorAuditEntity.findAllVrmApplicationErrorAuditEntitys() {    
        return entityManager().createQuery("select o from VrmApplicationErrorAuditEntity o").getResultList();        
    }    
    
    public static VrmApplicationErrorAuditEntity VrmApplicationErrorAuditEntity.findVrmApplicationErrorAuditEntity(Integer id) {
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of VrmApplicationErrorAuditEntity");        
        return entityManager().find(VrmApplicationErrorAuditEntity.class, id);        
    }    
    
    public static List<VrmApplicationErrorAuditEntity> VrmApplicationErrorAuditEntity.findVrmApplicationErrorAuditEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from VrmApplicationErrorAuditEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
