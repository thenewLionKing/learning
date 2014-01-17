package uk.co.mo.app.mercury.domain.agreement.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class GrantItemBean implements Serializable {
	
	private static final long serialVersionUID = -234362374697526341L;

	private BigDecimal usedAmount;
	private BigDecimal grantAmount;
	private String grantItem;
	
	
	public BigDecimal getUsedAmount() {
		return usedAmount;
	}
	public void setUsedAmount(BigDecimal usedAmount) {
		this.usedAmount = usedAmount;
	}
	public BigDecimal getGrantAmount() {
		return grantAmount;
	}
	public void setGrantAmount(BigDecimal grantAmount) {
		this.grantAmount = grantAmount;
	}
	public String getGrantItem() {
		return grantItem;
	}
	public void setGrantItem(String grantItem) {
		this.grantItem = grantItem;
	}

}
