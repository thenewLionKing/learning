package uk.co.mo.app.mercury.domain.org.dealer.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * <p/>
 * User: prabat
 * Date: 02-Jun-2011
 * Time: 13:47:37
 * <p/>
 * Change Log - Who : When : Comment
 */

@javax.persistence.Table(name = "dealer_fcs_date", schema = "dbo", catalog = "Enterprise")
@Entity
public class DealerFcsDateEntity {

    @EmbeddedId
    private DealerFcsDateEntityPK id;


    public DealerFcsDateEntityPK getId() {
        return id;
    }

    public void setId(DealerFcsDateEntityPK id) {
        this.id = id;
    }

    public DealerFcsDateEntity() {
    }

    @javax.persistence.Column(name = "action_date", nullable = true, insertable = true, updatable = true, length = 23, precision = 3)
    @Basic
    private Date actionDate;

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DealerFcsDateEntity that = (DealerFcsDateEntity) o;

        return this.id.equals(that.id);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        return result;
    }
}
