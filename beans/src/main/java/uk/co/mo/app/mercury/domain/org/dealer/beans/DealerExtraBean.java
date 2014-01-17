package uk.co.mo.app.mercury.domain.org.dealer.beans;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class DealerExtraBean implements Serializable {

	private static final long serialVersionUID = 2359033835711706365L;

	private String agentNumber;
    private String agentType;
    private String agentAreaCode;
    private Boolean closingDown;
    private Date closingDownDate;

    public DealerExtraBean() {
    }

    public String getAgentNumber() {
        return agentNumber;
    }

    public void setAgentNumber(String agentNumber) {
        this.agentNumber = agentNumber;
    }

    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public String getAgentAreaCode() {
        return agentAreaCode;
    }

    public void setAgentAreaCode(String agentAreaCode) {
        this.agentAreaCode = agentAreaCode;
    }
    @XmlElement(required=true)
    public Boolean isClosingDown() {
        return closingDown;
    }

    public void setClosingDown(Boolean closingDown) {
        this.closingDown = closingDown;
    }

    public Date getClosingDownDate() {
        return closingDownDate;
    }

    public void setClosingDownDate(Date closingDownDate) {
        this.closingDownDate = closingDownDate;
    }


}