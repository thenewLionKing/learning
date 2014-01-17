// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;
import uk.co.mo.app.mercury.domain.vehicle.entity.VrmMoveEntity;

privileged aspect VrmMoveEntity_Roo_Entity {
    
    declare @type: VrmMoveEntity: @Entity;
    
    @PersistenceContext
    transient EntityManager VrmMoveEntity.entityManager;
    
    @Transactional
    public void VrmMoveEntity.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void VrmMoveEntity.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            VrmMoveEntity attached = VrmMoveEntity.findVrmMoveEntity(this.vrmMoveBean.getMovementId());
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void VrmMoveEntity.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void VrmMoveEntity.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public VrmMoveEntity VrmMoveEntity.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        VrmMoveEntity merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager VrmMoveEntity.entityManager() {
        EntityManager em = new VrmMoveEntity().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long VrmMoveEntity.countVrmMoveEntitys() {
        return entityManager().createQuery("SELECT COUNT(o) FROM VrmMoveEntity o", Long.class).getSingleResult();
    }
    
    public static List<VrmMoveEntity> VrmMoveEntity.findAllVrmMoveEntitys() {
        return entityManager().createQuery("SELECT o FROM VrmMoveEntity o", VrmMoveEntity.class).getResultList();
    }
    
    public static VrmMoveEntity VrmMoveEntity.findVrmMoveEntity(Integer id) {
        if (id == null) return null;
        return entityManager().find(VrmMoveEntity.class, id);
    }
    
    public static List<VrmMoveEntity> VrmMoveEntity.findVrmMoveEntityEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM VrmMoveEntity o", VrmMoveEntity.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}