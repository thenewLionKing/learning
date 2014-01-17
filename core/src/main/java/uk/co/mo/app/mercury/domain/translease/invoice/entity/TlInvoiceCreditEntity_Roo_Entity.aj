// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package uk.co.mo.app.mercury.domain.translease.invoice.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import uk.co.mo.app.mercury.domain.translease.invoice.entity.TlInvoiceCreditEntity;

privileged aspect TlInvoiceCreditEntity_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager TlInvoiceCreditEntity.entityManager;

    @Transactional
    public void TlInvoiceCreditEntity.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void TlInvoiceCreditEntity.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            TlInvoiceCreditEntity attached = TlInvoiceCreditEntity.findTlInvoiceCreditEntity( this.getTlInvoiceCreditBean().getTransleaseTransactionNumber() );
            this.entityManager.remove(attached);
        }
    }

    @Transactional
    public void TlInvoiceCreditEntity.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void TlInvoiceCreditEntity.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public TlInvoiceCreditEntity TlInvoiceCreditEntity.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        TlInvoiceCreditEntity merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager TlInvoiceCreditEntity.entityManager() {
        EntityManager em = new TlInvoiceCreditEntity().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long TlInvoiceCreditEntity.countTlInvoiceCreditEntitys() {
        return entityManager().createQuery("SELECT COUNT(o) FROM TlInvoiceCreditEntity o", Long.class).getSingleResult();
    }
    
    public static List<TlInvoiceCreditEntity> TlInvoiceCreditEntity.findAllTlInvoiceCreditEntitys() {
        return entityManager().createQuery("SELECT o FROM TlInvoiceCreditEntity o", TlInvoiceCreditEntity.class).getResultList();
    }
    
    public static TlInvoiceCreditEntity TlInvoiceCreditEntity.findTlInvoiceCreditEntity(Integer id) {
        if (id == null) return null;
        return entityManager().find(TlInvoiceCreditEntity.class, id);
    }
    
    public static List<TlInvoiceCreditEntity> TlInvoiceCreditEntity.findTlInvoiceCreditEntityEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM TlInvoiceCreditEntity o", TlInvoiceCreditEntity.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
