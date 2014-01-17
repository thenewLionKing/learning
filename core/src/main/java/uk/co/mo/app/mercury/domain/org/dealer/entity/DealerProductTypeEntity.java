package uk.co.mo.app.mercury.domain.org.dealer.entity;

import javax.persistence.*;

/**
 * <p/>
 * User: prabat
 * Date: 28/06/11
 * Time: 12:38
 * <p/>
 * Change Log - Who : When : Comment
 */
@javax.persistence.Table(name = "dealer_product_type", schema = "dbo", catalog = "Enterprise")
@Entity
public class DealerProductTypeEntity {
    private Integer id;

    @javax.persistence.Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    private Integer productTypeId;

    @javax.persistence.Column(name = "product_type_id")
    @Basic
    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    private boolean isCustomiser;

    @javax.persistence.Column(name = "is_customiser")
    @Basic
    public boolean isCustomiser() {
        return isCustomiser;
    }

    public void setCustomiser(boolean customiser) {
        isCustomiser = customiser;
    }

    private long version;

    @javax.persistence.Column(name = "version")
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

        DealerProductTypeEntity that = (DealerProductTypeEntity) o;

        if (isCustomiser != that.isCustomiser) return false;
        if (version != that.version) return false;
        if (agentNumber != null ? !agentNumber.equals(that.agentNumber) : that.agentNumber != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (productTypeId != null ? !productTypeId.equals(that.productTypeId) : that.productTypeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (agentNumber != null ? agentNumber.hashCode() : 0);
        result = 31 * result + (productTypeId != null ? productTypeId.hashCode() : 0);
        result = 31 * result + (isCustomiser ? 1 : 0);
        result = 31 * result + (int) (version ^ (version >>> 32));
        return result;
    }
}
