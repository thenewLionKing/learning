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
import uk.co.mo.app.mercury.domain.product.entity.ProductModelEntity;

privileged aspect ProductModelEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager ProductModelEntity.entityManager;    
    /*
    @Id    
    @Column(name = "id", columnDefinition="Integer")    
    private Integer ProductModelEntity.id;    
    */
    @Version    
    @Column(name = "version",   columnDefinition="BigInteger")      
    private Integer ProductModelEntity.version;    
    
    /*
    public Integer ProductModelEntity.getId() {    
        return this.id;        
    }    
    
    public void ProductModelEntity.setId(Integer id) {    
        this.id = id;        
    }    */
    
    public Integer ProductModelEntity.getVersion() {    
        return this.version;        
    }    
    
    public void ProductModelEntity.setVersion(Integer version) {    
        this.version = version;        
    }    
    
    @Transactional    
    public void ProductModelEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void ProductModelEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            ProductModelEntity attached = this.entityManager.find(ProductModelEntity.class, this.id);            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void ProductModelEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void ProductModelEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        ProductModelEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.id = merged.getId();        
    }    
    
    public static final EntityManager ProductModelEntity.entityManager() {    
        EntityManager em = new ProductModelEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long ProductModelEntity.countProductModelEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from ProductModelEntity o").getSingleResult();        
    }    
    
    public static List<ProductModelEntity> ProductModelEntity.findAllProductModelEntitys() {    
        return entityManager().createQuery("select o from ProductModelEntity o").getResultList();        
    }    
    
    public static ProductModelEntity ProductModelEntity.findProductModelEntity(Integer id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of ProductModelEntity");        
        return entityManager().find(ProductModelEntity.class, id);        
    }    
    
    public static List<ProductModelEntity> ProductModelEntity.findProductModelEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from ProductModelEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
