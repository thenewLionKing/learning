package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import javax.persistence.*;

import uk.co.mo.app.mercury.domain.vehicle.beans.VrmVcrGradeIdBean;


/**
 * The persistent class for the vrm_vcr_grade_ids database table.
 * 
 */
@Entity
@Table(name="vrm_vcr_grade_ids")
public class VrmVcrGradeIdEntity implements Serializable {

	private static final long serialVersionUID = -8791588683739238022L;

	private VrmVcrGradeIdBean vrmVcrGradeIdBean = new VrmVcrGradeIdBean();

	public VrmVcrGradeIdEntity() {
    }

	@Transient
	public VrmVcrGradeIdBean getVrmVcrGradeIdBean() {
		return vrmVcrGradeIdBean;
	}


	public void setVrmVcrGradeIdBean(VrmVcrGradeIdBean vrmVcrGradeIdBean) {
		this.vrmVcrGradeIdBean = vrmVcrGradeIdBean;
	}
	
	
	@Id
	@Column(name="vcr_grade_id")
	public Integer getVcrGradeId() {
		return this.vrmVcrGradeIdBean.getVcrGradeId();
	}

	public void setVcrGradeId(Integer vcrGradeId) {
		this.vrmVcrGradeIdBean.setVcrGradeId(vcrGradeId);
	}


	public Integer getSeverity() {
		return this.vrmVcrGradeIdBean.getSeverity();
	}

	public void setSeverity(Integer severity) {
		this.vrmVcrGradeIdBean.setSeverity(severity);
	}


	@Column(name="vcr_grade_desc")
	public String getVcrGradeDesc() {
		return this.vrmVcrGradeIdBean.getVcrGradeDesc();
	}

	public void setVcrGradeDesc(String vcrGradeDesc) {
		this.vrmVcrGradeIdBean.setVcrGradeDesc(vcrGradeDesc);
	}

}