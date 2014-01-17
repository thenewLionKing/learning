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
import uk.co.mo.app.mercury.domain.product.pricing.entity.HireTermEntity;

privileged aspect HireTermEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager HireTermEntity.entityManager;    
   
    
    @Version    
    @Column(name = "version", columnDefinition="BigInteger")   
    private Integer HireTermEntity.version;    
    
    public Integer HireTermEntity.getVersion() {    
        return this.version;        
    }    
    
    public void HireTermEntity.setVersion(Integer version) {    
        this.version = version;        
    }    
    
    @Transactional    
    public void HireTermEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void HireTermEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            HireTermEntity attached = this.entityManager.find(HireTermEntity.class, this.code);            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void HireTermEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void HireTermEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        HireTermEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.code = merged.getCode();        
    }    
    
    public static final EntityManager HireTermEntity.entityManager() {    
        EntityManager em = new HireTermEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long HireTermEntity.countHireTermEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from HireTermEntity o").getSingleResult();        
    }    
    
    public static List<HireTermEntity> HireTermEntity.findAllHireTermEntitys() {    
        return entityManager().createQuery("select o from HireTermEntity o").getResultList();        
    }    
    
    public static HireTermEntity HireTermEntity.findHireTermEntity(Long id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of HireTermEntity");        
        return entityManager().find(HireTermEntity.class, id);        
    }    
    
    public static List<HireTermEntity> HireTermEntity.findHireTermEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from HireTermEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
