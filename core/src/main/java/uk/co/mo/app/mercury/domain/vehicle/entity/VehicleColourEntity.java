package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;
import javax.persistence.*;

import uk.co.mo.app.mercury.domain.vehicle.beans.VehicleColourBean;


/**
 * The persistent class for the vehicle_colour database table.
 * 
 */
@Entity
@Table(name="vehicle_colour")
public class VehicleColourEntity implements Serializable {

	private static final long serialVersionUID = -1978175265122711984L;

	private VehicleColourBean vehicleColourBean = new VehicleColourBean();
	private GlassPaintColourEntity glassPaintColourEntity;

	public VehicleColourEntity() {
    }

	@Transient
	public VehicleColourBean getVehicleColourBean() {
		return vehicleColourBean;
	}


	public void setVehicleColourBean(VehicleColourBean vehicleColourBean) {
		this.vehicleColourBean = vehicleColourBean;
	}

	@Id
	@Column(name="agreement_id")
	public Integer getAgreementId() {
		return this.vehicleColourBean.getAgreementId();
	}

	public void setAgreementId(Integer agreementId) {
		this.vehicleColourBean.setAgreementId(agreementId);
	}


	@Column(name="colour_code", columnDefinition="CHAR", insertable=false, updatable=false)
	public String getColourCode() {
		return this.vehicleColourBean.getColourCode();
	}

	public void setColourCode(String colourCode) {
		this.vehicleColourBean.setColourCode(colourCode);
	}


	@Column(name="free_paint_desc")
	public String getFreePaintDesc() {
		return this.vehicleColourBean.getFreePaintDesc();
	}

	public void setFreePaintDesc(String freePaintDesc) {
		this.vehicleColourBean.setFreePaintDesc(freePaintDesc);
	}


	@Column(name="glass_paint_id")
	public Integer getGlassPaintId() {
		return this.vehicleColourBean.getGlassPaintId();
	}

	public void setGlassPaintId(Integer glassPaintId) {
		this.vehicleColourBean.setGlassPaintId(glassPaintId);
	}


	@Column(name="shade_code", columnDefinition="CHAR")
	public String getShadeCode() {
		return this.vehicleColourBean.getShadeCode();
	}

	public void setShadeCode(String shadeCode) {
		this.vehicleColourBean.setShadeCode(shadeCode);
	}


	@Column(name="source_id")
	public Integer getSourceId() {
		return this.vehicleColourBean.getSourceId();
	}

	public void setSourceId(Integer sourceId) {
		this.vehicleColourBean.setSourceId(sourceId);
	}


	@Column(name="stock_id")
	public Integer getStockId() {
		return this.vehicleColourBean.getStockId();
	}

	public void setStockId(Integer stockId) {
		this.vehicleColourBean.setStockId(stockId);
	}


	@Column(name="type_code", columnDefinition="CHAR")
	public String getTypeCode() {
		return this.vehicleColourBean.getTypeCode();
	}

	public void setTypeCode(String typeCode) {
		this.vehicleColourBean.setTypeCode(typeCode);
	}

	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="colour_code", referencedColumnName="pt_colour_code")
	public GlassPaintColourEntity getGlassPaintColourEntity() {
		return glassPaintColourEntity;
	}

	public void setGlassPaintColourEntity(GlassPaintColourEntity glassPaintColourEntity) {
		this.glassPaintColourEntity = glassPaintColourEntity;
	}

}