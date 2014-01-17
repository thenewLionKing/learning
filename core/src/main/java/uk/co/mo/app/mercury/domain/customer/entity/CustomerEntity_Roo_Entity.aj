package uk.co.mo.app.mercury.domain.customer.entity;

import java.lang.Integer;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;
import uk.co.mo.app.mercury.domain.customer.entity.CustomerEntity;

privileged aspect CustomerEntity_Roo_Entity {
    
    @PersistenceContext    
    transient EntityManager CustomerEntity.entityManager;    
    
    @Version    
    @Column(name = "version",   columnDefinition="BigInteger")        
    private Integer CustomerEntity.version;    
    
    public Integer CustomerEntity.getVersion() {    
        return this.version;        
    }    
    
    public void CustomerEntity.setVersion(Integer version) {    
        this.version = version;        
    }    
    
    @Transactional    
    public void CustomerEntity.persist() {
    	System.out.println(" customer entity persist called");
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.persist(this);        
    }    
    
    @Transactional    
    public void CustomerEntity.remove() {    
        if (this.entityManager == null) this.entityManager = entityManager();        
        if (this.entityManager.contains(this)) {        
            this.entityManager.remove(this);            
        } else {        
            CustomerEntity attached = this.entityManager.find(CustomerEntity.class, this.customerBean.getCustomerId());            
            this.entityManager.remove(attached);            
        }        
    }    
    
    @Transactional    
    public void CustomerEntity.flush() {
    	System.out.println("customer entity flush called");
        if (this.entityManager == null) this.entityManager = entityManager();        
        this.entityManager.flush();        
    }    
    
    @Transactional    
    public void CustomerEntity.merge() { 
    	System.out.println("customer entity merge called");
        if (this.entityManager == null) this.entityManager = entityManager();        
        CustomerEntity merged = this.entityManager.merge(this);        
        this.entityManager.flush();        
        this.customerBean.setCustomerId(merged.getCustomerId());        
    }    
    
    public static final EntityManager CustomerEntity.entityManager() {    
        EntityManager em = new CustomerEntity().entityManager;        
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");        
        return em;        
    }    
    
    public static long CustomerEntity.countCustomerEntitys() {    
        return (Long) entityManager().createQuery("select count(o) from CustomerEntity o").getSingleResult();        
    }    
    
    public static List<CustomerEntity> CustomerEntity.findAllCustomerEntitys() {    
        return entityManager().createQuery("select o from CustomerEntity o").getResultList();        
    }    
    
    public static CustomerEntity CustomerEntity.findCustomerEntity(Integer id) {    
        if (id == null) throw new IllegalArgumentException("An identifier is required to retrieve an instance of CustomerEntity");        
        return entityManager().find(CustomerEntity.class, id);        
    }    
    
    public static List<CustomerEntity> CustomerEntity.findCustomerEntityEntries(int firstResult, int maxResults) {    
        return entityManager().createQuery("select o from CustomerEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();        
    }    
    
}
