package uk.co.mo.app.mercury.domain.product.entity;

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
import uk.co.mo.app.mercury.domain.product.entity.ProductRangeEntity;

privileged aspect ProductRangeEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager ProductRangeEntity.entityManager;    
    
   
    
    @Version    
    @Column(name = "version",   columnDefinition="BigInteger")      
    private Integer ProductRangeEntity.version;    
    
   
    
    public Integer ProductRangeEntity.getVersion() {    
        return this.version;        
    }    
    
    public void ProductRangeEntity.setVersion(Integer version) {    
        this.version = version;        
    }    
    
    @Transactional    
    public void ProductRangeEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void ProductRangeEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            ProductRangeEntity attached = this.entityManager.find(ProductRangeEntity.class, this.id);            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void ProductRangeEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void ProductRangeEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        ProductRangeEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.id = merged.getId();        
    }    
    
    public static final EntityManager ProductRangeEntity.entityManager() {    
        EntityManager em = new ProductRangeEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long ProductRangeEntity.countProductRangeEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from ProductRangeEntity o").getSingleResult();        
    }    
    
    public static List<ProductRangeEntity> ProductRangeEntity.findAllProductRangeEntitys() {    
        return entityManager().createQuery("select o from ProductRangeEntity o").getResultList();        
    }    
    
    public static ProductRangeEntity ProductRangeEntity.findProductRangeEntity(Integer id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of ProductRangeEntity");        
        return entityManager().find(ProductRangeEntity.class, id);        
    }    
    
    public static List<ProductRangeEntity> ProductRangeEntity.findProductRangeEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from ProductRangeEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
