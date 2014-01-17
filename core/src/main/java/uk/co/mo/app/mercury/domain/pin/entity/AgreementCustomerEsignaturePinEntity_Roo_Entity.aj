package uk.co.mo.app.mercury.domain.pin.entity;

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
import uk.co.mo.app.mercury.domain.pin.entity.AgreementCustomerEsignaturePinEntity;

privileged aspect AgreementCustomerEsignaturePinEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager AgreementCustomerEsignaturePinEntity.entityManager;    
    
       
       @Transactional    
    public void AgreementCustomerEsignaturePinEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void AgreementCustomerEsignaturePinEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            AgreementCustomerEsignaturePinEntity attached = this.entityManager.find(AgreementCustomerEsignaturePinEntity.class, this.getEsignaturePinId());            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void AgreementCustomerEsignaturePinEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void AgreementCustomerEsignaturePinEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        AgreementCustomerEsignaturePinEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.setEsignaturePinId(merged.getEsignaturePinId());        
    }    
    
    public static final EntityManager AgreementCustomerEsignaturePinEntity.entityManager() {    
        EntityManager em = new AgreementCustomerEsignaturePinEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long AgreementCustomerEsignaturePinEntity.countAgreementCustomerEsignaturePinEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from AgreementCustomerEsignaturePinEntity o").getSingleResult();        
    }    
    
    public static List<AgreementCustomerEsignaturePinEntity> AgreementCustomerEsignaturePinEntity.findAllAgreementCustomerEsignaturePinEntitys() {    
        return entityManager().createQuery("select o from AgreementCustomerEsignaturePinEntity o").getResultList();        
    }    
    
    public static AgreementCustomerEsignaturePinEntity AgreementCustomerEsignaturePinEntity.findAgreementCustomerEsignaturePinEntity(Long id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of AgreementCustomerEsignaturePinEntity");        
        return entityManager().find(AgreementCustomerEsignaturePinEntity.class, id);        
    }    
    
    public static List<AgreementCustomerEsignaturePinEntity> AgreementCustomerEsignaturePinEntity.findAgreementCustomerEsignaturePinEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from AgreementCustomerEsignaturePinEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
