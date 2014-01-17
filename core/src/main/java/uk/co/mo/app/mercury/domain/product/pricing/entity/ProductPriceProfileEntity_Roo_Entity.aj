package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.Integer;
import java.lang.Long;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;
import uk.co.mo.app.mercury.domain.product.pricing.entity.ProductPriceProfileEntity;

privileged aspect ProductPriceProfileEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager ProductPriceProfileEntity.entityManager;    
   
    private Long ProductPriceProfileEntity.version;      

    @Version    
    @Column(name = "version",columnDefinition="bigint")
    public Long ProductPriceProfileEntity.getVersion() {    
        return this.version;        
    }    
    
    public void ProductPriceProfileEntity.setVersion(Long version) {    
        this.version = version;        
    }    
    
    @Transactional    
    public void ProductPriceProfileEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void ProductPriceProfileEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            ProductPriceProfileEntity attached = this.entityManager.find(ProductPriceProfileEntity.class, this.getId());            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void ProductPriceProfileEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void ProductPriceProfileEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        ProductPriceProfileEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.setId(merged.getId());        
    }    
    
    public static final EntityManager ProductPriceProfileEntity.entityManager() {    
        EntityManager em = new ProductPriceProfileEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long ProductPriceProfileEntity.countProductPriceProfileEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from ProductPriceProfileEntity o").getSingleResult();        
    }    
    
    public static List<ProductPriceProfileEntity> ProductPriceProfileEntity.findAllProductPriceProfileEntitys() {    
        return entityManager().createQuery("select o from ProductPriceProfileEntity o").getResultList();        
    }    
    
    public static ProductPriceProfileEntity ProductPriceProfileEntity.findProductPriceProfileEntity(Integer id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of ProductPriceProfileEntity");        
        return entityManager().find(ProductPriceProfileEntity.class, id);        
    }    
    
    public static List<ProductPriceProfileEntity> ProductPriceProfileEntity.findProductPriceProfileEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from ProductPriceProfileEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
