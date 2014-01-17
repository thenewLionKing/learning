package uk.co.mo.app.mercury.domain.translease.tyre.beans;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class TlTyreItemBean implements Serializable {

	private static final long serialVersionUID = 2942807312503894260L;

	private Integer transleaseTransactionNumber;
	private Short itemNumber;
	private String tyrePosition;
	private String actionCode;
	private BigDecimal itemCost;
//	private BigDecimal nettItemCost;
	private String positionDescription;
	private String reasonCode;
//	private BigDecimal vatRate;

	private TlFastFitProductBean tlFastFitProductBean;

//	@XmlElement(required=true)
	public Integer getTransleaseTransactionNumber() {
		return transleaseTransactionNumber;
	}
	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.transleaseTransactionNumber = transleaseTransactionNumber;
	}
//	@XmlElement(required=true)
	public Short getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(Short itemNumber) {
		this.itemNumber = itemNumber;
	}
//	@XmlElement(required=true)
	public String getTyrePosition() {
		return tyrePosition;
	}
	public void setTyrePosition(String tyrePosition) {
		this.tyrePosition = tyrePosition;
	}
	public TlFastFitProductBean getTlFastFitProductBean() {
		return tlFastFitProductBean;
	}
	public void setTlFastFitProductBean(TlFastFitProductBean tlFastFitProductBean) {
		this.tlFastFitProductBean = tlFastFitProductBean;
	}
//	@XmlElement(required=true)
	public String getActionCode() {
		return actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}
//	@XmlElement(required=true)
	public BigDecimal getItemCost() {
		return itemCost;
	}
	public void setItemCost(BigDecimal itemCost) {
		this.itemCost = itemCost;
	}
	public String getPositionDescription() {
		return positionDescription;
	}
	public void setPositionDescription(String positionDescription) {
		this.positionDescription = positionDescription;
	}
//	@XmlElement(required=true)
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
}
