package uk.co.mo.app.mercury.domain.translease.vcd.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.translease.vcd.beans.TlVcdBean;

@Entity
@Table(name="tl_vcd")
public class TlVcdEntity implements Serializable {

	private static final long serialVersionUID = 7219443084670469410L;

	private List<TlVcdConditionLineEntity> tlVcdConditionLines;

	private TlVcdBean tlVcdBean;

    public TlVcdEntity() {	}

    @Transient
    public TlVcdBean getTlVcdBean() {
		return tlVcdBean;
	}
	public void setTlVcdBean(TlVcdBean tlVcdBean) {
		this.tlVcdBean = tlVcdBean;
	}

	@Id
	@Column(name="translease_transaction_number", unique=true, nullable=false, columnDefinition="INT")
	public Integer getTransleaseTransactionNumber() {
		return this.tlVcdBean.getTransleaseTransactionNumber();
	}
	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.tlVcdBean.setTransleaseTransactionNumber( transleaseTransactionNumber );
	}
	@Column(name="asset_number", nullable=false, columnDefinition="INT")
	public Integer getAssetNumber() {
		return this.tlVcdBean.getAssetNumber();
	}
	public void setAssetNumber(Integer assetNumber) {
		this.tlVcdBean.setAssetNumber( assetNumber );
	}
	@Column(name="car_registration_number", nullable=false, length=8, columnDefinition="CHAR(8)")
	public String getCarRegistrationNumber() {
		return this.tlVcdBean.getCarRegistrationNumber();
	}
	public void setCarRegistrationNumber(String carRegistrationNumber) {
		this.tlVcdBean.setCarRegistrationNumber( carRegistrationNumber );
	}
	@Column(name="completed_by", nullable=false, length=30, columnDefinition="CHAR(30)")
	public String getCompletedBy() {
		return this.tlVcdBean.getCompletedBy();
	}
	public void setCompletedBy(String completedBy) {
		this.tlVcdBean.setCompletedBy( completedBy );
	}
	@Column(name="general_exterior_condition", nullable=false, length=6, columnDefinition="VARCHAR(6)")
	public String getGeneralExteriorCondition() {
		return this.tlVcdBean.getGeneralExteriorCondition();
	}
	public void setGeneralExteriorCondition(String generalExteriorCondition) {
		this.tlVcdBean.setGeneralExteriorCondition( generalExteriorCondition );
	}
	@Column(name="general_interior_condition", nullable=false, length=6, columnDefinition="VARCHAR(6)")
	public String getGeneralInteriorCondition() {
		return this.tlVcdBean.getGeneralInteriorCondition();
	}
	public void setGeneralInteriorCondition(String generalInteriorCondition) {
		this.tlVcdBean.setGeneralInteriorCondition( generalInteriorCondition );
	}
	@Column(name="job_title", nullable=false, length=2, columnDefinition="CHAR(2)")
	public String getJobTitle() {
		return this.tlVcdBean.getJobTitle();
	}
	public void setJobTitle(String jobTitle) {
		this.tlVcdBean.setJobTitle(jobTitle);
	}
	@Column(name="job_title_other", length=30, columnDefinition="CHAR(30)")
	public String getJobTitleOther() {
		return this.tlVcdBean.getJobTitleOther();
	}
	public void setJobTitleOther(String jobTitleOther) {
		this.tlVcdBean.setJobTitleOther( jobTitleOther );
	}
	@Column(name="leaseco_repairer_ref", nullable=false, length=5, columnDefinition="CHAR(5)")
	public String getLeasecoRepairerRef() {
		return this.tlVcdBean.getLeasecoRepairerRef();
	}
	public void setLeasecoRepairerRef(String leasecoRepairerRef) {
		this.tlVcdBean.setLeasecoRepairerRef( leasecoRepairerRef );
	}
	@Column(name="odometer_reading", nullable=false, columnDefinition="INT")
	public Integer getOdometerReading() {
		return this.tlVcdBean.getOdometerReading();
	}
	public void setOdometerReading(Integer odometerReading) {
		this.tlVcdBean.setOdometerReading( odometerReading );
	}
	@Column(name="translease_repairer_number", nullable=false, columnDefinition="INT")
	public Integer getTransleaseRepairerNumber() {
		return this.tlVcdBean.getTransleaseRepairerNumber();
	}
	public void setTransleaseRepairerNumber(Integer transleaseRepairerNumber) {
		this.tlVcdBean.setTransleaseRepairerNumber( transleaseRepairerNumber );
	}
	@Column(name="vcd_date", nullable=false, columnDefinition="SMALLDATETIME")
	public Date getVcdDate() {
		return this.tlVcdBean.getVcdDate();
	}
	public void setVcdDate(Date vcdDate) {
		this.tlVcdBean.setVcdDate( vcdDate );
	}
	//bi-directional many-to-one association to TlVcdConditionLine
	@OneToMany(mappedBy="tlVcd", cascade={CascadeType.ALL} )
	public List<TlVcdConditionLineEntity> getTlVcdConditionLines() {
		return this.tlVcdConditionLines;
	}
	public void setTlVcdConditionLines(List<TlVcdConditionLineEntity> tlVcdConditionLines) {
		this.tlVcdConditionLines = tlVcdConditionLines;
	}
}