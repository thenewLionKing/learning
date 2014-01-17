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
import uk.co.mo.app.mercury.domain.product.pricing.entity.ProductOfferingEntity;

privileged aspect ProductOfferingEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager ProductOfferingEntity.entityManager;    
    
      
    
    @Version    
    @Column(name = "version",columnDefinition="BigInteger")    
    private Integer ProductOfferingEntity.version;    
    
   
    
    public Integer ProductOfferingEntity.getVersion() {    
        return this.version;        
    }    
    
    public void ProductOfferingEntity.setVersion(Integer version) {    
        this.version = version;        
    }    
    
    @Transactional    
    public void ProductOfferingEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void ProductOfferingEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            ProductOfferingEntity attached = this.entityManager.find(ProductOfferingEntity.class, this.id);            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void ProductOfferingEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void ProductOfferingEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        ProductOfferingEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.id = merged.getId();        
    }    
    
    public static final EntityManager ProductOfferingEntity.entityManager() {    
        EntityManager em = new ProductOfferingEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long ProductOfferingEntity.countProductOfferingEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from ProductOfferingEntity o").getSingleResult();        
    }    
    
    public static List<ProductOfferingEntity> ProductOfferingEntity.findAllProductOfferingEntitys() {    
        return entityManager().createQuery("select o from ProductOfferingEntity o").getResultList();        
    }    
    
    public static ProductOfferingEntity ProductOfferingEntity.findProductOfferingEntity(Integer id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of ProductOfferingEntity");        
        return entityManager().find(ProductOfferingEntity.class, id);        
    }    
    
    public static List<ProductOfferingEntity> ProductOfferingEntity.findProductOfferingEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from ProductOfferingEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
