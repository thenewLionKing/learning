package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;

public class VrmStockGradeBean implements Serializable{
	
	private static final long serialVersionUID = -3056351002205736430L;

	private Integer stockGradeId;
	private String gradeDesc;
	private String stockGrade;
	private Boolean vrmGrade;

	public VrmStockGradeBean() {
	}

	public Integer getStockGradeId() {
		return stockGradeId;
	}

	public void setStockGradeId(Integer stockGradeId) {
		this.stockGradeId = stockGradeId;
	}

	public String getGradeDesc() {
		return gradeDesc;
	}

	public void setGradeDesc(String gradeDesc) {
		this.gradeDesc = gradeDesc;
	}

	public String getStockGrade() {
		return stockGrade;
	}

	public void setStockGrade(String stockGrade) {
		this.stockGrade = stockGrade;
	}

	public Boolean isVrmGrade() {
		return vrmGrade;
	}

	public void setVrmGrade(Boolean vrmGrade) {
		this.vrmGrade = vrmGrade;
	}
}