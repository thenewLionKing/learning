package uk.co.mo.app.mercury.domain.translease.tyre.beans;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class TlTyreBean implements Serializable {

	private static final long serialVersionUID = -3041828501123539438L;

	private Integer transleaseTransactionNumber;
	private String tyrePosition;
	private BigDecimal centreTreadDepth;
	private BigDecimal insideTreadDepth;
	private BigDecimal outsideTreadDepth;
	private String positionDescription;

//	@XmlElement(required=true)
	public Integer getTransleaseTransactionNumber() {
		return transleaseTransactionNumber;
	}
	public void setTransleaseTransactionNumber(Integer transleaseTransactionNumber) {
		this.transleaseTransactionNumber = transleaseTransactionNumber;
	}
//	@XmlElement(required=true)
	public String getTyrePosition() {
		return tyrePosition;
	}
	public void setTyrePosition(String tyrePosition) {
		this.tyrePosition = tyrePosition;
	}
	public BigDecimal getCentreTreadDepth() {
		return centreTreadDepth;
	}
	public void setCentreTreadDepth(BigDecimal centreTreadDepth) {
		this.centreTreadDepth = centreTreadDepth;
	}
	public BigDecimal getInsideTreadDepth() {
		return insideTreadDepth;
	}
	public void setInsideTreadDepth(BigDecimal insideTreadDepth) {
		this.insideTreadDepth = insideTreadDepth;
	}
	public BigDecimal getOutsideTreadDepth() {
		return outsideTreadDepth;
	}
	public void setOutsideTreadDepth(BigDecimal outsideTreadDepth) {
		this.outsideTreadDepth = outsideTreadDepth;
	}
	public String getPositionDescription() {
		return positionDescription;
	}
	public void setPositionDescription(String positionDescription) {
		this.positionDescription = positionDescription;
	}
}
