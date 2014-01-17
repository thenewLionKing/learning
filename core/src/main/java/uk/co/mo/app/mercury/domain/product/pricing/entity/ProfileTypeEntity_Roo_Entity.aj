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
import uk.co.mo.app.mercury.domain.product.pricing.entity.ProfileTypeEntity;

privileged aspect ProfileTypeEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager ProfileTypeEntity.entityManager;    
    
    @Transactional    
    public void ProfileTypeEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void ProfileTypeEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            ProfileTypeEntity attached = this.entityManager.find(ProfileTypeEntity.class, this.profileType);            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void ProfileTypeEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void ProfileTypeEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        ProfileTypeEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.profileType = merged.getProfileType();        
    }    
    
    public static final EntityManager ProfileTypeEntity.entityManager() {    
        EntityManager em = new ProfileTypeEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long ProfileTypeEntity.countProfileTypeEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from ProfileTypeEntity o").getSingleResult();        
    }    
    
    public static List<ProfileTypeEntity> ProfileTypeEntity.findAllProfileTypeEntitys() {    
        return entityManager().createQuery("select o from ProfileTypeEntity o").getResultList();        
    }    
    
    public static ProfileTypeEntity ProfileTypeEntity.findProfileTypeEntity(Long id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of ProfileTypeEntity");        
        return entityManager().find(ProfileTypeEntity.class, id);        
    }    
    
    public static List<ProfileTypeEntity> ProfileTypeEntity.findProfileTypeEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from ProfileTypeEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
