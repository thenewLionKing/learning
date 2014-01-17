package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class AdaptAdaptationBean implements Serializable {
	
	private static final long serialVersionUID = -5506594369268865149L;
	private Integer adaptationId;
	private String adaptationName;
	private BigDecimal price;
	private BigDecimal vat;
	private BigDecimal custPrice;
	private BigDecimal custVat;
	private String description;
	private AdaptAdaptationGroupBean adaptAdaptationGroupBean;
	private AdaptManufacturerBean adaptManufacturerBean;

	public AdaptAdaptationBean() {
	}

	public Integer getAdaptationId() {
		return adaptationId;
	}

	public void setAdaptationId(Integer adaptationId) {
		this.adaptationId = adaptationId;
	}

	public String getAdaptationName() {
		return adaptationName;
	}

	public void setAdaptationName(String adaptationName) {
		this.adaptationName = adaptationName;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAdaptAdaptationGroupBean(AdaptAdaptationGroupBean adaptAdaptationGroupBean) {
		this.adaptAdaptationGroupBean = adaptAdaptationGroupBean;
	}

	public AdaptAdaptationGroupBean getAdaptAdaptationGroupBean() {
		return adaptAdaptationGroupBean;
	}

	public void setAdaptManufacturerBean(AdaptManufacturerBean adaptManufacturerBean) {
		this.adaptManufacturerBean = adaptManufacturerBean;
	}

	public AdaptManufacturerBean getAdaptManufacturerBean() {
		return adaptManufacturerBean;
	}
}