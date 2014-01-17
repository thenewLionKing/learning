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
import uk.co.mo.app.mercury.domain.product.entity.BasicColourEntity;

privileged aspect BasicColourEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager BasicColourEntity.entityManager;    
    
   
   
    @Transactional    
    public void BasicColourEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void BasicColourEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            BasicColourEntity attached = this.entityManager.find(BasicColourEntity.class, this.getName());            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void BasicColourEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void BasicColourEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        BasicColourEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.setName(merged.getName());        
    }    
    
    public static final EntityManager BasicColourEntity.entityManager() {    
        EntityManager em = new BasicColourEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long BasicColourEntity.countBasicColourEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from BasicColourEntity o").getSingleResult();        
    }    
    
    public static List<BasicColourEntity> BasicColourEntity.findAllBasicColourEntitys() {    
        return entityManager().createQuery("select o from BasicColourEntity o").getResultList();        
    }    
    
    public static BasicColourEntity BasicColourEntity.findBasicColourEntity(String  name) {    
        if (name == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of BasicColourEntity");        
        return entityManager().find(BasicColourEntity.class, name);        
    }    
    
    public static List<BasicColourEntity> BasicColourEntity.findBasicColourEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from BasicColourEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
