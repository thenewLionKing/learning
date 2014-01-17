package uk.co.mo.app.mercury.domain.product.pricing.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

privileged aspect ProductOptionTypeEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager ProductOptionTypeEntity.entityManager;    
    

    
    @Transactional    
    public void ProductOptionTypeEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void ProductOptionTypeEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            ProductOptionTypeEntity attached = this.entityManager.find(ProductOptionTypeEntity.class, this.id);            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void ProductOptionTypeEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void ProductOptionTypeEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        ProductOptionTypeEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.id = merged.getId();        
    }    
    
    public static final EntityManager ProductOptionTypeEntity.entityManager() {    
        EntityManager em = new ProductOptionTypeEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long ProductOptionTypeEntity.countProductOptionTypeEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from ProductOptionTypeEntity o").getSingleResult();        
    }    
    
    public static List<ProductOptionTypeEntity> ProductOptionTypeEntity.findAllProductOptionTypeEntitys() {    
        return entityManager().createQuery("select o from ProductOptionTypeEntity o").getResultList();        
    }    
    
    public static ProductOptionTypeEntity ProductOptionTypeEntity.findProductOptionTypeEntity(Integer id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of ProductOptionTypeEntity");        
        return entityManager().find(ProductOptionTypeEntity.class, id);        
    }    
    
    public static List<ProductOptionTypeEntity> ProductOptionTypeEntity.findProductOptionTypeEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from ProductOptionTypeEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
