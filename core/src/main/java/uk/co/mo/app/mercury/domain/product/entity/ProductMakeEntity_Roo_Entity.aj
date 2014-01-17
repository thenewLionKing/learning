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
import uk.co.mo.app.mercury.domain.product.entity.ProductMakeEntity;

privileged aspect ProductMakeEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager ProductMakeEntity.entityManager;    
    
    @Transactional    
    public void ProductMakeEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void ProductMakeEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
        	ProductMakeEntity attached = this.entityManager.find(ProductMakeEntity.class, this.productMakeBean.getId());            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void ProductMakeEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void ProductMakeEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        ProductMakeEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.productMakeBean.setId(merged.getId());        
    }    
    
    public static final EntityManager ProductMakeEntity.entityManager() {    
        EntityManager em = new ProductMakeEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long ProductMakeEntity.countProductMakeEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from ProductMakeEntity o").getSingleResult();        
    }    
    
    public static List<ProductMakeEntity> ProductMakeEntity.findAllProductMakeEntitys() {    
        return entityManager().createQuery("select o from ProductMakeEntity o").getResultList();        
    }    
    
    public static ProductMakeEntity ProductMakeEntity.findProductMakeEntity(Integer id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of ProductMakeEntity");        
        return entityManager().find(ProductMakeEntity.class, id);        
    }    
    
    public static List<ProductMakeEntity> ProductMakeEntity.findProductMakeEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from ProductMakeEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
