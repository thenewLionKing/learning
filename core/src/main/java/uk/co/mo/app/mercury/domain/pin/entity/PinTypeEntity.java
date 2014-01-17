package uk.co.mo.app.mercury.domain.pin.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the pin_type entitybase table.
 * 
 */
@Entity
@Table(name="pin_type")



public class PinTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pin_type_id", columnDefinition = "tinyint")
	private Short pinTypeId;

	@Column(name="pin_type_desc")
	private String pinTypeDesc;

	//bi-directional many-to-one association to PinEntity
	@OneToMany(mappedBy="pinType")
	private Set<PinEntity> pins;

    public PinTypeEntity() {
    }

	public Short getPinTypeId() {
		return this.pinTypeId;
	}

	public void setPinTypeId(Short pinTypeId) {
		this.pinTypeId = pinTypeId;
	}

	public String getPinTypeDesc() {
		return this.pinTypeDesc;
	}

	public void setPinTypeDesc(String pinTypeDesc) {
		this.pinTypeDesc = pinTypeDesc;
	}

	public Set<PinEntity> getPins() {
		return this.pins;
	}

	public void setPins(Set<PinEntity> pins) {
		this.pins = pins;
	}
	
}