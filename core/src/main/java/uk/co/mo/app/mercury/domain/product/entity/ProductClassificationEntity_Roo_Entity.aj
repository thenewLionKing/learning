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
import uk.co.mo.app.mercury.domain.product.entity.ProductClassificationEntity;

privileged aspect ProductClassificationEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager ProductClassificationEntity.entityManager;    
    
    @Id    
 
    @Column(name = "id", columnDefinition="Integer")    
    private Long ProductClassificationEntity.id;    
    
    @Version    
    @Column(name = "version",   columnDefinition="BigInteger")      
    private Integer ProductClassificationEntity.version;    
    
    public Long ProductClassificationEntity.getId() {    
        return this.id;        
    }    
    
    public void ProductClassificationEntity.setId(Long id) {    
        this.id = id;        
    }    
    
    public Integer ProductClassificationEntity.getVersion() {    
        return this.version;        
    }    
    
    public void ProductClassificationEntity.setVersion(Integer version) {    
        this.version = version;        
    }    
    
    @Transactional    
    public void ProductClassificationEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void ProductClassificationEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            ProductClassificationEntity attached = this.entityManager.find(ProductClassificationEntity.class, this.id);            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void ProductClassificationEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void ProductClassificationEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        ProductClassificationEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.id = merged.getId();        
    }    
    
    public static final EntityManager ProductClassificationEntity.entityManager() {    
        EntityManager em = new ProductClassificationEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long ProductClassificationEntity.countProductClassificationEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from ProductClassificationEntity o").getSingleResult();        
    }    
    
    public static List<ProductClassificationEntity> ProductClassificationEntity.findAllProductClassificationEntitys() {    
        return entityManager().createQuery("select o from ProductClassificationEntity o").getResultList();        
    }    
    
    public static ProductClassificationEntity ProductClassificationEntity.findProductClassificationEntity(Long id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of ProductClassificationEntity");        
        return entityManager().find(ProductClassificationEntity.class, id);        
    }    
    
    public static List<ProductClassificationEntity> ProductClassificationEntity.findProductClassificationEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from ProductClassificationEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
