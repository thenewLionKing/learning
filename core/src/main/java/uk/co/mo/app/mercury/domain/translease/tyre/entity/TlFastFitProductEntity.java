package uk.co.mo.app.mercury.domain.translease.tyre.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlFastFitProductBean;

@javax.persistence.Table(name = "tl_fast_fit_product", schema = "dbo", catalog = "Enterprise")
@Entity
public class TlFastFitProductEntity implements Serializable {

	private static final long serialVersionUID = -7321871618375931104L;

	private TlFastFitProductBean tlFastFitProductBean = new TlFastFitProductBean();

	private Short fastFitProductId;
	
    public TlFastFitProductEntity() {	}

	@Transient
	public TlFastFitProductBean getTlFastFitProductBean() {
		return tlFastFitProductBean;
	}
	public void setTlFastFitProductBean(TlFastFitProductBean tlFastFitProductBean) {
		this.tlFastFitProductBean = tlFastFitProductBean;
	}

	@Id
	@Column(name="fast_fit_product_id", unique=true, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Short getFastFitProductId() {
		return fastFitProductId;
	}
	public void setFastFitProductId(Short fastFitProductId) {
		this.fastFitProductId = fastFitProductId;
	}
	@Column(name="fast_fit_record_type", nullable=false, length=3, columnDefinition="CHAR")
	public String getFastFitRecordType() {
		return this.tlFastFitProductBean.getFastFitRecordType();
	}
	public void setFastFitRecordType(String fastFitRecordType) {
		this.tlFastFitProductBean.setFastFitRecordType( fastFitRecordType );
	}
	@Column(name="transmission_action", nullable=false, length=1, columnDefinition="CHAR(1)")
	public String getTransmissionAction() {
		return this.tlFastFitProductBean.getTransmissionAction();
	}
	public void setTransmissionAction(String transmissionAction) {
		this.tlFastFitProductBean.setTransmissionAction( transmissionAction );
	}
	@Column(name="tyre_aspect_ratio", columnDefinition="SMALLINT")
	public Short getTyreAspectRatio() {
		return this.tlFastFitProductBean.getTyreAspectRatio();
	}
	public void setTyreAspectRatio(Short tyreAspectRatio) {
		this.tlFastFitProductBean.setTyreAspectRatio( tyreAspectRatio );
	}
	@Column(name="tyre_construction", length=1, columnDefinition="CHAR(1)")
	public String getTyreConstruction() {
		return this.tlFastFitProductBean.getTyreConstruction();
	}
	public void setTyreConstruction(String tyreConstruction) {
		this.tlFastFitProductBean.setTyreConstruction( tyreConstruction );
	}
	@Column(name="tyre_manufacturer", length=3, columnDefinition="CHAR(3)")
	public String getTyreManufacturer() {
		return this.tlFastFitProductBean.getTyreManufacturer();
	}
	public void setTyreManufacturer(String tyreManufacturer) {
		this.tlFastFitProductBean.setTyreManufacturer( tyreManufacturer );
	}
	@Column(name="tyre_ply_rating", length=1, columnDefinition="CHAR(1)")
	public String getTyrePlyRating() {
		return this.tlFastFitProductBean.getTyrePlyRating();
	}
	public void setTyrePlyRating(String tyrePlyRating) {
		this.tlFastFitProductBean.setTyrePlyRating( tyrePlyRating );
	}
	@Column(name="tyre_speed_rating", length=1, columnDefinition="CHAR(1)")
	public String getTyreSpeedRating() {
		return this.tlFastFitProductBean.getTyreSpeedRating();
	}
	public void setTyreSpeedRating(String tyreSpeedRating) {
		this.tlFastFitProductBean.setTyreSpeedRating( tyreSpeedRating );
	}
	@Column(name="tyre_wheel_rim_size", columnDefinition="SMALLINT")
	public Short getTyreWheelRimSize() {
		return this.tlFastFitProductBean.getTyreWheelRimSize();
	}
	public void setTyreWheelRimSize(Short tyreWheelRimSize) {
		this.tlFastFitProductBean.setTyreWheelRimSize( tyreWheelRimSize );
	}
	@Column(name="tyre_width", columnDefinition="SMALLINT")
	public Short getTyreWidth() {
		return this.tlFastFitProductBean.getTyreWidth();
	}
	public void setTyreWidth(Short tyreWidth) {
		this.tlFastFitProductBean.setTyreWidth( tyreWidth );
	}
	@Column(name="version_number", nullable=false, columnDefinition="SMALLINT")
	public Short getVersionNumber() {
		return this.tlFastFitProductBean.getVersionNumber();
	}
	public void setVersionNumber(Short versionNumber) {
		this.tlFastFitProductBean.setVersionNumber( versionNumber );
	}
	@Column(name="product_code", length=20, columnDefinition="CHAR(20)")
	public String getProductCode() {
		return this.tlFastFitProductBean.getProductCode();
	}
	public void setProductCode(String productCode) {
		this.tlFastFitProductBean.setProductCode( productCode );
	}
}
