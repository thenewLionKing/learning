package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.util.Date;

public class VrmHandbackDetailsHistoryBean implements Serializable{
	
	private static final long serialVersionUID = 1298521628216000140L;

	private Integer handbackDetailsId;
	private Boolean actualFlag;
	private Integer agreementId;
	private Integer dateChangeComment;
	private Date handbackDate;
	private Integer handbackDealerId;

	private Date insertDate;
	private String insertUser;
	private Date letterPrintedDate;

	private VrmOrganisationBean vrmOrganisationBean;

	public VrmHandbackDetailsHistoryBean() {
	}

	public Integer getHandbackDetailsId() {
		return handbackDetailsId;
	}

	public void setHandbackDetailsId(Integer handbackDetailsId) {
		this.handbackDetailsId = handbackDetailsId;
	}

	public Boolean isActualFlag() {
		return actualFlag;
	}

	public void setActualFlag(Boolean actualFlag) {
		this.actualFlag = actualFlag;
	}

	public Integer getAgreementId() {
		return agreementId;
	}

	public void setAgreementId(Integer agreementId) {
		this.agreementId = agreementId;
	}

	public Integer getDateChangeComment() {
		return dateChangeComment;
	}

	public void setDateChangeComment(Integer dateChangeComment) {
		this.dateChangeComment = dateChangeComment;
	}

	public Date getHandbackDate() {
		return handbackDate;
	}

	public void setHandbackDate(Date handbackDate) {
		this.handbackDate = handbackDate;
	}

	public Integer gethandbackDealerId() {
		return handbackDealerId;
	}

	public void sethandbackDealerId(Integer _handbackDealerId__) {
		this.handbackDealerId = _handbackDealerId__;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public String getInsertUser() {
		return insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}

	public Date getLetterPrintedDate() {
		return letterPrintedDate;
	}

	public void setLetterPrintedDate(Date letterPrintedDate) {
		this.letterPrintedDate = letterPrintedDate;
	}

	public VrmOrganisationBean getVrmOrganisationBean() {
		return vrmOrganisationBean;
	}

	public void setVrmOrganisationBean(VrmOrganisationBean vrmOrganisationBean) {
		this.vrmOrganisationBean = vrmOrganisationBean;
	}


}