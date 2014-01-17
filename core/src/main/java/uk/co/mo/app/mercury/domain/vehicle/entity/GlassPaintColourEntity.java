package uk.co.mo.app.mercury.domain.vehicle.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import uk.co.mo.app.mercury.domain.vehicle.beans.GlassPaintColourBean;


/**
 * The persistent class for the glass_pt_colour database table.
 * 
 */
@Entity
@Table(name="glass_pt_colour")
public class GlassPaintColourEntity implements Serializable {


	private static final long serialVersionUID = 3332755991669111986L;

	private GlassPaintColourBean glassPaintColourBean = new GlassPaintColourBean();

	public GlassPaintColourEntity() {
    }
	
	@Transient
	public GlassPaintColourBean getGlassPaintColourBean() {
		return glassPaintColourBean;
	}
	
	
	public void setGlassPaintColourBean(GlassPaintColourBean glassPaintColourBean) {
		this.glassPaintColourBean = glassPaintColourBean;
	}

	@Id
	@Column(name="pt_colour_code", columnDefinition="CHAR")
	public String getPtColourCode() {
		return this.glassPaintColourBean.getPtColourCode();
	}

	public void setPtColourCode(String ptColourCode) {
		this.glassPaintColourBean.setPtColourCode(ptColourCode);
	}

	@Column(name="pt_colour_desc", columnDefinition="CHAR")
	public String getPtColourDesc() {
		return this.glassPaintColourBean.getPtColourDesc();
	}

	public void setPtColourDesc(String ptColourDesc) {
		this.glassPaintColourBean.setPtColourDesc(ptColourDesc);
	}

}