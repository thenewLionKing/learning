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
import uk.co.mo.app.mercury.domain.agreement.entity.AgreementProductEntity;

privileged aspect AgreementProductEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager AgreementProductEntity.entityManager;    
    
    private Long AgreementProductEntity.id;    
    private Integer AgreementProductEntity.version;    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    @Column(name = "id", columnDefinition="Integer")    
    public Long AgreementProductEntity.getId() {    
        return this.id;        
    }    
    
    public void AgreementProductEntity.setId(Long id) {    
        this.id = id;        
    }    

    @Version    
    @Column(name = "version",   columnDefinition="BigInteger")      
    public Integer AgreementProductEntity.get_version() {    
        return this.version;        
    }    
    
    public void AgreementProductEntity.set_version(Integer version) {    
        this.version = version;        
    }    
    
    @Transactional    
    public void AgreementProductEntity.persist() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void AgreementProductEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            AgreementProductEntity attached = this.entityManager.find(AgreementProductEntity.class, this.id);            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void AgreementProductEntity.flush() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void AgreementProductEntity.merge() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        AgreementProductEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.id = merged.getId();        
    }    
    
    public static final EntityManager AgreementProductEntity.entityManager() {    
        EntityManager em = new AgreementProductEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long AgreementProductEntity.countAgreementProductEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from AgreementProductEntity o").getSingleResult();        
    }    
    
    public static List<AgreementProductEntity> AgreementProductEntity.findAllAgreementProductEntitys() {    
        return entityManager().createQuery("select o from AgreementProductEntity o").getResultList();        
    }    
    
    public static AgreementProductEntity AgreementProductEntity.findAgreementProductEntity(Long id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of AgreementProductEntity");        
        return entityManager().find(AgreementProductEntity.class, id);        
    }    
    
    public static List<AgreementProductEntity> AgreementProductEntity.findAgreementProductEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from AgreementProductEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
