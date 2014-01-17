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
import uk.co.mo.app.mercury.cs.applicationerror.data.VrmApplicationErrorEntity;

privileged aspect VrmApplicationErrorEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager VrmApplicationErrorEntity.entityManager;    
    
    @Transactional    
    public void VrmApplicationErrorEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void VrmApplicationErrorEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            VrmApplicationErrorEntity attached = this.entityManager.find(VrmApplicationErrorEntity.class, this.errorId);
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void VrmApplicationErrorEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void VrmApplicationErrorEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        VrmApplicationErrorEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.errorId = merged.getErrorId();
    }    
    
    public static final EntityManager VrmApplicationErrorEntity.entityManager() {    
        EntityManager em = new VrmApplicationErrorEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long VrmApplicationErrorEntity.countVrmApplicationErrorEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from VrmApplicationErrorEntity o").getSingleResult();        
    }    
    
    public static List<VrmApplicationErrorEntity> VrmApplicationErrorEntity.findAllVrmApplicationErrorEntitys() {    
        return entityManager().createQuery("select o from VrmApplicationErrorEntity o").getResultList();        
    }    
    
    public static VrmApplicationErrorEntity VrmApplicationErrorEntity.findVrmApplicationErrorEntity(Integer id) {
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of VrmApplicationErrorEntity");        
        return entityManager().find(VrmApplicationErrorEntity.class, id);        
    }    
    
    public static List<VrmApplicationErrorEntity> VrmApplicationErrorEntity.findVrmApplicationErrorEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from VrmApplicationErrorEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
