package uk.co.mo.app.mercury.domain.org.dealer.entity;

import uk.co.mo.app.mercury.domain.org.dealer.beans.DealerExtraBean;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

/**
 * <p/>
 * User: prabat
 * Date: 13-May-2011
 * Time: 12:14:45
 * <p/>
 * Change Log - Who : When : Comment
 */
@javax.persistence.Table(name = "maintenance_agent_extra", schema = "dbo", catalog = "Enterprise")
@Entity
public class MaintenanceAgentExtraEntity {

    private DealerExtraBean dealerExtraBean = new DealerExtraBean();

    @Transient
    public DealerExtraBean getDealerExtraBean() {
        return dealerExtraBean;
    }

    public void setDealerExtraBean(DealerExtraBean dealerExtraBean) {
        this.dealerExtraBean = dealerExtraBean;
    }

    @javax.persistence.Column(name = "agent_number", insertable = true, updatable = true, columnDefinition = "CHAR 5 NOT NULL")
    @Id
    public String getAgentNumber() {
        return dealerExtraBean.getAgentNumber();
    }

    public void setAgentNumber(String agentNumber) {
        this.dealerExtraBean.setAgentNumber(agentNumber);
    }

    @javax.persistence.Column(name = "agent_type", insertable = true, updatable = true, columnDefinition = "CHAR 1 NULL")
    @Basic
    public String getAgentType() {
        return dealerExtraBean.getAgentType();
    }

    public void setAgentType(String agentType) {
        this.dealerExtraBean.setAgentType(agentType);
    }

    @javax.persistence.Column(name = "agent_area_code", insertable = true, updatable = true, columnDefinition = "CHAR 2 NULL")
    @Basic
    public String getAgentAreaCode() {
        return dealerExtraBean.getAgentAreaCode();
    }

    public void setAgentAreaCode(String agentAreaCode) {
        this.dealerExtraBean.setAgentAreaCode(agentAreaCode);
    }

  /*  private byte[] timestamp;

    @javax.persistence.Column(name = "timestamp", nullable = true, insertable = true, updatable = true, length = 8, precision = 0)
    @Basic
    public byte[] getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(byte[] timestamp) {
        this.timestamp = timestamp;
    }*/

    @javax.persistence.Column(name = "closing_down", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    @Basic
    public Boolean isClosingDown() {
        return dealerExtraBean.isClosingDown();
    }

    public void setClosingDown(Boolean closingDown) {
        this.dealerExtraBean.setClosingDown(closingDown);
    }

    @javax.persistence.Column(name = "closing_down_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    public Date getClosingDownDate() {
        return dealerExtraBean.getClosingDownDate();
    }

    public void setClosingDownDate(Date closingDownDate) {
        this.dealerExtraBean.setClosingDownDate(closingDownDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaintenanceAgentExtraEntity that = (MaintenanceAgentExtraEntity) o;

        if (dealerExtraBean.isClosingDown() != that.dealerExtraBean.isClosingDown()) return false;
        if (dealerExtraBean.getAgentAreaCode() != null ? !dealerExtraBean.getAgentAreaCode().equals(that.dealerExtraBean.getAgentAreaCode()) : that.dealerExtraBean.getAgentAreaCode() != null)
            return false;
        if (dealerExtraBean.getAgentNumber() != null ? !dealerExtraBean.getAgentNumber().equals(that.dealerExtraBean.getAgentNumber()) : that.dealerExtraBean.getAgentNumber() != null) return false;
        if (dealerExtraBean.getAgentType() != null ? !dealerExtraBean.getAgentType().equals(that.dealerExtraBean.getAgentType()) : that.dealerExtraBean.getAgentType() != null) return false;
        if (dealerExtraBean.getClosingDownDate() != null ? !dealerExtraBean.getClosingDownDate().equals(that.dealerExtraBean.getClosingDownDate()) : that.dealerExtraBean.getClosingDownDate() != null)
            return false;
       // if (!Arrays.equals(timestamp, that.timestamp)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dealerExtraBean.getAgentNumber() != null ? dealerExtraBean.getAgentNumber().hashCode() : 0;
        result = 31 * result + (dealerExtraBean.getAgentType() != null ? dealerExtraBean.getAgentType().hashCode() : 0);
        result = 31 * result + (dealerExtraBean.getAgentAreaCode() != null ? dealerExtraBean.getAgentAreaCode().hashCode() : 0);
        //result = 31 * result + (timestamp != null ? Arrays.hashCode(timestamp) : 0);
        result = 31 * result + (dealerExtraBean.isClosingDown() ? 1 : 0);
        result = 31 * result + (dealerExtraBean.getClosingDownDate() != null ? dealerExtraBean.getClosingDownDate().hashCode() : 0);
        return result;
    }
}
