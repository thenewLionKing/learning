package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.VrmMoveBean;


/**
 * The persistent class for the vrm_move database table.
 * 
 */

@Entity
@Table(name="vrm_move")
public class VrmMoveEntity implements Serializable {
	
	private static final long serialVersionUID = -9022900425319516058L;
	
	private VrmMoveBean vrmMoveBean = new VrmMoveBean();
	private VrmMoveTypeEntity vrmMoveTypeEntity = new VrmMoveTypeEntity();
	private VrmLocationEntity vrmLocationEntity = new  VrmLocationEntity();
	
	
	public VrmMoveEntity() {
    }

	@Transient
	public VrmMoveBean getVrmMoveBean() {
		return vrmMoveBean;
	}


	public void setVrmMoveBean(VrmMoveBean vrmMoveBean) {
		this.vrmMoveBean = vrmMoveBean;
	}


	@Id
	@Column(name="movement_id", unique=true, nullable=false)
	public Integer getMovementId() {
		return this.vrmMoveBean.getMovementId();
	}

	public void setMovementId(Integer movementId) {
		this.vrmMoveBean.setMovementId(movementId);
	}


	@Column(name="carrier_id")
	public Integer getCarrierId() {
		return this.vrmMoveBean.getCarrierId();
	}

	public void setCarrierId(Integer carrierId) {
		this.vrmMoveBean.setCarrierId(carrierId);
	}


	@Column(name="collection_am_pm", columnDefinition="CHAR", length=1)
	public String getCollectionAmPm() {
		return this.vrmMoveBean.getCollectionAmPm();
	}

	public void setCollectionAmPm(String collectionAmPm) {
		this.vrmMoveBean.setCollectionAmPm(collectionAmPm);
	}


	@Column(name="collection_comments", length=255)
	public String getCollectionComments() {
		return this.vrmMoveBean.getCollectionComments();
	}

	public void setCollectionComments(String collectionComments) {
		this.vrmMoveBean.setCollectionComments(collectionComments);
	}


	@Column(name="collection_confirmation_date")
	public Date getCollectionConfirmationDate() {
		return this.vrmMoveBean.getCollectionConfirmationDate();
	}

	public void setCollectionConfirmationDate(Date collectionConfirmationDate) {
		this.vrmMoveBean.setCollectionConfirmationDate(collectionConfirmationDate);
	}


	@Column(name="collection_contact_name", length=100)
	public String getCollectionContactName() {
		return this.vrmMoveBean.getCollectionContactName();
	}

	public void setCollectionContactName(String collectionContactName) {
		this.vrmMoveBean.setCollectionContactName(collectionContactName);
	}


	@Column(name="collection_contact_phone", length=15)
	public String getCollectionContactPhone() {
		return this.vrmMoveBean.getCollectionContactPhone();
	}

	public void setCollectionContactPhone(String collectionContactPhone) {
		this.vrmMoveBean.setCollectionContactPhone(collectionContactPhone);
	}


	@Column(name="collection_date")
	public Date getCollectionDate() {
		return this.vrmMoveBean.getCollectionDate();
	}

	public void setCollectionDate(Date collectionDate) {
		this.vrmMoveBean.setCollectionDate(collectionDate);
	}


	@Column(name="collection_location_id", insertable=false, updatable=false, nullable=false)
	public Integer getCollectionLocationId() {
		return this.vrmMoveBean.getCollectionLocationId();
	}

	public void setCollectionLocationId(Integer collectionLocationId) {
		this.vrmMoveBean.setCollectionLocationId(collectionLocationId);
	}


	@Column(name="delivery_comments", length=255)
	public String getDeliveryComments() {
		return this.vrmMoveBean.getDeliveryComments();
	}

	public void setDeliveryComments(String deliveryComments) {
		this.vrmMoveBean.setDeliveryComments(deliveryComments);
	}


	@Column(name="delivery_confirmation_date")
	public Date getDeliveryConfirmationDate() {
		return this.vrmMoveBean.getDeliveryConfirmationDate();
	}

	public void setDeliveryConfirmationDate(Date deliveryConfirmationDate) {
		this.vrmMoveBean.setDeliveryConfirmationDate(deliveryConfirmationDate);
	}


	@Column(name="delivery_contact_name", length=100)
	public String getDeliveryContactName() {
		return this.vrmMoveBean.getDeliveryContactName();
	}

	public void setDeliveryContactName(String deliveryContactName) {
		this.vrmMoveBean.setDeliveryContactName(deliveryContactName);
	}


	@Column(name="delivery_contact_phone", length=15)
	public String getDeliveryContactPhone() {
		return this.vrmMoveBean.getDeliveryContactPhone();
	}

	public void setDeliveryContactPhone(String deliveryContactPhone) {
		this.vrmMoveBean.setDeliveryContactPhone(deliveryContactPhone);
	}


	@Column(name="delivery_date")
	public Date getDeliveryDate() {
		return this.vrmMoveBean.getDeliveryDate();
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.vrmMoveBean.setDeliveryDate(deliveryDate);
	}


	@Column(name="delivery_location_id")
	public Integer getDeliveryLocationId() {
		return this.vrmMoveBean.getDeliveryLocationId();
	}

	public void setDeliveryLocationId(Integer deliveryLocationId) {
		this.vrmMoveBean.setDeliveryLocationId(deliveryLocationId);
	}


	@Column(name="department_id")
	public Integer getDepartmentId() {
		return this.vrmMoveBean.getDepartmentId();
	}

	public void setDepartmentId(Integer departmentId) {
		this.vrmMoveBean.setDepartmentId(departmentId);
	}


	@Column(nullable=false)
	public Boolean getDriveable() {
		return this.vrmMoveBean.isDriveable();
	}

	public void setDriveable(Boolean driveable) {
		this.vrmMoveBean.setDriveable(driveable);
	}


	@Column(name="insert_date", nullable=false)
	public Date getInsertDate() {
		return this.vrmMoveBean.getInsertDate();
	}

	public void setInsertDate(Date insertDate) {
		this.vrmMoveBean.setInsertDate(insertDate);
	}


	@Column(name="job_no",columnDefinition="CHAR", length=10)
	public String getJobNo() {
		return this.vrmMoveBean.getJobNo();
	}

	public void setJobNo(String jobNo) {
		this.vrmMoveBean.setJobNo(jobNo);
	}


	@Column(name="manual_dates_override", nullable=false)
	public Boolean getManualDatesOverride() {
		return this.vrmMoveBean.isManualDatesOverride();
	}

	public void setManualDatesOverride(Boolean manualDatesOverride) {
		this.vrmMoveBean.setManualDatesOverride(manualDatesOverride);
	}


	@Column(name="movement_type_id", nullable=false, insertable=false, updatable=false)
	public Integer getMovementTypeId() {
		return this.vrmMoveBean.getMovementTypeId();
	}

	public void setMovementTypeId(Integer movementTypeId) {
		this.vrmMoveBean.setMovementTypeId(movementTypeId);
	}


	@Column(name="state_id", nullable=false)
	public Integer getStateId() {
		return this.vrmMoveBean.getStateId();
	}

	public void setStateId(Integer stateId) {
		this.vrmMoveBean.setStateId(stateId);
	}


	@Column(name="stock_id", nullable=false, insertable=false, updatable=false)
	public Integer getStockId() {
		return this.vrmMoveBean.getStockId();
	}

	public void setStockId(Integer stockId) {
		this.vrmMoveBean.setStockId(stockId);
	}


	@Column(name="update_date")
	public Date getUpdateDate() {
		return this.vrmMoveBean.getUpdateDate();
	}

	public void setUpdateDate(Date updateDate) {
		this.vrmMoveBean.setUpdateDate(updateDate);
	}


	@Column(name="update_process_name", length=30)
	public String getUpdateProcessName() {
		return this.vrmMoveBean.getUpdateProcessName();
	}

	public void setUpdateProcessName(String updateProcessName) {
		this.vrmMoveBean.setUpdateProcessName(updateProcessName);
	}


	@Column(name="update_user", length=30)
	public String getUpdateUser() {
		return this.vrmMoveBean.getUpdateUser();
	}

	public void setUpdateUser(String updateUser) {
		this.vrmMoveBean.setUpdateUser(updateUser);
	}

	@OneToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="movement_type_id", referencedColumnName="movement_type_id")
	public VrmMoveTypeEntity getVrmMoveTypeEntity() {
		return vrmMoveTypeEntity;
	}
	
	public void setVrmMoveTypeEntity(VrmMoveTypeEntity vrmMoveTypeEntity) {
		this.vrmMoveTypeEntity = vrmMoveTypeEntity;
	}
	
	@OneToOne(cascade= CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="collection_location_id", referencedColumnName="location_id")
	public VrmLocationEntity getVrmLocationEntity() {
		return vrmLocationEntity;
	}
	
	public void setVrmLocationEntity(VrmLocationEntity vrmLocationEntity) {
		this.vrmLocationEntity = vrmLocationEntity;
	}
}