package uk.co.mo.app.mercury.domain.translease.tyre.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.translease.tyre.beans.TlTyreBean;

@javax.persistence.Table(name = "tl_tyre", schema = "dbo", catalog = "Enterprise")
@Entity
public class TlTyreEntity implements Serializable {

	private static final long serialVersionUID = -8287350186598016026L;

	private TlTyreBean tlTyreBean;

	private TlTyrePKEntity id;
	private List<TlTyreItemEntity> tlTyreItems;
	private List<TlNonTyreItemEntity> tlNonTyreItems;

	@Transient
	public TlTyreBean getTlTyreBean() {
		return tlTyreBean;
	}
	public void setTlTyreBean(TlTyreBean tlTyreBean) {
		this.tlTyreBean = tlTyreBean;
	}

	public TlTyreEntity() {	}

	@EmbeddedId
	public TlTyrePKEntity getId() {
		return this.id;
	}
	public void setId(TlTyrePKEntity id) {
		this.id = id;
	}
	@Column(name="centre_tread_depth", precision=3, scale=1, columnDefinition="NUMERIC(3,1)")
	public BigDecimal getCentreTreadDepth() {
		return this.tlTyreBean.getCentreTreadDepth();
	}
	public void setCentreTreadDepth(BigDecimal centreTreadDepth) {
		this.tlTyreBean.setCentreTreadDepth( centreTreadDepth );
	}
	@Column(name="inside_tread_depth", precision=3, scale=1, columnDefinition="NUMERIC(3,1)")
	public BigDecimal getInsideTreadDepth() {
		return this.tlTyreBean.getInsideTreadDepth();
	}
	public void setInsideTreadDepth(BigDecimal insideTreadDepth) {
		this.tlTyreBean.setInsideTreadDepth( insideTreadDepth );
	}
	@Column(name="outside_tread_depth", precision=3, scale=1, columnDefinition="NUMERIC(3,1)")
	public BigDecimal getOutsideTreadDepth() {
		return this.tlTyreBean.getOutsideTreadDepth();
	}
	public void setOutsideTreadDepth(BigDecimal outsideTreadDepth) {
		this.tlTyreBean.setOutsideTreadDepth( outsideTreadDepth );
	}
	@Column(name="position_description", length=40, columnDefinition="CHAR(40)")
	public String getPositionDescription() {
		return this.tlTyreBean.getPositionDescription();
	}
	public void setPositionDescription(String positionDescription) {
		this.tlTyreBean.setPositionDescription( positionDescription );
	}
	//bi-directional many-to-one association to TlTyreItem
	@OneToMany(mappedBy="tlTyre", cascade={CascadeType.ALL} )
	public List<TlTyreItemEntity> getTlTyreItems() {
		return this.tlTyreItems;
	}
	public void setTlTyreItems(List<TlTyreItemEntity> tlTyreItems) {
		this.tlTyreItems = tlTyreItems;
	}
	//bi-directional many-to-one association to TlNonTyreItem
	@OneToMany(mappedBy="tlTyre", cascade={CascadeType.ALL} )
	public List<TlNonTyreItemEntity> getTlNonTyreItems() {
		return this.tlNonTyreItems;
	}
	public void setTlNonTyreItems(List<TlNonTyreItemEntity> tlNonTyreItems) {
		this.tlNonTyreItems = tlNonTyreItems;
	}
}
