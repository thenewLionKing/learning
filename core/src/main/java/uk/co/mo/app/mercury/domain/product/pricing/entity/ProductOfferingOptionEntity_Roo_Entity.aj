package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.lang.Integer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import uk.co.mo.app.mercury.domain.product.pricing.entity.ProductOfferingOptionEntity;

privileged aspect ProductOfferingOptionEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager ProductOfferingOptionEntity.entityManager;    
    
    @Transactional    
    public void ProductOfferingOptionEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void ProductOfferingOptionEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            ProductOfferingOptionEntity attached = this.entityManager.find(ProductOfferingOptionEntity.class, this.id);            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void ProductOfferingOptionEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void ProductOfferingOptionEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        ProductOfferingOptionEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.id = merged.getId();        
    }    
    
    public static final EntityManager ProductOfferingOptionEntity.entityManager() {    
        EntityManager em = new ProductOfferingOptionEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long ProductOfferingOptionEntity.countProductOfferingOptionEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from ProductOfferingOptionEntity o").getSingleResult();        
    }    
    
    public static List<ProductOfferingOptionEntity> ProductOfferingOptionEntity.findAllProductOfferingOptionEntitys() {    
        return entityManager().createQuery("select o from ProductOfferingOptionEntity o").getResultList();        
    }    
    
    public static ProductOfferingOptionEntity ProductOfferingOptionEntity.findProductOfferingOptionEntity(Integer id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of ProductOfferingOptionEntity");        
        return entityManager().find(ProductOfferingOptionEntity.class, id);        
    }    
    
    public static List<ProductOfferingOptionEntity> ProductOfferingOptionEntity.findProductOfferingOptionEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from ProductOfferingOptionEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
