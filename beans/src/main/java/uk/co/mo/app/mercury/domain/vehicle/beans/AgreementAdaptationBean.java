package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AgreementAdaptationBean implements Serializable {
	
	private static final long serialVersionUID = 8208040874447899356L;
	private Integer agreementAdaptationId;
	private Integer adaptationId;
	private Integer agreementId;
	private BigDecimal custPrice;
	private BigDecimal custVat;
	private Integer fitterId;
	private Integer groupId;
	private Integer manufacturerId;
	private String name;
	private BigDecimal price;
	private BigDecimal vat;
	private AdaptFitterBean adaptFitterBean;
	private AdaptAdaptationBean adaptAdaptationBean;
	private Date addedDate;
	private Date deletedDate;
	private Boolean deletedInd;
	private Boolean demonstrationRequired;
	private Integer impactId;
	private BigDecimal monthlyTopUpRentalAmount;
	private Boolean onSchemeInd;
	private Date removedDate;
	private Boolean removedInd;

	public AgreementAdaptationBean() {
	}

	public Integer getAgreementAdaptationId() {
		return agreementAdaptationId;
	}

	public void setAgreementAdaptationId(Integer agreementAdaptationId) {
		this.agreementAdaptationId = agreementAdaptationId;
	}

	public Integer getAdaptationId() {
		return adaptationId;
	}

	public void setAdaptationId(Integer adaptationId) {
		this.adaptationId = adaptationId;
	}

	public Integer getAgreementId() {
		return agreementId;
	}

	public void setAgreementId(Integer agreementId) {
		this.agreementId = agreementId;
	}

	public BigDecimal getCustPrice() {
		return custPrice;
	}

	public void setCustPrice(BigDecimal custPrice) {
		this.custPrice = custPrice;
	}

	public BigDecimal getCustVat() {
		return custVat;
	}

	public void setCustVat(BigDecimal custVat) {
		this.custVat = custVat;
	}

	public Integer getFitterId() {
		return fitterId;
	}

	public void setFitterId(Integer fitterId) {
		this.fitterId = fitterId;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getVat() {
		return vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	public AdaptFitterBean getAdaptFitterBean() {
		return adaptFitterBean;
	}

	public void setAdaptFitterBean(AdaptFitterBean adaptFitterBean) {
		this.adaptFitterBean = adaptFitterBean;
	}

	public AdaptAdaptationBean getAdaptAdaptationBean() {
		return adaptAdaptationBean;
	}

	public void setAdaptAdaptationBean(AdaptAdaptationBean adaptAdaptationBean) {
		this.adaptAdaptationBean = adaptAdaptationBean;
	}
	
	public Date getAddedDate(){
		return this.addedDate;		
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate= addedDate;
	}
	
	public Date getDeletedDate() {
		return this.deletedDate;
	}

	public void setDeletedDate(Date deletedDate) {
		this.deletedDate= deletedDate;
	}

	public Boolean getDeletedInd() {
		return deletedInd;
	}

	public void setDeletedInd(Boolean deletedInd) {
		this.deletedInd = deletedInd;
	}

	public Boolean getDemonstrationRequired() {
		return demonstrationRequired;
	}

	public void setDemonstrationRequired(Boolean demonstrationRequired) {
		this.demonstrationRequired = demonstrationRequired;
	}

	public Integer getImpactId() {
		return impactId;
	}

	public void setImpactId(Integer impactId) {
		this.impactId = impactId;
	}

	public BigDecimal getMonthlyTopUpRentalAmount() {
		return monthlyTopUpRentalAmount;
	}

	public void setMonthlyTopUpRentalAmount(BigDecimal monthlyTopUpRentalAmount) {
		this.monthlyTopUpRentalAmount = monthlyTopUpRentalAmount;
	}

	public Boolean getOnSchemeInd() {
		return onSchemeInd;
	}

	public void setOnSchemeInd(Boolean onSchemeInd) {
		this.onSchemeInd = onSchemeInd;
	}

	public Date getRemovedDate() {
		return removedDate;
	}

	public void setRemovedDate(Date removedDate) {
		this.removedDate = removedDate;
	}

	public Boolean getRemovedInd() {
		return removedInd;
	}

	public void setRemovedInd(Boolean removedInd) {
		this.removedInd = removedInd;
	}
	
	@Override
	public String toString() {
		return "AgreementAdaptationBean [agreementAdaptationId="
				+ agreementAdaptationId + ", adaptationId=" + adaptationId
				+ ", agreementId=" + agreementId + ", custPrice=" + custPrice
				+ ", custVat=" + custVat + ", fitterId=" + fitterId
				+ ", groupId=" + groupId + ", manufacturerId=" + manufacturerId
				+ ", name=" + name + ", price=" + price + ", vat=" + vat
				+ ", adaptFitterBean=" + adaptFitterBean
				+ ", adaptAdaptationBean=" + adaptAdaptationBean
				+ ", addedDate=" + addedDate + ", deletedDate=" + deletedDate
				+ ", deletedInd=" + deletedInd + ", demonstrationRequired="
				+ demonstrationRequired + ", impactId=" + impactId
				+ ", monthlyTopUpRentalAmount=" + monthlyTopUpRentalAmount
				+ ", onSchemeInd=" + onSchemeInd + ", removedDate="
				+ removedDate + ", removedInd=" + removedInd + "]";
	}


}