package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;

public class VehicleColourBean implements Serializable{
	
	private static final long serialVersionUID = 2397463886449581287L;

	private Integer agreementId;
	private String colourCode;
	private String freePaintDesc;
	private Integer glassPaintId;
	private String shadeCode;
	private Integer sourceId;
	private Integer stockId;
	private String typeCode;

	private GlassPaintColourBean glassPaintColourBean;

	public VehicleColourBean() {
	}

	public Integer getAgreementId() {
		return agreementId;
	}

	public void setAgreementId(Integer agreementId) {
		this.agreementId = agreementId;
	}

	public String getColourCode() {
		return colourCode;
	}

	public void setColourCode(String colourCode) {
		this.colourCode = colourCode;
	}

	public String getFreePaintDesc() {
		return freePaintDesc;
	}

	public void setFreePaintDesc(String freePaintDesc) {
		this.freePaintDesc = freePaintDesc;
	}

	public Integer getGlassPaintId() {
		return glassPaintId;
	}

	public void setGlassPaintId(Integer glassPaintId) {
		this.glassPaintId = glassPaintId;
	}

	public String getShadeCode() {
		return shadeCode;
	}

	public void setShadeCode(String shadeCode) {
		this.shadeCode = shadeCode;
	}

	public Integer getSourceId() {
		return sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public GlassPaintColourBean getGlassPaintColourBean() {
		return this.glassPaintColourBean;
	}

	public void setGlassPaintColourBean(GlassPaintColourBean glassPaintColourBean) {
		this.glassPaintColourBean = glassPaintColourBean;		
	}

	@Override
	public String toString() {
		return "VehicleColourBean [agreementId=" + agreementId
				+ ", colourCode=" + colourCode + ", freePaintDesc="
				+ freePaintDesc + ", glassPaintId=" + glassPaintId
				+ ", shadeCode=" + shadeCode + ", sourceId=" + sourceId
				+ ", stockId=" + stockId + ", typeCode=" + typeCode
				+ ", glassPaintColourBean=" + glassPaintColourBean + "]";
	}
}