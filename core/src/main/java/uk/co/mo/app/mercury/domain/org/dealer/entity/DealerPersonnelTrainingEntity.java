package uk.co.mo.app.mercury.domain.org.dealer.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerPersonnelTrainingBean;


/**
 * The persistent class for the dealer_personnel_training database table.
 * 
 */
@Entity
@Table(name="dealer_personnel_training")
public class DealerPersonnelTrainingEntity implements Serializable {


	private static final long serialVersionUID = -536685540640070360L;
	private DealerPersonnelTrainingBean dealerPersonnelTrainingBean = new DealerPersonnelTrainingBean();
	private DealerPersonnelEntity dealerPersonnel;

    public DealerPersonnelTrainingEntity() {
    }

    @Transient
	public DealerPersonnelTrainingBean getDealerPersonnelTrainingBean() {
		return dealerPersonnelTrainingBean;
	}


	public void setDealerPersonnelTrainingBean(
			DealerPersonnelTrainingBean dealerPersonnelTrainingBean) {
		this.dealerPersonnelTrainingBean = dealerPersonnelTrainingBean;
	}
    
	@Id
	@Column(unique=true, nullable=false)
	public Integer getId() {
		return this.dealerPersonnelTrainingBean.getId();
	}

	public void setId(Integer id) {
		this.dealerPersonnelTrainingBean.setId(id);
	}


	@Column(name="accreditation_date", columnDefinition="TIMESTAMP")
	public Date getAccreditationDate() {
		return this.dealerPersonnelTrainingBean.getAccreditationDate();
	}

	public void setAccreditationDate(Date accreditationDate) {
		this.dealerPersonnelTrainingBean.setAccreditationDate(accreditationDate);
	}


	@Column(name="course_date", nullable=false, columnDefinition="TIMESTAMP")
	public Date getCourseDate() {
		return this.dealerPersonnelTrainingBean.getCourseDate();
	}

	public void setCourseDate(Date courseDate) {
		this.dealerPersonnelTrainingBean.setCourseDate(courseDate);
	}


	@Column(name="course_id", nullable=false, length=50)
	public String getCourseId() {
		return this.dealerPersonnelTrainingBean.getCourseId();
	}

	public void setCourseId(String courseId) {
		this.dealerPersonnelTrainingBean.setCourseId(courseId);
	}


	@Column(name="course_status_id", nullable=false, length=50)
	public String getCourseStatusId() {
		return this.dealerPersonnelTrainingBean.getCourseStatusId();
	}

	public void setCourseStatusId(String courseStatusId) {
		this.dealerPersonnelTrainingBean.setCourseStatusId(courseStatusId);
	}


	@Column(name="expiry_date", columnDefinition="TIMESTAMP")
	public Date getExpiryDate() {
		return this.dealerPersonnelTrainingBean.getExpiryDate();
	}

	public void setExpiryDate(Date expiryDate) {
		this.dealerPersonnelTrainingBean.setExpiryDate(expiryDate);
	}


	//bi-directional many-to-one association to DealerPersonnelEntity
	@ManyToOne(fetch=FetchType.LAZY, cascade = {CascadeType.ALL})
	@JoinColumn(name="dealer_personnel_id", nullable=false)
	public DealerPersonnelEntity getDealerPersonnel() {
		return this.dealerPersonnel;
	}

	public void setDealerPersonnel(DealerPersonnelEntity dealerPersonnel) {
		this.dealerPersonnel = dealerPersonnel;
	}
	
}