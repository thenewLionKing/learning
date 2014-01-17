package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;

public class VrmMoveTypeBean implements Serializable {
	
	private static final long serialVersionUID = 178535158359396827L;

	private Integer movementTypeId;
	private String description;

	public VrmMoveTypeBean() {
	}

	public Integer getMovementTypeId() {
		return movementTypeId;
	}

	public void setMovementTypeId(Integer movementTypeId) {
		this.movementTypeId = movementTypeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}