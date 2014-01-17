package uk.co.mo.app.mercury.domain.translease.vcd.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.translease.vcd.beans.TlVcdConditionLineBean;

@Entity
@Table(name="tl_vcd_condition_line")
public class TlVcdConditionLineEntity implements Serializable {

	private static final long serialVersionUID = 8695437628990170765L;

	private TlVcdConditionLinePKEntity id;
	private TlVcdEntity tlVcd;

	private TlVcdConditionLineBean tlVcdConditionLineBean;

    @Transient
    public TlVcdConditionLineBean getTlVcdConditionLineBean() {
		return tlVcdConditionLineBean;
	}
	public void setTlVcdConditionLineBean(
			TlVcdConditionLineBean tlVcdConditionLineBean) {
		this.tlVcdConditionLineBean = tlVcdConditionLineBean;
	}

	public TlVcdConditionLineEntity() {	}

	@EmbeddedId
	public TlVcdConditionLinePKEntity getId() {
		return this.id;
	}
	public void setId(TlVcdConditionLinePKEntity id) {
		this.id = id;
	}
	@Column(name="attribute_value", nullable=false, length=6, columnDefinition="VARCHAR(6)")
	public String getAttributeValue() {
		return this.tlVcdConditionLineBean.getAttributeValue();
	}
	public void setAttributeValue(String attributeValue) {
		this.tlVcdConditionLineBean.setAttributeValue( attributeValue );
	}
	@Column(name="mobility_aid_damage_value", nullable=false, length=2, columnDefinition="CHAR(2)")
	public String getMobilityAidDamageValue() {
		return this.tlVcdConditionLineBean.getMobilityAidDamageValue();
	}
	public void setMobilityAidDamageValue(String mobilityAidDamageValue) {
		this.tlVcdConditionLineBean.setMobilityAidDamageValue( mobilityAidDamageValue );
	}
	//bi-directional many-to-one association to TlVcd
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="translease_transaction_number", nullable=false, insertable=false, updatable=false)
	public TlVcdEntity getTlVcd() {
		return this.tlVcd;
	}
	public void setTlVcd(TlVcdEntity tlVcd) {
		this.tlVcd = tlVcd;
	}
}
