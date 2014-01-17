package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.util.Date;

public class VrmMoveBean implements Serializable{
	
	private static final long serialVersionUID = -3572816218291093463L;

	private Integer movementId;
	private Integer carrierId;
	private String collectionAmPm;
	private String collectionComments;
	private Date collectionConfirmationDate;
	private String collectionContactName;
	private String collectionContactPhone;
	private Date collectionDate;
	private Integer collectionLocationId;
	private String deliveryComments;
	private Date deliveryConfirmationDate;
	private String deliveryContactName;
	private String deliveryContactPhone;
	private Date deliveryDate;
	private Integer deliveryLocationId;
	private Integer departmentId;
	private Boolean driveable;
	private String jobNo;
	private Boolean manualDatesOverride;
	private Integer movementTypeId;
	private Integer stateId;
	private Integer stockId;
	private String updateProcessName;
	private Date updateDate;
	private Date insertDate;
	private String updateUser;
	private VrmLocationBean vrmLocationBean;
	private VrmMoveTypeBean vrmMoveTypeBean;
	

	public VrmMoveBean() {
	}

	public Integer getMovementId() {
		return movementId;
	}

	public void setMovementId(Integer movementId) {
		this.movementId = movementId;
	}

	public Integer getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(Integer carrierId) {
		this.carrierId = carrierId;
	}

	public String getCollectionAmPm() {
		return collectionAmPm;
	}

	public void setCollectionAmPm(String collectionAmPm) {
		this.collectionAmPm = collectionAmPm;
	}

	public String getCollectionComments() {
		return collectionComments;
	}

	public void setCollectionComments(String collectionComments) {
		this.collectionComments = collectionComments;
	}

	public Date getCollectionConfirmationDate() {
		return collectionConfirmationDate;
	}

	public void setCollectionConfirmationDate(Date collectionConfirmationDate) {
		this.collectionConfirmationDate = collectionConfirmationDate;
	}

	public String getCollectionContactName() {
		return collectionContactName;
	}

	public void setCollectionContactName(String collectionContactName) {
		this.collectionContactName = collectionContactName;
	}

	public String getCollectionContactPhone() {
		return collectionContactPhone;
	}

	public void setCollectionContactPhone(String collectionContactPhone) {
		this.collectionContactPhone = collectionContactPhone;
	}

	public Date getCollectionDate() {
		return collectionDate;
	}

	public void setCollectionDate(Date collectionDate) {
		this.collectionDate = collectionDate;
	}

	public Integer getCollectionLocationId() {
		return collectionLocationId;
	}

	public void setCollectionLocationId(Integer collectionLocationId) {
		this.collectionLocationId = collectionLocationId;
	}

	public String getDeliveryComments() {
		return deliveryComments;
	}

	public void setDeliveryComments(String deliveryComments) {
		this.deliveryComments = deliveryComments;
	}

	public Date getDeliveryConfirmationDate() {
		return deliveryConfirmationDate;
	}

	public void setDeliveryConfirmationDate(Date deliveryConfirmationDate) {
		this.deliveryConfirmationDate = deliveryConfirmationDate;
	}

	public String getDeliveryContactName() {
		return deliveryContactName;
	}

	public void setDeliveryContactName(String deliveryContactName) {
		this.deliveryContactName = deliveryContactName;
	}

	public String getDeliveryContactPhone() {
		return deliveryContactPhone;
	}

	public void setDeliveryContactPhone(String deliveryContactPhone) {
		this.deliveryContactPhone = deliveryContactPhone;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Integer getDeliveryLocationId() {
		return deliveryLocationId;
	}

	public void setDeliveryLocationId(Integer deliveryLocationId) {
		this.deliveryLocationId = deliveryLocationId;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Boolean isDriveable() {
		return driveable;
	}

	public void setDriveable(Boolean driveable) {
		this.driveable = driveable;
	}

	public String getJobNo() {
		return jobNo;
	}

	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}

	public Boolean isManualDatesOverride() {
		return manualDatesOverride;
	}

	public void setManualDatesOverride(Boolean manualDatesOverride) {
		this.manualDatesOverride = manualDatesOverride;
	}

	public Integer getMovementTypeId() {
		return movementTypeId;
	}

	public void setMovementTypeId(Integer movementTypeId) {
		this.movementTypeId = movementTypeId;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getUpdateProcessName() {
		return updateProcessName;
	}

	public void setUpdateProcessName(String updateProcessName) {
		this.updateProcessName = updateProcessName;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
	public VrmLocationBean getVrmLocationBean() {
		return vrmLocationBean;
	}

	public void setVrmLocationBean(VrmLocationBean vrmLocationBean) {
		this.vrmLocationBean = vrmLocationBean;
	}

	public VrmMoveTypeBean getVrmMoveTypeBean() {
		return vrmMoveTypeBean;
	}

	public void setVrmMoveTypeBean(VrmMoveTypeBean vrmMoveTypeBean) {
		this.vrmMoveTypeBean = vrmMoveTypeBean;
	}
}