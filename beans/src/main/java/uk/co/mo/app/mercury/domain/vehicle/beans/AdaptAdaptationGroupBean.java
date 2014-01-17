package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;


public class AdaptAdaptationGroupBean implements Serializable {
	
	private static final long serialVersionUID = -5776777783806785598L;
	private Integer groupId;
	private Boolean activeInd;
	private String groupName;


	public AdaptAdaptationGroupBean() {
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Boolean isActiveInd() {
		return activeInd;
	}

	public void setActiveInd(Boolean activeInd) {
		this.activeInd = activeInd;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
}