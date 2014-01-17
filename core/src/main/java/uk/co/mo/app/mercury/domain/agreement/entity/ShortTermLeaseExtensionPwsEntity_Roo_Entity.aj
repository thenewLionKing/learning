package uk.co.mo.app.mercury.domain.agreement.entity;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import java.util.List;

privileged aspect ShortTermLeaseExtensionPwsEntity_Roo_Entity {

    @PersistenceContext
    transient EntityManager ShortTermLeaseExtensionPwsEntity.entityManager;

    @Version
    @Column(name = "version", columnDefinition = "BigInteger")
    private Integer ShortTermLeaseExtensionPwsEntity.version;


    public Integer ShortTermLeaseExtensionPwsEntity.getVersion() {
        return this.version;
    }

    public void ShortTermLeaseExtensionPwsEntity.setVersion(Integer version) {
        this.version = version;
    }

    @Transactional
    public void ShortTermLeaseExtensionPwsEntity.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }

    @Transactional
    public void ShortTermLeaseExtensionPwsEntity.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            ShortTermLeaseExtensionPwsEntity attached = this.entityManager.find(ShortTermLeaseExtensionPwsEntity.class, this.getId());
            this.entityManager.remove(attached);
        }
    }

    @Transactional
    public void ShortTermLeaseExtensionPwsEntity.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }

    @Transactional
    public void ShortTermLeaseExtensionPwsEntity.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        ShortTermLeaseExtensionPwsEntity merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.setId(merged.getId());
    }

    public static final EntityManager ShortTermLeaseExtensionPwsEntity.entityManager() {
        EntityManager em = new ShortTermLeaseExtensionPwsEntity().entityManager;
        if (em == null)
            throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }

    public static long ShortTermLeaseExtensionPwsEntity.countStleEntitys() {
        return (Long) entityManager().createQuery("select count(o) from ShortTermLeaseExtensionPwsEntity o").getSingleResult();
    }

    public static List<ShortTermLeaseExtensionPwsEntity> ShortTermLeaseExtensionPwsEntity.findAllStleEntitys() {
        return entityManager().createQuery("select o from ShortTermLeaseExtensionPwsEntity o").getResultList();
    }

    public static ShortTermLeaseExtensionPwsEntity ShortTermLeaseExtensionPwsEntity.findStleEntity(Long id) {
        if (id == null)
            throw new IllegalArgumentException("An identifier is required to retrieve an instance of AgreementEntity");
        return entityManager().find(ShortTermLeaseExtensionPwsEntity.class, id);
    }

    public static List<ShortTermLeaseExtensionPwsEntity> ShortTermLeaseExtensionPwsEntity.findStleEntityEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from ShortTermLeaseExtensionPwsEntity o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }

    public static ShortTermLeaseExtensionPwsEntity ShortTermLeaseExtensionPwsEntity.findByOldArnEquals(String originalArn) {
        List<ShortTermLeaseExtensionPwsEntity> shortTermLeaseExtensionPwsEntities = entityManager().createQuery("select o from ShortTermLeaseExtensionPwsEntity o where o.originalArn = :originalArn").setParameter("originalArn", originalArn).getResultList();
        if (shortTermLeaseExtensionPwsEntities != null && shortTermLeaseExtensionPwsEntities.size() > 0)
            return shortTermLeaseExtensionPwsEntities.get(0);
        else return null;
    }
}
