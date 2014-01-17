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
import uk.co.mo.app.mercury.domain.product.pricing.entity.ProductOfferingDealerEntity;

privileged aspect ProductOfferingDealerEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager ProductOfferingDealerEntity.entityManager;    
    
  
    @Transactional    
    public void ProductOfferingDealerEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void ProductOfferingDealerEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            ProductOfferingDealerEntity attached = this.entityManager.find(ProductOfferingDealerEntity.class, this.getId());            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void ProductOfferingDealerEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void ProductOfferingDealerEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        ProductOfferingDealerEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.setId(merged.getId());        
    }    
    
    public static final EntityManager ProductOfferingDealerEntity.entityManager() {    
        EntityManager em = new ProductOfferingDealerEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long ProductOfferingDealerEntity.countProductOfferingDealerEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from ProductOfferingDealerEntity o").getSingleResult();        
    }    
    
    public static List<ProductOfferingDealerEntity> ProductOfferingDealerEntity.findAllProductOfferingDealerEntitys() {    
        return entityManager().createQuery("select o from ProductOfferingDealerEntity o").getResultList();        
    }    
    
    public static ProductOfferingDealerEntity ProductOfferingDealerEntity.findProductOfferingDealerEntity(ProductOfferingDealerPK pk) {    
        if (pk == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of ProductOfferingDealerEntity");        
        return entityManager().find(ProductOfferingDealerEntity.class, pk);        
    }    
    
    public static List<ProductOfferingDealerEntity> ProductOfferingDealerEntity.findProductOfferingDealerEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from ProductOfferingDealerEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
