package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import javax.persistence.*;

import uk.co.mo.app.mercury.domain.vehicle.beans.VrmDeliveryTypeBean;


/**
 * The persistent class for the vrm_delivery_type database table.
 * 
 */
@Entity
@Table(name="vrm_delivery_type")
public class VrmDeliveryTypeEntity implements Serializable {


	private static final long serialVersionUID = 7126053967905874509L;

	private VrmDeliveryTypeBean vrmDeliveryTypeBean = new VrmDeliveryTypeBean();

	public VrmDeliveryTypeEntity() {
    }
	
	@Transient
	public VrmDeliveryTypeBean getVrmDeliveryTypeBean() {
		return vrmDeliveryTypeBean;
	}
	
	
	public void setVrmDeliveryTypeBean(VrmDeliveryTypeBean vrmDeliveryTypeBean) {
		this.vrmDeliveryTypeBean = vrmDeliveryTypeBean;
	}

	@Id
	@Column(name="delivery_type_id")
	public Integer getDeliveryTypeId() {
		return this.vrmDeliveryTypeBean.getDeliveryTypeId();
	}

	public void setDeliveryTypeId(Integer deliveryTypeId) {
		this.vrmDeliveryTypeBean.setDeliveryTypeId(deliveryTypeId);
	}


	@Column(name="delivery_type")
	public String getDeliveryType() {
		return this.vrmDeliveryTypeBean.getDeliveryType();
	}

	public void setDeliveryType(String deliveryType) {
		this.vrmDeliveryTypeBean.setDeliveryType(deliveryType);
	}

}