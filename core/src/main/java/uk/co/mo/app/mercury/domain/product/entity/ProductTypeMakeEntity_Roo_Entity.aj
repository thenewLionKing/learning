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
import uk.co.mo.app.mercury.domain.product.entity.ProductTypeMakeEntity;

privileged aspect ProductTypeMakeEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager ProductTypeMakeEntity.entityManager;    
    
    @Id    
 
    @Column(name = "id", columnDefinition="Integer")    
    private Long ProductTypeMakeEntity.id;    
    
    @Version    
    @Column(name = "version",   columnDefinition="BigInteger")      
    private Integer ProductTypeMakeEntity.version;    
    
    public Long ProductTypeMakeEntity.getId() {    
        return this.id;        
    }    
    
    public void ProductTypeMakeEntity.setId(Long id) {    
        this.id = id;        
    }    
    
    public Integer ProductTypeMakeEntity.getVersion() {    
        return this.version;        
    }    
    
    public void ProductTypeMakeEntity.setVersion(Integer version) {    
        this.version = version;        
    }    
    
    @Transactional    
    public void ProductTypeMakeEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void ProductTypeMakeEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            ProductTypeMakeEntity attached = this.entityManager.find(ProductTypeMakeEntity.class, this.id);            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void ProductTypeMakeEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void ProductTypeMakeEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        ProductTypeMakeEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.id = merged.getId();        
    }    
    
    public static final EntityManager ProductTypeMakeEntity.entityManager() {    
        EntityManager em = new ProductTypeMakeEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long ProductTypeMakeEntity.countProductTypeMakeEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from ProductTypeMakeEntity o").getSingleResult();        
    }    
    
    public static List<ProductTypeMakeEntity> ProductTypeMakeEntity.findAllProductTypeMakeEntitys() {    
        return entityManager().createQuery("select o from ProductTypeMakeEntity o").getResultList();        
    }    
    
    public static ProductTypeMakeEntity ProductTypeMakeEntity.findProductTypeMakeEntity(Long id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of ProductTypeMakeEntity");        
        return entityManager().find(ProductTypeMakeEntity.class, id);        
    }    
    
    public static List<ProductTypeMakeEntity> ProductTypeMakeEntity.findProductTypeMakeEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from ProductTypeMakeEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
