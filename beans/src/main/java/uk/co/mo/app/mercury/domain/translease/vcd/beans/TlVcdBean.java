package uk.co.mo.app.mercury.domain.translease.vcd.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TlVcdBean implements Serializable {

	private static final long serialVersionUID = -292359114338808869L;

	private Integer transleaseTransactionNumber;
	private Integer assetNumber;
	private String carRegistrationNumber;
	private String completedBy;
	private String generalExteriorCondition;
	private String generalInteriorCondition;
	private String jobTitle;
	private String jobTitleOther;
	private String leasecoRepairerRef;
	private Integer odometerReading;
	private Integer transleaseRepairerNumber;
	private Date vcdDate;
	private List<TlVcdConditionLineBean> tlVcdConditionLineBeans;

	public Integer getTransleaseTransactionNumber() {
		return transleaseTransactionNumber;
	}
	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.transleaseTransactionNumber = transleaseTransactionNumber;
	}
	public Integer getAssetNumber() {
		return assetNumber;
	}
	public void setAssetNumber(Integer assetNumber) {
		this.assetNumber = assetNumber;
	}
	public String getCarRegistrationNumber() {
		return carRegistrationNumber;
	}
	public void setCarRegistrationNumber(String carRegistrationNumber) {
		this.carRegistrationNumber = carRegistrationNumber;
	}
	public String getCompletedBy() {
		return completedBy;
	}
	public void setCompletedBy(String completedBy) {
		this.completedBy = completedBy;
	}
	public String getGeneralExteriorCondition() {
		return generalExteriorCondition;
	}
	public void setGeneralExteriorCondition(String generalExteriorCondition) {
		this.generalExteriorCondition = generalExteriorCondition;
	}
	public String getGeneralInteriorCondition() {
		return generalInteriorCondition;
	}
	public void setGeneralInteriorCondition(String generalInteriorCondition) {
		this.generalInteriorCondition = generalInteriorCondition;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobTitleOther() {
		return jobTitleOther;
	}
	public void setJobTitleOther(String jobTitleOther) {
		this.jobTitleOther = jobTitleOther;
	}
	public String getLeasecoRepairerRef() {
		return leasecoRepairerRef;
	}
	public void setLeasecoRepairerRef(String leasecoRepairerRef) {
		this.leasecoRepairerRef = leasecoRepairerRef;
	}
	public Integer getOdometerReading() {
		return odometerReading;
	}
	public void setOdometerReading(Integer odometerReading) {
		this.odometerReading = odometerReading;
	}
	public Integer getTransleaseRepairerNumber() {
		return transleaseRepairerNumber;
	}
	public void setTransleaseRepairerNumber(Integer transleaseRepairerNumber) {
		this.transleaseRepairerNumber = transleaseRepairerNumber;
	}
	public Date getVcdDate() {
		return vcdDate;
	}
	public void setVcdDate(Date vcdDate) {
		this.vcdDate = vcdDate;
	}
	public List<TlVcdConditionLineBean> getTlVcdConditionLineBeans() {
		return tlVcdConditionLineBeans;
	}
	public void setTlVcdConditionLineBeans(
			List<TlVcdConditionLineBean> tlVcdConditionLineBeans) {
		this.tlVcdConditionLineBeans = tlVcdConditionLineBeans;
	}
}
