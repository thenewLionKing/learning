package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;

public class VrmVcrGradeIdBean implements Serializable{

	private static final long serialVersionUID = -4021455345860093836L;
	
	private Integer vcrGradeId;
	private Integer severity;
	private String vcrGradeDesc;

	public VrmVcrGradeIdBean() {
	}

	public Integer getVcrGradeId() {
		return vcrGradeId;
	}

	public void setVcrGradeId(Integer vcrGradeId) {
		this.vcrGradeId = vcrGradeId;
	}

	public Integer getSeverity() {
		return severity;
	}

	public void setSeverity(Integer severity) {
		this.severity = severity;
	}

	public String getVcrGradeDesc() {
		return vcrGradeDesc;
	}

	public void setVcrGradeDesc(String vcrGradeDesc) {
		this.vcrGradeDesc = vcrGradeDesc;
	}

	@Override
	public String toString() {
		return "VrmVcrGradeIdBean [vcrGradeId=" + vcrGradeId + ", severity="
				+ severity + ", vcrGradeDesc=" + vcrGradeDesc + "]";
	}
}