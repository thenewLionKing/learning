package uk.co.mo.app.mercury.domain.translease.tyre.beans;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class TlNonTyreItemBean implements Serializable {

	private static final long serialVersionUID = 5631990566611508258L;

	private int transleaseTransactionNumber;

	private short itemNumber;
	private String wheelOrAxlePosition;
	private String actionCode;
	private BigDecimal itemCost;
//	private BigDecimal nettItemCost;
	private String productDescription;
	private String reasonCode;
//	private BigDecimal vatRate;
	private String wheelPositionDescription;
	private TlFastFitProductBean tlFastFitProductBean;

//	@XmlElement(required=true)
	public int getTransleaseTransactionNumber() {
		return transleaseTransactionNumber;
	}
	public void setTransleaseTransactionNumber(int transleaseTransactionNumber) {
		this.transleaseTransactionNumber = transleaseTransactionNumber;
	}
//	@XmlElement(required=true)
	public short getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(short itemNumber) {
		this.itemNumber = itemNumber;
	}
//	@XmlElement(required=true)
	public String getWheelOrAxlePosition() {
		return wheelOrAxlePosition;
	}
	public void setWheelOrAxlePosition(String wheelOrAxlePosition) {
		this.wheelOrAxlePosition = wheelOrAxlePosition;
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
//	@XmlElement(required=true)
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
//	@XmlElement(required=true)
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getWheelPositionDescription() {
		return wheelPositionDescription;
	}
	public void setWheelPositionDescription(String wheelPositionDescription) {
		this.wheelPositionDescription = wheelPositionDescription;
	}
//	@XmlElement(required=true)
	public TlFastFitProductBean getTlFastFitProductBean() {
		return tlFastFitProductBean;
	}
	public void setTlFastFitProductBean(TlFastFitProductBean tlFastFitProductBean) {
		this.tlFastFitProductBean = tlFastFitProductBean;
	}
}
