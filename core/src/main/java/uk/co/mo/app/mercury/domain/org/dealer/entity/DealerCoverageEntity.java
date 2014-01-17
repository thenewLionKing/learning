package uk.co.mo.app.mercury.domain.org.dealer.entity;

import javax.persistence.*;

/**
 * <p/>
 * User: prabat
 * Date: 02-Jun-2011
 * Time: 17:14:03
 * <p/>
 * Change Log - Who : When : Comment
 */
@javax.persistence.Table(name = "dealer_coverage", schema = "dbo", catalog = "Enterprise")
@Entity
public class DealerCoverageEntity {
    private Integer id;

    @javax.persistence.Column(name = "id", nullable = false, insertable = false, updatable = false, length = 10, precision = 0)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String agentNumber;

    @javax.persistence.Column(name = "agent_number", nullable = false, insertable = true, updatable = true, columnDefinition = "CHAR 5 NOT NULL")
    @Basic
    public String getAgentNumber() {
        return agentNumber;
    }

    public void setAgentNumber(String agentNumber) {
        this.agentNumber = agentNumber;
    }

    private int dealerCoverageRegionId;

    @javax.persistence.Column(name = "dealer_coverage_region_id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public int getDealerCoverageRegionId() {
        return dealerCoverageRegionId;
    }

    public void setDealerCoverageRegionId(int dealerCoverageRegionId) {
        this.dealerCoverageRegionId = dealerCoverageRegionId;
    }

    private long version;

    @javax.persistence.Column(name = "version", nullable = false, insertable = true, updatable = true, length = 19, precision = 0)
    @Basic
    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DealerCoverageEntity that = (DealerCoverageEntity) o;

        if (dealerCoverageRegionId != that.dealerCoverageRegionId) return false;
        if (id != that.id) return false;
        if (version != that.version) return false;
        if (agentNumber != null ? !agentNumber.equals(that.agentNumber) : that.agentNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (agentNumber != null ? agentNumber.hashCode() : 0);
        result = 31 * result + dealerCoverageRegionId;
        result = 31 * result + (int) (version ^ (version >>> 32));
        return result;
    }
}
