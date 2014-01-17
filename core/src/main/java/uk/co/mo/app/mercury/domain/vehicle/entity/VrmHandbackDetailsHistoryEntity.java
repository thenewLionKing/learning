package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.VrmHandbackDetailsHistoryBean;


/**
 * The persistent class for the vrm_handback_details_history database table.
 * 
 */
@Entity
@Table(name="vrm_handback_details_history")
public class VrmHandbackDetailsHistoryEntity implements Serializable {

	private static final long serialVersionUID = -2335888431466151401L;

	private VrmHandbackDetailsHistoryBean vrmHandbackDetailsHistoryBean = new VrmHandbackDetailsHistoryBean();
	private VrmOrganisationEntity vrmOrganisationEntity;
	
	
	public VrmHandbackDetailsHistoryEntity() {
    }

	@Transient
	public VrmHandbackDetailsHistoryBean getVrmHandbackDetailsHistoryBean() {
		return vrmHandbackDetailsHistoryBean;
	}


	public void setVrmHandbackDetailsHistoryBean(
			VrmHandbackDetailsHistoryBean vrmHandbackDetailsHistoryBean) {
		this.vrmHandbackDetailsHistoryBean = vrmHandbackDetailsHistoryBean;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="handback_details_id")
	public Integer getHandbackDetailsId() {
		return this.vrmHandbackDetailsHistoryBean.getHandbackDetailsId();
	}

	public void setHandbackDetailsId(Integer handbackDetailsId) {
		this.vrmHandbackDetailsHistoryBean.setHandbackDetailsId(handbackDetailsId);
	}


	@Column(name="actual_flag", nullable=false)
	public Boolean getActualFlag() {
		return this.vrmHandbackDetailsHistoryBean.isActualFlag();
	}

	public void setActualFlag(Boolean actualFlag) {
		this.vrmHandbackDetailsHistoryBean.setActualFlag(actualFlag);
	}


	@Column(name="agreement_id", nullable=false, insertable=false, updatable=false)
	public Integer getAgreementId() {
		return this.vrmHandbackDetailsHistoryBean.getAgreementId();
	}

	public void setAgreementId(Integer agreementId) {
		this.vrmHandbackDetailsHistoryBean.setAgreementId(agreementId);
	}


	@Column(name="date_change_comment")
	public Integer getDateChangeComment() {
		return this.vrmHandbackDetailsHistoryBean.getDateChangeComment();
	}

	public void setDateChangeComment(Integer dateChangeComment) {
		this.vrmHandbackDetailsHistoryBean.setDateChangeComment(dateChangeComment);
	}


	@Column(name="handback_date")
	public Date getHandbackDate() {
		return this.vrmHandbackDetailsHistoryBean.getHandbackDate();
	}

	public void setHandbackDate(Date handbackDate) {
		this.vrmHandbackDetailsHistoryBean.setHandbackDate(handbackDate);
	}


	@Column(name="handback_dealer_id ", insertable=false, updatable=false)
	public Integer getHandbackDealerId() {
		return this.vrmHandbackDetailsHistoryBean.gethandbackDealerId();
	}

	public void setHandbackDealerId(Integer handbackDealerId) {
		this.vrmHandbackDetailsHistoryBean.sethandbackDealerId(handbackDealerId);
	}


	@Column(name="insert_date", nullable=false)
	public Date getInsertDate() {
		return this.vrmHandbackDetailsHistoryBean.getInsertDate();
	}

	public void setInsertDate(Date insertDate) {
		this.vrmHandbackDetailsHistoryBean.setInsertDate(insertDate);
	}


	@Column(name="insert_user", nullable=false, length=30)
	public String getInsertUser() {
		return this.vrmHandbackDetailsHistoryBean.getInsertUser();
	}

	public void setInsertUser(String insertUser) {
		this.vrmHandbackDetailsHistoryBean.setInsertUser(insertUser);
	}


	@Column(name="letter_printed_date")
	public Date getLetterPrintedDate() {
		return this.vrmHandbackDetailsHistoryBean.getLetterPrintedDate();
	}

	public void setLetterPrintedDate(Date letterPrintedDate) {
		this.vrmHandbackDetailsHistoryBean.setLetterPrintedDate(letterPrintedDate);
	}

	@OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
	@JoinColumn(name="handback_dealer_id ", referencedColumnName="organisation_id")
	public VrmOrganisationEntity getVrmOrganisationEntity() {
		return this.vrmOrganisationEntity;
	}

	public void setVrmOrganisationEntity(VrmOrganisationEntity vrmOrganisationEntity) {
		this.vrmOrganisationEntity = vrmOrganisationEntity;
	}
}