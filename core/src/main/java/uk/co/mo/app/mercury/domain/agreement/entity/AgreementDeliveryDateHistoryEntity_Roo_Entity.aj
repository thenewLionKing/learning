package uk.co.mo.app.mercury.domain.agreement.entity;

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
import uk.co.mo.app.mercury.domain.agreement.entity.AgreementDeliveryDateHistoryEntity;

privileged aspect AgreementDeliveryDateHistoryEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager AgreementDeliveryDateHistoryEntity.entityManager;    
    
   
  
    
    @Transactional    
    public void AgreementDeliveryDateHistoryEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void AgreementDeliveryDateHistoryEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            AgreementDeliveryDateHistoryEntity attached = this.entityManager.find(AgreementDeliveryDateHistoryEntity.class, this.getAgreementDeliveryDateId());            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void AgreementDeliveryDateHistoryEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void AgreementDeliveryDateHistoryEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        AgreementDeliveryDateHistoryEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.setAgreementDeliveryDateId(merged.getAgreementDeliveryDateId());        
    }    
    
    public static final EntityManager AgreementDeliveryDateHistoryEntity.entityManager() {    
        EntityManager em = new AgreementDeliveryDateHistoryEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long AgreementDeliveryDateHistoryEntity.countAgreementDeliveryDateHistoryEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from AgreementDeliveryDateHistoryEntity o").getSingleResult();        
    }    
    
    public static List<AgreementDeliveryDateHistoryEntity> AgreementDeliveryDateHistoryEntity.findAllAgreementDeliveryDateHistoryEntitys() {    
        return entityManager().createQuery("select o from AgreementDeliveryDateHistoryEntity o").getResultList();        
    }    
    
    public static AgreementDeliveryDateHistoryEntity AgreementDeliveryDateHistoryEntity.findAgreementDeliveryDateHistoryEntity(Integer id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of AgreementDeliveryDateHistoryEntity");        
        return entityManager().find(AgreementDeliveryDateHistoryEntity.class, id);        
    }    
    
    public static List<AgreementDeliveryDateHistoryEntity> AgreementDeliveryDateHistoryEntity.findAgreementDeliveryDateHistoryEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from AgreementDeliveryDateHistoryEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
