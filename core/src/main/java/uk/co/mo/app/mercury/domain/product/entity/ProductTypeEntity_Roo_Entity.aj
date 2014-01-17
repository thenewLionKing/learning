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
import uk.co.mo.app.mercury.domain.product.entity.ProductTypeEntity;

privileged aspect ProductTypeEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager ProductTypeEntity.entityManager;    
    
    @Id    
    @Column(name = "id", columnDefinition="Integer")    
    private Long ProductTypeEntity.id;    
  /**  
    @Version    
    @Column(name = "version", columnDefinition="BigInteger")    
    private Integer ProductTypeEntity.version;    
    */
    public Long ProductTypeEntity.getId() {    
        return this.id;        
    }    
    
    public void ProductTypeEntity.setId(Long id) {    
        this.id = id;        
    }    
 /**   
    public Integer ProductTypeEntity.getVersion() {    
        return this.version;        
    }    
    
    public void ProductTypeEntity.setVersion(Integer version) {    
        this.version = version;        
    }    
    */
    @Transactional    
    public void ProductTypeEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void ProductTypeEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            ProductTypeEntity attached = this.entityManager.find(ProductTypeEntity.class, this.id);            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void ProductTypeEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void ProductTypeEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        ProductTypeEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.id = merged.getId();        
    }    
    
    public static final EntityManager ProductTypeEntity.entityManager() {    
        EntityManager em = new ProductTypeEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long ProductTypeEntity.countProductTypeEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from ProductTypeEntity o").getSingleResult();        
    }    
    
    public static List<ProductTypeEntity> ProductTypeEntity.findAllProductTypeEntitys() {    
        return entityManager().createQuery("select o from ProductTypeEntity o").getResultList();        
    }    
    
    public static ProductTypeEntity ProductTypeEntity.findProductTypeEntity(Long id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of ProductTypeEntity");        
        return entityManager().find(ProductTypeEntity.class, id);        
    }    
    
    public static List<ProductTypeEntity> ProductTypeEntity.findProductTypeEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from ProductTypeEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
