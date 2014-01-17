package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.VrmMoveTypeBean;


/**
 * The persistent class for the vrm_move_type database table.
 * 
 */
@Entity
@Table(name="vrm_move_type")
public class VrmMoveTypeEntity implements Serializable {

	private static final long serialVersionUID = 6304093558381217230L;

	private VrmMoveTypeBean vrmMoveTypeBean = new VrmMoveTypeBean();

	public VrmMoveTypeEntity() {
    }

	@Transient
	public VrmMoveTypeBean getVrmMoveTypeBean() {
		return vrmMoveTypeBean;
	}

	public void setVrmMoveTypeBean(VrmMoveTypeBean vrmMoveTypeBean) {
		this.vrmMoveTypeBean = vrmMoveTypeBean;
	}


	@Id
	@Column(name="movement_type_id", unique=true, insertable=false, updatable = false, nullable=false)
	public Integer getMovementTypeId() {
		return this.vrmMoveTypeBean.getMovementTypeId();
	}

	public void setMovementTypeId(Integer movementTypeId) {
		this.vrmMoveTypeBean.setMovementTypeId(movementTypeId);
	}


	@Column(nullable=false, length=20)
	public String getDescription() {
		return this.vrmMoveTypeBean.getDescription();
	}

	public void setDescription(String description) {
		this.vrmMoveTypeBean.setDescription(description);
	}

}