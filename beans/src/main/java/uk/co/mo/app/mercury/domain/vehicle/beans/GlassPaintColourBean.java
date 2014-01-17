package uk.co.mo.app.mercury.domain.vehicle.beans;

import java.io.Serializable;

public class GlassPaintColourBean implements Serializable{
	
	private static final long serialVersionUID = 6611919492588045324L;

	private String ptColourCode;
	private String ptColourDesc;

	public GlassPaintColourBean() {
	}

	public String getPtColourCode() {
		return ptColourCode;
	}

	public void setPtColourCode(String ptColourCode) {
		this.ptColourCode = ptColourCode;
	}

	public String getPtColourDesc() {
		return ptColourDesc;
	}

	public void setPtColourDesc(String ptColourDesc) {
		this.ptColourDesc = ptColourDesc;
	}

	@Override
	public String toString() {
		return "GlassPaintColourBean [ptColourCode=" + ptColourCode
				+ ", ptColourDesc=" + ptColourDesc + "]";
	}
}