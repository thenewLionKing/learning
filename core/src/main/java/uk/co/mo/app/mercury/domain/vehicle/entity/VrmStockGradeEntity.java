package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.VrmStockGradeBean;


/**
 * The persistent class for the vrm_stock_grade database table.
 * 
 */
@Entity
@Table(name="vrm_stock_grade")
public class VrmStockGradeEntity implements Serializable {

	private static final long serialVersionUID = -74127702546249588L;

	private VrmStockGradeBean vrmStockGradeBean = new VrmStockGradeBean();

	public VrmStockGradeEntity() {
    }

	@Transient
	public VrmStockGradeBean getVrmStockGradeBean() {
		return vrmStockGradeBean;
	}


	public void setVrmStockGradeBean(VrmStockGradeBean vrmStockGradeBean) {
		this.vrmStockGradeBean = vrmStockGradeBean;
	}

	@Id
	@Column(name="stock_grade_id")
	public Integer getStockGradeId() {
		return this.vrmStockGradeBean.getStockGradeId();
	}

	public void setStockGradeId(Integer stockGradeId) {
		this.vrmStockGradeBean.setStockGradeId(stockGradeId);
	}


	@Column(name="grade_desc")
	public String getGradeDesc() {
		return this.vrmStockGradeBean.getGradeDesc();
	}

	public void setGradeDesc(String gradeDesc) {
		this.vrmStockGradeBean.setGradeDesc(gradeDesc);
	}


	@Column(name="stock_grade", columnDefinition="CHAR")
	public String getStockGrade() {
		return this.vrmStockGradeBean.getStockGrade();
	}

	public void setStockGrade(String stockGrade) {
		this.vrmStockGradeBean.setStockGrade(stockGrade);
	}


	@Column(name="vrm_grade", columnDefinition="BIT")
	public Boolean getVrmGrade() {
		return this.vrmStockGradeBean.isVrmGrade();
	}

	public void setVrmGrade(Boolean vrmGrade) {
		this.vrmStockGradeBean.setVrmGrade(vrmGrade);
	}
}