package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;

public class VrmDeliveryTypeBean implements Serializable{
	
	private static final long serialVersionUID = -327902893760606941L;

	private Integer deliveryTypeId;
	private String deliveryType;

	public VrmDeliveryTypeBean() {
	}

	public Integer getDeliveryTypeId() {
		return deliveryTypeId;
	}

	public void setDeliveryTypeId(Integer deliveryTypeId) {
		this.deliveryTypeId = deliveryTypeId;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	@Override
	public String toString() {
		return "VrmDeliveryTypeBean [deliveryTypeId=" + deliveryTypeId
				+ ", deliveryType=" + deliveryType + "]";
	}
}